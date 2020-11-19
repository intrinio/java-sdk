

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.BulkDownloadSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseBulkDownloadLinks
 */

public class ApiResponseBulkDownloadLinks {
  @SerializedName("bulk_downloads")
  private List<BulkDownloadSummary> bulkDownloads = null;

  public ApiResponseBulkDownloadLinks bulkDownloads(List<BulkDownloadSummary> bulkDownloads) {
    this.bulkDownloads = bulkDownloads;
    return this;
  }

  public ApiResponseBulkDownloadLinks addBulkDownloadsItem(BulkDownloadSummary bulkDownloadsItem) {
    if (this.bulkDownloads == null) {
      this.bulkDownloads = new ArrayList<>();
    }
    this.bulkDownloads.add(bulkDownloadsItem);
    return this;
  }

   /**
   * Get bulkDownloads
   * @return bulkDownloads
  **/
  @ApiModelProperty(value = "")
  public List<BulkDownloadSummary> getBulkDownloads() {
    return bulkDownloads;
  }

  public void setBulkDownloads(List<BulkDownloadSummary> bulkDownloads) {
    this.bulkDownloads = bulkDownloads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseBulkDownloadLinks apiResponseBulkDownloadLinks = (ApiResponseBulkDownloadLinks) o;
    return Objects.equals(this.bulkDownloads, apiResponseBulkDownloadLinks.bulkDownloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkDownloads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseBulkDownloadLinks {\n");
    
    sb.append("    bulkDownloads: ").append(toIndentedString(bulkDownloads)).append("\n");
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

