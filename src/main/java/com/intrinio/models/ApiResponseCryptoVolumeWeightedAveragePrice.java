

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoExchangeSummary;
import com.intrinio.models.CryptoPairSummary;
import com.intrinio.models.TechnicalIndicator;
import com.intrinio.models.VolumeWeightedAveragePriceValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Volume Weighted Average Price calculations for the prices of a Crypto Currency Pair
 */
@ApiModel(description = "The Volume Weighted Average Price calculations for the prices of a Crypto Currency Pair")

public class ApiResponseCryptoVolumeWeightedAveragePrice {
  @SerializedName("technicals")
  private List<VolumeWeightedAveragePriceValue> technicals = null;

  @SerializedName("indicator")
  private TechnicalIndicator indicator = null;

  @SerializedName("pair")
  private CryptoPairSummary pair = null;

  @SerializedName("exchange")
  private CryptoExchangeSummary exchange = null;

  @SerializedName("timeframe")
  private String timeframe = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCryptoVolumeWeightedAveragePrice technicals(List<VolumeWeightedAveragePriceValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseCryptoVolumeWeightedAveragePrice addTechnicalsItem(VolumeWeightedAveragePriceValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<VolumeWeightedAveragePriceValue>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<VolumeWeightedAveragePriceValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<VolumeWeightedAveragePriceValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseCryptoVolumeWeightedAveragePrice indicator(TechnicalIndicator indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * The name and symbol of the technical indicator
   * @return indicator
  **/
  @ApiModelProperty(value = "The name and symbol of the technical indicator")
  public TechnicalIndicator getIndicator() {
    return indicator;
  }

  public void setIndicator(TechnicalIndicator indicator) {
    this.indicator = indicator;
  }

  public ApiResponseCryptoVolumeWeightedAveragePrice pair(CryptoPairSummary pair) {
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

  public ApiResponseCryptoVolumeWeightedAveragePrice exchange(CryptoExchangeSummary exchange) {
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

  public ApiResponseCryptoVolumeWeightedAveragePrice timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

   /**
   * The time interval for the crypto currency prices
   * @return timeframe
  **/
  @ApiModelProperty(value = "The time interval for the crypto currency prices")
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public ApiResponseCryptoVolumeWeightedAveragePrice nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCryptoVolumeWeightedAveragePrice apiResponseCryptoVolumeWeightedAveragePrice = (ApiResponseCryptoVolumeWeightedAveragePrice) o;
    return Objects.equals(this.technicals, apiResponseCryptoVolumeWeightedAveragePrice.technicals) &&
        Objects.equals(this.indicator, apiResponseCryptoVolumeWeightedAveragePrice.indicator) &&
        Objects.equals(this.pair, apiResponseCryptoVolumeWeightedAveragePrice.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoVolumeWeightedAveragePrice.exchange) &&
        Objects.equals(this.timeframe, apiResponseCryptoVolumeWeightedAveragePrice.timeframe) &&
        Objects.equals(this.nextPage, apiResponseCryptoVolumeWeightedAveragePrice.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, pair, exchange, timeframe, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoVolumeWeightedAveragePrice {\n");
    
    sb.append("    technicals: ").append(toIndentedString(technicals)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

