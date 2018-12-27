

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.FilingNoteFiling;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Metadata for the note retrieved including the Intrinio ID, tag and summary of the filing to which it belongs
 */
@ApiModel(description = "Metadata for the note retrieved including the Intrinio ID, tag and summary of the filing to which it belongs")

public class FilingNoteSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("xbrl_tag")
  private String xbrlTag = null;

  @SerializedName("filing")
  private FilingNoteFiling filing = null;

  public FilingNoteSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the note
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the note")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FilingNoteSummary xbrlTag(String xbrlTag) {
    this.xbrlTag = xbrlTag;
    return this;
  }

   /**
   * The XBRL tag used for the note by the filing entity
   * @return xbrlTag
  **/
  @ApiModelProperty(value = "The XBRL tag used for the note by the filing entity")
  public String getXbrlTag() {
    return xbrlTag;
  }

  public void setXbrlTag(String xbrlTag) {
    this.xbrlTag = xbrlTag;
  }

  public FilingNoteSummary filing(FilingNoteFiling filing) {
    this.filing = filing;
    return this;
  }

   /**
   * Get filing
   * @return filing
  **/
  @ApiModelProperty(value = "")
  public FilingNoteFiling getFiling() {
    return filing;
  }

  public void setFiling(FilingNoteFiling filing) {
    this.filing = filing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilingNoteSummary filingNoteSummary = (FilingNoteSummary) o;
    return Objects.equals(this.id, filingNoteSummary.id) &&
        Objects.equals(this.xbrlTag, filingNoteSummary.xbrlTag) &&
        Objects.equals(this.filing, filingNoteSummary.filing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xbrlTag, filing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilingNoteSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xbrlTag: ").append(toIndentedString(xbrlTag)).append("\n");
    sb.append("    filing: ").append(toIndentedString(filing)).append("\n");
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

