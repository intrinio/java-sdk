

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseETFs
 */

public class ApiResponseETFs {
  @SerializedName("etfs")
  private List<ETFSummary> etfs = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseETFs etfs(List<ETFSummary> etfs) {
    this.etfs = etfs;
    return this;
  }

  public ApiResponseETFs addEtfsItem(ETFSummary etfsItem) {
    if (this.etfs == null) {
      this.etfs = new ArrayList<>();
    }
    this.etfs.add(etfsItem);
    return this;
  }

   /**
   * Get etfs
   * @return etfs
  **/
  @ApiModelProperty(value = "")
  public List<ETFSummary> getEtfs() {
    return etfs;
  }

  public void setEtfs(List<ETFSummary> etfs) {
    this.etfs = etfs;
  }

  public ApiResponseETFs nextPage(String nextPage) {
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
    ApiResponseETFs apiResponseETFs = (ApiResponseETFs) o;
    return Objects.equals(this.etfs, apiResponseETFs.etfs) &&
        Objects.equals(this.nextPage, apiResponseETFs.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etfs, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseETFs {\n");
    
    sb.append("    etfs: ").append(toIndentedString(etfs)).append("\n");
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

