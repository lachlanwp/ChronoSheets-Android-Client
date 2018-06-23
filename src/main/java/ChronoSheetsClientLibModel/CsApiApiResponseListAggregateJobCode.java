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

import ChronoSheetsClientLibModel.CsApiAggregateJobCode;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CsApiApiResponseListAggregateJobCode {
  
  @SerializedName("Data")
  private List<CsApiAggregateJobCode> data = null;
  public enum StatusEnum {
     0,  1,  2,  3,  4,  5,  128, 
  };
  @SerializedName("Status")
  private StatusEnum status = null;
  @SerializedName("Message")
  private String message = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CsApiAggregateJobCode> getData() {
    return data;
  }
  public void setData(List<CsApiAggregateJobCode> data) {
    this.data = data;
  }

  /**
   * 0 = Succeeded, 1 = FatalException, 2 = GeneralError, 3 = ValidationError, 4 = UnAuthorized, 5 = SessionExpired, 128 = TestingABC
   **/
  @ApiModelProperty(value = "0 = Succeeded, 1 = FatalException, 2 = GeneralError, 3 = ValidationError, 4 = UnAuthorized, 5 = SessionExpired, 128 = TestingABC")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiApiResponseListAggregateJobCode apiResponseListAggregateJobCode = (CsApiApiResponseListAggregateJobCode) o;
    return (this.data == null ? apiResponseListAggregateJobCode.data == null : this.data.equals(apiResponseListAggregateJobCode.data)) &&
        (this.status == null ? apiResponseListAggregateJobCode.status == null : this.status.equals(apiResponseListAggregateJobCode.status)) &&
        (this.message == null ? apiResponseListAggregateJobCode.message == null : this.message.equals(apiResponseListAggregateJobCode.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiApiResponseListAggregateJobCode {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
