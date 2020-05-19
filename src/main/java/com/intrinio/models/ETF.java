

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
 * Exchange Traded Fund (ETF) including extensive metadata
 */
@ApiModel(description = "Exchange Traded Fund (ETF) including extensive metadata")

public class ETF {
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

  @SerializedName("sponsor")
  private String sponsor = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("inception_date")
  private LocalDate inceptionDate = null;

  @SerializedName("data_change_date")
  private LocalDate dataChangeDate = null;

  @SerializedName("close_date")
  private LocalDate closeDate = null;

  @SerializedName("is_live_listed")
  private Boolean isLiveListed = null;

  @SerializedName("legal_structure")
  private String legalStructure = null;

  @SerializedName("intraday_nav_ticker")
  private String intradayNavTicker = null;

  @SerializedName("primary_ticker")
  private String primaryTicker = null;

  @SerializedName("primary_ticker_country_code")
  private String primaryTickerCountryCode = null;

  @SerializedName("primary_listing_region")
  private String primaryListingRegion = null;

  @SerializedName("net_expense_ratio")
  private BigDecimal netExpenseRatio = null;

  @SerializedName("asset_class")
  private String assetClass = null;

  @SerializedName("other_asset_types")
  private String otherAssetTypes = null;

  @SerializedName("market_cap_range")
  private String marketCapRange = null;

  @SerializedName("holds_only_nyse_stocks")
  private Boolean holdsOnlyNyseStocks = null;

  @SerializedName("holds_only_nasdaq_stocks")
  private Boolean holdsOnlyNasdaqStocks = null;

  @SerializedName("growth_value_tilt")
  private String growthValueTilt = null;

  @SerializedName("growth_type")
  private String growthType = null;

  @SerializedName("value_type")
  private String valueType = null;

  @SerializedName("sector")
  private String sector = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("sub_industry")
  private String subIndustry = null;

  @SerializedName("cross_sector_theme")
  private String crossSectorTheme = null;

  @SerializedName("natural_resources_type")
  private String naturalResourcesType = null;

  @SerializedName("excludes_financials")
  private Boolean excludesFinancials = null;

  @SerializedName("excludes_technology")
  private Boolean excludesTechnology = null;

  @SerializedName("us_or_excludes_us")
  private String usOrExcludesUs = null;

  @SerializedName("developed_emerging")
  private String developedEmerging = null;

  @SerializedName("specialized_region")
  private String specializedRegion = null;

  @SerializedName("continent")
  private String continent = null;

  @SerializedName("latin_america_sub_group")
  private String latinAmericaSubGroup = null;

  @SerializedName("europe_sub_group")
  private String europeSubGroup = null;

  @SerializedName("asia_sub_group")
  private String asiaSubGroup = null;

  @SerializedName("specific_country")
  private String specificCountry = null;

  @SerializedName("china_listing_location")
  private String chinaListingLocation = null;

  @SerializedName("us_state")
  private String usState = null;

  @SerializedName("real_estate")
  private String realEstate = null;

  @SerializedName("index_weighting_scheme")
  private String indexWeightingScheme = null;

  @SerializedName("market_cap_weighting_type")
  private String marketCapWeightingType = null;

  @SerializedName("fundamental_weighting_type")
  private String fundamentalWeightingType = null;

  @SerializedName("dividend_weighting_type")
  private String dividendWeightingType = null;

  @SerializedName("bond_type")
  private String bondType = null;

  @SerializedName("government_bond_types")
  private String governmentBondTypes = null;

  @SerializedName("municipal_bond_region")
  private String municipalBondRegion = null;

  @SerializedName("municipal_vrdo")
  private Boolean municipalVrdo = null;

  @SerializedName("mortgage_bond_types")
  private String mortgageBondTypes = null;

  @SerializedName("bond_tax_status")
  private String bondTaxStatus = null;

  @SerializedName("credit_quality")
  private String creditQuality = null;

  @SerializedName("average_maturity")
  private String averageMaturity = null;

  @SerializedName("specific_maturity_year")
  private Integer specificMaturityYear = null;

  @SerializedName("bond_currency_denomination")
  private String bondCurrencyDenomination = null;

  @SerializedName("laddered")
  private Boolean laddered = null;

  @SerializedName("zero_coupon")
  private Boolean zeroCoupon = null;

  @SerializedName("floating_rate")
  private Boolean floatingRate = null;

  @SerializedName("build_america_bonds")
  private Boolean buildAmericaBonds = null;

  @SerializedName("commodity_types")
  private String commodityTypes = null;

  @SerializedName("energy_type")
  private String energyType = null;

  @SerializedName("agricultural_type")
  private String agriculturalType = null;

  @SerializedName("metal_type")
  private String metalType = null;

  @SerializedName("inverse_leveraged")
  private String inverseLeveraged = null;

  @SerializedName("target_date_multi_asset_type")
  private String targetDateMultiAssetType = null;

  @SerializedName("currency_hedged")
  private Boolean currencyHedged = null;

  @SerializedName("currency_pair")
  private String currencyPair = null;

  @SerializedName("social_environmental_type")
  private String socialEnvironmentalType = null;

  @SerializedName("clean_energy_type")
  private String cleanEnergyType = null;

  @SerializedName("dividend_type")
  private String dividendType = null;

  @SerializedName("regular_dividend_payor_type")
  private String regularDividendPayorType = null;

  @SerializedName("holds_ml_ps")
  private Boolean holdsMlPs = null;

  @SerializedName("holds_preferred_stock")
  private Boolean holdsPreferredStock = null;

  @SerializedName("holds_closed_end_funds")
  private Boolean holdsClosedEndFunds = null;

  @SerializedName("quant_strategies_type")
  private String quantStrategiesType = null;

  @SerializedName("other_quant_models")
  private String otherQuantModels = null;

  @SerializedName("hedge_fund_type")
  private String hedgeFundType = null;

  @SerializedName("derivatives_based")
  private String derivativesBased = null;

  @SerializedName("holds_ad_rs")
  private Boolean holdsAdRs = null;

  @SerializedName("index_linked")
  private String indexLinked = null;

  @SerializedName("includes_short_exposure")
  private Boolean includesShortExposure = null;

  @SerializedName("index_name")
  private String indexName = null;

  @SerializedName("parent_index")
  private String parentIndex = null;

  @SerializedName("index_family")
  private String indexFamily = null;

  @SerializedName("broader_index_family")
  private String broaderIndexFamily = null;

  @SerializedName("index_provider")
  private String indexProvider = null;

  @SerializedName("fund_family")
  private String fundFamily = null;

  @SerializedName("index_ticker")
  private String indexTicker = null;

  @SerializedName("etn_issuing_bank")
  private String etnIssuingBank = null;

  @SerializedName("etn_maturity_date")
  private LocalDate etnMaturityDate = null;

  @SerializedName("livestock")
  private String livestock = null;

  @SerializedName("dynamic_futures_roll")
  private Boolean dynamicFuturesRoll = null;

  @SerializedName("index_provider_code")
  private String indexProviderCode = null;

  @SerializedName("single_category_designation")
  private String singleCategoryDesignation = null;

  @SerializedName("registered_countries")
  private String registeredCountries = null;

  @SerializedName("issuing_entity_country_code")
  private String issuingEntityCountryCode = null;

  @SerializedName("ucits")
  private Boolean ucits = null;

  @SerializedName("replication_structure")
  private String replicationStructure = null;

  @SerializedName("domicile")
  private String domicile = null;

  @SerializedName("base_currency")
  private String baseCurrency = null;

  @SerializedName("listing_currency")
  private String listingCurrency = null;

  @SerializedName("fund_listing_date")
  private LocalDate fundListingDate = null;

  @SerializedName("listing_country_code")
  private String listingCountryCode = null;

  @SerializedName("listing_region")
  private String listingRegion = null;

  @SerializedName("smartvs_traditional_beta")
  private String smartvsTraditionalBeta = null;

  @SerializedName("smartvs_traditional_beta_level2")
  private String smartvsTraditionalBetaLevel2 = null;

  @SerializedName("income_category")
  private String incomeCategory = null;

  @SerializedName("etp_structure_type")
  private String etpStructureType = null;

  @SerializedName("month_end_assets")
  private BigDecimal monthEndAssets = null;

  @SerializedName("etf_portfolio_turnover")
  private BigDecimal etfPortfolioTurnover = null;

  @SerializedName("firstbridge_id")
  private String firstbridgeId = null;

  @SerializedName("firstbridge_parent_id")
  private String firstbridgeParentId = null;

  @SerializedName("number_of_holdings")
  private Integer numberOfHoldings = null;

  public ETF id(String id) {
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

  public ETF name(String name) {
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

  public ETF ticker(String ticker) {
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

  public ETF figiTicker(String figiTicker) {
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

  public ETF ric(String ric) {
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

  public ETF isin(String isin) {
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

  public ETF sedol(String sedol) {
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

  public ETF exchangeMic(String exchangeMic) {
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

  public ETF sponsor(String sponsor) {
    this.sponsor = sponsor;
    return this;
  }

   /**
   * The fund manager (ETF) or issuing bank (ETN)
   * @return sponsor
  **/
  @ApiModelProperty(value = "The fund manager (ETF) or issuing bank (ETN)")
  public String getSponsor() {
    return sponsor;
  }

  public void setSponsor(String sponsor) {
    this.sponsor = sponsor;
  }

  public ETF type(String type) {
    this.type = type;
    return this;
  }

   /**
   * High-level classification for the ETF based on its intended investment objective
   * @return type
  **/
  @ApiModelProperty(value = "High-level classification for the ETF based on its intended investment objective")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ETF description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The ETF description as published by the ETF sponsor
   * @return description
  **/
  @ApiModelProperty(value = "The ETF description as published by the ETF sponsor")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ETF inceptionDate(LocalDate inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

   /**
   * Inception Date for the ETF as published by the ETF sponsor
   * @return inceptionDate
  **/
  @ApiModelProperty(value = "Inception Date for the ETF as published by the ETF sponsor")
  public LocalDate getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(LocalDate inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public ETF dataChangeDate(LocalDate dataChangeDate) {
    this.dataChangeDate = dataChangeDate;
    return this;
  }

   /**
   * The last date on which there was a change in a classifications data field for this ETF
   * @return dataChangeDate
  **/
  @ApiModelProperty(value = "The last date on which there was a change in a classifications data field for this ETF")
  public LocalDate getDataChangeDate() {
    return dataChangeDate;
  }

  public void setDataChangeDate(LocalDate dataChangeDate) {
    this.dataChangeDate = dataChangeDate;
  }

  public ETF closeDate(LocalDate closeDate) {
    this.closeDate = closeDate;
    return this;
  }

   /**
   * The date on which this ETF was de-listed if it is no longer listed
   * @return closeDate
  **/
  @ApiModelProperty(value = "The date on which this ETF was de-listed if it is no longer listed")
  public LocalDate getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(LocalDate closeDate) {
    this.closeDate = closeDate;
  }

  public ETF isLiveListed(Boolean isLiveListed) {
    this.isLiveListed = isLiveListed;
    return this;
  }

   /**
   * If true, the ETF is still listed on an exchange; if false, the ETF is no longer listed
   * @return isLiveListed
  **/
  @ApiModelProperty(value = "If true, the ETF is still listed on an exchange; if false, the ETF is no longer listed")
  public Boolean isIsLiveListed() {
    return isLiveListed;
  }

  public void setIsLiveListed(Boolean isLiveListed) {
    this.isLiveListed = isLiveListed;
  }

  public ETF legalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
    return this;
  }

   /**
   * The legal structure as defined in the prospectus
   * @return legalStructure
  **/
  @ApiModelProperty(value = "The legal structure as defined in the prospectus")
  public String getLegalStructure() {
    return legalStructure;
  }

  public void setLegalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
  }

  public ETF intradayNavTicker(String intradayNavTicker) {
    this.intradayNavTicker = intradayNavTicker;
    return this;
  }

   /**
   * Intra-day NAV ticker for the Exchange Traded Fund (ETF)
   * @return intradayNavTicker
  **/
  @ApiModelProperty(value = "Intra-day NAV ticker for the Exchange Traded Fund (ETF)")
  public String getIntradayNavTicker() {
    return intradayNavTicker;
  }

  public void setIntradayNavTicker(String intradayNavTicker) {
    this.intradayNavTicker = intradayNavTicker;
  }

  public ETF primaryTicker(String primaryTicker) {
    this.primaryTicker = primaryTicker;
    return this;
  }

   /**
   * The primary ticker field is used for Exchange Traded Products (ETPs) that have multiple listings and share classes. If an ETP has multiple listings or share classes, the same primary ticker is assigned to all the listings and share classes
   * @return primaryTicker
  **/
  @ApiModelProperty(value = "The primary ticker field is used for Exchange Traded Products (ETPs) that have multiple listings and share classes. If an ETP has multiple listings or share classes, the same primary ticker is assigned to all the listings and share classes")
  public String getPrimaryTicker() {
    return primaryTicker;
  }

  public void setPrimaryTicker(String primaryTicker) {
    this.primaryTicker = primaryTicker;
  }

  public ETF primaryTickerCountryCode(String primaryTickerCountryCode) {
    this.primaryTickerCountryCode = primaryTickerCountryCode;
    return this;
  }

   /**
   * 2 letter ISO country code for the country of the primary listing
   * @return primaryTickerCountryCode
  **/
  @ApiModelProperty(value = "2 letter ISO country code for the country of the primary listing")
  public String getPrimaryTickerCountryCode() {
    return primaryTickerCountryCode;
  }

  public void setPrimaryTickerCountryCode(String primaryTickerCountryCode) {
    this.primaryTickerCountryCode = primaryTickerCountryCode;
  }

  public ETF primaryListingRegion(String primaryListingRegion) {
    this.primaryListingRegion = primaryListingRegion;
    return this;
  }

   /**
   * Geographic region in the country of the primary listing falls
   * @return primaryListingRegion
  **/
  @ApiModelProperty(value = "Geographic region in the country of the primary listing falls")
  public String getPrimaryListingRegion() {
    return primaryListingRegion;
  }

  public void setPrimaryListingRegion(String primaryListingRegion) {
    this.primaryListingRegion = primaryListingRegion;
  }

  public ETF netExpenseRatio(BigDecimal netExpenseRatio) {
    this.netExpenseRatio = netExpenseRatio;
    return this;
  }

   /**
   * Gross expense net of Fee Waivers, as a percentage of net assets as published by the ETF Sponsor
   * @return netExpenseRatio
  **/
  @ApiModelProperty(value = "Gross expense net of Fee Waivers, as a percentage of net assets as published by the ETF Sponsor")
  public BigDecimal getNetExpenseRatio() {
    return netExpenseRatio;
  }

  public void setNetExpenseRatio(BigDecimal netExpenseRatio) {
    this.netExpenseRatio = netExpenseRatio;
  }

  public ETF assetClass(String assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Captures the underlying nature of the securities in the Exchanged Traded Product (ETP)
   * @return assetClass
  **/
  @ApiModelProperty(value = "Captures the underlying nature of the securities in the Exchanged Traded Product (ETP)")
  public String getAssetClass() {
    return assetClass;
  }

  public void setAssetClass(String assetClass) {
    this.assetClass = assetClass;
  }

  public ETF otherAssetTypes(String otherAssetTypes) {
    this.otherAssetTypes = otherAssetTypes;
    return this;
  }

   /**
   * If &#39;asset_class&#39; field is classified as &#39;Other Asset Types&#39; this field captures the specific category of the underlying assets
   * @return otherAssetTypes
  **/
  @ApiModelProperty(value = "If 'asset_class' field is classified as 'Other Asset Types' this field captures the specific category of the underlying assets")
  public String getOtherAssetTypes() {
    return otherAssetTypes;
  }

  public void setOtherAssetTypes(String otherAssetTypes) {
    this.otherAssetTypes = otherAssetTypes;
  }

  public ETF marketCapRange(String marketCapRange) {
    this.marketCapRange = marketCapRange;
    return this;
  }

   /**
   * Equity ETFs are classified as falling into categories based on the description of their investment strategy in the prospectus.  Examples (&#39;Mega Cap&#39;, &#39;Large Cap&#39;, &#39;Mid Cap&#39;, etc.)
   * @return marketCapRange
  **/
  @ApiModelProperty(value = "Equity ETFs are classified as falling into categories based on the description of their investment strategy in the prospectus.  Examples ('Mega Cap', 'Large Cap', 'Mid Cap', etc.)")
  public String getMarketCapRange() {
    return marketCapRange;
  }

  public void setMarketCapRange(String marketCapRange) {
    this.marketCapRange = marketCapRange;
  }

  public ETF holdsOnlyNyseStocks(Boolean holdsOnlyNyseStocks) {
    this.holdsOnlyNyseStocks = holdsOnlyNyseStocks;
    return this;
  }

   /**
   * If true, the ETF is an equity ETF and holds only stocks listed on NYSE
   * @return holdsOnlyNyseStocks
  **/
  @ApiModelProperty(value = "If true, the ETF is an equity ETF and holds only stocks listed on NYSE")
  public Boolean isHoldsOnlyNyseStocks() {
    return holdsOnlyNyseStocks;
  }

  public void setHoldsOnlyNyseStocks(Boolean holdsOnlyNyseStocks) {
    this.holdsOnlyNyseStocks = holdsOnlyNyseStocks;
  }

  public ETF holdsOnlyNasdaqStocks(Boolean holdsOnlyNasdaqStocks) {
    this.holdsOnlyNasdaqStocks = holdsOnlyNasdaqStocks;
    return this;
  }

   /**
   * If false, the ETF is an equity ETF and holds only stocks listed on Nasdaq
   * @return holdsOnlyNasdaqStocks
  **/
  @ApiModelProperty(value = "If false, the ETF is an equity ETF and holds only stocks listed on Nasdaq")
  public Boolean isHoldsOnlyNasdaqStocks() {
    return holdsOnlyNasdaqStocks;
  }

  public void setHoldsOnlyNasdaqStocks(Boolean holdsOnlyNasdaqStocks) {
    this.holdsOnlyNasdaqStocks = holdsOnlyNasdaqStocks;
  }

  public ETF growthValueTilt(String growthValueTilt) {
    this.growthValueTilt = growthValueTilt;
    return this;
  }

   /**
   * Classifies equity ETFs as either &#39;Growth&#39; or Value&#39; based on the stated style tilt in the ETF prospectus. Equity ETFs that do not have a stated style tilt are classified as &#39;Core / Blend&#39;
   * @return growthValueTilt
  **/
  @ApiModelProperty(value = "Classifies equity ETFs as either 'Growth' or Value' based on the stated style tilt in the ETF prospectus. Equity ETFs that do not have a stated style tilt are classified as 'Core / Blend'")
  public String getGrowthValueTilt() {
    return growthValueTilt;
  }

  public void setGrowthValueTilt(String growthValueTilt) {
    this.growthValueTilt = growthValueTilt;
  }

  public ETF growthType(String growthType) {
    this.growthType = growthType;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Growth&#39; in &#39;growth_value_tilt&#39;, this field further identifies those where the stocks in the ETF are both selected and weighted based on their growth (style factor) scores
   * @return growthType
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Growth' in 'growth_value_tilt', this field further identifies those where the stocks in the ETF are both selected and weighted based on their growth (style factor) scores")
  public String getGrowthType() {
    return growthType;
  }

  public void setGrowthType(String growthType) {
    this.growthType = growthType;
  }

  public ETF valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Value&#39; in &#39;growth_value_tilt&#39;, this field further identifies those where the stocks in the ETF are both selected and weighted based on their value (style factor) scores
   * @return valueType
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Value' in 'growth_value_tilt', this field further identifies those where the stocks in the ETF are both selected and weighted based on their value (style factor) scores")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public ETF sector(String sector) {
    this.sector = sector;
    return this;
  }

   /**
   * For equity ETFs that aim to provide targeted exposure to a sector or industry, this field identifies the Sector that it provides the exposure to
   * @return sector
  **/
  @ApiModelProperty(value = "For equity ETFs that aim to provide targeted exposure to a sector or industry, this field identifies the Sector that it provides the exposure to")
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public ETF industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * For equity ETFs that aim to provide targeted exposure to an industry, this field identifies the Industry that it provides the exposure to.
   * @return industry
  **/
  @ApiModelProperty(value = "For equity ETFs that aim to provide targeted exposure to an industry, this field identifies the Industry that it provides the exposure to.")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public ETF subIndustry(String subIndustry) {
    this.subIndustry = subIndustry;
    return this;
  }

   /**
   * For equity ETFs that aim to provide targeted exposure to a sub-industry, this field identifies the sub-industry that it provides the exposure to
   * @return subIndustry
  **/
  @ApiModelProperty(value = "For equity ETFs that aim to provide targeted exposure to a sub-industry, this field identifies the sub-industry that it provides the exposure to")
  public String getSubIndustry() {
    return subIndustry;
  }

  public void setSubIndustry(String subIndustry) {
    this.subIndustry = subIndustry;
  }

  public ETF crossSectorTheme(String crossSectorTheme) {
    this.crossSectorTheme = crossSectorTheme;
    return this;
  }

   /**
   * For equity ETFs that aim to provide targeted exposure to a specific investment theme that cuts across GICS sectors, this field identifies the specific cross-sector theme.  Examples (&#39;Agri-business&#39;, &#39;Natural Resources&#39;, &#39;Green Investing&#39;, etc.)
   * @return crossSectorTheme
  **/
  @ApiModelProperty(value = "For equity ETFs that aim to provide targeted exposure to a specific investment theme that cuts across GICS sectors, this field identifies the specific cross-sector theme.  Examples ('Agri-business', 'Natural Resources', 'Green Investing', etc.)")
  public String getCrossSectorTheme() {
    return crossSectorTheme;
  }

  public void setCrossSectorTheme(String crossSectorTheme) {
    this.crossSectorTheme = crossSectorTheme;
  }

  public ETF naturalResourcesType(String naturalResourcesType) {
    this.naturalResourcesType = naturalResourcesType;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Natural Resources&#39; in the &#39;cross_sector_theme&#39; field, this field provides further detail on the type of Natural Resources exposure.
   * @return naturalResourcesType
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Natural Resources' in the 'cross_sector_theme' field, this field provides further detail on the type of Natural Resources exposure.")
  public String getNaturalResourcesType() {
    return naturalResourcesType;
  }

  public void setNaturalResourcesType(String naturalResourcesType) {
    this.naturalResourcesType = naturalResourcesType;
  }

  public ETF excludesFinancials(Boolean excludesFinancials) {
    this.excludesFinancials = excludesFinancials;
    return this;
  }

   /**
   * For equity ETFs, identifies those ETFs where the underlying fund holdings will not hold financials stocks, based on the funds intended objective
   * @return excludesFinancials
  **/
  @ApiModelProperty(value = "For equity ETFs, identifies those ETFs where the underlying fund holdings will not hold financials stocks, based on the funds intended objective")
  public Boolean isExcludesFinancials() {
    return excludesFinancials;
  }

  public void setExcludesFinancials(Boolean excludesFinancials) {
    this.excludesFinancials = excludesFinancials;
  }

  public ETF excludesTechnology(Boolean excludesTechnology) {
    this.excludesTechnology = excludesTechnology;
    return this;
  }

   /**
   * For equity ETFs, identifies those ETFs where the underlying fund holdings will not hold technology stocks, based on the funds intended objective
   * @return excludesTechnology
  **/
  @ApiModelProperty(value = "For equity ETFs, identifies those ETFs where the underlying fund holdings will not hold technology stocks, based on the funds intended objective")
  public Boolean isExcludesTechnology() {
    return excludesTechnology;
  }

  public void setExcludesTechnology(Boolean excludesTechnology) {
    this.excludesTechnology = excludesTechnology;
  }

  public ETF usOrExcludesUs(String usOrExcludesUs) {
    this.usOrExcludesUs = usOrExcludesUs;
    return this;
  }

   /**
   * Takes the value of &#39;Domestic&#39; for US exposure, &#39;International&#39; for non-US exposure and &#39;Global&#39; for exposure that includes all regions including the US
   * @return usOrExcludesUs
  **/
  @ApiModelProperty(value = "Takes the value of 'Domestic' for US exposure, 'International' for non-US exposure and 'Global' for exposure that includes all regions including the US")
  public String getUsOrExcludesUs() {
    return usOrExcludesUs;
  }

  public void setUsOrExcludesUs(String usOrExcludesUs) {
    this.usOrExcludesUs = usOrExcludesUs;
  }

  public ETF developedEmerging(String developedEmerging) {
    this.developedEmerging = developedEmerging;
    return this;
  }

   /**
   * This field identifies the stage of development of the markets that the ETF provides exposure to
   * @return developedEmerging
  **/
  @ApiModelProperty(value = "This field identifies the stage of development of the markets that the ETF provides exposure to")
  public String getDevelopedEmerging() {
    return developedEmerging;
  }

  public void setDevelopedEmerging(String developedEmerging) {
    this.developedEmerging = developedEmerging;
  }

  public ETF specializedRegion(String specializedRegion) {
    this.specializedRegion = specializedRegion;
    return this;
  }

   /**
   * This field is populated if the ETF provides targeted exposure to a specific type of geography-based grouping that does not fall into a specific country or continent grouping.  Examples (&#39;BRIC&#39;, &#39;Chindia&#39;, etc.)
   * @return specializedRegion
  **/
  @ApiModelProperty(value = "This field is populated if the ETF provides targeted exposure to a specific type of geography-based grouping that does not fall into a specific country or continent grouping.  Examples ('BRIC', 'Chindia', etc.)")
  public String getSpecializedRegion() {
    return specializedRegion;
  }

  public void setSpecializedRegion(String specializedRegion) {
    this.specializedRegion = specializedRegion;
  }

  public ETF continent(String continent) {
    this.continent = continent;
    return this;
  }

   /**
   * This field is populated if the ETF provides targeted exposure to a specific continent or country within that Continent
   * @return continent
  **/
  @ApiModelProperty(value = "This field is populated if the ETF provides targeted exposure to a specific continent or country within that Continent")
  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public ETF latinAmericaSubGroup(String latinAmericaSubGroup) {
    this.latinAmericaSubGroup = latinAmericaSubGroup;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Latin America&#39; in the &#39;continent&#39; field, this field provides further detail on the type of regional exposure
   * @return latinAmericaSubGroup
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Latin America' in the 'continent' field, this field provides further detail on the type of regional exposure")
  public String getLatinAmericaSubGroup() {
    return latinAmericaSubGroup;
  }

  public void setLatinAmericaSubGroup(String latinAmericaSubGroup) {
    this.latinAmericaSubGroup = latinAmericaSubGroup;
  }

  public ETF europeSubGroup(String europeSubGroup) {
    this.europeSubGroup = europeSubGroup;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Europe&#39; in the &#39;continent&#39; field, this field provides further detail on the type of regional exposure
   * @return europeSubGroup
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Europe' in the 'continent' field, this field provides further detail on the type of regional exposure")
  public String getEuropeSubGroup() {
    return europeSubGroup;
  }

  public void setEuropeSubGroup(String europeSubGroup) {
    this.europeSubGroup = europeSubGroup;
  }

  public ETF asiaSubGroup(String asiaSubGroup) {
    this.asiaSubGroup = asiaSubGroup;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;Asia&#39; in the &#39;continent&#39; field, this field provides further detail on the type of regional exposure
   * @return asiaSubGroup
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'Asia' in the 'continent' field, this field provides further detail on the type of regional exposure")
  public String getAsiaSubGroup() {
    return asiaSubGroup;
  }

  public void setAsiaSubGroup(String asiaSubGroup) {
    this.asiaSubGroup = asiaSubGroup;
  }

  public ETF specificCountry(String specificCountry) {
    this.specificCountry = specificCountry;
    return this;
  }

   /**
   * This field is populated if the ETF provides targeted exposure to a specific country
   * @return specificCountry
  **/
  @ApiModelProperty(value = "This field is populated if the ETF provides targeted exposure to a specific country")
  public String getSpecificCountry() {
    return specificCountry;
  }

  public void setSpecificCountry(String specificCountry) {
    this.specificCountry = specificCountry;
  }

  public ETF chinaListingLocation(String chinaListingLocation) {
    this.chinaListingLocation = chinaListingLocation;
    return this;
  }

   /**
   * For ETFs that are classified as &#39;China&#39; in the &#39;country&#39; field, this field provides further detail on the type of exposure in the underlying securities
   * @return chinaListingLocation
  **/
  @ApiModelProperty(value = "For ETFs that are classified as 'China' in the 'country' field, this field provides further detail on the type of exposure in the underlying securities")
  public String getChinaListingLocation() {
    return chinaListingLocation;
  }

  public void setChinaListingLocation(String chinaListingLocation) {
    this.chinaListingLocation = chinaListingLocation;
  }

  public ETF usState(String usState) {
    this.usState = usState;
    return this;
  }

   /**
   * Takes the value of a US state if the ETF provides targeted exposure to the municipal bonds or equities of companies operating in a specific state in the US
   * @return usState
  **/
  @ApiModelProperty(value = "Takes the value of a US state if the ETF provides targeted exposure to the municipal bonds or equities of companies operating in a specific state in the US")
  public String getUsState() {
    return usState;
  }

  public void setUsState(String usState) {
    this.usState = usState;
  }

  public ETF realEstate(String realEstate) {
    this.realEstate = realEstate;
    return this;
  }

   /**
   * For ETFs that provide targeted real estate exposure, this field is populated if the ETF provides targeted exposure to a specific segment of the real estate market
   * @return realEstate
  **/
  @ApiModelProperty(value = "For ETFs that provide targeted real estate exposure, this field is populated if the ETF provides targeted exposure to a specific segment of the real estate market")
  public String getRealEstate() {
    return realEstate;
  }

  public void setRealEstate(String realEstate) {
    this.realEstate = realEstate;
  }

  public ETF indexWeightingScheme(String indexWeightingScheme) {
    this.indexWeightingScheme = indexWeightingScheme;
    return this;
  }

   /**
   * For ETFs that track an underlying index, this field provides detail on the index weighting type
   * @return indexWeightingScheme
  **/
  @ApiModelProperty(value = "For ETFs that track an underlying index, this field provides detail on the index weighting type")
  public String getIndexWeightingScheme() {
    return indexWeightingScheme;
  }

  public void setIndexWeightingScheme(String indexWeightingScheme) {
    this.indexWeightingScheme = indexWeightingScheme;
  }

  public ETF marketCapWeightingType(String marketCapWeightingType) {
    this.marketCapWeightingType = marketCapWeightingType;
    return this;
  }

   /**
   * For ETFs that take the value &#39;Market Cap Weighted&#39; in the &#39;index_weighting_scheme&#39; field, this field provides detail on the market cap weighting type
   * @return marketCapWeightingType
  **/
  @ApiModelProperty(value = "For ETFs that take the value 'Market Cap Weighted' in the 'index_weighting_scheme' field, this field provides detail on the market cap weighting type")
  public String getMarketCapWeightingType() {
    return marketCapWeightingType;
  }

  public void setMarketCapWeightingType(String marketCapWeightingType) {
    this.marketCapWeightingType = marketCapWeightingType;
  }

  public ETF fundamentalWeightingType(String fundamentalWeightingType) {
    this.fundamentalWeightingType = fundamentalWeightingType;
    return this;
  }

   /**
   * For ETFs that take the value ‘Fundamental Weighted’ in the &#39;index_weighting_scheme&#39; field, this field provides detail on the fundamental weighting methodology
   * @return fundamentalWeightingType
  **/
  @ApiModelProperty(value = "For ETFs that take the value ‘Fundamental Weighted’ in the 'index_weighting_scheme' field, this field provides detail on the fundamental weighting methodology")
  public String getFundamentalWeightingType() {
    return fundamentalWeightingType;
  }

  public void setFundamentalWeightingType(String fundamentalWeightingType) {
    this.fundamentalWeightingType = fundamentalWeightingType;
  }

  public ETF dividendWeightingType(String dividendWeightingType) {
    this.dividendWeightingType = dividendWeightingType;
    return this;
  }

   /**
   * For ETFs that take the value &#39;Dividend Weighted&#39; in the &#39;index_weighting_scheme&#39; field, this field provides detail on the dividend weighting methodology
   * @return dividendWeightingType
  **/
  @ApiModelProperty(value = "For ETFs that take the value 'Dividend Weighted' in the 'index_weighting_scheme' field, this field provides detail on the dividend weighting methodology")
  public String getDividendWeightingType() {
    return dividendWeightingType;
  }

  public void setDividendWeightingType(String dividendWeightingType) {
    this.dividendWeightingType = dividendWeightingType;
  }

  public ETF bondType(String bondType) {
    this.bondType = bondType;
    return this;
  }

   /**
   * For ETFs where &#39;asset_class_type&#39; is &#39;Bonds&#39;, this field provides detail on the type of bonds held in the ETF
   * @return bondType
  **/
  @ApiModelProperty(value = "For ETFs where 'asset_class_type' is 'Bonds', this field provides detail on the type of bonds held in the ETF")
  public String getBondType() {
    return bondType;
  }

  public void setBondType(String bondType) {
    this.bondType = bondType;
  }

  public ETF governmentBondTypes(String governmentBondTypes) {
    this.governmentBondTypes = governmentBondTypes;
    return this;
  }

   /**
   * For bond ETFs that take the value &#39;Treasury &amp; Government&#39; in &#39;bond_type&#39;, this field provides detail on the exposure
   * @return governmentBondTypes
  **/
  @ApiModelProperty(value = "For bond ETFs that take the value 'Treasury & Government' in 'bond_type', this field provides detail on the exposure")
  public String getGovernmentBondTypes() {
    return governmentBondTypes;
  }

  public void setGovernmentBondTypes(String governmentBondTypes) {
    this.governmentBondTypes = governmentBondTypes;
  }

  public ETF municipalBondRegion(String municipalBondRegion) {
    this.municipalBondRegion = municipalBondRegion;
    return this;
  }

   /**
   * For bond ETFs that take the value &#39;Municipal&#39; in &#39;bond_type&#39;, this field provides additional detail on the geographic exposure
   * @return municipalBondRegion
  **/
  @ApiModelProperty(value = "For bond ETFs that take the value 'Municipal' in 'bond_type', this field provides additional detail on the geographic exposure")
  public String getMunicipalBondRegion() {
    return municipalBondRegion;
  }

  public void setMunicipalBondRegion(String municipalBondRegion) {
    this.municipalBondRegion = municipalBondRegion;
  }

  public ETF municipalVrdo(Boolean municipalVrdo) {
    this.municipalVrdo = municipalVrdo;
    return this;
  }

   /**
   * For bond ETFs that take the value &#39;Municipal&#39; in &#39;bond_type&#39;, this field identifies those ETFs that specifically provide exposure to Variable Rate Demand Obligations
   * @return municipalVrdo
  **/
  @ApiModelProperty(value = "For bond ETFs that take the value 'Municipal' in 'bond_type', this field identifies those ETFs that specifically provide exposure to Variable Rate Demand Obligations")
  public Boolean isMunicipalVrdo() {
    return municipalVrdo;
  }

  public void setMunicipalVrdo(Boolean municipalVrdo) {
    this.municipalVrdo = municipalVrdo;
  }

  public ETF mortgageBondTypes(String mortgageBondTypes) {
    this.mortgageBondTypes = mortgageBondTypes;
    return this;
  }

   /**
   * For bond ETFs that take the value &#39;Mortgage&#39; in &#39;bond_type&#39;, this field provides additional detail on the type of underlying securities
   * @return mortgageBondTypes
  **/
  @ApiModelProperty(value = "For bond ETFs that take the value 'Mortgage' in 'bond_type', this field provides additional detail on the type of underlying securities")
  public String getMortgageBondTypes() {
    return mortgageBondTypes;
  }

  public void setMortgageBondTypes(String mortgageBondTypes) {
    this.mortgageBondTypes = mortgageBondTypes;
  }

  public ETF bondTaxStatus(String bondTaxStatus) {
    this.bondTaxStatus = bondTaxStatus;
    return this;
  }

   /**
   * For all US bond ETFs, this field provides additional detail on the tax treatment of the underlying securities
   * @return bondTaxStatus
  **/
  @ApiModelProperty(value = "For all US bond ETFs, this field provides additional detail on the tax treatment of the underlying securities")
  public String getBondTaxStatus() {
    return bondTaxStatus;
  }

  public void setBondTaxStatus(String bondTaxStatus) {
    this.bondTaxStatus = bondTaxStatus;
  }

  public ETF creditQuality(String creditQuality) {
    this.creditQuality = creditQuality;
    return this;
  }

   /**
   * For all bond ETFs, this field helps to identify if the ETF provides targeted exposure to securities of a specific credit quality range
   * @return creditQuality
  **/
  @ApiModelProperty(value = "For all bond ETFs, this field helps to identify if the ETF provides targeted exposure to securities of a specific credit quality range")
  public String getCreditQuality() {
    return creditQuality;
  }

  public void setCreditQuality(String creditQuality) {
    this.creditQuality = creditQuality;
  }

  public ETF averageMaturity(String averageMaturity) {
    this.averageMaturity = averageMaturity;
    return this;
  }

   /**
   * For all bond ETFs, this field helps to identify if the ETF provides targeted exposure to securities of a specific maturity range
   * @return averageMaturity
  **/
  @ApiModelProperty(value = "For all bond ETFs, this field helps to identify if the ETF provides targeted exposure to securities of a specific maturity range")
  public String getAverageMaturity() {
    return averageMaturity;
  }

  public void setAverageMaturity(String averageMaturity) {
    this.averageMaturity = averageMaturity;
  }

  public ETF specificMaturityYear(Integer specificMaturityYear) {
    this.specificMaturityYear = specificMaturityYear;
    return this;
  }

   /**
   * For all bond ETFs that take the value &#39;Specific Maturity Year&#39; in the &#39;average_maturity&#39; field, this field specifies the calendar year
   * @return specificMaturityYear
  **/
  @ApiModelProperty(value = "For all bond ETFs that take the value 'Specific Maturity Year' in the 'average_maturity' field, this field specifies the calendar year")
  public Integer getSpecificMaturityYear() {
    return specificMaturityYear;
  }

  public void setSpecificMaturityYear(Integer specificMaturityYear) {
    this.specificMaturityYear = specificMaturityYear;
  }

  public ETF bondCurrencyDenomination(String bondCurrencyDenomination) {
    this.bondCurrencyDenomination = bondCurrencyDenomination;
    return this;
  }

   /**
   * For all bond ETFs, this field provides additional detail on the currency denomination of the underlying securities
   * @return bondCurrencyDenomination
  **/
  @ApiModelProperty(value = "For all bond ETFs, this field provides additional detail on the currency denomination of the underlying securities")
  public String getBondCurrencyDenomination() {
    return bondCurrencyDenomination;
  }

  public void setBondCurrencyDenomination(String bondCurrencyDenomination) {
    this.bondCurrencyDenomination = bondCurrencyDenomination;
  }

  public ETF laddered(Boolean laddered) {
    this.laddered = laddered;
    return this;
  }

   /**
   * For bond ETFs, this field identifies those ETFs that specifically hold bonds in a laddered structure, where the bonds are scheduled to mature in an annual, sequential structure
   * @return laddered
  **/
  @ApiModelProperty(value = "For bond ETFs, this field identifies those ETFs that specifically hold bonds in a laddered structure, where the bonds are scheduled to mature in an annual, sequential structure")
  public Boolean isLaddered() {
    return laddered;
  }

  public void setLaddered(Boolean laddered) {
    this.laddered = laddered;
  }

  public ETF zeroCoupon(Boolean zeroCoupon) {
    this.zeroCoupon = zeroCoupon;
    return this;
  }

   /**
   * For bond ETFs, this field identifies those ETFs that specifically hold zero coupon Treasury Bills
   * @return zeroCoupon
  **/
  @ApiModelProperty(value = "For bond ETFs, this field identifies those ETFs that specifically hold zero coupon Treasury Bills")
  public Boolean isZeroCoupon() {
    return zeroCoupon;
  }

  public void setZeroCoupon(Boolean zeroCoupon) {
    this.zeroCoupon = zeroCoupon;
  }

  public ETF floatingRate(Boolean floatingRate) {
    this.floatingRate = floatingRate;
    return this;
  }

   /**
   * For bond ETFs, this field identifies those ETFs that specifically hold floating rate bonds
   * @return floatingRate
  **/
  @ApiModelProperty(value = "For bond ETFs, this field identifies those ETFs that specifically hold floating rate bonds")
  public Boolean isFloatingRate() {
    return floatingRate;
  }

  public void setFloatingRate(Boolean floatingRate) {
    this.floatingRate = floatingRate;
  }

  public ETF buildAmericaBonds(Boolean buildAmericaBonds) {
    this.buildAmericaBonds = buildAmericaBonds;
    return this;
  }

   /**
   * For municipal bond ETFs, this field identifies those ETFs that specifically hold Build America Bonds
   * @return buildAmericaBonds
  **/
  @ApiModelProperty(value = "For municipal bond ETFs, this field identifies those ETFs that specifically hold Build America Bonds")
  public Boolean isBuildAmericaBonds() {
    return buildAmericaBonds;
  }

  public void setBuildAmericaBonds(Boolean buildAmericaBonds) {
    this.buildAmericaBonds = buildAmericaBonds;
  }

  public ETF commodityTypes(String commodityTypes) {
    this.commodityTypes = commodityTypes;
    return this;
  }

   /**
   * For ETFs where &#39;asset_class_type&#39; is &#39;Commodities&#39;, this field provides detail on the type of commodities held in the ETF
   * @return commodityTypes
  **/
  @ApiModelProperty(value = "For ETFs where 'asset_class_type' is 'Commodities', this field provides detail on the type of commodities held in the ETF")
  public String getCommodityTypes() {
    return commodityTypes;
  }

  public void setCommodityTypes(String commodityTypes) {
    this.commodityTypes = commodityTypes;
  }

  public ETF energyType(String energyType) {
    this.energyType = energyType;
    return this;
  }

   /**
   * For ETFs where &#39;commodity_type&#39; is &#39;Energy&#39;, this field provides detail on the type of energy exposure provided by the ETF
   * @return energyType
  **/
  @ApiModelProperty(value = "For ETFs where 'commodity_type' is 'Energy', this field provides detail on the type of energy exposure provided by the ETF")
  public String getEnergyType() {
    return energyType;
  }

  public void setEnergyType(String energyType) {
    this.energyType = energyType;
  }

  public ETF agriculturalType(String agriculturalType) {
    this.agriculturalType = agriculturalType;
    return this;
  }

   /**
   * For ETFs where &#39;commodity_type&#39; is &#39;Agricultural&#39;, this field provides detail on the type of agricultural exposure provided by the ETF
   * @return agriculturalType
  **/
  @ApiModelProperty(value = "For ETFs where 'commodity_type' is 'Agricultural', this field provides detail on the type of agricultural exposure provided by the ETF")
  public String getAgriculturalType() {
    return agriculturalType;
  }

  public void setAgriculturalType(String agriculturalType) {
    this.agriculturalType = agriculturalType;
  }

  public ETF metalType(String metalType) {
    this.metalType = metalType;
    return this;
  }

   /**
   * For ETFs where &#39;commodity_type&#39; is &#39;Gold &amp; Metals&#39;, this field provides detail on the type of exposure provided by the ETF
   * @return metalType
  **/
  @ApiModelProperty(value = "For ETFs where 'commodity_type' is 'Gold & Metals', this field provides detail on the type of exposure provided by the ETF")
  public String getMetalType() {
    return metalType;
  }

  public void setMetalType(String metalType) {
    this.metalType = metalType;
  }

  public ETF inverseLeveraged(String inverseLeveraged) {
    this.inverseLeveraged = inverseLeveraged;
    return this;
  }

   /**
   * This field is populated if the ETF provides inverse or leveraged exposure
   * @return inverseLeveraged
  **/
  @ApiModelProperty(value = "This field is populated if the ETF provides inverse or leveraged exposure")
  public String getInverseLeveraged() {
    return inverseLeveraged;
  }

  public void setInverseLeveraged(String inverseLeveraged) {
    this.inverseLeveraged = inverseLeveraged;
  }

  public ETF targetDateMultiAssetType(String targetDateMultiAssetType) {
    this.targetDateMultiAssetType = targetDateMultiAssetType;
    return this;
  }

   /**
   * For ETFs where &#39;asset_class_type&#39; is &#39;Target Date / MultiAsset&#39;, this field provides detail on the type of commodities held in the ETF
   * @return targetDateMultiAssetType
  **/
  @ApiModelProperty(value = "For ETFs where 'asset_class_type' is 'Target Date / MultiAsset', this field provides detail on the type of commodities held in the ETF")
  public String getTargetDateMultiAssetType() {
    return targetDateMultiAssetType;
  }

  public void setTargetDateMultiAssetType(String targetDateMultiAssetType) {
    this.targetDateMultiAssetType = targetDateMultiAssetType;
  }

  public ETF currencyHedged(Boolean currencyHedged) {
    this.currencyHedged = currencyHedged;
    return this;
  }

   /**
   * This field is populated if the ETF’s strategy involves hedging currency exposure
   * @return currencyHedged
  **/
  @ApiModelProperty(value = "This field is populated if the ETF’s strategy involves hedging currency exposure")
  public Boolean isCurrencyHedged() {
    return currencyHedged;
  }

  public void setCurrencyHedged(Boolean currencyHedged) {
    this.currencyHedged = currencyHedged;
  }

  public ETF currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * This field is populated if the ETF’s strategy involves providing exposure to the movements of a currency or involves hedging currency exposure
   * @return currencyPair
  **/
  @ApiModelProperty(value = "This field is populated if the ETF’s strategy involves providing exposure to the movements of a currency or involves hedging currency exposure")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public ETF socialEnvironmentalType(String socialEnvironmentalType) {
    this.socialEnvironmentalType = socialEnvironmentalType;
    return this;
  }

   /**
   * This field is populated if the ETF’s strategy involves providing exposure to a specific social or environmental theme
   * @return socialEnvironmentalType
  **/
  @ApiModelProperty(value = "This field is populated if the ETF’s strategy involves providing exposure to a specific social or environmental theme")
  public String getSocialEnvironmentalType() {
    return socialEnvironmentalType;
  }

  public void setSocialEnvironmentalType(String socialEnvironmentalType) {
    this.socialEnvironmentalType = socialEnvironmentalType;
  }

  public ETF cleanEnergyType(String cleanEnergyType) {
    this.cleanEnergyType = cleanEnergyType;
    return this;
  }

   /**
   * This field is populated if the ETF has a value of &#39;Clean Energy&#39; in the &#39;social_environmental_type&#39; field.
   * @return cleanEnergyType
  **/
  @ApiModelProperty(value = "This field is populated if the ETF has a value of 'Clean Energy' in the 'social_environmental_type' field.")
  public String getCleanEnergyType() {
    return cleanEnergyType;
  }

  public void setCleanEnergyType(String cleanEnergyType) {
    this.cleanEnergyType = cleanEnergyType;
  }

  public ETF dividendType(String dividendType) {
    this.dividendType = dividendType;
    return this;
  }

   /**
   * This field is populated if the ETF has an intended investment objective of holding dividend-oriented stocks as stated in the prospectus
   * @return dividendType
  **/
  @ApiModelProperty(value = "This field is populated if the ETF has an intended investment objective of holding dividend-oriented stocks as stated in the prospectus")
  public String getDividendType() {
    return dividendType;
  }

  public void setDividendType(String dividendType) {
    this.dividendType = dividendType;
  }

  public ETF regularDividendPayorType(String regularDividendPayorType) {
    this.regularDividendPayorType = regularDividendPayorType;
    return this;
  }

   /**
   * This field is populated if the ETF has a value of &#39;Dividend – Regular Payors&#39; in the &#39;dividend_type&#39; field
   * @return regularDividendPayorType
  **/
  @ApiModelProperty(value = "This field is populated if the ETF has a value of 'Dividend – Regular Payors' in the 'dividend_type' field")
  public String getRegularDividendPayorType() {
    return regularDividendPayorType;
  }

  public void setRegularDividendPayorType(String regularDividendPayorType) {
    this.regularDividendPayorType = regularDividendPayorType;
  }

  public ETF holdsMlPs(Boolean holdsMlPs) {
    this.holdsMlPs = holdsMlPs;
    return this;
  }

   /**
   * If true, the ETF’s investment objective explicitly specifies that it holds MLPs as an intended part of its investment strategy
   * @return holdsMlPs
  **/
  @ApiModelProperty(value = "If true, the ETF’s investment objective explicitly specifies that it holds MLPs as an intended part of its investment strategy")
  public Boolean isHoldsMlPs() {
    return holdsMlPs;
  }

  public void setHoldsMlPs(Boolean holdsMlPs) {
    this.holdsMlPs = holdsMlPs;
  }

  public ETF holdsPreferredStock(Boolean holdsPreferredStock) {
    this.holdsPreferredStock = holdsPreferredStock;
    return this;
  }

   /**
   * If true, the ETF’s investment objective explicitly specifies that it holds preferred stock as an intended part of its investment strategy
   * @return holdsPreferredStock
  **/
  @ApiModelProperty(value = "If true, the ETF’s investment objective explicitly specifies that it holds preferred stock as an intended part of its investment strategy")
  public Boolean isHoldsPreferredStock() {
    return holdsPreferredStock;
  }

  public void setHoldsPreferredStock(Boolean holdsPreferredStock) {
    this.holdsPreferredStock = holdsPreferredStock;
  }

  public ETF holdsClosedEndFunds(Boolean holdsClosedEndFunds) {
    this.holdsClosedEndFunds = holdsClosedEndFunds;
    return this;
  }

   /**
   * IF true, if the ETF’s investment objective explicitly specifies that it holds closed end funds as an intended part of its investment strategy
   * @return holdsClosedEndFunds
  **/
  @ApiModelProperty(value = "IF true, if the ETF’s investment objective explicitly specifies that it holds closed end funds as an intended part of its investment strategy")
  public Boolean isHoldsClosedEndFunds() {
    return holdsClosedEndFunds;
  }

  public void setHoldsClosedEndFunds(Boolean holdsClosedEndFunds) {
    this.holdsClosedEndFunds = holdsClosedEndFunds;
  }

  public ETF quantStrategiesType(String quantStrategiesType) {
    this.quantStrategiesType = quantStrategiesType;
    return this;
  }

   /**
   * This field is populated if the ETF has either an index-linked or active strategy that is based on a proprietary quantitative strategy
   * @return quantStrategiesType
  **/
  @ApiModelProperty(value = "This field is populated if the ETF has either an index-linked or active strategy that is based on a proprietary quantitative strategy")
  public String getQuantStrategiesType() {
    return quantStrategiesType;
  }

  public void setQuantStrategiesType(String quantStrategiesType) {
    this.quantStrategiesType = quantStrategiesType;
  }

  public ETF otherQuantModels(String otherQuantModels) {
    this.otherQuantModels = otherQuantModels;
    return this;
  }

   /**
   * For ETFs where &#39;quant_strategies_type&#39; is &#39;Other Quant Model&#39;, this field provides the name of the specific proprietary quant model used as the underlying strategy for the ETF
   * @return otherQuantModels
  **/
  @ApiModelProperty(value = "For ETFs where 'quant_strategies_type' is 'Other Quant Model', this field provides the name of the specific proprietary quant model used as the underlying strategy for the ETF")
  public String getOtherQuantModels() {
    return otherQuantModels;
  }

  public void setOtherQuantModels(String otherQuantModels) {
    this.otherQuantModels = otherQuantModels;
  }

  public ETF hedgeFundType(String hedgeFundType) {
    this.hedgeFundType = hedgeFundType;
    return this;
  }

   /**
   * For ETFs where &#39;other_asset_types&#39; is &#39;Hedge Fund Replication&#39;, this field provides detail on the type of hedge fund replication strategy
   * @return hedgeFundType
  **/
  @ApiModelProperty(value = "For ETFs where 'other_asset_types' is 'Hedge Fund Replication', this field provides detail on the type of hedge fund replication strategy")
  public String getHedgeFundType() {
    return hedgeFundType;
  }

  public void setHedgeFundType(String hedgeFundType) {
    this.hedgeFundType = hedgeFundType;
  }

  public ETF derivativesBased(String derivativesBased) {
    this.derivativesBased = derivativesBased;
    return this;
  }

   /**
   * This field is populated if the ETF holds either listed or over-the-counter derivatives in its portfolio
   * @return derivativesBased
  **/
  @ApiModelProperty(value = "This field is populated if the ETF holds either listed or over-the-counter derivatives in its portfolio")
  public String getDerivativesBased() {
    return derivativesBased;
  }

  public void setDerivativesBased(String derivativesBased) {
    this.derivativesBased = derivativesBased;
  }

  public ETF holdsAdRs(Boolean holdsAdRs) {
    this.holdsAdRs = holdsAdRs;
    return this;
  }

   /**
   * If true, he ETF’s investment objective explicitly specifies that it holds American Depositary Receipts (ADRs) as an intended part of its investment strategy
   * @return holdsAdRs
  **/
  @ApiModelProperty(value = "If true, he ETF’s investment objective explicitly specifies that it holds American Depositary Receipts (ADRs) as an intended part of its investment strategy")
  public Boolean isHoldsAdRs() {
    return holdsAdRs;
  }

  public void setHoldsAdRs(Boolean holdsAdRs) {
    this.holdsAdRs = holdsAdRs;
  }

  public ETF indexLinked(String indexLinked) {
    this.indexLinked = indexLinked;
    return this;
  }

   /**
   * This field identifies whether an ETF is index linked or active
   * @return indexLinked
  **/
  @ApiModelProperty(value = "This field identifies whether an ETF is index linked or active")
  public String getIndexLinked() {
    return indexLinked;
  }

  public void setIndexLinked(String indexLinked) {
    this.indexLinked = indexLinked;
  }

  public ETF includesShortExposure(Boolean includesShortExposure) {
    this.includesShortExposure = includesShortExposure;
    return this;
  }

   /**
   * This field is populated if the ETF has short exposure in any of its holdings e.g. in a long/short or inverse ETF
   * @return includesShortExposure
  **/
  @ApiModelProperty(value = "This field is populated if the ETF has short exposure in any of its holdings e.g. in a long/short or inverse ETF")
  public Boolean isIncludesShortExposure() {
    return includesShortExposure;
  }

  public void setIncludesShortExposure(Boolean includesShortExposure) {
    this.includesShortExposure = includesShortExposure;
  }

  public ETF indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

   /**
   * This field identifies the name of the underlying index tracked by the ETF, if applicable
   * @return indexName
  **/
  @ApiModelProperty(value = "This field identifies the name of the underlying index tracked by the ETF, if applicable")
  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public ETF parentIndex(String parentIndex) {
    this.parentIndex = parentIndex;
    return this;
  }

   /**
   * This field identifies the name of the parent index, which represents the broader universe from which the index underlying the ETF is created, if applicable
   * @return parentIndex
  **/
  @ApiModelProperty(value = "This field identifies the name of the parent index, which represents the broader universe from which the index underlying the ETF is created, if applicable")
  public String getParentIndex() {
    return parentIndex;
  }

  public void setParentIndex(String parentIndex) {
    this.parentIndex = parentIndex;
  }

  public ETF indexFamily(String indexFamily) {
    this.indexFamily = indexFamily;
    return this;
  }

   /**
   * This field identifies the index family to which the index underlying the ETF belongs. The index family is represented as categorized by the index provider
   * @return indexFamily
  **/
  @ApiModelProperty(value = "This field identifies the index family to which the index underlying the ETF belongs. The index family is represented as categorized by the index provider")
  public String getIndexFamily() {
    return indexFamily;
  }

  public void setIndexFamily(String indexFamily) {
    this.indexFamily = indexFamily;
  }

  public ETF broaderIndexFamily(String broaderIndexFamily) {
    this.broaderIndexFamily = broaderIndexFamily;
    return this;
  }

   /**
   * This field identifies the broader index family to which the index underlying the ETF belongs. The broader index family is represented as categorized by the index provider
   * @return broaderIndexFamily
  **/
  @ApiModelProperty(value = "This field identifies the broader index family to which the index underlying the ETF belongs. The broader index family is represented as categorized by the index provider")
  public String getBroaderIndexFamily() {
    return broaderIndexFamily;
  }

  public void setBroaderIndexFamily(String broaderIndexFamily) {
    this.broaderIndexFamily = broaderIndexFamily;
  }

  public ETF indexProvider(String indexProvider) {
    this.indexProvider = indexProvider;
    return this;
  }

   /**
   * This field identifies the Index provider for the index underlying the ETF, if applicable
   * @return indexProvider
  **/
  @ApiModelProperty(value = "This field identifies the Index provider for the index underlying the ETF, if applicable")
  public String getIndexProvider() {
    return indexProvider;
  }

  public void setIndexProvider(String indexProvider) {
    this.indexProvider = indexProvider;
  }

  public ETF fundFamily(String fundFamily) {
    this.fundFamily = fundFamily;
    return this;
  }

   /**
   * This field identifies the fund family to which the ETF belongs, as categorized by the ETF Sponsor
   * @return fundFamily
  **/
  @ApiModelProperty(value = "This field identifies the fund family to which the ETF belongs, as categorized by the ETF Sponsor")
  public String getFundFamily() {
    return fundFamily;
  }

  public void setFundFamily(String fundFamily) {
    this.fundFamily = fundFamily;
  }

  public ETF indexTicker(String indexTicker) {
    this.indexTicker = indexTicker;
    return this;
  }

   /**
   * This field identifies the OpenFIGI ticker for the Index underlying the ETF
   * @return indexTicker
  **/
  @ApiModelProperty(value = "This field identifies the OpenFIGI ticker for the Index underlying the ETF")
  public String getIndexTicker() {
    return indexTicker;
  }

  public void setIndexTicker(String indexTicker) {
    this.indexTicker = indexTicker;
  }

  public ETF etnIssuingBank(String etnIssuingBank) {
    this.etnIssuingBank = etnIssuingBank;
    return this;
  }

   /**
   * If the product is an Exchange Traded Note (ETN), this field identifies the issuing bank
   * @return etnIssuingBank
  **/
  @ApiModelProperty(value = "If the product is an Exchange Traded Note (ETN), this field identifies the issuing bank")
  public String getEtnIssuingBank() {
    return etnIssuingBank;
  }

  public void setEtnIssuingBank(String etnIssuingBank) {
    this.etnIssuingBank = etnIssuingBank;
  }

  public ETF etnMaturityDate(LocalDate etnMaturityDate) {
    this.etnMaturityDate = etnMaturityDate;
    return this;
  }

   /**
   * If the product is an ETN, this field identifies the maturity date for the ETN
   * @return etnMaturityDate
  **/
  @ApiModelProperty(value = "If the product is an ETN, this field identifies the maturity date for the ETN")
  public LocalDate getEtnMaturityDate() {
    return etnMaturityDate;
  }

  public void setEtnMaturityDate(LocalDate etnMaturityDate) {
    this.etnMaturityDate = etnMaturityDate;
  }

  public ETF livestock(String livestock) {
    this.livestock = livestock;
    return this;
  }

   /**
   * For ETFs where &#39;commodity_type&#39; is &#39;Livestock&#39;, this field provides detail on the type of livestock exposure provided by the ETF
   * @return livestock
  **/
  @ApiModelProperty(value = "For ETFs where 'commodity_type' is 'Livestock', this field provides detail on the type of livestock exposure provided by the ETF")
  public String getLivestock() {
    return livestock;
  }

  public void setLivestock(String livestock) {
    this.livestock = livestock;
  }

  public ETF dynamicFuturesRoll(Boolean dynamicFuturesRoll) {
    this.dynamicFuturesRoll = dynamicFuturesRoll;
    return this;
  }

   /**
   * If the product holds futures contracts, this field identifies those products where the roll strategy is dynamic (rather than entirely rules based), so as to minimize roll costs
   * @return dynamicFuturesRoll
  **/
  @ApiModelProperty(value = "If the product holds futures contracts, this field identifies those products where the roll strategy is dynamic (rather than entirely rules based), so as to minimize roll costs")
  public Boolean isDynamicFuturesRoll() {
    return dynamicFuturesRoll;
  }

  public void setDynamicFuturesRoll(Boolean dynamicFuturesRoll) {
    this.dynamicFuturesRoll = dynamicFuturesRoll;
  }

  public ETF indexProviderCode(String indexProviderCode) {
    this.indexProviderCode = indexProviderCode;
    return this;
  }

   /**
   * This field provides the First Bridge code for each Index provider, corresponding to the index underlying the ETF if applicable
   * @return indexProviderCode
  **/
  @ApiModelProperty(value = "This field provides the First Bridge code for each Index provider, corresponding to the index underlying the ETF if applicable")
  public String getIndexProviderCode() {
    return indexProviderCode;
  }

  public void setIndexProviderCode(String indexProviderCode) {
    this.indexProviderCode = indexProviderCode;
  }

  public ETF singleCategoryDesignation(String singleCategoryDesignation) {
    this.singleCategoryDesignation = singleCategoryDesignation;
    return this;
  }

   /**
   * This categorization is created for those users who want every ETF to be ‘forced’ into a single bucket, so that the assets for all categories will always sum to the total market
   * @return singleCategoryDesignation
  **/
  @ApiModelProperty(value = "This categorization is created for those users who want every ETF to be ‘forced’ into a single bucket, so that the assets for all categories will always sum to the total market")
  public String getSingleCategoryDesignation() {
    return singleCategoryDesignation;
  }

  public void setSingleCategoryDesignation(String singleCategoryDesignation) {
    this.singleCategoryDesignation = singleCategoryDesignation;
  }

  public ETF registeredCountries(String registeredCountries) {
    this.registeredCountries = registeredCountries;
    return this;
  }

   /**
   * The list of countries where the ETF is legally registered for sale. This may differ from where the ETF is domiciled or traded, particularly in Europe
   * @return registeredCountries
  **/
  @ApiModelProperty(value = "The list of countries where the ETF is legally registered for sale. This may differ from where the ETF is domiciled or traded, particularly in Europe")
  public String getRegisteredCountries() {
    return registeredCountries;
  }

  public void setRegisteredCountries(String registeredCountries) {
    this.registeredCountries = registeredCountries;
  }

  public ETF issuingEntityCountryCode(String issuingEntityCountryCode) {
    this.issuingEntityCountryCode = issuingEntityCountryCode;
    return this;
  }

   /**
   * The name of the legal entity that issued the Exchange Traded Product (ETP)
   * @return issuingEntityCountryCode
  **/
  @ApiModelProperty(value = "The name of the legal entity that issued the Exchange Traded Product (ETP)")
  public String getIssuingEntityCountryCode() {
    return issuingEntityCountryCode;
  }

  public void setIssuingEntityCountryCode(String issuingEntityCountryCode) {
    this.issuingEntityCountryCode = issuingEntityCountryCode;
  }

  public ETF ucits(Boolean ucits) {
    this.ucits = ucits;
    return this;
  }

   /**
   * If true, the Exchange Traded Product (ETP) is Undertakings for the Collective Investment in Transferable Securities (UCITS) compliant
   * @return ucits
  **/
  @ApiModelProperty(value = "If true, the Exchange Traded Product (ETP) is Undertakings for the Collective Investment in Transferable Securities (UCITS) compliant")
  public Boolean isUcits() {
    return ucits;
  }

  public void setUcits(Boolean ucits) {
    this.ucits = ucits;
  }

  public ETF replicationStructure(String replicationStructure) {
    this.replicationStructure = replicationStructure;
    return this;
  }

   /**
   * The replication structure of the Exchange Traded Product (ETP)
   * @return replicationStructure
  **/
  @ApiModelProperty(value = "The replication structure of the Exchange Traded Product (ETP)")
  public String getReplicationStructure() {
    return replicationStructure;
  }

  public void setReplicationStructure(String replicationStructure) {
    this.replicationStructure = replicationStructure;
  }

  public ETF domicile(String domicile) {
    this.domicile = domicile;
    return this;
  }

   /**
   * 2 letter ISO country code for the country where the ETP is domiciled
   * @return domicile
  **/
  @ApiModelProperty(value = "2 letter ISO country code for the country where the ETP is domiciled")
  public String getDomicile() {
    return domicile;
  }

  public void setDomicile(String domicile) {
    this.domicile = domicile;
  }

  public ETF baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * Base currency of the Exchange Traded Product (ETP) in which the net asset value (NAV) is calculated. Reported using the 3-digit ISO currency code
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "Base currency of the Exchange Traded Product (ETP) in which the net asset value (NAV) is calculated. Reported using the 3-digit ISO currency code")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }

  public ETF listingCurrency(String listingCurrency) {
    this.listingCurrency = listingCurrency;
    return this;
  }

   /**
   * Listing currency of the Exchange Traded Product (ETP) in which it is traded. Reported using the 3-digit ISO currency code
   * @return listingCurrency
  **/
  @ApiModelProperty(value = "Listing currency of the Exchange Traded Product (ETP) in which it is traded. Reported using the 3-digit ISO currency code")
  public String getListingCurrency() {
    return listingCurrency;
  }

  public void setListingCurrency(String listingCurrency) {
    this.listingCurrency = listingCurrency;
  }

  public ETF fundListingDate(LocalDate fundListingDate) {
    this.fundListingDate = fundListingDate;
    return this;
  }

   /**
   * The date on which the Exchange Traded Product (ETP) or share class of the ETP is listed on a specific exchange
   * @return fundListingDate
  **/
  @ApiModelProperty(value = "The date on which the Exchange Traded Product (ETP) or share class of the ETP is listed on a specific exchange")
  public LocalDate getFundListingDate() {
    return fundListingDate;
  }

  public void setFundListingDate(LocalDate fundListingDate) {
    this.fundListingDate = fundListingDate;
  }

  public ETF listingCountryCode(String listingCountryCode) {
    this.listingCountryCode = listingCountryCode;
    return this;
  }

   /**
   * 2 letter ISO country code for the country where the Exchange Traded Product (ETP) is listed
   * @return listingCountryCode
  **/
  @ApiModelProperty(value = "2 letter ISO country code for the country where the Exchange Traded Product (ETP) is listed")
  public String getListingCountryCode() {
    return listingCountryCode;
  }

  public void setListingCountryCode(String listingCountryCode) {
    this.listingCountryCode = listingCountryCode;
  }

  public ETF listingRegion(String listingRegion) {
    this.listingRegion = listingRegion;
    return this;
  }

   /**
   * The region in which this specific ETF is listed
   * @return listingRegion
  **/
  @ApiModelProperty(value = "The region in which this specific ETF is listed")
  public String getListingRegion() {
    return listingRegion;
  }

  public void setListingRegion(String listingRegion) {
    this.listingRegion = listingRegion;
  }

  public ETF smartvsTraditionalBeta(String smartvsTraditionalBeta) {
    this.smartvsTraditionalBeta = smartvsTraditionalBeta;
    return this;
  }

   /**
   * This field identifies whether an ETF provides &#39;Traditional&#39; beta exposure or &#39;Smart&#39; beta exposure. ETFs that are active (i.e. non-indexed), leveraged / inverse or have a proprietary quant model (i.e. that don’t provide indexed exposure to a targeted factor) are classified separately
   * @return smartvsTraditionalBeta
  **/
  @ApiModelProperty(value = "This field identifies whether an ETF provides 'Traditional' beta exposure or 'Smart' beta exposure. ETFs that are active (i.e. non-indexed), leveraged / inverse or have a proprietary quant model (i.e. that don’t provide indexed exposure to a targeted factor) are classified separately")
  public String getSmartvsTraditionalBeta() {
    return smartvsTraditionalBeta;
  }

  public void setSmartvsTraditionalBeta(String smartvsTraditionalBeta) {
    this.smartvsTraditionalBeta = smartvsTraditionalBeta;
  }

  public ETF smartvsTraditionalBetaLevel2(String smartvsTraditionalBetaLevel2) {
    this.smartvsTraditionalBetaLevel2 = smartvsTraditionalBetaLevel2;
    return this;
  }

   /**
   * This field provides further detail within the traditional and smart beta categories
   * @return smartvsTraditionalBetaLevel2
  **/
  @ApiModelProperty(value = "This field provides further detail within the traditional and smart beta categories")
  public String getSmartvsTraditionalBetaLevel2() {
    return smartvsTraditionalBetaLevel2;
  }

  public void setSmartvsTraditionalBetaLevel2(String smartvsTraditionalBetaLevel2) {
    this.smartvsTraditionalBetaLevel2 = smartvsTraditionalBetaLevel2;
  }

  public ETF incomeCategory(String incomeCategory) {
    this.incomeCategory = incomeCategory;
    return this;
  }

   /**
   * Identifies if an Exchange Traded Fund (ETF) falls into a category that is specifically designed to provide a high yield or income
   * @return incomeCategory
  **/
  @ApiModelProperty(value = "Identifies if an Exchange Traded Fund (ETF) falls into a category that is specifically designed to provide a high yield or income")
  public String getIncomeCategory() {
    return incomeCategory;
  }

  public void setIncomeCategory(String incomeCategory) {
    this.incomeCategory = incomeCategory;
  }

  public ETF etpStructureType(String etpStructureType) {
    this.etpStructureType = etpStructureType;
    return this;
  }

   /**
   * Classifies Exchange Traded Products (ETPs) into very broad categories based on its legal structure
   * @return etpStructureType
  **/
  @ApiModelProperty(value = "Classifies Exchange Traded Products (ETPs) into very broad categories based on its legal structure")
  public String getEtpStructureType() {
    return etpStructureType;
  }

  public void setEtpStructureType(String etpStructureType) {
    this.etpStructureType = etpStructureType;
  }

  public ETF monthEndAssets(BigDecimal monthEndAssets) {
    this.monthEndAssets = monthEndAssets;
    return this;
  }

   /**
   * Net assets in millions of dollars as of the most recent month end
   * @return monthEndAssets
  **/
  @ApiModelProperty(value = "Net assets in millions of dollars as of the most recent month end")
  public BigDecimal getMonthEndAssets() {
    return monthEndAssets;
  }

  public void setMonthEndAssets(BigDecimal monthEndAssets) {
    this.monthEndAssets = monthEndAssets;
  }

  public ETF etfPortfolioTurnover(BigDecimal etfPortfolioTurnover) {
    this.etfPortfolioTurnover = etfPortfolioTurnover;
    return this;
  }

   /**
   * The percentage of positions turned over in the last 12 months
   * @return etfPortfolioTurnover
  **/
  @ApiModelProperty(value = "The percentage of positions turned over in the last 12 months")
  public BigDecimal getEtfPortfolioTurnover() {
    return etfPortfolioTurnover;
  }

  public void setEtfPortfolioTurnover(BigDecimal etfPortfolioTurnover) {
    this.etfPortfolioTurnover = etfPortfolioTurnover;
  }

  public ETF firstbridgeId(String firstbridgeId) {
    this.firstbridgeId = firstbridgeId;
    return this;
  }

   /**
   * The FirstBridge unique identifier for the Exchange Traded Fund (ETF)
   * @return firstbridgeId
  **/
  @ApiModelProperty(value = "The FirstBridge unique identifier for the Exchange Traded Fund (ETF)")
  public String getFirstbridgeId() {
    return firstbridgeId;
  }

  public void setFirstbridgeId(String firstbridgeId) {
    this.firstbridgeId = firstbridgeId;
  }

  public ETF firstbridgeParentId(String firstbridgeParentId) {
    this.firstbridgeParentId = firstbridgeParentId;
    return this;
  }

   /**
   * The FirstBridge unique identifier of the parent Exchange Traded Fund (ETF), if applicable
   * @return firstbridgeParentId
  **/
  @ApiModelProperty(value = "The FirstBridge unique identifier of the parent Exchange Traded Fund (ETF), if applicable")
  public String getFirstbridgeParentId() {
    return firstbridgeParentId;
  }

  public void setFirstbridgeParentId(String firstbridgeParentId) {
    this.firstbridgeParentId = firstbridgeParentId;
  }

  public ETF numberOfHoldings(Integer numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
    return this;
  }

   /**
   * The number of holdings for this Exchange Traded Fund (ETF)
   * @return numberOfHoldings
  **/
  @ApiModelProperty(value = "The number of holdings for this Exchange Traded Fund (ETF)")
  public Integer getNumberOfHoldings() {
    return numberOfHoldings;
  }

  public void setNumberOfHoldings(Integer numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETF ETF = (ETF) o;
    return Objects.equals(this.id, ETF.id) &&
        Objects.equals(this.name, ETF.name) &&
        Objects.equals(this.ticker, ETF.ticker) &&
        Objects.equals(this.figiTicker, ETF.figiTicker) &&
        Objects.equals(this.ric, ETF.ric) &&
        Objects.equals(this.isin, ETF.isin) &&
        Objects.equals(this.sedol, ETF.sedol) &&
        Objects.equals(this.exchangeMic, ETF.exchangeMic) &&
        Objects.equals(this.sponsor, ETF.sponsor) &&
        Objects.equals(this.type, ETF.type) &&
        Objects.equals(this.description, ETF.description) &&
        Objects.equals(this.inceptionDate, ETF.inceptionDate) &&
        Objects.equals(this.dataChangeDate, ETF.dataChangeDate) &&
        Objects.equals(this.closeDate, ETF.closeDate) &&
        Objects.equals(this.isLiveListed, ETF.isLiveListed) &&
        Objects.equals(this.legalStructure, ETF.legalStructure) &&
        Objects.equals(this.intradayNavTicker, ETF.intradayNavTicker) &&
        Objects.equals(this.primaryTicker, ETF.primaryTicker) &&
        Objects.equals(this.primaryTickerCountryCode, ETF.primaryTickerCountryCode) &&
        Objects.equals(this.primaryListingRegion, ETF.primaryListingRegion) &&
        Objects.equals(this.netExpenseRatio, ETF.netExpenseRatio) &&
        Objects.equals(this.assetClass, ETF.assetClass) &&
        Objects.equals(this.otherAssetTypes, ETF.otherAssetTypes) &&
        Objects.equals(this.marketCapRange, ETF.marketCapRange) &&
        Objects.equals(this.holdsOnlyNyseStocks, ETF.holdsOnlyNyseStocks) &&
        Objects.equals(this.holdsOnlyNasdaqStocks, ETF.holdsOnlyNasdaqStocks) &&
        Objects.equals(this.growthValueTilt, ETF.growthValueTilt) &&
        Objects.equals(this.growthType, ETF.growthType) &&
        Objects.equals(this.valueType, ETF.valueType) &&
        Objects.equals(this.sector, ETF.sector) &&
        Objects.equals(this.industry, ETF.industry) &&
        Objects.equals(this.subIndustry, ETF.subIndustry) &&
        Objects.equals(this.crossSectorTheme, ETF.crossSectorTheme) &&
        Objects.equals(this.naturalResourcesType, ETF.naturalResourcesType) &&
        Objects.equals(this.excludesFinancials, ETF.excludesFinancials) &&
        Objects.equals(this.excludesTechnology, ETF.excludesTechnology) &&
        Objects.equals(this.usOrExcludesUs, ETF.usOrExcludesUs) &&
        Objects.equals(this.developedEmerging, ETF.developedEmerging) &&
        Objects.equals(this.specializedRegion, ETF.specializedRegion) &&
        Objects.equals(this.continent, ETF.continent) &&
        Objects.equals(this.latinAmericaSubGroup, ETF.latinAmericaSubGroup) &&
        Objects.equals(this.europeSubGroup, ETF.europeSubGroup) &&
        Objects.equals(this.asiaSubGroup, ETF.asiaSubGroup) &&
        Objects.equals(this.specificCountry, ETF.specificCountry) &&
        Objects.equals(this.chinaListingLocation, ETF.chinaListingLocation) &&
        Objects.equals(this.usState, ETF.usState) &&
        Objects.equals(this.realEstate, ETF.realEstate) &&
        Objects.equals(this.indexWeightingScheme, ETF.indexWeightingScheme) &&
        Objects.equals(this.marketCapWeightingType, ETF.marketCapWeightingType) &&
        Objects.equals(this.fundamentalWeightingType, ETF.fundamentalWeightingType) &&
        Objects.equals(this.dividendWeightingType, ETF.dividendWeightingType) &&
        Objects.equals(this.bondType, ETF.bondType) &&
        Objects.equals(this.governmentBondTypes, ETF.governmentBondTypes) &&
        Objects.equals(this.municipalBondRegion, ETF.municipalBondRegion) &&
        Objects.equals(this.municipalVrdo, ETF.municipalVrdo) &&
        Objects.equals(this.mortgageBondTypes, ETF.mortgageBondTypes) &&
        Objects.equals(this.bondTaxStatus, ETF.bondTaxStatus) &&
        Objects.equals(this.creditQuality, ETF.creditQuality) &&
        Objects.equals(this.averageMaturity, ETF.averageMaturity) &&
        Objects.equals(this.specificMaturityYear, ETF.specificMaturityYear) &&
        Objects.equals(this.bondCurrencyDenomination, ETF.bondCurrencyDenomination) &&
        Objects.equals(this.laddered, ETF.laddered) &&
        Objects.equals(this.zeroCoupon, ETF.zeroCoupon) &&
        Objects.equals(this.floatingRate, ETF.floatingRate) &&
        Objects.equals(this.buildAmericaBonds, ETF.buildAmericaBonds) &&
        Objects.equals(this.commodityTypes, ETF.commodityTypes) &&
        Objects.equals(this.energyType, ETF.energyType) &&
        Objects.equals(this.agriculturalType, ETF.agriculturalType) &&
        Objects.equals(this.metalType, ETF.metalType) &&
        Objects.equals(this.inverseLeveraged, ETF.inverseLeveraged) &&
        Objects.equals(this.targetDateMultiAssetType, ETF.targetDateMultiAssetType) &&
        Objects.equals(this.currencyHedged, ETF.currencyHedged) &&
        Objects.equals(this.currencyPair, ETF.currencyPair) &&
        Objects.equals(this.socialEnvironmentalType, ETF.socialEnvironmentalType) &&
        Objects.equals(this.cleanEnergyType, ETF.cleanEnergyType) &&
        Objects.equals(this.dividendType, ETF.dividendType) &&
        Objects.equals(this.regularDividendPayorType, ETF.regularDividendPayorType) &&
        Objects.equals(this.holdsMlPs, ETF.holdsMlPs) &&
        Objects.equals(this.holdsPreferredStock, ETF.holdsPreferredStock) &&
        Objects.equals(this.holdsClosedEndFunds, ETF.holdsClosedEndFunds) &&
        Objects.equals(this.quantStrategiesType, ETF.quantStrategiesType) &&
        Objects.equals(this.otherQuantModels, ETF.otherQuantModels) &&
        Objects.equals(this.hedgeFundType, ETF.hedgeFundType) &&
        Objects.equals(this.derivativesBased, ETF.derivativesBased) &&
        Objects.equals(this.holdsAdRs, ETF.holdsAdRs) &&
        Objects.equals(this.indexLinked, ETF.indexLinked) &&
        Objects.equals(this.includesShortExposure, ETF.includesShortExposure) &&
        Objects.equals(this.indexName, ETF.indexName) &&
        Objects.equals(this.parentIndex, ETF.parentIndex) &&
        Objects.equals(this.indexFamily, ETF.indexFamily) &&
        Objects.equals(this.broaderIndexFamily, ETF.broaderIndexFamily) &&
        Objects.equals(this.indexProvider, ETF.indexProvider) &&
        Objects.equals(this.fundFamily, ETF.fundFamily) &&
        Objects.equals(this.indexTicker, ETF.indexTicker) &&
        Objects.equals(this.etnIssuingBank, ETF.etnIssuingBank) &&
        Objects.equals(this.etnMaturityDate, ETF.etnMaturityDate) &&
        Objects.equals(this.livestock, ETF.livestock) &&
        Objects.equals(this.dynamicFuturesRoll, ETF.dynamicFuturesRoll) &&
        Objects.equals(this.indexProviderCode, ETF.indexProviderCode) &&
        Objects.equals(this.singleCategoryDesignation, ETF.singleCategoryDesignation) &&
        Objects.equals(this.registeredCountries, ETF.registeredCountries) &&
        Objects.equals(this.issuingEntityCountryCode, ETF.issuingEntityCountryCode) &&
        Objects.equals(this.ucits, ETF.ucits) &&
        Objects.equals(this.replicationStructure, ETF.replicationStructure) &&
        Objects.equals(this.domicile, ETF.domicile) &&
        Objects.equals(this.baseCurrency, ETF.baseCurrency) &&
        Objects.equals(this.listingCurrency, ETF.listingCurrency) &&
        Objects.equals(this.fundListingDate, ETF.fundListingDate) &&
        Objects.equals(this.listingCountryCode, ETF.listingCountryCode) &&
        Objects.equals(this.listingRegion, ETF.listingRegion) &&
        Objects.equals(this.smartvsTraditionalBeta, ETF.smartvsTraditionalBeta) &&
        Objects.equals(this.smartvsTraditionalBetaLevel2, ETF.smartvsTraditionalBetaLevel2) &&
        Objects.equals(this.incomeCategory, ETF.incomeCategory) &&
        Objects.equals(this.etpStructureType, ETF.etpStructureType) &&
        Objects.equals(this.monthEndAssets, ETF.monthEndAssets) &&
        Objects.equals(this.etfPortfolioTurnover, ETF.etfPortfolioTurnover) &&
        Objects.equals(this.firstbridgeId, ETF.firstbridgeId) &&
        Objects.equals(this.firstbridgeParentId, ETF.firstbridgeParentId) &&
        Objects.equals(this.numberOfHoldings, ETF.numberOfHoldings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ticker, figiTicker, ric, isin, sedol, exchangeMic, sponsor, type, description, inceptionDate, dataChangeDate, closeDate, isLiveListed, legalStructure, intradayNavTicker, primaryTicker, primaryTickerCountryCode, primaryListingRegion, netExpenseRatio, assetClass, otherAssetTypes, marketCapRange, holdsOnlyNyseStocks, holdsOnlyNasdaqStocks, growthValueTilt, growthType, valueType, sector, industry, subIndustry, crossSectorTheme, naturalResourcesType, excludesFinancials, excludesTechnology, usOrExcludesUs, developedEmerging, specializedRegion, continent, latinAmericaSubGroup, europeSubGroup, asiaSubGroup, specificCountry, chinaListingLocation, usState, realEstate, indexWeightingScheme, marketCapWeightingType, fundamentalWeightingType, dividendWeightingType, bondType, governmentBondTypes, municipalBondRegion, municipalVrdo, mortgageBondTypes, bondTaxStatus, creditQuality, averageMaturity, specificMaturityYear, bondCurrencyDenomination, laddered, zeroCoupon, floatingRate, buildAmericaBonds, commodityTypes, energyType, agriculturalType, metalType, inverseLeveraged, targetDateMultiAssetType, currencyHedged, currencyPair, socialEnvironmentalType, cleanEnergyType, dividendType, regularDividendPayorType, holdsMlPs, holdsPreferredStock, holdsClosedEndFunds, quantStrategiesType, otherQuantModels, hedgeFundType, derivativesBased, holdsAdRs, indexLinked, includesShortExposure, indexName, parentIndex, indexFamily, broaderIndexFamily, indexProvider, fundFamily, indexTicker, etnIssuingBank, etnMaturityDate, livestock, dynamicFuturesRoll, indexProviderCode, singleCategoryDesignation, registeredCountries, issuingEntityCountryCode, ucits, replicationStructure, domicile, baseCurrency, listingCurrency, fundListingDate, listingCountryCode, listingRegion, smartvsTraditionalBeta, smartvsTraditionalBetaLevel2, incomeCategory, etpStructureType, monthEndAssets, etfPortfolioTurnover, firstbridgeId, firstbridgeParentId, numberOfHoldings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETF {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    figiTicker: ").append(toIndentedString(figiTicker)).append("\n");
    sb.append("    ric: ").append(toIndentedString(ric)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    exchangeMic: ").append(toIndentedString(exchangeMic)).append("\n");
    sb.append("    sponsor: ").append(toIndentedString(sponsor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    dataChangeDate: ").append(toIndentedString(dataChangeDate)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    isLiveListed: ").append(toIndentedString(isLiveListed)).append("\n");
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    intradayNavTicker: ").append(toIndentedString(intradayNavTicker)).append("\n");
    sb.append("    primaryTicker: ").append(toIndentedString(primaryTicker)).append("\n");
    sb.append("    primaryTickerCountryCode: ").append(toIndentedString(primaryTickerCountryCode)).append("\n");
    sb.append("    primaryListingRegion: ").append(toIndentedString(primaryListingRegion)).append("\n");
    sb.append("    netExpenseRatio: ").append(toIndentedString(netExpenseRatio)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    otherAssetTypes: ").append(toIndentedString(otherAssetTypes)).append("\n");
    sb.append("    marketCapRange: ").append(toIndentedString(marketCapRange)).append("\n");
    sb.append("    holdsOnlyNyseStocks: ").append(toIndentedString(holdsOnlyNyseStocks)).append("\n");
    sb.append("    holdsOnlyNasdaqStocks: ").append(toIndentedString(holdsOnlyNasdaqStocks)).append("\n");
    sb.append("    growthValueTilt: ").append(toIndentedString(growthValueTilt)).append("\n");
    sb.append("    growthType: ").append(toIndentedString(growthType)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    subIndustry: ").append(toIndentedString(subIndustry)).append("\n");
    sb.append("    crossSectorTheme: ").append(toIndentedString(crossSectorTheme)).append("\n");
    sb.append("    naturalResourcesType: ").append(toIndentedString(naturalResourcesType)).append("\n");
    sb.append("    excludesFinancials: ").append(toIndentedString(excludesFinancials)).append("\n");
    sb.append("    excludesTechnology: ").append(toIndentedString(excludesTechnology)).append("\n");
    sb.append("    usOrExcludesUs: ").append(toIndentedString(usOrExcludesUs)).append("\n");
    sb.append("    developedEmerging: ").append(toIndentedString(developedEmerging)).append("\n");
    sb.append("    specializedRegion: ").append(toIndentedString(specializedRegion)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    latinAmericaSubGroup: ").append(toIndentedString(latinAmericaSubGroup)).append("\n");
    sb.append("    europeSubGroup: ").append(toIndentedString(europeSubGroup)).append("\n");
    sb.append("    asiaSubGroup: ").append(toIndentedString(asiaSubGroup)).append("\n");
    sb.append("    specificCountry: ").append(toIndentedString(specificCountry)).append("\n");
    sb.append("    chinaListingLocation: ").append(toIndentedString(chinaListingLocation)).append("\n");
    sb.append("    usState: ").append(toIndentedString(usState)).append("\n");
    sb.append("    realEstate: ").append(toIndentedString(realEstate)).append("\n");
    sb.append("    indexWeightingScheme: ").append(toIndentedString(indexWeightingScheme)).append("\n");
    sb.append("    marketCapWeightingType: ").append(toIndentedString(marketCapWeightingType)).append("\n");
    sb.append("    fundamentalWeightingType: ").append(toIndentedString(fundamentalWeightingType)).append("\n");
    sb.append("    dividendWeightingType: ").append(toIndentedString(dividendWeightingType)).append("\n");
    sb.append("    bondType: ").append(toIndentedString(bondType)).append("\n");
    sb.append("    governmentBondTypes: ").append(toIndentedString(governmentBondTypes)).append("\n");
    sb.append("    municipalBondRegion: ").append(toIndentedString(municipalBondRegion)).append("\n");
    sb.append("    municipalVrdo: ").append(toIndentedString(municipalVrdo)).append("\n");
    sb.append("    mortgageBondTypes: ").append(toIndentedString(mortgageBondTypes)).append("\n");
    sb.append("    bondTaxStatus: ").append(toIndentedString(bondTaxStatus)).append("\n");
    sb.append("    creditQuality: ").append(toIndentedString(creditQuality)).append("\n");
    sb.append("    averageMaturity: ").append(toIndentedString(averageMaturity)).append("\n");
    sb.append("    specificMaturityYear: ").append(toIndentedString(specificMaturityYear)).append("\n");
    sb.append("    bondCurrencyDenomination: ").append(toIndentedString(bondCurrencyDenomination)).append("\n");
    sb.append("    laddered: ").append(toIndentedString(laddered)).append("\n");
    sb.append("    zeroCoupon: ").append(toIndentedString(zeroCoupon)).append("\n");
    sb.append("    floatingRate: ").append(toIndentedString(floatingRate)).append("\n");
    sb.append("    buildAmericaBonds: ").append(toIndentedString(buildAmericaBonds)).append("\n");
    sb.append("    commodityTypes: ").append(toIndentedString(commodityTypes)).append("\n");
    sb.append("    energyType: ").append(toIndentedString(energyType)).append("\n");
    sb.append("    agriculturalType: ").append(toIndentedString(agriculturalType)).append("\n");
    sb.append("    metalType: ").append(toIndentedString(metalType)).append("\n");
    sb.append("    inverseLeveraged: ").append(toIndentedString(inverseLeveraged)).append("\n");
    sb.append("    targetDateMultiAssetType: ").append(toIndentedString(targetDateMultiAssetType)).append("\n");
    sb.append("    currencyHedged: ").append(toIndentedString(currencyHedged)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    socialEnvironmentalType: ").append(toIndentedString(socialEnvironmentalType)).append("\n");
    sb.append("    cleanEnergyType: ").append(toIndentedString(cleanEnergyType)).append("\n");
    sb.append("    dividendType: ").append(toIndentedString(dividendType)).append("\n");
    sb.append("    regularDividendPayorType: ").append(toIndentedString(regularDividendPayorType)).append("\n");
    sb.append("    holdsMlPs: ").append(toIndentedString(holdsMlPs)).append("\n");
    sb.append("    holdsPreferredStock: ").append(toIndentedString(holdsPreferredStock)).append("\n");
    sb.append("    holdsClosedEndFunds: ").append(toIndentedString(holdsClosedEndFunds)).append("\n");
    sb.append("    quantStrategiesType: ").append(toIndentedString(quantStrategiesType)).append("\n");
    sb.append("    otherQuantModels: ").append(toIndentedString(otherQuantModels)).append("\n");
    sb.append("    hedgeFundType: ").append(toIndentedString(hedgeFundType)).append("\n");
    sb.append("    derivativesBased: ").append(toIndentedString(derivativesBased)).append("\n");
    sb.append("    holdsAdRs: ").append(toIndentedString(holdsAdRs)).append("\n");
    sb.append("    indexLinked: ").append(toIndentedString(indexLinked)).append("\n");
    sb.append("    includesShortExposure: ").append(toIndentedString(includesShortExposure)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    parentIndex: ").append(toIndentedString(parentIndex)).append("\n");
    sb.append("    indexFamily: ").append(toIndentedString(indexFamily)).append("\n");
    sb.append("    broaderIndexFamily: ").append(toIndentedString(broaderIndexFamily)).append("\n");
    sb.append("    indexProvider: ").append(toIndentedString(indexProvider)).append("\n");
    sb.append("    fundFamily: ").append(toIndentedString(fundFamily)).append("\n");
    sb.append("    indexTicker: ").append(toIndentedString(indexTicker)).append("\n");
    sb.append("    etnIssuingBank: ").append(toIndentedString(etnIssuingBank)).append("\n");
    sb.append("    etnMaturityDate: ").append(toIndentedString(etnMaturityDate)).append("\n");
    sb.append("    livestock: ").append(toIndentedString(livestock)).append("\n");
    sb.append("    dynamicFuturesRoll: ").append(toIndentedString(dynamicFuturesRoll)).append("\n");
    sb.append("    indexProviderCode: ").append(toIndentedString(indexProviderCode)).append("\n");
    sb.append("    singleCategoryDesignation: ").append(toIndentedString(singleCategoryDesignation)).append("\n");
    sb.append("    registeredCountries: ").append(toIndentedString(registeredCountries)).append("\n");
    sb.append("    issuingEntityCountryCode: ").append(toIndentedString(issuingEntityCountryCode)).append("\n");
    sb.append("    ucits: ").append(toIndentedString(ucits)).append("\n");
    sb.append("    replicationStructure: ").append(toIndentedString(replicationStructure)).append("\n");
    sb.append("    domicile: ").append(toIndentedString(domicile)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    listingCurrency: ").append(toIndentedString(listingCurrency)).append("\n");
    sb.append("    fundListingDate: ").append(toIndentedString(fundListingDate)).append("\n");
    sb.append("    listingCountryCode: ").append(toIndentedString(listingCountryCode)).append("\n");
    sb.append("    listingRegion: ").append(toIndentedString(listingRegion)).append("\n");
    sb.append("    smartvsTraditionalBeta: ").append(toIndentedString(smartvsTraditionalBeta)).append("\n");
    sb.append("    smartvsTraditionalBetaLevel2: ").append(toIndentedString(smartvsTraditionalBetaLevel2)).append("\n");
    sb.append("    incomeCategory: ").append(toIndentedString(incomeCategory)).append("\n");
    sb.append("    etpStructureType: ").append(toIndentedString(etpStructureType)).append("\n");
    sb.append("    monthEndAssets: ").append(toIndentedString(monthEndAssets)).append("\n");
    sb.append("    etfPortfolioTurnover: ").append(toIndentedString(etfPortfolioTurnover)).append("\n");
    sb.append("    firstbridgeId: ").append(toIndentedString(firstbridgeId)).append("\n");
    sb.append("    firstbridgeParentId: ").append(toIndentedString(firstbridgeParentId)).append("\n");
    sb.append("    numberOfHoldings: ").append(toIndentedString(numberOfHoldings)).append("\n");
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

