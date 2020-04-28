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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Fields used to update an existing JobCode
 **/
@ApiModel(description = "Fields used to update an existing JobCode")
public class CSUpdateJobCodeRequest {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Code")
  private String code = null;
  @SerializedName("ProjectId")
  private Integer projectId = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("LinkedTaskIds")
  private List<Integer> linkedTaskIds = null;
  @SerializedName("LinkedOrgGroupIds")
  private List<Integer> linkedOrgGroupIds = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  /**
   * The Id of the JobCode to be updated
   **/
  @ApiModelProperty(value = "The Id of the JobCode to be updated")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The new JobCode to be set
   **/
  @ApiModelProperty(value = "The new JobCode to be set")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The Id of the Project to be associated to
   **/
  @ApiModelProperty(value = "The Id of the Project to be associated to")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  /**
   * The Id of the Client to be associated to
   **/
  @ApiModelProperty(value = "The Id of the Client to be associated to")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * A collection of Task Ids to be available when choosing this JobCode
   **/
  @ApiModelProperty(value = "A collection of Task Ids to be available when choosing this JobCode")
  public List<Integer> getLinkedTaskIds() {
    return linkedTaskIds;
  }
  public void setLinkedTaskIds(List<Integer> linkedTaskIds) {
    this.linkedTaskIds = linkedTaskIds;
  }

  /**
   * Restrict the access to this JobCode by specifying which Organisation Groups can have access.  Only employees in these Organisation Groups will be able to access this JobCode
   **/
  @ApiModelProperty(value = "Restrict the access to this JobCode by specifying which Organisation Groups can have access.  Only employees in these Organisation Groups will be able to access this JobCode")
  public List<Integer> getLinkedOrgGroupIds() {
    return linkedOrgGroupIds;
  }
  public void setLinkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
  }

  /**
   * Whether or not this JobCode is to be marked as deleted
   **/
  @ApiModelProperty(value = "Whether or not this JobCode is to be marked as deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateJobCodeRequest updateJobCodeRequest = (CSUpdateJobCodeRequest) o;
    return (this.id == null ? updateJobCodeRequest.id == null : this.id.equals(updateJobCodeRequest.id)) &&
        (this.code == null ? updateJobCodeRequest.code == null : this.code.equals(updateJobCodeRequest.code)) &&
        (this.projectId == null ? updateJobCodeRequest.projectId == null : this.projectId.equals(updateJobCodeRequest.projectId)) &&
        (this.clientId == null ? updateJobCodeRequest.clientId == null : this.clientId.equals(updateJobCodeRequest.clientId)) &&
        (this.linkedTaskIds == null ? updateJobCodeRequest.linkedTaskIds == null : this.linkedTaskIds.equals(updateJobCodeRequest.linkedTaskIds)) &&
        (this.linkedOrgGroupIds == null ? updateJobCodeRequest.linkedOrgGroupIds == null : this.linkedOrgGroupIds.equals(updateJobCodeRequest.linkedOrgGroupIds)) &&
        (this.isDeleted == null ? updateJobCodeRequest.isDeleted == null : this.isDeleted.equals(updateJobCodeRequest.isDeleted));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.projectId == null ? 0: this.projectId.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.linkedTaskIds == null ? 0: this.linkedTaskIds.hashCode());
    result = 31 * result + (this.linkedOrgGroupIds == null ? 0: this.linkedOrgGroupIds.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateJobCodeRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  projectId: ").append(projectId).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  linkedTaskIds: ").append(linkedTaskIds).append("\n");
    sb.append("  linkedOrgGroupIds: ").append(linkedOrgGroupIds).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
