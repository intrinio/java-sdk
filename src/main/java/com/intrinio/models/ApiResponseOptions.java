

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Option;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptions
 */

public class ApiResponseOptions {
  @SerializedName("options")
  private List<Option> options = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOptions options(List<Option> options) {
    this.options = options;
    return this;
  }

  public ApiResponseOptions addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of options contracts with the given symbol
   * @return options
  **/
  @ApiModelProperty(value = "A list of options contracts with the given symbol")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public ApiResponseOptions nextPage(String nextPage) {
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
    ApiResponseOptions apiResponseOptions = (ApiResponseOptions) o;
    return Objects.equals(this.options, apiResponseOptions.options) &&
        Objects.equals(this.nextPage, apiResponseOptions.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptions {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

