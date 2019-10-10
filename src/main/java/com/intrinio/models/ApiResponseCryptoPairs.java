

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCryptoPairs
 */

public class ApiResponseCryptoPairs {
  @SerializedName("pairs")
  private List<CryptoPair> pairs = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCryptoPairs pairs(List<CryptoPair> pairs) {
    this.pairs = pairs;
    return this;
  }

  public ApiResponseCryptoPairs addPairsItem(CryptoPair pairsItem) {
    if (this.pairs == null) {
      this.pairs = new ArrayList<CryptoPair>();
    }
    this.pairs.add(pairsItem);
    return this;
  }

   /**
   * A list of Crypto Currency Pairs for the given Crypto Exchange and Crypto Currency sorted alphabetically by code.
   * @return pairs
  **/
  @ApiModelProperty(value = "A list of Crypto Currency Pairs for the given Crypto Exchange and Crypto Currency sorted alphabetically by code.")
  public List<CryptoPair> getPairs() {
    return pairs;
  }

  public void setPairs(List<CryptoPair> pairs) {
    this.pairs = pairs;
  }

  public ApiResponseCryptoPairs nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further results are available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further results are available.")
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
    ApiResponseCryptoPairs apiResponseCryptoPairs = (ApiResponseCryptoPairs) o;
    return Objects.equals(this.pairs, apiResponseCryptoPairs.pairs) &&
        Objects.equals(this.nextPage, apiResponseCryptoPairs.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairs, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoPairs {\n");
    
    sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
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

