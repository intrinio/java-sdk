

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsRealtime
 */

public class ApiResponseOptionsRealtime {
  @SerializedName("options")
  private List<OptionRealtime> options = null;

  public ApiResponseOptionsRealtime options(List<OptionRealtime> options) {
    this.options = options;
    return this;
  }

  public ApiResponseOptionsRealtime addOptionsItem(OptionRealtime optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of options contracts with the given symbol
   * @return options
  **/
  @ApiModelProperty(value = "A list of options contracts with the given symbol")
  public List<OptionRealtime> getOptions() {
    return options;
  }

  public void setOptions(List<OptionRealtime> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsRealtime apiResponseOptionsRealtime = (ApiResponseOptionsRealtime) o;
    return Objects.equals(this.options, apiResponseOptionsRealtime.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsRealtime {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

