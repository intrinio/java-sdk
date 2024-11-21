

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseIndex;
import com.intrinio.models.IndexConstituents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * ApiResponseIndexConstituents
 */

public class ApiResponseIndexConstituents {
  @SerializedName("index")
  private ApiResponseIndex index = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("constituents")
  private IndexConstituents constituents = null;

  public ApiResponseIndexConstituents index(ApiResponseIndex index) {
    this.index = index;
    return this;
  }

   /**
   * The index
   * @return index
  **/
  @ApiModelProperty(value = "The index")
  public ApiResponseIndex getIndex() {
    return index;
  }

  public void setIndex(ApiResponseIndex index) {
    this.index = index;
  }

  public ApiResponseIndexConstituents date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date when an update was last received for the index constituents
   * @return date
  **/
  @ApiModelProperty(value = "The date when an update was last received for the index constituents")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ApiResponseIndexConstituents constituents(IndexConstituents constituents) {
    this.constituents = constituents;
    return this;
  }

   /**
   * Get constituents
   * @return constituents
  **/
  @ApiModelProperty(value = "")
  public IndexConstituents getConstituents() {
    return constituents;
  }

  public void setConstituents(IndexConstituents constituents) {
    this.constituents = constituents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseIndexConstituents apiResponseIndexConstituents = (ApiResponseIndexConstituents) o;
    return Objects.equals(this.index, apiResponseIndexConstituents.index) &&
        Objects.equals(this.date, apiResponseIndexConstituents.date) &&
        Objects.equals(this.constituents, apiResponseIndexConstituents.constituents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, date, constituents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseIndexConstituents {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    constituents: ").append(toIndentedString(constituents)).append("\n");
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

