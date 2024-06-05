

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
 * The end of day price of an index.
 */
@ApiModel(description = "The end of day price of an index.")

public class EodIndexPriceSummary {
  @SerializedName("close")
  private BigDecimal close = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("date")
  private LocalDate date = null;

  public EodIndexPriceSummary close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The close price
   * @return close
  **/
  @ApiModelProperty(value = "The close price")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public EodIndexPriceSummary open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The open price
   * @return open
  **/
  @ApiModelProperty(value = "The open price")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public EodIndexPriceSummary high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The high price
   * @return high
  **/
  @ApiModelProperty(value = "The high price")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public EodIndexPriceSummary low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The low price
   * @return low
  **/
  @ApiModelProperty(value = "The low price")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public EodIndexPriceSummary volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume
   * @return volume
  **/
  @ApiModelProperty(value = "The volume")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public EodIndexPriceSummary date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the pricing data.
   * @return date
  **/
  @ApiModelProperty(value = "The date of the pricing data.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EodIndexPriceSummary eodIndexPriceSummary = (EodIndexPriceSummary) o;
    return Objects.equals(this.close, eodIndexPriceSummary.close) &&
        Objects.equals(this.open, eodIndexPriceSummary.open) &&
        Objects.equals(this.high, eodIndexPriceSummary.high) &&
        Objects.equals(this.low, eodIndexPriceSummary.low) &&
        Objects.equals(this.volume, eodIndexPriceSummary.volume) &&
        Objects.equals(this.date, eodIndexPriceSummary.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(close, open, high, low, volume, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EodIndexPriceSummary {\n");
    
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

