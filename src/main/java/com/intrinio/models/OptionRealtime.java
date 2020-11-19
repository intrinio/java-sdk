

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
 * An option contract gives the buyer of a contract the right to buy or sell a particular asset at a later date at an agreed upon price.
 */
@ApiModel(description = "An option contract gives the buyer of a contract the right to buy or sell a particular asset at a later date at an agreed upon price.")

public class OptionRealtime {
  @SerializedName("code")
  private String code = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("expiration")
  private LocalDate expiration = null;

  @SerializedName("strike")
  private BigDecimal strike = null;

  /**
   * The type of Option (put or call).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PUT("put"),
    
    CALL("call");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public OptionRealtime code(String code) {
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

  public OptionRealtime ticker(String ticker) {
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

  public OptionRealtime expiration(LocalDate expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised.
   * @return expiration
  **/
  @ApiModelProperty(value = "The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised.")
  public LocalDate getExpiration() {
    return expiration;
  }

  public void setExpiration(LocalDate expiration) {
    this.expiration = expiration;
  }

  public OptionRealtime strike(BigDecimal strike) {
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

  public OptionRealtime type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Option (put or call).
   * @return type
  **/
  @ApiModelProperty(value = "The type of Option (put or call).")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    OptionRealtime optionRealtime = (OptionRealtime) o;
    return Objects.equals(this.code, optionRealtime.code) &&
        Objects.equals(this.ticker, optionRealtime.ticker) &&
        Objects.equals(this.expiration, optionRealtime.expiration) &&
        Objects.equals(this.strike, optionRealtime.strike) &&
        Objects.equals(this.type, optionRealtime.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, ticker, expiration, strike, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionRealtime {\n");
    
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

