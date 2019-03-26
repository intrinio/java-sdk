

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsExpirations
 */

public class ApiResponseOptionsExpirations {
  @SerializedName("expirations")
  private List<String> expirations = null;

  public ApiResponseOptionsExpirations expirations(List<String> expirations) {
    this.expirations = expirations;
    return this;
  }

  public ApiResponseOptionsExpirations addExpirationsItem(String expirationsItem) {
    if (this.expirations == null) {
      this.expirations = new ArrayList<String>();
    }
    this.expirations.add(expirationsItem);
    return this;
  }

   /**
   * A list of option expiration dates in descending order
   * @return expirations
  **/
  @ApiModelProperty(value = "A list of option expiration dates in descending order")
  public List<String> getExpirations() {
    return expirations;
  }

  public void setExpirations(List<String> expirations) {
    this.expirations = expirations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsExpirations apiResponseOptionsExpirations = (ApiResponseOptionsExpirations) o;
    return Objects.equals(this.expirations, apiResponseOptionsExpirations.expirations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsExpirations {\n");
    
    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
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

