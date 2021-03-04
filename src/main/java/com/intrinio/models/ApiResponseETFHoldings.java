

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFHolding;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseETFHoldings
 */

public class ApiResponseETFHoldings {
  @SerializedName("holdings")
  private List<ETFHolding> holdings = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseETFHoldings holdings(List<ETFHolding> holdings) {
    this.holdings = holdings;
    return this;
  }

  public ApiResponseETFHoldings addHoldingsItem(ETFHolding holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @ApiModelProperty(value = "")
  public List<ETFHolding> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<ETFHolding> holdings) {
    this.holdings = holdings;
  }

  public ApiResponseETFHoldings etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * Get etf
   * @return etf
  **/
  @ApiModelProperty(value = "")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }

  public ApiResponseETFHoldings nextPage(String nextPage) {
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
    ApiResponseETFHoldings apiResponseETFHoldings = (ApiResponseETFHoldings) o;
    return Objects.equals(this.holdings, apiResponseETFHoldings.holdings) &&
        Objects.equals(this.etf, apiResponseETFHoldings.etf) &&
        Objects.equals(this.nextPage, apiResponseETFHoldings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdings, etf, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseETFHoldings {\n");
    
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
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

