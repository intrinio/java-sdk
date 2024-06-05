

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

/**
 * ApiResponseIndex
 */

public class ApiResponseIndex {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("name")
  private String name = null;

  public ApiResponseIndex symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The index symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "The index symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ApiResponseIndex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The index name
   * @return name
  **/
  @ApiModelProperty(value = "The index name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseIndex apiResponseIndex = (ApiResponseIndex) o;
    return Objects.equals(this.symbol, apiResponseIndex.symbol) &&
        Objects.equals(this.name, apiResponseIndex.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseIndex {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

