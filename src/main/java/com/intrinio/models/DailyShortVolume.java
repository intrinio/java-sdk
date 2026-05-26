

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
import org.threeten.bp.LocalDate;

/**
 * Daily short volume data for a security at a specific FINRA reporting facility. This represents off-exchange activity reported by a single market center or third-party reporting facility. 
 */
@ApiModel(description = "Daily short volume data for a security at a specific FINRA reporting facility. This represents off-exchange activity reported by a single market center or third-party reporting facility. ")

public class DailyShortVolume {
  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("trade_date")
  private LocalDate tradeDate = null;

  @SerializedName("reporting_facility_code")
  private String reportingFacilityCode = null;

  @SerializedName("total_volume")
  private Integer totalVolume = null;

  @SerializedName("short_volume")
  private Integer shortVolume = null;

  @SerializedName("short_exempt_volume")
  private Integer shortExemptVolume = null;

  @SerializedName("short_volume_ratio")
  private Double shortVolumeRatio = null;

  public DailyShortVolume securityId(String securityId) {
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

  public DailyShortVolume symbol(String symbol) {
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

  public DailyShortVolume tradeDate(LocalDate tradeDate) {
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

  public DailyShortVolume reportingFacilityCode(String reportingFacilityCode) {
    this.reportingFacilityCode = reportingFacilityCode;
    return this;
  }

   /**
   * The FINRA-assigned facility code identifying which market center or reporting facility reported this short volume. Different facilities may report different short volumes for the same security on the same date.
   * @return reportingFacilityCode
  **/
  @ApiModelProperty(value = "The FINRA-assigned facility code identifying which market center or reporting facility reported this short volume. Different facilities may report different short volumes for the same security on the same date.")
  public String getReportingFacilityCode() {
    return reportingFacilityCode;
  }

  public void setReportingFacilityCode(String reportingFacilityCode) {
    this.reportingFacilityCode = reportingFacilityCode;
  }

  public DailyShortVolume totalVolume(Integer totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * The total volume of shares traded at this facility. This includes both long and short sales.
   * @return totalVolume
  **/
  @ApiModelProperty(value = "The total volume of shares traded at this facility. This includes both long and short sales.")
  public Integer getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Integer totalVolume) {
    this.totalVolume = totalVolume;
  }

  public DailyShortVolume shortVolume(Integer shortVolume) {
    this.shortVolume = shortVolume;
    return this;
  }

   /**
   * The volume of shares sold short at this facility. Short sales represent bearish positions or hedging activity.
   * @return shortVolume
  **/
  @ApiModelProperty(value = "The volume of shares sold short at this facility. Short sales represent bearish positions or hedging activity.")
  public Integer getShortVolume() {
    return shortVolume;
  }

  public void setShortVolume(Integer shortVolume) {
    this.shortVolume = shortVolume;
  }

  public DailyShortVolume shortExemptVolume(Integer shortExemptVolume) {
    this.shortExemptVolume = shortExemptVolume;
    return this;
  }

   /**
   * The volume of shares sold short with exemptions (e.g., pre-borrow arrangements, market maker activities). These shorts are legally exempt from certain short sale restrictions.
   * @return shortExemptVolume
  **/
  @ApiModelProperty(value = "The volume of shares sold short with exemptions (e.g., pre-borrow arrangements, market maker activities). These shorts are legally exempt from certain short sale restrictions.")
  public Integer getShortExemptVolume() {
    return shortExemptVolume;
  }

  public void setShortExemptVolume(Integer shortExemptVolume) {
    this.shortExemptVolume = shortExemptVolume;
  }

  public DailyShortVolume shortVolumeRatio(Double shortVolumeRatio) {
    this.shortVolumeRatio = shortVolumeRatio;
    return this;
  }

   /**
   * The ratio of short volume to total volume at this facility, rounded to 4 decimal places. Ranges from 0.0 to 1.0. A higher ratio indicates more short selling activity relative to overall trading volume.
   * @return shortVolumeRatio
  **/
  @ApiModelProperty(value = "The ratio of short volume to total volume at this facility, rounded to 4 decimal places. Ranges from 0.0 to 1.0. A higher ratio indicates more short selling activity relative to overall trading volume.")
  public Double getShortVolumeRatio() {
    return shortVolumeRatio;
  }

  public void setShortVolumeRatio(Double shortVolumeRatio) {
    this.shortVolumeRatio = shortVolumeRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyShortVolume dailyShortVolume = (DailyShortVolume) o;
    return Objects.equals(this.securityId, dailyShortVolume.securityId) &&
        Objects.equals(this.symbol, dailyShortVolume.symbol) &&
        Objects.equals(this.tradeDate, dailyShortVolume.tradeDate) &&
        Objects.equals(this.reportingFacilityCode, dailyShortVolume.reportingFacilityCode) &&
        Objects.equals(this.totalVolume, dailyShortVolume.totalVolume) &&
        Objects.equals(this.shortVolume, dailyShortVolume.shortVolume) &&
        Objects.equals(this.shortExemptVolume, dailyShortVolume.shortExemptVolume) &&
        Objects.equals(this.shortVolumeRatio, dailyShortVolume.shortVolumeRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, symbol, tradeDate, reportingFacilityCode, totalVolume, shortVolume, shortExemptVolume, shortVolumeRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyShortVolume {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    reportingFacilityCode: ").append(toIndentedString(reportingFacilityCode)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    shortVolume: ").append(toIndentedString(shortVolume)).append("\n");
    sb.append("    shortExemptVolume: ").append(toIndentedString(shortExemptVolume)).append("\n");
    sb.append("    shortVolumeRatio: ").append(toIndentedString(shortVolumeRatio)).append("\n");
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

