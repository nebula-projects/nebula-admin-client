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

package org.nebula.admin.client.model.monitor;

import java.util.Date;

public class StatisticSummary {

  public final static String USERS_MEASUREMENT = "ALL_USERS_COUNT";
  public final static String DOMAINS_MEASUREMENT = "ALL_DOMAINS_COUNT";
  public final static String WORKFLOWS_MEASUREMENT = "WORKFLOWS";
  public final static String ACTIVITIES_MEASUREMENT = "ACTIVITIES";
  public final static String RUNNING_INSTANCES_MEASUREMENT = "RUNNING_INSTANCES";
  public final static String COMPLETED_INSTANCES_MEASUREMENT = "COMPLETED_INSTANCES";

  private Long id;

  private String measurement;

  private Long value;

  private String domainName;

  private String username;

  private Date statisticDate;

  public StatisticSummary(){}

  public StatisticSummary(String measurement, Long value) {
    this.measurement = measurement;
    this.value = value;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Date getStatisticDate() {
    return statisticDate;
  }

  public void setStatisticDate(Date statisticDate) {
    this.statisticDate = statisticDate;
  }

}
