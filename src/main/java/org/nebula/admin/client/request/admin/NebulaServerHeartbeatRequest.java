/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nebula.admin.client.request.admin;

import org.nebula.framework.client.AbstractRequest;

public class NebulaServerHeartbeatRequest extends AbstractRequest {

  private String host;

  private int domainHashCode;

  private int userCredentialsHashCode;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public int getDomainHashCode() {
    return domainHashCode;
  }

  public void setDomainHashCode(int domainHashCode) {
    this.domainHashCode = domainHashCode;
  }

  public int getUserCredentialsHashCode() {
    return userCredentialsHashCode;
  }

  public void setUserCredentialsHashCode(int userCredentialsHashCode) {
    this.userCredentialsHashCode = userCredentialsHashCode;
  }
}
