

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseOptionsPriceRealtime;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsPricesByTickerRealtime
 */

public class ApiResponseOptionsPricesByTickerRealtime {
  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("contracts")
  private List<ApiResponseOptionsPriceRealtime> contracts = null;

  public ApiResponseOptionsPricesByTickerRealtime security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security resolved from the given identifier
   * @return security
  **/
  @ApiModelProperty(value = "The Security resolved from the given identifier")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseOptionsPricesByTickerRealtime nextPage(String nextPage) {
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

  public ApiResponseOptionsPricesByTickerRealtime contracts(List<ApiResponseOptionsPriceRealtime> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ApiResponseOptionsPricesByTickerRealtime addContractsItem(ApiResponseOptionsPriceRealtime contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * The contracts pricing for this security.
   * @return contracts
  **/
  @ApiModelProperty(value = "The contracts pricing for this security.")
  public List<ApiResponseOptionsPriceRealtime> getContracts() {
    return contracts;
  }

  public void setContracts(List<ApiResponseOptionsPriceRealtime> contracts) {
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
    ApiResponseOptionsPricesByTickerRealtime apiResponseOptionsPricesByTickerRealtime = (ApiResponseOptionsPricesByTickerRealtime) o;
    return Objects.equals(this.security, apiResponseOptionsPricesByTickerRealtime.security) &&
        Objects.equals(this.nextPage, apiResponseOptionsPricesByTickerRealtime.nextPage) &&
        Objects.equals(this.contracts, apiResponseOptionsPricesByTickerRealtime.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, nextPage, contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsPricesByTickerRealtime {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

