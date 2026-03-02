

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ApiResponseSecurityTradingStatus
 */

public class ApiResponseSecurityTradingStatus {
  /**
   * The trading status of the security.
   */
  @JsonAdapter(TradingStatusEnum.Adapter.class)
  public enum TradingStatusEnum {
    TRADING("trading"),
    
    QUOTES_ONLY("quotes_only"),
    
    STOPPED("stopped");

    private String value;

    TradingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TradingStatusEnum fromValue(String text) {
      for (TradingStatusEnum b : TradingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TradingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TradingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TradingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TradingStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("trading_status")
  private TradingStatusEnum tradingStatus = null;

  @SerializedName("trading_status_reason")
  private String tradingStatusReason = null;

  @SerializedName("trading_status_updated_on")
  private OffsetDateTime tradingStatusUpdatedOn = null;

  @SerializedName("security")
  private SecuritySummary security = null;

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

  public ApiResponseSecurityTradingStatus tradingStatus(TradingStatusEnum tradingStatus) {
    this.tradingStatus = tradingStatus;
    return this;
  }

   /**
   * The trading status of the security.
   * @return tradingStatus
  **/
  @ApiModelProperty(value = "The trading status of the security.")
  public TradingStatusEnum getTradingStatus() {
    return tradingStatus;
  }

  public void setTradingStatus(TradingStatusEnum tradingStatus) {
    this.tradingStatus = tradingStatus;
  }

  public ApiResponseSecurityTradingStatus tradingStatusReason(String tradingStatusReason) {
    this.tradingStatusReason = tradingStatusReason;
    return this;
  }

   /**
   * The exchange supplied reason for its current status.
   * @return tradingStatusReason
  **/
  @ApiModelProperty(value = "The exchange supplied reason for its current status.")
  public String getTradingStatusReason() {
    return tradingStatusReason;
  }

  public void setTradingStatusReason(String tradingStatusReason) {
    this.tradingStatusReason = tradingStatusReason;
  }

  public ApiResponseSecurityTradingStatus tradingStatusUpdatedOn(OffsetDateTime tradingStatusUpdatedOn) {
    this.tradingStatusUpdatedOn = tradingStatusUpdatedOn;
    return this;
  }

   /**
   * The time the exchange reported that it changed its trading status.
   * @return tradingStatusUpdatedOn
  **/
  @ApiModelProperty(value = "The time the exchange reported that it changed its trading status.")
  public OffsetDateTime getTradingStatusUpdatedOn() {
    return tradingStatusUpdatedOn;
  }

  public void setTradingStatusUpdatedOn(OffsetDateTime tradingStatusUpdatedOn) {
    this.tradingStatusUpdatedOn = tradingStatusUpdatedOn;
  }

  public ApiResponseSecurityTradingStatus security(SecuritySummary security) {
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

  public ApiResponseSecurityTradingStatus marketStatus(MarketStatusEnum marketStatus) {
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

  public ApiResponseSecurityTradingStatus messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ApiResponseSecurityTradingStatus addMessagesItem(String messagesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecurityTradingStatus apiResponseSecurityTradingStatus = (ApiResponseSecurityTradingStatus) o;
    return Objects.equals(this.tradingStatus, apiResponseSecurityTradingStatus.tradingStatus) &&
        Objects.equals(this.tradingStatusReason, apiResponseSecurityTradingStatus.tradingStatusReason) &&
        Objects.equals(this.tradingStatusUpdatedOn, apiResponseSecurityTradingStatus.tradingStatusUpdatedOn) &&
        Objects.equals(this.security, apiResponseSecurityTradingStatus.security) &&
        Objects.equals(this.marketStatus, apiResponseSecurityTradingStatus.marketStatus) &&
        Objects.equals(this.messages, apiResponseSecurityTradingStatus.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradingStatus, tradingStatusReason, tradingStatusUpdatedOn, security, marketStatus, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityTradingStatus {\n");
    
    sb.append("    tradingStatus: ").append(toIndentedString(tradingStatus)).append("\n");
    sb.append("    tradingStatusReason: ").append(toIndentedString(tradingStatusReason)).append("\n");
    sb.append("    tradingStatusUpdatedOn: ").append(toIndentedString(tradingStatusUpdatedOn)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    marketStatus: ").append(toIndentedString(marketStatus)).append("\n");
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

