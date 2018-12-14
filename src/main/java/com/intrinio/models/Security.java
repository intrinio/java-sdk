

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * A financial instrument representing shares of ownership in a publicly-traded company
 */
@ApiModel(description = "A financial instrument representing shares of ownership in a publicly-traded company")

public class Security {
  @SerializedName("id")
  private String id = null;

  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("share_class")
  private String shareClass = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("round_lot_size")
  private BigDecimal roundLotSize = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("exchange_ticker")
  private String exchangeTicker = null;

  @SerializedName("composite_ticker")
  private String compositeTicker = null;

  @SerializedName("alternate_tickers")
  private List<String> alternateTickers = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("cik")
  private String cik = null;

  @SerializedName("composite_figi")
  private String compositeFigi = null;

  @SerializedName("share_class_figi")
  private String shareClassFigi = null;

  @SerializedName("figi_uniqueid")
  private String figiUniqueid = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("etf")
  private Boolean etf = null;

  @SerializedName("delisted")
  private Boolean delisted = null;

  @SerializedName("primary_listing")
  private Boolean primaryListing = null;

  @SerializedName("primary_security")
  private Boolean primarySecurity = null;

  @SerializedName("first_stock_price")
  private LocalDate firstStockPrice = null;

  @SerializedName("last_stock_price")
  private LocalDate lastStockPrice = null;

  @SerializedName("last_stock_price_adjustment")
  private LocalDate lastStockPriceAdjustment = null;

  @SerializedName("last_corporate_action")
  private LocalDate lastCorporateAction = null;

  @SerializedName("previous_tickers")
  private List<String> previousTickers = null;

  public Security id(String id) {
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

  public Security companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The Intrinio ID for the company for which the Security is issued
   * @return companyId
  **/
  @ApiModelProperty(value = "The Intrinio ID for the company for which the Security is issued")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public Security name(String name) {
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

  public Security type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The Security&#39;s type
   * @return type
  **/
  @ApiModelProperty(value = "The Security's type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Security code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A 2-3 digit code classifying the Security
   * @return code
  **/
  @ApiModelProperty(value = "A 2-3 digit code classifying the Security")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Security shareClass(String shareClass) {
    this.shareClass = shareClass;
    return this;
  }

   /**
   * The Security&#39;s share class (if applicable)
   * @return shareClass
  **/
  @ApiModelProperty(value = "The Security's share class (if applicable)")
  public String getShareClass() {
    return shareClass;
  }

  public void setShareClass(String shareClass) {
    this.shareClass = shareClass;
  }

  public Security currency(String currency) {
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

  public Security roundLotSize(BigDecimal roundLotSize) {
    this.roundLotSize = roundLotSize;
    return this;
  }

   /**
   * The normal unit of trading
   * @return roundLotSize
  **/
  @ApiModelProperty(value = "The normal unit of trading")
  public BigDecimal getRoundLotSize() {
    return roundLotSize;
  }

  public void setRoundLotSize(BigDecimal roundLotSize) {
    this.roundLotSize = roundLotSize;
  }

  public Security ticker(String ticker) {
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

  public Security exchangeTicker(String exchangeTicker) {
    this.exchangeTicker = exchangeTicker;
    return this;
  }

   /**
   * The exchange-level ticker
   * @return exchangeTicker
  **/
  @ApiModelProperty(value = "The exchange-level ticker")
  public String getExchangeTicker() {
    return exchangeTicker;
  }

  public void setExchangeTicker(String exchangeTicker) {
    this.exchangeTicker = exchangeTicker;
  }

  public Security compositeTicker(String compositeTicker) {
    this.compositeTicker = compositeTicker;
    return this;
  }

   /**
   * The country-composite ticker
   * @return compositeTicker
  **/
  @ApiModelProperty(value = "The country-composite ticker")
  public String getCompositeTicker() {
    return compositeTicker;
  }

  public void setCompositeTicker(String compositeTicker) {
    this.compositeTicker = compositeTicker;
  }

  public Security alternateTickers(List<String> alternateTickers) {
    this.alternateTickers = alternateTickers;
    return this;
  }

  public Security addAlternateTickersItem(String alternateTickersItem) {
    if (this.alternateTickers == null) {
      this.alternateTickers = new ArrayList<String>();
    }
    this.alternateTickers.add(alternateTickersItem);
    return this;
  }

   /**
   * Alternate formats of the common ticker
   * @return alternateTickers
  **/
  @ApiModelProperty(value = "Alternate formats of the common ticker")
  public List<String> getAlternateTickers() {
    return alternateTickers;
  }

  public void setAlternateTickers(List<String> alternateTickers) {
    this.alternateTickers = alternateTickers;
  }

  public Security figi(String figi) {
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

  public Security cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * Central Index Key issued by the SEC, which is the unique identifier for all owner filings
   * @return cik
  **/
  @ApiModelProperty(value = "Central Index Key issued by the SEC, which is the unique identifier for all owner filings")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public Security compositeFigi(String compositeFigi) {
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

  public Security shareClassFigi(String shareClassFigi) {
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

  public Security figiUniqueid(String figiUniqueid) {
    this.figiUniqueid = figiUniqueid;
    return this;
  }

   /**
   * The OpenFIGI unique ID
   * @return figiUniqueid
  **/
  @ApiModelProperty(value = "The OpenFIGI unique ID")
  public String getFigiUniqueid() {
    return figiUniqueid;
  }

  public void setFigiUniqueid(String figiUniqueid) {
    this.figiUniqueid = figiUniqueid;
  }

  public Security active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * If true, the Security is active and has been recently traded
   * @return active
  **/
  @ApiModelProperty(value = "If true, the Security is active and has been recently traded")
  public Boolean isisActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Security etf(Boolean etf) {
    this.etf = etf;
    return this;
  }

   /**
   * If true, this Security is an ETF
   * @return etf
  **/
  @ApiModelProperty(value = "If true, this Security is an ETF")
  public Boolean isisEtf() {
    return etf;
  }

  public void setEtf(Boolean etf) {
    this.etf = etf;
  }

  public Security delisted(Boolean delisted) {
    this.delisted = delisted;
    return this;
  }

   /**
   * If true, the Security is no longer traded on the exchange
   * @return delisted
  **/
  @ApiModelProperty(value = "If true, the Security is no longer traded on the exchange")
  public Boolean isisDelisted() {
    return delisted;
  }

  public void setDelisted(Boolean delisted) {
    this.delisted = delisted;
  }

  public Security primaryListing(Boolean primaryListing) {
    this.primaryListing = primaryListing;
    return this;
  }

   /**
   * If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange
   * @return primaryListing
  **/
  @ApiModelProperty(value = "If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange")
  public Boolean isisPrimaryListing() {
    return primaryListing;
  }

  public void setPrimaryListing(Boolean primaryListing) {
    this.primaryListing = primaryListing;
  }

  public Security primarySecurity(Boolean primarySecurity) {
    this.primarySecurity = primarySecurity;
    return this;
  }

   /**
   * If true, the Security is considered by Intrinio to be the primary Security for its company
   * @return primarySecurity
  **/
  @ApiModelProperty(value = "If true, the Security is considered by Intrinio to be the primary Security for its company")
  public Boolean isisPrimarySecurity() {
    return primarySecurity;
  }

  public void setPrimarySecurity(Boolean primarySecurity) {
    this.primarySecurity = primarySecurity;
  }

  public Security firstStockPrice(LocalDate firstStockPrice) {
    this.firstStockPrice = firstStockPrice;
    return this;
  }

   /**
   * The date of the first recorded stock price
   * @return firstStockPrice
  **/
  @ApiModelProperty(value = "The date of the first recorded stock price")
  public LocalDate getFirstStockPrice() {
    return firstStockPrice;
  }

  public void setFirstStockPrice(LocalDate firstStockPrice) {
    this.firstStockPrice = firstStockPrice;
  }

  public Security lastStockPrice(LocalDate lastStockPrice) {
    this.lastStockPrice = lastStockPrice;
    return this;
  }

   /**
   * The date of the last recorded stock price (or the most recent trading day)
   * @return lastStockPrice
  **/
  @ApiModelProperty(value = "The date of the last recorded stock price (or the most recent trading day)")
  public LocalDate getLastStockPrice() {
    return lastStockPrice;
  }

  public void setLastStockPrice(LocalDate lastStockPrice) {
    this.lastStockPrice = lastStockPrice;
  }

  public Security lastStockPriceAdjustment(LocalDate lastStockPriceAdjustment) {
    this.lastStockPriceAdjustment = lastStockPriceAdjustment;
    return this;
  }

   /**
   * The date of the last stock price adjustment (dividend, split, etc)
   * @return lastStockPriceAdjustment
  **/
  @ApiModelProperty(value = "The date of the last stock price adjustment (dividend, split, etc)")
  public LocalDate getLastStockPriceAdjustment() {
    return lastStockPriceAdjustment;
  }

  public void setLastStockPriceAdjustment(LocalDate lastStockPriceAdjustment) {
    this.lastStockPriceAdjustment = lastStockPriceAdjustment;
  }

  public Security lastCorporateAction(LocalDate lastCorporateAction) {
    this.lastCorporateAction = lastCorporateAction;
    return this;
  }

   /**
   * The date of the last corporate action
   * @return lastCorporateAction
  **/
  @ApiModelProperty(value = "The date of the last corporate action")
  public LocalDate getLastCorporateAction() {
    return lastCorporateAction;
  }

  public void setLastCorporateAction(LocalDate lastCorporateAction) {
    this.lastCorporateAction = lastCorporateAction;
  }

  public Security previousTickers(List<String> previousTickers) {
    this.previousTickers = previousTickers;
    return this;
  }

  public Security addPreviousTickersItem(String previousTickersItem) {
    if (this.previousTickers == null) {
      this.previousTickers = new ArrayList<String>();
    }
    this.previousTickers.add(previousTickersItem);
    return this;
  }

   /**
   * Previous tickers used by this security
   * @return previousTickers
  **/
  @ApiModelProperty(value = "Previous tickers used by this security")
  public List<String> getPreviousTickers() {
    return previousTickers;
  }

  public void setPreviousTickers(List<String> previousTickers) {
    this.previousTickers = previousTickers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Security security = (Security) o;
    return Objects.equals(this.id, security.id) &&
        Objects.equals(this.companyId, security.companyId) &&
        Objects.equals(this.name, security.name) &&
        Objects.equals(this.type, security.type) &&
        Objects.equals(this.code, security.code) &&
        Objects.equals(this.shareClass, security.shareClass) &&
        Objects.equals(this.currency, security.currency) &&
        Objects.equals(this.roundLotSize, security.roundLotSize) &&
        Objects.equals(this.ticker, security.ticker) &&
        Objects.equals(this.exchangeTicker, security.exchangeTicker) &&
        Objects.equals(this.compositeTicker, security.compositeTicker) &&
        Objects.equals(this.alternateTickers, security.alternateTickers) &&
        Objects.equals(this.figi, security.figi) &&
        Objects.equals(this.cik, security.cik) &&
        Objects.equals(this.compositeFigi, security.compositeFigi) &&
        Objects.equals(this.shareClassFigi, security.shareClassFigi) &&
        Objects.equals(this.figiUniqueid, security.figiUniqueid) &&
        Objects.equals(this.active, security.active) &&
        Objects.equals(this.etf, security.etf) &&
        Objects.equals(this.delisted, security.delisted) &&
        Objects.equals(this.primaryListing, security.primaryListing) &&
        Objects.equals(this.primarySecurity, security.primarySecurity) &&
        Objects.equals(this.firstStockPrice, security.firstStockPrice) &&
        Objects.equals(this.lastStockPrice, security.lastStockPrice) &&
        Objects.equals(this.lastStockPriceAdjustment, security.lastStockPriceAdjustment) &&
        Objects.equals(this.lastCorporateAction, security.lastCorporateAction) &&
        Objects.equals(this.previousTickers, security.previousTickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, name, type, code, shareClass, currency, roundLotSize, ticker, exchangeTicker, compositeTicker, alternateTickers, figi, cik, compositeFigi, shareClassFigi, figiUniqueid, active, etf, delisted, primaryListing, primarySecurity, firstStockPrice, lastStockPrice, lastStockPriceAdjustment, lastCorporateAction, previousTickers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    shareClass: ").append(toIndentedString(shareClass)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    roundLotSize: ").append(toIndentedString(roundLotSize)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    exchangeTicker: ").append(toIndentedString(exchangeTicker)).append("\n");
    sb.append("    compositeTicker: ").append(toIndentedString(compositeTicker)).append("\n");
    sb.append("    alternateTickers: ").append(toIndentedString(alternateTickers)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
    sb.append("    shareClassFigi: ").append(toIndentedString(shareClassFigi)).append("\n");
    sb.append("    figiUniqueid: ").append(toIndentedString(figiUniqueid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
    sb.append("    delisted: ").append(toIndentedString(delisted)).append("\n");
    sb.append("    primaryListing: ").append(toIndentedString(primaryListing)).append("\n");
    sb.append("    primarySecurity: ").append(toIndentedString(primarySecurity)).append("\n");
    sb.append("    firstStockPrice: ").append(toIndentedString(firstStockPrice)).append("\n");
    sb.append("    lastStockPrice: ").append(toIndentedString(lastStockPrice)).append("\n");
    sb.append("    lastStockPriceAdjustment: ").append(toIndentedString(lastStockPriceAdjustment)).append("\n");
    sb.append("    lastCorporateAction: ").append(toIndentedString(lastCorporateAction)).append("\n");
    sb.append("    previousTickers: ").append(toIndentedString(previousTickers)).append("\n");
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

