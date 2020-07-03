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

import ChronoSheetsClientLibModel.Organisation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ClientSideUser {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("UserName")
  private String userName = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("Roles")
  private Long roles = null;
  @SerializedName("AlertSettings")
  private Long alertSettings = null;
  @SerializedName("SetupWizardRequired")
  private Boolean setupWizardRequired = null;
  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;
  @SerializedName("Organisation")
  private Organisation organisation = null;
  @SerializedName("IsPrimaryAccount")
  private Boolean isPrimaryAccount = null;

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
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRoles() {
    return roles;
  }
  public void setRoles(Long roles) {
    this.roles = roles;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAlertSettings() {
    return alertSettings;
  }
  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSetupWizardRequired() {
    return setupWizardRequired;
  }
  public void setSetupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }
  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Organisation getOrganisation() {
    return organisation;
  }
  public void setOrganisation(Organisation organisation) {
    this.organisation = organisation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrimaryAccount() {
    return isPrimaryAccount;
  }
  public void setIsPrimaryAccount(Boolean isPrimaryAccount) {
    this.isPrimaryAccount = isPrimaryAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientSideUser clientSideUser = (ClientSideUser) o;
    return (this.id == null ? clientSideUser.id == null : this.id.equals(clientSideUser.id)) &&
        (this.organisationId == null ? clientSideUser.organisationId == null : this.organisationId.equals(clientSideUser.organisationId)) &&
        (this.userName == null ? clientSideUser.userName == null : this.userName.equals(clientSideUser.userName)) &&
        (this.firstName == null ? clientSideUser.firstName == null : this.firstName.equals(clientSideUser.firstName)) &&
        (this.lastName == null ? clientSideUser.lastName == null : this.lastName.equals(clientSideUser.lastName)) &&
        (this.emailAddress == null ? clientSideUser.emailAddress == null : this.emailAddress.equals(clientSideUser.emailAddress)) &&
        (this.roles == null ? clientSideUser.roles == null : this.roles.equals(clientSideUser.roles)) &&
        (this.alertSettings == null ? clientSideUser.alertSettings == null : this.alertSettings.equals(clientSideUser.alertSettings)) &&
        (this.setupWizardRequired == null ? clientSideUser.setupWizardRequired == null : this.setupWizardRequired.equals(clientSideUser.setupWizardRequired)) &&
        (this.isSubscribedToNewsletter == null ? clientSideUser.isSubscribedToNewsletter == null : this.isSubscribedToNewsletter.equals(clientSideUser.isSubscribedToNewsletter)) &&
        (this.organisation == null ? clientSideUser.organisation == null : this.organisation.equals(clientSideUser.organisation)) &&
        (this.isPrimaryAccount == null ? clientSideUser.isPrimaryAccount == null : this.isPrimaryAccount.equals(clientSideUser.isPrimaryAccount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.userName == null ? 0: this.userName.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    result = 31 * result + (this.setupWizardRequired == null ? 0: this.setupWizardRequired.hashCode());
    result = 31 * result + (this.isSubscribedToNewsletter == null ? 0: this.isSubscribedToNewsletter.hashCode());
    result = 31 * result + (this.organisation == null ? 0: this.organisation.hashCode());
    result = 31 * result + (this.isPrimaryAccount == null ? 0: this.isPrimaryAccount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientSideUser {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("  setupWizardRequired: ").append(setupWizardRequired).append("\n");
    sb.append("  isSubscribedToNewsletter: ").append(isSubscribedToNewsletter).append("\n");
    sb.append("  organisation: ").append(organisation).append("\n");
    sb.append("  isPrimaryAccount: ").append(isPrimaryAccount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}