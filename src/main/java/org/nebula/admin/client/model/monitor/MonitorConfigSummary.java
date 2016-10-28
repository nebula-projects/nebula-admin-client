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


public class MonitorConfigSummary {

  private String id;
  private String monitorId;
  private MonitorType monitorType;
  private int intervalMin;
  private TimeUnit timeUnit;
  private int duration;
  private int uncompletedNumber;
  private int consecutiveTimes;
  private Priority priority;
  private boolean emailAlarm;
  private boolean mobileAlarm;
  private String mobiles;
  private String emails;
  private boolean enabled;
  private Date createdDate;
  private Date updatedDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(String monitorId) {
    this.monitorId = monitorId;
  }

  public MonitorType getMonitorType() {
    return monitorType;
  }

  public void setMonitorType(MonitorType monitorType) {
    this.monitorType = monitorType;
  }

  public int getIntervalMin() {
    return intervalMin;
  }

  public void setIntervalMin(int intervalMin) {
    this.intervalMin = intervalMin;
  }

  public TimeUnit getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getUncompletedNumber() {
    return uncompletedNumber;
  }

  public void setUncompletedNumber(int uncompletedNumber) {
    this.uncompletedNumber = uncompletedNumber;
  }

  public int getConsecutiveTimes() {
    return consecutiveTimes;
  }

  public void setConsecutiveTimes(int consecutiveTimes) {
    this.consecutiveTimes = consecutiveTimes;
  }

  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public boolean isEmailAlarm() {
    return emailAlarm;
  }

  public void setEmailAlarm(boolean emailAlarm) {
    this.emailAlarm = emailAlarm;
  }

  public boolean isMobileAlarm() {
    return mobileAlarm;
  }

  public void setMobileAlarm(boolean mobileAlarm) {
    this.mobileAlarm = mobileAlarm;
  }

  public String getMobiles() {
    return mobiles;
  }

  public void setMobiles(String mobiles) {
    this.mobiles = mobiles;
  }

  public String getEmails() {
    return emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  public enum MonitorType {
    PROCESS, ACTIVITY, HEARTBEAT
  }

  public enum TimeUnit {
    SECOND, MINUTE, HOUR
  }

  public enum Priority {
    WARNING, SEVERITY
  }

}
