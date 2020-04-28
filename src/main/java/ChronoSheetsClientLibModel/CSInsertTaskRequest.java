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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Fields for inserting a new Task
 **/
@ApiModel(description = "Fields for inserting a new Task")
public class CSInsertTaskRequest {
  
  @SerializedName("TaskName")
  private String taskName = null;
  @SerializedName("TripEnabled")
  private Boolean tripEnabled = null;

  /**
   * The name of the Task.  Used to identify the Task when the user is selecting from a list of available Tasks
   **/
  @ApiModelProperty(value = "The name of the Task.  Used to identify the Task when the user is selecting from a list of available Tasks")
  public String getTaskName() {
    return taskName;
  }
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  /**
   * Whether or not GPS Trip Tracking is enabled on this Task.  GPS Trip tracking is available on the iOS and Android apps.  If it's enabled an additional dialog is shown to the user after Task selection that allows the User to choose if they want to record the GPS data
   **/
  @ApiModelProperty(value = "Whether or not GPS Trip Tracking is enabled on this Task.  GPS Trip tracking is available on the iOS and Android apps.  If it's enabled an additional dialog is shown to the user after Task selection that allows the User to choose if they want to record the GPS data")
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
    CSInsertTaskRequest insertTaskRequest = (CSInsertTaskRequest) o;
    return (this.taskName == null ? insertTaskRequest.taskName == null : this.taskName.equals(insertTaskRequest.taskName)) &&
        (this.tripEnabled == null ? insertTaskRequest.tripEnabled == null : this.tripEnabled.equals(insertTaskRequest.tripEnabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.taskName == null ? 0: this.taskName.hashCode());
    result = 31 * result + (this.tripEnabled == null ? 0: this.tripEnabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertTaskRequest {\n");
    
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  tripEnabled: ").append(tripEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
