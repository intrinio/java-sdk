

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DataTagSummary;
import com.intrinio.models.Fundamental;
import com.intrinio.models.StandardizedFinancialsDimension;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStandardizedFinancialsDimensions
 */

public class ApiResponseStandardizedFinancialsDimensions {
  @SerializedName("dimensions")
  private List<StandardizedFinancialsDimension> dimensions = null;

  @SerializedName("data_tag")
  private DataTagSummary dataTag = null;

  @SerializedName("fundamental")
  private Fundamental fundamental = null;

  public ApiResponseStandardizedFinancialsDimensions dimensions(List<StandardizedFinancialsDimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public ApiResponseStandardizedFinancialsDimensions addDimensionsItem(StandardizedFinancialsDimension dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * The combination of XBRL axis and members that defines the dimensionalization of this fact (if any)
   * @return dimensions
  **/
  @ApiModelProperty(value = "The combination of XBRL axis and members that defines the dimensionalization of this fact (if any)")
  public List<StandardizedFinancialsDimension> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<StandardizedFinancialsDimension> dimensions) {
    this.dimensions = dimensions;
  }

  public ApiResponseStandardizedFinancialsDimensions dataTag(DataTagSummary dataTag) {
    this.dataTag = dataTag;
    return this;
  }

   /**
   * Get dataTag
   * @return dataTag
  **/
  @ApiModelProperty(value = "")
  public DataTagSummary getDataTag() {
    return dataTag;
  }

  public void setDataTag(DataTagSummary dataTag) {
    this.dataTag = dataTag;
  }

  public ApiResponseStandardizedFinancialsDimensions fundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
    return this;
  }

   /**
   * Get fundamental
   * @return fundamental
  **/
  @ApiModelProperty(value = "")
  public Fundamental getFundamental() {
    return fundamental;
  }

  public void setFundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseStandardizedFinancialsDimensions apiResponseStandardizedFinancialsDimensions = (ApiResponseStandardizedFinancialsDimensions) o;
    return Objects.equals(this.dimensions, apiResponseStandardizedFinancialsDimensions.dimensions) &&
        Objects.equals(this.dataTag, apiResponseStandardizedFinancialsDimensions.dataTag) &&
        Objects.equals(this.fundamental, apiResponseStandardizedFinancialsDimensions.fundamental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, dataTag, fundamental);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStandardizedFinancialsDimensions {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    dataTag: ").append(toIndentedString(dataTag)).append("\n");
    sb.append("    fundamental: ").append(toIndentedString(fundamental)).append("\n");
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

