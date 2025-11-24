

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.EarningsDateEstimateWithCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseAllExpectedEarningsDates
 */

public class ApiResponseAllExpectedEarningsDates {
  @SerializedName("expected_earnings_dates")
  private List<EarningsDateEstimateWithCompany> expectedEarningsDates = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseAllExpectedEarningsDates expectedEarningsDates(List<EarningsDateEstimateWithCompany> expectedEarningsDates) {
    this.expectedEarningsDates = expectedEarningsDates;
    return this;
  }

  public ApiResponseAllExpectedEarningsDates addExpectedEarningsDatesItem(EarningsDateEstimateWithCompany expectedEarningsDatesItem) {
    if (this.expectedEarningsDates == null) {
      this.expectedEarningsDates = new ArrayList<>();
    }
    this.expectedEarningsDates.add(expectedEarningsDatesItem);
    return this;
  }

   /**
   * Get expectedEarningsDates
   * @return expectedEarningsDates
  **/
  @ApiModelProperty(value = "")
  public List<EarningsDateEstimateWithCompany> getExpectedEarningsDates() {
    return expectedEarningsDates;
  }

  public void setExpectedEarningsDates(List<EarningsDateEstimateWithCompany> expectedEarningsDates) {
    this.expectedEarningsDates = expectedEarningsDates;
  }

  public ApiResponseAllExpectedEarningsDates nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token for the next page of results
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token for the next page of results")
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
    ApiResponseAllExpectedEarningsDates apiResponseAllExpectedEarningsDates = (ApiResponseAllExpectedEarningsDates) o;
    return Objects.equals(this.expectedEarningsDates, apiResponseAllExpectedEarningsDates.expectedEarningsDates) &&
        Objects.equals(this.nextPage, apiResponseAllExpectedEarningsDates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedEarningsDates, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseAllExpectedEarningsDates {\n");
    
    sb.append("    expectedEarningsDates: ").append(toIndentedString(expectedEarningsDates)).append("\n");
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

