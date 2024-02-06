

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
import org.threeten.bp.OffsetDateTime;

/**
 * A news article about a company
 */
@ApiModel(description = "A news article about a company")

public class CompanyDailyMetric {
  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("enterprise_value")
  private BigDecimal enterpriseValue = null;

  @SerializedName("ev_to_ebit")
  private BigDecimal evToEbit = null;

  @SerializedName("ev_to_ebitda")
  private BigDecimal evToEbitda = null;

  @SerializedName("market_cap")
  private BigDecimal marketCap = null;

  @SerializedName("price_to_book")
  private BigDecimal priceToBook = null;

  @SerializedName("price_to_earnings")
  private BigDecimal priceToEarnings = null;

  @SerializedName("price_to_revenue")
  private BigDecimal priceToRevenue = null;

  @SerializedName("price_to_tangible_book")
  private BigDecimal priceToTangibleBook = null;

  @SerializedName("dividend_yield")
  private BigDecimal dividendYield = null;

  @SerializedName("earnings_yield")
  private BigDecimal earningsYield = null;

  @SerializedName("ev_to_invested_capital")
  private BigDecimal evToInvestedCapital = null;

  @SerializedName("ev_to_revenue")
  private BigDecimal evToRevenue = null;

  @SerializedName("ev_to_nopat")
  private BigDecimal evToNopat = null;

  @SerializedName("ev_to_ocf")
  private BigDecimal evToOcf = null;

  @SerializedName("ev_to_fcff")
  private BigDecimal evToFcff = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public CompanyDailyMetric date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the metric
   * @return date
  **/
  @ApiModelProperty(value = "The date of the metric")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public CompanyDailyMetric enterpriseValue(BigDecimal enterpriseValue) {
    this.enterpriseValue = enterpriseValue;
    return this;
  }

   /**
   * The enterprise value.
   * @return enterpriseValue
  **/
  @ApiModelProperty(value = "The enterprise value.")
  public BigDecimal getEnterpriseValue() {
    return enterpriseValue;
  }

  public void setEnterpriseValue(BigDecimal enterpriseValue) {
    this.enterpriseValue = enterpriseValue;
  }

  public CompanyDailyMetric evToEbit(BigDecimal evToEbit) {
    this.evToEbit = evToEbit;
    return this;
  }

   /**
   * The enterprise value to earnings before interest and taxes ratio.
   * @return evToEbit
  **/
  @ApiModelProperty(value = "The enterprise value to earnings before interest and taxes ratio.")
  public BigDecimal getEvToEbit() {
    return evToEbit;
  }

  public void setEvToEbit(BigDecimal evToEbit) {
    this.evToEbit = evToEbit;
  }

  public CompanyDailyMetric evToEbitda(BigDecimal evToEbitda) {
    this.evToEbitda = evToEbitda;
    return this;
  }

   /**
   * The enterprise value to earnings before interest, taxes, depreciation, and amoritization ratio.
   * @return evToEbitda
  **/
  @ApiModelProperty(value = "The enterprise value to earnings before interest, taxes, depreciation, and amoritization ratio.")
  public BigDecimal getEvToEbitda() {
    return evToEbitda;
  }

  public void setEvToEbitda(BigDecimal evToEbitda) {
    this.evToEbitda = evToEbitda;
  }

  public CompanyDailyMetric marketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
    return this;
  }

   /**
   * The market cap.
   * @return marketCap
  **/
  @ApiModelProperty(value = "The market cap.")
  public BigDecimal getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
  }

  public CompanyDailyMetric priceToBook(BigDecimal priceToBook) {
    this.priceToBook = priceToBook;
    return this;
  }

   /**
   * The price to book ratio.
   * @return priceToBook
  **/
  @ApiModelProperty(value = "The price to book ratio.")
  public BigDecimal getPriceToBook() {
    return priceToBook;
  }

  public void setPriceToBook(BigDecimal priceToBook) {
    this.priceToBook = priceToBook;
  }

  public CompanyDailyMetric priceToEarnings(BigDecimal priceToEarnings) {
    this.priceToEarnings = priceToEarnings;
    return this;
  }

   /**
   * The price to earnings ratio.
   * @return priceToEarnings
  **/
  @ApiModelProperty(value = "The price to earnings ratio.")
  public BigDecimal getPriceToEarnings() {
    return priceToEarnings;
  }

  public void setPriceToEarnings(BigDecimal priceToEarnings) {
    this.priceToEarnings = priceToEarnings;
  }

  public CompanyDailyMetric priceToRevenue(BigDecimal priceToRevenue) {
    this.priceToRevenue = priceToRevenue;
    return this;
  }

   /**
   * The price to revenue ratio.
   * @return priceToRevenue
  **/
  @ApiModelProperty(value = "The price to revenue ratio.")
  public BigDecimal getPriceToRevenue() {
    return priceToRevenue;
  }

  public void setPriceToRevenue(BigDecimal priceToRevenue) {
    this.priceToRevenue = priceToRevenue;
  }

  public CompanyDailyMetric priceToTangibleBook(BigDecimal priceToTangibleBook) {
    this.priceToTangibleBook = priceToTangibleBook;
    return this;
  }

   /**
   * The price to tangible book ratio.
   * @return priceToTangibleBook
  **/
  @ApiModelProperty(value = "The price to tangible book ratio.")
  public BigDecimal getPriceToTangibleBook() {
    return priceToTangibleBook;
  }

  public void setPriceToTangibleBook(BigDecimal priceToTangibleBook) {
    this.priceToTangibleBook = priceToTangibleBook;
  }

  public CompanyDailyMetric dividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * The dividend yield.
   * @return dividendYield
  **/
  @ApiModelProperty(value = "The dividend yield.")
  public BigDecimal getDividendYield() {
    return dividendYield;
  }

  public void setDividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
  }

  public CompanyDailyMetric earningsYield(BigDecimal earningsYield) {
    this.earningsYield = earningsYield;
    return this;
  }

   /**
   * The earnings yield.
   * @return earningsYield
  **/
  @ApiModelProperty(value = "The earnings yield.")
  public BigDecimal getEarningsYield() {
    return earningsYield;
  }

  public void setEarningsYield(BigDecimal earningsYield) {
    this.earningsYield = earningsYield;
  }

  public CompanyDailyMetric evToInvestedCapital(BigDecimal evToInvestedCapital) {
    this.evToInvestedCapital = evToInvestedCapital;
    return this;
  }

   /**
   * The enterprise value to invested capital ratio.
   * @return evToInvestedCapital
  **/
  @ApiModelProperty(value = "The enterprise value to invested capital ratio.")
  public BigDecimal getEvToInvestedCapital() {
    return evToInvestedCapital;
  }

  public void setEvToInvestedCapital(BigDecimal evToInvestedCapital) {
    this.evToInvestedCapital = evToInvestedCapital;
  }

  public CompanyDailyMetric evToRevenue(BigDecimal evToRevenue) {
    this.evToRevenue = evToRevenue;
    return this;
  }

   /**
   * The enterprise value to revenue ratio.
   * @return evToRevenue
  **/
  @ApiModelProperty(value = "The enterprise value to revenue ratio.")
  public BigDecimal getEvToRevenue() {
    return evToRevenue;
  }

  public void setEvToRevenue(BigDecimal evToRevenue) {
    this.evToRevenue = evToRevenue;
  }

  public CompanyDailyMetric evToNopat(BigDecimal evToNopat) {
    this.evToNopat = evToNopat;
    return this;
  }

   /**
   * The enterprise value to normalized operating profit after tax ratio.
   * @return evToNopat
  **/
  @ApiModelProperty(value = "The enterprise value to normalized operating profit after tax ratio.")
  public BigDecimal getEvToNopat() {
    return evToNopat;
  }

  public void setEvToNopat(BigDecimal evToNopat) {
    this.evToNopat = evToNopat;
  }

  public CompanyDailyMetric evToOcf(BigDecimal evToOcf) {
    this.evToOcf = evToOcf;
    return this;
  }

   /**
   * The enterprise value to operating cash flow ratio.
   * @return evToOcf
  **/
  @ApiModelProperty(value = "The enterprise value to operating cash flow ratio.")
  public BigDecimal getEvToOcf() {
    return evToOcf;
  }

  public void setEvToOcf(BigDecimal evToOcf) {
    this.evToOcf = evToOcf;
  }

  public CompanyDailyMetric evToFcff(BigDecimal evToFcff) {
    this.evToFcff = evToFcff;
    return this;
  }

   /**
   * The enterprise value to free cash flow to the firm ratio.
   * @return evToFcff
  **/
  @ApiModelProperty(value = "The enterprise value to free cash flow to the firm ratio.")
  public BigDecimal getEvToFcff() {
    return evToFcff;
  }

  public void setEvToFcff(BigDecimal evToFcff) {
    this.evToFcff = evToFcff;
  }

  public CompanyDailyMetric company(CompanySummary company) {
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
    CompanyDailyMetric companyDailyMetric = (CompanyDailyMetric) o;
    return Objects.equals(this.date, companyDailyMetric.date) &&
        Objects.equals(this.enterpriseValue, companyDailyMetric.enterpriseValue) &&
        Objects.equals(this.evToEbit, companyDailyMetric.evToEbit) &&
        Objects.equals(this.evToEbitda, companyDailyMetric.evToEbitda) &&
        Objects.equals(this.marketCap, companyDailyMetric.marketCap) &&
        Objects.equals(this.priceToBook, companyDailyMetric.priceToBook) &&
        Objects.equals(this.priceToEarnings, companyDailyMetric.priceToEarnings) &&
        Objects.equals(this.priceToRevenue, companyDailyMetric.priceToRevenue) &&
        Objects.equals(this.priceToTangibleBook, companyDailyMetric.priceToTangibleBook) &&
        Objects.equals(this.dividendYield, companyDailyMetric.dividendYield) &&
        Objects.equals(this.earningsYield, companyDailyMetric.earningsYield) &&
        Objects.equals(this.evToInvestedCapital, companyDailyMetric.evToInvestedCapital) &&
        Objects.equals(this.evToRevenue, companyDailyMetric.evToRevenue) &&
        Objects.equals(this.evToNopat, companyDailyMetric.evToNopat) &&
        Objects.equals(this.evToOcf, companyDailyMetric.evToOcf) &&
        Objects.equals(this.evToFcff, companyDailyMetric.evToFcff) &&
        Objects.equals(this.company, companyDailyMetric.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, enterpriseValue, evToEbit, evToEbitda, marketCap, priceToBook, priceToEarnings, priceToRevenue, priceToTangibleBook, dividendYield, earningsYield, evToInvestedCapital, evToRevenue, evToNopat, evToOcf, evToFcff, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDailyMetric {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    enterpriseValue: ").append(toIndentedString(enterpriseValue)).append("\n");
    sb.append("    evToEbit: ").append(toIndentedString(evToEbit)).append("\n");
    sb.append("    evToEbitda: ").append(toIndentedString(evToEbitda)).append("\n");
    sb.append("    marketCap: ").append(toIndentedString(marketCap)).append("\n");
    sb.append("    priceToBook: ").append(toIndentedString(priceToBook)).append("\n");
    sb.append("    priceToEarnings: ").append(toIndentedString(priceToEarnings)).append("\n");
    sb.append("    priceToRevenue: ").append(toIndentedString(priceToRevenue)).append("\n");
    sb.append("    priceToTangibleBook: ").append(toIndentedString(priceToTangibleBook)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    earningsYield: ").append(toIndentedString(earningsYield)).append("\n");
    sb.append("    evToInvestedCapital: ").append(toIndentedString(evToInvestedCapital)).append("\n");
    sb.append("    evToRevenue: ").append(toIndentedString(evToRevenue)).append("\n");
    sb.append("    evToNopat: ").append(toIndentedString(evToNopat)).append("\n");
    sb.append("    evToOcf: ").append(toIndentedString(evToOcf)).append("\n");
    sb.append("    evToFcff: ").append(toIndentedString(evToFcff)).append("\n");
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

