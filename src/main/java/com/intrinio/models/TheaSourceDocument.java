

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Document from which Thea answer data is sourced
 */
@ApiModel(description = "Document from which Thea answer data is sourced")

public class TheaSourceDocument {
  @SerializedName("id")
  private String id = null;

  @SerializedName("date_time")
  private LocalDate dateTime = null;

  @SerializedName("tags")
  private List<Object> tags = null;

  public TheaSourceDocument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id for the Thea source document
   * @return id
  **/
  @ApiModelProperty(value = "The unique id for the Thea source document")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TheaSourceDocument dateTime(LocalDate dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date at which the document was created
   * @return dateTime
  **/
  @ApiModelProperty(value = "The date at which the document was created")
  public LocalDate getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDate dateTime) {
    this.dateTime = dateTime;
  }

  public TheaSourceDocument tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public TheaSourceDocument addTagsItem(Object tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Entity identifying tags associated with the source document
   * @return tags
  **/
  @ApiModelProperty(value = "Entity identifying tags associated with the source document")
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
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
    TheaSourceDocument theaSourceDocument = (TheaSourceDocument) o;
    return Objects.equals(this.id, theaSourceDocument.id) &&
        Objects.equals(this.dateTime, theaSourceDocument.dateTime) &&
        Objects.equals(this.tags, theaSourceDocument.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateTime, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheaSourceDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

