

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
 * The name and symbol of the Technical Indicator
 */
@ApiModel(description = "The name and symbol of the Technical Indicator")

public class TechnicalIndicator {
  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  public TechnicalIndicator name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Technical Indicator
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Technical Indicator")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TechnicalIndicator symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the Technical Indicator
   * @return symbol
  **/
  @ApiModelProperty(value = "The symbol of the Technical Indicator")
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
    TechnicalIndicator technicalIndicator = (TechnicalIndicator) o;
    return Objects.equals(this.name, technicalIndicator.name) &&
        Objects.equals(this.symbol, technicalIndicator.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalIndicator {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

