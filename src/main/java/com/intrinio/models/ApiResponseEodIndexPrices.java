

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseIndex;
import com.intrinio.models.EodIndexPriceSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseEodIndexPrices
 */

public class ApiResponseEodIndexPrices {
  @SerializedName("prices")
  private List<EodIndexPriceSummary> prices = null;

  @SerializedName("index")
  private ApiResponseIndex index = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseEodIndexPrices prices(List<EodIndexPriceSummary> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseEodIndexPrices addPricesItem(EodIndexPriceSummary pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")
  public List<EodIndexPriceSummary> getPrices() {
    return prices;
  }

  public void setPrices(List<EodIndexPriceSummary> prices) {
    this.prices = prices;
  }

  public ApiResponseEodIndexPrices index(ApiResponseIndex index) {
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

  public ApiResponseEodIndexPrices nextPage(String nextPage) {
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
    ApiResponseEodIndexPrices apiResponseEodIndexPrices = (ApiResponseEodIndexPrices) o;
    return Objects.equals(this.prices, apiResponseEodIndexPrices.prices) &&
        Objects.equals(this.index, apiResponseEodIndexPrices.index) &&
        Objects.equals(this.nextPage, apiResponseEodIndexPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, index, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseEodIndexPrices {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

