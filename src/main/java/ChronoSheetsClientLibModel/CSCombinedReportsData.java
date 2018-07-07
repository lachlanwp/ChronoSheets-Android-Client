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

import ChronoSheetsClientLibModel.CSClientSeriesReportItem;
import ChronoSheetsClientLibModel.CSClientTotalsReportItem;
import ChronoSheetsClientLibModel.CSJobSeriesReportItem;
import ChronoSheetsClientLibModel.CSJobTotalsReportItem;
import ChronoSheetsClientLibModel.CSProjectSeriesReportItem;
import ChronoSheetsClientLibModel.CSProjectTotalsReportItem;
import ChronoSheetsClientLibModel.CSTaskSeriesReportItem;
import ChronoSheetsClientLibModel.CSTaskTotalsReportItem;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CSCombinedReportsData {
  
  @SerializedName("SeriesJobCodes")
  private List<CSJobSeriesReportItem> seriesJobCodes = null;
  @SerializedName("SeriesTasks")
  private List<CSTaskSeriesReportItem> seriesTasks = null;
  @SerializedName("SeriesClients")
  private List<CSClientSeriesReportItem> seriesClients = null;
  @SerializedName("SeriesProjects")
  private List<CSProjectSeriesReportItem> seriesProjects = null;
  @SerializedName("TotalsJobCodes")
  private List<CSJobTotalsReportItem> totalsJobCodes = null;
  @SerializedName("TotalsTasks")
  private List<CSTaskTotalsReportItem> totalsTasks = null;
  @SerializedName("TotalsClients")
  private List<CSClientTotalsReportItem> totalsClients = null;
  @SerializedName("TotalsProjects")
  private List<CSProjectTotalsReportItem> totalsProjects = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSJobSeriesReportItem> getSeriesJobCodes() {
    return seriesJobCodes;
  }
  public void setSeriesJobCodes(List<CSJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSTaskSeriesReportItem> getSeriesTasks() {
    return seriesTasks;
  }
  public void setSeriesTasks(List<CSTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSClientSeriesReportItem> getSeriesClients() {
    return seriesClients;
  }
  public void setSeriesClients(List<CSClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSProjectSeriesReportItem> getSeriesProjects() {
    return seriesProjects;
  }
  public void setSeriesProjects(List<CSProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSJobTotalsReportItem> getTotalsJobCodes() {
    return totalsJobCodes;
  }
  public void setTotalsJobCodes(List<CSJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSTaskTotalsReportItem> getTotalsTasks() {
    return totalsTasks;
  }
  public void setTotalsTasks(List<CSTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSClientTotalsReportItem> getTotalsClients() {
    return totalsClients;
  }
  public void setTotalsClients(List<CSClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CSProjectTotalsReportItem> getTotalsProjects() {
    return totalsProjects;
  }
  public void setTotalsProjects(List<CSProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSCombinedReportsData combinedReportsData = (CSCombinedReportsData) o;
    return (this.seriesJobCodes == null ? combinedReportsData.seriesJobCodes == null : this.seriesJobCodes.equals(combinedReportsData.seriesJobCodes)) &&
        (this.seriesTasks == null ? combinedReportsData.seriesTasks == null : this.seriesTasks.equals(combinedReportsData.seriesTasks)) &&
        (this.seriesClients == null ? combinedReportsData.seriesClients == null : this.seriesClients.equals(combinedReportsData.seriesClients)) &&
        (this.seriesProjects == null ? combinedReportsData.seriesProjects == null : this.seriesProjects.equals(combinedReportsData.seriesProjects)) &&
        (this.totalsJobCodes == null ? combinedReportsData.totalsJobCodes == null : this.totalsJobCodes.equals(combinedReportsData.totalsJobCodes)) &&
        (this.totalsTasks == null ? combinedReportsData.totalsTasks == null : this.totalsTasks.equals(combinedReportsData.totalsTasks)) &&
        (this.totalsClients == null ? combinedReportsData.totalsClients == null : this.totalsClients.equals(combinedReportsData.totalsClients)) &&
        (this.totalsProjects == null ? combinedReportsData.totalsProjects == null : this.totalsProjects.equals(combinedReportsData.totalsProjects));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.seriesJobCodes == null ? 0: this.seriesJobCodes.hashCode());
    result = 31 * result + (this.seriesTasks == null ? 0: this.seriesTasks.hashCode());
    result = 31 * result + (this.seriesClients == null ? 0: this.seriesClients.hashCode());
    result = 31 * result + (this.seriesProjects == null ? 0: this.seriesProjects.hashCode());
    result = 31 * result + (this.totalsJobCodes == null ? 0: this.totalsJobCodes.hashCode());
    result = 31 * result + (this.totalsTasks == null ? 0: this.totalsTasks.hashCode());
    result = 31 * result + (this.totalsClients == null ? 0: this.totalsClients.hashCode());
    result = 31 * result + (this.totalsProjects == null ? 0: this.totalsProjects.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSCombinedReportsData {\n");
    
    sb.append("  seriesJobCodes: ").append(seriesJobCodes).append("\n");
    sb.append("  seriesTasks: ").append(seriesTasks).append("\n");
    sb.append("  seriesClients: ").append(seriesClients).append("\n");
    sb.append("  seriesProjects: ").append(seriesProjects).append("\n");
    sb.append("  totalsJobCodes: ").append(totalsJobCodes).append("\n");
    sb.append("  totalsTasks: ").append(totalsTasks).append("\n");
    sb.append("  totalsClients: ").append(totalsClients).append("\n");
    sb.append("  totalsProjects: ").append(totalsProjects).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
