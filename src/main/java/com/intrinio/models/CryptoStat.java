

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
 * Marketwide stats for a Crypto Currency including market cap, available supply, total supply, and max supply
 */
@ApiModel(description = "Marketwide stats for a Crypto Currency including market cap, available supply, total supply, and max supply")

public class CryptoStat {
  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("market_cap_usd")
  private BigDecimal marketCapUsd = null;

  @SerializedName("available_supply")
  private BigDecimal availableSupply = null;

  @SerializedName("total_supply")
  private BigDecimal totalSupply = null;

  @SerializedName("max_supply")
  private BigDecimal maxSupply = null;

  @SerializedName("last_updated")
  private String lastUpdated = null;

  public CryptoStat name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The common name of the crypto currency.
   * @return name
  **/
  @ApiModelProperty(value = "The common name of the crypto currency.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CryptoStat code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A code representing the crypto currency.
   * @return code
  **/
  @ApiModelProperty(value = "A code representing the crypto currency.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CryptoStat symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the Crypto Currency.
   * @return symbol
  **/
  @ApiModelProperty(value = "The symbol of the Crypto Currency.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CryptoStat marketCapUsd(BigDecimal marketCapUsd) {
    this.marketCapUsd = marketCapUsd;
    return this;
  }

   /**
   * The market cap of the Crypto Currency in USD.
   * @return marketCapUsd
  **/
  @ApiModelProperty(value = "The market cap of the Crypto Currency in USD.")
  public BigDecimal getMarketCapUsd() {
    return marketCapUsd;
  }

  public void setMarketCapUsd(BigDecimal marketCapUsd) {
    this.marketCapUsd = marketCapUsd;
  }

  public CryptoStat availableSupply(BigDecimal availableSupply) {
    this.availableSupply = availableSupply;
    return this;
  }

   /**
   * The available supply of the Crypto Currency.
   * @return availableSupply
  **/
  @ApiModelProperty(value = "The available supply of the Crypto Currency.")
  public BigDecimal getAvailableSupply() {
    return availableSupply;
  }

  public void setAvailableSupply(BigDecimal availableSupply) {
    this.availableSupply = availableSupply;
  }

  public CryptoStat totalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * The total supply of the Crypto Currency.
   * @return totalSupply
  **/
  @ApiModelProperty(value = "The total supply of the Crypto Currency.")
  public BigDecimal getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(BigDecimal totalSupply) {
    this.totalSupply = totalSupply;
  }

  public CryptoStat maxSupply(BigDecimal maxSupply) {
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * The maxmium supply of coins available to mine.
   * @return maxSupply
  **/
  @ApiModelProperty(value = "The maxmium supply of coins available to mine.")
  public BigDecimal getMaxSupply() {
    return maxSupply;
  }

  public void setMaxSupply(BigDecimal maxSupply) {
    this.maxSupply = maxSupply;
  }

  public CryptoStat lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * UTC timestamp of when the data was last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "UTC timestamp of when the data was last updated.")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoStat cryptoStat = (CryptoStat) o;
    return Objects.equals(this.name, cryptoStat.name) &&
        Objects.equals(this.code, cryptoStat.code) &&
        Objects.equals(this.symbol, cryptoStat.symbol) &&
        Objects.equals(this.marketCapUsd, cryptoStat.marketCapUsd) &&
        Objects.equals(this.availableSupply, cryptoStat.availableSupply) &&
        Objects.equals(this.totalSupply, cryptoStat.totalSupply) &&
        Objects.equals(this.maxSupply, cryptoStat.maxSupply) &&
        Objects.equals(this.lastUpdated, cryptoStat.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, symbol, marketCapUsd, availableSupply, totalSupply, maxSupply, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoStat {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    marketCapUsd: ").append(toIndentedString(marketCapUsd)).append("\n");
    sb.append("    availableSupply: ").append(toIndentedString(availableSupply)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

