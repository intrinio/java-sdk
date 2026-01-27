

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
import org.threeten.bp.LocalDate;

/**
 * Represents a single options contract identified as a significant mover in the market, including key price, change, and volume metrics.
 */
@ApiModel(description = "Represents a single options contract identified as a significant mover in the market, including key price, change, and volume metrics.")

public class OptionMover {
  @SerializedName("code")
  private String code = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("last_price")
  private BigDecimal lastPrice = null;

  @SerializedName("last_close_price")
  private BigDecimal lastClosePrice = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("percent_change")
  private BigDecimal percentChange = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("open_interest")
  private Integer openInterest = null;

  @SerializedName("last_close_date")
  private LocalDate lastCloseDate = null;

  public OptionMover code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique options contract, in a format combining ticker symbol, expiration, strike, and put or call. Example - AAPL__260101P00123500.  The ticker symbol is right padded by underscores to 6 characters. Following that is the 2 digit year, 2 digit month, and 2 digit day, then a P for put or C for call.  The last section is the strike. The first 5 digits are the whole number portion, left padded by zeros. The last 3 digits are the decimal portion, right padded by zeros.
   * @return code
  **/
  @ApiModelProperty(value = "The unique options contract, in a format combining ticker symbol, expiration, strike, and put or call. Example - AAPL__260101P00123500.  The ticker symbol is right padded by underscores to 6 characters. Following that is the 2 digit year, 2 digit month, and 2 digit day, then a P for put or C for call.  The last section is the strike. The first 5 digits are the whole number portion, left padded by zeros. The last 3 digits are the decimal portion, right padded by zeros.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OptionMover ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol of the underlying security for the options contract.
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol of the underlying security for the options contract.")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public OptionMover lastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * The most recent trade price of the options contract.
   * @return lastPrice
  **/
  @ApiModelProperty(value = "The most recent trade price of the options contract.")
  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public OptionMover lastClosePrice(BigDecimal lastClosePrice) {
    this.lastClosePrice = lastClosePrice;
    return this;
  }

   /**
   * The closing price of the options contract from the previous trading session.
   * @return lastClosePrice
  **/
  @ApiModelProperty(value = "The closing price of the options contract from the previous trading session.")
  public BigDecimal getLastClosePrice() {
    return lastClosePrice;
  }

  public void setLastClosePrice(BigDecimal lastClosePrice) {
    this.lastClosePrice = lastClosePrice;
  }

  public OptionMover change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The absolute dollar change in the contract&#39;s price from the previous close to the last price.
   * @return change
  **/
  @ApiModelProperty(value = "The absolute dollar change in the contract's price from the previous close to the last price.")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public OptionMover percentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
    return this;
  }

   /**
   * The percentage change in the contract&#39;s price from the previous close to the last price, expressed as a decimal (e.g., 0.12 for 12%).
   * @return percentChange
  **/
  @ApiModelProperty(value = "The percentage change in the contract's price from the previous close to the last price, expressed as a decimal (e.g., 0.12 for 12%).")
  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public void setPercentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
  }

  public OptionMover volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The total trading volume for this options contract during the current session.
   * @return volume
  **/
  @ApiModelProperty(value = "The total trading volume for this options contract during the current session.")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public OptionMover openInterest(Integer openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * The total number of outstanding contracts for this option that have not yet been closed or exercised.
   * @return openInterest
  **/
  @ApiModelProperty(value = "The total number of outstanding contracts for this option that have not yet been closed or exercised.")
  public Integer getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(Integer openInterest) {
    this.openInterest = openInterest;
  }

  public OptionMover lastCloseDate(LocalDate lastCloseDate) {
    this.lastCloseDate = lastCloseDate;
    return this;
  }

   /**
   * The date of the previous trading session&#39;s close for this contract.
   * @return lastCloseDate
  **/
  @ApiModelProperty(value = "The date of the previous trading session's close for this contract.")
  public LocalDate getLastCloseDate() {
    return lastCloseDate;
  }

  public void setLastCloseDate(LocalDate lastCloseDate) {
    this.lastCloseDate = lastCloseDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionMover optionMover = (OptionMover) o;
    return Objects.equals(this.code, optionMover.code) &&
        Objects.equals(this.ticker, optionMover.ticker) &&
        Objects.equals(this.lastPrice, optionMover.lastPrice) &&
        Objects.equals(this.lastClosePrice, optionMover.lastClosePrice) &&
        Objects.equals(this.change, optionMover.change) &&
        Objects.equals(this.percentChange, optionMover.percentChange) &&
        Objects.equals(this.volume, optionMover.volume) &&
        Objects.equals(this.openInterest, optionMover.openInterest) &&
        Objects.equals(this.lastCloseDate, optionMover.lastCloseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, ticker, lastPrice, lastClosePrice, change, percentChange, volume, openInterest, lastCloseDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionMover {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastClosePrice: ").append(toIndentedString(lastClosePrice)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    lastCloseDate: ").append(toIndentedString(lastCloseDate)).append("\n");
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

