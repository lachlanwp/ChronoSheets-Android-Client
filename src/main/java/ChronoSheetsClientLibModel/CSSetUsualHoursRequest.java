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

import ChronoSheetsClientLibModel.CSUsualHoursDay;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An object that can be used to set the Usual Hours (Rostered Hours) of an employee user account
 **/
@ApiModel(description = "An object that can be used to set the Usual Hours (Rostered Hours) of an employee user account")
public class CSSetUsualHoursRequest {
  
  @SerializedName("UsualHoursData")
  private List<CSUsualHoursDay> usualHoursData = null;
  @SerializedName("UserId")
  private Integer userId = null;

  /**
   * A Collection of days (Mon-Sun) with updated Roster timeslots
   **/
  @ApiModelProperty(value = "A Collection of days (Mon-Sun) with updated Roster timeslots")
  public List<CSUsualHoursDay> getUsualHoursData() {
    return usualHoursData;
  }
  public void setUsualHoursData(List<CSUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
  }

  /**
   * The Id of the User that these updated Rostered Hours will be applied to
   **/
  @ApiModelProperty(value = "The Id of the User that these updated Rostered Hours will be applied to")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSetUsualHoursRequest setUsualHoursRequest = (CSSetUsualHoursRequest) o;
    return (this.usualHoursData == null ? setUsualHoursRequest.usualHoursData == null : this.usualHoursData.equals(setUsualHoursRequest.usualHoursData)) &&
        (this.userId == null ? setUsualHoursRequest.userId == null : this.userId.equals(setUsualHoursRequest.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.usualHoursData == null ? 0: this.usualHoursData.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSetUsualHoursRequest {\n");
    
    sb.append("  usualHoursData: ").append(usualHoursData).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
