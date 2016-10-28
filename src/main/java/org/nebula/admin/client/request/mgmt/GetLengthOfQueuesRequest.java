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

public class GetLengthOfQueuesRequest extends AbstractRequest {

  private String queueName;
  private String version;
  private String activity;
  private QUEUE_TYPE queueType;

  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public QUEUE_TYPE getQueueType() {
    return queueType;
  }

  public void setQueueType(QUEUE_TYPE queueType) {
    this.queueType = queueType;
  }

  public static enum QUEUE_TYPE {WORKFLOW, ACTIVITY, WORKFLOW_COMPLETED}
}
