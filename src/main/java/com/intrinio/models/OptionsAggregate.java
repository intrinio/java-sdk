

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
 * Total aggregated open interest and volume for the ticker
 */
@ApiModel(description = "Total aggregated open interest and volume for the ticker")

public class OptionsAggregate {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("total_open_interest")
  private Long totalOpenInterest = null;

  @SerializedName("total_volume")
  private Long totalVolume = null;

  @SerializedName("total_put_volume")
  private Long totalPutVolume = null;

  @SerializedName("total_call_volume")
  private Long totalCallVolume = null;

  @SerializedName("put_call_volume_ratio")
  private Double putCallVolumeRatio = null;

  @SerializedName("contract_count")
  private Integer contractCount = null;

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

  public OptionsAggregate date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the data.
   * @return date
  **/
  @ApiModelProperty(value = "The date of the data.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OptionsAggregate totalOpenInterest(Long totalOpenInterest) {
    this.totalOpenInterest = totalOpenInterest;
    return this;
  }

   /**
   * Total open interest for the ticker
   * @return totalOpenInterest
  **/
  @ApiModelProperty(value = "Total open interest for the ticker")
  public Long getTotalOpenInterest() {
    return totalOpenInterest;
  }

  public void setTotalOpenInterest(Long totalOpenInterest) {
    this.totalOpenInterest = totalOpenInterest;
  }

  public OptionsAggregate totalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Total volume for the ticker
   * @return totalVolume
  **/
  @ApiModelProperty(value = "Total volume for the ticker")
  public Long getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(Long totalVolume) {
    this.totalVolume = totalVolume;
  }

  public OptionsAggregate totalPutVolume(Long totalPutVolume) {
    this.totalPutVolume = totalPutVolume;
    return this;
  }

   /**
   * Total put volume for the ticker
   * @return totalPutVolume
  **/
  @ApiModelProperty(value = "Total put volume for the ticker")
  public Long getTotalPutVolume() {
    return totalPutVolume;
  }

  public void setTotalPutVolume(Long totalPutVolume) {
    this.totalPutVolume = totalPutVolume;
  }

  public OptionsAggregate totalCallVolume(Long totalCallVolume) {
    this.totalCallVolume = totalCallVolume;
    return this;
  }

   /**
   * Total call volume for the ticker
   * @return totalCallVolume
  **/
  @ApiModelProperty(value = "Total call volume for the ticker")
  public Long getTotalCallVolume() {
    return totalCallVolume;
  }

  public void setTotalCallVolume(Long totalCallVolume) {
    this.totalCallVolume = totalCallVolume;
  }

  public OptionsAggregate putCallVolumeRatio(Double putCallVolumeRatio) {
    this.putCallVolumeRatio = putCallVolumeRatio;
    return this;
  }

   /**
   * Total put volume to total call volume ratio for the ticker
   * @return putCallVolumeRatio
  **/
  @ApiModelProperty(value = "Total put volume to total call volume ratio for the ticker")
  public Double getPutCallVolumeRatio() {
    return putCallVolumeRatio;
  }

  public void setPutCallVolumeRatio(Double putCallVolumeRatio) {
    this.putCallVolumeRatio = putCallVolumeRatio;
  }

  public OptionsAggregate contractCount(Integer contractCount) {
    this.contractCount = contractCount;
    return this;
  }

   /**
   * Total number of active contracts for the ticker
   * @return contractCount
  **/
  @ApiModelProperty(value = "Total number of active contracts for the ticker")
  public Integer getContractCount() {
    return contractCount;
  }

  public void setContractCount(Integer contractCount) {
    this.contractCount = contractCount;
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
        Objects.equals(this.date, optionsAggregate.date) &&
        Objects.equals(this.totalOpenInterest, optionsAggregate.totalOpenInterest) &&
        Objects.equals(this.totalVolume, optionsAggregate.totalVolume) &&
        Objects.equals(this.totalPutVolume, optionsAggregate.totalPutVolume) &&
        Objects.equals(this.totalCallVolume, optionsAggregate.totalCallVolume) &&
        Objects.equals(this.putCallVolumeRatio, optionsAggregate.putCallVolumeRatio) &&
        Objects.equals(this.contractCount, optionsAggregate.contractCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, date, totalOpenInterest, totalVolume, totalPutVolume, totalCallVolume, putCallVolumeRatio, contractCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsAggregate {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalOpenInterest: ").append(toIndentedString(totalOpenInterest)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    totalPutVolume: ").append(toIndentedString(totalPutVolume)).append("\n");
    sb.append("    totalCallVolume: ").append(toIndentedString(totalCallVolume)).append("\n");
    sb.append("    putCallVolumeRatio: ").append(toIndentedString(putCallVolumeRatio)).append("\n");
    sb.append("    contractCount: ").append(toIndentedString(contractCount)).append("\n");
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

