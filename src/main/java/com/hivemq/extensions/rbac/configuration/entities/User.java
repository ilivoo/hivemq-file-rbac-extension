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
import java.util.List;

@XmlType(propOrder = {})
@XmlAccessorType(XmlAccessType.NONE)
public class User {

    @XmlElement(name = "name", required = true)
    private @Nullable String name;

    @XmlElement(name = "password", required = true)
    private @Nullable String password;

    @XmlElementWrapper(name = "roles", required = true)
    @XmlElement(name = "id")
    private @Nullable List<String> roles;

    public User() {
    }

    public User(final @NotNull String name, final @NotNull String password, final @NotNull List<String> roles) {
        this.name = name;
        this.password = password;
        this.roles = roles;
    }

    public @Nullable String getName() {
        return name;
    }

    public void setName(@NotNull final String name) {
        this.name = name;
    }

    public @Nullable String getPassword() {
        return password;
    }

    public void setPassword(@NotNull final String password) {
        this.password = password;
    }

    public @Nullable List<String> getRoles() {
        return roles;
    }

    public void setRoles(@NotNull final List<String> roles) {
        this.roles = roles;
    }

    @Override
    public @NotNull String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
