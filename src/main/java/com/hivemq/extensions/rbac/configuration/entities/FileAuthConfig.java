/*
 * Copyright 2018 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hivemq.extensions.rbac.configuration.entities;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.annotations.Nullable;

import javax.xml.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "file-rbac")
@XmlType(propOrder = {})
@XmlAccessorType(XmlAccessType.NONE)
public class FileAuthConfig {

    @XmlElement(name = "default-role")
    private @Nullable String defaultRole;

    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    private @Nullable List<User> users;

    @XmlElementWrapper(name = "roles")
    @XmlElement(name = "role")
    private @Nullable List<Role> roles;

    public FileAuthConfig() {
    }

    public FileAuthConfig(
            final @Nullable String defaultRole,
            final @Nullable List<User> users,
            final @Nullable List<Role> roles) {

        this.defaultRole = defaultRole;
        this.users = users;
        this.roles = roles;
    }

    public @Nullable String getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(final @Nullable String defaultRole) {
        this.defaultRole = defaultRole;
    }

    public @NotNull List<User> getUsers() {
        if (users == null) {
            return Collections.emptyList();
        }
        return users;
    }

    public void setUsers(final @Nullable List<User> users) {
        this.users = users;
    }

    public @NotNull List<Role> getRoles() {
        if (roles == null) {
            return Collections.emptyList();
        }
        return roles;
    }

    public void setRoles(final @Nullable List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public @NotNull String toString() {
        return "Config{" +
                "users=" + users +
                ", roles=" + roles +
                '}';
    }
}
