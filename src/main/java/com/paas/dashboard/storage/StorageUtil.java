/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.paas.dashboard.storage;


import com.paas.dashboard.util.FileUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class StorageUtil {

    public static final String USER_DIR = System.getProperty("user.home");

    public static final String APP_DIR = USER_DIR + File.separator + "paas-dashboard";

    public static final String STORAGE_DIR = APP_DIR + File.separator + "storage";

    public static final String STORAGE_PREFIX = STORAGE_DIR + File.separator;

    public static final String K8S_INSTANCE_PATH = STORAGE_PREFIX + "kubernetes-instance-v1.json";

    public static final String BOOKKEEPER_INSTANCE_PATH = STORAGE_PREFIX + "bookkeeper-instance-v1.json";
    public static final String CASSANDRA_INSTANCE_PATH = STORAGE_PREFIX + "cassandra-instance-v1.json";
    public static final String MINIO_INSTANCE_PATH = STORAGE_PREFIX + "minio-instance-v1.json";
    public static final String MYSQL_INSTANCE_PATH = STORAGE_PREFIX + "mysql-instance-v1.json";
    public static final String NGX_INSTANCE_PATH = STORAGE_PREFIX + "nginx-instance-v1.json";
    public static final String PULSAR_INSTANCE_PATH = STORAGE_PREFIX + "pulsar-instance-v1.json";
    public static final String REDIS_INSTANCE_PATH = STORAGE_PREFIX + "redis-instance-v1.json";
    public static final String ZK_INSTANCE_PATH = STORAGE_PREFIX + "zookeeper-instance-v1.json";

    public static final String LVS_INSTANCE_PATH = STORAGE_PREFIX + "lvs-instance-v1.json";

    static {
        File storageDir = new File(STORAGE_DIR);
        boolean result = storageDir.mkdirs();
        log.info("create storage dir result {}", result);

        FileUtil.ensureFileExists(K8S_INSTANCE_PATH);

        FileUtil.ensureFileExists(BOOKKEEPER_INSTANCE_PATH);
        FileUtil.ensureFileExists(CASSANDRA_INSTANCE_PATH);
        FileUtil.ensureFileExists(MINIO_INSTANCE_PATH);
        FileUtil.ensureFileExists(MYSQL_INSTANCE_PATH);
        FileUtil.ensureFileExists(NGX_INSTANCE_PATH);
        FileUtil.ensureFileExists(PULSAR_INSTANCE_PATH);
        FileUtil.ensureFileExists(REDIS_INSTANCE_PATH);
        FileUtil.ensureFileExists(ZK_INSTANCE_PATH);

        FileUtil.ensureFileExists(LVS_INSTANCE_PATH);
    }

}
