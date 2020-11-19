

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksETFHolding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksETFHoldings
 */

public class ApiResponseZacksETFHoldings {
  @SerializedName("holdings")
  private List<ZacksETFHolding> holdings = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksETFHoldings holdings(List<ZacksETFHolding> holdings) {
    this.holdings = holdings;
    return this;
  }

  public ApiResponseZacksETFHoldings addHoldingsItem(ZacksETFHolding holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Zacks ETF holding data
   * @return holdings
  **/
  @ApiModelProperty(value = "Zacks ETF holding data")
  public List<ZacksETFHolding> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<ZacksETFHolding> holdings) {
    this.holdings = holdings;
  }

  public ApiResponseZacksETFHoldings nextPage(String nextPage) {
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
    ApiResponseZacksETFHoldings apiResponseZacksETFHoldings = (ApiResponseZacksETFHoldings) o;
    return Objects.equals(this.holdings, apiResponseZacksETFHoldings.holdings) &&
        Objects.equals(this.nextPage, apiResponseZacksETFHoldings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdings, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksETFHoldings {\n");
    
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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

