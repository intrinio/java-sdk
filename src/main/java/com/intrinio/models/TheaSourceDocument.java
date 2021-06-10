

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.TheaSourceDocumentTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document from which Thea answer data is sourced
 */
@ApiModel(description = "Document from which Thea answer data is sourced")

public class TheaSourceDocument {
  @SerializedName("id")
  private String id = null;

  @SerializedName("tags")
  private List<TheaSourceDocumentTags> tags = null;

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

  public TheaSourceDocument tags(List<TheaSourceDocumentTags> tags) {
    this.tags = tags;
    return this;
  }

  public TheaSourceDocument addTagsItem(TheaSourceDocumentTags tagsItem) {
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
  public List<TheaSourceDocumentTags> getTags() {
    return tags;
  }

  public void setTags(List<TheaSourceDocumentTags> tags) {
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
        Objects.equals(this.tags, theaSourceDocument.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheaSourceDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

