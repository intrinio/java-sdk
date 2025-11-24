

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
import org.threeten.bp.LocalDate;

/**
 * EarningsDateEstimateConfidenceIntervals
 */

public class EarningsDateEstimateConfidenceIntervals {
  @SerializedName("earliest")
  private LocalDate earliest = null;

  @SerializedName("latest")
  private LocalDate latest = null;

  public EarningsDateEstimateConfidenceIntervals earliest(LocalDate earliest) {
    this.earliest = earliest;
    return this;
  }

   /**
   * The earliest date in this confidence interval
   * @return earliest
  **/
  @ApiModelProperty(value = "The earliest date in this confidence interval")
  public LocalDate getEarliest() {
    return earliest;
  }

  public void setEarliest(LocalDate earliest) {
    this.earliest = earliest;
  }

  public EarningsDateEstimateConfidenceIntervals latest(LocalDate latest) {
    this.latest = latest;
    return this;
  }

   /**
   * The latest date in this confidence interval
   * @return latest
  **/
  @ApiModelProperty(value = "The latest date in this confidence interval")
  public LocalDate getLatest() {
    return latest;
  }

  public void setLatest(LocalDate latest) {
    this.latest = latest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsDateEstimateConfidenceIntervals earningsDateEstimateConfidenceIntervals = (EarningsDateEstimateConfidenceIntervals) o;
    return Objects.equals(this.earliest, earningsDateEstimateConfidenceIntervals.earliest) &&
        Objects.equals(this.latest, earningsDateEstimateConfidenceIntervals.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliest, latest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsDateEstimateConfidenceIntervals {\n");
    
    sb.append("    earliest: ").append(toIndentedString(earliest)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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

