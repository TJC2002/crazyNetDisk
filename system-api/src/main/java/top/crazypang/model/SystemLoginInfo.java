package top.crazypang.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.model
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  21:56
 * @Description: TODO
 */
@Data
public class SystemLoginInfo {
    private Long infoId;

    /** 用户账号 */
    private String userName;

    /** 状态 0成功 1失败 */
    private String status;

    /** 地址 */
    private String ipaddr;

    /** 描述 */
    private String msg;

    /** 访问时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accessTime;
}
