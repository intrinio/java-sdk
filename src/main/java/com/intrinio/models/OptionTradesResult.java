

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionTrades;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An option trades result contains all trades corresponding to the provided query.
 */
@ApiModel(description = "An option trades result contains all trades corresponding to the provided query.")

public class OptionTradesResult {
  @SerializedName("next_page")
  private String nextPage = null;

  /**
   * The source of the trades.
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    REALTIME("realtime"),
    
    DELAYED("delayed");

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

  @SerializedName("trades")
  private List<OptionTrades> trades = null;

  public OptionTradesResult nextPage(String nextPage) {
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

  public OptionTradesResult source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the trades.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the trades.")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public OptionTradesResult trades(List<OptionTrades> trades) {
    this.trades = trades;
    return this;
  }

  public OptionTradesResult addTradesItem(OptionTrades tradesItem) {
    if (this.trades == null) {
      this.trades = new ArrayList<>();
    }
    this.trades.add(tradesItem);
    return this;
  }

   /**
   * Array of all the trades in this page of the result.
   * @return trades
  **/
  @ApiModelProperty(value = "Array of all the trades in this page of the result.")
  public List<OptionTrades> getTrades() {
    return trades;
  }

  public void setTrades(List<OptionTrades> trades) {
    this.trades = trades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionTradesResult optionTradesResult = (OptionTradesResult) o;
    return Objects.equals(this.nextPage, optionTradesResult.nextPage) &&
        Objects.equals(this.source, optionTradesResult.source) &&
        Objects.equals(this.trades, optionTradesResult.trades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPage, source, trades);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionTradesResult {\n");
    
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
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

