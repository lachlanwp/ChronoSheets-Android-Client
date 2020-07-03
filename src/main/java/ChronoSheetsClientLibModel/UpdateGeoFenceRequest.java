/**
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.BasicCoordinate;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A request object for updating a new geofence
 **/
@ApiModel(description = "A request object for updating a new geofence")
public class UpdateGeoFenceRequest {
  
  @SerializedName("GeofenceId")
  private Integer geofenceId = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("FenceCoordinates")
  private List<BasicCoordinate> fenceCoordinates = null;
  @SerializedName("TriggerJobCodeId")
  private Integer triggerJobCodeId = null;
  @SerializedName("TriggerTaskId")
  private Integer triggerTaskId = null;
  @SerializedName("SendAlertToOrgGroupId")
  private Integer sendAlertToOrgGroupId = null;
  public enum AlertSettingsEnum {
     None,  SendWhenEntering,  SendWhenExiting,  SendWhenEnteringOrExiting, 
  };
  @SerializedName("AlertSettings")
  private AlertSettingsEnum alertSettings = null;
  public enum TriggerSettingsEnum {
     None,  StartTimesheetWhenEntering,  StopTimesheetWhenEntering,  StartOnEnterStopOnLeave, 
  };
  @SerializedName("TriggerSettings")
  private TriggerSettingsEnum triggerSettings = null;
  @SerializedName("StartTimeHour")
  private Integer startTimeHour = null;
  @SerializedName("StartTimeMinute")
  private Integer startTimeMinute = null;
  @SerializedName("EndTimeHour")
  private Integer endTimeHour = null;
  @SerializedName("EndTimeMinute")
  private Integer endTimeMinute = null;

  /**
   * The ID of the geofence you want to update
   **/
  @ApiModelProperty(value = "The ID of the geofence you want to update")
  public Integer getGeofenceId() {
    return geofenceId;
  }
  public void setGeofenceId(Integer geofenceId) {
    this.geofenceId = geofenceId;
  }

  /**
   * The name of the geo fence
   **/
  @ApiModelProperty(value = "The name of the geo fence")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of coordinates specifying the geofence region
   **/
  @ApiModelProperty(value = "A list of coordinates specifying the geofence region")
  public List<BasicCoordinate> getFenceCoordinates() {
    return fenceCoordinates;
  }
  public void setFenceCoordinates(List<BasicCoordinate> fenceCoordinates) {
    this.fenceCoordinates = fenceCoordinates;
  }

  /**
   * The job code to be used when the person enters/leaves the geofence
   **/
  @ApiModelProperty(value = "The job code to be used when the person enters/leaves the geofence")
  public Integer getTriggerJobCodeId() {
    return triggerJobCodeId;
  }
  public void setTriggerJobCodeId(Integer triggerJobCodeId) {
    this.triggerJobCodeId = triggerJobCodeId;
  }

  /**
   * The task to be used when the person enters/leaves the geofence
   **/
  @ApiModelProperty(value = "The task to be used when the person enters/leaves the geofence")
  public Integer getTriggerTaskId() {
    return triggerTaskId;
  }
  public void setTriggerTaskId(Integer triggerTaskId) {
    this.triggerTaskId = triggerTaskId;
  }

  /**
   * Send an alert to a user, specified by their user ID
   **/
  @ApiModelProperty(value = "Send an alert to a user, specified by their user ID")
  public Integer getSendAlertToOrgGroupId() {
    return sendAlertToOrgGroupId;
  }
  public void setSendAlertToOrgGroupId(Integer sendAlertToOrgGroupId) {
    this.sendAlertToOrgGroupId = sendAlertToOrgGroupId;
  }

  /**
   * Define when you want the alerts to be setn
   **/
  @ApiModelProperty(value = "Define when you want the alerts to be setn")
  public AlertSettingsEnum getAlertSettings() {
    return alertSettings;
  }
  public void setAlertSettings(AlertSettingsEnum alertSettings) {
    this.alertSettings = alertSettings;
  }

  /**
   * Define how to you want to trigger the timesheet automation
   **/
  @ApiModelProperty(value = "Define how to you want to trigger the timesheet automation")
  public TriggerSettingsEnum getTriggerSettings() {
    return triggerSettings;
  }
  public void setTriggerSettings(TriggerSettingsEnum triggerSettings) {
    this.triggerSettings = triggerSettings;
  }

  /**
   * The start hour in which this geofence should apply.  After this time, the geofence will be active.
   **/
  @ApiModelProperty(value = "The start hour in which this geofence should apply.  After this time, the geofence will be active.")
  public Integer getStartTimeHour() {
    return startTimeHour;
  }
  public void setStartTimeHour(Integer startTimeHour) {
    this.startTimeHour = startTimeHour;
  }

  /**
   * The start minute in which this geofence should apply.  After this time, the geofence will be active.
   **/
  @ApiModelProperty(value = "The start minute in which this geofence should apply.  After this time, the geofence will be active.")
  public Integer getStartTimeMinute() {
    return startTimeMinute;
  }
  public void setStartTimeMinute(Integer startTimeMinute) {
    this.startTimeMinute = startTimeMinute;
  }

  /**
   * The end hour in which this geofence will stop applying.  After this time, the geofence will be inactive.
   **/
  @ApiModelProperty(value = "The end hour in which this geofence will stop applying.  After this time, the geofence will be inactive.")
  public Integer getEndTimeHour() {
    return endTimeHour;
  }
  public void setEndTimeHour(Integer endTimeHour) {
    this.endTimeHour = endTimeHour;
  }

  /**
   * The end minute in which this geofence will stop applying.  After this time, the geofence will be inactive.
   **/
  @ApiModelProperty(value = "The end minute in which this geofence will stop applying.  After this time, the geofence will be inactive.")
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
    UpdateGeoFenceRequest updateGeoFenceRequest = (UpdateGeoFenceRequest) o;
    return (this.geofenceId == null ? updateGeoFenceRequest.geofenceId == null : this.geofenceId.equals(updateGeoFenceRequest.geofenceId)) &&
        (this.name == null ? updateGeoFenceRequest.name == null : this.name.equals(updateGeoFenceRequest.name)) &&
        (this.fenceCoordinates == null ? updateGeoFenceRequest.fenceCoordinates == null : this.fenceCoordinates.equals(updateGeoFenceRequest.fenceCoordinates)) &&
        (this.triggerJobCodeId == null ? updateGeoFenceRequest.triggerJobCodeId == null : this.triggerJobCodeId.equals(updateGeoFenceRequest.triggerJobCodeId)) &&
        (this.triggerTaskId == null ? updateGeoFenceRequest.triggerTaskId == null : this.triggerTaskId.equals(updateGeoFenceRequest.triggerTaskId)) &&
        (this.sendAlertToOrgGroupId == null ? updateGeoFenceRequest.sendAlertToOrgGroupId == null : this.sendAlertToOrgGroupId.equals(updateGeoFenceRequest.sendAlertToOrgGroupId)) &&
        (this.alertSettings == null ? updateGeoFenceRequest.alertSettings == null : this.alertSettings.equals(updateGeoFenceRequest.alertSettings)) &&
        (this.triggerSettings == null ? updateGeoFenceRequest.triggerSettings == null : this.triggerSettings.equals(updateGeoFenceRequest.triggerSettings)) &&
        (this.startTimeHour == null ? updateGeoFenceRequest.startTimeHour == null : this.startTimeHour.equals(updateGeoFenceRequest.startTimeHour)) &&
        (this.startTimeMinute == null ? updateGeoFenceRequest.startTimeMinute == null : this.startTimeMinute.equals(updateGeoFenceRequest.startTimeMinute)) &&
        (this.endTimeHour == null ? updateGeoFenceRequest.endTimeHour == null : this.endTimeHour.equals(updateGeoFenceRequest.endTimeHour)) &&
        (this.endTimeMinute == null ? updateGeoFenceRequest.endTimeMinute == null : this.endTimeMinute.equals(updateGeoFenceRequest.endTimeMinute));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.geofenceId == null ? 0: this.geofenceId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.fenceCoordinates == null ? 0: this.fenceCoordinates.hashCode());
    result = 31 * result + (this.triggerJobCodeId == null ? 0: this.triggerJobCodeId.hashCode());
    result = 31 * result + (this.triggerTaskId == null ? 0: this.triggerTaskId.hashCode());
    result = 31 * result + (this.sendAlertToOrgGroupId == null ? 0: this.sendAlertToOrgGroupId.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    result = 31 * result + (this.triggerSettings == null ? 0: this.triggerSettings.hashCode());
    result = 31 * result + (this.startTimeHour == null ? 0: this.startTimeHour.hashCode());
    result = 31 * result + (this.startTimeMinute == null ? 0: this.startTimeMinute.hashCode());
    result = 31 * result + (this.endTimeHour == null ? 0: this.endTimeHour.hashCode());
    result = 31 * result + (this.endTimeMinute == null ? 0: this.endTimeMinute.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGeoFenceRequest {\n");
    
    sb.append("  geofenceId: ").append(geofenceId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  fenceCoordinates: ").append(fenceCoordinates).append("\n");
    sb.append("  triggerJobCodeId: ").append(triggerJobCodeId).append("\n");
    sb.append("  triggerTaskId: ").append(triggerTaskId).append("\n");
    sb.append("  sendAlertToOrgGroupId: ").append(sendAlertToOrgGroupId).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("  triggerSettings: ").append(triggerSettings).append("\n");
    sb.append("  startTimeHour: ").append(startTimeHour).append("\n");
    sb.append("  startTimeMinute: ").append(startTimeMinute).append("\n");
    sb.append("  endTimeHour: ").append(endTimeHour).append("\n");
    sb.append("  endTimeMinute: ").append(endTimeMinute).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
