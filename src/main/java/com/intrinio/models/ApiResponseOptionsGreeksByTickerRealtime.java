

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseOptionsGreekContractRealtime;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsGreeksByTickerRealtime
 */

public class ApiResponseOptionsGreeksByTickerRealtime {
  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("contracts")
  private List<ApiResponseOptionsGreekContractRealtime> contracts = null;

  public ApiResponseOptionsGreeksByTickerRealtime security(SecuritySummary security) {
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

  public ApiResponseOptionsGreeksByTickerRealtime nextPage(String nextPage) {
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

  public ApiResponseOptionsGreeksByTickerRealtime messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ApiResponseOptionsGreeksByTickerRealtime addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Any messages or warnings about the data
   * @return messages
  **/
  @ApiModelProperty(value = "Any messages or warnings about the data")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public ApiResponseOptionsGreeksByTickerRealtime contracts(List<ApiResponseOptionsGreekContractRealtime> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ApiResponseOptionsGreeksByTickerRealtime addContractsItem(ApiResponseOptionsGreekContractRealtime contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * The options greeks data for this security
   * @return contracts
  **/
  @ApiModelProperty(value = "The options greeks data for this security")
  public List<ApiResponseOptionsGreekContractRealtime> getContracts() {
    return contracts;
  }

  public void setContracts(List<ApiResponseOptionsGreekContractRealtime> contracts) {
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
    ApiResponseOptionsGreeksByTickerRealtime apiResponseOptionsGreeksByTickerRealtime = (ApiResponseOptionsGreeksByTickerRealtime) o;
    return Objects.equals(this.security, apiResponseOptionsGreeksByTickerRealtime.security) &&
        Objects.equals(this.nextPage, apiResponseOptionsGreeksByTickerRealtime.nextPage) &&
        Objects.equals(this.messages, apiResponseOptionsGreeksByTickerRealtime.messages) &&
        Objects.equals(this.contracts, apiResponseOptionsGreeksByTickerRealtime.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, nextPage, messages, contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsGreeksByTickerRealtime {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

