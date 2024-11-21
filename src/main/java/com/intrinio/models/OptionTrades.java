

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
import org.threeten.bp.OffsetDateTime;

/**
 * A trade.
 */
@ApiModel(description = "A trade.")

public class OptionTrades {
  @SerializedName("contract")
  private String contract = null;

  @SerializedName("underlying_symbol")
  private String underlyingSymbol = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("total_volume")
  private BigDecimal totalVolume = null;

  @SerializedName("ask_price_at_execution")
  private BigDecimal askPriceAtExecution = null;

  @SerializedName("bid_price_at_execution")
  private BigDecimal bidPriceAtExecution = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("conditions")
  private String conditions = null;

  @SerializedName("sequence_id")
  private BigDecimal sequenceId = null;

  public OptionTrades contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The option contract
   * @return contract
  **/
  @ApiModelProperty(value = "The option contract")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public OptionTrades underlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
    return this;
  }

   /**
   * The ticker symbol
   * @return underlyingSymbol
  **/
  @ApiModelProperty(value = "The ticker symbol")
  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }

  public void setUnderlyingSymbol(String underlyingSymbol) {
    this.underlyingSymbol = underlyingSymbol;
  }

  public OptionTrades timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC timestamp at the time of the trade.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The UTC timestamp at the time of the trade.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public OptionTrades price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the trade.
   * @return price
  **/
  @ApiModelProperty(value = "The price of the trade.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OptionTrades size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the trade.
   * @return size
  **/
  @ApiModelProperty(value = "The size of the trade.")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public OptionTrades totalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * The total volume of the symbol for the day up to the timestamp point in time.
   * @return totalVolume
  **/
  @ApiModelProperty(value = "The total volume of the symbol for the day up to the timestamp point in time.")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
  }

  public OptionTrades askPriceAtExecution(BigDecimal askPriceAtExecution) {
    this.askPriceAtExecution = askPriceAtExecution;
    return this;
  }

   /**
   * The price of ask quote at the time of the trade.
   * @return askPriceAtExecution
  **/
  @ApiModelProperty(value = "The price of ask quote at the time of the trade.")
  public BigDecimal getAskPriceAtExecution() {
    return askPriceAtExecution;
  }

  public void setAskPriceAtExecution(BigDecimal askPriceAtExecution) {
    this.askPriceAtExecution = askPriceAtExecution;
  }

  public OptionTrades bidPriceAtExecution(BigDecimal bidPriceAtExecution) {
    this.bidPriceAtExecution = bidPriceAtExecution;
    return this;
  }

   /**
   * The price of bid quote at the time of the trade.
   * @return bidPriceAtExecution
  **/
  @ApiModelProperty(value = "The price of bid quote at the time of the trade.")
  public BigDecimal getBidPriceAtExecution() {
    return bidPriceAtExecution;
  }

  public void setBidPriceAtExecution(BigDecimal bidPriceAtExecution) {
    this.bidPriceAtExecution = bidPriceAtExecution;
  }

  public OptionTrades exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * The exchange for the trade.
   * @return exchange
  **/
  @ApiModelProperty(value = "The exchange for the trade.")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public OptionTrades conditions(String conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * The condition of the trade.
   * @return conditions
  **/
  @ApiModelProperty(value = "The condition of the trade.")
  public String getConditions() {
    return conditions;
  }

  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  public OptionTrades sequenceId(BigDecimal sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * The sequential ID for the trade, ordered as temporally received from the exchange.
   * @return sequenceId
  **/
  @ApiModelProperty(value = "The sequential ID for the trade, ordered as temporally received from the exchange.")
  public BigDecimal getSequenceId() {
    return sequenceId;
  }

  public void setSequenceId(BigDecimal sequenceId) {
    this.sequenceId = sequenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionTrades optionTrades = (OptionTrades) o;
    return Objects.equals(this.contract, optionTrades.contract) &&
        Objects.equals(this.underlyingSymbol, optionTrades.underlyingSymbol) &&
        Objects.equals(this.timestamp, optionTrades.timestamp) &&
        Objects.equals(this.price, optionTrades.price) &&
        Objects.equals(this.size, optionTrades.size) &&
        Objects.equals(this.totalVolume, optionTrades.totalVolume) &&
        Objects.equals(this.askPriceAtExecution, optionTrades.askPriceAtExecution) &&
        Objects.equals(this.bidPriceAtExecution, optionTrades.bidPriceAtExecution) &&
        Objects.equals(this.exchange, optionTrades.exchange) &&
        Objects.equals(this.conditions, optionTrades.conditions) &&
        Objects.equals(this.sequenceId, optionTrades.sequenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, underlyingSymbol, timestamp, price, size, totalVolume, askPriceAtExecution, bidPriceAtExecution, exchange, conditions, sequenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionTrades {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    underlyingSymbol: ").append(toIndentedString(underlyingSymbol)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    askPriceAtExecution: ").append(toIndentedString(askPriceAtExecution)).append("\n");
    sb.append("    bidPriceAtExecution: ").append(toIndentedString(bidPriceAtExecution)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
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

