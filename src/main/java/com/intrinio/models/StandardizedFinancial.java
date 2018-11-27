

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DataTagSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Professional-grade historical financial data for a Company. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as-reported financial statements because of the inherent complexity of reporting standards.
 */
@ApiModel(description = "Professional-grade historical financial data for a Company. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as-reported financial statements because of the inherent complexity of reporting standards.")

public class StandardizedFinancial {
  @SerializedName("data_tag")
  private DataTagSummary dataTag = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public StandardizedFinancial dataTag(DataTagSummary dataTag) {
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

  public StandardizedFinancial value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value for the Data Tag within the scope of the Fundamental
   * @return value
  **/
  @ApiModelProperty(value = "The value for the Data Tag within the scope of the Fundamental")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
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
    StandardizedFinancial standardizedFinancial = (StandardizedFinancial) o;
    return Objects.equals(this.dataTag, standardizedFinancial.dataTag) &&
        Objects.equals(this.value, standardizedFinancial.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTag, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardizedFinancial {\n");
    
    sb.append("    dataTag: ").append(toIndentedString(dataTag)).append("\n");
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

