package com.lw.dcsjob.template.datasource.persistence.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lw
 * @create 2024-09-25-21:34
 */
@Data
@TableName("job")
public class Job extends CreateUpdateDt {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 命名空间
     */
    private String namespaceId;

    /**
     * 组名称
     */
    private String groupName;

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 执行方法参数
     */
    private String argsStr;

    /**
     * 参数类型  text/json
     */
    private Integer argsType;

    /**
     * 扩展字段
     */
    private String extAttrs;

    /**
     * 下次触发时间
     */
    private Long nextTriggerAt;

    /**
     * 重试状态 0 关闭  1 开启
     */
    private Integer jobStatus;

    /**
     * 执行器路由策略
     */
    private Integer routeKey;

    /**
     * 执行器类型
     */
    private Integer executorType;

    /**
     * 执行器信息
     */
    private String executorInfo;

    /**
     * 触发类型  1 CRON表达式  2 固定时间
     */
    private Integer triggerType;

    /**
     * 间隔时长
     */
    private String triggerInterval;

    /**
     * 阻塞策略  1 丢弃  2覆盖  3 并行
     */
    private Integer blockStrategy;

    /**
     * 任务执行超时时间  单位秒
     */
    private Integer executorTimeout;

    /**
     * 最大重试次数
     */
    private Integer maxRetryTimes;

    /**
     * 重试间隔 单位秒
     */
    private Integer retryInterval;

    /**
     * 任务类型
     */
    private Integer taskType;

    /**
     * 并行数
     */
    private Integer parallelNum;

    private Integer bucketIndex;

    /**
     * 是否是常驻任务
     */
    private Integer resident;

    /**
     * 描述
     */
    private String description;

    /**
     * 逻辑删除 1删除
     */
    private Integer deleted;
}
