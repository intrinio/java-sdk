

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCryptoExchanges
 */

public class ApiResponseCryptoExchanges {
  @SerializedName("exchanges")
  private List<CryptoExchange> exchanges = null;

  public ApiResponseCryptoExchanges exchanges(List<CryptoExchange> exchanges) {
    this.exchanges = exchanges;
    return this;
  }

  public ApiResponseCryptoExchanges addExchangesItem(CryptoExchange exchangesItem) {
    if (this.exchanges == null) {
      this.exchanges = new ArrayList<CryptoExchange>();
    }
    this.exchanges.add(exchangesItem);
    return this;
  }

   /**
   * A list of Crypto Exchanges for the given Crypto Currency Pair sorted alphabetically by code.
   * @return exchanges
  **/
  @ApiModelProperty(value = "A list of Crypto Exchanges for the given Crypto Currency Pair sorted alphabetically by code.")
  public List<CryptoExchange> getExchanges() {
    return exchanges;
  }

  public void setExchanges(List<CryptoExchange> exchanges) {
    this.exchanges = exchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCryptoExchanges apiResponseCryptoExchanges = (ApiResponseCryptoExchanges) o;
    return Objects.equals(this.exchanges, apiResponseCryptoExchanges.exchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoExchanges {\n");
    
    sb.append("    exchanges: ").append(toIndentedString(exchanges)).append("\n");
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

