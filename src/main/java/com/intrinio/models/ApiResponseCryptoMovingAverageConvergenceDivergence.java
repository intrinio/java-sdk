

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoExchangeSummary;
import com.intrinio.models.CryptoPairSummary;
import com.intrinio.models.MovingAverageConvergenceDivergenceTechnicalValue;
import com.intrinio.models.TechnicalIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Moving Average Convergence Divergence calculations for the prices of a Crypto Currency Pair
 */
@ApiModel(description = "The Moving Average Convergence Divergence calculations for the prices of a Crypto Currency Pair")

public class ApiResponseCryptoMovingAverageConvergenceDivergence {
  @SerializedName("technicals")
  private List<MovingAverageConvergenceDivergenceTechnicalValue> technicals = null;

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

  public ApiResponseCryptoMovingAverageConvergenceDivergence technicals(List<MovingAverageConvergenceDivergenceTechnicalValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseCryptoMovingAverageConvergenceDivergence addTechnicalsItem(MovingAverageConvergenceDivergenceTechnicalValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<MovingAverageConvergenceDivergenceTechnicalValue>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<MovingAverageConvergenceDivergenceTechnicalValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<MovingAverageConvergenceDivergenceTechnicalValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseCryptoMovingAverageConvergenceDivergence indicator(TechnicalIndicator indicator) {
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

  public ApiResponseCryptoMovingAverageConvergenceDivergence pair(CryptoPairSummary pair) {
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

  public ApiResponseCryptoMovingAverageConvergenceDivergence exchange(CryptoExchangeSummary exchange) {
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

  public ApiResponseCryptoMovingAverageConvergenceDivergence timeframe(String timeframe) {
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

  public ApiResponseCryptoMovingAverageConvergenceDivergence nextPage(String nextPage) {
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
    ApiResponseCryptoMovingAverageConvergenceDivergence apiResponseCryptoMovingAverageConvergenceDivergence = (ApiResponseCryptoMovingAverageConvergenceDivergence) o;
    return Objects.equals(this.technicals, apiResponseCryptoMovingAverageConvergenceDivergence.technicals) &&
        Objects.equals(this.indicator, apiResponseCryptoMovingAverageConvergenceDivergence.indicator) &&
        Objects.equals(this.pair, apiResponseCryptoMovingAverageConvergenceDivergence.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoMovingAverageConvergenceDivergence.exchange) &&
        Objects.equals(this.timeframe, apiResponseCryptoMovingAverageConvergenceDivergence.timeframe) &&
        Objects.equals(this.nextPage, apiResponseCryptoMovingAverageConvergenceDivergence.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, pair, exchange, timeframe, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoMovingAverageConvergenceDivergence {\n");
    
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

