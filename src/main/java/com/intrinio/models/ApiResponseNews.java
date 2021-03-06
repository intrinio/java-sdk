

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanyNews;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseNews
 */

public class ApiResponseNews {
  @SerializedName("news")
  private List<CompanyNews> news = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseNews news(List<CompanyNews> news) {
    this.news = news;
    return this;
  }

  public ApiResponseNews addNewsItem(CompanyNews newsItem) {
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
  public List<CompanyNews> getNews() {
    return news;
  }

  public void setNews(List<CompanyNews> news) {
    this.news = news;
  }

  public ApiResponseNews nextPage(String nextPage) {
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
    ApiResponseNews apiResponseNews = (ApiResponseNews) o;
    return Objects.equals(this.news, apiResponseNews.news) &&
        Objects.equals(this.nextPage, apiResponseNews.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(news, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseNews {\n");
    
    sb.append("    news: ").append(toIndentedString(news)).append("\n");
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

