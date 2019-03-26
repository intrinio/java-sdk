

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCryptoCurrencies
 */

public class ApiResponseCryptoCurrencies {
  @SerializedName("currencies")
  private List<CryptoCurrency> currencies = null;

  public ApiResponseCryptoCurrencies currencies(List<CryptoCurrency> currencies) {
    this.currencies = currencies;
    return this;
  }

  public ApiResponseCryptoCurrencies addCurrenciesItem(CryptoCurrency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<CryptoCurrency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * A list of Crypto Currencies for the given Crypto Exchange sorted by alphabetically by symbol.
   * @return currencies
  **/
  @ApiModelProperty(value = "A list of Crypto Currencies for the given Crypto Exchange sorted by alphabetically by symbol.")
  public List<CryptoCurrency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<CryptoCurrency> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCryptoCurrencies apiResponseCryptoCurrencies = (ApiResponseCryptoCurrencies) o;
    return Objects.equals(this.currencies, apiResponseCryptoCurrencies.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoCurrencies {\n");
    
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

