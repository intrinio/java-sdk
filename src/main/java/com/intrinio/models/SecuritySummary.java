

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

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("exchange_mic")
  private String exchangeMic = null;

  @SerializedName("stock_exchange_id")
  private String stockExchangeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("composite_ticker")
  private String compositeTicker = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("composite_figi")
  private String compositeFigi = null;

  @SerializedName("share_class_figi")
  private String shareClassFigi = null;

  @SerializedName("primary_listing")
  private Boolean primaryListing = null;

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

  public SecuritySummary exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * The exchange&#39;s MIC
   * @return exchange
  **/
  @ApiModelProperty(value = "The exchange's MIC")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public SecuritySummary exchangeMic(String exchangeMic) {
    this.exchangeMic = exchangeMic;
    return this;
  }

   /**
   * The security&#39;s exchange MIC
   * @return exchangeMic
  **/
  @ApiModelProperty(value = "The security's exchange MIC")
  public String getExchangeMic() {
    return exchangeMic;
  }

  public void setExchangeMic(String exchangeMic) {
    this.exchangeMic = exchangeMic;
  }

  public SecuritySummary stockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
    return this;
  }

   /**
   * The exchange&#39;s Intrinio ID
   * @return stockExchangeId
  **/
  @ApiModelProperty(value = "The exchange's Intrinio ID")
  public String getStockExchangeId() {
    return stockExchangeId;
  }

  public void setStockExchangeId(String stockExchangeId) {
    this.stockExchangeId = stockExchangeId;
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

  public SecuritySummary code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A 2-3 digit code classifying the Security (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;)
   * @return code
  **/
  @ApiModelProperty(value = "A 2-3 digit code classifying the Security (<a href=\"https://docs.intrinio.com/documentation/security_codes\" target=\"_blank\">reference</a>)")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SecuritySummary currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which the Security is traded on the exchange
   * @return currency
  **/
  @ApiModelProperty(value = "The currency in which the Security is traded on the exchange")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
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

  public SecuritySummary compositeFigi(String compositeFigi) {
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

  public SecuritySummary shareClassFigi(String shareClassFigi) {
    this.shareClassFigi = shareClassFigi;
    return this;
  }

   /**
   * The global-composite OpenFIGI identifier
   * @return shareClassFigi
  **/
  @ApiModelProperty(value = "The global-composite OpenFIGI identifier")
  public String getShareClassFigi() {
    return shareClassFigi;
  }

  public void setShareClassFigi(String shareClassFigi) {
    this.shareClassFigi = shareClassFigi;
  }

  public SecuritySummary primaryListing(Boolean primaryListing) {
    this.primaryListing = primaryListing;
    return this;
  }

   /**
   * If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange
   * @return primaryListing
  **/
  @ApiModelProperty(value = "If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange")
  public Boolean isPrimaryListing() {
    return primaryListing;
  }

  public void setPrimaryListing(Boolean primaryListing) {
    this.primaryListing = primaryListing;
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
        Objects.equals(this.exchange, securitySummary.exchange) &&
        Objects.equals(this.exchangeMic, securitySummary.exchangeMic) &&
        Objects.equals(this.stockExchangeId, securitySummary.stockExchangeId) &&
        Objects.equals(this.name, securitySummary.name) &&
        Objects.equals(this.code, securitySummary.code) &&
        Objects.equals(this.currency, securitySummary.currency) &&
        Objects.equals(this.ticker, securitySummary.ticker) &&
        Objects.equals(this.compositeTicker, securitySummary.compositeTicker) &&
        Objects.equals(this.figi, securitySummary.figi) &&
        Objects.equals(this.compositeFigi, securitySummary.compositeFigi) &&
        Objects.equals(this.shareClassFigi, securitySummary.shareClassFigi) &&
        Objects.equals(this.primaryListing, securitySummary.primaryListing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, exchange, exchangeMic, stockExchangeId, name, code, currency, ticker, compositeTicker, figi, compositeFigi, shareClassFigi, primaryListing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeMic: ").append(toIndentedString(exchangeMic)).append("\n");
    sb.append("    stockExchangeId: ").append(toIndentedString(stockExchangeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    compositeTicker: ").append(toIndentedString(compositeTicker)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
    sb.append("    shareClassFigi: ").append(toIndentedString(shareClassFigi)).append("\n");
    sb.append("    primaryListing: ").append(toIndentedString(primaryListing)).append("\n");
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

