/**
 * ChronoSheets API
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

import ChronoSheetsClientLibModel.CSAggregateProject;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSAggregateClient {
  
  @SerializedName("ClientProjects")
  private List<CSAggregateProject> clientProjects = null;
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("ClientName")
  private String clientName = null;
  @SerializedName("ClientAddressLine1")
  private String clientAddressLine1 = null;
  @SerializedName("ClientAddressLine2")
  private String clientAddressLine2 = null;
  @SerializedName("ClientSuburb")
  private String clientSuburb = null;
  @SerializedName("ClientState")
  private String clientState = null;
  @SerializedName("ClientPostCode")
  private String clientPostCode = null;
  @SerializedName("PersonOfContact")
  private String personOfContact = null;
  @SerializedName("ClientPhoneNumber")
  private String clientPhoneNumber = null;
  @SerializedName("ClientMobileNumber")
  private String clientMobileNumber = null;
  @SerializedName("ClientEmailAddress")
  private String clientEmailAddress = null;
  @SerializedName("ClientWebURL")
  private String clientWebURL = null;
  @SerializedName("ProjectCount")
  private Integer projectCount = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSAggregateProject> getClientProjects() {
    return clientProjects;
  }
  public void setClientProjects(List<CSAggregateProject> clientProjects) {
    this.clientProjects = clientProjects;
  }

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
  public Integer getOrganisationId() {
    return organisationId;
  }
  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
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
  public String getClientAddressLine1() {
    return clientAddressLine1;
  }
  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientAddressLine2() {
    return clientAddressLine2;
  }
  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientSuburb() {
    return clientSuburb;
  }
  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientState() {
    return clientState;
  }
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientPostCode() {
    return clientPostCode;
  }
  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPersonOfContact() {
    return personOfContact;
  }
  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }
  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientMobileNumber() {
    return clientMobileNumber;
  }
  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientEmailAddress() {
    return clientEmailAddress;
  }
  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClientWebURL() {
    return clientWebURL;
  }
  public void setClientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getProjectCount() {
    return projectCount;
  }
  public void setProjectCount(Integer projectCount) {
    this.projectCount = projectCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSAggregateClient aggregateClient = (CSAggregateClient) o;
    return (this.clientProjects == null ? aggregateClient.clientProjects == null : this.clientProjects.equals(aggregateClient.clientProjects)) &&
        (this.id == null ? aggregateClient.id == null : this.id.equals(aggregateClient.id)) &&
        (this.organisationId == null ? aggregateClient.organisationId == null : this.organisationId.equals(aggregateClient.organisationId)) &&
        (this.clientName == null ? aggregateClient.clientName == null : this.clientName.equals(aggregateClient.clientName)) &&
        (this.clientAddressLine1 == null ? aggregateClient.clientAddressLine1 == null : this.clientAddressLine1.equals(aggregateClient.clientAddressLine1)) &&
        (this.clientAddressLine2 == null ? aggregateClient.clientAddressLine2 == null : this.clientAddressLine2.equals(aggregateClient.clientAddressLine2)) &&
        (this.clientSuburb == null ? aggregateClient.clientSuburb == null : this.clientSuburb.equals(aggregateClient.clientSuburb)) &&
        (this.clientState == null ? aggregateClient.clientState == null : this.clientState.equals(aggregateClient.clientState)) &&
        (this.clientPostCode == null ? aggregateClient.clientPostCode == null : this.clientPostCode.equals(aggregateClient.clientPostCode)) &&
        (this.personOfContact == null ? aggregateClient.personOfContact == null : this.personOfContact.equals(aggregateClient.personOfContact)) &&
        (this.clientPhoneNumber == null ? aggregateClient.clientPhoneNumber == null : this.clientPhoneNumber.equals(aggregateClient.clientPhoneNumber)) &&
        (this.clientMobileNumber == null ? aggregateClient.clientMobileNumber == null : this.clientMobileNumber.equals(aggregateClient.clientMobileNumber)) &&
        (this.clientEmailAddress == null ? aggregateClient.clientEmailAddress == null : this.clientEmailAddress.equals(aggregateClient.clientEmailAddress)) &&
        (this.clientWebURL == null ? aggregateClient.clientWebURL == null : this.clientWebURL.equals(aggregateClient.clientWebURL)) &&
        (this.projectCount == null ? aggregateClient.projectCount == null : this.projectCount.equals(aggregateClient.projectCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.clientProjects == null ? 0: this.clientProjects.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.clientName == null ? 0: this.clientName.hashCode());
    result = 31 * result + (this.clientAddressLine1 == null ? 0: this.clientAddressLine1.hashCode());
    result = 31 * result + (this.clientAddressLine2 == null ? 0: this.clientAddressLine2.hashCode());
    result = 31 * result + (this.clientSuburb == null ? 0: this.clientSuburb.hashCode());
    result = 31 * result + (this.clientState == null ? 0: this.clientState.hashCode());
    result = 31 * result + (this.clientPostCode == null ? 0: this.clientPostCode.hashCode());
    result = 31 * result + (this.personOfContact == null ? 0: this.personOfContact.hashCode());
    result = 31 * result + (this.clientPhoneNumber == null ? 0: this.clientPhoneNumber.hashCode());
    result = 31 * result + (this.clientMobileNumber == null ? 0: this.clientMobileNumber.hashCode());
    result = 31 * result + (this.clientEmailAddress == null ? 0: this.clientEmailAddress.hashCode());
    result = 31 * result + (this.clientWebURL == null ? 0: this.clientWebURL.hashCode());
    result = 31 * result + (this.projectCount == null ? 0: this.projectCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSAggregateClient {\n");
    
    sb.append("  clientProjects: ").append(clientProjects).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  clientAddressLine1: ").append(clientAddressLine1).append("\n");
    sb.append("  clientAddressLine2: ").append(clientAddressLine2).append("\n");
    sb.append("  clientSuburb: ").append(clientSuburb).append("\n");
    sb.append("  clientState: ").append(clientState).append("\n");
    sb.append("  clientPostCode: ").append(clientPostCode).append("\n");
    sb.append("  personOfContact: ").append(personOfContact).append("\n");
    sb.append("  clientPhoneNumber: ").append(clientPhoneNumber).append("\n");
    sb.append("  clientMobileNumber: ").append(clientMobileNumber).append("\n");
    sb.append("  clientEmailAddress: ").append(clientEmailAddress).append("\n");
    sb.append("  clientWebURL: ").append(clientWebURL).append("\n");
    sb.append("  projectCount: ").append(projectCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
