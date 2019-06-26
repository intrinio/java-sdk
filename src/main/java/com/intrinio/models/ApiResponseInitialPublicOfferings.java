

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanyInitialPublicOffering;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseInitialPublicOfferings
 */

public class ApiResponseInitialPublicOfferings {
  @SerializedName("initial_public_offerings")
  private List<CompanyInitialPublicOffering> initialPublicOfferings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseInitialPublicOfferings initialPublicOfferings(List<CompanyInitialPublicOffering> initialPublicOfferings) {
    this.initialPublicOfferings = initialPublicOfferings;
    return this;
  }

  public ApiResponseInitialPublicOfferings addInitialPublicOfferingsItem(CompanyInitialPublicOffering initialPublicOfferingsItem) {
    if (this.initialPublicOfferings == null) {
      this.initialPublicOfferings = new ArrayList<CompanyInitialPublicOffering>();
    }
    this.initialPublicOfferings.add(initialPublicOfferingsItem);
    return this;
  }

   /**
   * Get initialPublicOfferings
   * @return initialPublicOfferings
  **/
  @ApiModelProperty(value = "")
  public List<CompanyInitialPublicOffering> getInitialPublicOfferings() {
    return initialPublicOfferings;
  }

  public void setInitialPublicOfferings(List<CompanyInitialPublicOffering> initialPublicOfferings) {
    this.initialPublicOfferings = initialPublicOfferings;
  }

  public ApiResponseInitialPublicOfferings nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    ApiResponseInitialPublicOfferings apiResponseInitialPublicOfferings = (ApiResponseInitialPublicOfferings) o;
    return Objects.equals(this.initialPublicOfferings, apiResponseInitialPublicOfferings.initialPublicOfferings) &&
        Objects.equals(this.nextPage, apiResponseInitialPublicOfferings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPublicOfferings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseInitialPublicOfferings {\n");
    
    sb.append("    initialPublicOfferings: ").append(toIndentedString(initialPublicOfferings)).append("\n");
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

