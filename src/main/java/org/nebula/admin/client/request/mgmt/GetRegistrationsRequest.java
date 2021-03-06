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
import org.nebula.framework.client.request.RegisterRequest.NodeType;

import java.util.Date;

public class GetRegistrationsRequest extends AbstractRequest {

  private String username;

  private String workflowName;

  private NodeType nodeType;

  private Date createdBefore;

  private Date createdAfter;

  private int pageNo;
  private int pageSize;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getWorkflowName() {
    return workflowName;
  }

  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }

  public NodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeType nodeType) {
    this.nodeType = nodeType;
  }

  public Date getCreatedBefore() {
    return createdBefore;
  }

  public void setCreatedBefore(Date createdBefore) {
    this.createdBefore = createdBefore;
  }

  public Date getCreatedAfter() {
    return createdAfter;
  }

  public void setCreatedAfter(Date createdAfter) {
    this.createdAfter = createdAfter;
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
