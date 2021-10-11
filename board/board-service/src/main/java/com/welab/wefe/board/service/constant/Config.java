/**
 * Copyright 2021 Tianmian Tech. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.welab.wefe.board.service.constant;

import com.welab.wefe.common.data.storage.common.DBType;
import com.welab.wefe.common.enums.JobBackendType;
import com.welab.wefe.common.enums.env.EnvBranch;
import com.welab.wefe.common.enums.env.EnvName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * config.properties
 *
 * @author lonnie
 */
@Component
@PropertySource(value = {"file:${config.path}"}, encoding = "utf-8")
@ConfigurationProperties
public class Config {

    @Value("${wefe.union.base-url}")
    private String UNION_BASE_URL;


    @Value("${wefe.file.upload.dir}")
    private String fileUploadDir;


    @Value("${wefe.job.work_mode}")
    private Integer workMode;

    @Value("${wefe.job.backend}")
    private JobBackendType backend;

    @Value("${db.storage.type}")
    private DBType dbType;

    @Value("${env.name}")
    private EnvName envName;

    /**
     * The branch of the environment, different branches will have different functions.
     * <p>
     * online_demo: You can only delete data created by yourself（eg:flow、member、data_set）
     */
    @Value("${env.branch:master}")
    private EnvBranch envBranch;

    public String getUNION_BASE_URL() {
        return UNION_BASE_URL;
    }

    public void setUNION_BASE_URL(String UNION_BASE_URL) {
        this.UNION_BASE_URL = UNION_BASE_URL;
    }

    public String getFileUploadDir() {
        return fileUploadDir;
    }

    public void setFileUploadDir(String fileUploadDir) {
        this.fileUploadDir = fileUploadDir;
    }

    public Integer getWorkMode() {
        return workMode;
    }

    public void setWorkMode(Integer workMode) {
        this.workMode = workMode;
    }

    public JobBackendType getBackend() {
        return backend;
    }

    public void setBackend(JobBackendType backend) {
        this.backend = backend;
    }

    public DBType getDbType() {
        return dbType;
    }

    public void setDbType(DBType dbType) {
        this.dbType = dbType;
    }

    public EnvName getEnvName() {
        return envName;
    }

    public void setEnvName(EnvName envName) {
        this.envName = envName;
    }

    public EnvBranch getEnvBranch() {
        return envBranch;
    }

    public void setEnvBranch(EnvBranch envBranch) {
        this.envBranch = envBranch;
    }

    public boolean isOnlineDemo() {
        return envBranch == EnvBranch.online_demo;
    }

}
