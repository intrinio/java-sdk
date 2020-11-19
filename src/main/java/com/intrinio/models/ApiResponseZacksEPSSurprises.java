

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksEPSSurprise;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksEPSSurprises
 */

public class ApiResponseZacksEPSSurprises {
  @SerializedName("eps_surprises")
  private List<ZacksEPSSurprise> epsSurprises = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksEPSSurprises epsSurprises(List<ZacksEPSSurprise> epsSurprises) {
    this.epsSurprises = epsSurprises;
    return this;
  }

  public ApiResponseZacksEPSSurprises addEpsSurprisesItem(ZacksEPSSurprise epsSurprisesItem) {
    if (this.epsSurprises == null) {
      this.epsSurprises = new ArrayList<>();
    }
    this.epsSurprises.add(epsSurprisesItem);
    return this;
  }

   /**
   * Zacks EPS Surprise data for a Security in descending order by actual reported date
   * @return epsSurprises
  **/
  @ApiModelProperty(value = "Zacks EPS Surprise data for a Security in descending order by actual reported date")
  public List<ZacksEPSSurprise> getEpsSurprises() {
    return epsSurprises;
  }

  public void setEpsSurprises(List<ZacksEPSSurprise> epsSurprises) {
    this.epsSurprises = epsSurprises;
  }

  public ApiResponseZacksEPSSurprises nextPage(String nextPage) {
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
    ApiResponseZacksEPSSurprises apiResponseZacksEPSSurprises = (ApiResponseZacksEPSSurprises) o;
    return Objects.equals(this.epsSurprises, apiResponseZacksEPSSurprises.epsSurprises) &&
        Objects.equals(this.nextPage, apiResponseZacksEPSSurprises.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsSurprises, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksEPSSurprises {\n");
    
    sb.append("    epsSurprises: ").append(toIndentedString(epsSurprises)).append("\n");
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

