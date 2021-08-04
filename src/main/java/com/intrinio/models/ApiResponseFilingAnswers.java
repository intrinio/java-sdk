

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Filing;
import com.intrinio.models.TheaEntityAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseFilingAnswers
 */

public class ApiResponseFilingAnswers {
  @SerializedName("source")
  private String source = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("answers")
  private List<TheaEntityAnswer> answers = null;

  @SerializedName("companies")
  private List<Filing> companies = null;

  public ApiResponseFilingAnswers source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The organziation the answer data was sourced from
   * @return source
  **/
  @ApiModelProperty(value = "The organziation the answer data was sourced from")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ApiResponseFilingAnswers query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query posed to the Thea API
   * @return query
  **/
  @ApiModelProperty(value = "The query posed to the Thea API")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ApiResponseFilingAnswers answers(List<TheaEntityAnswer> answers) {
    this.answers = answers;
    return this;
  }

  public ApiResponseFilingAnswers addAnswersItem(TheaEntityAnswer answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * Get answers
   * @return answers
  **/
  @ApiModelProperty(value = "")
  public List<TheaEntityAnswer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<TheaEntityAnswer> answers) {
    this.answers = answers;
  }

  public ApiResponseFilingAnswers companies(List<Filing> companies) {
    this.companies = companies;
    return this;
  }

  public ApiResponseFilingAnswers addCompaniesItem(Filing companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @ApiModelProperty(value = "")
  public List<Filing> getCompanies() {
    return companies;
  }

  public void setCompanies(List<Filing> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseFilingAnswers apiResponseFilingAnswers = (ApiResponseFilingAnswers) o;
    return Objects.equals(this.source, apiResponseFilingAnswers.source) &&
        Objects.equals(this.query, apiResponseFilingAnswers.query) &&
        Objects.equals(this.answers, apiResponseFilingAnswers.answers) &&
        Objects.equals(this.companies, apiResponseFilingAnswers.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, query, answers, companies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseFilingAnswers {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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

