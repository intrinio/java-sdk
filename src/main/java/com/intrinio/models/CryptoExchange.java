

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
 * An exchange that a Crypto Currency Pair trades on. Crypto Exchange data includes name, code, book depth availability, historical data availability, snapshot availability, trade data availability, and a list of Crypto Currency Pairs that trade on it. Each exchange may provide different kinds of data (book depth, trades, etc.) about the Crypto Currency Pairs that trade on it.
 */
@ApiModel(description = "An exchange that a Crypto Currency Pair trades on. Crypto Exchange data includes name, code, book depth availability, historical data availability, snapshot availability, trade data availability, and a list of Crypto Currency Pairs that trade on it. Each exchange may provide different kinds of data (book depth, trades, etc.) about the Crypto Currency Pairs that trade on it.")

public class CryptoExchange {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("book_depth_available")
  private Boolean bookDepthAvailable = null;

  @SerializedName("history_available")
  private Boolean historyAvailable = null;

  @SerializedName("snapshot_available")
  private Boolean snapshotAvailable = null;

  @SerializedName("trades_available")
  private Boolean tradesAvailable = null;

  public CryptoExchange name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Crypto Exchange name.
   * @return name
  **/
  @ApiModelProperty(value = "The Crypto Exchange name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoExchange code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The Crypto Exchange code.
   * @return code
  **/
  @ApiModelProperty(value = "The Crypto Exchange code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CryptoExchange bookDepthAvailable(Boolean bookDepthAvailable) {
    this.bookDepthAvailable = bookDepthAvailable;
    return this;
  }

   /**
   * A boolean, representing whether book depth data is provided by this exchange or not.
   * @return bookDepthAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether book depth data is provided by this exchange or not.")
  public Boolean isisBookDepthAvailable() {
    return bookDepthAvailable;
  }

  public void setBookDepthAvailable(Boolean bookDepthAvailable) {
    this.bookDepthAvailable = bookDepthAvailable;
  }

  public CryptoExchange historyAvailable(Boolean historyAvailable) {
    this.historyAvailable = historyAvailable;
    return this;
  }

   /**
   * A boolean, representing whether historical data is provided by this exchange or not.
   * @return historyAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether historical data is provided by this exchange or not.")
  public Boolean isisHistoryAvailable() {
    return historyAvailable;
  }

  public void setHistoryAvailable(Boolean historyAvailable) {
    this.historyAvailable = historyAvailable;
  }

  public CryptoExchange snapshotAvailable(Boolean snapshotAvailable) {
    this.snapshotAvailable = snapshotAvailable;
    return this;
  }

   /**
   * A boolean, representing whether snpashot data is provided by this exchange or not.
   * @return snapshotAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether snpashot data is provided by this exchange or not.")
  public Boolean isisSnapshotAvailable() {
    return snapshotAvailable;
  }

  public void setSnapshotAvailable(Boolean snapshotAvailable) {
    this.snapshotAvailable = snapshotAvailable;
  }

  public CryptoExchange tradesAvailable(Boolean tradesAvailable) {
    this.tradesAvailable = tradesAvailable;
    return this;
  }

   /**
   * A boolean, representing whether trade data is provided by this exchange or not.
   * @return tradesAvailable
  **/
  @ApiModelProperty(value = "A boolean, representing whether trade data is provided by this exchange or not.")
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
    CryptoExchange cryptoExchange = (CryptoExchange) o;
    return Objects.equals(this.name, cryptoExchange.name) &&
        Objects.equals(this.code, cryptoExchange.code) &&
        Objects.equals(this.bookDepthAvailable, cryptoExchange.bookDepthAvailable) &&
        Objects.equals(this.historyAvailable, cryptoExchange.historyAvailable) &&
        Objects.equals(this.snapshotAvailable, cryptoExchange.snapshotAvailable) &&
        Objects.equals(this.tradesAvailable, cryptoExchange.tradesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, bookDepthAvailable, historyAvailable, snapshotAvailable, tradesAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoExchange {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

