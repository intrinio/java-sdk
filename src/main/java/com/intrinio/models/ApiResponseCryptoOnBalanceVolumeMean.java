

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoExchangeSummary;
import com.intrinio.models.CryptoPairSummary;
import com.intrinio.models.OnBalanceVolumeMeanTechnicalValue;
import com.intrinio.models.TechnicalIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The On-balance Volume Mean calculations for the prices of a Crypto Currency Pair
 */
@ApiModel(description = "The On-balance Volume Mean calculations for the prices of a Crypto Currency Pair")

public class ApiResponseCryptoOnBalanceVolumeMean {
  @SerializedName("technicals")
  private List<OnBalanceVolumeMeanTechnicalValue> technicals = null;

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

  public ApiResponseCryptoOnBalanceVolumeMean technicals(List<OnBalanceVolumeMeanTechnicalValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseCryptoOnBalanceVolumeMean addTechnicalsItem(OnBalanceVolumeMeanTechnicalValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<OnBalanceVolumeMeanTechnicalValue>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<OnBalanceVolumeMeanTechnicalValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<OnBalanceVolumeMeanTechnicalValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseCryptoOnBalanceVolumeMean indicator(TechnicalIndicator indicator) {
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

  public ApiResponseCryptoOnBalanceVolumeMean pair(CryptoPairSummary pair) {
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

  public ApiResponseCryptoOnBalanceVolumeMean exchange(CryptoExchangeSummary exchange) {
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

  public ApiResponseCryptoOnBalanceVolumeMean timeframe(String timeframe) {
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

  public ApiResponseCryptoOnBalanceVolumeMean nextPage(String nextPage) {
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
    ApiResponseCryptoOnBalanceVolumeMean apiResponseCryptoOnBalanceVolumeMean = (ApiResponseCryptoOnBalanceVolumeMean) o;
    return Objects.equals(this.technicals, apiResponseCryptoOnBalanceVolumeMean.technicals) &&
        Objects.equals(this.indicator, apiResponseCryptoOnBalanceVolumeMean.indicator) &&
        Objects.equals(this.pair, apiResponseCryptoOnBalanceVolumeMean.pair) &&
        Objects.equals(this.exchange, apiResponseCryptoOnBalanceVolumeMean.exchange) &&
        Objects.equals(this.timeframe, apiResponseCryptoOnBalanceVolumeMean.timeframe) &&
        Objects.equals(this.nextPage, apiResponseCryptoOnBalanceVolumeMean.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, pair, exchange, timeframe, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoOnBalanceVolumeMean {\n");
    
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

