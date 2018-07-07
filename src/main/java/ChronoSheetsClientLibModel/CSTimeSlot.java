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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSTimeSlot {
  
  public enum DayTypeEnum {
     Monday,  Tuesday,  Wednesday,  Thursday,  Friday,  Saturday,  Sunday, 
  };
  @SerializedName("DayType")
  private DayTypeEnum dayType = null;
  @SerializedName("UsualHourId")
  private Integer usualHourId = null;
  @SerializedName("StartHour")
  private Integer startHour = null;
  @SerializedName("StartMinute")
  private Integer startMinute = null;
  @SerializedName("EndHour")
  private Integer endHour = null;
  @SerializedName("EndMinute")
  private Integer endMinute = null;
  @SerializedName("IsValid")
  private Boolean isValid = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DayTypeEnum getDayType() {
    return dayType;
  }
  public void setDayType(DayTypeEnum dayType) {
    this.dayType = dayType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUsualHourId() {
    return usualHourId;
  }
  public void setUsualHourId(Integer usualHourId) {
    this.usualHourId = usualHourId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartHour() {
    return startHour;
  }
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartMinute() {
    return startMinute;
  }
  public void setStartMinute(Integer startMinute) {
    this.startMinute = startMinute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndHour() {
    return endHour;
  }
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEndMinute() {
    return endMinute;
  }
  public void setEndMinute(Integer endMinute) {
    this.endMinute = endMinute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsValid() {
    return isValid;
  }
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimeSlot timeSlot = (CSTimeSlot) o;
    return (this.dayType == null ? timeSlot.dayType == null : this.dayType.equals(timeSlot.dayType)) &&
        (this.usualHourId == null ? timeSlot.usualHourId == null : this.usualHourId.equals(timeSlot.usualHourId)) &&
        (this.startHour == null ? timeSlot.startHour == null : this.startHour.equals(timeSlot.startHour)) &&
        (this.startMinute == null ? timeSlot.startMinute == null : this.startMinute.equals(timeSlot.startMinute)) &&
        (this.endHour == null ? timeSlot.endHour == null : this.endHour.equals(timeSlot.endHour)) &&
        (this.endMinute == null ? timeSlot.endMinute == null : this.endMinute.equals(timeSlot.endMinute)) &&
        (this.isValid == null ? timeSlot.isValid == null : this.isValid.equals(timeSlot.isValid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dayType == null ? 0: this.dayType.hashCode());
    result = 31 * result + (this.usualHourId == null ? 0: this.usualHourId.hashCode());
    result = 31 * result + (this.startHour == null ? 0: this.startHour.hashCode());
    result = 31 * result + (this.startMinute == null ? 0: this.startMinute.hashCode());
    result = 31 * result + (this.endHour == null ? 0: this.endHour.hashCode());
    result = 31 * result + (this.endMinute == null ? 0: this.endMinute.hashCode());
    result = 31 * result + (this.isValid == null ? 0: this.isValid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimeSlot {\n");
    
    sb.append("  dayType: ").append(dayType).append("\n");
    sb.append("  usualHourId: ").append(usualHourId).append("\n");
    sb.append("  startHour: ").append(startHour).append("\n");
    sb.append("  startMinute: ").append(startMinute).append("\n");
    sb.append("  endHour: ").append(endHour).append("\n");
    sb.append("  endMinute: ").append(endMinute).append("\n");
    sb.append("  isValid: ").append(isValid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
