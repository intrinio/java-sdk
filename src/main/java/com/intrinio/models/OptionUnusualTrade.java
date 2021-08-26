

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
 * A large market order that is broken into a collection of smaller orders to take advantage of all contracts and prices offered across all exchanges.
 */
@ApiModel(description = "A large market order that is broken into a collection of smaller orders to take advantage of all contracts and prices offered across all exchanges.")

public class OptionUnusualTrade {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("timestamp")
  private LocalDate timestamp = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("total_value")
  private BigDecimal totalValue = null;

  @SerializedName("total_size")
  private BigDecimal totalSize = null;

  @SerializedName("average_price")
  private BigDecimal averagePrice = null;

  @SerializedName("contract")
  private String contract = null;

  public OptionUnusualTrade symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The underlying option security symbol for the trade
   * @return symbol
  **/
  @ApiModelProperty(value = "The underlying option security symbol for the trade")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OptionUnusualTrade timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC timestamp of order placement
   * @return timestamp
  **/
  @ApiModelProperty(value = "The UTC timestamp of order placement")
  public LocalDate getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }

  public OptionUnusualTrade type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of unusual trade
   * @return type
  **/
  @ApiModelProperty(value = "The type of unusual trade")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OptionUnusualTrade totalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * The aggregated value of all option contract premiums included in the trade\\
   * @return totalValue
  **/
  @ApiModelProperty(value = "The aggregated value of all option contract premiums included in the trade\\")
  public BigDecimal getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
  }

  public OptionUnusualTrade totalSize(BigDecimal totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * The total number of contracts involved in a single transaction
   * @return totalSize
  **/
  @ApiModelProperty(value = "The total number of contracts involved in a single transaction")
  public BigDecimal getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(BigDecimal totalSize) {
    this.totalSize = totalSize;
  }

  public OptionUnusualTrade averagePrice(BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * The average premium paid per option contract
   * @return averagePrice
  **/
  @ApiModelProperty(value = "The average premium paid per option contract")
  public BigDecimal getAveragePrice() {
    return averagePrice;
  }

  public void setAveragePrice(BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
  }

  public OptionUnusualTrade contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(value = "")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionUnusualTrade optionUnusualTrade = (OptionUnusualTrade) o;
    return Objects.equals(this.symbol, optionUnusualTrade.symbol) &&
        Objects.equals(this.timestamp, optionUnusualTrade.timestamp) &&
        Objects.equals(this.type, optionUnusualTrade.type) &&
        Objects.equals(this.totalValue, optionUnusualTrade.totalValue) &&
        Objects.equals(this.totalSize, optionUnusualTrade.totalSize) &&
        Objects.equals(this.averagePrice, optionUnusualTrade.averagePrice) &&
        Objects.equals(this.contract, optionUnusualTrade.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, timestamp, type, totalValue, totalSize, averagePrice, contract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionUnusualTrade {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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

