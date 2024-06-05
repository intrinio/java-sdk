

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
import java.math.BigDecimal;

/**
 * Total aggregated open interest and volume for the ticker
 */
@ApiModel(description = "Total aggregated open interest and volume for the ticker")

public class OptionsAggregate {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("total_open_interest")
  private BigDecimal totalOpenInterest = null;

  @SerializedName("total_volume")
  private BigDecimal totalVolume = null;

  public OptionsAggregate ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol of the Security for the Option.
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol of the Security for the Option.")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public OptionsAggregate totalOpenInterest(BigDecimal totalOpenInterest) {
    this.totalOpenInterest = totalOpenInterest;
    return this;
  }

   /**
   * Total open interest for the ticker
   * @return totalOpenInterest
  **/
  @ApiModelProperty(value = "Total open interest for the ticker")
  public BigDecimal getTotalOpenInterest() {
    return totalOpenInterest;
  }

  public void setTotalOpenInterest(BigDecimal totalOpenInterest) {
    this.totalOpenInterest = totalOpenInterest;
  }

  public OptionsAggregate totalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Total volume for the ticker
   * @return totalVolume
  **/
  @ApiModelProperty(value = "Total volume for the ticker")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsAggregate optionsAggregate = (OptionsAggregate) o;
    return Objects.equals(this.ticker, optionsAggregate.ticker) &&
        Objects.equals(this.totalOpenInterest, optionsAggregate.totalOpenInterest) &&
        Objects.equals(this.totalVolume, optionsAggregate.totalVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, totalOpenInterest, totalVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsAggregate {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    totalOpenInterest: ").append(toIndentedString(totalOpenInterest)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
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

