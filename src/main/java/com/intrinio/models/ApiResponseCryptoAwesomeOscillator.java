

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.AwesomeOscillatorTechnicalValue;
import com.intrinio.models.CryptoExchangeSummary;
import com.intrinio.models.CryptoPairSummary;
import com.intrinio.models.TechnicalIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Awesome Oscillator calculations for the prices of a Crypto Currency Pair
 */
@ApiModel(description = "The Awesome Oscillator calculations for the prices of a Crypto Currency Pair")

public class ApiResponseCryptoAwesomeOscillator {
  @SerializedName("technicals")
  private List<AwesomeOscillatorTechnicalValue> technicals = null;

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

  public ApiResponseCryptoAwesomeOscillator technicals(List<AwesomeOscillatorTechnicalValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseCryptoAwesomeOscillator addTechnicalsItem(AwesomeOscillatorTechnicalValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<AwesomeOscillatorTechnicalValue>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<AwesomeOscillatorTechnicalValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<AwesomeOscillatorTechnicalValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseCryptoAwesomeOscillator indicator(TechnicalIndicator indicator) {
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

  public ApiResponseCryptoAwesomeOscillator pair(CryptoPairSummary pair) {
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

  public ApiResponseCryptoAwesomeOscillator exchange(CryptoExchangeSummary exchange) {
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

  public ApiResponseCryptoAwesomeOscillator timeframe(String timeframe) {
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

  public ApiResponseCryptoAwesomeOscillator nextPage(String nextPage) {
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
    ApiResponseCryptoAwesomeOscillator apiResponseCryptoAwesomeOscillator = (ApiResponseCryptoAwesomeOscillator) o;
    return Objects.equals(this.technicals, apiResponseCryptoAwesomeOscillator.technicals) &&
        Objects.equals(this.indicator, apiResponseCryptoAwesomeOscillator.indicator) &&
        Objects.equals(this.pair, apiResponseCryptoAwesomeOscillator.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoAwesomeOscillator.exchange) &&
        Objects.equals(this.timeframe, apiResponseCryptoAwesomeOscillator.timeframe) &&
        Objects.equals(this.nextPage, apiResponseCryptoAwesomeOscillator.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, pair, exchange, timeframe, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoAwesomeOscillator {\n");
    
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

