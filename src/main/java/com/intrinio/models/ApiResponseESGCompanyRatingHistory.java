

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGCompanySummary;
import com.intrinio.models.ESGRating;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseESGCompanyRatingHistory
 */

public class ApiResponseESGCompanyRatingHistory {
  @SerializedName("ratings")
  private List<ESGRating> ratings = null;

  @SerializedName("company")
  private ESGCompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseESGCompanyRatingHistory ratings(List<ESGRating> ratings) {
    this.ratings = ratings;
    return this;
  }

  public ApiResponseESGCompanyRatingHistory addRatingsItem(ESGRating ratingsItem) {
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
  public List<ESGRating> getRatings() {
    return ratings;
  }

  public void setRatings(List<ESGRating> ratings) {
    this.ratings = ratings;
  }

  public ApiResponseESGCompanyRatingHistory company(ESGCompanySummary company) {
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

  public ApiResponseESGCompanyRatingHistory nextPage(String nextPage) {
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
    ApiResponseESGCompanyRatingHistory apiResponseESGCompanyRatingHistory = (ApiResponseESGCompanyRatingHistory) o;
    return Objects.equals(this.ratings, apiResponseESGCompanyRatingHistory.ratings) &&
        Objects.equals(this.company, apiResponseESGCompanyRatingHistory.company) &&
        Objects.equals(this.nextPage, apiResponseESGCompanyRatingHistory.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratings, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseESGCompanyRatingHistory {\n");
    
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

