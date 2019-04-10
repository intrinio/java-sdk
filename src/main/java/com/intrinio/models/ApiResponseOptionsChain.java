

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionChain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsChain
 */

public class ApiResponseOptionsChain {
  @SerializedName("chain")
  private List<OptionChain> chain = null;

  public ApiResponseOptionsChain chain(List<OptionChain> chain) {
    this.chain = chain;
    return this;
  }

  public ApiResponseOptionsChain addChainItem(OptionChain chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<OptionChain>();
    }
    this.chain.add(chainItem);
    return this;
  }

   /**
   * A list of options for the provided expiration date their respective option prices.
   * @return chain
  **/
  @ApiModelProperty(value = "A list of options for the provided expiration date their respective option prices.")
  public List<OptionChain> getChain() {
    return chain;
  }

  public void setChain(List<OptionChain> chain) {
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
    ApiResponseOptionsChain apiResponseOptionsChain = (ApiResponseOptionsChain) o;
    return Objects.equals(this.chain, apiResponseOptionsChain.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsChain {\n");
    
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

