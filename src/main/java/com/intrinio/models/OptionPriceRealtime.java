

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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * An option price contains price information for a specific options contract.
 */
@ApiModel(description = "An option price contains price information for a specific options contract.")

public class OptionPriceRealtime {
  @SerializedName("last")
  private BigDecimal last = null;

  @SerializedName("last_size")
  private Integer lastSize = null;

  @SerializedName("last_timestamp")
  private OffsetDateTime lastTimestamp = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("ask")
  private BigDecimal ask = null;

  @SerializedName("ask_size")
  private Integer askSize = null;

  @SerializedName("ask_timestamp")
  private OffsetDateTime askTimestamp = null;

  @SerializedName("bid")
  private BigDecimal bid = null;

  @SerializedName("bid_size")
  private Integer bidSize = null;

  @SerializedName("bid_timestamp")
  private OffsetDateTime bidTimestamp = null;

  @SerializedName("open_interest")
  private Integer openInterest = null;

  /**
   * The exercise style of the option.  (\&quot;A\&quot; &#x3D; \&quot;American\&quot;, \&quot;E\&quot; &#x3D; \&quot;European\&quot;)
   */
  @JsonAdapter(ExerciseStyleEnum.Adapter.class)
  public enum ExerciseStyleEnum {
    A("A"),
    
    E("E");

    private String value;

    ExerciseStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExerciseStyleEnum fromValue(String text) {
      for (ExerciseStyleEnum b : ExerciseStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExerciseStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExerciseStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExerciseStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExerciseStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("exercise_style")
  private ExerciseStyleEnum exerciseStyle = null;

  public OptionPriceRealtime last(BigDecimal last) {
    this.last = last;
    return this;
  }

   /**
   * The price of the last trade
   * @return last
  **/
  @ApiModelProperty(value = "The price of the last trade")
  public BigDecimal getLast() {
    return last;
  }

  public void setLast(BigDecimal last) {
    this.last = last;
  }

  public OptionPriceRealtime lastSize(Integer lastSize) {
    this.lastSize = lastSize;
    return this;
  }

   /**
   * The size of the last trade
   * @return lastSize
  **/
  @ApiModelProperty(value = "The size of the last trade")
  public Integer getLastSize() {
    return lastSize;
  }

  public void setLastSize(Integer lastSize) {
    this.lastSize = lastSize;
  }

  public OptionPriceRealtime lastTimestamp(OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

   /**
   * The time of the last trade
   * @return lastTimestamp
  **/
  @ApiModelProperty(value = "The time of the last trade")
  public OffsetDateTime getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public OptionPriceRealtime volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The cumulative volume of this options contract that traded that day.
   * @return volume
  **/
  @ApiModelProperty(value = "The cumulative volume of this options contract that traded that day.")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public OptionPriceRealtime ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

   /**
   * The price of the top ask order
   * @return ask
  **/
  @ApiModelProperty(value = "The price of the top ask order")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public OptionPriceRealtime askSize(Integer askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * The size of the top ask order
   * @return askSize
  **/
  @ApiModelProperty(value = "The size of the top ask order")
  public Integer getAskSize() {
    return askSize;
  }

  public void setAskSize(Integer askSize) {
    this.askSize = askSize;
  }

  public OptionPriceRealtime askTimestamp(OffsetDateTime askTimestamp) {
    this.askTimestamp = askTimestamp;
    return this;
  }

   /**
   * The timestamp of the top ask order
   * @return askTimestamp
  **/
  @ApiModelProperty(value = "The timestamp of the top ask order")
  public OffsetDateTime getAskTimestamp() {
    return askTimestamp;
  }

  public void setAskTimestamp(OffsetDateTime askTimestamp) {
    this.askTimestamp = askTimestamp;
  }

  public OptionPriceRealtime bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

   /**
   * The price of the top bid order
   * @return bid
  **/
  @ApiModelProperty(value = "The price of the top bid order")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public OptionPriceRealtime bidSize(Integer bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * The size of the top bid order
   * @return bidSize
  **/
  @ApiModelProperty(value = "The size of the top bid order")
  public Integer getBidSize() {
    return bidSize;
  }

  public void setBidSize(Integer bidSize) {
    this.bidSize = bidSize;
  }

  public OptionPriceRealtime bidTimestamp(OffsetDateTime bidTimestamp) {
    this.bidTimestamp = bidTimestamp;
    return this;
  }

   /**
   * The time of the top bid order
   * @return bidTimestamp
  **/
  @ApiModelProperty(value = "The time of the top bid order")
  public OffsetDateTime getBidTimestamp() {
    return bidTimestamp;
  }

  public void setBidTimestamp(OffsetDateTime bidTimestamp) {
    this.bidTimestamp = bidTimestamp;
  }

  public OptionPriceRealtime openInterest(Integer openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * The total number of this options contract that are still open.
   * @return openInterest
  **/
  @ApiModelProperty(value = "The total number of this options contract that are still open.")
  public Integer getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(Integer openInterest) {
    this.openInterest = openInterest;
  }

  public OptionPriceRealtime exerciseStyle(ExerciseStyleEnum exerciseStyle) {
    this.exerciseStyle = exerciseStyle;
    return this;
  }

   /**
   * The exercise style of the option.  (\&quot;A\&quot; &#x3D; \&quot;American\&quot;, \&quot;E\&quot; &#x3D; \&quot;European\&quot;)
   * @return exerciseStyle
  **/
  @ApiModelProperty(value = "The exercise style of the option.  (\"A\" = \"American\", \"E\" = \"European\")")
  public ExerciseStyleEnum getExerciseStyle() {
    return exerciseStyle;
  }

  public void setExerciseStyle(ExerciseStyleEnum exerciseStyle) {
    this.exerciseStyle = exerciseStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionPriceRealtime optionPriceRealtime = (OptionPriceRealtime) o;
    return Objects.equals(this.last, optionPriceRealtime.last) &&
        Objects.equals(this.lastSize, optionPriceRealtime.lastSize) &&
        Objects.equals(this.lastTimestamp, optionPriceRealtime.lastTimestamp) &&
        Objects.equals(this.volume, optionPriceRealtime.volume) &&
        Objects.equals(this.ask, optionPriceRealtime.ask) &&
        Objects.equals(this.askSize, optionPriceRealtime.askSize) &&
        Objects.equals(this.askTimestamp, optionPriceRealtime.askTimestamp) &&
        Objects.equals(this.bid, optionPriceRealtime.bid) &&
        Objects.equals(this.bidSize, optionPriceRealtime.bidSize) &&
        Objects.equals(this.bidTimestamp, optionPriceRealtime.bidTimestamp) &&
        Objects.equals(this.openInterest, optionPriceRealtime.openInterest) &&
        Objects.equals(this.exerciseStyle, optionPriceRealtime.exerciseStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, lastSize, lastTimestamp, volume, ask, askSize, askTimestamp, bid, bidSize, bidTimestamp, openInterest, exerciseStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionPriceRealtime {\n");
    
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    lastSize: ").append(toIndentedString(lastSize)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    askTimestamp: ").append(toIndentedString(askTimestamp)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    bidTimestamp: ").append(toIndentedString(bidTimestamp)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    exerciseStyle: ").append(toIndentedString(exerciseStyle)).append("\n");
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

