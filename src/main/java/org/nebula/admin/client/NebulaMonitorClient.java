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

package org.nebula.admin.client;

import org.nebula.admin.client.request.monitor.DeleteMonitorConfigRequest;
import org.nebula.admin.client.request.monitor.GetMonitorConfigRequest;
import org.nebula.admin.client.request.monitor.GetMonitorDataRequest;
import org.nebula.admin.client.request.monitor.GetStatisticsRequest;
import org.nebula.admin.client.request.monitor.GetStatisticsSumRequest;
import org.nebula.admin.client.request.monitor.SaveMonitorConfigRequest;
import org.nebula.admin.client.response.monitor.DeleteMonitorConfigResponse;
import org.nebula.admin.client.response.monitor.GetMonitorConfigResponse;
import org.nebula.admin.client.response.monitor.GetMonitorDataResponse;
import org.nebula.admin.client.response.monitor.GetStatisticsResponse;
import org.nebula.admin.client.response.monitor.GetStatisticsSumResponse;
import org.nebula.admin.client.response.monitor.SaveMonitorConfigResponse;
import org.nebula.framework.client.NebulaRestClient;

public class NebulaMonitorClient {

  private NebulaRestClient nebulaRestClient;
  private Object[][] requestMappings = {
      {SaveMonitorConfigRequest.class, SaveMonitorConfigResponse.class, "/monitor/config"},
      {GetMonitorConfigRequest.class, GetMonitorConfigResponse.class, "/monitor/config"},
      {DeleteMonitorConfigRequest.class, DeleteMonitorConfigResponse.class,
       "/monitor/config/delete"},

      {GetMonitorDataRequest.class, GetMonitorDataResponse.class,
       "/monitor/data"},

      {GetStatisticsRequest.class, GetStatisticsResponse.class,
       "/monitor/statistics"},
      {GetStatisticsSumRequest.class, GetStatisticsSumResponse.class,
       "/monitor/statisticssum"},

  };

  public NebulaMonitorClient(String username, String password, String host,
                             int port) {
    this(username, password, host, port, "");
  }

  public NebulaMonitorClient(String username, String password, String host,
                             int port, String contextPath) {
    nebulaRestClient = new NebulaRestClient(username, password, host, port,
                                            contextPath);
    addRequestResponseUri();
  }

  public SaveMonitorConfigResponse saveMonitorConfig(
      SaveMonitorConfigRequest request) throws Exception {
    return (SaveMonitorConfigResponse) nebulaRestClient.post(request);
  }

  public GetMonitorConfigResponse getMonitorConfigs(
      GetMonitorConfigRequest request) throws Exception {
    return (GetMonitorConfigResponse) nebulaRestClient.get(request);
  }

  public DeleteMonitorConfigResponse deleteMonitorConfig(
      DeleteMonitorConfigRequest request) throws Exception {
    return (DeleteMonitorConfigResponse) nebulaRestClient.post(request);
  }

  public GetMonitorDataResponse getMonitorData(
      GetMonitorDataRequest request) throws Exception {
    return (GetMonitorDataResponse) nebulaRestClient.get(request);
  }

  public GetStatisticsResponse getStatistics(
      GetStatisticsRequest request) throws Exception {
    return (GetStatisticsResponse) nebulaRestClient.get(request);
  }

  public GetStatisticsSumResponse getStatisticsSum(
      GetStatisticsSumRequest request) throws Exception {
    return (GetStatisticsSumResponse) nebulaRestClient.get(request);
  }

  private void addRequestResponseUri() {

    for (Object[] requestMapping : requestMappings) {
      nebulaRestClient.getRequestMapper().addRequestResponseUri(
          (Class) requestMapping[0], (Class) requestMapping[1], (String) requestMapping[2]);
    }
  }
}
