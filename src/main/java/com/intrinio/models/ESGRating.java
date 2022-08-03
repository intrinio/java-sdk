

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
   * Indicates the date on which the ESG Rating was calculated.
   * @return date
  **/
  @ApiModelProperty(value = "Indicates the date on which the ESG Rating was calculated.")
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
   * The Community Category reflects a company&#39;s citizenship, charitable giving, and volunteerism. This category covers the company&#39;s human rights record and treatment of its supply chain. It also covers the environmental and social impacts of the company&#39;s products and services, and the development of sustainable products, processes and technologies.
   * @return communityRating
  **/
  @ApiModelProperty(value = "The Community Category reflects a company's citizenship, charitable giving, and volunteerism. This category covers the company's human rights record and treatment of its supply chain. It also covers the environmental and social impacts of the company's products and services, and the development of sustainable products, processes and technologies.")
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
   * The Employees category includes disclosure of policies, programs, and performance in diversity, labor relations and labor rights. The evaluation focuses on the quality of policies and programs, compliance with national laws and regulations, and proactive management initiatives. The category includes evaluation of inclusive diversity policies, fair treatment of all employees, robust diversity (EEO-1) programs and training.
   * @return employeeRating
  **/
  @ApiModelProperty(value = "The Employees category includes disclosure of policies, programs, and performance in diversity, labor relations and labor rights. The evaluation focuses on the quality of policies and programs, compliance with national laws and regulations, and proactive management initiatives. The category includes evaluation of inclusive diversity policies, fair treatment of all employees, robust diversity (EEO-1) programs and training.")
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
   * The Environment category data covers a company&#39;s interactions with the environment at large, including use of natural resources. The category evaluates corporate environmental performance, compliance with environmental regulations, and mitigation of environmental footprint. It also includes leadership in addressing climate change through appropriate policies and strategies.
   * @return environmentRating
  **/
  @ApiModelProperty(value = "The Environment category data covers a company's interactions with the environment at large, including use of natural resources. The category evaluates corporate environmental performance, compliance with environmental regulations, and mitigation of environmental footprint. It also includes leadership in addressing climate change through appropriate policies and strategies.")
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
   * Corporate governance refers to leadership structure and the values that determine corporate direction, ethics and performance. The Governance category covers disclosure of policies and procedures, board independence and diversity, executive compensation, attention to stakeholder concerns, and evaluation of a companys culture of ethical leadership and compliance.
   * @return governanceRating
  **/
  @ApiModelProperty(value = "Corporate governance refers to leadership structure and the values that determine corporate direction, ethics and performance. The Governance category covers disclosure of policies and procedures, board independence and diversity, executive compensation, attention to stakeholder concerns, and evaluation of a companys culture of ethical leadership and compliance.")
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

