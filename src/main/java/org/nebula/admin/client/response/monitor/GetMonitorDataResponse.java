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

package org.nebula.admin.client.response.monitor;

import org.nebula.admin.client.model.monitor.MonitorData;
import org.nebula.framework.client.Response;

import java.util.List;

public class GetMonitorDataResponse implements Response {

  private List<MonitorData> monitorData;

  private long pageNo;

  private long pageSize;

  private long total;

  public List<MonitorData> getMonitorData() {
    return monitorData;
  }

  public void setMonitorData(List<MonitorData> monitorData) {
    this.monitorData = monitorData;
  }

  public long getPageNo() {
    return pageNo;
  }

  public void setPageNo(long pageNo) {
    this.pageNo = pageNo;
  }

  public long getPageSize() {
    return pageSize;
  }

  public void setPageSize(long pageSize) {
    this.pageSize = pageSize;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }
}
