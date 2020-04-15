

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * Zacks target price consensus estimates from analysts for thousands of stocks. Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Company.
 */
@ApiModel(description = "Zacks target price consensus estimates from analysts for thousands of stocks. Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Company.")

public class ZacksTargetPriceConsensus {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("industry_group_number")
  private String industryGroupNumber = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("mean")
  private BigDecimal mean = null;

  @SerializedName("standard_deviation")
  private BigDecimal standardDeviation = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("most_recent_date")
  private LocalDate mostRecentDate = null;

  @SerializedName("median")
  private BigDecimal median = null;

  @SerializedName("raised")
  private Integer raised = null;

  @SerializedName("lowered")
  private Integer lowered = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public ZacksTargetPriceConsensus ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The Zacks common exchange ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "The Zacks common exchange ticker")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ZacksTargetPriceConsensus companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name
   * @return companyName
  **/
  @ApiModelProperty(value = "The company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ZacksTargetPriceConsensus industryGroupNumber(String industryGroupNumber) {
    this.industryGroupNumber = industryGroupNumber;
    return this;
  }

   /**
   * The Zacks industry group number
   * @return industryGroupNumber
  **/
  @ApiModelProperty(value = "The Zacks industry group number")
  public String getIndustryGroupNumber() {
    return industryGroupNumber;
  }

  public void setIndustryGroupNumber(String industryGroupNumber) {
    this.industryGroupNumber = industryGroupNumber;
  }

  public ZacksTargetPriceConsensus high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The high target price estimate
   * @return high
  **/
  @ApiModelProperty(value = "The high target price estimate")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ZacksTargetPriceConsensus low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The low target price estimate
   * @return low
  **/
  @ApiModelProperty(value = "The low target price estimate")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ZacksTargetPriceConsensus mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The mean target price estimate
   * @return mean
  **/
  @ApiModelProperty(value = "The mean target price estimate")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksTargetPriceConsensus standardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

   /**
   * The standard deviation of target price estimates
   * @return standardDeviation
  **/
  @ApiModelProperty(value = "The standard deviation of target price estimates")
  public BigDecimal getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  public ZacksTargetPriceConsensus total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The number of target price estimates in consensus
   * @return total
  **/
  @ApiModelProperty(value = "The number of target price estimates in consensus")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ZacksTargetPriceConsensus mostRecentDate(LocalDate mostRecentDate) {
    this.mostRecentDate = mostRecentDate;
    return this;
  }

   /**
   * The date of most recent estimate
   * @return mostRecentDate
  **/
  @ApiModelProperty(value = "The date of most recent estimate")
  public LocalDate getMostRecentDate() {
    return mostRecentDate;
  }

  public void setMostRecentDate(LocalDate mostRecentDate) {
    this.mostRecentDate = mostRecentDate;
  }

  public ZacksTargetPriceConsensus median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * The median target price estimate
   * @return median
  **/
  @ApiModelProperty(value = "The median target price estimate")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public ZacksTargetPriceConsensus raised(Integer raised) {
    this.raised = raised;
    return this;
  }

   /**
   * The number of estimates raised
   * @return raised
  **/
  @ApiModelProperty(value = "The number of estimates raised")
  public Integer getRaised() {
    return raised;
  }

  public void setRaised(Integer raised) {
    this.raised = raised;
  }

  public ZacksTargetPriceConsensus lowered(Integer lowered) {
    this.lowered = lowered;
    return this;
  }

   /**
   * The number of estimates lowered
   * @return lowered
  **/
  @ApiModelProperty(value = "The number of estimates lowered")
  public Integer getLowered() {
    return lowered;
  }

  public void setLowered(Integer lowered) {
    this.lowered = lowered;
  }

  public ZacksTargetPriceConsensus company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksTargetPriceConsensus zacksTargetPriceConsensus = (ZacksTargetPriceConsensus) o;
    return Objects.equals(this.ticker, zacksTargetPriceConsensus.ticker) &&
        Objects.equals(this.companyName, zacksTargetPriceConsensus.companyName) &&
        Objects.equals(this.industryGroupNumber, zacksTargetPriceConsensus.industryGroupNumber) &&
        Objects.equals(this.high, zacksTargetPriceConsensus.high) &&
        Objects.equals(this.low, zacksTargetPriceConsensus.low) &&
        Objects.equals(this.mean, zacksTargetPriceConsensus.mean) &&
        Objects.equals(this.standardDeviation, zacksTargetPriceConsensus.standardDeviation) &&
        Objects.equals(this.total, zacksTargetPriceConsensus.total) &&
        Objects.equals(this.mostRecentDate, zacksTargetPriceConsensus.mostRecentDate) &&
        Objects.equals(this.median, zacksTargetPriceConsensus.median) &&
        Objects.equals(this.raised, zacksTargetPriceConsensus.raised) &&
        Objects.equals(this.lowered, zacksTargetPriceConsensus.lowered) &&
        Objects.equals(this.company, zacksTargetPriceConsensus.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, companyName, industryGroupNumber, high, low, mean, standardDeviation, total, mostRecentDate, median, raised, lowered, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksTargetPriceConsensus {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    industryGroupNumber: ").append(toIndentedString(industryGroupNumber)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    mostRecentDate: ").append(toIndentedString(mostRecentDate)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    raised: ").append(toIndentedString(raised)).append("\n");
    sb.append("    lowered: ").append(toIndentedString(lowered)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

