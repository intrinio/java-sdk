

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ChaikinMoneyFlowTechnicalValue;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.TechnicalIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Chaikin Money Flow calculations for the Stock Prices of the given Security
 */
@ApiModel(description = "The Chaikin Money Flow calculations for the Stock Prices of the given Security")

public class ApiResponseSecurityChaikinMoneyFlow {
  @SerializedName("technicals")
  private List<ChaikinMoneyFlowTechnicalValue> technicals = null;

  @SerializedName("indicator")
  private TechnicalIndicator indicator = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityChaikinMoneyFlow technicals(List<ChaikinMoneyFlowTechnicalValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseSecurityChaikinMoneyFlow addTechnicalsItem(ChaikinMoneyFlowTechnicalValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<ChaikinMoneyFlowTechnicalValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<ChaikinMoneyFlowTechnicalValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseSecurityChaikinMoneyFlow indicator(TechnicalIndicator indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * The name and symbol of the technical indicator
   * @return indicator
  **/
  @ApiModelProperty(value = "The name and symbol of the technical indicator")
  public TechnicalIndicator getIndicator() {
    return indicator;
  }

  public void setIndicator(TechnicalIndicator indicator) {
    this.indicator = indicator;
  }

  public ApiResponseSecurityChaikinMoneyFlow security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security of the Stock Price
   * @return security
  **/
  @ApiModelProperty(value = "The Security of the Stock Price")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseSecurityChaikinMoneyFlow nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further results are available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further results are available.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecurityChaikinMoneyFlow apiResponseSecurityChaikinMoneyFlow = (ApiResponseSecurityChaikinMoneyFlow) o;
    return Objects.equals(this.technicals, apiResponseSecurityChaikinMoneyFlow.technicals) &&
        Objects.equals(this.indicator, apiResponseSecurityChaikinMoneyFlow.indicator) &&
        Objects.equals(this.security, apiResponseSecurityChaikinMoneyFlow.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityChaikinMoneyFlow.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityChaikinMoneyFlow {\n");
    
    sb.append("    technicals: ").append(toIndentedString(technicals)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

