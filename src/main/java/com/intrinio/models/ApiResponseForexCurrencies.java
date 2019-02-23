

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ForexCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseForexCurrencies
 */

public class ApiResponseForexCurrencies {
  @SerializedName("currencies")
  private List<ForexCurrency> currencies = null;

  public ApiResponseForexCurrencies currencies(List<ForexCurrency> currencies) {
    this.currencies = currencies;
    return this;
  }

  public ApiResponseForexCurrencies addCurrenciesItem(ForexCurrency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<ForexCurrency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(value = "")
  public List<ForexCurrency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<ForexCurrency> currencies) {
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
    ApiResponseForexCurrencies apiResponseForexCurrencies = (ApiResponseForexCurrencies) o;
    return Objects.equals(this.currencies, apiResponseForexCurrencies.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseForexCurrencies {\n");
    
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

