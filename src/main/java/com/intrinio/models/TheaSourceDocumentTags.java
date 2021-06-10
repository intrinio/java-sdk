

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

/**
 * TheaSourceDocumentTags
 */

public class TheaSourceDocumentTags {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public TheaSourceDocumentTags key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Defintes whether the tag is a key or a value
   * @return key
  **/
  @ApiModelProperty(value = "Defintes whether the tag is a key or a value")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TheaSourceDocumentTags value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the tag
   * @return value
  **/
  @ApiModelProperty(value = "The value of the tag")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TheaSourceDocumentTags theaSourceDocumentTags = (TheaSourceDocumentTags) o;
    return Objects.equals(this.key, theaSourceDocumentTags.key) &&
        Objects.equals(this.value, theaSourceDocumentTags.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TheaSourceDocumentTags {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

