

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanyNewsSummary;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyNews
 */

public class ApiResponseCompanyNews {
  @SerializedName("news")
  private List<CompanyNewsSummary> news = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyNews news(List<CompanyNewsSummary> news) {
    this.news = news;
    return this;
  }

  public ApiResponseCompanyNews addNewsItem(CompanyNewsSummary newsItem) {
    if (this.news == null) {
      this.news = new ArrayList<>();
    }
    this.news.add(newsItem);
    return this;
  }

   /**
   * Get news
   * @return news
  **/
  @ApiModelProperty(value = "")
  public List<CompanyNewsSummary> getNews() {
    return news;
  }

  public void setNews(List<CompanyNewsSummary> news) {
    this.news = news;
  }

  public ApiResponseCompanyNews company(CompanySummary company) {
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

  public ApiResponseCompanyNews nextPage(String nextPage) {
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
    ApiResponseCompanyNews apiResponseCompanyNews = (ApiResponseCompanyNews) o;
    return Objects.equals(this.news, apiResponseCompanyNews.news) &&
        Objects.equals(this.company, apiResponseCompanyNews.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyNews.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(news, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyNews {\n");
    
    sb.append("    news: ").append(toIndentedString(news)).append("\n");
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

