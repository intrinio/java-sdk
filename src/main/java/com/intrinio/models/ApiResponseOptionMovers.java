

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionMover;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A paginated API response containing a list of top-moving options contracts based on criteria like volume, price change, or other market activity indicators.
 */
@ApiModel(description = "A paginated API response containing a list of top-moving options contracts based on criteria like volume, price change, or other market activity indicators.")

public class ApiResponseOptionMovers {
  @SerializedName("movers")
  private List<OptionMover> movers = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOptionMovers movers(List<OptionMover> movers) {
    this.movers = movers;
    return this;
  }

  public ApiResponseOptionMovers addMoversItem(OptionMover moversItem) {
    if (this.movers == null) {
      this.movers = new ArrayList<>();
    }
    this.movers.add(moversItem);
    return this;
  }

   /**
   * Get movers
   * @return movers
  **/
  @ApiModelProperty(value = "")
  public List<OptionMover> getMovers() {
    return movers;
  }

  public void setMovers(List<OptionMover> movers) {
    this.movers = movers;
  }

  public ApiResponseOptionMovers nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * A pagination token for retrieving the next page of results, if available. Null or absent if no further pages exist.
   * @return nextPage
  **/
  @ApiModelProperty(value = "A pagination token for retrieving the next page of results, if available. Null or absent if no further pages exist.")
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
    ApiResponseOptionMovers apiResponseOptionMovers = (ApiResponseOptionMovers) o;
    return Objects.equals(this.movers, apiResponseOptionMovers.movers) &&
        Objects.equals(this.nextPage, apiResponseOptionMovers.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movers, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionMovers {\n");
    
    sb.append("    movers: ").append(toIndentedString(movers)).append("\n");
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

