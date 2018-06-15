

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
 * The stats collection of a mutual fund on a given date.
 */
@ApiModel(description = "The stats collection of a mutual fund on a given date.")

public class MutualFundStat {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("net_assets")
  private BigDecimal netAssets = null;

  @SerializedName("net_asset_value")
  private BigDecimal netAssetValue = null;

  public MutualFundStat date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The calendar date that the stats collection represents
   * @return date
  **/
  @ApiModelProperty(value = "The calendar date that the stats collection represents")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public MutualFundStat netAssets(BigDecimal netAssets) {
    this.netAssets = netAssets;
    return this;
  }

   /**
   * The dollar amount of net assets managed by the fund
   * @return netAssets
  **/
  @ApiModelProperty(value = "The dollar amount of net assets managed by the fund")
  public BigDecimal getNetAssets() {
    return netAssets;
  }

  public void setNetAssets(BigDecimal netAssets) {
    this.netAssets = netAssets;
  }

  public MutualFundStat netAssetValue(BigDecimal netAssetValue) {
    this.netAssetValue = netAssetValue;
    return this;
  }

   /**
   * The value of the mutual fund that is reached by deducting the fund&#39;s liabilities from the market value of all of its shares and then dividing by the number of issued shares
   * @return netAssetValue
  **/
  @ApiModelProperty(value = "The value of the mutual fund that is reached by deducting the fund's liabilities from the market value of all of its shares and then dividing by the number of issued shares")
  public BigDecimal getNetAssetValue() {
    return netAssetValue;
  }

  public void setNetAssetValue(BigDecimal netAssetValue) {
    this.netAssetValue = netAssetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFundStat mutualFundStat = (MutualFundStat) o;
    return Objects.equals(this.date, mutualFundStat.date) &&
        Objects.equals(this.netAssets, mutualFundStat.netAssets) &&
        Objects.equals(this.netAssetValue, mutualFundStat.netAssetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, netAssets, netAssetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFundStat {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    netAssets: ").append(toIndentedString(netAssets)).append("\n");
    sb.append("    netAssetValue: ").append(toIndentedString(netAssetValue)).append("\n");
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

