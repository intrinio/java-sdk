

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanyDailyMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyDailyMetrics
 */

public class ApiResponseCompanyDailyMetrics {
  @SerializedName("daily_metrics")
  private List<CompanyDailyMetric> dailyMetrics = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyDailyMetrics dailyMetrics(List<CompanyDailyMetric> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  public ApiResponseCompanyDailyMetrics addDailyMetricsItem(CompanyDailyMetric dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<>();
    }
    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

   /**
   * Get dailyMetrics
   * @return dailyMetrics
  **/
  @ApiModelProperty(value = "")
  public List<CompanyDailyMetric> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<CompanyDailyMetric> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public ApiResponseCompanyDailyMetrics nextPage(String nextPage) {
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
    ApiResponseCompanyDailyMetrics apiResponseCompanyDailyMetrics = (ApiResponseCompanyDailyMetrics) o;
    return Objects.equals(this.dailyMetrics, apiResponseCompanyDailyMetrics.dailyMetrics) &&
        Objects.equals(this.nextPage, apiResponseCompanyDailyMetrics.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMetrics, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyDailyMetrics {\n");
    
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
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

