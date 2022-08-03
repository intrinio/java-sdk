

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGCompanySummary;
import com.intrinio.models.ESGComprehensiveRating;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseESGCompanyComprehensiveRatingHistory
 */

public class ApiResponseESGCompanyComprehensiveRatingHistory {
  @SerializedName("ratings")
  private List<ESGComprehensiveRating> ratings = null;

  @SerializedName("company")
  private ESGCompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseESGCompanyComprehensiveRatingHistory ratings(List<ESGComprehensiveRating> ratings) {
    this.ratings = ratings;
    return this;
  }

  public ApiResponseESGCompanyComprehensiveRatingHistory addRatingsItem(ESGComprehensiveRating ratingsItem) {
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
  public List<ESGComprehensiveRating> getRatings() {
    return ratings;
  }

  public void setRatings(List<ESGComprehensiveRating> ratings) {
    this.ratings = ratings;
  }

  public ApiResponseESGCompanyComprehensiveRatingHistory company(ESGCompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public ESGCompanySummary getCompany() {
    return company;
  }

  public void setCompany(ESGCompanySummary company) {
    this.company = company;
  }

  public ApiResponseESGCompanyComprehensiveRatingHistory nextPage(String nextPage) {
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
    ApiResponseESGCompanyComprehensiveRatingHistory apiResponseESGCompanyComprehensiveRatingHistory = (ApiResponseESGCompanyComprehensiveRatingHistory) o;
    return Objects.equals(this.ratings, apiResponseESGCompanyComprehensiveRatingHistory.ratings) &&
        Objects.equals(this.company, apiResponseESGCompanyComprehensiveRatingHistory.company) &&
        Objects.equals(this.nextPage, apiResponseESGCompanyComprehensiveRatingHistory.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseESGCompanyComprehensiveRatingHistory {\n");
    
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

