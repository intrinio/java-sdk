

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
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * ESGRating
 */

public class ESGRating {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("community_rating")
  private BigDecimal communityRating = null;

  @SerializedName("employee_rating")
  private BigDecimal employeeRating = null;

  @SerializedName("environment_rating")
  private BigDecimal environmentRating = null;

  @SerializedName("governance_rating")
  private BigDecimal governanceRating = null;

  public ESGRating date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ESGRating communityRating(BigDecimal communityRating) {
    this.communityRating = communityRating;
    return this;
  }

   /**
   * Get communityRating
   * @return communityRating
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(BigDecimal communityRating) {
    this.communityRating = communityRating;
  }

  public ESGRating employeeRating(BigDecimal employeeRating) {
    this.employeeRating = employeeRating;
    return this;
  }

   /**
   * Get employeeRating
   * @return employeeRating
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEmployeeRating() {
    return employeeRating;
  }

  public void setEmployeeRating(BigDecimal employeeRating) {
    this.employeeRating = employeeRating;
  }

  public ESGRating environmentRating(BigDecimal environmentRating) {
    this.environmentRating = environmentRating;
    return this;
  }

   /**
   * Get environmentRating
   * @return environmentRating
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getEnvironmentRating() {
    return environmentRating;
  }

  public void setEnvironmentRating(BigDecimal environmentRating) {
    this.environmentRating = environmentRating;
  }

  public ESGRating governanceRating(BigDecimal governanceRating) {
    this.governanceRating = governanceRating;
    return this;
  }

   /**
   * Get governanceRating
   * @return governanceRating
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGovernanceRating() {
    return governanceRating;
  }

  public void setGovernanceRating(BigDecimal governanceRating) {
    this.governanceRating = governanceRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESGRating esGRating = (ESGRating) o;
    return Objects.equals(this.date, esGRating.date) &&
        Objects.equals(this.communityRating, esGRating.communityRating) &&
        Objects.equals(this.employeeRating, esGRating.employeeRating) &&
        Objects.equals(this.environmentRating, esGRating.environmentRating) &&
        Objects.equals(this.governanceRating, esGRating.governanceRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, communityRating, employeeRating, environmentRating, governanceRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESGRating {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    employeeRating: ").append(toIndentedString(employeeRating)).append("\n");
    sb.append("    environmentRating: ").append(toIndentedString(environmentRating)).append("\n");
    sb.append("    governanceRating: ").append(toIndentedString(governanceRating)).append("\n");
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

