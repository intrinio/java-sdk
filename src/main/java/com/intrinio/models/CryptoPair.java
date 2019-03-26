

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
 * A Crypto Currency Pair is a currency pair traded on a Crypto Exchange and includes at least one Crypto Currency (i.e. BTCUSD, BTCETH, etc.). Details of a Crypto Currency Pair include name, code, the Crypto Currencies in the pair, and the Crypto Exchanges that the Crypto Currency Pair trades on. Included are also details about the data available for this Crypto Currency Pair such as the first and last date that price is available, book depth availability, history availability, snapshot availability, and trade data availability.
 */
@ApiModel(description = "A Crypto Currency Pair is a currency pair traded on a Crypto Exchange and includes at least one Crypto Currency (i.e. BTCUSD, BTCETH, etc.). Details of a Crypto Currency Pair include name, code, the Crypto Currencies in the pair, and the Crypto Exchanges that the Crypto Currency Pair trades on. Included are also details about the data available for this Crypto Currency Pair such as the first and last date that price is available, book depth availability, history availability, snapshot availability, and trade data availability.")

public class CryptoPair {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("first_price_date")
  private String firstPriceDate = null;

  @SerializedName("last_price_date")
  private String lastPriceDate = null;

  @SerializedName("book_depth_available")
  private Boolean bookDepthAvailable = null;

  @SerializedName("history_available")
  private Boolean historyAvailable = null;

  @SerializedName("snapshot_available")
  private Boolean snapshotAvailable = null;

  @SerializedName("trades_available")
  private Boolean tradesAvailable = null;

  public CryptoPair name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Crypto Currency Pair name.
   * @return name
  **/
  @ApiModelProperty(value = "The Crypto Currency Pair name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoPair code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The Crypto Currency Pair code.
   * @return code
  **/
  @ApiModelProperty(value = "The Crypto Currency Pair code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CryptoPair firstPriceDate(String firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
    return this;
  }

   /**
   * The earliest date that daily historical pricing is available for.
   * @return firstPriceDate
  **/
  @ApiModelProperty(value = "The earliest date that daily historical pricing is available for.")
  public String getFirstPriceDate() {
    return firstPriceDate;
  }

  public void setFirstPriceDate(String firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
  }

  public CryptoPair lastPriceDate(String lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
    return this;
  }

   /**
   * The most recent date that daily historical pricing is available for.
   * @return lastPriceDate
  **/
  @ApiModelProperty(value = "The most recent date that daily historical pricing is available for.")
  public String getLastPriceDate() {
    return lastPriceDate;
  }

  public void setLastPriceDate(String lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
  }

  public CryptoPair bookDepthAvailable(Boolean bookDepthAvailable) {
    this.bookDepthAvailable = bookDepthAvailable;
    return this;
  }

   /**
   * A boolean, representing whether this pair has book depth data available or not.
   * @return bookDepthAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether this pair has book depth data available or not.")
  public Boolean isisBookDepthAvailable() {
    return bookDepthAvailable;
  }

  public void setBookDepthAvailable(Boolean bookDepthAvailable) {
    this.bookDepthAvailable = bookDepthAvailable;
  }

  public CryptoPair historyAvailable(Boolean historyAvailable) {
    this.historyAvailable = historyAvailable;
    return this;
  }

   /**
   * A boolean, representing whether this pair has historical price data available or not.
   * @return historyAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether this pair has historical price data available or not.")
  public Boolean isisHistoryAvailable() {
    return historyAvailable;
  }

  public void setHistoryAvailable(Boolean historyAvailable) {
    this.historyAvailable = historyAvailable;
  }

  public CryptoPair snapshotAvailable(Boolean snapshotAvailable) {
    this.snapshotAvailable = snapshotAvailable;
    return this;
  }

   /**
   * A boolean, representing whether this pair has snapshot data available or not.
   * @return snapshotAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether this pair has snapshot data available or not.")
  public Boolean isisSnapshotAvailable() {
    return snapshotAvailable;
  }

  public void setSnapshotAvailable(Boolean snapshotAvailable) {
    this.snapshotAvailable = snapshotAvailable;
  }

  public CryptoPair tradesAvailable(Boolean tradesAvailable) {
    this.tradesAvailable = tradesAvailable;
    return this;
  }

   /**
   * A boolean, representing whether this pair has trade data available or not.
   * @return tradesAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether this pair has trade data available or not.")
  public Boolean isisTradesAvailable() {
    return tradesAvailable;
  }

  public void setTradesAvailable(Boolean tradesAvailable) {
    this.tradesAvailable = tradesAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoPair cryptoPair = (CryptoPair) o;
    return Objects.equals(this.name, cryptoPair.name) &&
        Objects.equals(this.code, cryptoPair.code) &&
        Objects.equals(this.firstPriceDate, cryptoPair.firstPriceDate) &&
        Objects.equals(this.lastPriceDate, cryptoPair.lastPriceDate) &&
        Objects.equals(this.bookDepthAvailable, cryptoPair.bookDepthAvailable) &&
        Objects.equals(this.historyAvailable, cryptoPair.historyAvailable) &&
        Objects.equals(this.snapshotAvailable, cryptoPair.snapshotAvailable) &&
        Objects.equals(this.tradesAvailable, cryptoPair.tradesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, firstPriceDate, lastPriceDate, bookDepthAvailable, historyAvailable, snapshotAvailable, tradesAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoPair {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    firstPriceDate: ").append(toIndentedString(firstPriceDate)).append("\n");
    sb.append("    lastPriceDate: ").append(toIndentedString(lastPriceDate)).append("\n");
    sb.append("    bookDepthAvailable: ").append(toIndentedString(bookDepthAvailable)).append("\n");
    sb.append("    historyAvailable: ").append(toIndentedString(historyAvailable)).append("\n");
    sb.append("    snapshotAvailable: ").append(toIndentedString(snapshotAvailable)).append("\n");
    sb.append("    tradesAvailable: ").append(toIndentedString(tradesAvailable)).append("\n");
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

