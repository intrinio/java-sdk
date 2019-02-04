

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.IntradayStockPrice;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityIntradayPrices
 */

public class ApiResponseSecurityIntradayPrices {
  @SerializedName("intraday_prices")
  private List<IntradayStockPrice> intradayPrices = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  /**
   * The source of the data
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    IEX("iex"),
    
    BATS("bats");

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

  public ApiResponseSecurityIntradayPrices intradayPrices(List<IntradayStockPrice> intradayPrices) {
    this.intradayPrices = intradayPrices;
    return this;
  }

  public ApiResponseSecurityIntradayPrices addIntradayPricesItem(IntradayStockPrice intradayPricesItem) {
    if (this.intradayPrices == null) {
      this.intradayPrices = new ArrayList<IntradayStockPrice>();
    }
    this.intradayPrices.add(intradayPricesItem);
    return this;
  }

   /**
   * The intraday stock prices for the Security
   * @return intradayPrices
  **/
  @ApiModelProperty(value = "The intraday stock prices for the Security")
  public List<IntradayStockPrice> getIntradayPrices() {
    return intradayPrices;
  }

  public void setIntradayPrices(List<IntradayStockPrice> intradayPrices) {
    this.intradayPrices = intradayPrices;
  }

  public ApiResponseSecurityIntradayPrices security(SecuritySummary security) {
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

  public ApiResponseSecurityIntradayPrices source(SourceEnum source) {
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

  public ApiResponseSecurityIntradayPrices nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    ApiResponseSecurityIntradayPrices apiResponseSecurityIntradayPrices = (ApiResponseSecurityIntradayPrices) o;
    return Objects.equals(this.intradayPrices, apiResponseSecurityIntradayPrices.intradayPrices) &&
        Objects.equals(this.security, apiResponseSecurityIntradayPrices.security) &&
        Objects.equals(this.source, apiResponseSecurityIntradayPrices.source) &&
        Objects.equals(this.nextPage, apiResponseSecurityIntradayPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intradayPrices, security, source, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityIntradayPrices {\n");
    
    sb.append("    intradayPrices: ").append(toIndentedString(intradayPrices)).append("\n");
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

