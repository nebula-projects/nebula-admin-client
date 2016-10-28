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

package org.nebula.admin.client.request.mgmt;

import org.nebula.framework.client.AbstractRequest;

public class GetInstancesRequest extends AbstractRequest {

  /**
   * Find the instances according to the instanceId.
   */
  private String instanceId;
  /**
   * Find the instances owned by the username. If it's not null, the pagination doesn't support,
   * that's, the pageNo&pageSize is ignored. And all the value except total in GetInstancesResponse
   * make no sense.
   */
  private String username;
  /**
   * If the registrationId is null, try to find all the instances.
   */
  private String registrationId;
  private SearchMode searchMode;
  private int pageNo;
  private int pageSize;

  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public SearchMode getSearchMode() {
    return searchMode;
  }

  public void setSearchMode(SearchMode searchMode) {
    this.searchMode = searchMode;
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

  public enum SearchMode {
    RUNNING, //Search the instances which are running/uncompleted.
    HISTORY //Search the instances which are completed.
  }
}
