

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.EarningsRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecuritiesEarningsLatest
 */

public class ApiResponseSecuritiesEarningsLatest {
  @SerializedName("earnings_records")
  private List<EarningsRecord> earningsRecords = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecuritiesEarningsLatest earningsRecords(List<EarningsRecord> earningsRecords) {
    this.earningsRecords = earningsRecords;
    return this;
  }

  public ApiResponseSecuritiesEarningsLatest addEarningsRecordsItem(EarningsRecord earningsRecordsItem) {
    if (this.earningsRecords == null) {
      this.earningsRecords = new ArrayList<>();
    }
    this.earningsRecords.add(earningsRecordsItem);
    return this;
  }

   /**
   * Get earningsRecords
   * @return earningsRecords
  **/
  @ApiModelProperty(value = "")
  public List<EarningsRecord> getEarningsRecords() {
    return earningsRecords;
  }

  public void setEarningsRecords(List<EarningsRecord> earningsRecords) {
    this.earningsRecords = earningsRecords;
  }

  public ApiResponseSecuritiesEarningsLatest nextPage(String nextPage) {
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
    ApiResponseSecuritiesEarningsLatest apiResponseSecuritiesEarningsLatest = (ApiResponseSecuritiesEarningsLatest) o;
    return Objects.equals(this.earningsRecords, apiResponseSecuritiesEarningsLatest.earningsRecords) &&
        Objects.equals(this.nextPage, apiResponseSecuritiesEarningsLatest.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRecords, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecuritiesEarningsLatest {\n");
    
    sb.append("    earningsRecords: ").append(toIndentedString(earningsRecords)).append("\n");
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

