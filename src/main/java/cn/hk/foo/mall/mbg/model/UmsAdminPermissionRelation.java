package cn.hk.foo.mall.mbg.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UmsAdminPermissionRelation implements Serializable {
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;

    private static final long serialVersionUID = 1L;
}