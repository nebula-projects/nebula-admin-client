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

package org.nebula.admin.client.response.admin;

import org.nebula.admin.client.model.admin.NebulaServerSummary;
import org.nebula.framework.client.Response;

import java.util.List;

public class GetNebulaServersResponse implements Response {

  private List<NebulaServerSummary> nebulaServerSummaries;

  private int total;
  private int pageNo;
  private int pageSize;

  public List<NebulaServerSummary> getNebulaServerSummaries() {
    return nebulaServerSummaries;
  }

  public void setNebulaServerSummaries(List<NebulaServerSummary> nebulaServerSummaries) {
    this.nebulaServerSummaries = nebulaServerSummaries;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
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
