

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
  @SerializedName("data_tags")
  private List<DataTag> dataTags = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseDataTags dataTags(List<DataTag> dataTags) {
    this.dataTags = dataTags;
    return this;
  }

  public ApiResponseDataTags addDataTagsItem(DataTag dataTagsItem) {
    if (this.dataTags == null) {
      this.dataTags = new ArrayList<DataTag>();
    }
    this.dataTags.add(dataTagsItem);
    return this;
  }

   /**
   * Get dataTags
   * @return dataTags
  **/
  @ApiModelProperty(value = "")
  public List<DataTag> getDataTags() {
    return dataTags;
  }

  public void setDataTags(List<DataTag> dataTags) {
    this.dataTags = dataTags;
  }

  public ApiResponseDataTags nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    return Objects.equals(this.dataTags, apiResponseDataTags.dataTags) &&
        Objects.equals(this.nextPage, apiResponseDataTags.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTags, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseDataTags {\n");
    
    sb.append("    dataTags: ").append(toIndentedString(dataTags)).append("\n");
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

