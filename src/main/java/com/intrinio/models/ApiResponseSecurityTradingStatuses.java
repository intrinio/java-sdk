

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecurityTradingStatusSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityTradingStatuses
 */

public class ApiResponseSecurityTradingStatuses {
  @SerializedName("statuses")
  private List<SecurityTradingStatusSummary> statuses = null;

  /**
   * The status of the market.
   */
  @JsonAdapter(MarketStatusEnum.Adapter.class)
  public enum MarketStatusEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    PREMARKET("premarket"),
    
    POSTMARKET("postmarket"),
    
    CLOSED_EARLY("closed_early");

    private String value;

    MarketStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketStatusEnum fromValue(String text) {
      for (MarketStatusEnum b : MarketStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarketStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarketStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("market_status")
  private MarketStatusEnum marketStatus = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityTradingStatuses statuses(List<SecurityTradingStatusSummary> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApiResponseSecurityTradingStatuses addStatusesItem(SecurityTradingStatusSummary statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The trading statuses of each returned security.
   * @return statuses
  **/
  @ApiModelProperty(value = "The trading statuses of each returned security.")
  public List<SecurityTradingStatusSummary> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<SecurityTradingStatusSummary> statuses) {
    this.statuses = statuses;
  }

  public ApiResponseSecurityTradingStatuses marketStatus(MarketStatusEnum marketStatus) {
    this.marketStatus = marketStatus;
    return this;
  }

   /**
   * The status of the market.
   * @return marketStatus
  **/
  @ApiModelProperty(value = "The status of the market.")
  public MarketStatusEnum getMarketStatus() {
    return marketStatus;
  }

  public void setMarketStatus(MarketStatusEnum marketStatus) {
    this.marketStatus = marketStatus;
  }

  public ApiResponseSecurityTradingStatuses messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ApiResponseSecurityTradingStatuses addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * A list of messages related to the request, such as warnings or errors.
   * @return messages
  **/
  @ApiModelProperty(value = "A list of messages related to the request, such as warnings or errors.")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public ApiResponseSecurityTradingStatuses nextPage(String nextPage) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecurityTradingStatuses apiResponseSecurityTradingStatuses = (ApiResponseSecurityTradingStatuses) o;
    return Objects.equals(this.statuses, apiResponseSecurityTradingStatuses.statuses) &&
        Objects.equals(this.marketStatus, apiResponseSecurityTradingStatuses.marketStatus) &&
        Objects.equals(this.messages, apiResponseSecurityTradingStatuses.messages) &&
        Objects.equals(this.nextPage, apiResponseSecurityTradingStatuses.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, marketStatus, messages, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityTradingStatuses {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    marketStatus: ").append(toIndentedString(marketStatus)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

