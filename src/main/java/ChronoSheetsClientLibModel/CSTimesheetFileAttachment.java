/**
 * ChronoSheets API
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
public class CSTimesheetFileAttachment {
  
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;
  @SerializedName("DocumentS3SignedUrl")
  private String documentS3SignedUrl = null;
  @SerializedName("ImageLargeS3SignedUrl")
  private String imageLargeS3SignedUrl = null;
  @SerializedName("ImageMediumS3SignedUrl")
  private String imageMediumS3SignedUrl = null;
  @SerializedName("ImageSmallS3SignedUrl")
  private String imageSmallS3SignedUrl = null;
  @SerializedName("TimesheetStart")
  private Date timesheetStart = null;
  @SerializedName("TimesheetEnd")
  private Date timesheetEnd = null;
  @SerializedName("FileAttachmentId")
  private Integer fileAttachmentId = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("OrgId")
  private Integer orgId = null;
  public enum MobilePlatformEnum {
     Unknown,  iOS,  Android, 
  };
  @SerializedName("MobilePlatform")
  private MobilePlatformEnum mobilePlatform = null;
  public enum AttachmentTypeEnum {
     Image,  WordDoc,  Pdf,  MSSpreadSheet,  MSPowerPoint,  RichTextFormat,  ZipFile,  Other,  Audio, 
  };
  @SerializedName("AttachmentType")
  private AttachmentTypeEnum attachmentType = null;
  @SerializedName("Notes")
  private String notes = null;
  @SerializedName("NonImageFilePath")
  private String nonImageFilePath = null;
  @SerializedName("ImageLargeFilePath")
  private String imageLargeFilePath = null;
  @SerializedName("ImageMediumFilePath")
  private String imageMediumFilePath = null;
  @SerializedName("ImageSmallFilePath")
  private String imageSmallFilePath = null;
  @SerializedName("OriginalFileName")
  private String originalFileName = null;
  @SerializedName("Latitude")
  private Double latitude = null;
  @SerializedName("Longitude")
  private Double longitude = null;
  @SerializedName("DateUploaded")
  private Date dateUploaded = null;
  @SerializedName("DateImageCaptured")
  private Date dateImageCaptured = null;
  @SerializedName("StorageAllocationBytes")
  private Long storageAllocationBytes = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTimesheetId() {
    return timesheetId;
  }
  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDocumentS3SignedUrl() {
    return documentS3SignedUrl;
  }
  public void setDocumentS3SignedUrl(String documentS3SignedUrl) {
    this.documentS3SignedUrl = documentS3SignedUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageLargeS3SignedUrl() {
    return imageLargeS3SignedUrl;
  }
  public void setImageLargeS3SignedUrl(String imageLargeS3SignedUrl) {
    this.imageLargeS3SignedUrl = imageLargeS3SignedUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageMediumS3SignedUrl() {
    return imageMediumS3SignedUrl;
  }
  public void setImageMediumS3SignedUrl(String imageMediumS3SignedUrl) {
    this.imageMediumS3SignedUrl = imageMediumS3SignedUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageSmallS3SignedUrl() {
    return imageSmallS3SignedUrl;
  }
  public void setImageSmallS3SignedUrl(String imageSmallS3SignedUrl) {
    this.imageSmallS3SignedUrl = imageSmallS3SignedUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTimesheetStart() {
    return timesheetStart;
  }
  public void setTimesheetStart(Date timesheetStart) {
    this.timesheetStart = timesheetStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTimesheetEnd() {
    return timesheetEnd;
  }
  public void setTimesheetEnd(Date timesheetEnd) {
    this.timesheetEnd = timesheetEnd;
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
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
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
  public MobilePlatformEnum getMobilePlatform() {
    return mobilePlatform;
  }
  public void setMobilePlatform(MobilePlatformEnum mobilePlatform) {
    this.mobilePlatform = mobilePlatform;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }
  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNonImageFilePath() {
    return nonImageFilePath;
  }
  public void setNonImageFilePath(String nonImageFilePath) {
    this.nonImageFilePath = nonImageFilePath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageLargeFilePath() {
    return imageLargeFilePath;
  }
  public void setImageLargeFilePath(String imageLargeFilePath) {
    this.imageLargeFilePath = imageLargeFilePath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageMediumFilePath() {
    return imageMediumFilePath;
  }
  public void setImageMediumFilePath(String imageMediumFilePath) {
    this.imageMediumFilePath = imageMediumFilePath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageSmallFilePath() {
    return imageSmallFilePath;
  }
  public void setImageSmallFilePath(String imageSmallFilePath) {
    this.imageSmallFilePath = imageSmallFilePath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOriginalFileName() {
    return originalFileName;
  }
  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDateUploaded() {
    return dateUploaded;
  }
  public void setDateUploaded(Date dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDateImageCaptured() {
    return dateImageCaptured;
  }
  public void setDateImageCaptured(Date dateImageCaptured) {
    this.dateImageCaptured = dateImageCaptured;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getStorageAllocationBytes() {
    return storageAllocationBytes;
  }
  public void setStorageAllocationBytes(Long storageAllocationBytes) {
    this.storageAllocationBytes = storageAllocationBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSTimesheetFileAttachment timesheetFileAttachment = (CSTimesheetFileAttachment) o;
    return (this.timesheetId == null ? timesheetFileAttachment.timesheetId == null : this.timesheetId.equals(timesheetFileAttachment.timesheetId)) &&
        (this.documentS3SignedUrl == null ? timesheetFileAttachment.documentS3SignedUrl == null : this.documentS3SignedUrl.equals(timesheetFileAttachment.documentS3SignedUrl)) &&
        (this.imageLargeS3SignedUrl == null ? timesheetFileAttachment.imageLargeS3SignedUrl == null : this.imageLargeS3SignedUrl.equals(timesheetFileAttachment.imageLargeS3SignedUrl)) &&
        (this.imageMediumS3SignedUrl == null ? timesheetFileAttachment.imageMediumS3SignedUrl == null : this.imageMediumS3SignedUrl.equals(timesheetFileAttachment.imageMediumS3SignedUrl)) &&
        (this.imageSmallS3SignedUrl == null ? timesheetFileAttachment.imageSmallS3SignedUrl == null : this.imageSmallS3SignedUrl.equals(timesheetFileAttachment.imageSmallS3SignedUrl)) &&
        (this.timesheetStart == null ? timesheetFileAttachment.timesheetStart == null : this.timesheetStart.equals(timesheetFileAttachment.timesheetStart)) &&
        (this.timesheetEnd == null ? timesheetFileAttachment.timesheetEnd == null : this.timesheetEnd.equals(timesheetFileAttachment.timesheetEnd)) &&
        (this.fileAttachmentId == null ? timesheetFileAttachment.fileAttachmentId == null : this.fileAttachmentId.equals(timesheetFileAttachment.fileAttachmentId)) &&
        (this.userId == null ? timesheetFileAttachment.userId == null : this.userId.equals(timesheetFileAttachment.userId)) &&
        (this.orgId == null ? timesheetFileAttachment.orgId == null : this.orgId.equals(timesheetFileAttachment.orgId)) &&
        (this.mobilePlatform == null ? timesheetFileAttachment.mobilePlatform == null : this.mobilePlatform.equals(timesheetFileAttachment.mobilePlatform)) &&
        (this.attachmentType == null ? timesheetFileAttachment.attachmentType == null : this.attachmentType.equals(timesheetFileAttachment.attachmentType)) &&
        (this.notes == null ? timesheetFileAttachment.notes == null : this.notes.equals(timesheetFileAttachment.notes)) &&
        (this.nonImageFilePath == null ? timesheetFileAttachment.nonImageFilePath == null : this.nonImageFilePath.equals(timesheetFileAttachment.nonImageFilePath)) &&
        (this.imageLargeFilePath == null ? timesheetFileAttachment.imageLargeFilePath == null : this.imageLargeFilePath.equals(timesheetFileAttachment.imageLargeFilePath)) &&
        (this.imageMediumFilePath == null ? timesheetFileAttachment.imageMediumFilePath == null : this.imageMediumFilePath.equals(timesheetFileAttachment.imageMediumFilePath)) &&
        (this.imageSmallFilePath == null ? timesheetFileAttachment.imageSmallFilePath == null : this.imageSmallFilePath.equals(timesheetFileAttachment.imageSmallFilePath)) &&
        (this.originalFileName == null ? timesheetFileAttachment.originalFileName == null : this.originalFileName.equals(timesheetFileAttachment.originalFileName)) &&
        (this.latitude == null ? timesheetFileAttachment.latitude == null : this.latitude.equals(timesheetFileAttachment.latitude)) &&
        (this.longitude == null ? timesheetFileAttachment.longitude == null : this.longitude.equals(timesheetFileAttachment.longitude)) &&
        (this.dateUploaded == null ? timesheetFileAttachment.dateUploaded == null : this.dateUploaded.equals(timesheetFileAttachment.dateUploaded)) &&
        (this.dateImageCaptured == null ? timesheetFileAttachment.dateImageCaptured == null : this.dateImageCaptured.equals(timesheetFileAttachment.dateImageCaptured)) &&
        (this.storageAllocationBytes == null ? timesheetFileAttachment.storageAllocationBytes == null : this.storageAllocationBytes.equals(timesheetFileAttachment.storageAllocationBytes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timesheetId == null ? 0: this.timesheetId.hashCode());
    result = 31 * result + (this.documentS3SignedUrl == null ? 0: this.documentS3SignedUrl.hashCode());
    result = 31 * result + (this.imageLargeS3SignedUrl == null ? 0: this.imageLargeS3SignedUrl.hashCode());
    result = 31 * result + (this.imageMediumS3SignedUrl == null ? 0: this.imageMediumS3SignedUrl.hashCode());
    result = 31 * result + (this.imageSmallS3SignedUrl == null ? 0: this.imageSmallS3SignedUrl.hashCode());
    result = 31 * result + (this.timesheetStart == null ? 0: this.timesheetStart.hashCode());
    result = 31 * result + (this.timesheetEnd == null ? 0: this.timesheetEnd.hashCode());
    result = 31 * result + (this.fileAttachmentId == null ? 0: this.fileAttachmentId.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.orgId == null ? 0: this.orgId.hashCode());
    result = 31 * result + (this.mobilePlatform == null ? 0: this.mobilePlatform.hashCode());
    result = 31 * result + (this.attachmentType == null ? 0: this.attachmentType.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    result = 31 * result + (this.nonImageFilePath == null ? 0: this.nonImageFilePath.hashCode());
    result = 31 * result + (this.imageLargeFilePath == null ? 0: this.imageLargeFilePath.hashCode());
    result = 31 * result + (this.imageMediumFilePath == null ? 0: this.imageMediumFilePath.hashCode());
    result = 31 * result + (this.imageSmallFilePath == null ? 0: this.imageSmallFilePath.hashCode());
    result = 31 * result + (this.originalFileName == null ? 0: this.originalFileName.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.dateUploaded == null ? 0: this.dateUploaded.hashCode());
    result = 31 * result + (this.dateImageCaptured == null ? 0: this.dateImageCaptured.hashCode());
    result = 31 * result + (this.storageAllocationBytes == null ? 0: this.storageAllocationBytes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSTimesheetFileAttachment {\n");
    
    sb.append("  timesheetId: ").append(timesheetId).append("\n");
    sb.append("  documentS3SignedUrl: ").append(documentS3SignedUrl).append("\n");
    sb.append("  imageLargeS3SignedUrl: ").append(imageLargeS3SignedUrl).append("\n");
    sb.append("  imageMediumS3SignedUrl: ").append(imageMediumS3SignedUrl).append("\n");
    sb.append("  imageSmallS3SignedUrl: ").append(imageSmallS3SignedUrl).append("\n");
    sb.append("  timesheetStart: ").append(timesheetStart).append("\n");
    sb.append("  timesheetEnd: ").append(timesheetEnd).append("\n");
    sb.append("  fileAttachmentId: ").append(fileAttachmentId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  orgId: ").append(orgId).append("\n");
    sb.append("  mobilePlatform: ").append(mobilePlatform).append("\n");
    sb.append("  attachmentType: ").append(attachmentType).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  nonImageFilePath: ").append(nonImageFilePath).append("\n");
    sb.append("  imageLargeFilePath: ").append(imageLargeFilePath).append("\n");
    sb.append("  imageMediumFilePath: ").append(imageMediumFilePath).append("\n");
    sb.append("  imageSmallFilePath: ").append(imageSmallFilePath).append("\n");
    sb.append("  originalFileName: ").append(originalFileName).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  dateUploaded: ").append(dateUploaded).append("\n");
    sb.append("  dateImageCaptured: ").append(dateImageCaptured).append("\n");
    sb.append("  storageAllocationBytes: ").append(storageAllocationBytes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
