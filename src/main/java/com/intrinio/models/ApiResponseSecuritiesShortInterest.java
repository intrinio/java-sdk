

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ShortInterestWithSecurity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecuritiesShortInterest
 */

public class ApiResponseSecuritiesShortInterest {
  @SerializedName("short_interest")
  private List<ShortInterestWithSecurity> shortInterest = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecuritiesShortInterest shortInterest(List<ShortInterestWithSecurity> shortInterest) {
    this.shortInterest = shortInterest;
    return this;
  }

  public ApiResponseSecuritiesShortInterest addShortInterestItem(ShortInterestWithSecurity shortInterestItem) {
    if (this.shortInterest == null) {
      this.shortInterest = new ArrayList<>();
    }
    this.shortInterest.add(shortInterestItem);
    return this;
  }

   /**
   * Get shortInterest
   * @return shortInterest
  **/
  @ApiModelProperty(value = "")
  public List<ShortInterestWithSecurity> getShortInterest() {
    return shortInterest;
  }

  public void setShortInterest(List<ShortInterestWithSecurity> shortInterest) {
    this.shortInterest = shortInterest;
  }

  public ApiResponseSecuritiesShortInterest nextPage(String nextPage) {
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
    ApiResponseSecuritiesShortInterest apiResponseSecuritiesShortInterest = (ApiResponseSecuritiesShortInterest) o;
    return Objects.equals(this.shortInterest, apiResponseSecuritiesShortInterest.shortInterest) &&
        Objects.equals(this.nextPage, apiResponseSecuritiesShortInterest.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortInterest, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecuritiesShortInterest {\n");
    
    sb.append("    shortInterest: ").append(toIndentedString(shortInterest)).append("\n");
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

