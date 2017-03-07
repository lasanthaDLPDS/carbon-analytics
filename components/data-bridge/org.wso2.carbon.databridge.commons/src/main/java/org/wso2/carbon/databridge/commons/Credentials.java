/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.databridge.commons;

/**
 * Credentials using for login
 *
 * @since 5.0.0
 */

// TODO: 1/30/17 removing domain, tenant
public class Credentials {
    private final String username;
    private final String password;
    /*private final String domainName;
    private int tenantId;*/

    public Credentials(String username, String password/*, String domainName*/) {
        this.username = username;
        this.password = password;
//        this.domainName = domainName;
    }

    /*public Credentials(String username, String password, String domainName, int tenantId) {
        this.username = username;
        this.password = password;
        this.domainName = domainName;
        this.tenantId = tenantId;
    }*/

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /*public String getDomainName() {
        return domainName;
    }

    public int getTenantId() {
        return tenantId;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Credentials)) {
            return false;
        }

        Credentials that = (Credentials) o;

        if (!password.equals(that.password)) {
            return false;
        }
        if (!username.equals(that.username)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}