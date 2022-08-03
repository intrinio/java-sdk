

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGComprehensiveRatingWithCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseESGLatestComprehensive
 */

public class ApiResponseESGLatestComprehensive {
  @SerializedName("ratings")
  private List<ESGComprehensiveRatingWithCompany> ratings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseESGLatestComprehensive ratings(List<ESGComprehensiveRatingWithCompany> ratings) {
    this.ratings = ratings;
    return this;
  }

  public ApiResponseESGLatestComprehensive addRatingsItem(ESGComprehensiveRatingWithCompany ratingsItem) {
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
  public List<ESGComprehensiveRatingWithCompany> getRatings() {
    return ratings;
  }

  public void setRatings(List<ESGComprehensiveRatingWithCompany> ratings) {
    this.ratings = ratings;
  }

  public ApiResponseESGLatestComprehensive nextPage(String nextPage) {
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
    ApiResponseESGLatestComprehensive apiResponseESGLatestComprehensive = (ApiResponseESGLatestComprehensive) o;
    return Objects.equals(this.ratings, apiResponseESGLatestComprehensive.ratings) &&
        Objects.equals(this.nextPage, apiResponseESGLatestComprehensive.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseESGLatestComprehensive {\n");
    
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

