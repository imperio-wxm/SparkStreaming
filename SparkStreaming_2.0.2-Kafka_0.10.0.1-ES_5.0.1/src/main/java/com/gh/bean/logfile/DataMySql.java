package com.gh.bean.logfile;

import java.io.Serializable;

/**
 * Created by GH-GAN on 2016/11/24.
 */
public class DataMySql  implements Serializable {
    String container_uuid;
    String environment_id;
    String container_name;
    String namespace;
    String app_file;
    String timestamp;
    LogInfoMySql log_info;

    public String getContainer_name() {
        return container_name;
    }

    public void setContainer_name(String container_name) {
        this.container_name = container_name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getContainer_uuid() {
        return (null == container_uuid) ? "" : container_uuid;
    }

    public void setContainer_uuid(String container_uuid) {
        this.container_uuid = container_uuid;
    }

    public String getEnvironment_id() {
        return (null == environment_id) ? "" : environment_id;
    }

    public void setEnvironment_id(String environment_id) {
        this.environment_id = environment_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public LogInfoMySql getLog_info() {
        return log_info;
    }

    public void setLog_info(LogInfoMySql log_info) {
        this.log_info = log_info;
    }

    public String getApp_file() {
        return app_file;
    }

    public void setApp_file(String app_file) {
        this.app_file = app_file;
    }
}
