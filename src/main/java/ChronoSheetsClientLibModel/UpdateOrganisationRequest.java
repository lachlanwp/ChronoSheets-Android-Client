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
 * Field for updating your Organisation
 **/
@ApiModel(description = "Field for updating your Organisation")
public class UpdateOrganisationRequest {
  
  @SerializedName("OrgansationId")
  private Integer organsationId = null;
  @SerializedName("OrganisationName")
  private String organisationName = null;
  @SerializedName("AddressLine01")
  private String addressLine01 = null;
  @SerializedName("AddressLine02")
  private String addressLine02 = null;
  @SerializedName("OrganisationSuburb")
  private String organisationSuburb = null;
  @SerializedName("OrganisationState")
  private String organisationState = null;
  @SerializedName("OrganisationPostcode")
  private String organisationPostcode = null;
  @SerializedName("OrganisationCountry")
  private String organisationCountry = null;
  @SerializedName("OrganisationPhone")
  private String organisationPhone = null;
  @SerializedName("OrganisationEmailAddress")
  private String organisationEmailAddress = null;

  /**
   * The Id of your Organisation.  This is validated based on your current Auth Token
   **/
  @ApiModelProperty(value = "The Id of your Organisation.  This is validated based on your current Auth Token")
  public Integer getOrgansationId() {
    return organsationId;
  }
  public void setOrgansationId(Integer organsationId) {
    this.organsationId = organsationId;
  }

  /**
   * The updated organisation name
   **/
  @ApiModelProperty(value = "The updated organisation name")
  public String getOrganisationName() {
    return organisationName;
  }
  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  /**
   * The updated Address Line 1 value
   **/
  @ApiModelProperty(value = "The updated Address Line 1 value")
  public String getAddressLine01() {
    return addressLine01;
  }
  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }

  /**
   * The updated Address Line 2 value
   **/
  @ApiModelProperty(value = "The updated Address Line 2 value")
  public String getAddressLine02() {
    return addressLine02;
  }
  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }

  /**
   * The updated address suburb
   **/
  @ApiModelProperty(value = "The updated address suburb")
  public String getOrganisationSuburb() {
    return organisationSuburb;
  }
  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }

  /**
   * The updated address state
   **/
  @ApiModelProperty(value = "The updated address state")
  public String getOrganisationState() {
    return organisationState;
  }
  public void setOrganisationState(String organisationState) {
    this.organisationState = organisationState;
  }

  /**
   * The updated address postcode
   **/
  @ApiModelProperty(value = "The updated address postcode")
  public String getOrganisationPostcode() {
    return organisationPostcode;
  }
  public void setOrganisationPostcode(String organisationPostcode) {
    this.organisationPostcode = organisationPostcode;
  }

  /**
   * The updated address country
   **/
  @ApiModelProperty(value = "The updated address country")
  public String getOrganisationCountry() {
    return organisationCountry;
  }
  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }

  /**
   * The updated contact phone number
   **/
  @ApiModelProperty(value = "The updated contact phone number")
  public String getOrganisationPhone() {
    return organisationPhone;
  }
  public void setOrganisationPhone(String organisationPhone) {
    this.organisationPhone = organisationPhone;
  }

  /**
   * The update organisation email address
   **/
  @ApiModelProperty(value = "The update organisation email address")
  public String getOrganisationEmailAddress() {
    return organisationEmailAddress;
  }
  public void setOrganisationEmailAddress(String organisationEmailAddress) {
    this.organisationEmailAddress = organisationEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrganisationRequest updateOrganisationRequest = (UpdateOrganisationRequest) o;
    return (this.organsationId == null ? updateOrganisationRequest.organsationId == null : this.organsationId.equals(updateOrganisationRequest.organsationId)) &&
        (this.organisationName == null ? updateOrganisationRequest.organisationName == null : this.organisationName.equals(updateOrganisationRequest.organisationName)) &&
        (this.addressLine01 == null ? updateOrganisationRequest.addressLine01 == null : this.addressLine01.equals(updateOrganisationRequest.addressLine01)) &&
        (this.addressLine02 == null ? updateOrganisationRequest.addressLine02 == null : this.addressLine02.equals(updateOrganisationRequest.addressLine02)) &&
        (this.organisationSuburb == null ? updateOrganisationRequest.organisationSuburb == null : this.organisationSuburb.equals(updateOrganisationRequest.organisationSuburb)) &&
        (this.organisationState == null ? updateOrganisationRequest.organisationState == null : this.organisationState.equals(updateOrganisationRequest.organisationState)) &&
        (this.organisationPostcode == null ? updateOrganisationRequest.organisationPostcode == null : this.organisationPostcode.equals(updateOrganisationRequest.organisationPostcode)) &&
        (this.organisationCountry == null ? updateOrganisationRequest.organisationCountry == null : this.organisationCountry.equals(updateOrganisationRequest.organisationCountry)) &&
        (this.organisationPhone == null ? updateOrganisationRequest.organisationPhone == null : this.organisationPhone.equals(updateOrganisationRequest.organisationPhone)) &&
        (this.organisationEmailAddress == null ? updateOrganisationRequest.organisationEmailAddress == null : this.organisationEmailAddress.equals(updateOrganisationRequest.organisationEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.organsationId == null ? 0: this.organsationId.hashCode());
    result = 31 * result + (this.organisationName == null ? 0: this.organisationName.hashCode());
    result = 31 * result + (this.addressLine01 == null ? 0: this.addressLine01.hashCode());
    result = 31 * result + (this.addressLine02 == null ? 0: this.addressLine02.hashCode());
    result = 31 * result + (this.organisationSuburb == null ? 0: this.organisationSuburb.hashCode());
    result = 31 * result + (this.organisationState == null ? 0: this.organisationState.hashCode());
    result = 31 * result + (this.organisationPostcode == null ? 0: this.organisationPostcode.hashCode());
    result = 31 * result + (this.organisationCountry == null ? 0: this.organisationCountry.hashCode());
    result = 31 * result + (this.organisationPhone == null ? 0: this.organisationPhone.hashCode());
    result = 31 * result + (this.organisationEmailAddress == null ? 0: this.organisationEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrganisationRequest {\n");
    
    sb.append("  organsationId: ").append(organsationId).append("\n");
    sb.append("  organisationName: ").append(organisationName).append("\n");
    sb.append("  addressLine01: ").append(addressLine01).append("\n");
    sb.append("  addressLine02: ").append(addressLine02).append("\n");
    sb.append("  organisationSuburb: ").append(organisationSuburb).append("\n");
    sb.append("  organisationState: ").append(organisationState).append("\n");
    sb.append("  organisationPostcode: ").append(organisationPostcode).append("\n");
    sb.append("  organisationCountry: ").append(organisationCountry).append("\n");
    sb.append("  organisationPhone: ").append(organisationPhone).append("\n");
    sb.append("  organisationEmailAddress: ").append(organisationEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
