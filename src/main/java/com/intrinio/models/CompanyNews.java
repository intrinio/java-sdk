

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
import org.threeten.bp.LocalDate;

/**
 * A news article about a company
 */
@ApiModel(description = "A news article about a company")

public class CompanyNews {
  @SerializedName("title")
  private String title = null;

  @SerializedName("publication_date")
  private LocalDate publicationDate = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("summary")
  private String summary = null;

  public CompanyNews title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the news article
   * @return title
  **/
  @ApiModelProperty(value = "The title of the news article")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CompanyNews publicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * The publication date of the news article
   * @return publicationDate
  **/
  @ApiModelProperty(value = "The publication date of the news article")
  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
  }

  public CompanyNews url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the news article
   * @return url
  **/
  @ApiModelProperty(value = "The url of the news article")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CompanyNews summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * A summary of the news article
   * @return summary
  **/
  @ApiModelProperty(value = "A summary of the news article")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyNews companyNews = (CompanyNews) o;
    return Objects.equals(this.title, companyNews.title) &&
        Objects.equals(this.publicationDate, companyNews.publicationDate) &&
        Objects.equals(this.url, companyNews.url) &&
        Objects.equals(this.summary, companyNews.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, publicationDate, url, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyNews {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

