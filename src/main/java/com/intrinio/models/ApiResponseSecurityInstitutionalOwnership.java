

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.InstitutionalOwnership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityInstitutionalOwnership
 */

public class ApiResponseSecurityInstitutionalOwnership {
  @SerializedName("ownership")
  private List<InstitutionalOwnership> ownership = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityInstitutionalOwnership ownership(List<InstitutionalOwnership> ownership) {
    this.ownership = ownership;
    return this;
  }

  public ApiResponseSecurityInstitutionalOwnership addOwnershipItem(InstitutionalOwnership ownershipItem) {
    if (this.ownership == null) {
      this.ownership = new ArrayList<>();
    }
    this.ownership.add(ownershipItem);
    return this;
  }

   /**
   * Get ownership
   * @return ownership
  **/
  @ApiModelProperty(value = "")
  public List<InstitutionalOwnership> getOwnership() {
    return ownership;
  }

  public void setOwnership(List<InstitutionalOwnership> ownership) {
    this.ownership = ownership;
  }

  public ApiResponseSecurityInstitutionalOwnership nextPage(String nextPage) {
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
    ApiResponseSecurityInstitutionalOwnership apiResponseSecurityInstitutionalOwnership = (ApiResponseSecurityInstitutionalOwnership) o;
    return Objects.equals(this.ownership, apiResponseSecurityInstitutionalOwnership.ownership) &&
        Objects.equals(this.nextPage, apiResponseSecurityInstitutionalOwnership.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownership, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityInstitutionalOwnership {\n");
    
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
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

