

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.FilingNoteSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseFilingNotesSearch
 */

public class ApiResponseFilingNotesSearch {
  @SerializedName("filing_notes")
  private List<FilingNoteSummary> filingNotes = null;

  public ApiResponseFilingNotesSearch filingNotes(List<FilingNoteSummary> filingNotes) {
    this.filingNotes = filingNotes;
    return this;
  }

  public ApiResponseFilingNotesSearch addFilingNotesItem(FilingNoteSummary filingNotesItem) {
    if (this.filingNotes == null) {
      this.filingNotes = new ArrayList<FilingNoteSummary>();
    }
    this.filingNotes.add(filingNotesItem);
    return this;
  }

   /**
   * Get filingNotes
   * @return filingNotes
  **/
  @ApiModelProperty(value = "")
  public List<FilingNoteSummary> getFilingNotes() {
    return filingNotes;
  }

  public void setFilingNotes(List<FilingNoteSummary> filingNotes) {
    this.filingNotes = filingNotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseFilingNotesSearch apiResponseFilingNotesSearch = (ApiResponseFilingNotesSearch) o;
    return Objects.equals(this.filingNotes, apiResponseFilingNotesSearch.filingNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filingNotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseFilingNotesSearch {\n");
    
    sb.append("    filingNotes: ").append(toIndentedString(filingNotes)).append("\n");
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

