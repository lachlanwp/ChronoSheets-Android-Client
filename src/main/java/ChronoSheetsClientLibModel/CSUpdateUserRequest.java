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

/**
 * Fields for updating an employee User Account
 **/
@ApiModel(description = "Fields for updating an employee User Account")
public class CSUpdateUserRequest {
  
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("FirstName")
  private String firstName = null;
  @SerializedName("LastName")
  private String lastName = null;
  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;
  @SerializedName("IsAccountActive")
  private Boolean isAccountActive = null;
  @SerializedName("Roles")
  private Long roles = null;
  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  /**
   * The Id of the User that is to be updated
   **/
  @ApiModelProperty(value = "The Id of the User that is to be updated")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The Email Address of the employee
   **/
  @ApiModelProperty(value = "The Email Address of the employee")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * The First Name of the employee
   **/
  @ApiModelProperty(value = "The First Name of the employee")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The Last Name of the employee
   **/
  @ApiModelProperty(value = "The Last Name of the employee")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Whether or not the employee is subscribed to ChronoSheets newsletters
   **/
  @ApiModelProperty(value = "Whether or not the employee is subscribed to ChronoSheets newsletters")
  public Boolean getIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }
  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  /**
   * Whether or not the employee account is active
   **/
  @ApiModelProperty(value = "Whether or not the employee account is active")
  public Boolean getIsAccountActive() {
    return isAccountActive;
  }
  public void setIsAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
  }

  /**
   * A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details
   **/
  @ApiModelProperty(value = "A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details")
  public Long getRoles() {
    return roles;
  }
  public void setRoles(Long roles) {
    this.roles = roles;
  }

  /**
   * A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details
   **/
  @ApiModelProperty(value = "A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details")
  public Long getAlertSettings() {
    return alertSettings;
  }
  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateUserRequest updateUserRequest = (CSUpdateUserRequest) o;
    return (this.userId == null ? updateUserRequest.userId == null : this.userId.equals(updateUserRequest.userId)) &&
        (this.emailAddress == null ? updateUserRequest.emailAddress == null : this.emailAddress.equals(updateUserRequest.emailAddress)) &&
        (this.firstName == null ? updateUserRequest.firstName == null : this.firstName.equals(updateUserRequest.firstName)) &&
        (this.lastName == null ? updateUserRequest.lastName == null : this.lastName.equals(updateUserRequest.lastName)) &&
        (this.isSubscribedToNewsletter == null ? updateUserRequest.isSubscribedToNewsletter == null : this.isSubscribedToNewsletter.equals(updateUserRequest.isSubscribedToNewsletter)) &&
        (this.isAccountActive == null ? updateUserRequest.isAccountActive == null : this.isAccountActive.equals(updateUserRequest.isAccountActive)) &&
        (this.roles == null ? updateUserRequest.roles == null : this.roles.equals(updateUserRequest.roles)) &&
        (this.alertSettings == null ? updateUserRequest.alertSettings == null : this.alertSettings.equals(updateUserRequest.alertSettings));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.isSubscribedToNewsletter == null ? 0: this.isSubscribedToNewsletter.hashCode());
    result = 31 * result + (this.isAccountActive == null ? 0: this.isAccountActive.hashCode());
    result = 31 * result + (this.roles == null ? 0: this.roles.hashCode());
    result = 31 * result + (this.alertSettings == null ? 0: this.alertSettings.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateUserRequest {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  isSubscribedToNewsletter: ").append(isSubscribedToNewsletter).append("\n");
    sb.append("  isAccountActive: ").append(isAccountActive).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  alertSettings: ").append(alertSettings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
