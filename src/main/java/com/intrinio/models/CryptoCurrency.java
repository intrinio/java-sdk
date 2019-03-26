

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
 * A Crypto Currency is a digital or virtual currency that uses cryptography for security. They trade as Crypto Currency Pairs with fiat currencies (USD) or other Crypto Currences (ETH) on Crypto Exchanges, similar to Forex. Included are the name, code, symbol, and the first and last dates for which price data is available for the given Crypto Currency.
 */
@ApiModel(description = "A Crypto Currency is a digital or virtual currency that uses cryptography for security. They trade as Crypto Currency Pairs with fiat currencies (USD) or other Crypto Currences (ETH) on Crypto Exchanges, similar to Forex. Included are the name, code, symbol, and the first and last dates for which price data is available for the given Crypto Currency.")

public class CryptoCurrency {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("first_price_date")
  private String firstPriceDate = null;

  @SerializedName("last_price_date")
  private String lastPriceDate = null;

  public CryptoCurrency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The common name of the crypto currency.
   * @return name
  **/
  @ApiModelProperty(example = "Bitcoin", value = "The common name of the crypto currency.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoCurrency code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A code representing the crypto currency.
   * @return code
  **/
  @ApiModelProperty(example = "bitcoin", value = "A code representing the crypto currency.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CryptoCurrency symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the Crypto Currency.
   * @return symbol
  **/
  @ApiModelProperty(example = "BTC", value = "The symbol of the Crypto Currency.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CryptoCurrency firstPriceDate(String firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
    return this;
  }

   /**
   * The earliest date that daily historical pricing is available for.
   * @return firstPriceDate
  **/
  @ApiModelProperty(value = "The earliest date that daily historical pricing is available for.")
  public String getFirstPriceDate() {
    return firstPriceDate;
  }

  public void setFirstPriceDate(String firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
  }

  public CryptoCurrency lastPriceDate(String lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
    return this;
  }

   /**
   * The most recent date that daily historical pricing is available for.
   * @return lastPriceDate
  **/
  @ApiModelProperty(example = "2018-08-30", value = "The most recent date that daily historical pricing is available for.")
  public String getLastPriceDate() {
    return lastPriceDate;
  }

  public void setLastPriceDate(String lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoCurrency cryptoCurrency = (CryptoCurrency) o;
    return Objects.equals(this.name, cryptoCurrency.name) &&
        Objects.equals(this.code, cryptoCurrency.code) &&
        Objects.equals(this.symbol, cryptoCurrency.symbol) &&
        Objects.equals(this.firstPriceDate, cryptoCurrency.firstPriceDate) &&
        Objects.equals(this.lastPriceDate, cryptoCurrency.lastPriceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, symbol, firstPriceDate, lastPriceDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoCurrency {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    firstPriceDate: ").append(toIndentedString(firstPriceDate)).append("\n");
    sb.append("    lastPriceDate: ").append(toIndentedString(lastPriceDate)).append("\n");
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

