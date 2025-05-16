

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.IndexInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseIndexIntervals
 */

public class ApiResponseIndexIntervals {
  @SerializedName("intervals")
  private List<IndexInterval> intervals = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseIndexIntervals intervals(List<IndexInterval> intervals) {
    this.intervals = intervals;
    return this;
  }

  public ApiResponseIndexIntervals addIntervalsItem(IndexInterval intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Array of index intervals
   * @return intervals
  **/
  @ApiModelProperty(value = "Array of index intervals")
  public List<IndexInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<IndexInterval> intervals) {
    this.intervals = intervals;
  }

  public ApiResponseIndexIntervals nextPage(String nextPage) {
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
    ApiResponseIndexIntervals apiResponseIndexIntervals = (ApiResponseIndexIntervals) o;
    return Objects.equals(this.intervals, apiResponseIndexIntervals.intervals) &&
        Objects.equals(this.nextPage, apiResponseIndexIntervals.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseIndexIntervals {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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

