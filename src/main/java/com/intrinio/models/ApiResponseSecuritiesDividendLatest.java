

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DividendRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecuritiesDividendLatest
 */

public class ApiResponseSecuritiesDividendLatest {
  @SerializedName("dividend_records")
  private List<DividendRecord> dividendRecords = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecuritiesDividendLatest dividendRecords(List<DividendRecord> dividendRecords) {
    this.dividendRecords = dividendRecords;
    return this;
  }

  public ApiResponseSecuritiesDividendLatest addDividendRecordsItem(DividendRecord dividendRecordsItem) {
    if (this.dividendRecords == null) {
      this.dividendRecords = new ArrayList<>();
    }
    this.dividendRecords.add(dividendRecordsItem);
    return this;
  }

   /**
   * Get dividendRecords
   * @return dividendRecords
  **/
  @ApiModelProperty(value = "")
  public List<DividendRecord> getDividendRecords() {
    return dividendRecords;
  }

  public void setDividendRecords(List<DividendRecord> dividendRecords) {
    this.dividendRecords = dividendRecords;
  }

  public ApiResponseSecuritiesDividendLatest nextPage(String nextPage) {
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
    ApiResponseSecuritiesDividendLatest apiResponseSecuritiesDividendLatest = (ApiResponseSecuritiesDividendLatest) o;
    return Objects.equals(this.dividendRecords, apiResponseSecuritiesDividendLatest.dividendRecords) &&
        Objects.equals(this.nextPage, apiResponseSecuritiesDividendLatest.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividendRecords, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecuritiesDividendLatest {\n");
    
    sb.append("    dividendRecords: ").append(toIndentedString(dividendRecords)).append("\n");
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

