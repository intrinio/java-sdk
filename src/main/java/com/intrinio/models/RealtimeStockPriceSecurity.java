

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
 * The Security of the stock price
 */
@ApiModel(description = "The Security of the stock price")

public class RealtimeStockPriceSecurity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("exchange_ticker")
  private String exchangeTicker = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("composite_figi")
  private String compositeFigi = null;

  public RealtimeStockPriceSecurity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for Security
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for Security")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RealtimeStockPriceSecurity ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The common/local ticker of the Security
   * @return ticker
  **/
  @ApiModelProperty(value = "The common/local ticker of the Security")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public RealtimeStockPriceSecurity exchangeTicker(String exchangeTicker) {
    this.exchangeTicker = exchangeTicker;
    return this;
  }

   /**
   * The exchange-level ticker
   * @return exchangeTicker
  **/
  @ApiModelProperty(value = "The exchange-level ticker")
  public String getExchangeTicker() {
    return exchangeTicker;
  }

  public void setExchangeTicker(String exchangeTicker) {
    this.exchangeTicker = exchangeTicker;
  }

  public RealtimeStockPriceSecurity figi(String figi) {
    this.figi = figi;
    return this;
  }

   /**
   * The OpenFIGI identifier
   * @return figi
  **/
  @ApiModelProperty(value = "The OpenFIGI identifier")
  public String getFigi() {
    return figi;
  }

  public void setFigi(String figi) {
    this.figi = figi;
  }

  public RealtimeStockPriceSecurity compositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
    return this;
  }

   /**
   * The country-composite OpenFIGI identifier
   * @return compositeFigi
  **/
  @ApiModelProperty(value = "The country-composite OpenFIGI identifier")
  public String getCompositeFigi() {
    return compositeFigi;
  }

  public void setCompositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeStockPriceSecurity realtimeStockPriceSecurity = (RealtimeStockPriceSecurity) o;
    return Objects.equals(this.id, realtimeStockPriceSecurity.id) &&
        Objects.equals(this.ticker, realtimeStockPriceSecurity.ticker) &&
        Objects.equals(this.exchangeTicker, realtimeStockPriceSecurity.exchangeTicker) &&
        Objects.equals(this.figi, realtimeStockPriceSecurity.figi) &&
        Objects.equals(this.compositeFigi, realtimeStockPriceSecurity.compositeFigi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, exchangeTicker, figi, compositeFigi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeStockPriceSecurity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    exchangeTicker: ").append(toIndentedString(exchangeTicker)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
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

