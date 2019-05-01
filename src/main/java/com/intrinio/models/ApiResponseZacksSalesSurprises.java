

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksSalesSurprise;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksSalesSurprises
 */

public class ApiResponseZacksSalesSurprises {
  @SerializedName("sales_surprises")
  private List<ZacksSalesSurprise> salesSurprises = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksSalesSurprises salesSurprises(List<ZacksSalesSurprise> salesSurprises) {
    this.salesSurprises = salesSurprises;
    return this;
  }

  public ApiResponseZacksSalesSurprises addSalesSurprisesItem(ZacksSalesSurprise salesSurprisesItem) {
    if (this.salesSurprises == null) {
      this.salesSurprises = new ArrayList<ZacksSalesSurprise>();
    }
    this.salesSurprises.add(salesSurprisesItem);
    return this;
  }

   /**
   * Zacks Sales Surprise data for a Security in descending order by actual reported date
   * @return salesSurprises
  **/
  @ApiModelProperty(value = "Zacks Sales Surprise data for a Security in descending order by actual reported date")
  public List<ZacksSalesSurprise> getSalesSurprises() {
    return salesSurprises;
  }

  public void setSalesSurprises(List<ZacksSalesSurprise> salesSurprises) {
    this.salesSurprises = salesSurprises;
  }

  public ApiResponseZacksSalesSurprises nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    ApiResponseZacksSalesSurprises apiResponseZacksSalesSurprises = (ApiResponseZacksSalesSurprises) o;
    return Objects.equals(this.salesSurprises, apiResponseZacksSalesSurprises.salesSurprises) &&
        Objects.equals(this.nextPage, apiResponseZacksSalesSurprises.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesSurprises, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksSalesSurprises {\n");
    
    sb.append("    salesSurprises: ").append(toIndentedString(salesSurprises)).append("\n");
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

