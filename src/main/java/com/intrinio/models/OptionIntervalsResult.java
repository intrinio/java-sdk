

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An options intervals result contains all options intervals corresponding to the provided query.
 */
@ApiModel(description = "An options intervals result contains all options intervals corresponding to the provided query.")

public class OptionIntervalsResult {
  @SerializedName("intervals")
  private List<OptionInterval> intervals = null;

  @SerializedName("contract")
  private String contract = null;

  /**
   * The size of the time span for the interval.
   */
  @JsonAdapter(SizeEnum.Adapter.class)
  public enum SizeEnum {
    SIXTYMINUTE("SixtyMinute"),
    
    THIRTYMINUTE("ThirtyMinute"),
    
    FIFTEENMINUTE("FifteenMinute"),
    
    TENMINUTE("TenMinute"),
    
    FIVEMINUTE("FiveMinute"),
    
    ONEMINUTE("OneMinute");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeEnum fromValue(String text) {
      for (SizeEnum b : SizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("size")
  private SizeEnum size = null;

  public OptionIntervalsResult intervals(List<OptionInterval> intervals) {
    this.intervals = intervals;
    return this;
  }

  public OptionIntervalsResult addIntervalsItem(OptionInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Array of all the intervals in the result.
   * @return intervals
  **/
  @ApiModelProperty(value = "Array of all the intervals in the result.")
  public List<OptionInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<OptionInterval> intervals) {
    this.intervals = intervals;
  }

  public OptionIntervalsResult contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The option contract for the intervals
   * @return contract
  **/
  @ApiModelProperty(value = "The option contract for the intervals")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public OptionIntervalsResult size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the time span for the interval.
   * @return size
  **/
  @ApiModelProperty(value = "The size of the time span for the interval.")
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionIntervalsResult optionIntervalsResult = (OptionIntervalsResult) o;
    return Objects.equals(this.intervals, optionIntervalsResult.intervals) &&
        Objects.equals(this.contract, optionIntervalsResult.contract) &&
        Objects.equals(this.size, optionIntervalsResult.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, contract, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionIntervalsResult {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

