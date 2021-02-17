

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OwnerSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOwners
 */

public class ApiResponseOwners {
  @SerializedName("owners")
  private List<OwnerSummary> owners = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOwners owners(List<OwnerSummary> owners) {
    this.owners = owners;
    return this;
  }

  public ApiResponseOwners addOwnersItem(OwnerSummary ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * A list of owners
   * @return owners
  **/
  @ApiModelProperty(value = "A list of owners")
  public List<OwnerSummary> getOwners() {
    return owners;
  }

  public void setOwners(List<OwnerSummary> owners) {
    this.owners = owners;
  }

  public ApiResponseOwners nextPage(String nextPage) {
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
    ApiResponseOwners apiResponseOwners = (ApiResponseOwners) o;
    return Objects.equals(this.owners, apiResponseOwners.owners) &&
        Objects.equals(this.nextPage, apiResponseOwners.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOwners {\n");
    
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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

