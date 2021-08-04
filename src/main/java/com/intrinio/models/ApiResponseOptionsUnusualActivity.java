

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionUnusualTrade;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsUnusualActivity
 */

public class ApiResponseOptionsUnusualActivity {
  @SerializedName("trades")
  private List<OptionUnusualTrade> trades = null;

  public ApiResponseOptionsUnusualActivity trades(List<OptionUnusualTrade> trades) {
    this.trades = trades;
    return this;
  }

  public ApiResponseOptionsUnusualActivity addTradesItem(OptionUnusualTrade tradesItem) {
    if (this.trades == null) {
      this.trades = new ArrayList<>();
    }
    this.trades.add(tradesItem);
    return this;
  }

   /**
   * A list of unusual trades for a given company identifier
   * @return trades
  **/
  @ApiModelProperty(value = "A list of unusual trades for a given company identifier")
  public List<OptionUnusualTrade> getTrades() {
    return trades;
  }

  public void setTrades(List<OptionUnusualTrade> trades) {
    this.trades = trades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsUnusualActivity apiResponseOptionsUnusualActivity = (ApiResponseOptionsUnusualActivity) o;
    return Objects.equals(this.trades, apiResponseOptionsUnusualActivity.trades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trades);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsUnusualActivity {\n");
    
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
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

