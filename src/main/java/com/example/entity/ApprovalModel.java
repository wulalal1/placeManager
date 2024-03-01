package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode
public class ApprovalModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<String> ids;

    private String status;

    private String placeCode;
}
