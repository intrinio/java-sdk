

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.InsiderTransactionFiling;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyInsiderTransactionFilings
 */

public class ApiResponseCompanyInsiderTransactionFilings {
  @SerializedName("transaction_filings")
  private List<InsiderTransactionFiling> transactionFilings = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyInsiderTransactionFilings transactionFilings(List<InsiderTransactionFiling> transactionFilings) {
    this.transactionFilings = transactionFilings;
    return this;
  }

  public ApiResponseCompanyInsiderTransactionFilings addTransactionFilingsItem(InsiderTransactionFiling transactionFilingsItem) {
    if (this.transactionFilings == null) {
      this.transactionFilings = new ArrayList<>();
    }
    this.transactionFilings.add(transactionFilingsItem);
    return this;
  }

   /**
   * Get transactionFilings
   * @return transactionFilings
  **/
  @ApiModelProperty(value = "")
  public List<InsiderTransactionFiling> getTransactionFilings() {
    return transactionFilings;
  }

  public void setTransactionFilings(List<InsiderTransactionFiling> transactionFilings) {
    this.transactionFilings = transactionFilings;
  }

  public ApiResponseCompanyInsiderTransactionFilings company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The company associated with the transaction filing
   * @return company
  **/
  @ApiModelProperty(value = "The company associated with the transaction filing")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public ApiResponseCompanyInsiderTransactionFilings nextPage(String nextPage) {
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
    ApiResponseCompanyInsiderTransactionFilings apiResponseCompanyInsiderTransactionFilings = (ApiResponseCompanyInsiderTransactionFilings) o;
    return Objects.equals(this.transactionFilings, apiResponseCompanyInsiderTransactionFilings.transactionFilings) &&
        Objects.equals(this.company, apiResponseCompanyInsiderTransactionFilings.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyInsiderTransactionFilings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFilings, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyInsiderTransactionFilings {\n");
    
    sb.append("    transactionFilings: ").append(toIndentedString(transactionFilings)).append("\n");
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

