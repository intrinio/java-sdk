

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.RealtimeIndexPriceIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * The realtime price of an index.
 */
@ApiModel(description = "The realtime price of an index.")

public class RealtimeIndexPrice {
  @SerializedName("last_price")
  private BigDecimal lastPrice = null;

  @SerializedName("last_time")
  private OffsetDateTime lastTime = null;

  @SerializedName("index")
  private RealtimeIndexPriceIndex index = null;

  public RealtimeIndexPrice lastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * The last price
   * @return lastPrice
  **/
  @ApiModelProperty(value = "The last price")
  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public RealtimeIndexPrice lastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
    return this;
  }

   /**
   * The timestamp of the last price
   * @return lastTime
  **/
  @ApiModelProperty(value = "The timestamp of the last price")
  public OffsetDateTime getLastTime() {
    return lastTime;
  }

  public void setLastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
  }

  public RealtimeIndexPrice index(RealtimeIndexPriceIndex index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public RealtimeIndexPriceIndex getIndex() {
    return index;
  }

  public void setIndex(RealtimeIndexPriceIndex index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeIndexPrice realtimeIndexPrice = (RealtimeIndexPrice) o;
    return Objects.equals(this.lastPrice, realtimeIndexPrice.lastPrice) &&
        Objects.equals(this.lastTime, realtimeIndexPrice.lastTime) &&
        Objects.equals(this.index, realtimeIndexPrice.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPrice, lastTime, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeIndexPrice {\n");
    
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

