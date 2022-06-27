

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGCompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * ESGRatingWithCompany
 */

public class ESGRatingWithCompany {
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

  @SerializedName("company")
  private ESGCompanySummary company = null;

  public ESGRatingWithCompany date(LocalDate date) {
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

  public ESGRatingWithCompany communityRating(BigDecimal communityRating) {
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

  public ESGRatingWithCompany employeeRating(BigDecimal employeeRating) {
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

  public ESGRatingWithCompany environmentRating(BigDecimal environmentRating) {
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

  public ESGRatingWithCompany governanceRating(BigDecimal governanceRating) {
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

  public ESGRatingWithCompany company(ESGCompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public ESGCompanySummary getCompany() {
    return company;
  }

  public void setCompany(ESGCompanySummary company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESGRatingWithCompany esGRatingWithCompany = (ESGRatingWithCompany) o;
    return Objects.equals(this.date, esGRatingWithCompany.date) &&
        Objects.equals(this.communityRating, esGRatingWithCompany.communityRating) &&
        Objects.equals(this.employeeRating, esGRatingWithCompany.employeeRating) &&
        Objects.equals(this.environmentRating, esGRatingWithCompany.environmentRating) &&
        Objects.equals(this.governanceRating, esGRatingWithCompany.governanceRating) &&
        Objects.equals(this.company, esGRatingWithCompany.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, communityRating, employeeRating, environmentRating, governanceRating, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESGRatingWithCompany {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    employeeRating: ").append(toIndentedString(employeeRating)).append("\n");
    sb.append("    environmentRating: ").append(toIndentedString(environmentRating)).append("\n");
    sb.append("    governanceRating: ").append(toIndentedString(governanceRating)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

