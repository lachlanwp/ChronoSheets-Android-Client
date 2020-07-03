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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Fields for inserting a new Client
 **/
@ApiModel(description = "Fields for inserting a new Client")
public class InsertClientRequest {
  
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

  /**
   * The name of the Client
   **/
  @ApiModelProperty(value = "The name of the Client")
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  /**
   * Address line 1 of the Client
   **/
  @ApiModelProperty(value = "Address line 1 of the Client")
  public String getClientAddressLine1() {
    return clientAddressLine1;
  }
  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }

  /**
   * Address line 2 of the Client
   **/
  @ApiModelProperty(value = "Address line 2 of the Client")
  public String getClientAddressLine2() {
    return clientAddressLine2;
  }
  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }

  /**
   * The suburb of the Client's address
   **/
  @ApiModelProperty(value = "The suburb of the Client's address")
  public String getClientSuburb() {
    return clientSuburb;
  }
  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }

  /**
   * The state of the Client's address
   **/
  @ApiModelProperty(value = "The state of the Client's address")
  public String getClientState() {
    return clientState;
  }
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  /**
   * The post code of the Client's address
   **/
  @ApiModelProperty(value = "The post code of the Client's address")
  public String getClientPostCode() {
    return clientPostCode;
  }
  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }

  /**
   * The name of the contact working with the Client
   **/
  @ApiModelProperty(value = "The name of the contact working with the Client")
  public String getPersonOfContact() {
    return personOfContact;
  }
  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }

  /**
   * The phone number of the Client
   **/
  @ApiModelProperty(value = "The phone number of the Client")
  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }
  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }

  /**
   * The mobile phone number of the Client
   **/
  @ApiModelProperty(value = "The mobile phone number of the Client")
  public String getClientMobileNumber() {
    return clientMobileNumber;
  }
  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }

  /**
   * The email address of the Client
   **/
  @ApiModelProperty(value = "The email address of the Client")
  public String getClientEmailAddress() {
    return clientEmailAddress;
  }
  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }

  /**
   * The Client's website URL
   **/
  @ApiModelProperty(value = "The Client's website URL")
  public String getClientWebURL() {
    return clientWebURL;
  }
  public void setClientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertClientRequest insertClientRequest = (InsertClientRequest) o;
    return (this.clientName == null ? insertClientRequest.clientName == null : this.clientName.equals(insertClientRequest.clientName)) &&
        (this.clientAddressLine1 == null ? insertClientRequest.clientAddressLine1 == null : this.clientAddressLine1.equals(insertClientRequest.clientAddressLine1)) &&
        (this.clientAddressLine2 == null ? insertClientRequest.clientAddressLine2 == null : this.clientAddressLine2.equals(insertClientRequest.clientAddressLine2)) &&
        (this.clientSuburb == null ? insertClientRequest.clientSuburb == null : this.clientSuburb.equals(insertClientRequest.clientSuburb)) &&
        (this.clientState == null ? insertClientRequest.clientState == null : this.clientState.equals(insertClientRequest.clientState)) &&
        (this.clientPostCode == null ? insertClientRequest.clientPostCode == null : this.clientPostCode.equals(insertClientRequest.clientPostCode)) &&
        (this.personOfContact == null ? insertClientRequest.personOfContact == null : this.personOfContact.equals(insertClientRequest.personOfContact)) &&
        (this.clientPhoneNumber == null ? insertClientRequest.clientPhoneNumber == null : this.clientPhoneNumber.equals(insertClientRequest.clientPhoneNumber)) &&
        (this.clientMobileNumber == null ? insertClientRequest.clientMobileNumber == null : this.clientMobileNumber.equals(insertClientRequest.clientMobileNumber)) &&
        (this.clientEmailAddress == null ? insertClientRequest.clientEmailAddress == null : this.clientEmailAddress.equals(insertClientRequest.clientEmailAddress)) &&
        (this.clientWebURL == null ? insertClientRequest.clientWebURL == null : this.clientWebURL.equals(insertClientRequest.clientWebURL));
  }

  @Override
  public int hashCode() {
    int result = 17;
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertClientRequest {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
