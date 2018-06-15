

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
 * The summary of a company that submits filings to the SEC and has a security traded primarily on a US exchange
 */
@ApiModel(description = "The summary of a company that submits filings to the SEC and has a security traded primarily on a US exchange")

public class CompanySummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lei")
  private String lei = null;

  @SerializedName("cik")
  private String cik = null;

  public CompanySummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the company
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the company")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanySummary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The stock market ticker symbol associated with the company&#39;s common stock securities
   * @return ticker
  **/
  @ApiModelProperty(value = "The stock market ticker symbol associated with the company's common stock securities")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public CompanySummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The company&#39;s common name
   * @return name
  **/
  @ApiModelProperty(value = "The company's common name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanySummary lei(String lei) {
    this.lei = lei;
    return this;
  }

   /**
   * The Legal Entity Identifier (LEI) assigned to the company
   * @return lei
  **/
  @ApiModelProperty(value = "The Legal Entity Identifier (LEI) assigned to the company")
  public String getLei() {
    return lei;
  }

  public void setLei(String lei) {
    this.lei = lei;
  }

  public CompanySummary cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * The Central Index Key (CIK) assigned to the company
   * @return cik
  **/
  @ApiModelProperty(value = "The Central Index Key (CIK) assigned to the company")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySummary companySummary = (CompanySummary) o;
    return Objects.equals(this.id, companySummary.id) &&
        Objects.equals(this.ticker, companySummary.ticker) &&
        Objects.equals(this.name, companySummary.name) &&
        Objects.equals(this.lei, companySummary.lei) &&
        Objects.equals(this.cik, companySummary.cik);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, name, lei, cik);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
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

