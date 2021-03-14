package com.netflix.appinfo;

/**
 * This provides a more granular healthcheck contract than the existing {@link HealthCheckCallback}
 * 健康检查处理器
 * @author Nitesh Kant
 */
public interface HealthCheckHandler {

    InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus currentStatus);

}
