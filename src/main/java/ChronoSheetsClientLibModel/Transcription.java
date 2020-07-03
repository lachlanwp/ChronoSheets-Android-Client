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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Transcription {
  
  @SerializedName("Id")
  private Integer id = null;
  @SerializedName("OrgId")
  private Integer orgId = null;
  @SerializedName("FileAttachmentId")
  private Integer fileAttachmentId = null;
  @SerializedName("Created")
  private Date created = null;
  public enum StatusEnum {
     Saved,  Processing,  Completed,  FailedWithError, 
  };
  @SerializedName("Status")
  private StatusEnum status = null;
  public enum MediaTypeEnum {
     Other,  Mp3,  Mp4,  Wav,  Flac, 
  };
  @SerializedName("MediaType")
  private MediaTypeEnum mediaType = null;
  @SerializedName("Contents")
  private String contents = null;

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
  public Integer getOrgId() {
    return orgId;
  }
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFileAttachmentId() {
    return fileAttachmentId;
  }
  public void setFileAttachmentId(Integer fileAttachmentId) {
    this.fileAttachmentId = fileAttachmentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcription transcription = (Transcription) o;
    return (this.id == null ? transcription.id == null : this.id.equals(transcription.id)) &&
        (this.orgId == null ? transcription.orgId == null : this.orgId.equals(transcription.orgId)) &&
        (this.fileAttachmentId == null ? transcription.fileAttachmentId == null : this.fileAttachmentId.equals(transcription.fileAttachmentId)) &&
        (this.created == null ? transcription.created == null : this.created.equals(transcription.created)) &&
        (this.status == null ? transcription.status == null : this.status.equals(transcription.status)) &&
        (this.mediaType == null ? transcription.mediaType == null : this.mediaType.equals(transcription.mediaType)) &&
        (this.contents == null ? transcription.contents == null : this.contents.equals(transcription.contents));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.fileAttachmentId == null ? 0: this.fileAttachmentId.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.mediaType == null ? 0: this.mediaType.hashCode());
    result = 31 * result + (this.contents == null ? 0: this.contents.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcription {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  fileAttachmentId: ").append(fileAttachmentId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  mediaType: ").append(mediaType).append("\n");
    sb.append("  contents: ").append(contents).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
