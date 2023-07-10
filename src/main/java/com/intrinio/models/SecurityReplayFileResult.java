

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
import java.math.BigDecimal;

/**
 * An security replay file result contains a binary file intended to be replayed in a websocket client. The file contains every event that happened on the websocket for that day and subsource.
 */
@ApiModel(description = "An security replay file result contains a binary file intended to be replayed in a websocket client. The file contains every event that happened on the websocket for that day and subsource.")

public class SecurityReplayFileResult {
  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("size")
  private BigDecimal size = null;

  public SecurityReplayFileResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the file.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the file.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityReplayFileResult url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url where the file may be downloaded.
   * @return url
  **/
  @ApiModelProperty(value = "The url where the file may be downloaded.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SecurityReplayFileResult size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return size
  **/
  @ApiModelProperty(value = "The size of the file in bytes.")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityReplayFileResult securityReplayFileResult = (SecurityReplayFileResult) o;
    return Objects.equals(this.name, securityReplayFileResult.name) &&
        Objects.equals(this.url, securityReplayFileResult.url) &&
        Objects.equals(this.size, securityReplayFileResult.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityReplayFileResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

