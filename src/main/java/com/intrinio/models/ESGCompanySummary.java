

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
 * ESGCompanySummary
 */

public class ESGCompanySummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("primary_industry")
  private String primaryIndustry = null;

  @SerializedName("country")
  private String country = null;

  public ESGCompanySummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ESGCompanySummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ESGCompanySummary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ESGCompanySummary isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @ApiModelProperty(value = "")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public ESGCompanySummary primaryIndustry(String primaryIndustry) {
    this.primaryIndustry = primaryIndustry;
    return this;
  }

   /**
   * Get primaryIndustry
   * @return primaryIndustry
  **/
  @ApiModelProperty(value = "")
  public String getPrimaryIndustry() {
    return primaryIndustry;
  }

  public void setPrimaryIndustry(String primaryIndustry) {
    this.primaryIndustry = primaryIndustry;
  }

  public ESGCompanySummary country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESGCompanySummary esGCompanySummary = (ESGCompanySummary) o;
    return Objects.equals(this.id, esGCompanySummary.id) &&
        Objects.equals(this.name, esGCompanySummary.name) &&
        Objects.equals(this.ticker, esGCompanySummary.ticker) &&
        Objects.equals(this.isin, esGCompanySummary.isin) &&
        Objects.equals(this.primaryIndustry, esGCompanySummary.primaryIndustry) &&
        Objects.equals(this.country, esGCompanySummary.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ticker, isin, primaryIndustry, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESGCompanySummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    primaryIndustry: ").append(toIndentedString(primaryIndustry)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

