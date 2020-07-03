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

@ApiModel(description = "")
public class AggregateJobTask {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("Label")
  private String label = null;
  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  /**
   * The Id of the task
   **/
  @ApiModelProperty(value = "The Id of the task")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The label of the task
   **/
  @ApiModelProperty(value = "The label of the task")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * A flag indicating that this task has been marked as deleted
   **/
  @ApiModelProperty(value = "A flag indicating that this task has been marked as deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateJobTask aggregateJobTask = (AggregateJobTask) o;
    return (this.id == null ? aggregateJobTask.id == null : this.id.equals(aggregateJobTask.id)) &&
        (this.label == null ? aggregateJobTask.label == null : this.label.equals(aggregateJobTask.label)) &&
        (this.isDeleted == null ? aggregateJobTask.isDeleted == null : this.isDeleted.equals(aggregateJobTask.isDeleted));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.label == null ? 0: this.label.hashCode());
    result = 31 * result + (this.isDeleted == null ? 0: this.isDeleted.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateJobTask {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  isDeleted: ").append(isDeleted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
