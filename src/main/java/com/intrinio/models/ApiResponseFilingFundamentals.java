

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.FilingSummary;
import com.intrinio.models.FundamentalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseFilingFundamentals
 */

public class ApiResponseFilingFundamentals {
  @SerializedName("fundamentals")
  private List<FundamentalSummary> fundamentals = null;

  @SerializedName("filing")
  private FilingSummary filing = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseFilingFundamentals fundamentals(List<FundamentalSummary> fundamentals) {
    this.fundamentals = fundamentals;
    return this;
  }

  public ApiResponseFilingFundamentals addFundamentalsItem(FundamentalSummary fundamentalsItem) {
    if (this.fundamentals == null) {
      this.fundamentals = new ArrayList<FundamentalSummary>();
    }
    this.fundamentals.add(fundamentalsItem);
    return this;
  }

   /**
   * Get fundamentals
   * @return fundamentals
  **/
  @ApiModelProperty(value = "")
  public List<FundamentalSummary> getFundamentals() {
    return fundamentals;
  }

  public void setFundamentals(List<FundamentalSummary> fundamentals) {
    this.fundamentals = fundamentals;
  }

  public ApiResponseFilingFundamentals filing(FilingSummary filing) {
    this.filing = filing;
    return this;
  }

   /**
   * Get filing
   * @return filing
  **/
  @ApiModelProperty(value = "")
  public FilingSummary getFiling() {
    return filing;
  }

  public void setFiling(FilingSummary filing) {
    this.filing = filing;
  }

  public ApiResponseFilingFundamentals nextPage(String nextPage) {
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
    ApiResponseFilingFundamentals apiResponseFilingFundamentals = (ApiResponseFilingFundamentals) o;
    return Objects.equals(this.fundamentals, apiResponseFilingFundamentals.fundamentals) &&
        Objects.equals(this.filing, apiResponseFilingFundamentals.filing) &&
        Objects.equals(this.nextPage, apiResponseFilingFundamentals.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundamentals, filing, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseFilingFundamentals {\n");
    
    sb.append("    fundamentals: ").append(toIndentedString(fundamentals)).append("\n");
    sb.append("    filing: ").append(toIndentedString(filing)).append("\n");
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

