

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.RealtimeStockPriceSecurity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * The realtime stock price of a security.
 */
@ApiModel(description = "The realtime stock price of a security.")

public class RealtimeStockPrice {
  @SerializedName("last_price")
  private BigDecimal lastPrice = null;

  @SerializedName("last_time")
  private OffsetDateTime lastTime = null;

  @SerializedName("last_size")
  private BigDecimal lastSize = null;

  @SerializedName("bid_price")
  private BigDecimal bidPrice = null;

  @SerializedName("bid_size")
  private BigDecimal bidSize = null;

  @SerializedName("ask_price")
  private BigDecimal askPrice = null;

  @SerializedName("ask_size")
  private BigDecimal askSize = null;

  @SerializedName("open_price")
  private BigDecimal openPrice = null;

  @SerializedName("close_price")
  private BigDecimal closePrice = null;

  @SerializedName("high_price")
  private BigDecimal highPrice = null;

  @SerializedName("low_price")
  private BigDecimal lowPrice = null;

  @SerializedName("exchange_volume")
  private BigDecimal exchangeVolume = null;

  @SerializedName("market_volume")
  private BigDecimal marketVolume = null;

  @SerializedName("updated_on")
  private OffsetDateTime updatedOn = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("listing_venue")
  private String listingVenue = null;

  @SerializedName("sales_conditions")
  private String salesConditions = null;

  @SerializedName("quote_conditions")
  private String quoteConditions = null;

  @SerializedName("market_center_code")
  private String marketCenterCode = null;

  @SerializedName("is_darkpool")
  private Boolean isDarkpool = null;

  @SerializedName("security")
  private RealtimeStockPriceSecurity security = null;

  public RealtimeStockPrice lastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * The price of the last trade.
   * @return lastPrice
  **/
  @ApiModelProperty(value = "The price of the last trade.")
  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public RealtimeStockPrice lastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
    return this;
  }

   /**
   * The date and time when the last trade occurred.
   * @return lastTime
  **/
  @ApiModelProperty(value = "The date and time when the last trade occurred.")
  public OffsetDateTime getLastTime() {
    return lastTime;
  }

  public void setLastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
  }

  public RealtimeStockPrice lastSize(BigDecimal lastSize) {
    this.lastSize = lastSize;
    return this;
  }

   /**
   * The size of the last trade.
   * @return lastSize
  **/
  @ApiModelProperty(value = "The size of the last trade.")
  public BigDecimal getLastSize() {
    return lastSize;
  }

  public void setLastSize(BigDecimal lastSize) {
    this.lastSize = lastSize;
  }

  public RealtimeStockPrice bidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * The price of the top bid order.
   * @return bidPrice
  **/
  @ApiModelProperty(value = "The price of the top bid order.")
  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
  }

  public RealtimeStockPrice bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * The size of the top bid order.
   * @return bidSize
  **/
  @ApiModelProperty(value = "The size of the top bid order.")
  public BigDecimal getBidSize() {
    return bidSize;
  }

  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  public RealtimeStockPrice askPrice(BigDecimal askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * The price of the top ask order.
   * @return askPrice
  **/
  @ApiModelProperty(value = "The price of the top ask order.")
  public BigDecimal getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(BigDecimal askPrice) {
    this.askPrice = askPrice;
  }

  public RealtimeStockPrice askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * The size of the top ask order.
   * @return askSize
  **/
  @ApiModelProperty(value = "The size of the top ask order.")
  public BigDecimal getAskSize() {
    return askSize;
  }

  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  public RealtimeStockPrice openPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
    return this;
  }

   /**
   * The price at the open of the trading day.
   * @return openPrice
  **/
  @ApiModelProperty(value = "The price at the open of the trading day.")
  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public void setOpenPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
  }

  public RealtimeStockPrice closePrice(BigDecimal closePrice) {
    this.closePrice = closePrice;
    return this;
  }

   /**
   * The price at the close of the trading day. (IEX only)
   * @return closePrice
  **/
  @ApiModelProperty(value = "The price at the close of the trading day. (IEX only)")
  public BigDecimal getClosePrice() {
    return closePrice;
  }

  public void setClosePrice(BigDecimal closePrice) {
    this.closePrice = closePrice;
  }

  public RealtimeStockPrice highPrice(BigDecimal highPrice) {
    this.highPrice = highPrice;
    return this;
  }

   /**
   * The high price for the trading day.
   * @return highPrice
  **/
  @ApiModelProperty(value = "The high price for the trading day.")
  public BigDecimal getHighPrice() {
    return highPrice;
  }

  public void setHighPrice(BigDecimal highPrice) {
    this.highPrice = highPrice;
  }

  public RealtimeStockPrice lowPrice(BigDecimal lowPrice) {
    this.lowPrice = lowPrice;
    return this;
  }

   /**
   * The low price for the trading day.
   * @return lowPrice
  **/
  @ApiModelProperty(value = "The low price for the trading day.")
  public BigDecimal getLowPrice() {
    return lowPrice;
  }

  public void setLowPrice(BigDecimal lowPrice) {
    this.lowPrice = lowPrice;
  }

  public RealtimeStockPrice exchangeVolume(BigDecimal exchangeVolume) {
    this.exchangeVolume = exchangeVolume;
    return this;
  }

   /**
   * The number of shares exchanged during the trading day on the exchange.
   * @return exchangeVolume
  **/
  @ApiModelProperty(value = "The number of shares exchanged during the trading day on the exchange.")
  public BigDecimal getExchangeVolume() {
    return exchangeVolume;
  }

  public void setExchangeVolume(BigDecimal exchangeVolume) {
    this.exchangeVolume = exchangeVolume;
  }

  public RealtimeStockPrice marketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
    return this;
  }

   /**
   * The number of shares exchanged during the trading day for the whole market.
   * @return marketVolume
  **/
  @ApiModelProperty(value = "The number of shares exchanged during the trading day for the whole market.")
  public BigDecimal getMarketVolume() {
    return marketVolume;
  }

  public void setMarketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
  }

  public RealtimeStockPrice updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * The date and time when the data was last updated.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The date and time when the data was last updated.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public RealtimeStockPrice source(String source) {
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

  public RealtimeStockPrice listingVenue(String listingVenue) {
    this.listingVenue = listingVenue;
    return this;
  }

   /**
   * The venue the price came from.
   * @return listingVenue
  **/
  @ApiModelProperty(value = "The venue the price came from.")
  public String getListingVenue() {
    return listingVenue;
  }

  public void setListingVenue(String listingVenue) {
    this.listingVenue = listingVenue;
  }

  public RealtimeStockPrice salesConditions(String salesConditions) {
    this.salesConditions = salesConditions;
    return this;
  }

   /**
   * The condition for the sale.
   * @return salesConditions
  **/
  @ApiModelProperty(value = "The condition for the sale.")
  public String getSalesConditions() {
    return salesConditions;
  }

  public void setSalesConditions(String salesConditions) {
    this.salesConditions = salesConditions;
  }

  public RealtimeStockPrice quoteConditions(String quoteConditions) {
    this.quoteConditions = quoteConditions;
    return this;
  }

   /**
   * The condition for the quote.
   * @return quoteConditions
  **/
  @ApiModelProperty(value = "The condition for the quote.")
  public String getQuoteConditions() {
    return quoteConditions;
  }

  public void setQuoteConditions(String quoteConditions) {
    this.quoteConditions = quoteConditions;
  }

  public RealtimeStockPrice marketCenterCode(String marketCenterCode) {
    this.marketCenterCode = marketCenterCode;
    return this;
  }

   /**
   * The market center character code.
   * @return marketCenterCode
  **/
  @ApiModelProperty(value = "The market center character code.")
  public String getMarketCenterCode() {
    return marketCenterCode;
  }

  public void setMarketCenterCode(String marketCenterCode) {
    this.marketCenterCode = marketCenterCode;
  }

  public RealtimeStockPrice isDarkpool(Boolean isDarkpool) {
    this.isDarkpool = isDarkpool;
    return this;
  }

   /**
   * Whether or not the current trade is from a darkpool or not.
   * @return isDarkpool
  **/
  @ApiModelProperty(value = "Whether or not the current trade is from a darkpool or not.")
  public Boolean isIsDarkpool() {
    return isDarkpool;
  }

  public void setIsDarkpool(Boolean isDarkpool) {
    this.isDarkpool = isDarkpool;
  }

  public RealtimeStockPrice security(RealtimeStockPriceSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
  public RealtimeStockPriceSecurity getSecurity() {
    return security;
  }

  public void setSecurity(RealtimeStockPriceSecurity security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeStockPrice realtimeStockPrice = (RealtimeStockPrice) o;
    return Objects.equals(this.lastPrice, realtimeStockPrice.lastPrice) &&
        Objects.equals(this.lastTime, realtimeStockPrice.lastTime) &&
        Objects.equals(this.lastSize, realtimeStockPrice.lastSize) &&
        Objects.equals(this.bidPrice, realtimeStockPrice.bidPrice) &&
        Objects.equals(this.bidSize, realtimeStockPrice.bidSize) &&
        Objects.equals(this.askPrice, realtimeStockPrice.askPrice) &&
        Objects.equals(this.askSize, realtimeStockPrice.askSize) &&
        Objects.equals(this.openPrice, realtimeStockPrice.openPrice) &&
        Objects.equals(this.closePrice, realtimeStockPrice.closePrice) &&
        Objects.equals(this.highPrice, realtimeStockPrice.highPrice) &&
        Objects.equals(this.lowPrice, realtimeStockPrice.lowPrice) &&
        Objects.equals(this.exchangeVolume, realtimeStockPrice.exchangeVolume) &&
        Objects.equals(this.marketVolume, realtimeStockPrice.marketVolume) &&
        Objects.equals(this.updatedOn, realtimeStockPrice.updatedOn) &&
        Objects.equals(this.source, realtimeStockPrice.source) &&
        Objects.equals(this.listingVenue, realtimeStockPrice.listingVenue) &&
        Objects.equals(this.salesConditions, realtimeStockPrice.salesConditions) &&
        Objects.equals(this.quoteConditions, realtimeStockPrice.quoteConditions) &&
        Objects.equals(this.marketCenterCode, realtimeStockPrice.marketCenterCode) &&
        Objects.equals(this.isDarkpool, realtimeStockPrice.isDarkpool) &&
        Objects.equals(this.security, realtimeStockPrice.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPrice, lastTime, lastSize, bidPrice, bidSize, askPrice, askSize, openPrice, closePrice, highPrice, lowPrice, exchangeVolume, marketVolume, updatedOn, source, listingVenue, salesConditions, quoteConditions, marketCenterCode, isDarkpool, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeStockPrice {\n");
    
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
    sb.append("    lastSize: ").append(toIndentedString(lastSize)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    openPrice: ").append(toIndentedString(openPrice)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
    sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
    sb.append("    exchangeVolume: ").append(toIndentedString(exchangeVolume)).append("\n");
    sb.append("    marketVolume: ").append(toIndentedString(marketVolume)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    listingVenue: ").append(toIndentedString(listingVenue)).append("\n");
    sb.append("    salesConditions: ").append(toIndentedString(salesConditions)).append("\n");
    sb.append("    quoteConditions: ").append(toIndentedString(quoteConditions)).append("\n");
    sb.append("    marketCenterCode: ").append(toIndentedString(marketCenterCode)).append("\n");
    sb.append("    isDarkpool: ").append(toIndentedString(isDarkpool)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

