

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionFactorsRealtime;
import com.intrinio.models.OptionRealtime;
import com.intrinio.models.OptionStatsRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiResponseOptionsStatsRealtime
 */

public class ApiResponseOptionsStatsRealtime {
  @SerializedName("stats")
  private OptionStatsRealtime stats = null;

  @SerializedName("factors")
  private OptionFactorsRealtime factors = null;

  @SerializedName("option")
  private OptionRealtime option = null;

  public ApiResponseOptionsStatsRealtime stats(OptionStatsRealtime stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public OptionStatsRealtime getStats() {
    return stats;
  }

  public void setStats(OptionStatsRealtime stats) {
    this.stats = stats;
  }

  public ApiResponseOptionsStatsRealtime factors(OptionFactorsRealtime factors) {
    this.factors = factors;
    return this;
  }

   /**
   * Get factors
   * @return factors
  **/
  @ApiModelProperty(value = "")
  public OptionFactorsRealtime getFactors() {
    return factors;
  }

  public void setFactors(OptionFactorsRealtime factors) {
    this.factors = factors;
  }

  public ApiResponseOptionsStatsRealtime option(OptionRealtime option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public OptionRealtime getOption() {
    return option;
  }

  public void setOption(OptionRealtime option) {
    this.option = option;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsStatsRealtime apiResponseOptionsStatsRealtime = (ApiResponseOptionsStatsRealtime) o;
    return Objects.equals(this.stats, apiResponseOptionsStatsRealtime.stats) &&
        Objects.equals(this.factors, apiResponseOptionsStatsRealtime.factors) &&
        Objects.equals(this.option, apiResponseOptionsStatsRealtime.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats, factors, option);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsStatsRealtime {\n");
    
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

