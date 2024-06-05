

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksForwardPE;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksForwardPEs
 */

public class ApiResponseZacksForwardPEs {
  @SerializedName("forward_pe")
  private List<ZacksForwardPE> forwardPe = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksForwardPEs forwardPe(List<ZacksForwardPE> forwardPe) {
    this.forwardPe = forwardPe;
    return this;
  }

  public ApiResponseZacksForwardPEs addForwardPeItem(ZacksForwardPE forwardPeItem) {
    if (this.forwardPe == null) {
      this.forwardPe = new ArrayList<>();
    }
    this.forwardPe.add(forwardPeItem);
    return this;
  }

   /**
   * Zacks forward PE ratio estimates
   * @return forwardPe
  **/
  @ApiModelProperty(value = "Zacks forward PE ratio estimates")
  public List<ZacksForwardPE> getForwardPe() {
    return forwardPe;
  }

  public void setForwardPe(List<ZacksForwardPE> forwardPe) {
    this.forwardPe = forwardPe;
  }

  public ApiResponseZacksForwardPEs nextPage(String nextPage) {
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
    ApiResponseZacksForwardPEs apiResponseZacksForwardPEs = (ApiResponseZacksForwardPEs) o;
    return Objects.equals(this.forwardPe, apiResponseZacksForwardPEs.forwardPe) &&
        Objects.equals(this.nextPage, apiResponseZacksForwardPEs.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardPe, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksForwardPEs {\n");
    
    sb.append("    forwardPe: ").append(toIndentedString(forwardPe)).append("\n");
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

