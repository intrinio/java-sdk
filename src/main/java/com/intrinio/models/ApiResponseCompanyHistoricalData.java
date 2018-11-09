

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.HistoricalData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyHistoricalData
 */

public class ApiResponseCompanyHistoricalData {
  @SerializedName("historical_data")
  private List<HistoricalData> historicalData = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyHistoricalData historicalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
    return this;
  }

  public ApiResponseCompanyHistoricalData addHistoricalDataItem(HistoricalData historicalDataItem) {
    if (this.historicalData == null) {
      this.historicalData = new ArrayList<HistoricalData>();
    }
    this.historicalData.add(historicalDataItem);
    return this;
  }

   /**
   * Get historicalData
   * @return historicalData
  **/
  @ApiModelProperty(value = "")
  public List<HistoricalData> getHistoricalData() {
    return historicalData;
  }

  public void setHistoricalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
  }

  public ApiResponseCompanyHistoricalData company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public ApiResponseCompanyHistoricalData nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    ApiResponseCompanyHistoricalData apiResponseCompanyHistoricalData = (ApiResponseCompanyHistoricalData) o;
    return Objects.equals(this.historicalData, apiResponseCompanyHistoricalData.historicalData) &&
        Objects.equals(this.company, apiResponseCompanyHistoricalData.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyHistoricalData.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalData, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyHistoricalData {\n");
    
    sb.append("    historicalData: ").append(toIndentedString(historicalData)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

