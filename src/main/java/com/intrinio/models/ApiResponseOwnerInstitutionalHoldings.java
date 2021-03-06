

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiResponseOwnerInstitutionalHoldings
 */

public class ApiResponseOwnerInstitutionalHoldings {
  @SerializedName("holdings")
  private Object holdings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOwnerInstitutionalHoldings holdings(Object holdings) {
    this.holdings = holdings;
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(value = "")
  public Object getHoldings() {
    return holdings;
  }

  public void setHoldings(Object holdings) {
    this.holdings = holdings;
  }

  public ApiResponseOwnerInstitutionalHoldings nextPage(String nextPage) {
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
    ApiResponseOwnerInstitutionalHoldings apiResponseOwnerInstitutionalHoldings = (ApiResponseOwnerInstitutionalHoldings) o;
    return Objects.equals(this.holdings, apiResponseOwnerInstitutionalHoldings.holdings) &&
        Objects.equals(this.nextPage, apiResponseOwnerInstitutionalHoldings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOwnerInstitutionalHoldings {\n");
    
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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

