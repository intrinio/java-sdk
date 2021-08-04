

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
 * A large market order that is broken into a collection of smaller orders to take advantage of all contracts and prices offered across all exchanges.
 */
@ApiModel(description = "A large market order that is broken into a collection of smaller orders to take advantage of all contracts and prices offered across all exchanges.")

public class OptionUnusualTrade {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("timestamp")
  private LocalDate timestamp = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("total_value")
  private BigDecimal totalValue = null;

  /**
   * The type of Option (put or call)
   */
  @JsonAdapter(ContractTypeEnum.Adapter.class)
  public enum ContractTypeEnum {
    PUT("put"),
    
    CALL("call");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContractTypeEnum fromValue(String text) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContractTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContractTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContractTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContractTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contract_type")
  private ContractTypeEnum contractType = null;

  @SerializedName("contract_expiration")
  private LocalDate contractExpiration = null;

  @SerializedName("contract_strike")
  private BigDecimal contractStrike = null;

  public OptionUnusualTrade symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The underlying option security symbol for the trade
   * @return symbol
  **/
  @ApiModelProperty(value = "The underlying option security symbol for the trade")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OptionUnusualTrade timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC timestamp of order placement
   * @return timestamp
  **/
  @ApiModelProperty(value = "The UTC timestamp of order placement")
  public LocalDate getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }

  public OptionUnusualTrade type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of unusual trade
   * @return type
  **/
  @ApiModelProperty(value = "The type of unusual trade")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OptionUnusualTrade totalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * The aggregated value of all option contract premiums included in the trade
   * @return totalValue
  **/
  @ApiModelProperty(value = "The aggregated value of all option contract premiums included in the trade")
  public BigDecimal getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
  }

  public OptionUnusualTrade contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * The type of Option (put or call)
   * @return contractType
  **/
  @ApiModelProperty(value = "The type of Option (put or call)")
  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public OptionUnusualTrade contractExpiration(LocalDate contractExpiration) {
    this.contractExpiration = contractExpiration;
    return this;
  }

   /**
   * The expiration date for the options contract
   * @return contractExpiration
  **/
  @ApiModelProperty(value = "The expiration date for the options contract")
  public LocalDate getContractExpiration() {
    return contractExpiration;
  }

  public void setContractExpiration(LocalDate contractExpiration) {
    this.contractExpiration = contractExpiration;
  }

  public OptionUnusualTrade contractStrike(BigDecimal contractStrike) {
    this.contractStrike = contractStrike;
    return this;
  }

   /**
   * The strike price of the option contract
   * @return contractStrike
  **/
  @ApiModelProperty(value = "The strike price of the option contract")
  public BigDecimal getContractStrike() {
    return contractStrike;
  }

  public void setContractStrike(BigDecimal contractStrike) {
    this.contractStrike = contractStrike;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionUnusualTrade optionUnusualTrade = (OptionUnusualTrade) o;
    return Objects.equals(this.symbol, optionUnusualTrade.symbol) &&
        Objects.equals(this.timestamp, optionUnusualTrade.timestamp) &&
        Objects.equals(this.type, optionUnusualTrade.type) &&
        Objects.equals(this.totalValue, optionUnusualTrade.totalValue) &&
        Objects.equals(this.contractType, optionUnusualTrade.contractType) &&
        Objects.equals(this.contractExpiration, optionUnusualTrade.contractExpiration) &&
        Objects.equals(this.contractStrike, optionUnusualTrade.contractStrike);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, timestamp, type, totalValue, contractType, contractExpiration, contractStrike);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionUnusualTrade {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    contractExpiration: ").append(toIndentedString(contractExpiration)).append("\n");
    sb.append("    contractStrike: ").append(toIndentedString(contractStrike)).append("\n");
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

