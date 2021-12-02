

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
 * An axis-member combination related to a reported XBRL fact, which denotes a facet of an XBRL dimension.
 */
@ApiModel(description = "An axis-member combination related to a reported XBRL fact, which denotes a facet of an XBRL dimension.")

public class StandardizedFinancialsDimension {
  @SerializedName("dimension")
  private String dimension = null;

  @SerializedName("value")
  private String value = null;

  public StandardizedFinancialsDimension dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * The title of the dimension
   * @return dimension
  **/
  @ApiModelProperty(value = "The title of the dimension")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public StandardizedFinancialsDimension value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the dimension
   * @return value
  **/
  @ApiModelProperty(value = "The value of the dimension")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardizedFinancialsDimension standardizedFinancialsDimension = (StandardizedFinancialsDimension) o;
    return Objects.equals(this.dimension, standardizedFinancialsDimension.dimension) &&
        Objects.equals(this.value, standardizedFinancialsDimension.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardizedFinancialsDimension {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

