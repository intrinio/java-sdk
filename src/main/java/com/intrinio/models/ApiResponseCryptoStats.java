

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CryptoStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCryptoStats
 */

public class ApiResponseCryptoStats {
  @SerializedName("stats")
  private List<CryptoStat> stats = null;

  public ApiResponseCryptoStats stats(List<CryptoStat> stats) {
    this.stats = stats;
    return this;
  }

  public ApiResponseCryptoStats addStatsItem(CryptoStat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<CryptoStat>();
    }
    this.stats.add(statsItem);
    return this;
  }

   /**
   * A list of Crypto Currencies and their stats.
   * @return stats
  **/
  @ApiModelProperty(value = "A list of Crypto Currencies and their stats.")
  public List<CryptoStat> getStats() {
    return stats;
  }

  public void setStats(List<CryptoStat> stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCryptoStats apiResponseCryptoStats = (ApiResponseCryptoStats) o;
    return Objects.equals(this.stats, apiResponseCryptoStats.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCryptoStats {\n");
    
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

