

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
 * The summary of a company instutionally owned sourced from Zacks.
 */
@ApiModel(description = "The summary of a company instutionally owned sourced from Zacks.")

public class ZacksInstitutionalHoldingCompanySummary {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("exchange")
  private String exchange = null;

  public ZacksInstitutionalHoldingCompanySummary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The Zacks common exchange ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "The Zacks common exchange ticker")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ZacksInstitutionalHoldingCompanySummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The company name of the stock listed
   * @return name
  **/
  @ApiModelProperty(value = "The company name of the stock listed")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZacksInstitutionalHoldingCompanySummary exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Exhange where the stock is traded whose shares are held by the institution
   * @return exchange
  **/
  @ApiModelProperty(value = "Exhange where the stock is traded whose shares are held by the institution")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHoldingCompanySummary zacksInstitutionalHoldingCompanySummary = (ZacksInstitutionalHoldingCompanySummary) o;
    return Objects.equals(this.ticker, zacksInstitutionalHoldingCompanySummary.ticker) &&
        Objects.equals(this.name, zacksInstitutionalHoldingCompanySummary.name) &&
        Objects.equals(this.exchange, zacksInstitutionalHoldingCompanySummary.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, name, exchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHoldingCompanySummary {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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

