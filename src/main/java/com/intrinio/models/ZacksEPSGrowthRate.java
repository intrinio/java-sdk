

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

/**
 * Zacks earnings-per-share (EPS) growth rates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Company.
 */
@ApiModel(description = "Zacks earnings-per-share (EPS) growth rates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Company.")

public class ZacksEPSGrowthRate {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("industry_group_number")
  private String industryGroupNumber = null;

  @SerializedName("industry_group_name")
  private String industryGroupName = null;

  @SerializedName("fiscal_year_0")
  private Integer fiscalYear0 = null;

  @SerializedName("fiscal_year_1")
  private Integer fiscalYear1 = null;

  @SerializedName("fiscal_year_2")
  private Integer fiscalYear2 = null;

  @SerializedName("company_last_5_year_actual")
  private BigDecimal companyLast5YearActual = null;

  @SerializedName("company_fiscal_year_1_vs_fiscal_year_0")
  private BigDecimal companyFiscalYear1VsFiscalYear0 = null;

  @SerializedName("company_fiscal_year_2_vs_fiscal_year_1")
  private BigDecimal companyFiscalYear2VsFiscalYear1 = null;

  @SerializedName("company_long_term_growth_mean")
  private BigDecimal companyLongTermGrowthMean = null;

  @SerializedName("company_fiscal_year_1_forward_price_to_earnings")
  private BigDecimal companyFiscalYear1ForwardPriceToEarnings = null;

  @SerializedName("industry_last_5_year_actual")
  private BigDecimal industryLast5YearActual = null;

  @SerializedName("industry_fiscal_year_1_vs_fiscal_year_0")
  private BigDecimal industryFiscalYear1VsFiscalYear0 = null;

  @SerializedName("industry_fiscal_year_2_vs_fiscal_year_1")
  private BigDecimal industryFiscalYear2VsFiscalYear1 = null;

  @SerializedName("industry_long_term_growth_mean")
  private BigDecimal industryLongTermGrowthMean = null;

  @SerializedName("industry_fiscal_year_1_forward_price_to_earnings")
  private BigDecimal industryFiscalYear1ForwardPriceToEarnings = null;

  @SerializedName("sp500_last_5_year_actual")
  private BigDecimal sp500Last5YearActual = null;

  @SerializedName("sp500_fiscal_year_1_vs_fiscal_year_0")
  private BigDecimal sp500FiscalYear1VsFiscalYear0 = null;

  @SerializedName("sp500_fiscal_year_2_vs_fiscal_year_1")
  private BigDecimal sp500FiscalYear2VsFiscalYear1 = null;

  @SerializedName("sp500_long_term_growth")
  private BigDecimal sp500LongTermGrowth = null;

  @SerializedName("sp500_fiscal_year_1_price_to_earnings")
  private BigDecimal sp500FiscalYear1PriceToEarnings = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public ZacksEPSGrowthRate ticker(String ticker) {
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

  public ZacksEPSGrowthRate companyName(String companyName) {
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

  public ZacksEPSGrowthRate industryGroupNumber(String industryGroupNumber) {
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

  public ZacksEPSGrowthRate industryGroupName(String industryGroupName) {
    this.industryGroupName = industryGroupName;
    return this;
  }

   /**
   * The Zacks industry group name
   * @return industryGroupName
  **/
  @ApiModelProperty(value = "The Zacks industry group name")
  public String getIndustryGroupName() {
    return industryGroupName;
  }

  public void setIndustryGroupName(String industryGroupName) {
    this.industryGroupName = industryGroupName;
  }

  public ZacksEPSGrowthRate fiscalYear0(Integer fiscalYear0) {
    this.fiscalYear0 = fiscalYear0;
    return this;
  }

   /**
   * The current fiscal year
   * @return fiscalYear0
  **/
  @ApiModelProperty(value = "The current fiscal year")
  public Integer getFiscalYear0() {
    return fiscalYear0;
  }

  public void setFiscalYear0(Integer fiscalYear0) {
    this.fiscalYear0 = fiscalYear0;
  }

  public ZacksEPSGrowthRate fiscalYear1(Integer fiscalYear1) {
    this.fiscalYear1 = fiscalYear1;
    return this;
  }

   /**
   * The next fiscal year
   * @return fiscalYear1
  **/
  @ApiModelProperty(value = "The next fiscal year")
  public Integer getFiscalYear1() {
    return fiscalYear1;
  }

  public void setFiscalYear1(Integer fiscalYear1) {
    this.fiscalYear1 = fiscalYear1;
  }

  public ZacksEPSGrowthRate fiscalYear2(Integer fiscalYear2) {
    this.fiscalYear2 = fiscalYear2;
    return this;
  }

   /**
   * The fiscal year after the next fiscal year
   * @return fiscalYear2
  **/
  @ApiModelProperty(value = "The fiscal year after the next fiscal year")
  public Integer getFiscalYear2() {
    return fiscalYear2;
  }

  public void setFiscalYear2(Integer fiscalYear2) {
    this.fiscalYear2 = fiscalYear2;
  }

  public ZacksEPSGrowthRate companyLast5YearActual(BigDecimal companyLast5YearActual) {
    this.companyLast5YearActual = companyLast5YearActual;
    return this;
  }

   /**
   * The company&#39;s last 5 year actual percentage earnings-per-share (EPS) growth rate
   * @return companyLast5YearActual
  **/
  @ApiModelProperty(value = "The company's last 5 year actual percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getCompanyLast5YearActual() {
    return companyLast5YearActual;
  }

  public void setCompanyLast5YearActual(BigDecimal companyLast5YearActual) {
    this.companyLast5YearActual = companyLast5YearActual;
  }

  public ZacksEPSGrowthRate companyFiscalYear1VsFiscalYear0(BigDecimal companyFiscalYear1VsFiscalYear0) {
    this.companyFiscalYear1VsFiscalYear0 = companyFiscalYear1VsFiscalYear0;
    return this;
  }

   /**
   * The company&#39;s current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate
   * @return companyFiscalYear1VsFiscalYear0
  **/
  @ApiModelProperty(value = "The company's current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getCompanyFiscalYear1VsFiscalYear0() {
    return companyFiscalYear1VsFiscalYear0;
  }

  public void setCompanyFiscalYear1VsFiscalYear0(BigDecimal companyFiscalYear1VsFiscalYear0) {
    this.companyFiscalYear1VsFiscalYear0 = companyFiscalYear1VsFiscalYear0;
  }

  public ZacksEPSGrowthRate companyFiscalYear2VsFiscalYear1(BigDecimal companyFiscalYear2VsFiscalYear1) {
    this.companyFiscalYear2VsFiscalYear1 = companyFiscalYear2VsFiscalYear1;
    return this;
  }

   /**
   * The company&#39;s next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate
   * @return companyFiscalYear2VsFiscalYear1
  **/
  @ApiModelProperty(value = "The company's next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getCompanyFiscalYear2VsFiscalYear1() {
    return companyFiscalYear2VsFiscalYear1;
  }

  public void setCompanyFiscalYear2VsFiscalYear1(BigDecimal companyFiscalYear2VsFiscalYear1) {
    this.companyFiscalYear2VsFiscalYear1 = companyFiscalYear2VsFiscalYear1;
  }

  public ZacksEPSGrowthRate companyLongTermGrowthMean(BigDecimal companyLongTermGrowthMean) {
    this.companyLongTermGrowthMean = companyLongTermGrowthMean;
    return this;
  }

   /**
   * The company&#39;s long term growth rate mean estimate
   * @return companyLongTermGrowthMean
  **/
  @ApiModelProperty(value = "The company's long term growth rate mean estimate")
  public BigDecimal getCompanyLongTermGrowthMean() {
    return companyLongTermGrowthMean;
  }

  public void setCompanyLongTermGrowthMean(BigDecimal companyLongTermGrowthMean) {
    this.companyLongTermGrowthMean = companyLongTermGrowthMean;
  }

  public ZacksEPSGrowthRate companyFiscalYear1ForwardPriceToEarnings(BigDecimal companyFiscalYear1ForwardPriceToEarnings) {
    this.companyFiscalYear1ForwardPriceToEarnings = companyFiscalYear1ForwardPriceToEarnings;
    return this;
  }

   /**
   * The company&#39;s forward (current fiscal year) price-to-earnings (P/E) ratio
   * @return companyFiscalYear1ForwardPriceToEarnings
  **/
  @ApiModelProperty(value = "The company's forward (current fiscal year) price-to-earnings (P/E) ratio")
  public BigDecimal getCompanyFiscalYear1ForwardPriceToEarnings() {
    return companyFiscalYear1ForwardPriceToEarnings;
  }

  public void setCompanyFiscalYear1ForwardPriceToEarnings(BigDecimal companyFiscalYear1ForwardPriceToEarnings) {
    this.companyFiscalYear1ForwardPriceToEarnings = companyFiscalYear1ForwardPriceToEarnings;
  }

  public ZacksEPSGrowthRate industryLast5YearActual(BigDecimal industryLast5YearActual) {
    this.industryLast5YearActual = industryLast5YearActual;
    return this;
  }

   /**
   * The industry&#39;s last 5 year actual percentage earnings-per-share (EPS) growth rate
   * @return industryLast5YearActual
  **/
  @ApiModelProperty(value = "The industry's last 5 year actual percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getIndustryLast5YearActual() {
    return industryLast5YearActual;
  }

  public void setIndustryLast5YearActual(BigDecimal industryLast5YearActual) {
    this.industryLast5YearActual = industryLast5YearActual;
  }

  public ZacksEPSGrowthRate industryFiscalYear1VsFiscalYear0(BigDecimal industryFiscalYear1VsFiscalYear0) {
    this.industryFiscalYear1VsFiscalYear0 = industryFiscalYear1VsFiscalYear0;
    return this;
  }

   /**
   * The industry&#39;s current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate
   * @return industryFiscalYear1VsFiscalYear0
  **/
  @ApiModelProperty(value = "The industry's current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getIndustryFiscalYear1VsFiscalYear0() {
    return industryFiscalYear1VsFiscalYear0;
  }

  public void setIndustryFiscalYear1VsFiscalYear0(BigDecimal industryFiscalYear1VsFiscalYear0) {
    this.industryFiscalYear1VsFiscalYear0 = industryFiscalYear1VsFiscalYear0;
  }

  public ZacksEPSGrowthRate industryFiscalYear2VsFiscalYear1(BigDecimal industryFiscalYear2VsFiscalYear1) {
    this.industryFiscalYear2VsFiscalYear1 = industryFiscalYear2VsFiscalYear1;
    return this;
  }

   /**
   * The industry&#39;s next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate
   * @return industryFiscalYear2VsFiscalYear1
  **/
  @ApiModelProperty(value = "The industry's next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getIndustryFiscalYear2VsFiscalYear1() {
    return industryFiscalYear2VsFiscalYear1;
  }

  public void setIndustryFiscalYear2VsFiscalYear1(BigDecimal industryFiscalYear2VsFiscalYear1) {
    this.industryFiscalYear2VsFiscalYear1 = industryFiscalYear2VsFiscalYear1;
  }

  public ZacksEPSGrowthRate industryLongTermGrowthMean(BigDecimal industryLongTermGrowthMean) {
    this.industryLongTermGrowthMean = industryLongTermGrowthMean;
    return this;
  }

   /**
   * The industry&#39;s long term growth rate mean estimate
   * @return industryLongTermGrowthMean
  **/
  @ApiModelProperty(value = "The industry's long term growth rate mean estimate")
  public BigDecimal getIndustryLongTermGrowthMean() {
    return industryLongTermGrowthMean;
  }

  public void setIndustryLongTermGrowthMean(BigDecimal industryLongTermGrowthMean) {
    this.industryLongTermGrowthMean = industryLongTermGrowthMean;
  }

  public ZacksEPSGrowthRate industryFiscalYear1ForwardPriceToEarnings(BigDecimal industryFiscalYear1ForwardPriceToEarnings) {
    this.industryFiscalYear1ForwardPriceToEarnings = industryFiscalYear1ForwardPriceToEarnings;
    return this;
  }

   /**
   * The industry&#39;s forward (current fiscal year) price-to-earnings (P/E) ratio
   * @return industryFiscalYear1ForwardPriceToEarnings
  **/
  @ApiModelProperty(value = "The industry's forward (current fiscal year) price-to-earnings (P/E) ratio")
  public BigDecimal getIndustryFiscalYear1ForwardPriceToEarnings() {
    return industryFiscalYear1ForwardPriceToEarnings;
  }

  public void setIndustryFiscalYear1ForwardPriceToEarnings(BigDecimal industryFiscalYear1ForwardPriceToEarnings) {
    this.industryFiscalYear1ForwardPriceToEarnings = industryFiscalYear1ForwardPriceToEarnings;
  }

  public ZacksEPSGrowthRate sp500Last5YearActual(BigDecimal sp500Last5YearActual) {
    this.sp500Last5YearActual = sp500Last5YearActual;
    return this;
  }

   /**
   * The S&amp;P 500&#39;s last 5 year actual percentage earnings-per-share (EPS) growth rate
   * @return sp500Last5YearActual
  **/
  @ApiModelProperty(value = "The S&P 500's last 5 year actual percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getSp500Last5YearActual() {
    return sp500Last5YearActual;
  }

  public void setSp500Last5YearActual(BigDecimal sp500Last5YearActual) {
    this.sp500Last5YearActual = sp500Last5YearActual;
  }

  public ZacksEPSGrowthRate sp500FiscalYear1VsFiscalYear0(BigDecimal sp500FiscalYear1VsFiscalYear0) {
    this.sp500FiscalYear1VsFiscalYear0 = sp500FiscalYear1VsFiscalYear0;
    return this;
  }

   /**
   * The S&amp;P 500&#39;s current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate
   * @return sp500FiscalYear1VsFiscalYear0
  **/
  @ApiModelProperty(value = "The S&P 500's current fiscal year / last fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getSp500FiscalYear1VsFiscalYear0() {
    return sp500FiscalYear1VsFiscalYear0;
  }

  public void setSp500FiscalYear1VsFiscalYear0(BigDecimal sp500FiscalYear1VsFiscalYear0) {
    this.sp500FiscalYear1VsFiscalYear0 = sp500FiscalYear1VsFiscalYear0;
  }

  public ZacksEPSGrowthRate sp500FiscalYear2VsFiscalYear1(BigDecimal sp500FiscalYear2VsFiscalYear1) {
    this.sp500FiscalYear2VsFiscalYear1 = sp500FiscalYear2VsFiscalYear1;
    return this;
  }

   /**
   * The S&amp;P 500&#39;s next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate
   * @return sp500FiscalYear2VsFiscalYear1
  **/
  @ApiModelProperty(value = "The S&P 500's next fiscal year / current fiscal year percentage earnings-per-share (EPS) growth rate")
  public BigDecimal getSp500FiscalYear2VsFiscalYear1() {
    return sp500FiscalYear2VsFiscalYear1;
  }

  public void setSp500FiscalYear2VsFiscalYear1(BigDecimal sp500FiscalYear2VsFiscalYear1) {
    this.sp500FiscalYear2VsFiscalYear1 = sp500FiscalYear2VsFiscalYear1;
  }

  public ZacksEPSGrowthRate sp500LongTermGrowth(BigDecimal sp500LongTermGrowth) {
    this.sp500LongTermGrowth = sp500LongTermGrowth;
    return this;
  }

   /**
   * The S&amp;P 500&#39;s long term growth rate mean estimate
   * @return sp500LongTermGrowth
  **/
  @ApiModelProperty(value = "The S&P 500's long term growth rate mean estimate")
  public BigDecimal getSp500LongTermGrowth() {
    return sp500LongTermGrowth;
  }

  public void setSp500LongTermGrowth(BigDecimal sp500LongTermGrowth) {
    this.sp500LongTermGrowth = sp500LongTermGrowth;
  }

  public ZacksEPSGrowthRate sp500FiscalYear1PriceToEarnings(BigDecimal sp500FiscalYear1PriceToEarnings) {
    this.sp500FiscalYear1PriceToEarnings = sp500FiscalYear1PriceToEarnings;
    return this;
  }

   /**
   * The S&amp;P 500&#39;s forward (current fiscal year) price-to-earnings (P/E) ratio
   * @return sp500FiscalYear1PriceToEarnings
  **/
  @ApiModelProperty(value = "The S&P 500's forward (current fiscal year) price-to-earnings (P/E) ratio")
  public BigDecimal getSp500FiscalYear1PriceToEarnings() {
    return sp500FiscalYear1PriceToEarnings;
  }

  public void setSp500FiscalYear1PriceToEarnings(BigDecimal sp500FiscalYear1PriceToEarnings) {
    this.sp500FiscalYear1PriceToEarnings = sp500FiscalYear1PriceToEarnings;
  }

  public ZacksEPSGrowthRate company(CompanySummary company) {
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
    ZacksEPSGrowthRate zacksEPSGrowthRate = (ZacksEPSGrowthRate) o;
    return Objects.equals(this.ticker, zacksEPSGrowthRate.ticker) &&
        Objects.equals(this.companyName, zacksEPSGrowthRate.companyName) &&
        Objects.equals(this.industryGroupNumber, zacksEPSGrowthRate.industryGroupNumber) &&
        Objects.equals(this.industryGroupName, zacksEPSGrowthRate.industryGroupName) &&
        Objects.equals(this.fiscalYear0, zacksEPSGrowthRate.fiscalYear0) &&
        Objects.equals(this.fiscalYear1, zacksEPSGrowthRate.fiscalYear1) &&
        Objects.equals(this.fiscalYear2, zacksEPSGrowthRate.fiscalYear2) &&
        Objects.equals(this.companyLast5YearActual, zacksEPSGrowthRate.companyLast5YearActual) &&
        Objects.equals(this.companyFiscalYear1VsFiscalYear0, zacksEPSGrowthRate.companyFiscalYear1VsFiscalYear0) &&
        Objects.equals(this.companyFiscalYear2VsFiscalYear1, zacksEPSGrowthRate.companyFiscalYear2VsFiscalYear1) &&
        Objects.equals(this.companyLongTermGrowthMean, zacksEPSGrowthRate.companyLongTermGrowthMean) &&
        Objects.equals(this.companyFiscalYear1ForwardPriceToEarnings, zacksEPSGrowthRate.companyFiscalYear1ForwardPriceToEarnings) &&
        Objects.equals(this.industryLast5YearActual, zacksEPSGrowthRate.industryLast5YearActual) &&
        Objects.equals(this.industryFiscalYear1VsFiscalYear0, zacksEPSGrowthRate.industryFiscalYear1VsFiscalYear0) &&
        Objects.equals(this.industryFiscalYear2VsFiscalYear1, zacksEPSGrowthRate.industryFiscalYear2VsFiscalYear1) &&
        Objects.equals(this.industryLongTermGrowthMean, zacksEPSGrowthRate.industryLongTermGrowthMean) &&
        Objects.equals(this.industryFiscalYear1ForwardPriceToEarnings, zacksEPSGrowthRate.industryFiscalYear1ForwardPriceToEarnings) &&
        Objects.equals(this.sp500Last5YearActual, zacksEPSGrowthRate.sp500Last5YearActual) &&
        Objects.equals(this.sp500FiscalYear1VsFiscalYear0, zacksEPSGrowthRate.sp500FiscalYear1VsFiscalYear0) &&
        Objects.equals(this.sp500FiscalYear2VsFiscalYear1, zacksEPSGrowthRate.sp500FiscalYear2VsFiscalYear1) &&
        Objects.equals(this.sp500LongTermGrowth, zacksEPSGrowthRate.sp500LongTermGrowth) &&
        Objects.equals(this.sp500FiscalYear1PriceToEarnings, zacksEPSGrowthRate.sp500FiscalYear1PriceToEarnings) &&
        Objects.equals(this.company, zacksEPSGrowthRate.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, companyName, industryGroupNumber, industryGroupName, fiscalYear0, fiscalYear1, fiscalYear2, companyLast5YearActual, companyFiscalYear1VsFiscalYear0, companyFiscalYear2VsFiscalYear1, companyLongTermGrowthMean, companyFiscalYear1ForwardPriceToEarnings, industryLast5YearActual, industryFiscalYear1VsFiscalYear0, industryFiscalYear2VsFiscalYear1, industryLongTermGrowthMean, industryFiscalYear1ForwardPriceToEarnings, sp500Last5YearActual, sp500FiscalYear1VsFiscalYear0, sp500FiscalYear2VsFiscalYear1, sp500LongTermGrowth, sp500FiscalYear1PriceToEarnings, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksEPSGrowthRate {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    industryGroupNumber: ").append(toIndentedString(industryGroupNumber)).append("\n");
    sb.append("    industryGroupName: ").append(toIndentedString(industryGroupName)).append("\n");
    sb.append("    fiscalYear0: ").append(toIndentedString(fiscalYear0)).append("\n");
    sb.append("    fiscalYear1: ").append(toIndentedString(fiscalYear1)).append("\n");
    sb.append("    fiscalYear2: ").append(toIndentedString(fiscalYear2)).append("\n");
    sb.append("    companyLast5YearActual: ").append(toIndentedString(companyLast5YearActual)).append("\n");
    sb.append("    companyFiscalYear1VsFiscalYear0: ").append(toIndentedString(companyFiscalYear1VsFiscalYear0)).append("\n");
    sb.append("    companyFiscalYear2VsFiscalYear1: ").append(toIndentedString(companyFiscalYear2VsFiscalYear1)).append("\n");
    sb.append("    companyLongTermGrowthMean: ").append(toIndentedString(companyLongTermGrowthMean)).append("\n");
    sb.append("    companyFiscalYear1ForwardPriceToEarnings: ").append(toIndentedString(companyFiscalYear1ForwardPriceToEarnings)).append("\n");
    sb.append("    industryLast5YearActual: ").append(toIndentedString(industryLast5YearActual)).append("\n");
    sb.append("    industryFiscalYear1VsFiscalYear0: ").append(toIndentedString(industryFiscalYear1VsFiscalYear0)).append("\n");
    sb.append("    industryFiscalYear2VsFiscalYear1: ").append(toIndentedString(industryFiscalYear2VsFiscalYear1)).append("\n");
    sb.append("    industryLongTermGrowthMean: ").append(toIndentedString(industryLongTermGrowthMean)).append("\n");
    sb.append("    industryFiscalYear1ForwardPriceToEarnings: ").append(toIndentedString(industryFiscalYear1ForwardPriceToEarnings)).append("\n");
    sb.append("    sp500Last5YearActual: ").append(toIndentedString(sp500Last5YearActual)).append("\n");
    sb.append("    sp500FiscalYear1VsFiscalYear0: ").append(toIndentedString(sp500FiscalYear1VsFiscalYear0)).append("\n");
    sb.append("    sp500FiscalYear2VsFiscalYear1: ").append(toIndentedString(sp500FiscalYear2VsFiscalYear1)).append("\n");
    sb.append("    sp500LongTermGrowth: ").append(toIndentedString(sp500LongTermGrowth)).append("\n");
    sb.append("    sp500FiscalYear1PriceToEarnings: ").append(toIndentedString(sp500FiscalYear1PriceToEarnings)).append("\n");
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

