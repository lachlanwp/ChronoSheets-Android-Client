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

@ApiModel(description = "")
public class CSSetOrganisationGroupUsersRequest {
  
  @SerializedName("OrganisationGroupId")
  private Integer organisationGroupId = null;
  @SerializedName("CsvUserIds")
  private String csvUserIds = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationGroupId() {
    return organisationGroupId;
  }
  public void setOrganisationGroupId(Integer organisationGroupId) {
    this.organisationGroupId = organisationGroupId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCsvUserIds() {
    return csvUserIds;
  }
  public void setCsvUserIds(String csvUserIds) {
    this.csvUserIds = csvUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSetOrganisationGroupUsersRequest setOrganisationGroupUsersRequest = (CSSetOrganisationGroupUsersRequest) o;
    return (this.organisationGroupId == null ? setOrganisationGroupUsersRequest.organisationGroupId == null : this.organisationGroupId.equals(setOrganisationGroupUsersRequest.organisationGroupId)) &&
        (this.csvUserIds == null ? setOrganisationGroupUsersRequest.csvUserIds == null : this.csvUserIds.equals(setOrganisationGroupUsersRequest.csvUserIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organisationGroupId == null ? 0: this.organisationGroupId.hashCode());
    result = 31 * result + (this.csvUserIds == null ? 0: this.csvUserIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSetOrganisationGroupUsersRequest {\n");
    
    sb.append("  organisationGroupId: ").append(organisationGroupId).append("\n");
    sb.append("  csvUserIds: ").append(csvUserIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
