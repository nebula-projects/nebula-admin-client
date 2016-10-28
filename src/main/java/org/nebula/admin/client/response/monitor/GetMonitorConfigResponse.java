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

import org.nebula.admin.client.model.monitor.MonitorConfigSummary;
import org.nebula.framework.client.Response;

import java.util.List;

public class GetMonitorConfigResponse implements Response {

  private List<MonitorConfigSummary> monitorConfigSummaries;

  private int total;

  public List<MonitorConfigSummary> getMonitorConfigSummaries() {
    return monitorConfigSummaries;
  }

  public void setMonitorConfigSummaries(
      List<MonitorConfigSummary> monitorConfigSummaries) {
    this.monitorConfigSummaries = monitorConfigSummaries;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
