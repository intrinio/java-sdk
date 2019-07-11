

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A news article about a company
 */
@ApiModel(description = "A news article about a company")

public class CompanyNews {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("publication_date")
  private OffsetDateTime publicationDate = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public CompanyNews id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the news article
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the news article")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public CompanyNews publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * The publication date of the news article
   * @return publicationDate
  **/
  @ApiModelProperty(value = "The publication date of the news article")
  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(OffsetDateTime publicationDate) {
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

  public CompanyNews company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The Company to which the new article pertains
   * @return company
  **/
  @ApiModelProperty(value = "The Company to which the new article pertains")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
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
    CompanyNews companyNews = (CompanyNews) o;
    return Objects.equals(this.id, companyNews.id) &&
        Objects.equals(this.title, companyNews.title) &&
        Objects.equals(this.publicationDate, companyNews.publicationDate) &&
        Objects.equals(this.url, companyNews.url) &&
        Objects.equals(this.summary, companyNews.summary) &&
        Objects.equals(this.company, companyNews.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, publicationDate, url, summary, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyNews {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

