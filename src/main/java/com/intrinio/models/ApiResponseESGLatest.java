

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGRatingWithCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseESGLatest
 */

public class ApiResponseESGLatest {
  @SerializedName("ratings")
  private List<ESGRatingWithCompany> ratings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseESGLatest ratings(List<ESGRatingWithCompany> ratings) {
    this.ratings = ratings;
    return this;
  }

  public ApiResponseESGLatest addRatingsItem(ESGRatingWithCompany ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

   /**
   * Get ratings
   * @return ratings
  **/
  @ApiModelProperty(value = "")
  public List<ESGRatingWithCompany> getRatings() {
    return ratings;
  }

  public void setRatings(List<ESGRatingWithCompany> ratings) {
    this.ratings = ratings;
  }

  public ApiResponseESGLatest nextPage(String nextPage) {
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
    ApiResponseESGLatest apiResponseESGLatest = (ApiResponseESGLatest) o;
    return Objects.equals(this.ratings, apiResponseESGLatest.ratings) &&
        Objects.equals(this.nextPage, apiResponseESGLatest.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseESGLatest {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

