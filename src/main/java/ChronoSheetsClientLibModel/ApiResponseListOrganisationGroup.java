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

import ChronoSheetsClientLibModel.OrganisationGroup;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A standard API response
 **/
@ApiModel(description = "A standard API response")
public class ApiResponseListOrganisationGroup {
  
  @SerializedName("Data")
  private List<OrganisationGroup> data = null;
  public enum StatusEnum {
     Succeeded,  FatalException,  GeneralError,  ValidationError,  UnAuthorized,  SessionExpired, 
  };
  @SerializedName("Status")
  private StatusEnum status = null;
  @SerializedName("Message")
  private String message = null;

  /**
   * The main Data of the response
   **/
  @ApiModelProperty(value = "The main Data of the response")
  public List<OrganisationGroup> getData() {
    return data;
  }
  public void setData(List<OrganisationGroup> data) {
    this.data = data;
  }

  /**
   * The API response status. Indicates if the request was successful, failed or was unauthorised.
   **/
  @ApiModelProperty(value = "The API response status. Indicates if the request was successful, failed or was unauthorised.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.
   **/
  @ApiModelProperty(value = "A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseListOrganisationGroup apiResponseListOrganisationGroup = (ApiResponseListOrganisationGroup) o;
    return (this.data == null ? apiResponseListOrganisationGroup.data == null : this.data.equals(apiResponseListOrganisationGroup.data)) &&
        (this.status == null ? apiResponseListOrganisationGroup.status == null : this.status.equals(apiResponseListOrganisationGroup.status)) &&
        (this.message == null ? apiResponseListOrganisationGroup.message == null : this.message.equals(apiResponseListOrganisationGroup.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseListOrganisationGroup {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
