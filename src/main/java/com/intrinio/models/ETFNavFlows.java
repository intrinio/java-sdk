

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFNavFlow;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * ETFNavFlows
 */

public class ETFNavFlows {
  @SerializedName("as_of_date")
  private LocalDate asOfDate = null;

  @SerializedName("nav_return_daily")
  private BigDecimal navReturnDaily = null;

  @SerializedName("nav_return_one_month")
  private BigDecimal navReturnOneMonth = null;

  @SerializedName("nav_return_three_month")
  private BigDecimal navReturnThreeMonth = null;

  @SerializedName("nav_return_ytd")
  private BigDecimal navReturnYtd = null;

  @SerializedName("nav_return_one_year")
  private BigDecimal navReturnOneYear = null;

  @SerializedName("nav_return_1_year_prior")
  private BigDecimal navReturn1YearPrior = null;

  @SerializedName("nav_return_2_year_prior")
  private BigDecimal navReturn2YearPrior = null;

  @SerializedName("nav_return_3_year_prior")
  private BigDecimal navReturn3YearPrior = null;

  @SerializedName("nav_return_4_year_prior")
  private BigDecimal navReturn4YearPrior = null;

  @SerializedName("nav_return_5_year_prior")
  private BigDecimal navReturn5YearPrior = null;

  @SerializedName("nav_annualized_return_three_year")
  private BigDecimal navAnnualizedReturnThreeYear = null;

  @SerializedName("nav_annualized_return_five_year")
  private BigDecimal navAnnualizedReturnFiveYear = null;

  @SerializedName("nav_annualized_return_ten_year")
  private BigDecimal navAnnualizedReturnTenYear = null;

  @SerializedName("nav_annualized_return_inception")
  private BigDecimal navAnnualizedReturnInception = null;

  @SerializedName("nav_unadjusted")
  private BigDecimal navUnadjusted = null;

  @SerializedName("nav_split_adjusted")
  private BigDecimal navSplitAdjusted = null;

  @SerializedName("nav_split_dividend_adjusted")
  private BigDecimal navSplitDividendAdjusted = null;

  @SerializedName("net_flows_daily")
  private BigDecimal netFlowsDaily = null;

  @SerializedName("net_flows_one_month")
  private BigDecimal netFlowsOneMonth = null;

  @SerializedName("net_flows_three_month")
  private BigDecimal netFlowsThreeMonth = null;

  @SerializedName("net_flows_ytd")
  private BigDecimal netFlowsYtd = null;

  @SerializedName("net_flows_one_year")
  private BigDecimal netFlowsOneYear = null;

  @SerializedName("net_flows_three_year")
  private BigDecimal netFlowsThreeYear = null;

  @SerializedName("net_flows_five_year")
  private BigDecimal netFlowsFiveYear = null;

  @SerializedName("net_flows_ten_year")
  private BigDecimal netFlowsTenYear = null;

  @SerializedName("net_flows_1_year_prior")
  private BigDecimal netFlows1YearPrior = null;

  @SerializedName("net_flows_2_year_prior")
  private BigDecimal netFlows2YearPrior = null;

  @SerializedName("net_flows_3_year_prior")
  private BigDecimal netFlows3YearPrior = null;

  @SerializedName("net_flows_4_year_prior")
  private BigDecimal netFlows4YearPrior = null;

  @SerializedName("net_flows_5_year_prior")
  private BigDecimal netFlows5YearPrior = null;

  @SerializedName("net_flows_inception")
  private BigDecimal netFlowsInception = null;

  @SerializedName("share_outstanding_unadjusted")
  private BigDecimal shareOutstandingUnadjusted = null;

  @SerializedName("share_outstanding_split_adjusted")
  private BigDecimal shareOutstandingSplitAdjusted = null;

  @SerializedName("total_net_assets")
  private BigDecimal totalNetAssets = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public ETFNavFlows asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * The date of the NAV flows data
   * @return asOfDate
  **/
  @ApiModelProperty(value = "The date of the NAV flows data")
  public LocalDate getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }

  public ETFNavFlows navReturnDaily(BigDecimal navReturnDaily) {
    this.navReturnDaily = navReturnDaily;
    return this;
  }

   /**
   * Daily NAV return as a decimal (percentage)
   * @return navReturnDaily
  **/
  @ApiModelProperty(value = "Daily NAV return as a decimal (percentage)")
  public BigDecimal getNavReturnDaily() {
    return navReturnDaily;
  }

  public void setNavReturnDaily(BigDecimal navReturnDaily) {
    this.navReturnDaily = navReturnDaily;
  }

  public ETFNavFlows navReturnOneMonth(BigDecimal navReturnOneMonth) {
    this.navReturnOneMonth = navReturnOneMonth;
    return this;
  }

   /**
   * One month NAV return as a decimal (percentage)
   * @return navReturnOneMonth
  **/
  @ApiModelProperty(value = "One month NAV return as a decimal (percentage)")
  public BigDecimal getNavReturnOneMonth() {
    return navReturnOneMonth;
  }

  public void setNavReturnOneMonth(BigDecimal navReturnOneMonth) {
    this.navReturnOneMonth = navReturnOneMonth;
  }

  public ETFNavFlows navReturnThreeMonth(BigDecimal navReturnThreeMonth) {
    this.navReturnThreeMonth = navReturnThreeMonth;
    return this;
  }

   /**
   * Three month NAV return as a decimal (percentage)
   * @return navReturnThreeMonth
  **/
  @ApiModelProperty(value = "Three month NAV return as a decimal (percentage)")
  public BigDecimal getNavReturnThreeMonth() {
    return navReturnThreeMonth;
  }

  public void setNavReturnThreeMonth(BigDecimal navReturnThreeMonth) {
    this.navReturnThreeMonth = navReturnThreeMonth;
  }

  public ETFNavFlows navReturnYtd(BigDecimal navReturnYtd) {
    this.navReturnYtd = navReturnYtd;
    return this;
  }

   /**
   * Year-to-date NAV return as a decimal (percentage)
   * @return navReturnYtd
  **/
  @ApiModelProperty(value = "Year-to-date NAV return as a decimal (percentage)")
  public BigDecimal getNavReturnYtd() {
    return navReturnYtd;
  }

  public void setNavReturnYtd(BigDecimal navReturnYtd) {
    this.navReturnYtd = navReturnYtd;
  }

  public ETFNavFlows navReturnOneYear(BigDecimal navReturnOneYear) {
    this.navReturnOneYear = navReturnOneYear;
    return this;
  }

   /**
   * One year NAV return as a decimal (percentage)
   * @return navReturnOneYear
  **/
  @ApiModelProperty(value = "One year NAV return as a decimal (percentage)")
  public BigDecimal getNavReturnOneYear() {
    return navReturnOneYear;
  }

  public void setNavReturnOneYear(BigDecimal navReturnOneYear) {
    this.navReturnOneYear = navReturnOneYear;
  }

  public ETFNavFlows navReturn1YearPrior(BigDecimal navReturn1YearPrior) {
    this.navReturn1YearPrior = navReturn1YearPrior;
    return this;
  }

   /**
   * NAV return 1 year prior as a decimal (percentage)
   * @return navReturn1YearPrior
  **/
  @ApiModelProperty(value = "NAV return 1 year prior as a decimal (percentage)")
  public BigDecimal getNavReturn1YearPrior() {
    return navReturn1YearPrior;
  }

  public void setNavReturn1YearPrior(BigDecimal navReturn1YearPrior) {
    this.navReturn1YearPrior = navReturn1YearPrior;
  }

  public ETFNavFlows navReturn2YearPrior(BigDecimal navReturn2YearPrior) {
    this.navReturn2YearPrior = navReturn2YearPrior;
    return this;
  }

   /**
   * NAV return 2 years prior as a decimal (percentage)
   * @return navReturn2YearPrior
  **/
  @ApiModelProperty(value = "NAV return 2 years prior as a decimal (percentage)")
  public BigDecimal getNavReturn2YearPrior() {
    return navReturn2YearPrior;
  }

  public void setNavReturn2YearPrior(BigDecimal navReturn2YearPrior) {
    this.navReturn2YearPrior = navReturn2YearPrior;
  }

  public ETFNavFlows navReturn3YearPrior(BigDecimal navReturn3YearPrior) {
    this.navReturn3YearPrior = navReturn3YearPrior;
    return this;
  }

   /**
   * NAV return 3 years prior as a decimal (percentage)
   * @return navReturn3YearPrior
  **/
  @ApiModelProperty(value = "NAV return 3 years prior as a decimal (percentage)")
  public BigDecimal getNavReturn3YearPrior() {
    return navReturn3YearPrior;
  }

  public void setNavReturn3YearPrior(BigDecimal navReturn3YearPrior) {
    this.navReturn3YearPrior = navReturn3YearPrior;
  }

  public ETFNavFlows navReturn4YearPrior(BigDecimal navReturn4YearPrior) {
    this.navReturn4YearPrior = navReturn4YearPrior;
    return this;
  }

   /**
   * NAV return 4 years prior as a decimal (percentage)
   * @return navReturn4YearPrior
  **/
  @ApiModelProperty(value = "NAV return 4 years prior as a decimal (percentage)")
  public BigDecimal getNavReturn4YearPrior() {
    return navReturn4YearPrior;
  }

  public void setNavReturn4YearPrior(BigDecimal navReturn4YearPrior) {
    this.navReturn4YearPrior = navReturn4YearPrior;
  }

  public ETFNavFlows navReturn5YearPrior(BigDecimal navReturn5YearPrior) {
    this.navReturn5YearPrior = navReturn5YearPrior;
    return this;
  }

   /**
   * NAV return 5 years prior as a decimal (percentage)
   * @return navReturn5YearPrior
  **/
  @ApiModelProperty(value = "NAV return 5 years prior as a decimal (percentage)")
  public BigDecimal getNavReturn5YearPrior() {
    return navReturn5YearPrior;
  }

  public void setNavReturn5YearPrior(BigDecimal navReturn5YearPrior) {
    this.navReturn5YearPrior = navReturn5YearPrior;
  }

  public ETFNavFlows navAnnualizedReturnThreeYear(BigDecimal navAnnualizedReturnThreeYear) {
    this.navAnnualizedReturnThreeYear = navAnnualizedReturnThreeYear;
    return this;
  }

   /**
   * Three year annualized NAV return as a decimal (percentage)
   * @return navAnnualizedReturnThreeYear
  **/
  @ApiModelProperty(value = "Three year annualized NAV return as a decimal (percentage)")
  public BigDecimal getNavAnnualizedReturnThreeYear() {
    return navAnnualizedReturnThreeYear;
  }

  public void setNavAnnualizedReturnThreeYear(BigDecimal navAnnualizedReturnThreeYear) {
    this.navAnnualizedReturnThreeYear = navAnnualizedReturnThreeYear;
  }

  public ETFNavFlows navAnnualizedReturnFiveYear(BigDecimal navAnnualizedReturnFiveYear) {
    this.navAnnualizedReturnFiveYear = navAnnualizedReturnFiveYear;
    return this;
  }

   /**
   * Five year annualized NAV return as a decimal (percentage)
   * @return navAnnualizedReturnFiveYear
  **/
  @ApiModelProperty(value = "Five year annualized NAV return as a decimal (percentage)")
  public BigDecimal getNavAnnualizedReturnFiveYear() {
    return navAnnualizedReturnFiveYear;
  }

  public void setNavAnnualizedReturnFiveYear(BigDecimal navAnnualizedReturnFiveYear) {
    this.navAnnualizedReturnFiveYear = navAnnualizedReturnFiveYear;
  }

  public ETFNavFlows navAnnualizedReturnTenYear(BigDecimal navAnnualizedReturnTenYear) {
    this.navAnnualizedReturnTenYear = navAnnualizedReturnTenYear;
    return this;
  }

   /**
   * Ten year annualized NAV return as a decimal (percentage)
   * @return navAnnualizedReturnTenYear
  **/
  @ApiModelProperty(value = "Ten year annualized NAV return as a decimal (percentage)")
  public BigDecimal getNavAnnualizedReturnTenYear() {
    return navAnnualizedReturnTenYear;
  }

  public void setNavAnnualizedReturnTenYear(BigDecimal navAnnualizedReturnTenYear) {
    this.navAnnualizedReturnTenYear = navAnnualizedReturnTenYear;
  }

  public ETFNavFlows navAnnualizedReturnInception(BigDecimal navAnnualizedReturnInception) {
    this.navAnnualizedReturnInception = navAnnualizedReturnInception;
    return this;
  }

   /**
   * Annualized NAV return since inception as a decimal (percentage)
   * @return navAnnualizedReturnInception
  **/
  @ApiModelProperty(value = "Annualized NAV return since inception as a decimal (percentage)")
  public BigDecimal getNavAnnualizedReturnInception() {
    return navAnnualizedReturnInception;
  }

  public void setNavAnnualizedReturnInception(BigDecimal navAnnualizedReturnInception) {
    this.navAnnualizedReturnInception = navAnnualizedReturnInception;
  }

  public ETFNavFlows navUnadjusted(BigDecimal navUnadjusted) {
    this.navUnadjusted = navUnadjusted;
    return this;
  }

   /**
   * Net asset value unadjusted for splits or dividends
   * @return navUnadjusted
  **/
  @ApiModelProperty(value = "Net asset value unadjusted for splits or dividends")
  public BigDecimal getNavUnadjusted() {
    return navUnadjusted;
  }

  public void setNavUnadjusted(BigDecimal navUnadjusted) {
    this.navUnadjusted = navUnadjusted;
  }

  public ETFNavFlows navSplitAdjusted(BigDecimal navSplitAdjusted) {
    this.navSplitAdjusted = navSplitAdjusted;
    return this;
  }

   /**
   * Net asset value adjusted for splits only
   * @return navSplitAdjusted
  **/
  @ApiModelProperty(value = "Net asset value adjusted for splits only")
  public BigDecimal getNavSplitAdjusted() {
    return navSplitAdjusted;
  }

  public void setNavSplitAdjusted(BigDecimal navSplitAdjusted) {
    this.navSplitAdjusted = navSplitAdjusted;
  }

  public ETFNavFlows navSplitDividendAdjusted(BigDecimal navSplitDividendAdjusted) {
    this.navSplitDividendAdjusted = navSplitDividendAdjusted;
    return this;
  }

   /**
   * Net asset value adjusted for both splits and dividends
   * @return navSplitDividendAdjusted
  **/
  @ApiModelProperty(value = "Net asset value adjusted for both splits and dividends")
  public BigDecimal getNavSplitDividendAdjusted() {
    return navSplitDividendAdjusted;
  }

  public void setNavSplitDividendAdjusted(BigDecimal navSplitDividendAdjusted) {
    this.navSplitDividendAdjusted = navSplitDividendAdjusted;
  }

  public ETFNavFlows netFlowsDaily(BigDecimal netFlowsDaily) {
    this.netFlowsDaily = netFlowsDaily;
    return this;
  }

   /**
   * Daily net flows in dollars
   * @return netFlowsDaily
  **/
  @ApiModelProperty(value = "Daily net flows in dollars")
  public BigDecimal getNetFlowsDaily() {
    return netFlowsDaily;
  }

  public void setNetFlowsDaily(BigDecimal netFlowsDaily) {
    this.netFlowsDaily = netFlowsDaily;
  }

  public ETFNavFlows netFlowsOneMonth(BigDecimal netFlowsOneMonth) {
    this.netFlowsOneMonth = netFlowsOneMonth;
    return this;
  }

   /**
   * One month net flows in dollars
   * @return netFlowsOneMonth
  **/
  @ApiModelProperty(value = "One month net flows in dollars")
  public BigDecimal getNetFlowsOneMonth() {
    return netFlowsOneMonth;
  }

  public void setNetFlowsOneMonth(BigDecimal netFlowsOneMonth) {
    this.netFlowsOneMonth = netFlowsOneMonth;
  }

  public ETFNavFlows netFlowsThreeMonth(BigDecimal netFlowsThreeMonth) {
    this.netFlowsThreeMonth = netFlowsThreeMonth;
    return this;
  }

   /**
   * Three month net flows in dollars
   * @return netFlowsThreeMonth
  **/
  @ApiModelProperty(value = "Three month net flows in dollars")
  public BigDecimal getNetFlowsThreeMonth() {
    return netFlowsThreeMonth;
  }

  public void setNetFlowsThreeMonth(BigDecimal netFlowsThreeMonth) {
    this.netFlowsThreeMonth = netFlowsThreeMonth;
  }

  public ETFNavFlows netFlowsYtd(BigDecimal netFlowsYtd) {
    this.netFlowsYtd = netFlowsYtd;
    return this;
  }

   /**
   * Year-to-date net flows in dollars
   * @return netFlowsYtd
  **/
  @ApiModelProperty(value = "Year-to-date net flows in dollars")
  public BigDecimal getNetFlowsYtd() {
    return netFlowsYtd;
  }

  public void setNetFlowsYtd(BigDecimal netFlowsYtd) {
    this.netFlowsYtd = netFlowsYtd;
  }

  public ETFNavFlows netFlowsOneYear(BigDecimal netFlowsOneYear) {
    this.netFlowsOneYear = netFlowsOneYear;
    return this;
  }

   /**
   * One year net flows in dollars
   * @return netFlowsOneYear
  **/
  @ApiModelProperty(value = "One year net flows in dollars")
  public BigDecimal getNetFlowsOneYear() {
    return netFlowsOneYear;
  }

  public void setNetFlowsOneYear(BigDecimal netFlowsOneYear) {
    this.netFlowsOneYear = netFlowsOneYear;
  }

  public ETFNavFlows netFlowsThreeYear(BigDecimal netFlowsThreeYear) {
    this.netFlowsThreeYear = netFlowsThreeYear;
    return this;
  }

   /**
   * Three year net flows in dollars
   * @return netFlowsThreeYear
  **/
  @ApiModelProperty(value = "Three year net flows in dollars")
  public BigDecimal getNetFlowsThreeYear() {
    return netFlowsThreeYear;
  }

  public void setNetFlowsThreeYear(BigDecimal netFlowsThreeYear) {
    this.netFlowsThreeYear = netFlowsThreeYear;
  }

  public ETFNavFlows netFlowsFiveYear(BigDecimal netFlowsFiveYear) {
    this.netFlowsFiveYear = netFlowsFiveYear;
    return this;
  }

   /**
   * Five year net flows in dollars
   * @return netFlowsFiveYear
  **/
  @ApiModelProperty(value = "Five year net flows in dollars")
  public BigDecimal getNetFlowsFiveYear() {
    return netFlowsFiveYear;
  }

  public void setNetFlowsFiveYear(BigDecimal netFlowsFiveYear) {
    this.netFlowsFiveYear = netFlowsFiveYear;
  }

  public ETFNavFlows netFlowsTenYear(BigDecimal netFlowsTenYear) {
    this.netFlowsTenYear = netFlowsTenYear;
    return this;
  }

   /**
   * Ten year net flows in dollars
   * @return netFlowsTenYear
  **/
  @ApiModelProperty(value = "Ten year net flows in dollars")
  public BigDecimal getNetFlowsTenYear() {
    return netFlowsTenYear;
  }

  public void setNetFlowsTenYear(BigDecimal netFlowsTenYear) {
    this.netFlowsTenYear = netFlowsTenYear;
  }

  public ETFNavFlows netFlows1YearPrior(BigDecimal netFlows1YearPrior) {
    this.netFlows1YearPrior = netFlows1YearPrior;
    return this;
  }

   /**
   * Net flows 1 year prior in dollars
   * @return netFlows1YearPrior
  **/
  @ApiModelProperty(value = "Net flows 1 year prior in dollars")
  public BigDecimal getNetFlows1YearPrior() {
    return netFlows1YearPrior;
  }

  public void setNetFlows1YearPrior(BigDecimal netFlows1YearPrior) {
    this.netFlows1YearPrior = netFlows1YearPrior;
  }

  public ETFNavFlows netFlows2YearPrior(BigDecimal netFlows2YearPrior) {
    this.netFlows2YearPrior = netFlows2YearPrior;
    return this;
  }

   /**
   * Net flows 2 years prior in dollars
   * @return netFlows2YearPrior
  **/
  @ApiModelProperty(value = "Net flows 2 years prior in dollars")
  public BigDecimal getNetFlows2YearPrior() {
    return netFlows2YearPrior;
  }

  public void setNetFlows2YearPrior(BigDecimal netFlows2YearPrior) {
    this.netFlows2YearPrior = netFlows2YearPrior;
  }

  public ETFNavFlows netFlows3YearPrior(BigDecimal netFlows3YearPrior) {
    this.netFlows3YearPrior = netFlows3YearPrior;
    return this;
  }

   /**
   * Net flows 3 years prior in dollars
   * @return netFlows3YearPrior
  **/
  @ApiModelProperty(value = "Net flows 3 years prior in dollars")
  public BigDecimal getNetFlows3YearPrior() {
    return netFlows3YearPrior;
  }

  public void setNetFlows3YearPrior(BigDecimal netFlows3YearPrior) {
    this.netFlows3YearPrior = netFlows3YearPrior;
  }

  public ETFNavFlows netFlows4YearPrior(BigDecimal netFlows4YearPrior) {
    this.netFlows4YearPrior = netFlows4YearPrior;
    return this;
  }

   /**
   * Net flows 4 years prior in dollars
   * @return netFlows4YearPrior
  **/
  @ApiModelProperty(value = "Net flows 4 years prior in dollars")
  public BigDecimal getNetFlows4YearPrior() {
    return netFlows4YearPrior;
  }

  public void setNetFlows4YearPrior(BigDecimal netFlows4YearPrior) {
    this.netFlows4YearPrior = netFlows4YearPrior;
  }

  public ETFNavFlows netFlows5YearPrior(BigDecimal netFlows5YearPrior) {
    this.netFlows5YearPrior = netFlows5YearPrior;
    return this;
  }

   /**
   * Net flows 5 years prior in dollars
   * @return netFlows5YearPrior
  **/
  @ApiModelProperty(value = "Net flows 5 years prior in dollars")
  public BigDecimal getNetFlows5YearPrior() {
    return netFlows5YearPrior;
  }

  public void setNetFlows5YearPrior(BigDecimal netFlows5YearPrior) {
    this.netFlows5YearPrior = netFlows5YearPrior;
  }

  public ETFNavFlows netFlowsInception(BigDecimal netFlowsInception) {
    this.netFlowsInception = netFlowsInception;
    return this;
  }

   /**
   * Net flows since inception in dollars
   * @return netFlowsInception
  **/
  @ApiModelProperty(value = "Net flows since inception in dollars")
  public BigDecimal getNetFlowsInception() {
    return netFlowsInception;
  }

  public void setNetFlowsInception(BigDecimal netFlowsInception) {
    this.netFlowsInception = netFlowsInception;
  }

  public ETFNavFlows shareOutstandingUnadjusted(BigDecimal shareOutstandingUnadjusted) {
    this.shareOutstandingUnadjusted = shareOutstandingUnadjusted;
    return this;
  }

   /**
   * Shares outstanding unadjusted for splits
   * @return shareOutstandingUnadjusted
  **/
  @ApiModelProperty(value = "Shares outstanding unadjusted for splits")
  public BigDecimal getShareOutstandingUnadjusted() {
    return shareOutstandingUnadjusted;
  }

  public void setShareOutstandingUnadjusted(BigDecimal shareOutstandingUnadjusted) {
    this.shareOutstandingUnadjusted = shareOutstandingUnadjusted;
  }

  public ETFNavFlows shareOutstandingSplitAdjusted(BigDecimal shareOutstandingSplitAdjusted) {
    this.shareOutstandingSplitAdjusted = shareOutstandingSplitAdjusted;
    return this;
  }

   /**
   * Shares outstanding adjusted for splits
   * @return shareOutstandingSplitAdjusted
  **/
  @ApiModelProperty(value = "Shares outstanding adjusted for splits")
  public BigDecimal getShareOutstandingSplitAdjusted() {
    return shareOutstandingSplitAdjusted;
  }

  public void setShareOutstandingSplitAdjusted(BigDecimal shareOutstandingSplitAdjusted) {
    this.shareOutstandingSplitAdjusted = shareOutstandingSplitAdjusted;
  }

  public ETFNavFlows totalNetAssets(BigDecimal totalNetAssets) {
    this.totalNetAssets = totalNetAssets;
    return this;
  }

   /**
   * Total net assets in dollars
   * @return totalNetAssets
  **/
  @ApiModelProperty(value = "Total net assets in dollars")
  public BigDecimal getTotalNetAssets() {
    return totalNetAssets;
  }

  public void setTotalNetAssets(BigDecimal totalNetAssets) {
    this.totalNetAssets = totalNetAssets;
  }

  public ETFNavFlows etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * A brief summary of the ETF to which these nav flows refer
   * @return etf
  **/
  @ApiModelProperty(value = "A brief summary of the ETF to which these nav flows refer")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }

  public ETFNavFlows messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ETFNavFlows addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Any messages, warnings, or additional information about the data
   * @return messages
  **/
  @ApiModelProperty(value = "Any messages, warnings, or additional information about the data")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFNavFlows etFNavFlows = (ETFNavFlows) o;
    return Objects.equals(this.asOfDate, etFNavFlows.asOfDate) &&
        Objects.equals(this.navReturnDaily, etFNavFlows.navReturnDaily) &&
        Objects.equals(this.navReturnOneMonth, etFNavFlows.navReturnOneMonth) &&
        Objects.equals(this.navReturnThreeMonth, etFNavFlows.navReturnThreeMonth) &&
        Objects.equals(this.navReturnYtd, etFNavFlows.navReturnYtd) &&
        Objects.equals(this.navReturnOneYear, etFNavFlows.navReturnOneYear) &&
        Objects.equals(this.navReturn1YearPrior, etFNavFlows.navReturn1YearPrior) &&
        Objects.equals(this.navReturn2YearPrior, etFNavFlows.navReturn2YearPrior) &&
        Objects.equals(this.navReturn3YearPrior, etFNavFlows.navReturn3YearPrior) &&
        Objects.equals(this.navReturn4YearPrior, etFNavFlows.navReturn4YearPrior) &&
        Objects.equals(this.navReturn5YearPrior, etFNavFlows.navReturn5YearPrior) &&
        Objects.equals(this.navAnnualizedReturnThreeYear, etFNavFlows.navAnnualizedReturnThreeYear) &&
        Objects.equals(this.navAnnualizedReturnFiveYear, etFNavFlows.navAnnualizedReturnFiveYear) &&
        Objects.equals(this.navAnnualizedReturnTenYear, etFNavFlows.navAnnualizedReturnTenYear) &&
        Objects.equals(this.navAnnualizedReturnInception, etFNavFlows.navAnnualizedReturnInception) &&
        Objects.equals(this.navUnadjusted, etFNavFlows.navUnadjusted) &&
        Objects.equals(this.navSplitAdjusted, etFNavFlows.navSplitAdjusted) &&
        Objects.equals(this.navSplitDividendAdjusted, etFNavFlows.navSplitDividendAdjusted) &&
        Objects.equals(this.netFlowsDaily, etFNavFlows.netFlowsDaily) &&
        Objects.equals(this.netFlowsOneMonth, etFNavFlows.netFlowsOneMonth) &&
        Objects.equals(this.netFlowsThreeMonth, etFNavFlows.netFlowsThreeMonth) &&
        Objects.equals(this.netFlowsYtd, etFNavFlows.netFlowsYtd) &&
        Objects.equals(this.netFlowsOneYear, etFNavFlows.netFlowsOneYear) &&
        Objects.equals(this.netFlowsThreeYear, etFNavFlows.netFlowsThreeYear) &&
        Objects.equals(this.netFlowsFiveYear, etFNavFlows.netFlowsFiveYear) &&
        Objects.equals(this.netFlowsTenYear, etFNavFlows.netFlowsTenYear) &&
        Objects.equals(this.netFlows1YearPrior, etFNavFlows.netFlows1YearPrior) &&
        Objects.equals(this.netFlows2YearPrior, etFNavFlows.netFlows2YearPrior) &&
        Objects.equals(this.netFlows3YearPrior, etFNavFlows.netFlows3YearPrior) &&
        Objects.equals(this.netFlows4YearPrior, etFNavFlows.netFlows4YearPrior) &&
        Objects.equals(this.netFlows5YearPrior, etFNavFlows.netFlows5YearPrior) &&
        Objects.equals(this.netFlowsInception, etFNavFlows.netFlowsInception) &&
        Objects.equals(this.shareOutstandingUnadjusted, etFNavFlows.shareOutstandingUnadjusted) &&
        Objects.equals(this.shareOutstandingSplitAdjusted, etFNavFlows.shareOutstandingSplitAdjusted) &&
        Objects.equals(this.totalNetAssets, etFNavFlows.totalNetAssets) &&
        Objects.equals(this.etf, etFNavFlows.etf) &&
        Objects.equals(this.messages, etFNavFlows.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, navReturnDaily, navReturnOneMonth, navReturnThreeMonth, navReturnYtd, navReturnOneYear, navReturn1YearPrior, navReturn2YearPrior, navReturn3YearPrior, navReturn4YearPrior, navReturn5YearPrior, navAnnualizedReturnThreeYear, navAnnualizedReturnFiveYear, navAnnualizedReturnTenYear, navAnnualizedReturnInception, navUnadjusted, navSplitAdjusted, navSplitDividendAdjusted, netFlowsDaily, netFlowsOneMonth, netFlowsThreeMonth, netFlowsYtd, netFlowsOneYear, netFlowsThreeYear, netFlowsFiveYear, netFlowsTenYear, netFlows1YearPrior, netFlows2YearPrior, netFlows3YearPrior, netFlows4YearPrior, netFlows5YearPrior, netFlowsInception, shareOutstandingUnadjusted, shareOutstandingSplitAdjusted, totalNetAssets, etf, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFNavFlows {\n");
    
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    navReturnDaily: ").append(toIndentedString(navReturnDaily)).append("\n");
    sb.append("    navReturnOneMonth: ").append(toIndentedString(navReturnOneMonth)).append("\n");
    sb.append("    navReturnThreeMonth: ").append(toIndentedString(navReturnThreeMonth)).append("\n");
    sb.append("    navReturnYtd: ").append(toIndentedString(navReturnYtd)).append("\n");
    sb.append("    navReturnOneYear: ").append(toIndentedString(navReturnOneYear)).append("\n");
    sb.append("    navReturn1YearPrior: ").append(toIndentedString(navReturn1YearPrior)).append("\n");
    sb.append("    navReturn2YearPrior: ").append(toIndentedString(navReturn2YearPrior)).append("\n");
    sb.append("    navReturn3YearPrior: ").append(toIndentedString(navReturn3YearPrior)).append("\n");
    sb.append("    navReturn4YearPrior: ").append(toIndentedString(navReturn4YearPrior)).append("\n");
    sb.append("    navReturn5YearPrior: ").append(toIndentedString(navReturn5YearPrior)).append("\n");
    sb.append("    navAnnualizedReturnThreeYear: ").append(toIndentedString(navAnnualizedReturnThreeYear)).append("\n");
    sb.append("    navAnnualizedReturnFiveYear: ").append(toIndentedString(navAnnualizedReturnFiveYear)).append("\n");
    sb.append("    navAnnualizedReturnTenYear: ").append(toIndentedString(navAnnualizedReturnTenYear)).append("\n");
    sb.append("    navAnnualizedReturnInception: ").append(toIndentedString(navAnnualizedReturnInception)).append("\n");
    sb.append("    navUnadjusted: ").append(toIndentedString(navUnadjusted)).append("\n");
    sb.append("    navSplitAdjusted: ").append(toIndentedString(navSplitAdjusted)).append("\n");
    sb.append("    navSplitDividendAdjusted: ").append(toIndentedString(navSplitDividendAdjusted)).append("\n");
    sb.append("    netFlowsDaily: ").append(toIndentedString(netFlowsDaily)).append("\n");
    sb.append("    netFlowsOneMonth: ").append(toIndentedString(netFlowsOneMonth)).append("\n");
    sb.append("    netFlowsThreeMonth: ").append(toIndentedString(netFlowsThreeMonth)).append("\n");
    sb.append("    netFlowsYtd: ").append(toIndentedString(netFlowsYtd)).append("\n");
    sb.append("    netFlowsOneYear: ").append(toIndentedString(netFlowsOneYear)).append("\n");
    sb.append("    netFlowsThreeYear: ").append(toIndentedString(netFlowsThreeYear)).append("\n");
    sb.append("    netFlowsFiveYear: ").append(toIndentedString(netFlowsFiveYear)).append("\n");
    sb.append("    netFlowsTenYear: ").append(toIndentedString(netFlowsTenYear)).append("\n");
    sb.append("    netFlows1YearPrior: ").append(toIndentedString(netFlows1YearPrior)).append("\n");
    sb.append("    netFlows2YearPrior: ").append(toIndentedString(netFlows2YearPrior)).append("\n");
    sb.append("    netFlows3YearPrior: ").append(toIndentedString(netFlows3YearPrior)).append("\n");
    sb.append("    netFlows4YearPrior: ").append(toIndentedString(netFlows4YearPrior)).append("\n");
    sb.append("    netFlows5YearPrior: ").append(toIndentedString(netFlows5YearPrior)).append("\n");
    sb.append("    netFlowsInception: ").append(toIndentedString(netFlowsInception)).append("\n");
    sb.append("    shareOutstandingUnadjusted: ").append(toIndentedString(shareOutstandingUnadjusted)).append("\n");
    sb.append("    shareOutstandingSplitAdjusted: ").append(toIndentedString(shareOutstandingSplitAdjusted)).append("\n");
    sb.append("    totalNetAssets: ").append(toIndentedString(totalNetAssets)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

