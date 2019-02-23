

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

/**
 * A Forex Price
 */
@ApiModel(description = "A Forex Price")

public class ForexPrice {
  @SerializedName("occurred_at")
  private String occurredAt = null;

  @SerializedName("open_bid")
  private Float openBid = null;

  @SerializedName("high_bid")
  private Float highBid = null;

  @SerializedName("low_bid")
  private Float lowBid = null;

  @SerializedName("close_bid")
  private Float closeBid = null;

  @SerializedName("open_ask")
  private Float openAsk = null;

  @SerializedName("high_ask")
  private Float highAsk = null;

  @SerializedName("low_ask")
  private Float lowAsk = null;

  @SerializedName("close_ask")
  private Float closeAsk = null;

  @SerializedName("total_ticks")
  private Integer totalTicks = null;

  public ForexPrice occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * The timestamp of the beginning of the timeframe. The open prices would be at this time, while close prices would be at this time plus the timeframe.
   * @return occurredAt
  **/
  @ApiModelProperty(example = "2019-01-30T22:00:00.000Z", value = "The timestamp of the beginning of the timeframe. The open prices would be at this time, while close prices would be at this time plus the timeframe.")
  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }

  public ForexPrice openBid(Float openBid) {
    this.openBid = openBid;
    return this;
  }

   /**
   * Open bid
   * @return openBid
  **/
  @ApiModelProperty(example = "0.87962", value = "Open bid")
  public Float getOpenBid() {
    return openBid;
  }

  public void setOpenBid(Float openBid) {
    this.openBid = openBid;
  }

  public ForexPrice highBid(Float highBid) {
    this.highBid = highBid;
    return this;
  }

   /**
   * High bid
   * @return highBid
  **/
  @ApiModelProperty(example = "0.88137", value = "High bid")
  public Float getHighBid() {
    return highBid;
  }

  public void setHighBid(Float highBid) {
    this.highBid = highBid;
  }

  public ForexPrice lowBid(Float lowBid) {
    this.lowBid = lowBid;
    return this;
  }

   /**
   * Low bid
   * @return lowBid
  **/
  @ApiModelProperty(example = "0.87582", value = "Low bid")
  public Float getLowBid() {
    return lowBid;
  }

  public void setLowBid(Float lowBid) {
    this.lowBid = lowBid;
  }

  public ForexPrice closeBid(Float closeBid) {
    this.closeBid = closeBid;
    return this;
  }

   /**
   * Close bid
   * @return closeBid
  **/
  @ApiModelProperty(example = "0.87591", value = "Close bid")
  public Float getCloseBid() {
    return closeBid;
  }

  public void setCloseBid(Float closeBid) {
    this.closeBid = closeBid;
  }

  public ForexPrice openAsk(Float openAsk) {
    this.openAsk = openAsk;
    return this;
  }

   /**
   * Open ask
   * @return openAsk
  **/
  @ApiModelProperty(example = "0.87972", value = "Open ask")
  public Float getOpenAsk() {
    return openAsk;
  }

  public void setOpenAsk(Float openAsk) {
    this.openAsk = openAsk;
  }

  public ForexPrice highAsk(Float highAsk) {
    this.highAsk = highAsk;
    return this;
  }

   /**
   * High ask
   * @return highAsk
  **/
  @ApiModelProperty(example = "0.88151", value = "High ask")
  public Float getHighAsk() {
    return highAsk;
  }

  public void setHighAsk(Float highAsk) {
    this.highAsk = highAsk;
  }

  public ForexPrice lowAsk(Float lowAsk) {
    this.lowAsk = lowAsk;
    return this;
  }

   /**
   * Low ask
   * @return lowAsk
  **/
  @ApiModelProperty(example = "0.87646", value = "Low ask")
  public Float getLowAsk() {
    return lowAsk;
  }

  public void setLowAsk(Float lowAsk) {
    this.lowAsk = lowAsk;
  }

  public ForexPrice closeAsk(Float closeAsk) {
    this.closeAsk = closeAsk;
    return this;
  }

   /**
   * Close ask
   * @return closeAsk
  **/
  @ApiModelProperty(example = "0.87733", value = "Close ask")
  public Float getCloseAsk() {
    return closeAsk;
  }

  public void setCloseAsk(Float closeAsk) {
    this.closeAsk = closeAsk;
  }

  public ForexPrice totalTicks(Integer totalTicks) {
    this.totalTicks = totalTicks;
    return this;
  }

   /**
   * Total ticks
   * @return totalTicks
  **/
  @ApiModelProperty(example = "199438", value = "Total ticks")
  public Integer getTotalTicks() {
    return totalTicks;
  }

  public void setTotalTicks(Integer totalTicks) {
    this.totalTicks = totalTicks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexPrice forexPrice = (ForexPrice) o;
    return Objects.equals(this.occurredAt, forexPrice.occurredAt) &&
        Objects.equals(this.openBid, forexPrice.openBid) &&
        Objects.equals(this.highBid, forexPrice.highBid) &&
        Objects.equals(this.lowBid, forexPrice.lowBid) &&
        Objects.equals(this.closeBid, forexPrice.closeBid) &&
        Objects.equals(this.openAsk, forexPrice.openAsk) &&
        Objects.equals(this.highAsk, forexPrice.highAsk) &&
        Objects.equals(this.lowAsk, forexPrice.lowAsk) &&
        Objects.equals(this.closeAsk, forexPrice.closeAsk) &&
        Objects.equals(this.totalTicks, forexPrice.totalTicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurredAt, openBid, highBid, lowBid, closeBid, openAsk, highAsk, lowAsk, closeAsk, totalTicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForexPrice {\n");
    
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    openBid: ").append(toIndentedString(openBid)).append("\n");
    sb.append("    highBid: ").append(toIndentedString(highBid)).append("\n");
    sb.append("    lowBid: ").append(toIndentedString(lowBid)).append("\n");
    sb.append("    closeBid: ").append(toIndentedString(closeBid)).append("\n");
    sb.append("    openAsk: ").append(toIndentedString(openAsk)).append("\n");
    sb.append("    highAsk: ").append(toIndentedString(highAsk)).append("\n");
    sb.append("    lowAsk: ").append(toIndentedString(lowAsk)).append("\n");
    sb.append("    closeAsk: ").append(toIndentedString(closeAsk)).append("\n");
    sb.append("    totalTicks: ").append(toIndentedString(totalTicks)).append("\n");
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

