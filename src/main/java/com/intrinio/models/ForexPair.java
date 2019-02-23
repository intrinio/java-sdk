

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
 * A Forex Currency Pair
 */
@ApiModel(description = "A Forex Currency Pair")

public class ForexPair {
  @SerializedName("code")
  private String code = null;

  @SerializedName("base_currency")
  private String baseCurrency = null;

  @SerializedName("quote_currency")
  private String quoteCurrency = null;

  public ForexPair code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The common code of the currency pair
   * @return code
  **/
  @ApiModelProperty(example = "EURUSD", value = "The common code of the currency pair")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ForexPair baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * The ISO 4217 currency code of the base currency
   * @return baseCurrency
  **/
  @ApiModelProperty(example = "EUR", value = "The ISO 4217 currency code of the base currency")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public ForexPair quoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
    return this;
  }

   /**
   * The ISO 4217 currency code of the quote currency
   * @return quoteCurrency
  **/
  @ApiModelProperty(example = "USD", value = "The ISO 4217 currency code of the quote currency")
  public String getQuoteCurrency() {
    return quoteCurrency;
  }

  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForexPair forexPair = (ForexPair) o;
    return Objects.equals(this.code, forexPair.code) &&
        Objects.equals(this.baseCurrency, forexPair.baseCurrency) &&
        Objects.equals(this.quoteCurrency, forexPair.quoteCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, baseCurrency, quoteCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForexPair {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
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

