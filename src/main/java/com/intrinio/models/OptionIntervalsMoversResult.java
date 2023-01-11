

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionIntervalMover;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * An options intervals result contains all options intervals corresponding to the provided query.
 */
@ApiModel(description = "An options intervals result contains all options intervals corresponding to the provided query.")

public class OptionIntervalsMoversResult {
  @SerializedName("open_time")
  private OffsetDateTime openTime = null;

  @SerializedName("close_time")
  private OffsetDateTime closeTime = null;

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

  @SerializedName("intervals")
  private List<OptionIntervalMover> intervals = null;

  public OptionIntervalsMoversResult openTime(OffsetDateTime openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * The UTC timestamp for the time this interval opened.
   * @return openTime
  **/
  @ApiModelProperty(value = "The UTC timestamp for the time this interval opened.")
  public OffsetDateTime getOpenTime() {
    return openTime;
  }

  public void setOpenTime(OffsetDateTime openTime) {
    this.openTime = openTime;
  }

  public OptionIntervalsMoversResult closeTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * The UTC timestamp for the time this interval closed.
   * @return closeTime
  **/
  @ApiModelProperty(value = "The UTC timestamp for the time this interval closed.")
  public OffsetDateTime getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
  }

  public OptionIntervalsMoversResult size(SizeEnum size) {
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

  public OptionIntervalsMoversResult intervals(List<OptionIntervalMover> intervals) {
    this.intervals = intervals;
    return this;
  }

  public OptionIntervalsMoversResult addIntervalsItem(OptionIntervalMover intervalsItem) {
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
  public List<OptionIntervalMover> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<OptionIntervalMover> intervals) {
    this.intervals = intervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionIntervalsMoversResult optionIntervalsMoversResult = (OptionIntervalsMoversResult) o;
    return Objects.equals(this.openTime, optionIntervalsMoversResult.openTime) &&
        Objects.equals(this.closeTime, optionIntervalsMoversResult.closeTime) &&
        Objects.equals(this.size, optionIntervalsMoversResult.size) &&
        Objects.equals(this.intervals, optionIntervalsMoversResult.intervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openTime, closeTime, size, intervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionIntervalsMoversResult {\n");
    
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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

