

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
import org.threeten.bp.LocalDate;

/**
 * A security ticker name history.
 */
@ApiModel(description = "A security ticker name history.")

public class SecurityHistory {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("security_code")
  private String securityCode = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("composite_figi")
  private String compositeFigi = null;

  @SerializedName("first_price_date")
  private LocalDate firstPriceDate = null;

  @SerializedName("last_price_date")
  private LocalDate lastPriceDate = null;

  public SecurityHistory id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the Security
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the Security")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityHistory ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The common ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "The common ticker")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public SecurityHistory name(String name) {
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

  public SecurityHistory securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * A 2-3 digit code classifying the Security (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;)
   * @return securityCode
  **/
  @ApiModelProperty(value = "A 2-3 digit code classifying the Security (<a href=\"https://docs.intrinio.com/documentation/security_codes\" target=\"_blank\">reference</a>)")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public SecurityHistory figi(String figi) {
    this.figi = figi;
    return this;
  }

   /**
   * The exchange-level OpenFIGI identifier
   * @return figi
  **/
  @ApiModelProperty(value = "The exchange-level OpenFIGI identifier")
  public String getFigi() {
    return figi;
  }

  public void setFigi(String figi) {
    this.figi = figi;
  }

  public SecurityHistory compositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
    return this;
  }

   /**
   * The country-composite OpenFIGI identifier
   * @return compositeFigi
  **/
  @ApiModelProperty(value = "The country-composite OpenFIGI identifier")
  public String getCompositeFigi() {
    return compositeFigi;
  }

  public void setCompositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
  }

  public SecurityHistory firstPriceDate(LocalDate firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
    return this;
  }

   /**
   * The date of the first recorded stock price
   * @return firstPriceDate
  **/
  @ApiModelProperty(value = "The date of the first recorded stock price")
  public LocalDate getFirstPriceDate() {
    return firstPriceDate;
  }

  public void setFirstPriceDate(LocalDate firstPriceDate) {
    this.firstPriceDate = firstPriceDate;
  }

  public SecurityHistory lastPriceDate(LocalDate lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
    return this;
  }

   /**
   * The date of the last recorded stock price (or the most recent trading day)
   * @return lastPriceDate
  **/
  @ApiModelProperty(value = "The date of the last recorded stock price (or the most recent trading day)")
  public LocalDate getLastPriceDate() {
    return lastPriceDate;
  }

  public void setLastPriceDate(LocalDate lastPriceDate) {
    this.lastPriceDate = lastPriceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityHistory securityHistory = (SecurityHistory) o;
    return Objects.equals(this.id, securityHistory.id) &&
        Objects.equals(this.ticker, securityHistory.ticker) &&
        Objects.equals(this.name, securityHistory.name) &&
        Objects.equals(this.securityCode, securityHistory.securityCode) &&
        Objects.equals(this.figi, securityHistory.figi) &&
        Objects.equals(this.compositeFigi, securityHistory.compositeFigi) &&
        Objects.equals(this.firstPriceDate, securityHistory.firstPriceDate) &&
        Objects.equals(this.lastPriceDate, securityHistory.lastPriceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, name, securityCode, figi, compositeFigi, firstPriceDate, lastPriceDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityHistory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
    sb.append("    firstPriceDate: ").append(toIndentedString(firstPriceDate)).append("\n");
    sb.append("    lastPriceDate: ").append(toIndentedString(lastPriceDate)).append("\n");
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

