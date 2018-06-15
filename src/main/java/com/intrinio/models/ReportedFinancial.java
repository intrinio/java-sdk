

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ReportedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * A financial statement as-reported, directly from the financial statements of the XBRL filings from the company.
 */
@ApiModel(description = "A financial statement as-reported, directly from the financial statements of the XBRL filings from the company.")

public class ReportedFinancial {
  @SerializedName("xbrl_tag")
  private ReportedTag xbrlTag = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public ReportedFinancial xbrlTag(ReportedTag xbrlTag) {
    this.xbrlTag = xbrlTag;
    return this;
  }

   /**
   * Get xbrlTag
   * @return xbrlTag
  **/
  @ApiModelProperty(value = "")
  public ReportedTag getXbrlTag() {
    return xbrlTag;
  }

  public void setXbrlTag(ReportedTag xbrlTag) {
    this.xbrlTag = xbrlTag;
  }

  public ReportedFinancial value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value reported for the XBRL Tag within the scope of the Fundamental
   * @return value
  **/
  @ApiModelProperty(value = "The value reported for the XBRL Tag within the scope of the Fundamental")
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
    ReportedFinancial reportedFinancial = (ReportedFinancial) o;
    return Objects.equals(this.xbrlTag, reportedFinancial.xbrlTag) &&
        Objects.equals(this.value, reportedFinancial.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xbrlTag, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportedFinancial {\n");
    
    sb.append("    xbrlTag: ").append(toIndentedString(xbrlTag)).append("\n");
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

