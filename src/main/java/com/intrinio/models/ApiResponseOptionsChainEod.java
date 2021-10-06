

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionChainEod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsChainEod
 */

public class ApiResponseOptionsChainEod {
  @SerializedName("chain")
  private List<OptionChainEod> chain = null;

  public ApiResponseOptionsChainEod chain(List<OptionChainEod> chain) {
    this.chain = chain;
    return this;
  }

  public ApiResponseOptionsChainEod addChainItem(OptionChainEod chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<>();
    }
    this.chain.add(chainItem);
    return this;
  }

   /**
   * A list of realtime options for the provided expiration date their respective option prices.
   * @return chain
  **/
  @ApiModelProperty(value = "A list of realtime options for the provided expiration date their respective option prices.")
  public List<OptionChainEod> getChain() {
    return chain;
  }

  public void setChain(List<OptionChainEod> chain) {
    this.chain = chain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsChainEod apiResponseOptionsChainEod = (ApiResponseOptionsChainEod) o;
    return Objects.equals(this.chain, apiResponseOptionsChainEod.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsChainEod {\n");
    
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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

