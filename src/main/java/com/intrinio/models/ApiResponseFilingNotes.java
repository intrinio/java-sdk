

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
 * ApiResponseFilingNotes
 */

public class ApiResponseFilingNotes {
  @SerializedName("filing_notes")
  private List<FilingNoteSummary> filingNotes = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseFilingNotes filingNotes(List<FilingNoteSummary> filingNotes) {
    this.filingNotes = filingNotes;
    return this;
  }

  public ApiResponseFilingNotes addFilingNotesItem(FilingNoteSummary filingNotesItem) {
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

  public ApiResponseFilingNotes nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further results are available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further results are available.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseFilingNotes apiResponseFilingNotes = (ApiResponseFilingNotes) o;
    return Objects.equals(this.filingNotes, apiResponseFilingNotes.filingNotes) &&
        Objects.equals(this.nextPage, apiResponseFilingNotes.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filingNotes, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseFilingNotes {\n");
    
    sb.append("    filingNotes: ").append(toIndentedString(filingNotes)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

