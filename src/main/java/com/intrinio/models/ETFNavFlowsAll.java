

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
 * Latest NAV and flows data for all ETFs, sorted by month-end assets
 */
@ApiModel(description = "Latest NAV and flows data for all ETFs, sorted by month-end assets")

public class ETFNavFlowsAll {
  @SerializedName("nav_flows")
  private List<Object> navFlows = null;

  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("messages")
  private List<String> messages = null;

  public ETFNavFlowsAll navFlows(List<Object> navFlows) {
    this.navFlows = navFlows;
    return this;
  }

  public ETFNavFlowsAll addNavFlowsItem(Object navFlowsItem) {
    if (this.navFlows == null) {
      this.navFlows = new ArrayList<>();
    }
    this.navFlows.add(navFlowsItem);
    return this;
  }

   /**
   * Array of latest NAV flows data objects for all ETFs
   * @return navFlows
  **/
  @ApiModelProperty(value = "Array of latest NAV flows data objects for all ETFs")
  public List<Object> getNavFlows() {
    return navFlows;
  }

  public void setNavFlows(List<Object> navFlows) {
    this.navFlows = navFlows;
  }

  public ETFNavFlowsAll nextPage(String nextPage) {
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

  public ETFNavFlowsAll messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ETFNavFlowsAll addMessagesItem(String messagesItem) {
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
    ETFNavFlowsAll etFNavFlowsAll = (ETFNavFlowsAll) o;
    return Objects.equals(this.navFlows, etFNavFlowsAll.navFlows) &&
        Objects.equals(this.nextPage, etFNavFlowsAll.nextPage) &&
        Objects.equals(this.messages, etFNavFlowsAll.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(navFlows, nextPage, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFNavFlowsAll {\n");
    
    sb.append("    navFlows: ").append(toIndentedString(navFlows)).append("\n");
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

