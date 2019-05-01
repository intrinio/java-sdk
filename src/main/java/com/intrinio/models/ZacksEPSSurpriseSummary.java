

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
 * Zacks EPS Surprises are pre-earnings release consensus EPS estimates from analysts for thousands of stocks. Zack’s storied research team aggregates and validates the estimates and compares these estimates to non-GAAP EPS reported by the company, providing the amount and percent surprise on release.
 */
@ApiModel(description = "Zacks EPS Surprises are pre-earnings release consensus EPS estimates from analysts for thousands of stocks. Zack’s storied research team aggregates and validates the estimates and compares these estimates to non-GAAP EPS reported by the company, providing the amount and percent surprise on release.")

public class ZacksEPSSurpriseSummary {
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

  @SerializedName("eps_actual")
  private BigDecimal epsActual = null;

  @SerializedName("eps_actual_zacks_adj")
  private BigDecimal epsActualZacksAdj = null;

  @SerializedName("eps_mean_estimate")
  private BigDecimal epsMeanEstimate = null;

  @SerializedName("eps_amount_diff")
  private BigDecimal epsAmountDiff = null;

  @SerializedName("eps_percent_diff")
  private BigDecimal epsPercentDiff = null;

  @SerializedName("eps_count_estimate")
  private BigDecimal epsCountEstimate = null;

  @SerializedName("eps_std_dev_estimate")
  private BigDecimal epsStdDevEstimate = null;

  public ZacksEPSSurpriseSummary id(String id) {
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

  public ZacksEPSSurpriseSummary fiscalYear(BigDecimal fiscalYear) {
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

  public ZacksEPSSurpriseSummary fiscalQuarter(String fiscalQuarter) {
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

  public ZacksEPSSurpriseSummary calendarYear(BigDecimal calendarYear) {
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

  public ZacksEPSSurpriseSummary calendarQuarter(String calendarQuarter) {
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

  public ZacksEPSSurpriseSummary actualReportedDate(LocalDate actualReportedDate) {
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

  public ZacksEPSSurpriseSummary actualReportedTime(String actualReportedTime) {
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

  public ZacksEPSSurpriseSummary actualReportedCode(String actualReportedCode) {
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

  public ZacksEPSSurpriseSummary actualReportedDesc(String actualReportedDesc) {
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

  public ZacksEPSSurpriseSummary epsActual(BigDecimal epsActual) {
    this.epsActual = epsActual;
    return this;
  }

   /**
   * The actual Non-GAAP EPS figure released by the company, interpreted by Zacks.
   * @return epsActual
  **/
  @ApiModelProperty(value = "The actual Non-GAAP EPS figure released by the company, interpreted by Zacks.")
  public BigDecimal getEpsActual() {
    return epsActual;
  }

  public void setEpsActual(BigDecimal epsActual) {
    this.epsActual = epsActual;
  }

  public ZacksEPSSurpriseSummary epsActualZacksAdj(BigDecimal epsActualZacksAdj) {
    this.epsActualZacksAdj = epsActualZacksAdj;
    return this;
  }

   /**
   * The adjustments Zacks made to get to Non-GAAP EPS to reconcile with GAAP EPS.
   * @return epsActualZacksAdj
  **/
  @ApiModelProperty(value = "The adjustments Zacks made to get to Non-GAAP EPS to reconcile with GAAP EPS.")
  public BigDecimal getEpsActualZacksAdj() {
    return epsActualZacksAdj;
  }

  public void setEpsActualZacksAdj(BigDecimal epsActualZacksAdj) {
    this.epsActualZacksAdj = epsActualZacksAdj;
  }

  public ZacksEPSSurpriseSummary epsMeanEstimate(BigDecimal epsMeanEstimate) {
    this.epsMeanEstimate = epsMeanEstimate;
    return this;
  }

   /**
   * The pre-earnings release mean EPS estimate for the company
   * @return epsMeanEstimate
  **/
  @ApiModelProperty(value = "The pre-earnings release mean EPS estimate for the company")
  public BigDecimal getEpsMeanEstimate() {
    return epsMeanEstimate;
  }

  public void setEpsMeanEstimate(BigDecimal epsMeanEstimate) {
    this.epsMeanEstimate = epsMeanEstimate;
  }

  public ZacksEPSSurpriseSummary epsAmountDiff(BigDecimal epsAmountDiff) {
    this.epsAmountDiff = epsAmountDiff;
    return this;
  }

   /**
   * The EPS surprise amount difference
   * @return epsAmountDiff
  **/
  @ApiModelProperty(value = "The EPS surprise amount difference")
  public BigDecimal getEpsAmountDiff() {
    return epsAmountDiff;
  }

  public void setEpsAmountDiff(BigDecimal epsAmountDiff) {
    this.epsAmountDiff = epsAmountDiff;
  }

  public ZacksEPSSurpriseSummary epsPercentDiff(BigDecimal epsPercentDiff) {
    this.epsPercentDiff = epsPercentDiff;
    return this;
  }

   /**
   * The EPS surprise percent difference
   * @return epsPercentDiff
  **/
  @ApiModelProperty(value = "The EPS surprise percent difference")
  public BigDecimal getEpsPercentDiff() {
    return epsPercentDiff;
  }

  public void setEpsPercentDiff(BigDecimal epsPercentDiff) {
    this.epsPercentDiff = epsPercentDiff;
  }

  public ZacksEPSSurpriseSummary epsCountEstimate(BigDecimal epsCountEstimate) {
    this.epsCountEstimate = epsCountEstimate;
    return this;
  }

   /**
   * The pre-earnings release number of estimates by analysts
   * @return epsCountEstimate
  **/
  @ApiModelProperty(value = "The pre-earnings release number of estimates by analysts")
  public BigDecimal getEpsCountEstimate() {
    return epsCountEstimate;
  }

  public void setEpsCountEstimate(BigDecimal epsCountEstimate) {
    this.epsCountEstimate = epsCountEstimate;
  }

  public ZacksEPSSurpriseSummary epsStdDevEstimate(BigDecimal epsStdDevEstimate) {
    this.epsStdDevEstimate = epsStdDevEstimate;
    return this;
  }

   /**
   * The pre-earnings release standard deviation of EPS estimates
   * @return epsStdDevEstimate
  **/
  @ApiModelProperty(value = "The pre-earnings release standard deviation of EPS estimates")
  public BigDecimal getEpsStdDevEstimate() {
    return epsStdDevEstimate;
  }

  public void setEpsStdDevEstimate(BigDecimal epsStdDevEstimate) {
    this.epsStdDevEstimate = epsStdDevEstimate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksEPSSurpriseSummary zacksEPSSurpriseSummary = (ZacksEPSSurpriseSummary) o;
    return Objects.equals(this.id, zacksEPSSurpriseSummary.id) &&
        Objects.equals(this.fiscalYear, zacksEPSSurpriseSummary.fiscalYear) &&
        Objects.equals(this.fiscalQuarter, zacksEPSSurpriseSummary.fiscalQuarter) &&
        Objects.equals(this.calendarYear, zacksEPSSurpriseSummary.calendarYear) &&
        Objects.equals(this.calendarQuarter, zacksEPSSurpriseSummary.calendarQuarter) &&
        Objects.equals(this.actualReportedDate, zacksEPSSurpriseSummary.actualReportedDate) &&
        Objects.equals(this.actualReportedTime, zacksEPSSurpriseSummary.actualReportedTime) &&
        Objects.equals(this.actualReportedCode, zacksEPSSurpriseSummary.actualReportedCode) &&
        Objects.equals(this.actualReportedDesc, zacksEPSSurpriseSummary.actualReportedDesc) &&
        Objects.equals(this.epsActual, zacksEPSSurpriseSummary.epsActual) &&
        Objects.equals(this.epsActualZacksAdj, zacksEPSSurpriseSummary.epsActualZacksAdj) &&
        Objects.equals(this.epsMeanEstimate, zacksEPSSurpriseSummary.epsMeanEstimate) &&
        Objects.equals(this.epsAmountDiff, zacksEPSSurpriseSummary.epsAmountDiff) &&
        Objects.equals(this.epsPercentDiff, zacksEPSSurpriseSummary.epsPercentDiff) &&
        Objects.equals(this.epsCountEstimate, zacksEPSSurpriseSummary.epsCountEstimate) &&
        Objects.equals(this.epsStdDevEstimate, zacksEPSSurpriseSummary.epsStdDevEstimate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fiscalYear, fiscalQuarter, calendarYear, calendarQuarter, actualReportedDate, actualReportedTime, actualReportedCode, actualReportedDesc, epsActual, epsActualZacksAdj, epsMeanEstimate, epsAmountDiff, epsPercentDiff, epsCountEstimate, epsStdDevEstimate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksEPSSurpriseSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
    sb.append("    calendarQuarter: ").append(toIndentedString(calendarQuarter)).append("\n");
    sb.append("    actualReportedDate: ").append(toIndentedString(actualReportedDate)).append("\n");
    sb.append("    actualReportedTime: ").append(toIndentedString(actualReportedTime)).append("\n");
    sb.append("    actualReportedCode: ").append(toIndentedString(actualReportedCode)).append("\n");
    sb.append("    actualReportedDesc: ").append(toIndentedString(actualReportedDesc)).append("\n");
    sb.append("    epsActual: ").append(toIndentedString(epsActual)).append("\n");
    sb.append("    epsActualZacksAdj: ").append(toIndentedString(epsActualZacksAdj)).append("\n");
    sb.append("    epsMeanEstimate: ").append(toIndentedString(epsMeanEstimate)).append("\n");
    sb.append("    epsAmountDiff: ").append(toIndentedString(epsAmountDiff)).append("\n");
    sb.append("    epsPercentDiff: ").append(toIndentedString(epsPercentDiff)).append("\n");
    sb.append("    epsCountEstimate: ").append(toIndentedString(epsCountEstimate)).append("\n");
    sb.append("    epsStdDevEstimate: ").append(toIndentedString(epsStdDevEstimate)).append("\n");
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

