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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Fields for inserting a new Organisation Group
 **/
@ApiModel(description = "Fields for inserting a new Organisation Group")
public class InsertOrganisationGroupRequest {
  
  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;
  @SerializedName("OrganisationGroupUserIds")
  private List<Integer> organisationGroupUserIds = null;

  /**
   * The name of the new Organisation Group.  This is used when you're looking up Organisation Groups elsewhere through ChronoSheets
   **/
  @ApiModelProperty(value = "The name of the new Organisation Group.  This is used when you're looking up Organisation Groups elsewhere through ChronoSheets")
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }
  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }

  /**
   * The Ids of the Users that are going to be in this Organisation Group
   **/
  @ApiModelProperty(value = "The Ids of the Users that are going to be in this Organisation Group")
  public List<Integer> getOrganisationGroupUserIds() {
    return organisationGroupUserIds;
  }
  public void setOrganisationGroupUserIds(List<Integer> organisationGroupUserIds) {
    this.organisationGroupUserIds = organisationGroupUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertOrganisationGroupRequest insertOrganisationGroupRequest = (InsertOrganisationGroupRequest) o;
    return (this.organisationGroupName == null ? insertOrganisationGroupRequest.organisationGroupName == null : this.organisationGroupName.equals(insertOrganisationGroupRequest.organisationGroupName)) &&
        (this.organisationGroupUserIds == null ? insertOrganisationGroupRequest.organisationGroupUserIds == null : this.organisationGroupUserIds.equals(insertOrganisationGroupRequest.organisationGroupUserIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationGroupName == null ? 0: this.organisationGroupName.hashCode());
    result = 31 * result + (this.organisationGroupUserIds == null ? 0: this.organisationGroupUserIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertOrganisationGroupRequest {\n");
    
    sb.append("  organisationGroupName: ").append(organisationGroupName).append("\n");
    sb.append("  organisationGroupUserIds: ").append(organisationGroupUserIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
