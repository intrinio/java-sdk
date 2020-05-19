

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
 * Exchange Traded Fund (ETF) sourced from FirstBridge
 */
@ApiModel(description = "Exchange Traded Fund (ETF) sourced from FirstBridge")

public class ETFSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("figi_ticker")
  private String figiTicker = null;

  @SerializedName("ric")
  private String ric = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("sedol")
  private String sedol = null;

  @SerializedName("exchange_mic")
  private String exchangeMic = null;

  public ETFSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the ETF
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the ETF")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ETFSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The common name of the ETF
   * @return name
  **/
  @ApiModelProperty(value = "The common name of the ETF")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ETFSummary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The common ticker symbol for the ETF
   * @return ticker
  **/
  @ApiModelProperty(value = "The common ticker symbol for the ETF")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ETFSummary figiTicker(String figiTicker) {
    this.figiTicker = figiTicker;
    return this;
  }

   /**
   * The OpenFIGI ticker for the ETF
   * @return figiTicker
  **/
  @ApiModelProperty(value = "The OpenFIGI ticker for the ETF")
  public String getFigiTicker() {
    return figiTicker;
  }

  public void setFigiTicker(String figiTicker) {
    this.figiTicker = figiTicker;
  }

  public ETFSummary ric(String ric) {
    this.ric = ric;
    return this;
  }

   /**
   * Reuters Instrument Code (RIC) for the ETF
   * @return ric
  **/
  @ApiModelProperty(value = "Reuters Instrument Code (RIC) for the ETF")
  public String getRic() {
    return ric;
  }

  public void setRic(String ric) {
    this.ric = ric;
  }

  public ETFSummary isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * International Securities Identification Number (ISIN) for the ETF
   * @return isin
  **/
  @ApiModelProperty(value = "International Securities Identification Number (ISIN) for the ETF")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public ETFSummary sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * Stock Exchange Daily Official List (SEDOL) for the ETF
   * @return sedol
  **/
  @ApiModelProperty(value = "Stock Exchange Daily Official List (SEDOL) for the ETF")
  public String getSedol() {
    return sedol;
  }

  public void setSedol(String sedol) {
    this.sedol = sedol;
  }

  public ETFSummary exchangeMic(String exchangeMic) {
    this.exchangeMic = exchangeMic;
    return this;
  }

   /**
   * The exchange Market Identifier Code (MIC) from the International Standards Organization (ISO)
   * @return exchangeMic
  **/
  @ApiModelProperty(value = "The exchange Market Identifier Code (MIC) from the International Standards Organization (ISO)")
  public String getExchangeMic() {
    return exchangeMic;
  }

  public void setExchangeMic(String exchangeMic) {
    this.exchangeMic = exchangeMic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFSummary etFSummary = (ETFSummary) o;
    return Objects.equals(this.id, etFSummary.id) &&
        Objects.equals(this.name, etFSummary.name) &&
        Objects.equals(this.ticker, etFSummary.ticker) &&
        Objects.equals(this.figiTicker, etFSummary.figiTicker) &&
        Objects.equals(this.ric, etFSummary.ric) &&
        Objects.equals(this.isin, etFSummary.isin) &&
        Objects.equals(this.sedol, etFSummary.sedol) &&
        Objects.equals(this.exchangeMic, etFSummary.exchangeMic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ticker, figiTicker, ric, isin, sedol, exchangeMic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    figiTicker: ").append(toIndentedString(figiTicker)).append("\n");
    sb.append("    ric: ").append(toIndentedString(ric)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    exchangeMic: ").append(toIndentedString(exchangeMic)).append("\n");
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

