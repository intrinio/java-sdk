

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ForexPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseForexPairs
 */

public class ApiResponseForexPairs {
  @SerializedName("pairs")
  private List<ForexPair> pairs = null;

  public ApiResponseForexPairs pairs(List<ForexPair> pairs) {
    this.pairs = pairs;
    return this;
  }

  public ApiResponseForexPairs addPairsItem(ForexPair pairsItem) {
    if (this.pairs == null) {
      this.pairs = new ArrayList<ForexPair>();
    }
    this.pairs.add(pairsItem);
    return this;
  }

   /**
   * Get pairs
   * @return pairs
  **/
  @ApiModelProperty(value = "")
  public List<ForexPair> getPairs() {
    return pairs;
  }

  public void setPairs(List<ForexPair> pairs) {
    this.pairs = pairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseForexPairs apiResponseForexPairs = (ApiResponseForexPairs) o;
    return Objects.equals(this.pairs, apiResponseForexPairs.pairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseForexPairs {\n");
    
    sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
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

