

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.BulkDownloadLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about bulk downloads with download links
 */
@ApiModel(description = "Information about bulk downloads with download links")

public class BulkDownloadSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("data_length_bytes")
  private String dataLengthBytes = null;

  @SerializedName("update_frequency")
  private String updateFrequency = null;

  @SerializedName("links")
  private List<BulkDownloadLinks> links = null;

  public BulkDownloadSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the bulk download
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the bulk download")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BulkDownloadSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the bulk download
   * @return name
  **/
  @ApiModelProperty(value = "The name of the bulk download")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkDownloadSummary format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The file format of the bulk download
   * @return format
  **/
  @ApiModelProperty(value = "The file format of the bulk download")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public BulkDownloadSummary dataLengthBytes(String dataLengthBytes) {
    this.dataLengthBytes = dataLengthBytes;
    return this;
  }

   /**
   * The total length of the bulk download data in bytes
   * @return dataLengthBytes
  **/
  @ApiModelProperty(value = "The total length of the bulk download data in bytes")
  public String getDataLengthBytes() {
    return dataLengthBytes;
  }

  public void setDataLengthBytes(String dataLengthBytes) {
    this.dataLengthBytes = dataLengthBytes;
  }

  public BulkDownloadSummary updateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
    return this;
  }

   /**
   * The update frequency for the bulk download
   * @return updateFrequency
  **/
  @ApiModelProperty(value = "The update frequency for the bulk download")
  public String getUpdateFrequency() {
    return updateFrequency;
  }

  public void setUpdateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
  }

  public BulkDownloadSummary links(List<BulkDownloadLinks> links) {
    this.links = links;
    return this;
  }

  public BulkDownloadSummary addLinksItem(BulkDownloadLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Links to all of the files comprising the bulk download. Links expire in 24 hours.
   * @return links
  **/
  @ApiModelProperty(value = "Links to all of the files comprising the bulk download. Links expire in 24 hours.")
  public List<BulkDownloadLinks> getLinks() {
    return links;
  }

  public void setLinks(List<BulkDownloadLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDownloadSummary bulkDownloadSummary = (BulkDownloadSummary) o;
    return Objects.equals(this.id, bulkDownloadSummary.id) &&
        Objects.equals(this.name, bulkDownloadSummary.name) &&
        Objects.equals(this.format, bulkDownloadSummary.format) &&
        Objects.equals(this.dataLengthBytes, bulkDownloadSummary.dataLengthBytes) &&
        Objects.equals(this.updateFrequency, bulkDownloadSummary.updateFrequency) &&
        Objects.equals(this.links, bulkDownloadSummary.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, format, dataLengthBytes, updateFrequency, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    dataLengthBytes: ").append(toIndentedString(dataLengthBytes)).append("\n");
    sb.append("    updateFrequency: ").append(toIndentedString(updateFrequency)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

