package com.example.service;

import cn.hutool.core.util.ObjectUtil;
import com.example.common.Constants;
import com.example.common.enums.ResultCodeEnum;
import com.example.common.enums.RoleEnum;
import com.example.entity.Account;
import com.example.entity.Admin;
import com.example.entity.User;
import com.example.exception.CustomException;
import com.example.utils.TokenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.example.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
   @Resource
    private  UserMapper userMapper;

    public  Account login(Account account) {
        Account dbUser = userMapper.selectByusername(account.getUsername());
        if (ObjectUtil.isNull(dbUser)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(dbUser.getPassword())) {
            throw new CustomException(ResultCodeEnum.USER_ACCOUNT_ERROR);
        }
        // 生成token
        String tokenData = dbUser.getId() + "-" + RoleEnum.USER.name();
        String token = TokenUtils.createToken(tokenData, dbUser.getPassword());
        dbUser.setToken(token);
        return dbUser;
    }

    public  List<User> selectAll(User user) {
        return userMapper.selectAll(user);
    }

    public PageInfo<User> selectPage(User user, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        userMapper.selectAll(user);
        List<User> list = userMapper.selectAll(user);
        return PageInfo.of(list);
    }

    public void add(User user){
       //业务方法
       //1,判断用户账号正确
      User dbUser =  userMapper.selectByusername(user.getUsername());
      if(dbUser != null){
          throw new CustomException(ResultCodeEnum.USER_EXIST_ERROR);
      }
       //2判断用户密码为空
       if(ObjectUtil.isEmpty(user.getPassword())){
           user.setPassword(Constants.USER_DEFAULT_PASSWORD);//123
       }
       //3判断用户名称为空
       if(ObjectUtil.isEmpty(user.getName())){
           user.getUsername(user.getUsername());
       }

       //4默认用户角色
       user.setRole(RoleEnum.USER.name());
       userMapper.insert(user);
   }

    public void deleteById(Integer id) {
       userMapper.deleteById(id);
    }

    public void deleteBatch(List<Integer> ids) {
       for(Integer id:ids){
           this.deleteById(id);
       }
    }

    public void updateById(User user) {
       userMapper.updateById(user);
    }

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    //注册
    public void register(Account account) {
        User user = new User();
        BeanUtils.copyProperties(account, user);
        this.add(user);
    }

    public void updatePassword(Account account) {
        User dbUser = userMapper.selectByusername(account.getUsername());
        if (ObjectUtil.isNull(dbUser)) {
            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
        }
        if (!account.getPassword().equals(dbUser.getPassword())) {
            throw new CustomException(ResultCodeEnum.PARAM_PASSWORD_ERROR);
        }
        dbUser.setPassword(account.getNewPassword());
        this.updateById(dbUser);
    }
}

