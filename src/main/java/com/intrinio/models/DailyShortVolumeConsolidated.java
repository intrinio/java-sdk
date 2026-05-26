

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Consolidated daily short volume data for a security across all FINRA reporting facilities. This provides a complete market-wide view of off-exchange short selling activity by aggregating data from all market centers and third-party reporting facilities.  The short volume ratio is recalculated on the aggregated totals, providing an accurate representation of the proportion of short selling relative to total trading volume across the entire off-exchange market. 
 */
@ApiModel(description = "Consolidated daily short volume data for a security across all FINRA reporting facilities. This provides a complete market-wide view of off-exchange short selling activity by aggregating data from all market centers and third-party reporting facilities.  The short volume ratio is recalculated on the aggregated totals, providing an accurate representation of the proportion of short selling relative to total trading volume across the entire off-exchange market. ")

public class DailyShortVolumeConsolidated {
  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("trade_date")
  private LocalDate tradeDate = null;

  @SerializedName("total_volume")
  private Integer totalVolume = null;

  @SerializedName("short_volume")
  private Integer shortVolume = null;

  @SerializedName("short_exempt_volume")
  private Integer shortExemptVolume = null;

  @SerializedName("short_volume_ratio")
  private Double shortVolumeRatio = null;

  @SerializedName("sources")
  private List<String> sources = null;

  public DailyShortVolumeConsolidated securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The unique identifier of the security.
   * @return securityId
  **/
  @ApiModelProperty(value = "The unique identifier of the security.")
  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public DailyShortVolumeConsolidated symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The ticker symbol of the security.
   * @return symbol
  **/
  @ApiModelProperty(value = "The ticker symbol of the security.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public DailyShortVolumeConsolidated tradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

   /**
   * The date of the reported short volume data in YYYY-MM-DD format.
   * @return tradeDate
  **/
  @ApiModelProperty(value = "The date of the reported short volume data in YYYY-MM-DD format.")
  public LocalDate getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(LocalDate tradeDate) {
    this.tradeDate = tradeDate;
  }

  public DailyShortVolumeConsolidated totalVolume(Integer totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * The aggregated total volume of shares traded across all FINRA reporting facilities combined. Represents the total off-exchange trading volume for the security on this date.
   * @return totalVolume
  **/
  @ApiModelProperty(value = "The aggregated total volume of shares traded across all FINRA reporting facilities combined. Represents the total off-exchange trading volume for the security on this date.")
  public Integer getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Integer totalVolume) {
    this.totalVolume = totalVolume;
  }

  public DailyShortVolumeConsolidated shortVolume(Integer shortVolume) {
    this.shortVolume = shortVolume;
    return this;
  }

   /**
   * The aggregated volume of shares sold short across all FINRA reporting facilities combined. Represents the total off-exchange short selling volume for the security on this date.
   * @return shortVolume
  **/
  @ApiModelProperty(value = "The aggregated volume of shares sold short across all FINRA reporting facilities combined. Represents the total off-exchange short selling volume for the security on this date.")
  public Integer getShortVolume() {
    return shortVolume;
  }

  public void setShortVolume(Integer shortVolume) {
    this.shortVolume = shortVolume;
  }

  public DailyShortVolumeConsolidated shortExemptVolume(Integer shortExemptVolume) {
    this.shortExemptVolume = shortExemptVolume;
    return this;
  }

   /**
   * The aggregated volume of shares sold short with exemptions across all FINRA reporting facilities combined. Includes pre-borrow arrangements, market maker activities, and other regulated short sale exemptions.
   * @return shortExemptVolume
  **/
  @ApiModelProperty(value = "The aggregated volume of shares sold short with exemptions across all FINRA reporting facilities combined. Includes pre-borrow arrangements, market maker activities, and other regulated short sale exemptions.")
  public Integer getShortExemptVolume() {
    return shortExemptVolume;
  }

  public void setShortExemptVolume(Integer shortExemptVolume) {
    this.shortExemptVolume = shortExemptVolume;
  }

  public DailyShortVolumeConsolidated shortVolumeRatio(Double shortVolumeRatio) {
    this.shortVolumeRatio = shortVolumeRatio;
    return this;
  }

   /**
   * The ratio of aggregated short volume to aggregated total volume across all facilities, rounded to 4 decimal places. Ranges from 0.0 to 1.0.  This market-wide metric is useful for: - Comparing short selling intensity between securities - Identifying unusual short volume spikes - Tracking trends in bearish positioning - Assessing relative market sentiment toward a security 
   * @return shortVolumeRatio
  **/
  @ApiModelProperty(value = "The ratio of aggregated short volume to aggregated total volume across all facilities, rounded to 4 decimal places. Ranges from 0.0 to 1.0.  This market-wide metric is useful for: - Comparing short selling intensity between securities - Identifying unusual short volume spikes - Tracking trends in bearish positioning - Assessing relative market sentiment toward a security ")
  public Double getShortVolumeRatio() {
    return shortVolumeRatio;
  }

  public void setShortVolumeRatio(Double shortVolumeRatio) {
    this.shortVolumeRatio = shortVolumeRatio;
  }

  public DailyShortVolumeConsolidated sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public DailyShortVolumeConsolidated addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * The list of FINRA reporting facility codes that contributed data to this consolidated aggregate. Multiple facilities typically report on the same security daily, and their volumes are summed here.
   * @return sources
  **/
  @ApiModelProperty(value = "The list of FINRA reporting facility codes that contributed data to this consolidated aggregate. Multiple facilities typically report on the same security daily, and their volumes are summed here.")
  public List<String> getSources() {
    return sources;
  }

  public void setSources(List<String> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyShortVolumeConsolidated dailyShortVolumeConsolidated = (DailyShortVolumeConsolidated) o;
    return Objects.equals(this.securityId, dailyShortVolumeConsolidated.securityId) &&
        Objects.equals(this.symbol, dailyShortVolumeConsolidated.symbol) &&
        Objects.equals(this.tradeDate, dailyShortVolumeConsolidated.tradeDate) &&
        Objects.equals(this.totalVolume, dailyShortVolumeConsolidated.totalVolume) &&
        Objects.equals(this.shortVolume, dailyShortVolumeConsolidated.shortVolume) &&
        Objects.equals(this.shortExemptVolume, dailyShortVolumeConsolidated.shortExemptVolume) &&
        Objects.equals(this.shortVolumeRatio, dailyShortVolumeConsolidated.shortVolumeRatio) &&
        Objects.equals(this.sources, dailyShortVolumeConsolidated.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, symbol, tradeDate, totalVolume, shortVolume, shortExemptVolume, shortVolumeRatio, sources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyShortVolumeConsolidated {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    shortVolume: ").append(toIndentedString(shortVolume)).append("\n");
    sb.append("    shortExemptVolume: ").append(toIndentedString(shortExemptVolume)).append("\n");
    sb.append("    shortVolumeRatio: ").append(toIndentedString(shortVolumeRatio)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

