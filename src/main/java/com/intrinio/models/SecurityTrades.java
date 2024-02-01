

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

public class SecurityTrades {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("total_volume")
  private BigDecimal totalVolume = null;

  @SerializedName("market_center")
  private String marketCenter = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("is_darkpool")
  private Boolean isDarkpool = null;

  public SecurityTrades symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The ticker symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "The ticker symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SecurityTrades timestamp(OffsetDateTime timestamp) {
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

  public SecurityTrades price(BigDecimal price) {
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

  public SecurityTrades size(BigDecimal size) {
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

  public SecurityTrades totalVolume(BigDecimal totalVolume) {
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

  public SecurityTrades marketCenter(String marketCenter) {
    this.marketCenter = marketCenter;
    return this;
  }

   /**
   * The market center for the trade.
   * @return marketCenter
  **/
  @ApiModelProperty(value = "The market center for the trade.")
  public String getMarketCenter() {
    return marketCenter;
  }

  public void setMarketCenter(String marketCenter) {
    this.marketCenter = marketCenter;
  }

  public SecurityTrades condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the trade.
   * @return condition
  **/
  @ApiModelProperty(value = "The condition of the trade.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public SecurityTrades isDarkpool(Boolean isDarkpool) {
    this.isDarkpool = isDarkpool;
    return this;
  }

   /**
   * If the trade was darkpool or not.
   * @return isDarkpool
  **/
  @ApiModelProperty(value = "If the trade was darkpool or not.")
  public Boolean isIsDarkpool() {
    return isDarkpool;
  }

  public void setIsDarkpool(Boolean isDarkpool) {
    this.isDarkpool = isDarkpool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityTrades securityTrades = (SecurityTrades) o;
    return Objects.equals(this.symbol, securityTrades.symbol) &&
        Objects.equals(this.timestamp, securityTrades.timestamp) &&
        Objects.equals(this.price, securityTrades.price) &&
        Objects.equals(this.size, securityTrades.size) &&
        Objects.equals(this.totalVolume, securityTrades.totalVolume) &&
        Objects.equals(this.marketCenter, securityTrades.marketCenter) &&
        Objects.equals(this.condition, securityTrades.condition) &&
        Objects.equals(this.isDarkpool, securityTrades.isDarkpool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, timestamp, price, size, totalVolume, marketCenter, condition, isDarkpool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityTrades {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    marketCenter: ").append(toIndentedString(marketCenter)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isDarkpool: ").append(toIndentedString(isDarkpool)).append("\n");
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

