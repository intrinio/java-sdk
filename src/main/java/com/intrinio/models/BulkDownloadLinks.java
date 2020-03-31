

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

/**
 * The url and name of a bulk download link
 */
@ApiModel(description = "The url and name of a bulk download link")

public class BulkDownloadLinks {
  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public BulkDownloadLinks name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the file
   * @return name
  **/
  @ApiModelProperty(value = "The name of the file")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkDownloadLinks url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Link for accessing the bulk download. Expires in 24 hours.
   * @return url
  **/
  @ApiModelProperty(value = "Link for accessing the bulk download. Expires in 24 hours.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDownloadLinks bulkDownloadLinks = (BulkDownloadLinks) o;
    return Objects.equals(this.name, bulkDownloadLinks.name) &&
        Objects.equals(this.url, bulkDownloadLinks.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadLinks {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

