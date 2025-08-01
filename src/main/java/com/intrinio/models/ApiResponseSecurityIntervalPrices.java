

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.StockPriceInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityIntervalPrices
 */

public class ApiResponseSecurityIntervalPrices {
  @SerializedName("intervals")
  private List<StockPriceInterval> intervals = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  /**
   * The source of the data
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    REALTIME("realtime"),
    
    DELAYED("delayed"),
    
    NASDAQ_BASIC("nasdaq_basic"),
    
    NASDAQ_BASIC_FILTERED("nasdaq_basic_filtered"),
    
    NASDAQ_BASIC_LAST_SALE("nasdaq_basic_last_sale"),
    
    CBOE_ONE("cboe_one");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityIntervalPrices intervals(List<StockPriceInterval> intervals) {
    this.intervals = intervals;
    return this;
  }

  public ApiResponseSecurityIntervalPrices addIntervalsItem(StockPriceInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Open, close, high, low, volume, average price, and change ratio for a particular interval
   * @return intervals
  **/
  @ApiModelProperty(value = "Open, close, high, low, volume, average price, and change ratio for a particular interval")
  public List<StockPriceInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<StockPriceInterval> intervals) {
    this.intervals = intervals;
  }

  public ApiResponseSecurityIntervalPrices security(SecuritySummary security) {
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

  public ApiResponseSecurityIntervalPrices source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the data
   * @return source
  **/
  @ApiModelProperty(value = "The source of the data")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public ApiResponseSecurityIntervalPrices nextPage(String nextPage) {
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
    ApiResponseSecurityIntervalPrices apiResponseSecurityIntervalPrices = (ApiResponseSecurityIntervalPrices) o;
    return Objects.equals(this.intervals, apiResponseSecurityIntervalPrices.intervals) &&
        Objects.equals(this.security, apiResponseSecurityIntervalPrices.security) &&
        Objects.equals(this.source, apiResponseSecurityIntervalPrices.source) &&
        Objects.equals(this.nextPage, apiResponseSecurityIntervalPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, security, source, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityIntervalPrices {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

