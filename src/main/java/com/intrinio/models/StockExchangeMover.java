

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

/**
 * An security intervals result contains all security intervals corresponding to the provided query.
 */
@ApiModel(description = "An security intervals result contains all security intervals corresponding to the provided query.")

public class StockExchangeMover {
  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("last_price")
  private BigDecimal lastPrice = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("percent_change")
  private BigDecimal percentChange = null;

  @SerializedName("market_volume")
  private BigDecimal marketVolume = null;

  @SerializedName("source")
  private String source = null;

  public StockExchangeMover securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * The Intrinio Identifier for this security.
   * @return securityId
  **/
  @ApiModelProperty(value = "The Intrinio Identifier for this security.")
  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public StockExchangeMover ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol for this security.
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol for this security.")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public StockExchangeMover lastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * The last price of the last trade.
   * @return lastPrice
  **/
  @ApiModelProperty(value = "The last price of the last trade.")
  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public StockExchangeMover change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The raw change in price.
   * @return change
  **/
  @ApiModelProperty(value = "The raw change in price.")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public StockExchangeMover percentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
    return this;
  }

   /**
   * The percent change in price.
   * @return percentChange
  **/
  @ApiModelProperty(value = "The percent change in price.")
  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public void setPercentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
  }

  public StockExchangeMover marketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
    return this;
  }

   /**
   * The market volume for the most recent (today) trading day.
   * @return marketVolume
  **/
  @ApiModelProperty(value = "The market volume for the most recent (today) trading day.")
  public BigDecimal getMarketVolume() {
    return marketVolume;
  }

  public void setMarketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
  }

  public StockExchangeMover source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the data.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the data.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockExchangeMover stockExchangeMover = (StockExchangeMover) o;
    return Objects.equals(this.securityId, stockExchangeMover.securityId) &&
        Objects.equals(this.ticker, stockExchangeMover.ticker) &&
        Objects.equals(this.lastPrice, stockExchangeMover.lastPrice) &&
        Objects.equals(this.change, stockExchangeMover.change) &&
        Objects.equals(this.percentChange, stockExchangeMover.percentChange) &&
        Objects.equals(this.marketVolume, stockExchangeMover.marketVolume) &&
        Objects.equals(this.source, stockExchangeMover.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityId, ticker, lastPrice, change, percentChange, marketVolume, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockExchangeMover {\n");
    
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    marketVolume: ").append(toIndentedString(marketVolume)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

