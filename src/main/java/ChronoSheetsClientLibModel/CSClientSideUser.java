/**
 * The ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  </p>  <p>      First Steps:       <ol>          <li>Make sure you've <a href='/HomeV2/App/sign-up'>signed up to ChronoSheets</a> to get yourself a user account</li>          <li>Confirm your account by following the link sent to your email address.  This will activate your account</li>          <li>Use your username and password to obtain an Auth Token by using the DoLogin method inside the UserProfile section below.  Use the Auth Token as an argument to the other methods</li>          <li>Try different methods in the API Playground to learn about the API</li>          <li>If you're stuck, try the full getting started guide on the <a href='/Home/ApiDocs'>API Toolkit</a> page.</li>      </ol>  </p>  <p>      Further Steps:       <ul>          <li>Create a mobile app (iOS, Android or Windows) using one of the ChronoSheets Mobile SDKs</li>          <li>Create a custom integration with your app using one of the ChronoSheets API Client Libraries.</li>      </ul>      Read more about the API Toolkit on the <a href='/Home/ApiDocs'>API Toolkit</a> page.  </p></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import ChronoSheetsClientLibModel.CSOrganisation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSClientSideUser {
  
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
  private CSOrganisation organisation = null;

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
  public CSOrganisation getOrganisation() {
    return organisation;
  }
  public void setOrganisation(CSOrganisation organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSClientSideUser clientSideUser = (CSClientSideUser) o;
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
        (this.organisation == null ? clientSideUser.organisation == null : this.organisation.equals(clientSideUser.organisation));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSClientSideUser {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
