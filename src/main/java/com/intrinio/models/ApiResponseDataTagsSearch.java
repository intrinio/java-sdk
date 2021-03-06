

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
 * ApiResponseDataTagsSearch
 */

public class ApiResponseDataTagsSearch {
  @SerializedName("tags")
  private List<DataTag> tags = null;

  public ApiResponseDataTagsSearch tags(List<DataTag> tags) {
    this.tags = tags;
    return this;
  }

  public ApiResponseDataTagsSearch addTagsItem(DataTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseDataTagsSearch apiResponseDataTagsSearch = (ApiResponseDataTagsSearch) o;
    return Objects.equals(this.tags, apiResponseDataTagsSearch.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseDataTagsSearch {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

