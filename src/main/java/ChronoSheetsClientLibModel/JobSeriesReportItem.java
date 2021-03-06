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
public class JobSeriesReportItem {
  
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;
  @SerializedName("JobId")
  private Integer jobId = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("ClientName")
  private String clientName = null;
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;
  @SerializedName("JobCode")
  private String jobCode = null;

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
  public Integer getJobId() {
    return jobId;
  }
  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getJobCode() {
    return jobCode;
  }
  public void setJobCode(String jobCode) {
    this.jobCode = jobCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSeriesReportItem jobSeriesReportItem = (JobSeriesReportItem) o;
    return (this.startDate == null ? jobSeriesReportItem.startDate == null : this.startDate.equals(jobSeriesReportItem.startDate)) &&
        (this.endDate == null ? jobSeriesReportItem.endDate == null : this.endDate.equals(jobSeriesReportItem.endDate)) &&
        (this.jobId == null ? jobSeriesReportItem.jobId == null : this.jobId.equals(jobSeriesReportItem.jobId)) &&
        (this.clientId == null ? jobSeriesReportItem.clientId == null : this.clientId.equals(jobSeriesReportItem.clientId)) &&
        (this.clientName == null ? jobSeriesReportItem.clientName == null : this.clientName.equals(jobSeriesReportItem.clientName)) &&
        (this.projectId == null ? jobSeriesReportItem.projectId == null : this.projectId.equals(jobSeriesReportItem.projectId)) &&
        (this.projectName == null ? jobSeriesReportItem.projectName == null : this.projectName.equals(jobSeriesReportItem.projectName)) &&
        (this.spanSeconds == null ? jobSeriesReportItem.spanSeconds == null : this.spanSeconds.equals(jobSeriesReportItem.spanSeconds)) &&
        (this.jobCode == null ? jobSeriesReportItem.jobCode == null : this.jobCode.equals(jobSeriesReportItem.jobCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.jobId == null ? 0: this.jobId.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.clientName == null ? 0: this.clientName.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.spanSeconds == null ? 0: this.spanSeconds.hashCode());
    result = 31 * result + (this.jobCode == null ? 0: this.jobCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSeriesReportItem {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  jobId: ").append(jobId).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  spanSeconds: ").append(spanSeconds).append("\n");
    sb.append("  jobCode: ").append(jobCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
