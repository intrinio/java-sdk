

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

public class ReportedFinancialDimension {
  @SerializedName("axis")
  private String axis = null;

  @SerializedName("member")
  private String member = null;

  public ReportedFinancialDimension axis(String axis) {
    this.axis = axis;
    return this;
  }

   /**
   * The axis of the dimension
   * @return axis
  **/
  @ApiModelProperty(value = "The axis of the dimension")
  public String getAxis() {
    return axis;
  }

  public void setAxis(String axis) {
    this.axis = axis;
  }

  public ReportedFinancialDimension member(String member) {
    this.member = member;
    return this;
  }

   /**
   * The member of the axis
   * @return member
  **/
  @ApiModelProperty(value = "The member of the axis")
  public String getMember() {
    return member;
  }

  public void setMember(String member) {
    this.member = member;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportedFinancialDimension reportedFinancialDimension = (ReportedFinancialDimension) o;
    return Objects.equals(this.axis, reportedFinancialDimension.axis) &&
        Objects.equals(this.member, reportedFinancialDimension.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(axis, member);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportedFinancialDimension {\n");
    
    sb.append("    axis: ").append(toIndentedString(axis)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

