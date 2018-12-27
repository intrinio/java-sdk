

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
 * A filing submitted to the SEC by a company
 */
@ApiModel(description = "A filing submitted to the SEC by a company")

public class FilingNote {
  @SerializedName("id")
  private String id = null;

  @SerializedName("xbrl_tag")
  private String xbrlTag = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("filing")
  private FilingNoteFiling filing = null;

  public FilingNote id(String id) {
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

  public FilingNote xbrlTag(String xbrlTag) {
    this.xbrlTag = xbrlTag;
    return this;
  }

   /**
   * The XBRL Tag used for the note
   * @return xbrlTag
  **/
  @ApiModelProperty(value = "The XBRL Tag used for the note")
  public String getXbrlTag() {
    return xbrlTag;
  }

  public void setXbrlTag(String xbrlTag) {
    this.xbrlTag = xbrlTag;
  }

  public FilingNote content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The plain text (after html has been removed) of the note, or text including html if the content_format parameter has been set to html
   * @return content
  **/
  @ApiModelProperty(value = "The plain text (after html has been removed) of the note, or text including html if the content_format parameter has been set to html")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public FilingNote filing(FilingNoteFiling filing) {
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
    FilingNote filingNote = (FilingNote) o;
    return Objects.equals(this.id, filingNote.id) &&
        Objects.equals(this.xbrlTag, filingNote.xbrlTag) &&
        Objects.equals(this.content, filingNote.content) &&
        Objects.equals(this.filing, filingNote.filing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xbrlTag, content, filing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilingNote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xbrlTag: ").append(toIndentedString(xbrlTag)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

