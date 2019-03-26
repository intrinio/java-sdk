

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
 * An option contract gives the buyer of a contract the right to buy or sell a particular asset at a later date at an agreed upon price.
 */
@ApiModel(description = "An option contract gives the buyer of a contract the right to buy or sell a particular asset at a later date at an agreed upon price.")

public class Option {
  @SerializedName("id")
  private String id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("strike")
  private BigDecimal strike = null;

  @SerializedName("type")
  private String type = null;

  public Option id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Option.
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Option.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Option code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The Intrinio Code for the Option.
   * @return code
  **/
  @ApiModelProperty(value = "The Intrinio Code for the Option.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Option ticker(String ticker) {
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

  public Option expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised.
   * @return expiration
  **/
  @ApiModelProperty(value = "The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised.")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public Option strike(BigDecimal strike) {
    this.strike = strike;
    return this;
  }

   /**
   * The strike price is the fixed price at which a derivative can be exercised, and refers to the price of the derivative’s underlying asset.  In a call option, the strike price is the price at which the option holder can purchase the underlying security.  For a put option, the strike price is the price at which the option holder can sell the underlying security.
   * @return strike
  **/
  @ApiModelProperty(value = "The strike price is the fixed price at which a derivative can be exercised, and refers to the price of the derivative’s underlying asset.  In a call option, the strike price is the price at which the option holder can purchase the underlying security.  For a put option, the strike price is the price at which the option holder can sell the underlying security.")
  public BigDecimal getStrike() {
    return strike;
  }

  public void setStrike(BigDecimal strike) {
    this.strike = strike;
  }

  public Option type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Option (put or call). A put option is an option contract giving the owner the right, but not the obligation, to sell a specified amount of an underlying asset at a specified price before the option&#39;s expiration date. A call option gives the holder the right to buy an underlying asset at a specified price, before the option&#39;s expiration date.
   * @return type
  **/
  @ApiModelProperty(value = "The type of Option (put or call). A put option is an option contract giving the owner the right, but not the obligation, to sell a specified amount of an underlying asset at a specified price before the option's expiration date. A call option gives the holder the right to buy an underlying asset at a specified price, before the option's expiration date.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.id, option.id) &&
        Objects.equals(this.code, option.code) &&
        Objects.equals(this.ticker, option.ticker) &&
        Objects.equals(this.expiration, option.expiration) &&
        Objects.equals(this.strike, option.strike) &&
        Objects.equals(this.type, option.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, ticker, expiration, strike, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    strike: ").append(toIndentedString(strike)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

