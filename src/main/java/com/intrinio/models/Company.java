

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
 * A company that submits filings to the SEC and has a security traded primarily on a US exchange
 */
@ApiModel(description = "A company that submits filings to the SEC and has a security traded primarily on a US exchange")

public class Company {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lei")
  private String lei = null;

  @SerializedName("legal_name")
  private String legalName = null;

  @SerializedName("stock_exchange")
  private String stockExchange = null;

  @SerializedName("sic")
  private String sic = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("ceo")
  private String ceo = null;

  @SerializedName("company_url")
  private String companyUrl = null;

  @SerializedName("business_address")
  private String businessAddress = null;

  @SerializedName("mailing_address")
  private String mailingAddress = null;

  @SerializedName("business_phone_no")
  private String businessPhoneNo = null;

  @SerializedName("hq_address1")
  private String hqAddress1 = null;

  @SerializedName("hq_address2")
  private String hqAddress2 = null;

  @SerializedName("hq_address_city")
  private String hqAddressCity = null;

  @SerializedName("hq_address_postal_code")
  private String hqAddressPostalCode = null;

  @SerializedName("entity_legal_form")
  private String entityLegalForm = null;

  @SerializedName("cik")
  private String cik = null;

  @SerializedName("latest_filing_date")
  private LocalDate latestFilingDate = null;

  @SerializedName("hq_state")
  private String hqState = null;

  @SerializedName("hq_country")
  private String hqCountry = null;

  @SerializedName("inc_state")
  private String incState = null;

  @SerializedName("inc_country")
  private String incCountry = null;

  @SerializedName("employees")
  private Integer employees = null;

  @SerializedName("entity_status")
  private String entityStatus = null;

  @SerializedName("sector")
  private String sector = null;

  @SerializedName("industry_category")
  private String industryCategory = null;

  @SerializedName("industry_group")
  private String industryGroup = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("standardized_active")
  private Boolean standardizedActive = null;

  @SerializedName("first_fundamental_date")
  private LocalDate firstFundamentalDate = null;

  @SerializedName("last_fundamental_date")
  private LocalDate lastFundamentalDate = null;

  @SerializedName("first_stock_price_date")
  private LocalDate firstStockPriceDate = null;

  @SerializedName("last_stock_price_date")
  private LocalDate lastStockPriceDate = null;

  public Company id(String id) {
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

  public Company ticker(String ticker) {
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

  public Company name(String name) {
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

  public Company lei(String lei) {
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

  public Company legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * The company&#39;s official legal name
   * @return legalName
  **/
  @ApiModelProperty(value = "The company's official legal name")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Company stockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
    return this;
  }

   /**
   * The Stock Exchange where the company&#39;s common stock is primarily traded
   * @return stockExchange
  **/
  @ApiModelProperty(value = "The Stock Exchange where the company's common stock is primarily traded")
  public String getStockExchange() {
    return stockExchange;
  }

  public void setStockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
  }

  public Company sic(String sic) {
    this.sic = sic;
    return this;
  }

   /**
   * The Standard Industrial Classification (SIC) determined by the company and filed with the SEC
   * @return sic
  **/
  @ApiModelProperty(value = "The Standard Industrial Classification (SIC) determined by the company and filed with the SEC")
  public String getSic() {
    return sic;
  }

  public void setSic(String sic) {
    this.sic = sic;
  }

  public Company shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A one or two sentence description of the company&#39;s operations
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A one or two sentence description of the company's operations")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Company longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A one paragraph description of the company&#39;s operations and other corporate actions
   * @return longDescription
  **/
  @ApiModelProperty(value = "A one paragraph description of the company's operations and other corporate actions")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Company ceo(String ceo) {
    this.ceo = ceo;
    return this;
  }

   /**
   * The Chief Executive Officer of the company
   * @return ceo
  **/
  @ApiModelProperty(value = "The Chief Executive Officer of the company")
  public String getCeo() {
    return ceo;
  }

  public void setCeo(String ceo) {
    this.ceo = ceo;
  }

  public Company companyUrl(String companyUrl) {
    this.companyUrl = companyUrl;
    return this;
  }

   /**
   * The URL of the company&#39;s primary corporate website or primary internet property
   * @return companyUrl
  **/
  @ApiModelProperty(value = "The URL of the company's primary corporate website or primary internet property")
  public String getCompanyUrl() {
    return companyUrl;
  }

  public void setCompanyUrl(String companyUrl) {
    this.companyUrl = companyUrl;
  }

  public Company businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * The company&#39;s business address
   * @return businessAddress
  **/
  @ApiModelProperty(value = "The company's business address")
  public String getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }

  public Company mailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * The mailing address reported by the company
   * @return mailingAddress
  **/
  @ApiModelProperty(value = "The mailing address reported by the company")
  public String getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
  }

  public Company businessPhoneNo(String businessPhoneNo) {
    this.businessPhoneNo = businessPhoneNo;
    return this;
  }

   /**
   * The phone number reported by the company
   * @return businessPhoneNo
  **/
  @ApiModelProperty(value = "The phone number reported by the company")
  public String getBusinessPhoneNo() {
    return businessPhoneNo;
  }

  public void setBusinessPhoneNo(String businessPhoneNo) {
    this.businessPhoneNo = businessPhoneNo;
  }

  public Company hqAddress1(String hqAddress1) {
    this.hqAddress1 = hqAddress1;
    return this;
  }

   /**
   * The company&#39;s headquarters address - line 1
   * @return hqAddress1
  **/
  @ApiModelProperty(value = "The company's headquarters address - line 1")
  public String getHqAddress1() {
    return hqAddress1;
  }

  public void setHqAddress1(String hqAddress1) {
    this.hqAddress1 = hqAddress1;
  }

  public Company hqAddress2(String hqAddress2) {
    this.hqAddress2 = hqAddress2;
    return this;
  }

   /**
   * The company&#39;s headquarters address - line 2
   * @return hqAddress2
  **/
  @ApiModelProperty(value = "The company's headquarters address - line 2")
  public String getHqAddress2() {
    return hqAddress2;
  }

  public void setHqAddress2(String hqAddress2) {
    this.hqAddress2 = hqAddress2;
  }

  public Company hqAddressCity(String hqAddressCity) {
    this.hqAddressCity = hqAddressCity;
    return this;
  }

   /**
   * The company&#39;s headquarters city
   * @return hqAddressCity
  **/
  @ApiModelProperty(value = "The company's headquarters city")
  public String getHqAddressCity() {
    return hqAddressCity;
  }

  public void setHqAddressCity(String hqAddressCity) {
    this.hqAddressCity = hqAddressCity;
  }

  public Company hqAddressPostalCode(String hqAddressPostalCode) {
    this.hqAddressPostalCode = hqAddressPostalCode;
    return this;
  }

   /**
   * The company&#39;s headquarters postal code
   * @return hqAddressPostalCode
  **/
  @ApiModelProperty(value = "The company's headquarters postal code")
  public String getHqAddressPostalCode() {
    return hqAddressPostalCode;
  }

  public void setHqAddressPostalCode(String hqAddressPostalCode) {
    this.hqAddressPostalCode = hqAddressPostalCode;
  }

  public Company entityLegalForm(String entityLegalForm) {
    this.entityLegalForm = entityLegalForm;
    return this;
  }

   /**
   * The company&#39;s legal organization form
   * @return entityLegalForm
  **/
  @ApiModelProperty(value = "The company's legal organization form")
  public String getEntityLegalForm() {
    return entityLegalForm;
  }

  public void setEntityLegalForm(String entityLegalForm) {
    this.entityLegalForm = entityLegalForm;
  }

  public Company cik(String cik) {
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

  public Company latestFilingDate(LocalDate latestFilingDate) {
    this.latestFilingDate = latestFilingDate;
    return this;
  }

   /**
   * The date of the company&#39;s last filing with the SEC
   * @return latestFilingDate
  **/
  @ApiModelProperty(value = "The date of the company's last filing with the SEC")
  public LocalDate getLatestFilingDate() {
    return latestFilingDate;
  }

  public void setLatestFilingDate(LocalDate latestFilingDate) {
    this.latestFilingDate = latestFilingDate;
  }

  public Company hqState(String hqState) {
    this.hqState = hqState;
    return this;
  }

   /**
   * The state (US &amp; Canada Only) where the company headquarters are located
   * @return hqState
  **/
  @ApiModelProperty(value = "The state (US & Canada Only) where the company headquarters are located")
  public String getHqState() {
    return hqState;
  }

  public void setHqState(String hqState) {
    this.hqState = hqState;
  }

  public Company hqCountry(String hqCountry) {
    this.hqCountry = hqCountry;
    return this;
  }

   /**
   * The country where the company headquarters are located
   * @return hqCountry
  **/
  @ApiModelProperty(value = "The country where the company headquarters are located")
  public String getHqCountry() {
    return hqCountry;
  }

  public void setHqCountry(String hqCountry) {
    this.hqCountry = hqCountry;
  }

  public Company incState(String incState) {
    this.incState = incState;
    return this;
  }

   /**
   * The state (US &amp; Canada Only) where the company is incorporated
   * @return incState
  **/
  @ApiModelProperty(value = "The state (US & Canada Only) where the company is incorporated")
  public String getIncState() {
    return incState;
  }

  public void setIncState(String incState) {
    this.incState = incState;
  }

  public Company incCountry(String incCountry) {
    this.incCountry = incCountry;
    return this;
  }

   /**
   * The country where the company is incorporated
   * @return incCountry
  **/
  @ApiModelProperty(value = "The country where the company is incorporated")
  public String getIncCountry() {
    return incCountry;
  }

  public void setIncCountry(String incCountry) {
    this.incCountry = incCountry;
  }

  public Company employees(Integer employees) {
    this.employees = employees;
    return this;
  }

   /**
   * The number of employees working for the company
   * @return employees
  **/
  @ApiModelProperty(value = "The number of employees working for the company")
  public Integer getEmployees() {
    return employees;
  }

  public void setEmployees(Integer employees) {
    this.employees = employees;
  }

  public Company entityStatus(String entityStatus) {
    this.entityStatus = entityStatus;
    return this;
  }

   /**
   * Get entityStatus
   * @return entityStatus
  **/
  @ApiModelProperty(value = "")
  public String getEntityStatus() {
    return entityStatus;
  }

  public void setEntityStatus(String entityStatus) {
    this.entityStatus = entityStatus;
  }

  public Company sector(String sector) {
    this.sector = sector;
    return this;
  }

   /**
   * The company&#39;s operating sector
   * @return sector
  **/
  @ApiModelProperty(value = "The company's operating sector")
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public Company industryCategory(String industryCategory) {
    this.industryCategory = industryCategory;
    return this;
  }

   /**
   * The company&#39;s operating industry category
   * @return industryCategory
  **/
  @ApiModelProperty(value = "The company's operating industry category")
  public String getIndustryCategory() {
    return industryCategory;
  }

  public void setIndustryCategory(String industryCategory) {
    this.industryCategory = industryCategory;
  }

  public Company industryGroup(String industryGroup) {
    this.industryGroup = industryGroup;
    return this;
  }

   /**
   * The company&#39;s operating industry group
   * @return industryGroup
  **/
  @ApiModelProperty(value = "The company's operating industry group")
  public String getIndustryGroup() {
    return industryGroup;
  }

  public void setIndustryGroup(String industryGroup) {
    this.industryGroup = industryGroup;
  }

  public Company template(String template) {
    this.template = template;
    return this;
  }

   /**
   * The financial statement template used by Intrinio to standardize the as reported data
   * @return template
  **/
  @ApiModelProperty(value = "The financial statement template used by Intrinio to standardize the as reported data")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Company standardizedActive(Boolean standardizedActive) {
    this.standardizedActive = standardizedActive;
    return this;
  }

   /**
   * If true, the company has standardized and as reported fundamental data via the Intrinio API; if false, the company has as-reported data only
   * @return standardizedActive
  **/
  @ApiModelProperty(value = "If true, the company has standardized and as reported fundamental data via the Intrinio API; if false, the company has as-reported data only")
  public Boolean isStandardizedActive() {
    return standardizedActive;
  }

  public void setStandardizedActive(Boolean standardizedActive) {
    this.standardizedActive = standardizedActive;
  }

  public Company firstFundamentalDate(LocalDate firstFundamentalDate) {
    this.firstFundamentalDate = firstFundamentalDate;
    return this;
  }

   /**
   * The period end date of the company&#39;s first reported fundamental
   * @return firstFundamentalDate
  **/
  @ApiModelProperty(value = "The period end date of the company's first reported fundamental")
  public LocalDate getFirstFundamentalDate() {
    return firstFundamentalDate;
  }

  public void setFirstFundamentalDate(LocalDate firstFundamentalDate) {
    this.firstFundamentalDate = firstFundamentalDate;
  }

  public Company lastFundamentalDate(LocalDate lastFundamentalDate) {
    this.lastFundamentalDate = lastFundamentalDate;
    return this;
  }

   /**
   * The period end date of the company&#39;s last reported fundamental
   * @return lastFundamentalDate
  **/
  @ApiModelProperty(value = "The period end date of the company's last reported fundamental")
  public LocalDate getLastFundamentalDate() {
    return lastFundamentalDate;
  }

  public void setLastFundamentalDate(LocalDate lastFundamentalDate) {
    this.lastFundamentalDate = lastFundamentalDate;
  }

  public Company firstStockPriceDate(LocalDate firstStockPriceDate) {
    this.firstStockPriceDate = firstStockPriceDate;
    return this;
  }

   /**
   * The date of the company&#39;s first stock price, based on the company&#39;s primary security, which is typically traded on US exchages
   * @return firstStockPriceDate
  **/
  @ApiModelProperty(value = "The date of the company's first stock price, based on the company's primary security, which is typically traded on US exchages")
  public LocalDate getFirstStockPriceDate() {
    return firstStockPriceDate;
  }

  public void setFirstStockPriceDate(LocalDate firstStockPriceDate) {
    this.firstStockPriceDate = firstStockPriceDate;
  }

  public Company lastStockPriceDate(LocalDate lastStockPriceDate) {
    this.lastStockPriceDate = lastStockPriceDate;
    return this;
  }

   /**
   * The date of the company&#39;s last stock price, based on the company&#39;s primary security, which is typically traded on US exchages
   * @return lastStockPriceDate
  **/
  @ApiModelProperty(value = "The date of the company's last stock price, based on the company's primary security, which is typically traded on US exchages")
  public LocalDate getLastStockPriceDate() {
    return lastStockPriceDate;
  }

  public void setLastStockPriceDate(LocalDate lastStockPriceDate) {
    this.lastStockPriceDate = lastStockPriceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.ticker, company.ticker) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.lei, company.lei) &&
        Objects.equals(this.legalName, company.legalName) &&
        Objects.equals(this.stockExchange, company.stockExchange) &&
        Objects.equals(this.sic, company.sic) &&
        Objects.equals(this.shortDescription, company.shortDescription) &&
        Objects.equals(this.longDescription, company.longDescription) &&
        Objects.equals(this.ceo, company.ceo) &&
        Objects.equals(this.companyUrl, company.companyUrl) &&
        Objects.equals(this.businessAddress, company.businessAddress) &&
        Objects.equals(this.mailingAddress, company.mailingAddress) &&
        Objects.equals(this.businessPhoneNo, company.businessPhoneNo) &&
        Objects.equals(this.hqAddress1, company.hqAddress1) &&
        Objects.equals(this.hqAddress2, company.hqAddress2) &&
        Objects.equals(this.hqAddressCity, company.hqAddressCity) &&
        Objects.equals(this.hqAddressPostalCode, company.hqAddressPostalCode) &&
        Objects.equals(this.entityLegalForm, company.entityLegalForm) &&
        Objects.equals(this.cik, company.cik) &&
        Objects.equals(this.latestFilingDate, company.latestFilingDate) &&
        Objects.equals(this.hqState, company.hqState) &&
        Objects.equals(this.hqCountry, company.hqCountry) &&
        Objects.equals(this.incState, company.incState) &&
        Objects.equals(this.incCountry, company.incCountry) &&
        Objects.equals(this.employees, company.employees) &&
        Objects.equals(this.entityStatus, company.entityStatus) &&
        Objects.equals(this.sector, company.sector) &&
        Objects.equals(this.industryCategory, company.industryCategory) &&
        Objects.equals(this.industryGroup, company.industryGroup) &&
        Objects.equals(this.template, company.template) &&
        Objects.equals(this.standardizedActive, company.standardizedActive) &&
        Objects.equals(this.firstFundamentalDate, company.firstFundamentalDate) &&
        Objects.equals(this.lastFundamentalDate, company.lastFundamentalDate) &&
        Objects.equals(this.firstStockPriceDate, company.firstStockPriceDate) &&
        Objects.equals(this.lastStockPriceDate, company.lastStockPriceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, name, lei, legalName, stockExchange, sic, shortDescription, longDescription, ceo, companyUrl, businessAddress, mailingAddress, businessPhoneNo, hqAddress1, hqAddress2, hqAddressCity, hqAddressPostalCode, entityLegalForm, cik, latestFilingDate, hqState, hqCountry, incState, incCountry, employees, entityStatus, sector, industryCategory, industryGroup, template, standardizedActive, firstFundamentalDate, lastFundamentalDate, firstStockPriceDate, lastStockPriceDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
    sb.append("    sic: ").append(toIndentedString(sic)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    ceo: ").append(toIndentedString(ceo)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    businessPhoneNo: ").append(toIndentedString(businessPhoneNo)).append("\n");
    sb.append("    hqAddress1: ").append(toIndentedString(hqAddress1)).append("\n");
    sb.append("    hqAddress2: ").append(toIndentedString(hqAddress2)).append("\n");
    sb.append("    hqAddressCity: ").append(toIndentedString(hqAddressCity)).append("\n");
    sb.append("    hqAddressPostalCode: ").append(toIndentedString(hqAddressPostalCode)).append("\n");
    sb.append("    entityLegalForm: ").append(toIndentedString(entityLegalForm)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    latestFilingDate: ").append(toIndentedString(latestFilingDate)).append("\n");
    sb.append("    hqState: ").append(toIndentedString(hqState)).append("\n");
    sb.append("    hqCountry: ").append(toIndentedString(hqCountry)).append("\n");
    sb.append("    incState: ").append(toIndentedString(incState)).append("\n");
    sb.append("    incCountry: ").append(toIndentedString(incCountry)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    entityStatus: ").append(toIndentedString(entityStatus)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    industryCategory: ").append(toIndentedString(industryCategory)).append("\n");
    sb.append("    industryGroup: ").append(toIndentedString(industryGroup)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    standardizedActive: ").append(toIndentedString(standardizedActive)).append("\n");
    sb.append("    firstFundamentalDate: ").append(toIndentedString(firstFundamentalDate)).append("\n");
    sb.append("    lastFundamentalDate: ").append(toIndentedString(lastFundamentalDate)).append("\n");
    sb.append("    firstStockPriceDate: ").append(toIndentedString(firstStockPriceDate)).append("\n");
    sb.append("    lastStockPriceDate: ").append(toIndentedString(lastStockPriceDate)).append("\n");
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

