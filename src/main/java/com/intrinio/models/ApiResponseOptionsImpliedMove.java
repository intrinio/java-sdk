

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionImpliedMoveData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsImpliedMove
 */

public class ApiResponseOptionsImpliedMove {
  @SerializedName("implied_move")
  private OptionImpliedMoveData impliedMove = null;

  @SerializedName("messages")
  private List<String> messages = null;

  @SerializedName("underlying_price")
  private BigDecimal underlyingPrice = null;

  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("atm_strike")
  private BigDecimal atmStrike = null;

  @SerializedName("straddle_price")
  private BigDecimal straddlePrice = null;

  @SerializedName("symbol")
  private String symbol = null;

  public ApiResponseOptionsImpliedMove impliedMove(OptionImpliedMoveData impliedMove) {
    this.impliedMove = impliedMove;
    return this;
  }

   /**
   * The data pertaining to the implied move.
   * @return impliedMove
  **/
  @ApiModelProperty(value = "The data pertaining to the implied move.")
  public OptionImpliedMoveData getImpliedMove() {
    return impliedMove;
  }

  public void setImpliedMove(OptionImpliedMoveData impliedMove) {
    this.impliedMove = impliedMove;
  }

  public ApiResponseOptionsImpliedMove messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public ApiResponseOptionsImpliedMove addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Any messages or warnings about the data
   * @return messages
  **/
  @ApiModelProperty(value = "Any messages or warnings about the data")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public ApiResponseOptionsImpliedMove underlyingPrice(BigDecimal underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
    return this;
  }

   /**
   * The price of the underlying instrument.
   * @return underlyingPrice
  **/
  @ApiModelProperty(value = "The price of the underlying instrument.")
  public BigDecimal getUnderlyingPrice() {
    return underlyingPrice;
  }

  public void setUnderlyingPrice(BigDecimal underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
  }

  public ApiResponseOptionsImpliedMove expiration(String expiration) {
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

  public ApiResponseOptionsImpliedMove atmStrike(BigDecimal atmStrike) {
    this.atmStrike = atmStrike;
    return this;
  }

   /**
   * The at-the-money strike price for the implied move calculation.
   * @return atmStrike
  **/
  @ApiModelProperty(value = "The at-the-money strike price for the implied move calculation.")
  public BigDecimal getAtmStrike() {
    return atmStrike;
  }

  public void setAtmStrike(BigDecimal atmStrike) {
    this.atmStrike = atmStrike;
  }

  public ApiResponseOptionsImpliedMove straddlePrice(BigDecimal straddlePrice) {
    this.straddlePrice = straddlePrice;
    return this;
  }

   /**
   * The straddle price for the implied move calculation.
   * @return straddlePrice
  **/
  @ApiModelProperty(value = "The straddle price for the implied move calculation.")
  public BigDecimal getStraddlePrice() {
    return straddlePrice;
  }

  public void setStraddlePrice(BigDecimal straddlePrice) {
    this.straddlePrice = straddlePrice;
  }

  public ApiResponseOptionsImpliedMove symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol for the underlying instrument.
   * @return symbol
  **/
  @ApiModelProperty(value = "The symbol for the underlying instrument.")
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
    ApiResponseOptionsImpliedMove apiResponseOptionsImpliedMove = (ApiResponseOptionsImpliedMove) o;
    return Objects.equals(this.impliedMove, apiResponseOptionsImpliedMove.impliedMove) &&
        Objects.equals(this.messages, apiResponseOptionsImpliedMove.messages) &&
        Objects.equals(this.underlyingPrice, apiResponseOptionsImpliedMove.underlyingPrice) &&
        Objects.equals(this.expiration, apiResponseOptionsImpliedMove.expiration) &&
        Objects.equals(this.atmStrike, apiResponseOptionsImpliedMove.atmStrike) &&
        Objects.equals(this.straddlePrice, apiResponseOptionsImpliedMove.straddlePrice) &&
        Objects.equals(this.symbol, apiResponseOptionsImpliedMove.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impliedMove, messages, underlyingPrice, expiration, atmStrike, straddlePrice, symbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsImpliedMove {\n");
    
    sb.append("    impliedMove: ").append(toIndentedString(impliedMove)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    underlyingPrice: ").append(toIndentedString(underlyingPrice)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    atmStrike: ").append(toIndentedString(atmStrike)).append("\n");
    sb.append("    straddlePrice: ").append(toIndentedString(straddlePrice)).append("\n");
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

