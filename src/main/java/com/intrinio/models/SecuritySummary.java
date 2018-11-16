

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
 * The summary of a financial instrument representing shares of ownership in a publicly-traded company
 */
@ApiModel(description = "The summary of a financial instrument representing shares of ownership in a publicly-traded company")

public class SecuritySummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("composite_ticker")
  private String compositeTicker = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("name")
  private String name = null;

  public SecuritySummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for Security
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for Security")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecuritySummary companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The Intrinio ID for the Company for which the Security is issued
   * @return companyId
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Company for which the Security is issued")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public SecuritySummary ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The common/local ticker of the Security
   * @return ticker
  **/
  @ApiModelProperty(value = "The common/local ticker of the Security")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public SecuritySummary compositeTicker(String compositeTicker) {
    this.compositeTicker = compositeTicker;
    return this;
  }

   /**
   * The country-composite ticker of the Security
   * @return compositeTicker
  **/
  @ApiModelProperty(value = "The country-composite ticker of the Security")
  public String getCompositeTicker() {
    return compositeTicker;
  }

  public void setCompositeTicker(String compositeTicker) {
    this.compositeTicker = compositeTicker;
  }

  public SecuritySummary figi(String figi) {
    this.figi = figi;
    return this;
  }

   /**
   * The OpenFIGI identifier
   * @return figi
  **/
  @ApiModelProperty(value = "The OpenFIGI identifier")
  public String getFigi() {
    return figi;
  }

  public void setFigi(String figi) {
    this.figi = figi;
  }

  public SecuritySummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Security
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Security")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySummary securitySummary = (SecuritySummary) o;
    return Objects.equals(this.id, securitySummary.id) &&
        Objects.equals(this.companyId, securitySummary.companyId) &&
        Objects.equals(this.ticker, securitySummary.ticker) &&
        Objects.equals(this.compositeTicker, securitySummary.compositeTicker) &&
        Objects.equals(this.figi, securitySummary.figi) &&
        Objects.equals(this.name, securitySummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, ticker, compositeTicker, figi, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    compositeTicker: ").append(toIndentedString(compositeTicker)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

