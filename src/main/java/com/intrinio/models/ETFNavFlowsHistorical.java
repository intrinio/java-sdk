

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFNavFlow;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Historical NAV and flows data for an ETF with pagination
 */
@ApiModel(description = "Historical NAV and flows data for an ETF with pagination")

public class ETFNavFlowsHistorical {
  @SerializedName("nav_flows")
  private List<ETFNavFlow> navFlows = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public ETFNavFlowsHistorical navFlows(List<ETFNavFlow> navFlows) {
    this.navFlows = navFlows;
    return this;
  }

  public ETFNavFlowsHistorical addNavFlowsItem(ETFNavFlow navFlowsItem) {
    if (this.navFlows == null) {
      this.navFlows = new ArrayList<>();
    }
    this.navFlows.add(navFlowsItem);
    return this;
  }

   /**
   * Array of historical NAV flows data objects
   * @return navFlows
  **/
  @ApiModelProperty(value = "Array of historical NAV flows data objects")
  public List<ETFNavFlow> getNavFlows() {
    return navFlows;
  }

  public void setNavFlows(List<ETFNavFlow> navFlows) {
    this.navFlows = navFlows;
  }

  public ETFNavFlowsHistorical etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * A brief summary of the ETF to which these nav flows refer
   * @return etf
  **/
  @ApiModelProperty(value = "A brief summary of the ETF to which these nav flows refer")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }

  public ETFNavFlowsHistorical nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of results
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of results")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public ETFNavFlowsHistorical messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ETFNavFlowsHistorical addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Any messages, warnings, or additional information about the data
   * @return messages
  **/
  @ApiModelProperty(value = "Any messages, warnings, or additional information about the data")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFNavFlowsHistorical etFNavFlowsHistorical = (ETFNavFlowsHistorical) o;
    return Objects.equals(this.navFlows, etFNavFlowsHistorical.navFlows) &&
        Objects.equals(this.etf, etFNavFlowsHistorical.etf) &&
        Objects.equals(this.nextPage, etFNavFlowsHistorical.nextPage) &&
        Objects.equals(this.messages, etFNavFlowsHistorical.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(navFlows, etf, nextPage, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFNavFlowsHistorical {\n");
    
    sb.append("    navFlows: ").append(toIndentedString(navFlows)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

