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
public class AggregateProject {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("ProjectName")
  private String projectName = null;
  @SerializedName("CostEstimation")
  private Double costEstimation = null;
  @SerializedName("StartDate")
  private Date startDate = null;
  @SerializedName("EndDate")
  private Date endDate = null;

  /**
   * The ID of the project
   **/
  @ApiModelProperty(value = "The ID of the project")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The ID of the client that this project is assigned to
   **/
  @ApiModelProperty(value = "The ID of the client that this project is assigned to")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * The ID of your organisation
   **/
  @ApiModelProperty(value = "The ID of your organisation")
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  /**
   * The name of the project (can be viewed in PROJECT TIMELINES)
   **/
  @ApiModelProperty(value = "The name of the project (can be viewed in PROJECT TIMELINES)")
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  /**
   * The estimated cost of the project (can be viewed in PROJECT TIMELINES)
   **/
  @ApiModelProperty(value = "The estimated cost of the project (can be viewed in PROJECT TIMELINES)")
  public Double getCostEstimation() {
    return costEstimation;
  }
  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  /**
   * The start date of the project (can be viewed in PROJECT TIMELINES)
   **/
  @ApiModelProperty(value = "The start date of the project (can be viewed in PROJECT TIMELINES)")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * The end date of the project (can be viewed in PROJECT TIMELINES)
   **/
  @ApiModelProperty(value = "The end date of the project (can be viewed in PROJECT TIMELINES)")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateProject aggregateProject = (AggregateProject) o;
    return (this.id == null ? aggregateProject.id == null : this.id.equals(aggregateProject.id)) &&
        (this.clientId == null ? aggregateProject.clientId == null : this.clientId.equals(aggregateProject.clientId)) &&
        (this.organisationId == null ? aggregateProject.organisationId == null : this.organisationId.equals(aggregateProject.organisationId)) &&
        (this.projectName == null ? aggregateProject.projectName == null : this.projectName.equals(aggregateProject.projectName)) &&
        (this.costEstimation == null ? aggregateProject.costEstimation == null : this.costEstimation.equals(aggregateProject.costEstimation)) &&
        (this.startDate == null ? aggregateProject.startDate == null : this.startDate.equals(aggregateProject.startDate)) &&
        (this.endDate == null ? aggregateProject.endDate == null : this.endDate.equals(aggregateProject.endDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.projectName == null ? 0: this.projectName.hashCode());
    result = 31 * result + (this.costEstimation == null ? 0: this.costEstimation.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateProject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  projectName: ").append(projectName).append("\n");
    sb.append("  costEstimation: ").append(costEstimation).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}