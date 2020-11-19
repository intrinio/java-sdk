

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionChainRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsChainRealtime
 */

public class ApiResponseOptionsChainRealtime {
  @SerializedName("chain")
  private List<OptionChainRealtime> chain = null;

  public ApiResponseOptionsChainRealtime chain(List<OptionChainRealtime> chain) {
    this.chain = chain;
    return this;
  }

  public ApiResponseOptionsChainRealtime addChainItem(OptionChainRealtime chainItem) {
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
  public List<OptionChainRealtime> getChain() {
    return chain;
  }

  public void setChain(List<OptionChainRealtime> chain) {
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
    ApiResponseOptionsChainRealtime apiResponseOptionsChainRealtime = (ApiResponseOptionsChainRealtime) o;
    return Objects.equals(this.chain, apiResponseOptionsChainRealtime.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsChainRealtime {\n");
    
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

