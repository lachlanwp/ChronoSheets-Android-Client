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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TaskSeriesReportItem {
  
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;
  @SerializedName("TaskId")
  private Integer taskId = null;
  @SerializedName("TaskName")
  private String taskName = null;
  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTaskId() {
    return taskId;
  }
  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
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
  public Integer getSpanSeconds() {
    return spanSeconds;
  }
  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSeriesReportItem taskSeriesReportItem = (TaskSeriesReportItem) o;
    return (this.startDate == null ? taskSeriesReportItem.startDate == null : this.startDate.equals(taskSeriesReportItem.startDate)) &&
        (this.endDate == null ? taskSeriesReportItem.endDate == null : this.endDate.equals(taskSeriesReportItem.endDate)) &&
        (this.taskId == null ? taskSeriesReportItem.taskId == null : this.taskId.equals(taskSeriesReportItem.taskId)) &&
        (this.taskName == null ? taskSeriesReportItem.taskName == null : this.taskName.equals(taskSeriesReportItem.taskName)) &&
        (this.spanSeconds == null ? taskSeriesReportItem.spanSeconds == null : this.spanSeconds.equals(taskSeriesReportItem.spanSeconds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.taskId == null ? 0: this.taskId.hashCode());
    result = 31 * result + (this.taskName == null ? 0: this.taskName.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSeriesReportItem {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  taskId: ").append(taskId).append("\n");
    sb.append("  taskName: ").append(taskName).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
