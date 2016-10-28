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

import org.nebula.admin.client.request.admin.ChangePasswordRequest;
import org.nebula.admin.client.request.admin.ChangeSecretKeyRequest;
import org.nebula.admin.client.request.admin.DeleteDomainRequest;
import org.nebula.admin.client.request.admin.DeleteNebulaServerRequest;
import org.nebula.admin.client.request.admin.DeleteUserRequest;
import org.nebula.admin.client.request.admin.GetDomainNamesRequest;
import org.nebula.admin.client.request.admin.GetDomainsRequest;
import org.nebula.admin.client.request.admin.GetNebulaServersRequest;
import org.nebula.admin.client.request.admin.GetSecretKeyRequest;
import org.nebula.admin.client.request.admin.GetUserDomainsRequest;
import org.nebula.admin.client.request.admin.GetUsersRequest;
import org.nebula.admin.client.request.admin.NebulaServerHeartbeatRequest;
import org.nebula.admin.client.request.admin.SaveDomainRequest;
import org.nebula.admin.client.request.admin.SaveNebulaServerRequest;
import org.nebula.admin.client.request.admin.SaveUserRequest;
import org.nebula.admin.client.request.admin.UserDomainRequest;
import org.nebula.admin.client.request.admin.VerifyUserRequest;
import org.nebula.admin.client.response.admin.ChangePasswordResponse;
import org.nebula.admin.client.response.admin.ChangeSecretKeyResponse;
import org.nebula.admin.client.response.admin.DeleteDomainResponse;
import org.nebula.admin.client.response.admin.DeleteNebulaServerResponse;
import org.nebula.admin.client.response.admin.DeleteUserResponse;
import org.nebula.admin.client.response.admin.GetDomainNamesResponse;
import org.nebula.admin.client.response.admin.GetDomainsResponse;
import org.nebula.admin.client.response.admin.GetNebulaServersResponse;
import org.nebula.admin.client.response.admin.GetSecretKeyResponse;
import org.nebula.admin.client.response.admin.GetUserDomainsResponse;
import org.nebula.admin.client.response.admin.GetUsersResponse;
import org.nebula.admin.client.response.admin.NebulaServerHeartbeatResponse;
import org.nebula.admin.client.response.admin.SaveDomainResponse;
import org.nebula.admin.client.response.admin.SaveNebulaServerResponse;
import org.nebula.admin.client.response.admin.SaveUserResponse;
import org.nebula.admin.client.response.admin.UserDomainResponse;
import org.nebula.admin.client.response.admin.VerifyUserResponse;
import org.nebula.framework.client.NebulaRestClient;

public class NebulaAdminClient {

  private NebulaRestClient nebulaRestClient;

  private Object[][] requestMappings = {
      {GetDomainsRequest.class, GetDomainsResponse.class, "/nebula/admin/domains"},
      {GetDomainNamesRequest.class, GetDomainNamesResponse.class, "/nebula/admin/domainNames"},
      {DeleteDomainRequest.class, DeleteDomainResponse.class, "/nebula/admin/domain"},
      {SaveDomainRequest.class, SaveDomainResponse.class, "/nebula/admin/domain"},

      {GetUsersRequest.class, GetUsersResponse.class, "/nebula/admin/users"},
      {DeleteUserRequest.class, DeleteUserResponse.class, "/nebula/admin/user"},
      {SaveUserRequest.class, SaveUserResponse.class, "/nebula/admin/user"},
      {ChangePasswordRequest.class, ChangePasswordResponse.class, "/nebula/admin/user/changepwd"},
      {VerifyUserRequest.class, VerifyUserResponse.class, "/nebula/admin/user/verify"},
      {ChangeSecretKeyRequest.class, ChangeSecretKeyResponse.class, "/nebula/admin/user/secretKey"},
      {GetSecretKeyRequest.class, GetSecretKeyResponse.class, "/nebula/admin/user/secretKey"},

      {UserDomainRequest.class, UserDomainResponse.class, "/nebula/admin/userdomain"},
      {GetUserDomainsRequest.class, GetUserDomainsResponse.class, "/nebula/admin/userdomain"},

      {GetNebulaServersRequest.class, GetNebulaServersResponse.class,
       "/nebula/admin/nebulaServers"},
      {SaveNebulaServerRequest.class, SaveNebulaServerResponse.class, "/nebula/admin/nebulaServer"},
      {DeleteNebulaServerRequest.class, DeleteNebulaServerResponse.class,
       "/nebula/admin/nebulaServer"},
      {NebulaServerHeartbeatRequest.class, NebulaServerHeartbeatResponse.class,
       "/nebula/admin/nebulaServer/heartbeat"},

  };

  public NebulaAdminClient(String username, String password, String host,
                           int port) {
    this(username, password, host, port, "");
  }

  public NebulaAdminClient(String username, String password, String host,
                           int port, String contextPath) {
    nebulaRestClient = new NebulaRestClient(username, password, host, port,
                                            contextPath);
    addRequestResponseUri();
  }

  public GetDomainsResponse getDomains(
      GetDomainsRequest request) throws Exception {
    return (GetDomainsResponse) nebulaRestClient.get(request);
  }

  public GetDomainNamesResponse getDomainNames(
      GetDomainNamesRequest request) throws Exception {
    return (GetDomainNamesResponse) nebulaRestClient.get(request);
  }

  public DeleteDomainResponse deleteDomain(
      DeleteDomainRequest request) throws Exception {
    return (DeleteDomainResponse) nebulaRestClient.delete(request);
  }

  public SaveDomainResponse saveDomain(
      SaveDomainRequest request) throws Exception {
    return (SaveDomainResponse) nebulaRestClient.post(request);
  }

  public GetUsersResponse getUsers(
      GetUsersRequest request) throws Exception {
    return (GetUsersResponse) nebulaRestClient.get(request);
  }

  public DeleteUserResponse deleteUser(
      DeleteUserRequest request) throws Exception {
    return (DeleteUserResponse) nebulaRestClient.delete(request);
  }

  public SaveUserResponse saveUser(
      SaveUserRequest request) throws Exception {
    return (SaveUserResponse) nebulaRestClient.post(request);
  }

  public ChangePasswordResponse changePassword(
      ChangePasswordRequest request) throws Exception {
    return (ChangePasswordResponse) nebulaRestClient.post(request);
  }

  public VerifyUserResponse verifyUser(
      VerifyUserRequest request) throws Exception {
    return (VerifyUserResponse) nebulaRestClient.get(request);
  }

  public ChangeSecretKeyResponse changeSecretKey(
      ChangeSecretKeyRequest request) throws Exception {
    return (ChangeSecretKeyResponse) nebulaRestClient.post(request);
  }

  public GetSecretKeyResponse getSecretKey(
      GetSecretKeyRequest request) throws Exception {
    return (GetSecretKeyResponse) nebulaRestClient.get(request);
  }

  public UserDomainResponse addDomainForUser(
      UserDomainRequest request) throws Exception {
    return (UserDomainResponse) nebulaRestClient.post(request);
  }

  public UserDomainResponse removeDomainFromUser(
      UserDomainRequest request) throws Exception {
    return (UserDomainResponse) nebulaRestClient.delete(request);
  }

  public GetUserDomainsResponse getUserDomains(
      GetUserDomainsRequest request) throws Exception {
    return (GetUserDomainsResponse) nebulaRestClient.get(request);
  }


  public GetNebulaServersResponse getNebulaServers(
      GetNebulaServersRequest request) throws Exception {
    return (GetNebulaServersResponse) nebulaRestClient.get(request);
  }

  public SaveNebulaServerResponse saveNebulaServer(
      SaveNebulaServerRequest request) throws Exception {
    return (SaveNebulaServerResponse) nebulaRestClient.post(request);
  }

  public DeleteNebulaServerResponse deleteNebulaServer(
      DeleteNebulaServerRequest request) throws Exception {
    return (DeleteNebulaServerResponse) nebulaRestClient.delete(request);
  }

  public NebulaServerHeartbeatResponse heartbeatNebulaServer(
      NebulaServerHeartbeatRequest request) throws Exception {
    return (NebulaServerHeartbeatResponse) nebulaRestClient.post(request);
  }

  private void addRequestResponseUri() {

    for (Object[] requestMapping : requestMappings) {
      nebulaRestClient.getRequestMapper().addRequestResponseUri(
          (Class) requestMapping[0], (Class) requestMapping[1], (String) requestMapping[2]);
    }

  }
}
