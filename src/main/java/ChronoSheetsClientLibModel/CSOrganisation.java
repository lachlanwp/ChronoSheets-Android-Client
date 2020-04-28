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

import ChronoSheetsClientLibModel.CSOrganisationPricingPlan;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSOrganisation {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Name")
  private String name = null;
  @SerializedName("AddressLine01")
  private String addressLine01 = null;
  @SerializedName("AddressLine02")
  private String addressLine02 = null;
  @SerializedName("Suburb")
  private String suburb = null;
  @SerializedName("State")
  private String state = null;
  @SerializedName("Postcode")
  private String postcode = null;
  @SerializedName("Country")
  private String country = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("EmailAddress")
  private String emailAddress = null;
  @SerializedName("Timezone")
  private String timezone = null;
  @SerializedName("SubscriptionCustomerId")
  private String subscriptionCustomerId = null;
  @SerializedName("SignupToken")
  private String signupToken = null;
  @SerializedName("IsActive")
  private Boolean isActive = null;
  @SerializedName("StripeCouponCode")
  private String stripeCouponCode = null;
  public enum SubscriptionSourceEnum {
     None,  Stripe,  AppleInApp,  GoogleInApp, 
  };
  @SerializedName("SubscriptionSource")
  private SubscriptionSourceEnum subscriptionSource = null;
  public enum SignUpSourceEnum {
     Desktop,  MobileiOS,  MobileAndroid, 
  };
  @SerializedName("SignUpSource")
  private SignUpSourceEnum signUpSource = null;
  @SerializedName("MobileSignUpCode")
  private String mobileSignUpCode = null;
  @SerializedName("SubscriptionCycleStart")
  private Date subscriptionCycleStart = null;
  @SerializedName("SubscriptionCycleEnd")
  private Date subscriptionCycleEnd = null;
  @SerializedName("PricingPlans")
  private List<CSOrganisationPricingPlan> pricingPlans = null;

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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressLine01() {
    return addressLine01;
  }
  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddressLine02() {
    return addressLine02;
  }
  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSuburb() {
    return suburb;
  }
  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSubscriptionCustomerId() {
    return subscriptionCustomerId;
  }
  public void setSubscriptionCustomerId(String subscriptionCustomerId) {
    this.subscriptionCustomerId = subscriptionCustomerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSignupToken() {
    return signupToken;
  }
  public void setSignupToken(String signupToken) {
    this.signupToken = signupToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStripeCouponCode() {
    return stripeCouponCode;
  }
  public void setStripeCouponCode(String stripeCouponCode) {
    this.stripeCouponCode = stripeCouponCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SubscriptionSourceEnum getSubscriptionSource() {
    return subscriptionSource;
  }
  public void setSubscriptionSource(SubscriptionSourceEnum subscriptionSource) {
    this.subscriptionSource = subscriptionSource;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SignUpSourceEnum getSignUpSource() {
    return signUpSource;
  }
  public void setSignUpSource(SignUpSourceEnum signUpSource) {
    this.signUpSource = signUpSource;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobileSignUpCode() {
    return mobileSignUpCode;
  }
  public void setMobileSignUpCode(String mobileSignUpCode) {
    this.mobileSignUpCode = mobileSignUpCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getSubscriptionCycleStart() {
    return subscriptionCycleStart;
  }
  public void setSubscriptionCycleStart(Date subscriptionCycleStart) {
    this.subscriptionCycleStart = subscriptionCycleStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getSubscriptionCycleEnd() {
    return subscriptionCycleEnd;
  }
  public void setSubscriptionCycleEnd(Date subscriptionCycleEnd) {
    this.subscriptionCycleEnd = subscriptionCycleEnd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSOrganisationPricingPlan> getPricingPlans() {
    return pricingPlans;
  }
  public void setPricingPlans(List<CSOrganisationPricingPlan> pricingPlans) {
    this.pricingPlans = pricingPlans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSOrganisation organisation = (CSOrganisation) o;
    return (this.id == null ? organisation.id == null : this.id.equals(organisation.id)) &&
        (this.name == null ? organisation.name == null : this.name.equals(organisation.name)) &&
        (this.addressLine01 == null ? organisation.addressLine01 == null : this.addressLine01.equals(organisation.addressLine01)) &&
        (this.addressLine02 == null ? organisation.addressLine02 == null : this.addressLine02.equals(organisation.addressLine02)) &&
        (this.suburb == null ? organisation.suburb == null : this.suburb.equals(organisation.suburb)) &&
        (this.state == null ? organisation.state == null : this.state.equals(organisation.state)) &&
        (this.postcode == null ? organisation.postcode == null : this.postcode.equals(organisation.postcode)) &&
        (this.country == null ? organisation.country == null : this.country.equals(organisation.country)) &&
        (this.phone == null ? organisation.phone == null : this.phone.equals(organisation.phone)) &&
        (this.emailAddress == null ? organisation.emailAddress == null : this.emailAddress.equals(organisation.emailAddress)) &&
        (this.timezone == null ? organisation.timezone == null : this.timezone.equals(organisation.timezone)) &&
        (this.subscriptionCustomerId == null ? organisation.subscriptionCustomerId == null : this.subscriptionCustomerId.equals(organisation.subscriptionCustomerId)) &&
        (this.signupToken == null ? organisation.signupToken == null : this.signupToken.equals(organisation.signupToken)) &&
        (this.isActive == null ? organisation.isActive == null : this.isActive.equals(organisation.isActive)) &&
        (this.stripeCouponCode == null ? organisation.stripeCouponCode == null : this.stripeCouponCode.equals(organisation.stripeCouponCode)) &&
        (this.subscriptionSource == null ? organisation.subscriptionSource == null : this.subscriptionSource.equals(organisation.subscriptionSource)) &&
        (this.signUpSource == null ? organisation.signUpSource == null : this.signUpSource.equals(organisation.signUpSource)) &&
        (this.mobileSignUpCode == null ? organisation.mobileSignUpCode == null : this.mobileSignUpCode.equals(organisation.mobileSignUpCode)) &&
        (this.subscriptionCycleStart == null ? organisation.subscriptionCycleStart == null : this.subscriptionCycleStart.equals(organisation.subscriptionCycleStart)) &&
        (this.subscriptionCycleEnd == null ? organisation.subscriptionCycleEnd == null : this.subscriptionCycleEnd.equals(organisation.subscriptionCycleEnd)) &&
        (this.pricingPlans == null ? organisation.pricingPlans == null : this.pricingPlans.equals(organisation.pricingPlans));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.addressLine01 == null ? 0: this.addressLine01.hashCode());
    result = 31 * result + (this.addressLine02 == null ? 0: this.addressLine02.hashCode());
    result = 31 * result + (this.suburb == null ? 0: this.suburb.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.postcode == null ? 0: this.postcode.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.emailAddress == null ? 0: this.emailAddress.hashCode());
    result = 31 * result + (this.timezone == null ? 0: this.timezone.hashCode());
    result = 31 * result + (this.subscriptionCustomerId == null ? 0: this.subscriptionCustomerId.hashCode());
    result = 31 * result + (this.signupToken == null ? 0: this.signupToken.hashCode());
    result = 31 * result + (this.isActive == null ? 0: this.isActive.hashCode());
    result = 31 * result + (this.stripeCouponCode == null ? 0: this.stripeCouponCode.hashCode());
    result = 31 * result + (this.subscriptionSource == null ? 0: this.subscriptionSource.hashCode());
    result = 31 * result + (this.signUpSource == null ? 0: this.signUpSource.hashCode());
    result = 31 * result + (this.mobileSignUpCode == null ? 0: this.mobileSignUpCode.hashCode());
    result = 31 * result + (this.subscriptionCycleStart == null ? 0: this.subscriptionCycleStart.hashCode());
    result = 31 * result + (this.subscriptionCycleEnd == null ? 0: this.subscriptionCycleEnd.hashCode());
    result = 31 * result + (this.pricingPlans == null ? 0: this.pricingPlans.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSOrganisation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  addressLine01: ").append(addressLine01).append("\n");
    sb.append("  addressLine02: ").append(addressLine02).append("\n");
    sb.append("  suburb: ").append(suburb).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  postcode: ").append(postcode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  timezone: ").append(timezone).append("\n");
    sb.append("  subscriptionCustomerId: ").append(subscriptionCustomerId).append("\n");
    sb.append("  signupToken: ").append(signupToken).append("\n");
    sb.append("  isActive: ").append(isActive).append("\n");
    sb.append("  stripeCouponCode: ").append(stripeCouponCode).append("\n");
    sb.append("  subscriptionSource: ").append(subscriptionSource).append("\n");
    sb.append("  signUpSource: ").append(signUpSource).append("\n");
    sb.append("  mobileSignUpCode: ").append(mobileSignUpCode).append("\n");
    sb.append("  subscriptionCycleStart: ").append(subscriptionCycleStart).append("\n");
    sb.append("  subscriptionCycleEnd: ").append(subscriptionCycleEnd).append("\n");
    sb.append("  pricingPlans: ").append(pricingPlans).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
