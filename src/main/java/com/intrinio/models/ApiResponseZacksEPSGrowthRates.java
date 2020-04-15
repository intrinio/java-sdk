

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksEPSGrowthRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksEPSGrowthRates
 */

public class ApiResponseZacksEPSGrowthRates {
  @SerializedName("eps_growth_rates")
  private List<ZacksEPSGrowthRate> epsGrowthRates = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksEPSGrowthRates epsGrowthRates(List<ZacksEPSGrowthRate> epsGrowthRates) {
    this.epsGrowthRates = epsGrowthRates;
    return this;
  }

  public ApiResponseZacksEPSGrowthRates addEpsGrowthRatesItem(ZacksEPSGrowthRate epsGrowthRatesItem) {
    if (this.epsGrowthRates == null) {
      this.epsGrowthRates = new ArrayList<ZacksEPSGrowthRate>();
    }
    this.epsGrowthRates.add(epsGrowthRatesItem);
    return this;
  }

   /**
   * Zacks EPS growth rate for the latest date
   * @return epsGrowthRates
  **/
  @ApiModelProperty(value = "Zacks EPS growth rate for the latest date")
  public List<ZacksEPSGrowthRate> getEpsGrowthRates() {
    return epsGrowthRates;
  }

  public void setEpsGrowthRates(List<ZacksEPSGrowthRate> epsGrowthRates) {
    this.epsGrowthRates = epsGrowthRates;
  }

  public ApiResponseZacksEPSGrowthRates nextPage(String nextPage) {
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
    ApiResponseZacksEPSGrowthRates apiResponseZacksEPSGrowthRates = (ApiResponseZacksEPSGrowthRates) o;
    return Objects.equals(this.epsGrowthRates, apiResponseZacksEPSGrowthRates.epsGrowthRates) &&
        Objects.equals(this.nextPage, apiResponseZacksEPSGrowthRates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsGrowthRates, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksEPSGrowthRates {\n");
    
    sb.append("    epsGrowthRates: ").append(toIndentedString(epsGrowthRates)).append("\n");
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

