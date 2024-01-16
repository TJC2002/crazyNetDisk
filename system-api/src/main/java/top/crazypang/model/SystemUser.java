package top.crazypang.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.List;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.model
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  21:16
 * @Description: TODO
 */

@Data
public class SystemUser {
    @Value("${crazy.netDisk.config.sysAdmin-userId}")
    private volatile String  adminID;
    /**
     * @description: 代理主键
    **/
    private Long id;

    /** 用户ID */
    private String userId;

    /** 用户账号 */
    private String userName;

    /** 用户昵称 */
    private String nickName;

    /** 用户邮箱 */
    private String email;

    /** 手机号码 */
    private String phoneNumber;

    /** 用户性别 */
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 帐号状态（0正常 1停用） */
    private Integer status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登录IP */
    private String loginIp;

    /** 最后登录时间 */
    private Date loginDate;

    /** 角色对象 */
    private List<SystemRole> roles;

    /** 角色组 */
    private Long[] roleIds;

    /** 岗位组 */
    private Long[] postIds;

    /** 角色ID */
    private Long roleId;

    public SystemUser(String userId)
    {
        this.userId = userId;
    }

    public boolean isAdmin() {
        return null != this.adminID && this.adminID.equals(adminID);
    }



}
