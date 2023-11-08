

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

/**
 * The name of the Index
 */
@ApiModel(description = "The name of the Index")

public class RealtimeIndexPriceIndex {
  @SerializedName("symbol")
  private String symbol = null;

  public RealtimeIndexPriceIndex symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The current ticker of the index
   * @return symbol
  **/
  @ApiModelProperty(value = "The current ticker of the index")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeIndexPriceIndex realtimeIndexPriceIndex = (RealtimeIndexPriceIndex) o;
    return Objects.equals(this.symbol, realtimeIndexPriceIndex.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeIndexPriceIndex {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

