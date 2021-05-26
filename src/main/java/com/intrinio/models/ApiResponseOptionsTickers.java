

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

/**
 * ApiResponseOptionsTickers
 */

public class ApiResponseOptionsTickers {
  @SerializedName("tickers")
  private List<String> tickers = null;

  public ApiResponseOptionsTickers tickers(List<String> tickers) {
    this.tickers = tickers;
    return this;
  }

  public ApiResponseOptionsTickers addTickersItem(String tickersItem) {
    if (this.tickers == null) {
      this.tickers = new ArrayList<>();
    }
    this.tickers.add(tickersItem);
    return this;
  }

   /**
   * Get tickers
   * @return tickers
  **/
  @ApiModelProperty(value = "")
  public List<String> getTickers() {
    return tickers;
  }

  public void setTickers(List<String> tickers) {
    this.tickers = tickers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsTickers apiResponseOptionsTickers = (ApiResponseOptionsTickers) o;
    return Objects.equals(this.tickers, apiResponseOptionsTickers.tickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsTickers {\n");
    
    sb.append("    tickers: ").append(toIndentedString(tickers)).append("\n");
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

