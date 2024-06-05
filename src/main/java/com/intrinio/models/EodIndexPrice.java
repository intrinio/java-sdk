

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * The end of day price of an index.
 */
@ApiModel(description = "The end of day price of an index.")

public class EodIndexPrice {
  @SerializedName("index")
  private ApiResponseIndex index = null;

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

  public EodIndexPrice index(ApiResponseIndex index) {
    this.index = index;
    return this;
  }

   /**
   * The index
   * @return index
  **/
  @ApiModelProperty(value = "The index")
  public ApiResponseIndex getIndex() {
    return index;
  }

  public void setIndex(ApiResponseIndex index) {
    this.index = index;
  }

  public EodIndexPrice close(BigDecimal close) {
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

  public EodIndexPrice open(BigDecimal open) {
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

  public EodIndexPrice high(BigDecimal high) {
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

  public EodIndexPrice low(BigDecimal low) {
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

  public EodIndexPrice volume(Integer volume) {
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

  public EodIndexPrice date(LocalDate date) {
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
    EodIndexPrice eodIndexPrice = (EodIndexPrice) o;
    return Objects.equals(this.index, eodIndexPrice.index) &&
        Objects.equals(this.close, eodIndexPrice.close) &&
        Objects.equals(this.open, eodIndexPrice.open) &&
        Objects.equals(this.high, eodIndexPrice.high) &&
        Objects.equals(this.low, eodIndexPrice.low) &&
        Objects.equals(this.volume, eodIndexPrice.volume) &&
        Objects.equals(this.date, eodIndexPrice.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, close, open, high, low, volume, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EodIndexPrice {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

