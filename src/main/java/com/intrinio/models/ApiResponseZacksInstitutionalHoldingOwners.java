

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksInstitutionalHoldingOwnerDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksInstitutionalHoldingOwners
 */

public class ApiResponseZacksInstitutionalHoldingOwners {
  @SerializedName("owners")
  private List<ZacksInstitutionalHoldingOwnerDetail> owners = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksInstitutionalHoldingOwners owners(List<ZacksInstitutionalHoldingOwnerDetail> owners) {
    this.owners = owners;
    return this;
  }

  public ApiResponseZacksInstitutionalHoldingOwners addOwnersItem(ZacksInstitutionalHoldingOwnerDetail ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Zacks institutional holding owners data
   * @return owners
  **/
  @ApiModelProperty(value = "Zacks institutional holding owners data")
  public List<ZacksInstitutionalHoldingOwnerDetail> getOwners() {
    return owners;
  }

  public void setOwners(List<ZacksInstitutionalHoldingOwnerDetail> owners) {
    this.owners = owners;
  }

  public ApiResponseZacksInstitutionalHoldingOwners nextPage(String nextPage) {
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
    ApiResponseZacksInstitutionalHoldingOwners apiResponseZacksInstitutionalHoldingOwners = (ApiResponseZacksInstitutionalHoldingOwners) o;
    return Objects.equals(this.owners, apiResponseZacksInstitutionalHoldingOwners.owners) &&
        Objects.equals(this.nextPage, apiResponseZacksInstitutionalHoldingOwners.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksInstitutionalHoldingOwners {\n");
    
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

