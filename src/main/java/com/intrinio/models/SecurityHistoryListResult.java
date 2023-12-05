

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecurityHistory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A security history result contains all security ticker history corresponding to the provided query.
 */
@ApiModel(description = "A security history result contains all security ticker history corresponding to the provided query.")

public class SecurityHistoryListResult {
  @SerializedName("securities")
  private List<SecurityHistory> securities = null;

  public SecurityHistoryListResult securities(List<SecurityHistory> securities) {
    this.securities = securities;
    return this;
  }

  public SecurityHistoryListResult addSecuritiesItem(SecurityHistory securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * Array of security ticker history.
   * @return securities
  **/
  @ApiModelProperty(value = "Array of security ticker history.")
  public List<SecurityHistory> getSecurities() {
    return securities;
  }

  public void setSecurities(List<SecurityHistory> securities) {
    this.securities = securities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityHistoryListResult securityHistoryListResult = (SecurityHistoryListResult) o;
    return Objects.equals(this.securities, securityHistoryListResult.securities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityHistoryListResult {\n");
    
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

