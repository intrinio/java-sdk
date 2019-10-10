

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Filing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseFilings
 */

public class ApiResponseFilings {
  @SerializedName("filings")
  private List<Filing> filings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseFilings filings(List<Filing> filings) {
    this.filings = filings;
    return this;
  }

  public ApiResponseFilings addFilingsItem(Filing filingsItem) {
    if (this.filings == null) {
      this.filings = new ArrayList<Filing>();
    }
    this.filings.add(filingsItem);
    return this;
  }

   /**
   * Get filings
   * @return filings
  **/
  @ApiModelProperty(value = "")
  public List<Filing> getFilings() {
    return filings;
  }

  public void setFilings(List<Filing> filings) {
    this.filings = filings;
  }

  public ApiResponseFilings nextPage(String nextPage) {
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
    ApiResponseFilings apiResponseFilings = (ApiResponseFilings) o;
    return Objects.equals(this.filings, apiResponseFilings.filings) &&
        Objects.equals(this.nextPage, apiResponseFilings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseFilings {\n");
    
    sb.append("    filings: ").append(toIndentedString(filings)).append("\n");
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

