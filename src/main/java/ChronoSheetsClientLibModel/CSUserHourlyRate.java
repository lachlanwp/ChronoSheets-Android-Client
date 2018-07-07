/**
 * The ChronoSheets API
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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSUserHourlyRate {
  
  @SerializedName("RateId")
  private Integer rateId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("OrganisationId")
  private Integer organisationId = null;
  @SerializedName("IsCurrent")
  private Boolean isCurrent = null;
  @SerializedName("HourlyRate")
  private Double hourlyRate = null;
  @SerializedName("HourlyOvertimeRate")
  private Double hourlyOvertimeRate = null;
  @SerializedName("StartDateTime")
  private Date startDateTime = null;
  @SerializedName("EndDateTime")
  private Date endDateTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRateId() {
    return rateId;
  }
  public void setRateId(Integer rateId) {
    this.rateId = rateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
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
  public Boolean getIsCurrent() {
    return isCurrent;
  }
  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHourlyRate() {
    return hourlyRate;
  }
  public void setHourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHourlyOvertimeRate() {
    return hourlyOvertimeRate;
  }
  public void setHourlyOvertimeRate(Double hourlyOvertimeRate) {
    this.hourlyOvertimeRate = hourlyOvertimeRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUserHourlyRate userHourlyRate = (CSUserHourlyRate) o;
    return (this.rateId == null ? userHourlyRate.rateId == null : this.rateId.equals(userHourlyRate.rateId)) &&
        (this.userId == null ? userHourlyRate.userId == null : this.userId.equals(userHourlyRate.userId)) &&
        (this.organisationId == null ? userHourlyRate.organisationId == null : this.organisationId.equals(userHourlyRate.organisationId)) &&
        (this.isCurrent == null ? userHourlyRate.isCurrent == null : this.isCurrent.equals(userHourlyRate.isCurrent)) &&
        (this.hourlyRate == null ? userHourlyRate.hourlyRate == null : this.hourlyRate.equals(userHourlyRate.hourlyRate)) &&
        (this.hourlyOvertimeRate == null ? userHourlyRate.hourlyOvertimeRate == null : this.hourlyOvertimeRate.equals(userHourlyRate.hourlyOvertimeRate)) &&
        (this.startDateTime == null ? userHourlyRate.startDateTime == null : this.startDateTime.equals(userHourlyRate.startDateTime)) &&
        (this.endDateTime == null ? userHourlyRate.endDateTime == null : this.endDateTime.equals(userHourlyRate.endDateTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rateId == null ? 0: this.rateId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.organisationId == null ? 0: this.organisationId.hashCode());
    result = 31 * result + (this.isCurrent == null ? 0: this.isCurrent.hashCode());
    result = 31 * result + (this.hourlyRate == null ? 0: this.hourlyRate.hashCode());
    result = 31 * result + (this.hourlyOvertimeRate == null ? 0: this.hourlyOvertimeRate.hashCode());
    result = 31 * result + (this.startDateTime == null ? 0: this.startDateTime.hashCode());
    result = 31 * result + (this.endDateTime == null ? 0: this.endDateTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUserHourlyRate {\n");
    
    sb.append("  rateId: ").append(rateId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  organisationId: ").append(organisationId).append("\n");
    sb.append("  isCurrent: ").append(isCurrent).append("\n");
    sb.append("  hourlyRate: ").append(hourlyRate).append("\n");
    sb.append("  hourlyOvertimeRate: ").append(hourlyOvertimeRate).append("\n");
    sb.append("  startDateTime: ").append(startDateTime).append("\n");
    sb.append("  endDateTime: ").append(endDateTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
