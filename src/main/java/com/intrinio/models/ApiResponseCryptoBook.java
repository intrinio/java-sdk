

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
 * ApiResponseCryptoBook
 */

public class ApiResponseCryptoBook {
  @SerializedName("bids")
  private List<CryptoBookEntry> bids = null;

  @SerializedName("asks")
  private List<CryptoBookEntry> asks = null;

  @SerializedName("pair")
  private CryptoPairSummary pair = null;

  @SerializedName("exchange")
  private CryptoExchangeSummary exchange = null;

  @SerializedName("last_updated")
  private String lastUpdated = null;

  public ApiResponseCryptoBook bids(List<CryptoBookEntry> bids) {
    this.bids = bids;
    return this;
  }

  public ApiResponseCryptoBook addBidsItem(CryptoBookEntry bidsItem) {
    if (this.bids == null) {
      this.bids = new ArrayList<CryptoBookEntry>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * The bid prices and their respective sizes, in descending order of price.
   * @return bids
  **/
  @ApiModelProperty(value = "The bid prices and their respective sizes, in descending order of price.")
  public List<CryptoBookEntry> getBids() {
    return bids;
  }

  public void setBids(List<CryptoBookEntry> bids) {
    this.bids = bids;
  }

  public ApiResponseCryptoBook asks(List<CryptoBookEntry> asks) {
    this.asks = asks;
    return this;
  }

  public ApiResponseCryptoBook addAsksItem(CryptoBookEntry asksItem) {
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

  public ApiResponseCryptoBook pair(CryptoPairSummary pair) {
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

  public ApiResponseCryptoBook exchange(CryptoExchangeSummary exchange) {
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

  public ApiResponseCryptoBook lastUpdated(String lastUpdated) {
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
    ApiResponseCryptoBook apiResponseCryptoBook = (ApiResponseCryptoBook) o;
    return Objects.equals(this.bids, apiResponseCryptoBook.bids) &&
        Objects.equals(this.asks, apiResponseCryptoBook.asks) &&
        Objects.equals(this.pair, apiResponseCryptoBook.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoBook.exchange) &&
        Objects.equals(this.lastUpdated, apiResponseCryptoBook.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bids, asks, pair, exchange, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoBook {\n");
    
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

