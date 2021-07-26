package com.love.system.rolepermission.controller;

import com.love.system.rolepermission.entity.SysRolePermission;
import com.love.system.rolepermission.service.SysRolePermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色权限关联表(SysRolePermission)表控制层
 *
 * @author makejava
 * @since 2021-07-26 21:54:24
 */
@RestController
@RequestMapping("sysRolePermission")
public class SysRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private SysRolePermissionService sysRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRolePermission selectOne(Integer id) {
        return this.sysRolePermissionService.queryById(id);
    }

}
