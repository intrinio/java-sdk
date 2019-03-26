

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoBookEntry;
import com.intrinio.models.CryptoExchangeSummary;
import com.intrinio.models.CryptoPairSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCryptoBookAsks
 */

public class ApiResponseCryptoBookAsks {
  @SerializedName("asks")
  private List<CryptoBookEntry> asks = null;

  @SerializedName("pair")
  private CryptoPairSummary pair = null;

  @SerializedName("exchange")
  private CryptoExchangeSummary exchange = null;

  @SerializedName("last_updated")
  private String lastUpdated = null;

  public ApiResponseCryptoBookAsks asks(List<CryptoBookEntry> asks) {
    this.asks = asks;
    return this;
  }

  public ApiResponseCryptoBookAsks addAsksItem(CryptoBookEntry asksItem) {
    if (this.asks == null) {
      this.asks = new ArrayList<CryptoBookEntry>();
    }
    this.asks.add(asksItem);
    return this;
  }

   /**
   * The ask prices and their respective sizes, in ascending order of price.
   * @return asks
  **/
  @ApiModelProperty(value = "The ask prices and their respective sizes, in ascending order of price.")
  public List<CryptoBookEntry> getAsks() {
    return asks;
  }

  public void setAsks(List<CryptoBookEntry> asks) {
    this.asks = asks;
  }

  public ApiResponseCryptoBookAsks pair(CryptoPairSummary pair) {
    this.pair = pair;
    return this;
  }

   /**
   * Get pair
   * @return pair
  **/
  @ApiModelProperty(value = "")
  public CryptoPairSummary getPair() {
    return pair;
  }

  public void setPair(CryptoPairSummary pair) {
    this.pair = pair;
  }

  public ApiResponseCryptoBookAsks exchange(CryptoExchangeSummary exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @ApiModelProperty(value = "")
  public CryptoExchangeSummary getExchange() {
    return exchange;
  }

  public void setExchange(CryptoExchangeSummary exchange) {
    this.exchange = exchange;
  }

  public ApiResponseCryptoBookAsks lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The UTC timestamp of when the order book was last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The UTC timestamp of when the order book was last updated.")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCryptoBookAsks apiResponseCryptoBookAsks = (ApiResponseCryptoBookAsks) o;
    return Objects.equals(this.asks, apiResponseCryptoBookAsks.asks) &&
        Objects.equals(this.pair, apiResponseCryptoBookAsks.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoBookAsks.exchange) &&
        Objects.equals(this.lastUpdated, apiResponseCryptoBookAsks.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asks, pair, exchange, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoBookAsks {\n");
    
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

