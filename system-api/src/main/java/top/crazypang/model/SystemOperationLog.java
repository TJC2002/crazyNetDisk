package top.crazypang.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject :crazyNetdisk
 * @BelongsPackage :top.crazypang.model
 * @Author: crazyPang
 * @CreateTime: 2024-01-16  21:52
 * @Description: TODO
 */

@Data
public class SystemOperationLog {
    /**
     * 代理主键
    **/
    private String id;
    /**
     * 主键
     **/
    private String operationId;

    /** 操作模块 */
    private String title;

    /** 业务类型（0其它 1新增 2修改 3删除） */
    private Integer businessType;

    /** 业务类型数组 */
    private Integer[] businessTypes;

    /** 请求方法 */
    private String method;

    /** 请求方式 */
    private String requestMethod;

    /** 操作类别（0其它 1后台用户 2手机端用户） */
    private Integer operatorType;

    /** 操作人员 */
    private String operationName;

    /** 部门名称 */
    private String deptName;

    /** 请求url */
    private String operationUrl;

    /** 操作地址 */
    private String operationIp;

    /** 请求参数 */
    private String operationParam;

    /** 返回参数 */
    private String jsonResult;

    /** 操作状态（0正常 1异常） */
    private Integer status;

    /** 错误消息 */
    private String errorMsg;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operationTime;

    /** 消耗时间 */
    private Long costTime;

}
