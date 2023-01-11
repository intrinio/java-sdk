

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

  @SerializedName("ask_at_execution")
  private BigDecimal askAtExecution = null;

  @SerializedName("bid_at_execution")
  private BigDecimal bidAtExecution = null;

  /**
   * Bullish, Bearish, or Neutral Sentiment is estimated based on whether the trade was executed at the bid, ask, or mark price.
   */
  @JsonAdapter(SentimentEnum.Adapter.class)
  public enum SentimentEnum {
    BULLISH("bullish"),
    
    BEARISH("bearish"),
    
    NEUTRAL("neutral");

    private String value;

    SentimentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SentimentEnum fromValue(String text) {
      for (SentimentEnum b : SentimentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SentimentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SentimentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SentimentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SentimentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sentiment")
  private SentimentEnum sentiment = null;

  @SerializedName("underlying_price_at_execution")
  private BigDecimal underlyingPriceAtExecution = null;

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
   * The aggregated value of all option contract premiums included in the trade
   * @return totalValue
  **/
  @ApiModelProperty(value = "The aggregated value of all option contract premiums included in the trade")
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
   * The option contract symbol
   * @return contract
  **/
  @ApiModelProperty(value = "The option contract symbol")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public OptionUnusualTrade askAtExecution(BigDecimal askAtExecution) {
    this.askAtExecution = askAtExecution;
    return this;
  }

   /**
   * Ask price at execution
   * @return askAtExecution
  **/
  @ApiModelProperty(value = "Ask price at execution")
  public BigDecimal getAskAtExecution() {
    return askAtExecution;
  }

  public void setAskAtExecution(BigDecimal askAtExecution) {
    this.askAtExecution = askAtExecution;
  }

  public OptionUnusualTrade bidAtExecution(BigDecimal bidAtExecution) {
    this.bidAtExecution = bidAtExecution;
    return this;
  }

   /**
   * Bid price at execution
   * @return bidAtExecution
  **/
  @ApiModelProperty(value = "Bid price at execution")
  public BigDecimal getBidAtExecution() {
    return bidAtExecution;
  }

  public void setBidAtExecution(BigDecimal bidAtExecution) {
    this.bidAtExecution = bidAtExecution;
  }

  public OptionUnusualTrade sentiment(SentimentEnum sentiment) {
    this.sentiment = sentiment;
    return this;
  }

   /**
   * Bullish, Bearish, or Neutral Sentiment is estimated based on whether the trade was executed at the bid, ask, or mark price.
   * @return sentiment
  **/
  @ApiModelProperty(value = "Bullish, Bearish, or Neutral Sentiment is estimated based on whether the trade was executed at the bid, ask, or mark price.")
  public SentimentEnum getSentiment() {
    return sentiment;
  }

  public void setSentiment(SentimentEnum sentiment) {
    this.sentiment = sentiment;
  }

  public OptionUnusualTrade underlyingPriceAtExecution(BigDecimal underlyingPriceAtExecution) {
    this.underlyingPriceAtExecution = underlyingPriceAtExecution;
    return this;
  }

   /**
   * Price of the underlying security at execution of trade
   * @return underlyingPriceAtExecution
  **/
  @ApiModelProperty(value = "Price of the underlying security at execution of trade")
  public BigDecimal getUnderlyingPriceAtExecution() {
    return underlyingPriceAtExecution;
  }

  public void setUnderlyingPriceAtExecution(BigDecimal underlyingPriceAtExecution) {
    this.underlyingPriceAtExecution = underlyingPriceAtExecution;
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
        Objects.equals(this.contract, optionUnusualTrade.contract) &&
        Objects.equals(this.askAtExecution, optionUnusualTrade.askAtExecution) &&
        Objects.equals(this.bidAtExecution, optionUnusualTrade.bidAtExecution) &&
        Objects.equals(this.sentiment, optionUnusualTrade.sentiment) &&
        Objects.equals(this.underlyingPriceAtExecution, optionUnusualTrade.underlyingPriceAtExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, timestamp, type, totalValue, totalSize, averagePrice, contract, askAtExecution, bidAtExecution, sentiment, underlyingPriceAtExecution);
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
    sb.append("    askAtExecution: ").append(toIndentedString(askAtExecution)).append("\n");
    sb.append("    bidAtExecution: ").append(toIndentedString(bidAtExecution)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    underlyingPriceAtExecution: ").append(toIndentedString(underlyingPriceAtExecution)).append("\n");
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

