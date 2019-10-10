

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksAnalystRating;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksAnalystRatings
 */

public class ApiResponseZacksAnalystRatings {
  @SerializedName("analyst_ratings")
  private List<ZacksAnalystRating> analystRatings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksAnalystRatings analystRatings(List<ZacksAnalystRating> analystRatings) {
    this.analystRatings = analystRatings;
    return this;
  }

  public ApiResponseZacksAnalystRatings addAnalystRatingsItem(ZacksAnalystRating analystRatingsItem) {
    if (this.analystRatings == null) {
      this.analystRatings = new ArrayList<ZacksAnalystRating>();
    }
    this.analystRatings.add(analystRatingsItem);
    return this;
  }

   /**
   * Get analystRatings
   * @return analystRatings
  **/
  @ApiModelProperty(value = "")
  public List<ZacksAnalystRating> getAnalystRatings() {
    return analystRatings;
  }

  public void setAnalystRatings(List<ZacksAnalystRating> analystRatings) {
    this.analystRatings = analystRatings;
  }

  public ApiResponseZacksAnalystRatings nextPage(String nextPage) {
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
    ApiResponseZacksAnalystRatings apiResponseZacksAnalystRatings = (ApiResponseZacksAnalystRatings) o;
    return Objects.equals(this.analystRatings, apiResponseZacksAnalystRatings.analystRatings) &&
        Objects.equals(this.nextPage, apiResponseZacksAnalystRatings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analystRatings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksAnalystRatings {\n");
    
    sb.append("    analystRatings: ").append(toIndentedString(analystRatings)).append("\n");
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

