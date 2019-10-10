

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DataTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseDataTags
 */

public class ApiResponseDataTags {
  @SerializedName("tags")
  private List<DataTag> tags = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseDataTags tags(List<DataTag> tags) {
    this.tags = tags;
    return this;
  }

  public ApiResponseDataTags addTagsItem(DataTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<DataTag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<DataTag> getTags() {
    return tags;
  }

  public void setTags(List<DataTag> tags) {
    this.tags = tags;
  }

  public ApiResponseDataTags nextPage(String nextPage) {
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
    ApiResponseDataTags apiResponseDataTags = (ApiResponseDataTags) o;
    return Objects.equals(this.tags, apiResponseDataTags.tags) &&
        Objects.equals(this.nextPage, apiResponseDataTags.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseDataTags {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

