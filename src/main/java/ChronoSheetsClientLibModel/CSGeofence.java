/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CSBasicCoordinate;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSGeofence {
  
  @SerializedName("GeoFencingId")
  private Integer geoFencingId = null;
  @SerializedName("OrgId")
  private Integer orgId = null;
  @SerializedName("CreatedByUserId")
  private Integer createdByUserId = null;
  @SerializedName("LastUpdatedByUserId")
  private Integer lastUpdatedByUserId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("LocationName")
  private String locationName = null;
  @SerializedName("Coordinates")
  private List<CSBasicCoordinate> coordinates = null;
  @SerializedName("CreatedAt")
  private Date createdAt = null;
  @SerializedName("UpdatedAt")
  private Date updatedAt = null;
  @SerializedName("TriggerJobCodeId")
  private Integer triggerJobCodeId = null;
  @SerializedName("TriggerTaskId")
  private Integer triggerTaskId = null;
  public enum TriggerSettingsEnum {
     None,  StartTimesheetWhenEntering,  StopTimesheetWhenEntering,  StartOnEnterStopOnLeave, 
  };
  @SerializedName("TriggerSettings")
  private TriggerSettingsEnum triggerSettings = null;
  @SerializedName("AlertToOrgGroupId")
  private Integer alertToOrgGroupId = null;
  public enum AlertSettingsEnum {
     None,  SendWhenEntering,  SendWhenExiting,  SendWhenEnteringOrExiting, 
  };
  @SerializedName("AlertSettings")
  private AlertSettingsEnum alertSettings = null;
  @SerializedName("StartTimeHour")
  private Integer startTimeHour = null;
  @SerializedName("StartTimeMinute")
  private Integer startTimeMinute = null;
  @SerializedName("EndTimeHour")
  private Integer endTimeHour = null;
  @SerializedName("EndTimeMinute")
  private Integer endTimeMinute = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getGeoFencingId() {
    return geoFencingId;
  }
  public void setGeoFencingId(Integer geoFencingId) {
    this.geoFencingId = geoFencingId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrgId() {
    return orgId;
  }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCreatedByUserId() {
    return createdByUserId;
  }
  public void setCreatedByUserId(Integer createdByUserId) {
    this.createdByUserId = createdByUserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLastUpdatedByUserId() {
    return lastUpdatedByUserId;
  }
  public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
    this.lastUpdatedByUserId = lastUpdatedByUserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSBasicCoordinate> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(List<CSBasicCoordinate> coordinates) {
    this.coordinates = coordinates;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTriggerJobCodeId() {
    return triggerJobCodeId;
  }
  public void setTriggerJobCodeId(Integer triggerJobCodeId) {
    this.triggerJobCodeId = triggerJobCodeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTriggerTaskId() {
    return triggerTaskId;
  }
  public void setTriggerTaskId(Integer triggerTaskId) {
    this.triggerTaskId = triggerTaskId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TriggerSettingsEnum getTriggerSettings() {
    return triggerSettings;
  }
  public void setTriggerSettings(TriggerSettingsEnum triggerSettings) {
    this.triggerSettings = triggerSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAlertToOrgGroupId() {
    return alertToOrgGroupId;
  }
  public void setAlertToOrgGroupId(Integer alertToOrgGroupId) {
    this.alertToOrgGroupId = alertToOrgGroupId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AlertSettingsEnum getAlertSettings() {
    return alertSettings;
  }
  public void setAlertSettings(AlertSettingsEnum alertSettings) {
    this.alertSettings = alertSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartTimeHour() {
    return startTimeHour;
  }
  public void setStartTimeHour(Integer startTimeHour) {
    this.startTimeHour = startTimeHour;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartTimeMinute() {
    return startTimeMinute;
  }
  public void setStartTimeMinute(Integer startTimeMinute) {
    this.startTimeMinute = startTimeMinute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndTimeHour() {
    return endTimeHour;
  }
  public void setEndTimeHour(Integer endTimeHour) {
    this.endTimeHour = endTimeHour;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndTimeMinute() {
    return endTimeMinute;
  }
  public void setEndTimeMinute(Integer endTimeMinute) {
    this.endTimeMinute = endTimeMinute;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSGeofence geofence = (CSGeofence) o;
    return (this.geoFencingId == null ? geofence.geoFencingId == null : this.geoFencingId.equals(geofence.geoFencingId)) &&
        (this.orgId == null ? geofence.orgId == null : this.orgId.equals(geofence.orgId)) &&
        (this.createdByUserId == null ? geofence.createdByUserId == null : this.createdByUserId.equals(geofence.createdByUserId)) &&
        (this.lastUpdatedByUserId == null ? geofence.lastUpdatedByUserId == null : this.lastUpdatedByUserId.equals(geofence.lastUpdatedByUserId)) &&
        (this.name == null ? geofence.name == null : this.name.equals(geofence.name)) &&
        (this.locationName == null ? geofence.locationName == null : this.locationName.equals(geofence.locationName)) &&
        (this.coordinates == null ? geofence.coordinates == null : this.coordinates.equals(geofence.coordinates)) &&
        (this.createdAt == null ? geofence.createdAt == null : this.createdAt.equals(geofence.createdAt)) &&
        (this.updatedAt == null ? geofence.updatedAt == null : this.updatedAt.equals(geofence.updatedAt)) &&
        (this.triggerJobCodeId == null ? geofence.triggerJobCodeId == null : this.triggerJobCodeId.equals(geofence.triggerJobCodeId)) &&
        (this.triggerTaskId == null ? geofence.triggerTaskId == null : this.triggerTaskId.equals(geofence.triggerTaskId)) &&
        (this.triggerSettings == null ? geofence.triggerSettings == null : this.triggerSettings.equals(geofence.triggerSettings)) &&
        (this.alertToOrgGroupId == null ? geofence.alertToOrgGroupId == null : this.alertToOrgGroupId.equals(geofence.alertToOrgGroupId)) &&
        (this.alertSettings == null ? geofence.alertSettings == null : this.alertSettings.equals(geofence.alertSettings)) &&
        (this.startTimeHour == null ? geofence.startTimeHour == null : this.startTimeHour.equals(geofence.startTimeHour)) &&
        (this.startTimeMinute == null ? geofence.startTimeMinute == null : this.startTimeMinute.equals(geofence.startTimeMinute)) &&
        (this.endTimeHour == null ? geofence.endTimeHour == null : this.endTimeHour.equals(geofence.endTimeHour)) &&
        (this.endTimeMinute == null ? geofence.endTimeMinute == null : this.endTimeMinute.equals(geofence.endTimeMinute));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.geoFencingId == null ? 0: this.geoFencingId.hashCode());
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.createdByUserId == null ? 0: this.createdByUserId.hashCode());
    result = 31 * result + (this.lastUpdatedByUserId == null ? 0: this.lastUpdatedByUserId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.locationName == null ? 0: this.locationName.hashCode());
    result = 31 * result + (this.coordinates == null ? 0: this.coordinates.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.triggerJobCodeId == null ? 0: this.triggerJobCodeId.hashCode());
    result = 31 * result + (this.triggerTaskId == null ? 0: this.triggerTaskId.hashCode());
    result = 31 * result + (this.triggerSettings == null ? 0: this.triggerSettings.hashCode());
    result = 31 * result + (this.alertToOrgGroupId == null ? 0: this.alertToOrgGroupId.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    result = 31 * result + (this.startTimeHour == null ? 0: this.startTimeHour.hashCode());
    result = 31 * result + (this.startTimeMinute == null ? 0: this.startTimeMinute.hashCode());
    result = 31 * result + (this.endTimeHour == null ? 0: this.endTimeHour.hashCode());
    result = 31 * result + (this.endTimeMinute == null ? 0: this.endTimeMinute.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSGeofence {\n");
    
    sb.append("  geoFencingId: ").append(geoFencingId).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  createdByUserId: ").append(createdByUserId).append("\n");
    sb.append("  lastUpdatedByUserId: ").append(lastUpdatedByUserId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  locationName: ").append(locationName).append("\n");
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  triggerJobCodeId: ").append(triggerJobCodeId).append("\n");
    sb.append("  triggerTaskId: ").append(triggerTaskId).append("\n");
    sb.append("  triggerSettings: ").append(triggerSettings).append("\n");
    sb.append("  alertToOrgGroupId: ").append(alertToOrgGroupId).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("  startTimeHour: ").append(startTimeHour).append("\n");
    sb.append("  startTimeMinute: ").append(startTimeMinute).append("\n");
    sb.append("  endTimeHour: ").append(endTimeHour).append("\n");
    sb.append("  endTimeMinute: ").append(endTimeMinute).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
