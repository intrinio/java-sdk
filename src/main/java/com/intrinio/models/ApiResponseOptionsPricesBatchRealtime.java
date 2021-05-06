

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionPriceBatchRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsPricesBatchRealtime
 */

public class ApiResponseOptionsPricesBatchRealtime {
  @SerializedName("contracts")
  private List<OptionPriceBatchRealtime> contracts = null;

  public ApiResponseOptionsPricesBatchRealtime contracts(List<OptionPriceBatchRealtime> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ApiResponseOptionsPricesBatchRealtime addContractsItem(OptionPriceBatchRealtime contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(value = "")
  public List<OptionPriceBatchRealtime> getContracts() {
    return contracts;
  }

  public void setContracts(List<OptionPriceBatchRealtime> contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsPricesBatchRealtime apiResponseOptionsPricesBatchRealtime = (ApiResponseOptionsPricesBatchRealtime) o;
    return Objects.equals(this.contracts, apiResponseOptionsPricesBatchRealtime.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsPricesBatchRealtime {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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

