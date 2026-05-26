

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DailyShortVolumeConsolidated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecuritiesDailyShortVolumeConsolidated
 */

public class ApiResponseSecuritiesDailyShortVolumeConsolidated {
  @SerializedName("daily_short_volume")
  private List<DailyShortVolumeConsolidated> dailyShortVolume = null;

  public ApiResponseSecuritiesDailyShortVolumeConsolidated dailyShortVolume(List<DailyShortVolumeConsolidated> dailyShortVolume) {
    this.dailyShortVolume = dailyShortVolume;
    return this;
  }

  public ApiResponseSecuritiesDailyShortVolumeConsolidated addDailyShortVolumeItem(DailyShortVolumeConsolidated dailyShortVolumeItem) {
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
  public List<DailyShortVolumeConsolidated> getDailyShortVolume() {
    return dailyShortVolume;
  }

  public void setDailyShortVolume(List<DailyShortVolumeConsolidated> dailyShortVolume) {
    this.dailyShortVolume = dailyShortVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecuritiesDailyShortVolumeConsolidated apiResponseSecuritiesDailyShortVolumeConsolidated = (ApiResponseSecuritiesDailyShortVolumeConsolidated) o;
    return Objects.equals(this.dailyShortVolume, apiResponseSecuritiesDailyShortVolumeConsolidated.dailyShortVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyShortVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecuritiesDailyShortVolumeConsolidated {\n");
    
    sb.append("    dailyShortVolume: ").append(toIndentedString(dailyShortVolume)).append("\n");
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

