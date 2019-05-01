

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * Zacks Sales Surprises are pre-earnings release consensus sales estimates from analysts for thousands of stocks. Zack’s storied research team aggregates and validates the estimates and compares these estimates to non-GAAP sales reported by the company, providing the amount and percent surprise on release. Each Sales Surprise includes metadata about the corresponding Security.
 */
@ApiModel(description = "Zacks Sales Surprises are pre-earnings release consensus sales estimates from analysts for thousands of stocks. Zack’s storied research team aggregates and validates the estimates and compares these estimates to non-GAAP sales reported by the company, providing the amount and percent surprise on release. Each Sales Surprise includes metadata about the corresponding Security.")

public class ZacksSalesSurprise {
  @SerializedName("id")
  private String id = null;

  @SerializedName("fiscal_year")
  private BigDecimal fiscalYear = null;

  @SerializedName("fiscal_quarter")
  private String fiscalQuarter = null;

  @SerializedName("calendar_year")
  private BigDecimal calendarYear = null;

  @SerializedName("calendar_quarter")
  private String calendarQuarter = null;

  @SerializedName("actual_reported_date")
  private LocalDate actualReportedDate = null;

  @SerializedName("actual_reported_time")
  private String actualReportedTime = null;

  @SerializedName("actual_reported_code")
  private String actualReportedCode = null;

  @SerializedName("actual_reported_desc")
  private String actualReportedDesc = null;

  @SerializedName("last_rev_date")
  private LocalDate lastRevDate = null;

  @SerializedName("sales_actual")
  private BigDecimal salesActual = null;

  @SerializedName("sales_actual_zacks_adj")
  private BigDecimal salesActualZacksAdj = null;

  @SerializedName("sales_actual_gaap")
  private BigDecimal salesActualGaap = null;

  @SerializedName("sales_mean_estimate")
  private BigDecimal salesMeanEstimate = null;

  @SerializedName("sales_amount_diff")
  private BigDecimal salesAmountDiff = null;

  @SerializedName("sales_percent_diff")
  private BigDecimal salesPercentDiff = null;

  @SerializedName("sales_std_dev_estimate")
  private BigDecimal salesStdDevEstimate = null;

  public ZacksSalesSurprise id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the record
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the record")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ZacksSalesSurprise fiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The company’s fiscal year for the reported period
   * @return fiscalYear
  **/
  @ApiModelProperty(value = "The company’s fiscal year for the reported period")
  public BigDecimal getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public ZacksSalesSurprise fiscalQuarter(String fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

   /**
   * The company’s fiscal quarter for the reported period
   * @return fiscalQuarter
  **/
  @ApiModelProperty(value = "The company’s fiscal quarter for the reported period")
  public String getFiscalQuarter() {
    return fiscalQuarter;
  }

  public void setFiscalQuarter(String fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
  }

  public ZacksSalesSurprise calendarYear(BigDecimal calendarYear) {
    this.calendarYear = calendarYear;
    return this;
  }

   /**
   * The closest calendar year for the company’s fiscal year
   * @return calendarYear
  **/
  @ApiModelProperty(value = "The closest calendar year for the company’s fiscal year")
  public BigDecimal getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(BigDecimal calendarYear) {
    this.calendarYear = calendarYear;
  }

  public ZacksSalesSurprise calendarQuarter(String calendarQuarter) {
    this.calendarQuarter = calendarQuarter;
    return this;
  }

   /**
   * The closest calendar quarter for the company’s fiscal year
   * @return calendarQuarter
  **/
  @ApiModelProperty(value = "The closest calendar quarter for the company’s fiscal year")
  public String getCalendarQuarter() {
    return calendarQuarter;
  }

  public void setCalendarQuarter(String calendarQuarter) {
    this.calendarQuarter = calendarQuarter;
  }

  public ZacksSalesSurprise actualReportedDate(LocalDate actualReportedDate) {
    this.actualReportedDate = actualReportedDate;
    return this;
  }

   /**
   * The actual report date for the earnings release
   * @return actualReportedDate
  **/
  @ApiModelProperty(value = "The actual report date for the earnings release")
  public LocalDate getActualReportedDate() {
    return actualReportedDate;
  }

  public void setActualReportedDate(LocalDate actualReportedDate) {
    this.actualReportedDate = actualReportedDate;
  }

  public ZacksSalesSurprise actualReportedTime(String actualReportedTime) {
    this.actualReportedTime = actualReportedTime;
    return this;
  }

   /**
   * The actual report time for the earnings release
   * @return actualReportedTime
  **/
  @ApiModelProperty(value = "The actual report time for the earnings release")
  public String getActualReportedTime() {
    return actualReportedTime;
  }

  public void setActualReportedTime(String actualReportedTime) {
    this.actualReportedTime = actualReportedTime;
  }

  public ZacksSalesSurprise actualReportedCode(String actualReportedCode) {
    this.actualReportedCode = actualReportedCode;
    return this;
  }

   /**
   * The code cooresponding to the earnings release  BTO &#x3D; BEFORE THE OPEN | DTM &#x3D; DURING THE MARKET | AMC &#x3D; AFTER MARKET CLOSE
   * @return actualReportedCode
  **/
  @ApiModelProperty(value = "The code cooresponding to the earnings release  BTO = BEFORE THE OPEN | DTM = DURING THE MARKET | AMC = AFTER MARKET CLOSE")
  public String getActualReportedCode() {
    return actualReportedCode;
  }

  public void setActualReportedCode(String actualReportedCode) {
    this.actualReportedCode = actualReportedCode;
  }

  public ZacksSalesSurprise actualReportedDesc(String actualReportedDesc) {
    this.actualReportedDesc = actualReportedDesc;
    return this;
  }

   /**
   * The description for the type of earnings release
   * @return actualReportedDesc
  **/
  @ApiModelProperty(value = "The description for the type of earnings release")
  public String getActualReportedDesc() {
    return actualReportedDesc;
  }

  public void setActualReportedDesc(String actualReportedDesc) {
    this.actualReportedDesc = actualReportedDesc;
  }

  public ZacksSalesSurprise lastRevDate(LocalDate lastRevDate) {
    this.lastRevDate = lastRevDate;
    return this;
  }

   /**
   * The last revision date for the analyst estimates
   * @return lastRevDate
  **/
  @ApiModelProperty(value = "The last revision date for the analyst estimates")
  public LocalDate getLastRevDate() {
    return lastRevDate;
  }

  public void setLastRevDate(LocalDate lastRevDate) {
    this.lastRevDate = lastRevDate;
  }

  public ZacksSalesSurprise salesActual(BigDecimal salesActual) {
    this.salesActual = salesActual;
    return this;
  }

   /**
   * The actual Non-GAAP sales figure released by the company, interpreted by Zacks.
   * @return salesActual
  **/
  @ApiModelProperty(value = "The actual Non-GAAP sales figure released by the company, interpreted by Zacks.")
  public BigDecimal getSalesActual() {
    return salesActual;
  }

  public void setSalesActual(BigDecimal salesActual) {
    this.salesActual = salesActual;
  }

  public ZacksSalesSurprise salesActualZacksAdj(BigDecimal salesActualZacksAdj) {
    this.salesActualZacksAdj = salesActualZacksAdj;
    return this;
  }

   /**
   * The adjustments Zacks made to get to Non-GAAP sales to reconcile with GAAP sales.
   * @return salesActualZacksAdj
  **/
  @ApiModelProperty(value = "The adjustments Zacks made to get to Non-GAAP sales to reconcile with GAAP sales.")
  public BigDecimal getSalesActualZacksAdj() {
    return salesActualZacksAdj;
  }

  public void setSalesActualZacksAdj(BigDecimal salesActualZacksAdj) {
    this.salesActualZacksAdj = salesActualZacksAdj;
  }

  public ZacksSalesSurprise salesActualGaap(BigDecimal salesActualGaap) {
    this.salesActualGaap = salesActualGaap;
    return this;
  }

   /**
   * The actual GAAP sales figured released by the company
   * @return salesActualGaap
  **/
  @ApiModelProperty(value = "The actual GAAP sales figured released by the company")
  public BigDecimal getSalesActualGaap() {
    return salesActualGaap;
  }

  public void setSalesActualGaap(BigDecimal salesActualGaap) {
    this.salesActualGaap = salesActualGaap;
  }

  public ZacksSalesSurprise salesMeanEstimate(BigDecimal salesMeanEstimate) {
    this.salesMeanEstimate = salesMeanEstimate;
    return this;
  }

   /**
   * The pre-earnings release mean sales estimate for the company sales_count_estimate; the pre-earnings release number of estimates by analysts
   * @return salesMeanEstimate
  **/
  @ApiModelProperty(value = "The pre-earnings release mean sales estimate for the company sales_count_estimate; the pre-earnings release number of estimates by analysts")
  public BigDecimal getSalesMeanEstimate() {
    return salesMeanEstimate;
  }

  public void setSalesMeanEstimate(BigDecimal salesMeanEstimate) {
    this.salesMeanEstimate = salesMeanEstimate;
  }

  public ZacksSalesSurprise salesAmountDiff(BigDecimal salesAmountDiff) {
    this.salesAmountDiff = salesAmountDiff;
    return this;
  }

   /**
   * The sales surprise amount difference
   * @return salesAmountDiff
  **/
  @ApiModelProperty(value = "The sales surprise amount difference")
  public BigDecimal getSalesAmountDiff() {
    return salesAmountDiff;
  }

  public void setSalesAmountDiff(BigDecimal salesAmountDiff) {
    this.salesAmountDiff = salesAmountDiff;
  }

  public ZacksSalesSurprise salesPercentDiff(BigDecimal salesPercentDiff) {
    this.salesPercentDiff = salesPercentDiff;
    return this;
  }

   /**
   * The sales surprise percent difference
   * @return salesPercentDiff
  **/
  @ApiModelProperty(value = "The sales surprise percent difference")
  public BigDecimal getSalesPercentDiff() {
    return salesPercentDiff;
  }

  public void setSalesPercentDiff(BigDecimal salesPercentDiff) {
    this.salesPercentDiff = salesPercentDiff;
  }

  public ZacksSalesSurprise salesStdDevEstimate(BigDecimal salesStdDevEstimate) {
    this.salesStdDevEstimate = salesStdDevEstimate;
    return this;
  }

   /**
   * The pre-earnings release standard deviation of sales estimates
   * @return salesStdDevEstimate
  **/
  @ApiModelProperty(value = "The pre-earnings release standard deviation of sales estimates")
  public BigDecimal getSalesStdDevEstimate() {
    return salesStdDevEstimate;
  }

  public void setSalesStdDevEstimate(BigDecimal salesStdDevEstimate) {
    this.salesStdDevEstimate = salesStdDevEstimate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksSalesSurprise zacksSalesSurprise = (ZacksSalesSurprise) o;
    return Objects.equals(this.id, zacksSalesSurprise.id) &&
        Objects.equals(this.fiscalYear, zacksSalesSurprise.fiscalYear) &&
        Objects.equals(this.fiscalQuarter, zacksSalesSurprise.fiscalQuarter) &&
        Objects.equals(this.calendarYear, zacksSalesSurprise.calendarYear) &&
        Objects.equals(this.calendarQuarter, zacksSalesSurprise.calendarQuarter) &&
        Objects.equals(this.actualReportedDate, zacksSalesSurprise.actualReportedDate) &&
        Objects.equals(this.actualReportedTime, zacksSalesSurprise.actualReportedTime) &&
        Objects.equals(this.actualReportedCode, zacksSalesSurprise.actualReportedCode) &&
        Objects.equals(this.actualReportedDesc, zacksSalesSurprise.actualReportedDesc) &&
        Objects.equals(this.lastRevDate, zacksSalesSurprise.lastRevDate) &&
        Objects.equals(this.salesActual, zacksSalesSurprise.salesActual) &&
        Objects.equals(this.salesActualZacksAdj, zacksSalesSurprise.salesActualZacksAdj) &&
        Objects.equals(this.salesActualGaap, zacksSalesSurprise.salesActualGaap) &&
        Objects.equals(this.salesMeanEstimate, zacksSalesSurprise.salesMeanEstimate) &&
        Objects.equals(this.salesAmountDiff, zacksSalesSurprise.salesAmountDiff) &&
        Objects.equals(this.salesPercentDiff, zacksSalesSurprise.salesPercentDiff) &&
        Objects.equals(this.salesStdDevEstimate, zacksSalesSurprise.salesStdDevEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fiscalYear, fiscalQuarter, calendarYear, calendarQuarter, actualReportedDate, actualReportedTime, actualReportedCode, actualReportedDesc, lastRevDate, salesActual, salesActualZacksAdj, salesActualGaap, salesMeanEstimate, salesAmountDiff, salesPercentDiff, salesStdDevEstimate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksSalesSurprise {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
    sb.append("    calendarQuarter: ").append(toIndentedString(calendarQuarter)).append("\n");
    sb.append("    actualReportedDate: ").append(toIndentedString(actualReportedDate)).append("\n");
    sb.append("    actualReportedTime: ").append(toIndentedString(actualReportedTime)).append("\n");
    sb.append("    actualReportedCode: ").append(toIndentedString(actualReportedCode)).append("\n");
    sb.append("    actualReportedDesc: ").append(toIndentedString(actualReportedDesc)).append("\n");
    sb.append("    lastRevDate: ").append(toIndentedString(lastRevDate)).append("\n");
    sb.append("    salesActual: ").append(toIndentedString(salesActual)).append("\n");
    sb.append("    salesActualZacksAdj: ").append(toIndentedString(salesActualZacksAdj)).append("\n");
    sb.append("    salesActualGaap: ").append(toIndentedString(salesActualGaap)).append("\n");
    sb.append("    salesMeanEstimate: ").append(toIndentedString(salesMeanEstimate)).append("\n");
    sb.append("    salesAmountDiff: ").append(toIndentedString(salesAmountDiff)).append("\n");
    sb.append("    salesPercentDiff: ").append(toIndentedString(salesPercentDiff)).append("\n");
    sb.append("    salesStdDevEstimate: ").append(toIndentedString(salesStdDevEstimate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

