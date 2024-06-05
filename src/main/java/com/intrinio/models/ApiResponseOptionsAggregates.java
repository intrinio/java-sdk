

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionsAggregate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsAggregates
 */

public class ApiResponseOptionsAggregates {
  @SerializedName("aggregates")
  private List<OptionsAggregate> aggregates = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOptionsAggregates aggregates(List<OptionsAggregate> aggregates) {
    this.aggregates = aggregates;
    return this;
  }

  public ApiResponseOptionsAggregates addAggregatesItem(OptionsAggregate aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new ArrayList<>();
    }
    this.aggregates.add(aggregatesItem);
    return this;
  }

   /**
   * A list of option expiration dates in descending order
   * @return aggregates
  **/
  @ApiModelProperty(value = "A list of option expiration dates in descending order")
  public List<OptionsAggregate> getAggregates() {
    return aggregates;
  }

  public void setAggregates(List<OptionsAggregate> aggregates) {
    this.aggregates = aggregates;
  }

  public ApiResponseOptionsAggregates nextPage(String nextPage) {
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
    ApiResponseOptionsAggregates apiResponseOptionsAggregates = (ApiResponseOptionsAggregates) o;
    return Objects.equals(this.aggregates, apiResponseOptionsAggregates.aggregates) &&
        Objects.equals(this.nextPage, apiResponseOptionsAggregates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsAggregates {\n");
    
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
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

