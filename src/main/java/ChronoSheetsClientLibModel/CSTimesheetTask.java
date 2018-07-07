/**
 * The ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSTimesheetTask {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("TaskName")
  private String taskName = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;
  @SerializedName("TripEnabled")
  private Boolean tripEnabled = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTripEnabled() {
    return tripEnabled;
  }
  public void setTripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimesheetTask timesheetTask = (CSTimesheetTask) o;
    return (this.id == null ? timesheetTask.id == null : this.id.equals(timesheetTask.id)) &&
        (this.taskName == null ? timesheetTask.taskName == null : this.taskName.equals(timesheetTask.taskName)) &&
        (this.organisationId == null ? timesheetTask.organisationId == null : this.organisationId.equals(timesheetTask.organisationId)) &&
        (this.isDeleted == null ? timesheetTask.isDeleted == null : this.isDeleted.equals(timesheetTask.isDeleted)) &&
        (this.tripEnabled == null ? timesheetTask.tripEnabled == null : this.tripEnabled.equals(timesheetTask.tripEnabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.taskName == null ? 0: this.taskName.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    result = 31 * result + (this.tripEnabled == null ? 0: this.tripEnabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimesheetTask {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("  tripEnabled: ").append(tripEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
