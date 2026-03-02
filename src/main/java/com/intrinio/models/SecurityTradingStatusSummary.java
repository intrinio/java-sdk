

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
import org.threeten.bp.OffsetDateTime;

/**
 * SecurityTradingStatusSummary
 */

public class SecurityTradingStatusSummary {
  @SerializedName("security")
  private SecuritySummary security = null;

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

  public SecurityTradingStatusSummary security(SecuritySummary security) {
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

  public SecurityTradingStatusSummary tradingStatus(TradingStatusEnum tradingStatus) {
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

  public SecurityTradingStatusSummary tradingStatusReason(String tradingStatusReason) {
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

  public SecurityTradingStatusSummary tradingStatusUpdatedOn(OffsetDateTime tradingStatusUpdatedOn) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityTradingStatusSummary securityTradingStatusSummary = (SecurityTradingStatusSummary) o;
    return Objects.equals(this.security, securityTradingStatusSummary.security) &&
        Objects.equals(this.tradingStatus, securityTradingStatusSummary.tradingStatus) &&
        Objects.equals(this.tradingStatusReason, securityTradingStatusSummary.tradingStatusReason) &&
        Objects.equals(this.tradingStatusUpdatedOn, securityTradingStatusSummary.tradingStatusUpdatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, tradingStatus, tradingStatusReason, tradingStatusUpdatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityTradingStatusSummary {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    tradingStatus: ").append(toIndentedString(tradingStatus)).append("\n");
    sb.append("    tradingStatusReason: ").append(toIndentedString(tradingStatusReason)).append("\n");
    sb.append("    tradingStatusUpdatedOn: ").append(toIndentedString(tradingStatusUpdatedOn)).append("\n");
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

