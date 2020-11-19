

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecurityScreenResultData;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A security that matches the screen and its corresponding screened properties
 */
@ApiModel(description = "A security that matches the screen and its corresponding screened properties")

public class SecurityScreenResult {
  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("data")
  private List<SecurityScreenResultData> data = null;

  public SecurityScreenResult security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public SecurityScreenResult data(List<SecurityScreenResultData> data) {
    this.data = data;
    return this;
  }

  public SecurityScreenResult addDataItem(SecurityScreenResultData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<SecurityScreenResultData> getData() {
    return data;
  }

  public void setData(List<SecurityScreenResultData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScreenResult securityScreenResult = (SecurityScreenResult) o;
    return Objects.equals(this.security, securityScreenResult.security) &&
        Objects.equals(this.data, securityScreenResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScreenResult {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

