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

public class GetDomainsRequest extends AbstractRequest {

  /**
   * All the domains will be queried if domainName is null.
   */
  private String domainName;

  /**
   * true if exact match, otherwise domainName% is matched The quantity doesn't too much, so it's
   * fine to use approximate matching
   */
  private boolean exactMatch;
  private int pageNo = 0;
  private int pageSize = 20;

  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public boolean isExactMatch() {
    return exactMatch;
  }

  public void setExactMatch(boolean exactMatch) {
    this.exactMatch = exactMatch;
  }

  public int getPageNo() {
    return pageNo;
  }

  public void setPageNo(int pageNo) {
    this.pageNo = pageNo;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
