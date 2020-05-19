

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Provides analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low
 */
@ApiModel(description = "Provides analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low")

public class ETFAnalytics {
  @SerializedName("fifty_two_week_high")
  private BigDecimal fiftyTwoWeekHigh = null;

  @SerializedName("fifty_two_week_low")
  private BigDecimal fiftyTwoWeekLow = null;

  @SerializedName("volume_traded")
  private BigDecimal volumeTraded = null;

  @SerializedName("average_daily_volume_one_month")
  private BigDecimal averageDailyVolumeOneMonth = null;

  @SerializedName("average_daily_volume_three_month")
  private BigDecimal averageDailyVolumeThreeMonth = null;

  @SerializedName("average_daily_volume_six_month")
  private BigDecimal averageDailyVolumeSixMonth = null;

  @SerializedName("market_cap")
  private BigDecimal marketCap = null;

  @SerializedName("shares_outstanding")
  private BigDecimal sharesOutstanding = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  public ETFAnalytics fiftyTwoWeekHigh(BigDecimal fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    return this;
  }

   /**
   * Highest trading price for the security in the preceding 52 weeks
   * @return fiftyTwoWeekHigh
  **/
  @ApiModelProperty(value = "Highest trading price for the security in the preceding 52 weeks")
  public BigDecimal getFiftyTwoWeekHigh() {
    return fiftyTwoWeekHigh;
  }

  public void setFiftyTwoWeekHigh(BigDecimal fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
  }

  public ETFAnalytics fiftyTwoWeekLow(BigDecimal fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    return this;
  }

   /**
   * Lowest trading price for the security in the preceding 52 weeks
   * @return fiftyTwoWeekLow
  **/
  @ApiModelProperty(value = "Lowest trading price for the security in the preceding 52 weeks")
  public BigDecimal getFiftyTwoWeekLow() {
    return fiftyTwoWeekLow;
  }

  public void setFiftyTwoWeekLow(BigDecimal fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
  }

  public ETFAnalytics volumeTraded(BigDecimal volumeTraded) {
    this.volumeTraded = volumeTraded;
    return this;
  }

   /**
   * The total quantity of shares traded on the latest trading day
   * @return volumeTraded
  **/
  @ApiModelProperty(value = "The total quantity of shares traded on the latest trading day")
  public BigDecimal getVolumeTraded() {
    return volumeTraded;
  }

  public void setVolumeTraded(BigDecimal volumeTraded) {
    this.volumeTraded = volumeTraded;
  }

  public ETFAnalytics averageDailyVolumeOneMonth(BigDecimal averageDailyVolumeOneMonth) {
    this.averageDailyVolumeOneMonth = averageDailyVolumeOneMonth;
    return this;
  }

   /**
   * The average quantity of shares traded per day for the last month
   * @return averageDailyVolumeOneMonth
  **/
  @ApiModelProperty(value = "The average quantity of shares traded per day for the last month")
  public BigDecimal getAverageDailyVolumeOneMonth() {
    return averageDailyVolumeOneMonth;
  }

  public void setAverageDailyVolumeOneMonth(BigDecimal averageDailyVolumeOneMonth) {
    this.averageDailyVolumeOneMonth = averageDailyVolumeOneMonth;
  }

  public ETFAnalytics averageDailyVolumeThreeMonth(BigDecimal averageDailyVolumeThreeMonth) {
    this.averageDailyVolumeThreeMonth = averageDailyVolumeThreeMonth;
    return this;
  }

   /**
   * The average quantity of shares traded per day for the last three months
   * @return averageDailyVolumeThreeMonth
  **/
  @ApiModelProperty(value = "The average quantity of shares traded per day for the last three months")
  public BigDecimal getAverageDailyVolumeThreeMonth() {
    return averageDailyVolumeThreeMonth;
  }

  public void setAverageDailyVolumeThreeMonth(BigDecimal averageDailyVolumeThreeMonth) {
    this.averageDailyVolumeThreeMonth = averageDailyVolumeThreeMonth;
  }

  public ETFAnalytics averageDailyVolumeSixMonth(BigDecimal averageDailyVolumeSixMonth) {
    this.averageDailyVolumeSixMonth = averageDailyVolumeSixMonth;
    return this;
  }

   /**
   * The average quantity of shares traded per day for the last six months
   * @return averageDailyVolumeSixMonth
  **/
  @ApiModelProperty(value = "The average quantity of shares traded per day for the last six months")
  public BigDecimal getAverageDailyVolumeSixMonth() {
    return averageDailyVolumeSixMonth;
  }

  public void setAverageDailyVolumeSixMonth(BigDecimal averageDailyVolumeSixMonth) {
    this.averageDailyVolumeSixMonth = averageDailyVolumeSixMonth;
  }

  public ETFAnalytics marketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
    return this;
  }

   /**
   * The market capitalization for the Exchange Traded Fund (ETF)
   * @return marketCap
  **/
  @ApiModelProperty(value = "The market capitalization for the Exchange Traded Fund (ETF)")
  public BigDecimal getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(BigDecimal marketCap) {
    this.marketCap = marketCap;
  }

  public ETFAnalytics sharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

   /**
   * The number of shares outstanding for the Exchange Traded Fund (ETF)
   * @return sharesOutstanding
  **/
  @ApiModelProperty(value = "The number of shares outstanding for the Exchange Traded Fund (ETF)")
  public BigDecimal getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public ETFAnalytics etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * Get etf
   * @return etf
  **/
  @ApiModelProperty(value = "")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFAnalytics etFAnalytics = (ETFAnalytics) o;
    return Objects.equals(this.fiftyTwoWeekHigh, etFAnalytics.fiftyTwoWeekHigh) &&
        Objects.equals(this.fiftyTwoWeekLow, etFAnalytics.fiftyTwoWeekLow) &&
        Objects.equals(this.volumeTraded, etFAnalytics.volumeTraded) &&
        Objects.equals(this.averageDailyVolumeOneMonth, etFAnalytics.averageDailyVolumeOneMonth) &&
        Objects.equals(this.averageDailyVolumeThreeMonth, etFAnalytics.averageDailyVolumeThreeMonth) &&
        Objects.equals(this.averageDailyVolumeSixMonth, etFAnalytics.averageDailyVolumeSixMonth) &&
        Objects.equals(this.marketCap, etFAnalytics.marketCap) &&
        Objects.equals(this.sharesOutstanding, etFAnalytics.sharesOutstanding) &&
        Objects.equals(this.etf, etFAnalytics.etf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiftyTwoWeekHigh, fiftyTwoWeekLow, volumeTraded, averageDailyVolumeOneMonth, averageDailyVolumeThreeMonth, averageDailyVolumeSixMonth, marketCap, sharesOutstanding, etf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFAnalytics {\n");
    
    sb.append("    fiftyTwoWeekHigh: ").append(toIndentedString(fiftyTwoWeekHigh)).append("\n");
    sb.append("    fiftyTwoWeekLow: ").append(toIndentedString(fiftyTwoWeekLow)).append("\n");
    sb.append("    volumeTraded: ").append(toIndentedString(volumeTraded)).append("\n");
    sb.append("    averageDailyVolumeOneMonth: ").append(toIndentedString(averageDailyVolumeOneMonth)).append("\n");
    sb.append("    averageDailyVolumeThreeMonth: ").append(toIndentedString(averageDailyVolumeThreeMonth)).append("\n");
    sb.append("    averageDailyVolumeSixMonth: ").append(toIndentedString(averageDailyVolumeSixMonth)).append("\n");
    sb.append("    marketCap: ").append(toIndentedString(marketCap)).append("\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
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

