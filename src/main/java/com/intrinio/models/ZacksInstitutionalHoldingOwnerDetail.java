

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
 * Returns a list of institutional owners and the value of their interests sourced from Zacks.
 */
@ApiModel(description = "Returns a list of institutional owners and the value of their interests sourced from Zacks.")

public class ZacksInstitutionalHoldingOwnerDetail {
  @SerializedName("name")
  private String name = null;

  @SerializedName("cik")
  private String cik = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city_state")
  private String cityState = null;

  @SerializedName("location_code")
  private String locationCode = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("investment_style")
  private String investmentStyle = null;

  @SerializedName("number_of_holdings")
  private BigDecimal numberOfHoldings = null;

  @SerializedName("total_holdings_value")
  private BigDecimal totalHoldingsValue = null;

  @SerializedName("portfolio_turnover_percent")
  private BigDecimal portfolioTurnoverPercent = null;

  @SerializedName("is_fund")
  private String isFund = null;

  @SerializedName("fund_ticker")
  private String fundTicker = null;

  @SerializedName("has_fund_manager")
  private String hasFundManager = null;

  @SerializedName("fund_manager_city")
  private String fundManagerCity = null;

  @SerializedName("fund_manager_name")
  private String fundManagerName = null;

  @SerializedName("fund_manager_state")
  private String fundManagerState = null;

  @SerializedName("files_13f")
  private String files13f = null;

  @SerializedName("is_etf")
  private String isEtf = null;

  @SerializedName("last_updated_on")
  private LocalDate lastUpdatedOn = null;

  public ZacksInstitutionalHoldingOwnerDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The owner&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "The owner's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZacksInstitutionalHoldingOwnerDetail cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * The Central Index Key (CIK) assigned to the company by the SEC as a unique identifier, used in SEC filings
   * @return cik
  **/
  @ApiModelProperty(value = "The Central Index Key (CIK) assigned to the company by the SEC as a unique identifier, used in SEC filings")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public ZacksInstitutionalHoldingOwnerDetail address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The owner&#39;s address
   * @return address
  **/
  @ApiModelProperty(value = "The owner's address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ZacksInstitutionalHoldingOwnerDetail cityState(String cityState) {
    this.cityState = cityState;
    return this;
  }

   /**
   * The owner&#39;s city and state (City, ST)
   * @return cityState
  **/
  @ApiModelProperty(value = "The owner's city and state (City, ST)")
  public String getCityState() {
    return cityState;
  }

  public void setCityState(String cityState) {
    this.cityState = cityState;
  }

  public ZacksInstitutionalHoldingOwnerDetail locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * The owner&#39;s location code. (&#39;D&#39; &#x3D; Domestic, &#39;C&#39; &#x3D; Canadian, &#39;F&#39; &#x3D; Foreign)
   * @return locationCode
  **/
  @ApiModelProperty(value = "The owner's location code. ('D' = Domestic, 'C' = Canadian, 'F' = Foreign)")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public ZacksInstitutionalHoldingOwnerDetail phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The owner&#39;s phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The owner's phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ZacksInstitutionalHoldingOwnerDetail postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The owner&#39;s postal code
   * @return postalCode
  **/
  @ApiModelProperty(value = "The owner's postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ZacksInstitutionalHoldingOwnerDetail url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The owner&#39;s website url
   * @return url
  **/
  @ApiModelProperty(value = "The owner's website url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ZacksInstitutionalHoldingOwnerDetail investmentStyle(String investmentStyle) {
    this.investmentStyle = investmentStyle;
    return this;
  }

   /**
   * The owner&#39;s investment style (&#39;I&#39; &#x3D; Income, &#39;V&#39; &#x3D; Value, &#39;G&#39; &#x3D; Growth, &#39;B&#39; &#x3D;  Growth at a Reasonable Price, &#39;A&#39; &#x3D; Aggressive Growth, &#39;P&#39; &#x3D; Passive/Index, &#39;D&#39; &#x3D; Deep Value)
   * @return investmentStyle
  **/
  @ApiModelProperty(value = "The owner's investment style ('I' = Income, 'V' = Value, 'G' = Growth, 'B' =  Growth at a Reasonable Price, 'A' = Aggressive Growth, 'P' = Passive/Index, 'D' = Deep Value)")
  public String getInvestmentStyle() {
    return investmentStyle;
  }

  public void setInvestmentStyle(String investmentStyle) {
    this.investmentStyle = investmentStyle;
  }

  public ZacksInstitutionalHoldingOwnerDetail numberOfHoldings(BigDecimal numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
    return this;
  }

   /**
   * Count of equity holdings only, doesn&#39;t include bonds or other funds held
   * @return numberOfHoldings
  **/
  @ApiModelProperty(value = "Count of equity holdings only, doesn't include bonds or other funds held")
  public BigDecimal getNumberOfHoldings() {
    return numberOfHoldings;
  }

  public void setNumberOfHoldings(BigDecimal numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
  }

  public ZacksInstitutionalHoldingOwnerDetail totalHoldingsValue(BigDecimal totalHoldingsValue) {
    this.totalHoldingsValue = totalHoldingsValue;
    return this;
  }

   /**
   * Market value of equity holdings in 1,000s. Sum of shares held times last close price.
   * @return totalHoldingsValue
  **/
  @ApiModelProperty(value = "Market value of equity holdings in 1,000s. Sum of shares held times last close price.")
  public BigDecimal getTotalHoldingsValue() {
    return totalHoldingsValue;
  }

  public void setTotalHoldingsValue(BigDecimal totalHoldingsValue) {
    this.totalHoldingsValue = totalHoldingsValue;
  }

  public ZacksInstitutionalHoldingOwnerDetail portfolioTurnoverPercent(BigDecimal portfolioTurnoverPercent) {
    this.portfolioTurnoverPercent = portfolioTurnoverPercent;
    return this;
  }

   /**
   * Annual portfolio turnover in terms of percentage of total value.
   * @return portfolioTurnoverPercent
  **/
  @ApiModelProperty(value = "Annual portfolio turnover in terms of percentage of total value.")
  public BigDecimal getPortfolioTurnoverPercent() {
    return portfolioTurnoverPercent;
  }

  public void setPortfolioTurnoverPercent(BigDecimal portfolioTurnoverPercent) {
    this.portfolioTurnoverPercent = portfolioTurnoverPercent;
  }

  public ZacksInstitutionalHoldingOwnerDetail isFund(String isFund) {
    this.isFund = isFund;
    return this;
  }

   /**
   * If &#39;Y&#39;, the owner is a fund? (&#39;Y&#39; &#x3D; Yes, &#39;N&#39; &#x3D; No)
   * @return isFund
  **/
  @ApiModelProperty(value = "If 'Y', the owner is a fund? ('Y' = Yes, 'N' = No)")
  public String getIsFund() {
    return isFund;
  }

  public void setIsFund(String isFund) {
    this.isFund = isFund;
  }

  public ZacksInstitutionalHoldingOwnerDetail fundTicker(String fundTicker) {
    this.fundTicker = fundTicker;
    return this;
  }

   /**
   * Fund ticker if the institution is a fund
   * @return fundTicker
  **/
  @ApiModelProperty(value = "Fund ticker if the institution is a fund")
  public String getFundTicker() {
    return fundTicker;
  }

  public void setFundTicker(String fundTicker) {
    this.fundTicker = fundTicker;
  }

  public ZacksInstitutionalHoldingOwnerDetail hasFundManager(String hasFundManager) {
    this.hasFundManager = hasFundManager;
    return this;
  }

   /**
   * Does the fund have a manager. (&#39;Y&#39; &#x3D; Yes, &#39;N&#39; &#x3D; No)
   * @return hasFundManager
  **/
  @ApiModelProperty(value = "Does the fund have a manager. ('Y' = Yes, 'N' = No)")
  public String getHasFundManager() {
    return hasFundManager;
  }

  public void setHasFundManager(String hasFundManager) {
    this.hasFundManager = hasFundManager;
  }

  public ZacksInstitutionalHoldingOwnerDetail fundManagerCity(String fundManagerCity) {
    this.fundManagerCity = fundManagerCity;
    return this;
  }

   /**
   * The fund manager&#39;s city
   * @return fundManagerCity
  **/
  @ApiModelProperty(value = "The fund manager's city")
  public String getFundManagerCity() {
    return fundManagerCity;
  }

  public void setFundManagerCity(String fundManagerCity) {
    this.fundManagerCity = fundManagerCity;
  }

  public ZacksInstitutionalHoldingOwnerDetail fundManagerName(String fundManagerName) {
    this.fundManagerName = fundManagerName;
    return this;
  }

   /**
   * The fund manager&#39;s name
   * @return fundManagerName
  **/
  @ApiModelProperty(value = "The fund manager's name")
  public String getFundManagerName() {
    return fundManagerName;
  }

  public void setFundManagerName(String fundManagerName) {
    this.fundManagerName = fundManagerName;
  }

  public ZacksInstitutionalHoldingOwnerDetail fundManagerState(String fundManagerState) {
    this.fundManagerState = fundManagerState;
    return this;
  }

   /**
   * The fund manager&#39;s state
   * @return fundManagerState
  **/
  @ApiModelProperty(value = "The fund manager's state")
  public String getFundManagerState() {
    return fundManagerState;
  }

  public void setFundManagerState(String fundManagerState) {
    this.fundManagerState = fundManagerState;
  }

  public ZacksInstitutionalHoldingOwnerDetail files13f(String files13f) {
    this.files13f = files13f;
    return this;
  }

   /**
   * If &#39;Y&#39;, the company files the SEC 13F report. (&#39;Y&#39; &#x3D; Yes, &#39;N&#39; &#x3D; No)
   * @return files13f
  **/
  @ApiModelProperty(value = "If 'Y', the company files the SEC 13F report. ('Y' = Yes, 'N' = No)")
  public String getFiles13f() {
    return files13f;
  }

  public void setFiles13f(String files13f) {
    this.files13f = files13f;
  }

  public ZacksInstitutionalHoldingOwnerDetail isEtf(String isEtf) {
    this.isEtf = isEtf;
    return this;
  }

   /**
   * If &#39;Y&#39;, the owner is an ETF. (&#39;Y&#39; &#x3D; Yes, &#39;N&#39; &#x3D; No)
   * @return isEtf
  **/
  @ApiModelProperty(value = "If 'Y', the owner is an ETF. ('Y' = Yes, 'N' = No)")
  public String getIsEtf() {
    return isEtf;
  }

  public void setIsEtf(String isEtf) {
    this.isEtf = isEtf;
  }

  public ZacksInstitutionalHoldingOwnerDetail lastUpdatedOn(LocalDate lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
    return this;
  }

   /**
   * The the last updated date
   * @return lastUpdatedOn
  **/
  @ApiModelProperty(value = "The the last updated date")
  public LocalDate getLastUpdatedOn() {
    return lastUpdatedOn;
  }

  public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHoldingOwnerDetail zacksInstitutionalHoldingOwnerDetail = (ZacksInstitutionalHoldingOwnerDetail) o;
    return Objects.equals(this.name, zacksInstitutionalHoldingOwnerDetail.name) &&
        Objects.equals(this.cik, zacksInstitutionalHoldingOwnerDetail.cik) &&
        Objects.equals(this.address, zacksInstitutionalHoldingOwnerDetail.address) &&
        Objects.equals(this.cityState, zacksInstitutionalHoldingOwnerDetail.cityState) &&
        Objects.equals(this.locationCode, zacksInstitutionalHoldingOwnerDetail.locationCode) &&
        Objects.equals(this.phoneNumber, zacksInstitutionalHoldingOwnerDetail.phoneNumber) &&
        Objects.equals(this.postalCode, zacksInstitutionalHoldingOwnerDetail.postalCode) &&
        Objects.equals(this.url, zacksInstitutionalHoldingOwnerDetail.url) &&
        Objects.equals(this.investmentStyle, zacksInstitutionalHoldingOwnerDetail.investmentStyle) &&
        Objects.equals(this.numberOfHoldings, zacksInstitutionalHoldingOwnerDetail.numberOfHoldings) &&
        Objects.equals(this.totalHoldingsValue, zacksInstitutionalHoldingOwnerDetail.totalHoldingsValue) &&
        Objects.equals(this.portfolioTurnoverPercent, zacksInstitutionalHoldingOwnerDetail.portfolioTurnoverPercent) &&
        Objects.equals(this.isFund, zacksInstitutionalHoldingOwnerDetail.isFund) &&
        Objects.equals(this.fundTicker, zacksInstitutionalHoldingOwnerDetail.fundTicker) &&
        Objects.equals(this.hasFundManager, zacksInstitutionalHoldingOwnerDetail.hasFundManager) &&
        Objects.equals(this.fundManagerCity, zacksInstitutionalHoldingOwnerDetail.fundManagerCity) &&
        Objects.equals(this.fundManagerName, zacksInstitutionalHoldingOwnerDetail.fundManagerName) &&
        Objects.equals(this.fundManagerState, zacksInstitutionalHoldingOwnerDetail.fundManagerState) &&
        Objects.equals(this.files13f, zacksInstitutionalHoldingOwnerDetail.files13f) &&
        Objects.equals(this.isEtf, zacksInstitutionalHoldingOwnerDetail.isEtf) &&
        Objects.equals(this.lastUpdatedOn, zacksInstitutionalHoldingOwnerDetail.lastUpdatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cik, address, cityState, locationCode, phoneNumber, postalCode, url, investmentStyle, numberOfHoldings, totalHoldingsValue, portfolioTurnoverPercent, isFund, fundTicker, hasFundManager, fundManagerCity, fundManagerName, fundManagerState, files13f, isEtf, lastUpdatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHoldingOwnerDetail {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cityState: ").append(toIndentedString(cityState)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    investmentStyle: ").append(toIndentedString(investmentStyle)).append("\n");
    sb.append("    numberOfHoldings: ").append(toIndentedString(numberOfHoldings)).append("\n");
    sb.append("    totalHoldingsValue: ").append(toIndentedString(totalHoldingsValue)).append("\n");
    sb.append("    portfolioTurnoverPercent: ").append(toIndentedString(portfolioTurnoverPercent)).append("\n");
    sb.append("    isFund: ").append(toIndentedString(isFund)).append("\n");
    sb.append("    fundTicker: ").append(toIndentedString(fundTicker)).append("\n");
    sb.append("    hasFundManager: ").append(toIndentedString(hasFundManager)).append("\n");
    sb.append("    fundManagerCity: ").append(toIndentedString(fundManagerCity)).append("\n");
    sb.append("    fundManagerName: ").append(toIndentedString(fundManagerName)).append("\n");
    sb.append("    fundManagerState: ").append(toIndentedString(fundManagerState)).append("\n");
    sb.append("    files13f: ").append(toIndentedString(files13f)).append("\n");
    sb.append("    isEtf: ").append(toIndentedString(isEtf)).append("\n");
    sb.append("    lastUpdatedOn: ").append(toIndentedString(lastUpdatedOn)).append("\n");
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

