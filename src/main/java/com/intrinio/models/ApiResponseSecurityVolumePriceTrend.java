

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.TechnicalIndicator;
import com.intrinio.models.VolumePriceTrendTechnicalValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Volume-price Trend calculations for the Stock Prices of the given Security
 */
@ApiModel(description = "The Volume-price Trend calculations for the Stock Prices of the given Security")

public class ApiResponseSecurityVolumePriceTrend {
  @SerializedName("technicals")
  private List<VolumePriceTrendTechnicalValue> technicals = null;

  @SerializedName("indicator")
  private TechnicalIndicator indicator = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityVolumePriceTrend technicals(List<VolumePriceTrendTechnicalValue> technicals) {
    this.technicals = technicals;
    return this;
  }

  public ApiResponseSecurityVolumePriceTrend addTechnicalsItem(VolumePriceTrendTechnicalValue technicalsItem) {
    if (this.technicals == null) {
      this.technicals = new ArrayList<VolumePriceTrendTechnicalValue>();
    }
    this.technicals.add(technicalsItem);
    return this;
  }

   /**
   * Get technicals
   * @return technicals
  **/
  @ApiModelProperty(value = "")
  public List<VolumePriceTrendTechnicalValue> getTechnicals() {
    return technicals;
  }

  public void setTechnicals(List<VolumePriceTrendTechnicalValue> technicals) {
    this.technicals = technicals;
  }

  public ApiResponseSecurityVolumePriceTrend indicator(TechnicalIndicator indicator) {
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

  public ApiResponseSecurityVolumePriceTrend security(SecuritySummary security) {
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

  public ApiResponseSecurityVolumePriceTrend nextPage(String nextPage) {
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
    ApiResponseSecurityVolumePriceTrend apiResponseSecurityVolumePriceTrend = (ApiResponseSecurityVolumePriceTrend) o;
    return Objects.equals(this.technicals, apiResponseSecurityVolumePriceTrend.technicals) &&
        Objects.equals(this.indicator, apiResponseSecurityVolumePriceTrend.indicator) &&
        Objects.equals(this.security, apiResponseSecurityVolumePriceTrend.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityVolumePriceTrend.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicals, indicator, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityVolumePriceTrend {\n");
    
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

