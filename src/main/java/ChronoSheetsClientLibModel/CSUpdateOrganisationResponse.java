/**
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ChronoSheetsClientLibModel;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSUpdateOrganisationResponse {
  
  @SerializedName("ValidationErrors")
  private List<String> validationErrors = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateOrganisationResponse updateOrganisationResponse = (CSUpdateOrganisationResponse) o;
    return (this.validationErrors == null ? updateOrganisationResponse.validationErrors == null : this.validationErrors.equals(updateOrganisationResponse.validationErrors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.validationErrors == null ? 0: this.validationErrors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateOrganisationResponse {\n");
    
    sb.append("  validationErrors: ").append(validationErrors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}