

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
import java.util.ArrayList;
import java.util.List;

/**
 * OptionContractsList
 */

public class OptionContractsList {
  @SerializedName("contracts")
  private List<String> contracts = null;

  public OptionContractsList contracts(List<String> contracts) {
    this.contracts = contracts;
    return this;
  }

  public OptionContractsList addContractsItem(String contractsItem) {
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
  @ApiModelProperty(example = "[\"A220121P00055000\",\"A220121P00057500\",\"A220121P00060000\"]", value = "")
  public List<String> getContracts() {
    return contracts;
  }

  public void setContracts(List<String> contracts) {
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
    OptionContractsList optionContractsList = (OptionContractsList) o;
    return Objects.equals(this.contracts, optionContractsList.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionContractsList {\n");
    
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

