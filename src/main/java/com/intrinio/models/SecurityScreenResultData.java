

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
 * SecurityScreenResultData
 */

public class SecurityScreenResultData {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("number_value")
  private String numberValue = null;

  @SerializedName("text_value")
  private String textValue = null;

  public SecurityScreenResultData tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The data tag that was screened-for
   * @return tag
  **/
  @ApiModelProperty(value = "The data tag that was screened-for")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public SecurityScreenResultData numberValue(String numberValue) {
    this.numberValue = numberValue;
    return this;
  }

   /**
   * The numeric value for the tag
   * @return numberValue
  **/
  @ApiModelProperty(value = "The numeric value for the tag")
  public String getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(String numberValue) {
    this.numberValue = numberValue;
  }

  public SecurityScreenResultData textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

   /**
   * The text value for the tag
   * @return textValue
  **/
  @ApiModelProperty(value = "The text value for the tag")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScreenResultData securityScreenResultData = (SecurityScreenResultData) o;
    return Objects.equals(this.tag, securityScreenResultData.tag) &&
        Objects.equals(this.numberValue, securityScreenResultData.numberValue) &&
        Objects.equals(this.textValue, securityScreenResultData.textValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, numberValue, textValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScreenResultData {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
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

