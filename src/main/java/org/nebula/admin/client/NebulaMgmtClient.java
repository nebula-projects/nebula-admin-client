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

import org.nebula.admin.client.request.mgmt.DeleteTimersRequest;
import org.nebula.admin.client.request.mgmt.EnableRegistrationRequest;
import org.nebula.admin.client.request.mgmt.GetHeartbeatsRequest;
import org.nebula.admin.client.request.mgmt.GetHistoryEventsRequest;
import org.nebula.admin.client.request.mgmt.GetInstancesRequest;
import org.nebula.admin.client.request.mgmt.GetLengthOfQueuesRequest;
import org.nebula.admin.client.request.mgmt.GetRegistrationRequest;
import org.nebula.admin.client.request.mgmt.GetRegistrationsRequest;
import org.nebula.admin.client.request.mgmt.ResetTimersRequest;
import org.nebula.admin.client.response.mgmt.DeleteTimersResponse;
import org.nebula.admin.client.response.mgmt.EnableRegistrationResponse;
import org.nebula.admin.client.response.mgmt.GetHeartbeatsResponse;
import org.nebula.admin.client.response.mgmt.GetHistoryEventsResponse;
import org.nebula.admin.client.response.mgmt.GetInstancesResponse;
import org.nebula.admin.client.response.mgmt.GetLengthOfQueuesResponse;
import org.nebula.admin.client.response.mgmt.GetRegistrationResponse;
import org.nebula.admin.client.response.mgmt.GetRegistrationsResponse;
import org.nebula.admin.client.response.mgmt.ResetTimersResponse;
import org.nebula.framework.client.NebulaRestClient;
import org.nebula.framework.client.request.GetEventsRequest;
import org.nebula.framework.client.response.GetEventsResponse;

public class NebulaMgmtClient {

  private NebulaRestClient nebulaRestClient;
  private Object[][] requestMappings = {
      {GetRegistrationsRequest.class, GetRegistrationsResponse.class, "/admin/getRegistrations"},
      {GetRegistrationRequest.class, GetRegistrationResponse.class, "/admin/getRegistration"},
      {EnableRegistrationRequest.class, EnableRegistrationResponse.class,
       "/admin/enableRegistration"},

      {GetHeartbeatsRequest.class, GetHeartbeatsResponse.class, "/admin/getHeartbeats"},

      {GetEventsRequest.class, GetEventsResponse.class, "/admin/getEvents"},
      {GetHistoryEventsRequest.class, GetHistoryEventsResponse.class, "/admin/getHistoryEvents"},

      {GetInstancesRequest.class, GetInstancesResponse.class, "/admin/getInstances"},

      {GetLengthOfQueuesRequest.class, GetLengthOfQueuesResponse.class, "/admin/getLengthOfQueues"},

      {ResetTimersRequest.class, ResetTimersResponse.class, "/admin/resetTimers"},
      {DeleteTimersRequest.class, DeleteTimersResponse.class, "/admin/deleteTimers"},

  };

  public NebulaMgmtClient(String username, String secretKey, String host,
                          int port) {
    this(username, secretKey, host, port, "");
  }


  public NebulaMgmtClient(String username, String secretKey, String host,
                          int port, String contextPath) {
    nebulaRestClient = new NebulaRestClient(username, secretKey, host, port,
                                            contextPath);
    addRequestResponseUri();
  }

  public GetRegistrationsResponse getRegistrations(
      GetRegistrationsRequest request) throws Exception {
    return (GetRegistrationsResponse) nebulaRestClient.get(request);
  }

  public GetRegistrationResponse getRegistration(
      GetRegistrationRequest request) throws Exception {
    return (GetRegistrationResponse) nebulaRestClient.get(request);
  }

  public EnableRegistrationResponse enableRegistration(
      EnableRegistrationRequest request) throws Exception {
    return (EnableRegistrationResponse) nebulaRestClient.post(request);
  }

  public GetHeartbeatsResponse getHeartbeats(GetHeartbeatsRequest request)
      throws Exception {
    return (GetHeartbeatsResponse) nebulaRestClient.get(request);
  }

  public GetEventsResponse getEvents(GetEventsRequest request)
      throws Exception {
    return (GetEventsResponse) nebulaRestClient.get(request);
  }

  public GetHistoryEventsResponse getHistoryEvents(
      GetHistoryEventsRequest request) throws Exception {
    return (GetHistoryEventsResponse) nebulaRestClient.get(request);
  }

  public GetInstancesResponse getInstances(GetInstancesRequest request)
      throws Exception {
    return (GetInstancesResponse) nebulaRestClient.get(request);
  }

  public GetLengthOfQueuesResponse getLengthOfQueues(
      GetLengthOfQueuesRequest request) throws Exception {
    return (GetLengthOfQueuesResponse) nebulaRestClient.get(request);
  }

  public ResetTimersResponse resetTimers(ResetTimersRequest request)
      throws Exception {
    return (ResetTimersResponse) nebulaRestClient.get(request);
  }

  public DeleteTimersResponse deleteTimers(DeleteTimersRequest request)
      throws Exception {
    return (DeleteTimersResponse) nebulaRestClient.post(request);
  }

  private void addRequestResponseUri() {

    for (Object[] requestMapping : requestMappings) {
      nebulaRestClient.getRequestMapper().addRequestResponseUri(
          (Class) requestMapping[0], (Class) requestMapping[1], (String) requestMapping[2]);
    }
  }

}
