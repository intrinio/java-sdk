

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DailyShortVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecuritiesDailyShortVolume
 */

public class ApiResponseSecuritiesDailyShortVolume {
  @SerializedName("daily_short_volume")
  private List<DailyShortVolume> dailyShortVolume = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecuritiesDailyShortVolume dailyShortVolume(List<DailyShortVolume> dailyShortVolume) {
    this.dailyShortVolume = dailyShortVolume;
    return this;
  }

  public ApiResponseSecuritiesDailyShortVolume addDailyShortVolumeItem(DailyShortVolume dailyShortVolumeItem) {
    if (this.dailyShortVolume == null) {
      this.dailyShortVolume = new ArrayList<>();
    }
    this.dailyShortVolume.add(dailyShortVolumeItem);
    return this;
  }

   /**
   * Get dailyShortVolume
   * @return dailyShortVolume
  **/
  @ApiModelProperty(value = "")
  public List<DailyShortVolume> getDailyShortVolume() {
    return dailyShortVolume;
  }

  public void setDailyShortVolume(List<DailyShortVolume> dailyShortVolume) {
    this.dailyShortVolume = dailyShortVolume;
  }

  public ApiResponseSecuritiesDailyShortVolume nextPage(String nextPage) {
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
    ApiResponseSecuritiesDailyShortVolume apiResponseSecuritiesDailyShortVolume = (ApiResponseSecuritiesDailyShortVolume) o;
    return Objects.equals(this.dailyShortVolume, apiResponseSecuritiesDailyShortVolume.dailyShortVolume) &&
        Objects.equals(this.nextPage, apiResponseSecuritiesDailyShortVolume.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyShortVolume, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecuritiesDailyShortVolume {\n");
    
    sb.append("    dailyShortVolume: ").append(toIndentedString(dailyShortVolume)).append("\n");
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

