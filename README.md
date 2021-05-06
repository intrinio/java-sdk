# Intrinio Java SDK

To get an API key, [sign up here](https://intrinio.com/).

Welcome to the Intrinio API! Through our Financial Data Marketplace, we offer a wide selection of financial data feed APIs sourced by our own proprietary processes as well as from many data vendors. For a complete API request / response reference please view the [Intrinio API documentation](https://intrinio.com/documentation/api_v2). If you need additional help in using the API, please visit the [Intrinio website](https://intrinio.com) and click on the chat icon in the lower right corner.

- API version: 2.21.1
- Package version: 6.5.0


## Installation

Download the most recent release zip file and import all .jar files into your project as module dependencies.

Instructions for importing jar files into your IntelliJ project can be found here:

https://www.jetbrains.com/help/idea/library.html#add-library-to-module-dependencies

## Getting Started

Please follow the [installation](#installation) instructions and execute the following Java code:

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR API KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    LocalDate startDate = null; // LocalDate | Return prices on or after the date
    LocalDate endDate = null; // LocalDate | Return prices on or before the date
    String frequency = "daily"; // String | Return stock prices in the given frequency
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseSecurityStockPrices result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling SecurityApi#getSecurityStockPrices");
        e.printStackTrace();
    }

  }
}
```

## Multi-threading Recommendation

It's recommended to create one instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Retries

By default, automatic retries are enabled for the Java SDK. Retries can be enabed or disabled by supplying the `defaultClient.setAllowRetries` function with a boolean parameter.

If set to `true`, all calls to the API will attempt a successful completion up to 5 times with exponential backoff before failing. If set to `false`, calls to the API will attempt one successful call.

## Documentation for API Endpoints

Complete documentation for the Intrinio Java SDK is available on the Intrinio website.

[View Intrinio Java SDK Documentation](https://docs.intrinio.com/documentation/java)

A listing of classes and methods is also provided below:

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BulkDownloadsApi* | [**getBulkDownloadLinks**](docs/BulkDownloadsApi.md#getBulkDownloadLinks) | **GET** /bulk_downloads/links | All Links
*CompanyApi* | [**getAllCompanies**](docs/CompanyApi.md#getAllCompanies) | **GET** /companies | All Companies
*CompanyApi* | [**getAllCompanyNews**](docs/CompanyApi.md#getAllCompanyNews) | **GET** /companies/news | All News
*CompanyApi* | [**getCompany**](docs/CompanyApi.md#getCompany) | **GET** /companies/{identifier} | Lookup Company
*CompanyApi* | [**getCompanyDataPointNumber**](docs/CompanyApi.md#getCompanyDataPointNumber) | **GET** /companies/{identifier}/data_point/{tag}/number | Data Point (Number) for Company
*CompanyApi* | [**getCompanyDataPointText**](docs/CompanyApi.md#getCompanyDataPointText) | **GET** /companies/{identifier}/data_point/{tag}/text | Data Point (Text) for Company
*CompanyApi* | [**getCompanyFilings**](docs/CompanyApi.md#getCompanyFilings) | **GET** /companies/{identifier}/filings | All Filings by Company
*CompanyApi* | [**getCompanyFundamentals**](docs/CompanyApi.md#getCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals | All Fundamentals by Company
*CompanyApi* | [**getCompanyHistoricalData**](docs/CompanyApi.md#getCompanyHistoricalData) | **GET** /companies/{identifier}/historical_data/{tag} | Historical Data for Company
*CompanyApi* | [**getCompanyIpos**](docs/CompanyApi.md#getCompanyIpos) | **GET** /companies/ipos | IPOs
*CompanyApi* | [**getCompanyNews**](docs/CompanyApi.md#getCompanyNews) | **GET** /companies/{identifier}/news | All News by Company
*CompanyApi* | [**getCompanySecurities**](docs/CompanyApi.md#getCompanySecurities) | **GET** /companies/{identifier}/securities | All Securities by Company
*CompanyApi* | [**insiderTransactionFilingsByCompany**](docs/CompanyApi.md#insiderTransactionFilingsByCompany) | **GET** /companies/{identifier}/insider_transaction_filings | Insider Transaction Filings by Company
*CompanyApi* | [**latestInsiderTransactionFilingByCompany**](docs/CompanyApi.md#latestInsiderTransactionFilingByCompany) | **GET** /companies/{identifier}/insider_transaction_filings/latest | Latest Insider Transaction Filing by Company
*CompanyApi* | [**lookupCompanyFundamental**](docs/CompanyApi.md#lookupCompanyFundamental) | **GET** /companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental by Company
*CompanyApi* | [**searchCompanies**](docs/CompanyApi.md#searchCompanies) | **GET** /companies/search | Search Companies
*CompanyApi* | [**sharesOutstandingByCompany**](docs/CompanyApi.md#sharesOutstandingByCompany) | **GET** /companies/{identifier}/shares_outstanding | Shares Outstanding by Company
*DataPointApi* | [**getDataPointNumber**](docs/DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Data Point (Number)
*DataPointApi* | [**getDataPointText**](docs/DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Data Point (Text)
*DataTagApi* | [**getAllDataTags**](docs/DataTagApi.md#getAllDataTags) | **GET** /data_tags | All Data Tags
*DataTagApi* | [**getDataTagById**](docs/DataTagApi.md#getDataTagById) | **GET** /data_tags/{identifier} | Lookup Data Tag
*DataTagApi* | [**searchDataTags**](docs/DataTagApi.md#searchDataTags) | **GET** /data_tags/search | Search Data Tags
*EtFsApi* | [**getAllEtfs**](docs/EtFsApi.md#getAllEtfs) | **GET** /etfs | All ETFs
*EtFsApi* | [**getEtf**](docs/EtFsApi.md#getEtf) | **GET** /etfs/{identifier} | Lookup ETF
*EtFsApi* | [**getEtfAnalytics**](docs/EtFsApi.md#getEtfAnalytics) | **GET** /etfs/{identifier}/analytics | ETF Analytics
*EtFsApi* | [**getEtfHoldings**](docs/EtFsApi.md#getEtfHoldings) | **GET** /etfs/{identifier}/holdings | ETF Holdings
*EtFsApi* | [**getEtfStats**](docs/EtFsApi.md#getEtfStats) | **GET** /etfs/{identifier}/stats | Exchange Traded Fund (ETF) stats
*EtFsApi* | [**searchEtfs**](docs/EtFsApi.md#searchEtfs) | **GET** /etfs/search | Search ETFs
*FilingApi* | [**getAllFilings**](docs/FilingApi.md#getAllFilings) | **GET** /filings | All Filings
*FilingApi* | [**getAllNotes**](docs/FilingApi.md#getAllNotes) | **GET** /filings/notes | All Filing Notes
*FilingApi* | [**getFilingById**](docs/FilingApi.md#getFilingById) | **GET** /filings/{id} | Lookup Filing
*FilingApi* | [**getFilingFundamentals**](docs/FilingApi.md#getFilingFundamentals) | **GET** /filings/{identifier}/fundamentals | All Fundamentals by Filing
*FilingApi* | [**getFilingHtml**](docs/FilingApi.md#getFilingHtml) | **GET** /filings/{identifier}/html | Filing Html
*FilingApi* | [**getFilingText**](docs/FilingApi.md#getFilingText) | **GET** /filings/{identifier}/text | Filing Text
*FilingApi* | [**getNote**](docs/FilingApi.md#getNote) | **GET** /filings/notes/{identifier} | Filing Note by ID
*FilingApi* | [**getNoteHtml**](docs/FilingApi.md#getNoteHtml) | **GET** /filings/notes/{identifier}/html | Filing Note HTML
*FilingApi* | [**getNoteText**](docs/FilingApi.md#getNoteText) | **GET** /filings/notes/{identifier}/text | Filing Note Text
*FilingApi* | [**searchNotes**](docs/FilingApi.md#searchNotes) | **GET** /filings/notes/search | Search Filing Notes
*ForexApi* | [**getForexCurrencies**](docs/ForexApi.md#getForexCurrencies) | **GET** /forex/currencies | Forex Currencies
*ForexApi* | [**getForexPairs**](docs/ForexApi.md#getForexPairs) | **GET** /forex/pairs | Forex Currency Pairs
*ForexApi* | [**getForexPrices**](docs/ForexApi.md#getForexPrices) | **GET** /forex/prices/{pair}/{timeframe} | Forex Currency Prices
*FundamentalsApi* | [**getFundamentalById**](docs/FundamentalsApi.md#getFundamentalById) | **GET** /fundamentals/{id} | Fundamental by ID
*FundamentalsApi* | [**getFundamentalReportedFinancials**](docs/FundamentalsApi.md#getFundamentalReportedFinancials) | **GET** /fundamentals/{id}/reported_financials | Reported Financials
*FundamentalsApi* | [**getFundamentalStandardizedFinancials**](docs/FundamentalsApi.md#getFundamentalStandardizedFinancials) | **GET** /fundamentals/{id}/standardized_financials | Standardized Financials
*FundamentalsApi* | [**lookupFundamental**](docs/FundamentalsApi.md#lookupFundamental) | **GET** /fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental
*HistoricalDataApi* | [**getHistoricalData**](docs/HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Historical Data
*IndexApi* | [**getAllEconomicIndices**](docs/IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | All Economic Indices
*IndexApi* | [**getAllSicIndices**](docs/IndexApi.md#getAllSicIndices) | **GET** /indices/sic | All SIC Indices
*IndexApi* | [**getAllStockMarketIndices**](docs/IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | All Stock Market Indices
*IndexApi* | [**getEconomicIndexById**](docs/IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Lookup Economic Index
*IndexApi* | [**getEconomicIndexDataPointNumber**](docs/IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{tag}/number | Data Point (Number) for an Economic Index
*IndexApi* | [**getEconomicIndexDataPointText**](docs/IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{tag}/text | Data Point (Text) for an Economic Index
*IndexApi* | [**getEconomicIndexHistoricalData**](docs/IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{tag} | Historical Data for an Economic Index
*IndexApi* | [**getSicIndexById**](docs/IndexApi.md#getSicIndexById) | **GET** /indices/sic/{identifier} | Lookup SIC Index
*IndexApi* | [**getSicIndexDataPointNumber**](docs/IndexApi.md#getSicIndexDataPointNumber) | **GET** /indices/sic/{identifier}/data_point/{tag}/number | Data Point (Number) for an SIC Index
*IndexApi* | [**getSicIndexDataPointText**](docs/IndexApi.md#getSicIndexDataPointText) | **GET** /indices/sic/{identifier}/data_point/{tag}/text | Data Point (Text) for an SIC Index
*IndexApi* | [**getSicIndexHistoricalData**](docs/IndexApi.md#getSicIndexHistoricalData) | **GET** /indices/sic/{identifier}/historical_data/{tag} | Historical Data for an SIC Index
*IndexApi* | [**getStockMarketIndexById**](docs/IndexApi.md#getStockMarketIndexById) | **GET** /indices/stock_market/{identifier} | Lookup Stock Market Index
*IndexApi* | [**getStockMarketIndexDataPointNumber**](docs/IndexApi.md#getStockMarketIndexDataPointNumber) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/number | Data Point (Number) for Stock Market Index
*IndexApi* | [**getStockMarketIndexDataPointText**](docs/IndexApi.md#getStockMarketIndexDataPointText) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/text | Data Point (Text) for Stock Market Index
*IndexApi* | [**getStockMarketIndexHistoricalData**](docs/IndexApi.md#getStockMarketIndexHistoricalData) | **GET** /indices/stock_market/{identifier}/historical_data/{tag} | Historical Data for Stock Market Index
*IndexApi* | [**searchEconomicIndices**](docs/IndexApi.md#searchEconomicIndices) | **GET** /indices/economic/search | Search Economic Indices
*IndexApi* | [**searchSicIndices**](docs/IndexApi.md#searchSicIndices) | **GET** /indices/sic/search | Search SIC Indices
*IndexApi* | [**searchStockMarketsIndices**](docs/IndexApi.md#searchStockMarketsIndices) | **GET** /indices/stock_market/search | Search Stock Market Indices
*InsiderTransactionFilingsApi* | [**getAllInsiderTransactionFilings**](docs/InsiderTransactionFilingsApi.md#getAllInsiderTransactionFilings) | **GET** /insider_transaction_filings | All Insider Transactions Filings
*MunicipalityApi* | [**getAllMunicipalities**](docs/MunicipalityApi.md#getAllMunicipalities) | **GET** /municipalities | All Municipalities
*MunicipalityApi* | [**getMunicipalityById**](docs/MunicipalityApi.md#getMunicipalityById) | **GET** /municipalities/{id} | Municipality by ID
*MunicipalityApi* | [**getMunicipalityFinancials**](docs/MunicipalityApi.md#getMunicipalityFinancials) | **GET** /municipalities/{id}/financials | Financials for a Municipality
*OptionsApi* | [**getOptionExpirationsRealtime**](docs/OptionsApi.md#getOptionExpirationsRealtime) | **GET** /options/expirations/{symbol}/realtime | Option Expirations Realtime
*OptionsApi* | [**getOptions**](docs/OptionsApi.md#getOptions) | **GET** /options/{symbol} | Options
*OptionsApi* | [**getOptionsBySymbolRealtime**](docs/OptionsApi.md#getOptionsBySymbolRealtime) | **GET** /options/{symbol}/realtime | Options by Symbol Realtime
*OptionsApi* | [**getOptionsChain**](docs/OptionsApi.md#getOptionsChain) | **GET** /options/chain/{symbol}/{expiration} | Options Chain
*OptionsApi* | [**getOptionsChainRealtime**](docs/OptionsApi.md#getOptionsChainRealtime) | **GET** /options/chain/{symbol}/{expiration}/realtime | Options Chain Realtime
*OptionsApi* | [**getOptionsExpirations**](docs/OptionsApi.md#getOptionsExpirations) | **GET** /options/expirations/{symbol} | Options Expirations
*OptionsApi* | [**getOptionsPrices**](docs/OptionsApi.md#getOptionsPrices) | **GET** /options/prices/{identifier} | Option Prices
*OptionsApi* | [**getOptionsPricesBatchRealtime**](docs/OptionsApi.md#getOptionsPricesBatchRealtime) | **POST** /options/prices/realtime/batch | Option Prices Batch Realtime
*OptionsApi* | [**getOptionsPricesRealtime**](docs/OptionsApi.md#getOptionsPricesRealtime) | **GET** /options/prices/{identifier}/realtime | Option Prices Realtime
*OptionsApi* | [**getOptionsStatsRealtime**](docs/OptionsApi.md#getOptionsStatsRealtime) | **GET** /options/prices/{identifier}/realtime/stats | Option Stats Realtime
*OwnersApi* | [**getAllOwners**](docs/OwnersApi.md#getAllOwners) | **GET** /owners | All Owners
*OwnersApi* | [**getOwnerById**](docs/OwnersApi.md#getOwnerById) | **GET** /owners/{identifier} | Owner by ID
*OwnersApi* | [**insiderTransactionFilingsByOwner**](docs/OwnersApi.md#insiderTransactionFilingsByOwner) | **GET** /owners/{identifier}/insider_transaction_filings | Insider Transaction Filings by Owner
*OwnersApi* | [**institutionalHoldingsByOwner**](docs/OwnersApi.md#institutionalHoldingsByOwner) | **GET** /owners/{identifier}/institutional_holdings | Institutional Holdings by Owner
*OwnersApi* | [**searchOwners**](docs/OwnersApi.md#searchOwners) | **GET** /owners/search | Search Owners
*SecurityApi* | [**getAllSecurities**](docs/SecurityApi.md#getAllSecurities) | **GET** /securities | All Securities
*SecurityApi* | [**getSecurityById**](docs/SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Lookup Security
*SecurityApi* | [**getSecurityDataPointNumber**](docs/SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{tag}/number | Data Point (Number) for Security
*SecurityApi* | [**getSecurityDataPointText**](docs/SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{tag}/text | Data Point (Text) for Security
*SecurityApi* | [**getSecurityHistoricalData**](docs/SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{tag} | Historical Data for Security
*SecurityApi* | [**getSecurityInsiderOwnership**](docs/SecurityApi.md#getSecurityInsiderOwnership) | **GET** /securities/{identifier}/institutional_ownership | Institutional Ownership by Security
*SecurityApi* | [**getSecurityIntervalPrices**](docs/SecurityApi.md#getSecurityIntervalPrices) | **GET** /securities/{identifier}/prices/intervals | Interval Stock Prices for Security
*SecurityApi* | [**getSecurityIntradayPrices**](docs/SecurityApi.md#getSecurityIntradayPrices) | **GET** /securities/{identifier}/prices/intraday | Intraday Stock Prices for Security
*SecurityApi* | [**getSecurityLatestDividendRecord**](docs/SecurityApi.md#getSecurityLatestDividendRecord) | **GET** /securities/{identifier}/dividends/latest | Latest Dividend Record for Security
*SecurityApi* | [**getSecurityLatestEarningsRecord**](docs/SecurityApi.md#getSecurityLatestEarningsRecord) | **GET** /securities/{identifier}/earnings/latest | Latest Earnings Record for Security
*SecurityApi* | [**getSecurityPriceTechnicalsAdi**](docs/SecurityApi.md#getSecurityPriceTechnicalsAdi) | **GET** /securities/{identifier}/prices/technicals/adi | Accumulation/Distribution Index
*SecurityApi* | [**getSecurityPriceTechnicalsAdtv**](docs/SecurityApi.md#getSecurityPriceTechnicalsAdtv) | **GET** /securities/{identifier}/prices/technicals/adtv | Average Daily Trading Volume
*SecurityApi* | [**getSecurityPriceTechnicalsAdx**](docs/SecurityApi.md#getSecurityPriceTechnicalsAdx) | **GET** /securities/{identifier}/prices/technicals/adx | Average Directional Index
*SecurityApi* | [**getSecurityPriceTechnicalsAo**](docs/SecurityApi.md#getSecurityPriceTechnicalsAo) | **GET** /securities/{identifier}/prices/technicals/ao | Awesome Oscillator
*SecurityApi* | [**getSecurityPriceTechnicalsAtr**](docs/SecurityApi.md#getSecurityPriceTechnicalsAtr) | **GET** /securities/{identifier}/prices/technicals/atr | Average True Range
*SecurityApi* | [**getSecurityPriceTechnicalsBb**](docs/SecurityApi.md#getSecurityPriceTechnicalsBb) | **GET** /securities/{identifier}/prices/technicals/bb | Bollinger Bands
*SecurityApi* | [**getSecurityPriceTechnicalsCci**](docs/SecurityApi.md#getSecurityPriceTechnicalsCci) | **GET** /securities/{identifier}/prices/technicals/cci | Commodity Channel Index
*SecurityApi* | [**getSecurityPriceTechnicalsCmf**](docs/SecurityApi.md#getSecurityPriceTechnicalsCmf) | **GET** /securities/{identifier}/prices/technicals/cmf | Chaikin Money Flow
*SecurityApi* | [**getSecurityPriceTechnicalsDc**](docs/SecurityApi.md#getSecurityPriceTechnicalsDc) | **GET** /securities/{identifier}/prices/technicals/dc | Donchian Channel
*SecurityApi* | [**getSecurityPriceTechnicalsDpo**](docs/SecurityApi.md#getSecurityPriceTechnicalsDpo) | **GET** /securities/{identifier}/prices/technicals/dpo | Detrended Price Oscillator
*SecurityApi* | [**getSecurityPriceTechnicalsEom**](docs/SecurityApi.md#getSecurityPriceTechnicalsEom) | **GET** /securities/{identifier}/prices/technicals/eom | Ease of Movement
*SecurityApi* | [**getSecurityPriceTechnicalsFi**](docs/SecurityApi.md#getSecurityPriceTechnicalsFi) | **GET** /securities/{identifier}/prices/technicals/fi | Force Index
*SecurityApi* | [**getSecurityPriceTechnicalsIchimoku**](docs/SecurityApi.md#getSecurityPriceTechnicalsIchimoku) | **GET** /securities/{identifier}/prices/technicals/ichimoku | Ichimoku Kinko Hyo
*SecurityApi* | [**getSecurityPriceTechnicalsKc**](docs/SecurityApi.md#getSecurityPriceTechnicalsKc) | **GET** /securities/{identifier}/prices/technicals/kc | Keltner Channel
*SecurityApi* | [**getSecurityPriceTechnicalsKst**](docs/SecurityApi.md#getSecurityPriceTechnicalsKst) | **GET** /securities/{identifier}/prices/technicals/kst | Know Sure Thing
*SecurityApi* | [**getSecurityPriceTechnicalsMacd**](docs/SecurityApi.md#getSecurityPriceTechnicalsMacd) | **GET** /securities/{identifier}/prices/technicals/macd | Moving Average Convergence Divergence
*SecurityApi* | [**getSecurityPriceTechnicalsMfi**](docs/SecurityApi.md#getSecurityPriceTechnicalsMfi) | **GET** /securities/{identifier}/prices/technicals/mfi | Money Flow Index
*SecurityApi* | [**getSecurityPriceTechnicalsMi**](docs/SecurityApi.md#getSecurityPriceTechnicalsMi) | **GET** /securities/{identifier}/prices/technicals/mi | Mass Index
*SecurityApi* | [**getSecurityPriceTechnicalsNvi**](docs/SecurityApi.md#getSecurityPriceTechnicalsNvi) | **GET** /securities/{identifier}/prices/technicals/nvi | Negative Volume Index
*SecurityApi* | [**getSecurityPriceTechnicalsObv**](docs/SecurityApi.md#getSecurityPriceTechnicalsObv) | **GET** /securities/{identifier}/prices/technicals/obv | On-balance Volume
*SecurityApi* | [**getSecurityPriceTechnicalsObvMean**](docs/SecurityApi.md#getSecurityPriceTechnicalsObvMean) | **GET** /securities/{identifier}/prices/technicals/obv_mean | On-balance Volume Mean
*SecurityApi* | [**getSecurityPriceTechnicalsRsi**](docs/SecurityApi.md#getSecurityPriceTechnicalsRsi) | **GET** /securities/{identifier}/prices/technicals/rsi | Relative Strength Index
*SecurityApi* | [**getSecurityPriceTechnicalsSma**](docs/SecurityApi.md#getSecurityPriceTechnicalsSma) | **GET** /securities/{identifier}/prices/technicals/sma | Simple Moving Average
*SecurityApi* | [**getSecurityPriceTechnicalsSr**](docs/SecurityApi.md#getSecurityPriceTechnicalsSr) | **GET** /securities/{identifier}/prices/technicals/sr | Stochastic Oscillator
*SecurityApi* | [**getSecurityPriceTechnicalsTrix**](docs/SecurityApi.md#getSecurityPriceTechnicalsTrix) | **GET** /securities/{identifier}/prices/technicals/trix | Triple Exponential Average
*SecurityApi* | [**getSecurityPriceTechnicalsTsi**](docs/SecurityApi.md#getSecurityPriceTechnicalsTsi) | **GET** /securities/{identifier}/prices/technicals/tsi | True Strength Index
*SecurityApi* | [**getSecurityPriceTechnicalsUo**](docs/SecurityApi.md#getSecurityPriceTechnicalsUo) | **GET** /securities/{identifier}/prices/technicals/uo | Ultimate Oscillator
*SecurityApi* | [**getSecurityPriceTechnicalsVi**](docs/SecurityApi.md#getSecurityPriceTechnicalsVi) | **GET** /securities/{identifier}/prices/technicals/vi | Vortex Indicator
*SecurityApi* | [**getSecurityPriceTechnicalsVpt**](docs/SecurityApi.md#getSecurityPriceTechnicalsVpt) | **GET** /securities/{identifier}/prices/technicals/vpt | Volume-price Trend
*SecurityApi* | [**getSecurityPriceTechnicalsVwap**](docs/SecurityApi.md#getSecurityPriceTechnicalsVwap) | **GET** /securities/{identifier}/prices/technicals/vwap | Volume Weighted Average Price
*SecurityApi* | [**getSecurityPriceTechnicalsWr**](docs/SecurityApi.md#getSecurityPriceTechnicalsWr) | **GET** /securities/{identifier}/prices/technicals/wr | Williams %R
*SecurityApi* | [**getSecurityRealtimePrice**](docs/SecurityApi.md#getSecurityRealtimePrice) | **GET** /securities/{identifier}/prices/realtime | Realtime Stock Price for Security
*SecurityApi* | [**getSecurityStockPriceAdjustments**](docs/SecurityApi.md#getSecurityStockPriceAdjustments) | **GET** /securities/{identifier}/prices/adjustments | Stock Price Adjustments by Security
*SecurityApi* | [**getSecurityStockPrices**](docs/SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Stock Prices by Security
*SecurityApi* | [**getSecurityZacksAnalystRatings**](docs/SecurityApi.md#getSecurityZacksAnalystRatings) | **GET** /securities/{identifier}/zacks/analyst_ratings | Zacks Analyst Ratings for Security
*SecurityApi* | [**getSecurityZacksAnalystRatingsSnapshot**](docs/SecurityApi.md#getSecurityZacksAnalystRatingsSnapshot) | **GET** /securities/{identifier}/zacks/analyst_ratings/snapshot | Zacks Analyst Ratings Snapshot
*SecurityApi* | [**getSecurityZacksEpsSurprises**](docs/SecurityApi.md#getSecurityZacksEpsSurprises) | **GET** /securities/{identifier}/zacks/eps_surprises | Zacks EPS Surprises for Security
*SecurityApi* | [**getSecurityZacksSalesSurprises**](docs/SecurityApi.md#getSecurityZacksSalesSurprises) | **GET** /securities/{identifier}/zacks/sales_surprises | Zacks Sales Surprises for Security
*SecurityApi* | [**screenSecurities**](docs/SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
*SecurityApi* | [**searchSecurities**](docs/SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities
*StockExchangeApi* | [**getAllStockExchanges**](docs/StockExchangeApi.md#getAllStockExchanges) | **GET** /stock_exchanges | All Stock Exchanges
*StockExchangeApi* | [**getStockExchangeById**](docs/StockExchangeApi.md#getStockExchangeById) | **GET** /stock_exchanges/{identifier} | Lookup Stock Exchange
*StockExchangeApi* | [**getStockExchangePriceAdjustments**](docs/StockExchangeApi.md#getStockExchangePriceAdjustments) | **GET** /stock_exchanges/{identifier}/prices/adjustments | Stock Price Adjustments by Exchange
*StockExchangeApi* | [**getStockExchangePrices**](docs/StockExchangeApi.md#getStockExchangePrices) | **GET** /stock_exchanges/{identifier}/prices | Stock Prices by Exchange
*StockExchangeApi* | [**getStockExchangeRealtimePrices**](docs/StockExchangeApi.md#getStockExchangeRealtimePrices) | **GET** /stock_exchanges/{identifier}/prices/realtime | Realtime Stock Prices by Exchange
*StockExchangeApi* | [**getStockExchangeSecurities**](docs/StockExchangeApi.md#getStockExchangeSecurities) | **GET** /stock_exchanges/{identifier}/securities | Securities by Exchange
*TechnicalApi* | [**getSecurityPriceTechnicalsAdi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsAdi) | **GET** /securities/{identifier}/prices/technicals/adi | Accumulation/Distribution Index
*TechnicalApi* | [**getSecurityPriceTechnicalsAdtv**](docs/TechnicalApi.md#getSecurityPriceTechnicalsAdtv) | **GET** /securities/{identifier}/prices/technicals/adtv | Average Daily Trading Volume
*TechnicalApi* | [**getSecurityPriceTechnicalsAdx**](docs/TechnicalApi.md#getSecurityPriceTechnicalsAdx) | **GET** /securities/{identifier}/prices/technicals/adx | Average Directional Index
*TechnicalApi* | [**getSecurityPriceTechnicalsAo**](docs/TechnicalApi.md#getSecurityPriceTechnicalsAo) | **GET** /securities/{identifier}/prices/technicals/ao | Awesome Oscillator
*TechnicalApi* | [**getSecurityPriceTechnicalsAtr**](docs/TechnicalApi.md#getSecurityPriceTechnicalsAtr) | **GET** /securities/{identifier}/prices/technicals/atr | Average True Range
*TechnicalApi* | [**getSecurityPriceTechnicalsBb**](docs/TechnicalApi.md#getSecurityPriceTechnicalsBb) | **GET** /securities/{identifier}/prices/technicals/bb | Bollinger Bands
*TechnicalApi* | [**getSecurityPriceTechnicalsCci**](docs/TechnicalApi.md#getSecurityPriceTechnicalsCci) | **GET** /securities/{identifier}/prices/technicals/cci | Commodity Channel Index
*TechnicalApi* | [**getSecurityPriceTechnicalsCmf**](docs/TechnicalApi.md#getSecurityPriceTechnicalsCmf) | **GET** /securities/{identifier}/prices/technicals/cmf | Chaikin Money Flow
*TechnicalApi* | [**getSecurityPriceTechnicalsDc**](docs/TechnicalApi.md#getSecurityPriceTechnicalsDc) | **GET** /securities/{identifier}/prices/technicals/dc | Donchian Channel
*TechnicalApi* | [**getSecurityPriceTechnicalsDpo**](docs/TechnicalApi.md#getSecurityPriceTechnicalsDpo) | **GET** /securities/{identifier}/prices/technicals/dpo | Detrended Price Oscillator
*TechnicalApi* | [**getSecurityPriceTechnicalsEom**](docs/TechnicalApi.md#getSecurityPriceTechnicalsEom) | **GET** /securities/{identifier}/prices/technicals/eom | Ease of Movement
*TechnicalApi* | [**getSecurityPriceTechnicalsFi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsFi) | **GET** /securities/{identifier}/prices/technicals/fi | Force Index
*TechnicalApi* | [**getSecurityPriceTechnicalsIchimoku**](docs/TechnicalApi.md#getSecurityPriceTechnicalsIchimoku) | **GET** /securities/{identifier}/prices/technicals/ichimoku | Ichimoku Kinko Hyo
*TechnicalApi* | [**getSecurityPriceTechnicalsKc**](docs/TechnicalApi.md#getSecurityPriceTechnicalsKc) | **GET** /securities/{identifier}/prices/technicals/kc | Keltner Channel
*TechnicalApi* | [**getSecurityPriceTechnicalsKst**](docs/TechnicalApi.md#getSecurityPriceTechnicalsKst) | **GET** /securities/{identifier}/prices/technicals/kst | Know Sure Thing
*TechnicalApi* | [**getSecurityPriceTechnicalsMacd**](docs/TechnicalApi.md#getSecurityPriceTechnicalsMacd) | **GET** /securities/{identifier}/prices/technicals/macd | Moving Average Convergence Divergence
*TechnicalApi* | [**getSecurityPriceTechnicalsMfi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsMfi) | **GET** /securities/{identifier}/prices/technicals/mfi | Money Flow Index
*TechnicalApi* | [**getSecurityPriceTechnicalsMi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsMi) | **GET** /securities/{identifier}/prices/technicals/mi | Mass Index
*TechnicalApi* | [**getSecurityPriceTechnicalsNvi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsNvi) | **GET** /securities/{identifier}/prices/technicals/nvi | Negative Volume Index
*TechnicalApi* | [**getSecurityPriceTechnicalsObv**](docs/TechnicalApi.md#getSecurityPriceTechnicalsObv) | **GET** /securities/{identifier}/prices/technicals/obv | On-balance Volume
*TechnicalApi* | [**getSecurityPriceTechnicalsObvMean**](docs/TechnicalApi.md#getSecurityPriceTechnicalsObvMean) | **GET** /securities/{identifier}/prices/technicals/obv_mean | On-balance Volume Mean
*TechnicalApi* | [**getSecurityPriceTechnicalsRsi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsRsi) | **GET** /securities/{identifier}/prices/technicals/rsi | Relative Strength Index
*TechnicalApi* | [**getSecurityPriceTechnicalsSma**](docs/TechnicalApi.md#getSecurityPriceTechnicalsSma) | **GET** /securities/{identifier}/prices/technicals/sma | Simple Moving Average
*TechnicalApi* | [**getSecurityPriceTechnicalsSr**](docs/TechnicalApi.md#getSecurityPriceTechnicalsSr) | **GET** /securities/{identifier}/prices/technicals/sr | Stochastic Oscillator
*TechnicalApi* | [**getSecurityPriceTechnicalsTrix**](docs/TechnicalApi.md#getSecurityPriceTechnicalsTrix) | **GET** /securities/{identifier}/prices/technicals/trix | Triple Exponential Average
*TechnicalApi* | [**getSecurityPriceTechnicalsTsi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsTsi) | **GET** /securities/{identifier}/prices/technicals/tsi | True Strength Index
*TechnicalApi* | [**getSecurityPriceTechnicalsUo**](docs/TechnicalApi.md#getSecurityPriceTechnicalsUo) | **GET** /securities/{identifier}/prices/technicals/uo | Ultimate Oscillator
*TechnicalApi* | [**getSecurityPriceTechnicalsVi**](docs/TechnicalApi.md#getSecurityPriceTechnicalsVi) | **GET** /securities/{identifier}/prices/technicals/vi | Vortex Indicator
*TechnicalApi* | [**getSecurityPriceTechnicalsVpt**](docs/TechnicalApi.md#getSecurityPriceTechnicalsVpt) | **GET** /securities/{identifier}/prices/technicals/vpt | Volume-price Trend
*TechnicalApi* | [**getSecurityPriceTechnicalsVwap**](docs/TechnicalApi.md#getSecurityPriceTechnicalsVwap) | **GET** /securities/{identifier}/prices/technicals/vwap | Volume Weighted Average Price
*TechnicalApi* | [**getSecurityPriceTechnicalsWr**](docs/TechnicalApi.md#getSecurityPriceTechnicalsWr) | **GET** /securities/{identifier}/prices/technicals/wr | Williams %R
*ZacksApi* | [**getZacksAnalystRatings**](docs/ZacksApi.md#getZacksAnalystRatings) | **GET** /zacks/analyst_ratings | Zacks Analyst Ratings
*ZacksApi* | [**getZacksEpsEstimates**](docs/ZacksApi.md#getZacksEpsEstimates) | **GET** /zacks/eps_estimates | Zacks EPS Estimates
*ZacksApi* | [**getZacksEpsGrowthRates**](docs/ZacksApi.md#getZacksEpsGrowthRates) | **GET** /zacks/eps_growth_rates | Zacks EPS Growth Rates
*ZacksApi* | [**getZacksEpsSurprises**](docs/ZacksApi.md#getZacksEpsSurprises) | **GET** /zacks/eps_surprises | Zacks EPS Surprises
*ZacksApi* | [**getZacksEtfHoldings**](docs/ZacksApi.md#getZacksEtfHoldings) | **GET** /zacks/etf_holdings | Zacks ETF Holdings
*ZacksApi* | [**getZacksInstitutionalHoldingCompanies**](docs/ZacksApi.md#getZacksInstitutionalHoldingCompanies) | **GET** /zacks/institutional_holdings/companies | Zacks Institutional Holding Companies
*ZacksApi* | [**getZacksInstitutionalHoldingOwners**](docs/ZacksApi.md#getZacksInstitutionalHoldingOwners) | **GET** /zacks/institutional_holdings/owners | Zacks Institutional Holding Owners
*ZacksApi* | [**getZacksInstitutionalHoldings**](docs/ZacksApi.md#getZacksInstitutionalHoldings) | **GET** /zacks/institutional_holdings | Zacks Institutional Holdings
*ZacksApi* | [**getZacksLongTermGrowthRates**](docs/ZacksApi.md#getZacksLongTermGrowthRates) | **GET** /zacks/long_term_growth_rates | Zacks Long Term Growth Rates
*ZacksApi* | [**getZacksSalesSurprises**](docs/ZacksApi.md#getZacksSalesSurprises) | **GET** /zacks/sales_surprises | Zacks Sales Surprises
*ZacksApi* | [**getZacksTargetPriceConsensuses**](docs/ZacksApi.md#getZacksTargetPriceConsensuses) | **GET** /zacks/target_price_consensuses | Zacks Target Price Consensuses


## Documentation for Models

 - [AccumulationDistributionIndexTechnicalValue](docs/AccumulationDistributionIndexTechnicalValue.md)
 - [ApiResponseBulkDownloadLinks](docs/ApiResponseBulkDownloadLinks.md)
 - [ApiResponseCompanies](docs/ApiResponseCompanies.md)
 - [ApiResponseCompaniesSearch](docs/ApiResponseCompaniesSearch.md)
 - [ApiResponseCompanyFilings](docs/ApiResponseCompanyFilings.md)
 - [ApiResponseCompanyFundamentals](docs/ApiResponseCompanyFundamentals.md)
 - [ApiResponseCompanyHistoricalData](docs/ApiResponseCompanyHistoricalData.md)
 - [ApiResponseCompanyInsiderTransactionFilings](docs/ApiResponseCompanyInsiderTransactionFilings.md)
 - [ApiResponseCompanyNews](docs/ApiResponseCompanyNews.md)
 - [ApiResponseCompanySecurities](docs/ApiResponseCompanySecurities.md)
 - [ApiResponseCompanySharesOutstanding](docs/ApiResponseCompanySharesOutstanding.md)
 - [ApiResponseDataTags](docs/ApiResponseDataTags.md)
 - [ApiResponseDataTagsSearch](docs/ApiResponseDataTagsSearch.md)
 - [ApiResponseETFHoldings](docs/ApiResponseETFHoldings.md)
 - [ApiResponseETFs](docs/ApiResponseETFs.md)
 - [ApiResponseEconomicIndexHistoricalData](docs/ApiResponseEconomicIndexHistoricalData.md)
 - [ApiResponseEconomicIndices](docs/ApiResponseEconomicIndices.md)
 - [ApiResponseEconomicIndicesSearch](docs/ApiResponseEconomicIndicesSearch.md)
 - [ApiResponseFilingFundamentals](docs/ApiResponseFilingFundamentals.md)
 - [ApiResponseFilingNotes](docs/ApiResponseFilingNotes.md)
 - [ApiResponseFilingNotesSearch](docs/ApiResponseFilingNotesSearch.md)
 - [ApiResponseFilings](docs/ApiResponseFilings.md)
 - [ApiResponseForexCurrencies](docs/ApiResponseForexCurrencies.md)
 - [ApiResponseForexPairs](docs/ApiResponseForexPairs.md)
 - [ApiResponseForexPrices](docs/ApiResponseForexPrices.md)
 - [ApiResponseHistoricalData](docs/ApiResponseHistoricalData.md)
 - [ApiResponseInitialPublicOfferings](docs/ApiResponseInitialPublicOfferings.md)
 - [ApiResponseInsiderTransactionFilings](docs/ApiResponseInsiderTransactionFilings.md)
 - [ApiResponseMunicipalities](docs/ApiResponseMunicipalities.md)
 - [ApiResponseMunicipalitiyFinancials](docs/ApiResponseMunicipalitiyFinancials.md)
 - [ApiResponseNews](docs/ApiResponseNews.md)
 - [ApiResponseOptionPrices](docs/ApiResponseOptionPrices.md)
 - [ApiResponseOptions](docs/ApiResponseOptions.md)
 - [ApiResponseOptionsChain](docs/ApiResponseOptionsChain.md)
 - [ApiResponseOptionsChainRealtime](docs/ApiResponseOptionsChainRealtime.md)
 - [ApiResponseOptionsExpirations](docs/ApiResponseOptionsExpirations.md)
 - [ApiResponseOptionsPriceRealtime](docs/ApiResponseOptionsPriceRealtime.md)
 - [ApiResponseOptionsPricesBatchRealtime](docs/ApiResponseOptionsPricesBatchRealtime.md)
 - [ApiResponseOptionsRealtime](docs/ApiResponseOptionsRealtime.md)
 - [ApiResponseOptionsStatsRealtime](docs/ApiResponseOptionsStatsRealtime.md)
 - [ApiResponseOwnerInsiderTransactionFilings](docs/ApiResponseOwnerInsiderTransactionFilings.md)
 - [ApiResponseOwnerInstitutionalHoldings](docs/ApiResponseOwnerInstitutionalHoldings.md)
 - [ApiResponseOwners](docs/ApiResponseOwners.md)
 - [ApiResponseReportedFinancials](docs/ApiResponseReportedFinancials.md)
 - [ApiResponseSICIndexHistoricalData](docs/ApiResponseSICIndexHistoricalData.md)
 - [ApiResponseSICIndices](docs/ApiResponseSICIndices.md)
 - [ApiResponseSICIndicesSearch](docs/ApiResponseSICIndicesSearch.md)
 - [ApiResponseSecurities](docs/ApiResponseSecurities.md)
 - [ApiResponseSecuritiesSearch](docs/ApiResponseSecuritiesSearch.md)
 - [ApiResponseSecurityAccumulationDistributionIndex](docs/ApiResponseSecurityAccumulationDistributionIndex.md)
 - [ApiResponseSecurityAverageDailyTradingVolume](docs/ApiResponseSecurityAverageDailyTradingVolume.md)
 - [ApiResponseSecurityAverageDirectionalIndex](docs/ApiResponseSecurityAverageDirectionalIndex.md)
 - [ApiResponseSecurityAverageTrueRange](docs/ApiResponseSecurityAverageTrueRange.md)
 - [ApiResponseSecurityAwesomeOscillator](docs/ApiResponseSecurityAwesomeOscillator.md)
 - [ApiResponseSecurityBollingerBands](docs/ApiResponseSecurityBollingerBands.md)
 - [ApiResponseSecurityChaikinMoneyFlow](docs/ApiResponseSecurityChaikinMoneyFlow.md)
 - [ApiResponseSecurityCommodityChannelIndex](docs/ApiResponseSecurityCommodityChannelIndex.md)
 - [ApiResponseSecurityDetrendedPriceOscillator](docs/ApiResponseSecurityDetrendedPriceOscillator.md)
 - [ApiResponseSecurityDonchianChannel](docs/ApiResponseSecurityDonchianChannel.md)
 - [ApiResponseSecurityEaseOfMovement](docs/ApiResponseSecurityEaseOfMovement.md)
 - [ApiResponseSecurityForceIndex](docs/ApiResponseSecurityForceIndex.md)
 - [ApiResponseSecurityHistoricalData](docs/ApiResponseSecurityHistoricalData.md)
 - [ApiResponseSecurityIchimokuKinkoHyo](docs/ApiResponseSecurityIchimokuKinkoHyo.md)
 - [ApiResponseSecurityInstitutionalOwnership](docs/ApiResponseSecurityInstitutionalOwnership.md)
 - [ApiResponseSecurityIntervalPrices](docs/ApiResponseSecurityIntervalPrices.md)
 - [ApiResponseSecurityIntradayPrices](docs/ApiResponseSecurityIntradayPrices.md)
 - [ApiResponseSecurityKeltnerChannel](docs/ApiResponseSecurityKeltnerChannel.md)
 - [ApiResponseSecurityKnowSureThing](docs/ApiResponseSecurityKnowSureThing.md)
 - [ApiResponseSecurityMassIndex](docs/ApiResponseSecurityMassIndex.md)
 - [ApiResponseSecurityMoneyFlowIndex](docs/ApiResponseSecurityMoneyFlowIndex.md)
 - [ApiResponseSecurityMovingAverageConvergenceDivergence](docs/ApiResponseSecurityMovingAverageConvergenceDivergence.md)
 - [ApiResponseSecurityNegativeVolumeIndex](docs/ApiResponseSecurityNegativeVolumeIndex.md)
 - [ApiResponseSecurityOnBalanceVolume](docs/ApiResponseSecurityOnBalanceVolume.md)
 - [ApiResponseSecurityOnBalanceVolumeMean](docs/ApiResponseSecurityOnBalanceVolumeMean.md)
 - [ApiResponseSecurityRelativeStrengthIndex](docs/ApiResponseSecurityRelativeStrengthIndex.md)
 - [ApiResponseSecuritySimpleMovingAverage](docs/ApiResponseSecuritySimpleMovingAverage.md)
 - [ApiResponseSecurityStochasticOscillator](docs/ApiResponseSecurityStochasticOscillator.md)
 - [ApiResponseSecurityStockPriceAdjustments](docs/ApiResponseSecurityStockPriceAdjustments.md)
 - [ApiResponseSecurityStockPrices](docs/ApiResponseSecurityStockPrices.md)
 - [ApiResponseSecurityTripleExponentialAverage](docs/ApiResponseSecurityTripleExponentialAverage.md)
 - [ApiResponseSecurityTrueStrengthIndex](docs/ApiResponseSecurityTrueStrengthIndex.md)
 - [ApiResponseSecurityUltimateOscillator](docs/ApiResponseSecurityUltimateOscillator.md)
 - [ApiResponseSecurityVolumePriceTrend](docs/ApiResponseSecurityVolumePriceTrend.md)
 - [ApiResponseSecurityVolumeWeightedAveragePrice](docs/ApiResponseSecurityVolumeWeightedAveragePrice.md)
 - [ApiResponseSecurityVortexIndicator](docs/ApiResponseSecurityVortexIndicator.md)
 - [ApiResponseSecurityWilliamsR](docs/ApiResponseSecurityWilliamsR.md)
 - [ApiResponseSecurityZacksAnalystRatings](docs/ApiResponseSecurityZacksAnalystRatings.md)
 - [ApiResponseSecurityZacksAnalystRatingsSnapshot](docs/ApiResponseSecurityZacksAnalystRatingsSnapshot.md)
 - [ApiResponseSecurityZacksEPSSurprises](docs/ApiResponseSecurityZacksEPSSurprises.md)
 - [ApiResponseSecurityZacksSalesSurprises](docs/ApiResponseSecurityZacksSalesSurprises.md)
 - [ApiResponseStandardizedFinancials](docs/ApiResponseStandardizedFinancials.md)
 - [ApiResponseStockExchangeRealtimeStockPrices](docs/ApiResponseStockExchangeRealtimeStockPrices.md)
 - [ApiResponseStockExchangeSecurities](docs/ApiResponseStockExchangeSecurities.md)
 - [ApiResponseStockExchangeStockPriceAdjustments](docs/ApiResponseStockExchangeStockPriceAdjustments.md)
 - [ApiResponseStockExchangeStockPrices](docs/ApiResponseStockExchangeStockPrices.md)
 - [ApiResponseStockExchanges](docs/ApiResponseStockExchanges.md)
 - [ApiResponseStockMarketIndexHistoricalData](docs/ApiResponseStockMarketIndexHistoricalData.md)
 - [ApiResponseStockMarketIndices](docs/ApiResponseStockMarketIndices.md)
 - [ApiResponseStockMarketIndicesSearch](docs/ApiResponseStockMarketIndicesSearch.md)
 - [ApiResponseZacksAnalystRatings](docs/ApiResponseZacksAnalystRatings.md)
 - [ApiResponseZacksEPSEstimates](docs/ApiResponseZacksEPSEstimates.md)
 - [ApiResponseZacksEPSGrowthRates](docs/ApiResponseZacksEPSGrowthRates.md)
 - [ApiResponseZacksEPSSurprises](docs/ApiResponseZacksEPSSurprises.md)
 - [ApiResponseZacksETFHoldings](docs/ApiResponseZacksETFHoldings.md)
 - [ApiResponseZacksInstitutionalHoldingCompanies](docs/ApiResponseZacksInstitutionalHoldingCompanies.md)
 - [ApiResponseZacksInstitutionalHoldingOwners](docs/ApiResponseZacksInstitutionalHoldingOwners.md)
 - [ApiResponseZacksInstitutionalHoldings](docs/ApiResponseZacksInstitutionalHoldings.md)
 - [ApiResponseZacksLongTermGrowthRates](docs/ApiResponseZacksLongTermGrowthRates.md)
 - [ApiResponseZacksSalesSurprises](docs/ApiResponseZacksSalesSurprises.md)
 - [ApiResponseZacksTargetPriceConsensuses](docs/ApiResponseZacksTargetPriceConsensuses.md)
 - [AverageDailyTradingVolumeTechnicalValue](docs/AverageDailyTradingVolumeTechnicalValue.md)
 - [AverageDirectionalIndexTechnicalValue](docs/AverageDirectionalIndexTechnicalValue.md)
 - [AverageTrueRangeTechnicalValue](docs/AverageTrueRangeTechnicalValue.md)
 - [AwesomeOscillatorTechnicalValue](docs/AwesomeOscillatorTechnicalValue.md)
 - [BollingerBandsTechnicalValue](docs/BollingerBandsTechnicalValue.md)
 - [BulkDownloadLinks](docs/BulkDownloadLinks.md)
 - [BulkDownloadSummary](docs/BulkDownloadSummary.md)
 - [ChaikinMoneyFlowTechnicalValue](docs/ChaikinMoneyFlowTechnicalValue.md)
 - [CommodityChannelIndexTechnicalValue](docs/CommodityChannelIndexTechnicalValue.md)
 - [Company](docs/Company.md)
 - [CompanyFiling](docs/CompanyFiling.md)
 - [CompanyInitialPublicOffering](docs/CompanyInitialPublicOffering.md)
 - [CompanyNews](docs/CompanyNews.md)
 - [CompanyNewsSummary](docs/CompanyNewsSummary.md)
 - [CompanySharesOutstanding](docs/CompanySharesOutstanding.md)
 - [CompanySummary](docs/CompanySummary.md)
 - [DataTag](docs/DataTag.md)
 - [DataTagSummary](docs/DataTagSummary.md)
 - [DetrendedPriceOscillatorTechnicalValue](docs/DetrendedPriceOscillatorTechnicalValue.md)
 - [DividendRecord](docs/DividendRecord.md)
 - [DonchianChannelTechnicalValue](docs/DonchianChannelTechnicalValue.md)
 - [ETF](docs/ETF.md)
 - [ETFAnalytics](docs/ETFAnalytics.md)
 - [ETFHolding](docs/ETFHolding.md)
 - [ETFStats](docs/ETFStats.md)
 - [ETFSummary](docs/ETFSummary.md)
 - [EarningsRecord](docs/EarningsRecord.md)
 - [EaseOfMovementTechnicalValue](docs/EaseOfMovementTechnicalValue.md)
 - [EconomicIndex](docs/EconomicIndex.md)
 - [EconomicIndexSummary](docs/EconomicIndexSummary.md)
 - [Filing](docs/Filing.md)
 - [FilingNote](docs/FilingNote.md)
 - [FilingNoteFiling](docs/FilingNoteFiling.md)
 - [FilingNoteSummary](docs/FilingNoteSummary.md)
 - [FilingSummary](docs/FilingSummary.md)
 - [ForceIndexTechnicalValue](docs/ForceIndexTechnicalValue.md)
 - [ForexCurrency](docs/ForexCurrency.md)
 - [ForexPair](docs/ForexPair.md)
 - [ForexPrice](docs/ForexPrice.md)
 - [Fundamental](docs/Fundamental.md)
 - [FundamentalSummary](docs/FundamentalSummary.md)
 - [HistoricalData](docs/HistoricalData.md)
 - [IchimokuKinkoHyoTechnicalValue](docs/IchimokuKinkoHyoTechnicalValue.md)
 - [InsiderTransaction](docs/InsiderTransaction.md)
 - [InsiderTransactionFiling](docs/InsiderTransactionFiling.md)
 - [InstitutionalHolding](docs/InstitutionalHolding.md)
 - [InstitutionalOwnership](docs/InstitutionalOwnership.md)
 - [IntradayStockPrice](docs/IntradayStockPrice.md)
 - [KeltnerChannelTechnicalValue](docs/KeltnerChannelTechnicalValue.md)
 - [KnowSureThingTechnicalValue](docs/KnowSureThingTechnicalValue.md)
 - [MassIndexTechnicalValue](docs/MassIndexTechnicalValue.md)
 - [MoneyFlowIndexTechnicalValue](docs/MoneyFlowIndexTechnicalValue.md)
 - [MovingAverageConvergenceDivergenceTechnicalValue](docs/MovingAverageConvergenceDivergenceTechnicalValue.md)
 - [Municipality](docs/Municipality.md)
 - [MunicipalityFinancial](docs/MunicipalityFinancial.md)
 - [NegativeVolumeIndexTechnicalValue](docs/NegativeVolumeIndexTechnicalValue.md)
 - [OnBalanceVolumeMeanTechnicalValue](docs/OnBalanceVolumeMeanTechnicalValue.md)
 - [OnBalanceVolumeTechnicalValue](docs/OnBalanceVolumeTechnicalValue.md)
 - [Option](docs/Option.md)
 - [OptionChain](docs/OptionChain.md)
 - [OptionChainRealtime](docs/OptionChainRealtime.md)
 - [OptionContractsList](docs/OptionContractsList.md)
 - [OptionFactorsRealtime](docs/OptionFactorsRealtime.md)
 - [OptionPrice](docs/OptionPrice.md)
 - [OptionPriceBatchRealtime](docs/OptionPriceBatchRealtime.md)
 - [OptionPriceRealtime](docs/OptionPriceRealtime.md)
 - [OptionRealtime](docs/OptionRealtime.md)
 - [OptionStatsRealtime](docs/OptionStatsRealtime.md)
 - [Owner](docs/Owner.md)
 - [OwnerSummary](docs/OwnerSummary.md)
 - [RealtimeStockPrice](docs/RealtimeStockPrice.md)
 - [RealtimeStockPriceSecurity](docs/RealtimeStockPriceSecurity.md)
 - [RelativeStrengthIndexTechnicalValue](docs/RelativeStrengthIndexTechnicalValue.md)
 - [ReportedFinancial](docs/ReportedFinancial.md)
 - [ReportedFinancialDimension](docs/ReportedFinancialDimension.md)
 - [ReportedTag](docs/ReportedTag.md)
 - [SICIndex](docs/SICIndex.md)
 - [Security](docs/Security.md)
 - [SecurityScreenClause](docs/SecurityScreenClause.md)
 - [SecurityScreenGroup](docs/SecurityScreenGroup.md)
 - [SecurityScreenResult](docs/SecurityScreenResult.md)
 - [SecurityScreenResultData](docs/SecurityScreenResultData.md)
 - [SecuritySummary](docs/SecuritySummary.md)
 - [SimpleMovingAverageTechnicalValue](docs/SimpleMovingAverageTechnicalValue.md)
 - [StandardizedFinancial](docs/StandardizedFinancial.md)
 - [StochasticOscillatorTechnicalValue](docs/StochasticOscillatorTechnicalValue.md)
 - [StockExchange](docs/StockExchange.md)
 - [StockMarketIndex](docs/StockMarketIndex.md)
 - [StockMarketIndexSummary](docs/StockMarketIndexSummary.md)
 - [StockPrice](docs/StockPrice.md)
 - [StockPriceAdjustment](docs/StockPriceAdjustment.md)
 - [StockPriceAdjustmentSummary](docs/StockPriceAdjustmentSummary.md)
 - [StockPriceInterval](docs/StockPriceInterval.md)
 - [StockPriceSummary](docs/StockPriceSummary.md)
 - [TechnicalIndicator](docs/TechnicalIndicator.md)
 - [TripleExponentialAverageTechnicalValue](docs/TripleExponentialAverageTechnicalValue.md)
 - [TrueStrengthIndexTechnicalValue](docs/TrueStrengthIndexTechnicalValue.md)
 - [UltimateOscillatorTechnicalValue](docs/UltimateOscillatorTechnicalValue.md)
 - [VolumePriceTrendTechnicalValue](docs/VolumePriceTrendTechnicalValue.md)
 - [VolumeWeightedAveragePriceValue](docs/VolumeWeightedAveragePriceValue.md)
 - [VortexIndicatorTechnicalValue](docs/VortexIndicatorTechnicalValue.md)
 - [WilliamsRTechnicalValue](docs/WilliamsRTechnicalValue.md)
 - [ZacksAnalystRating](docs/ZacksAnalystRating.md)
 - [ZacksAnalystRatingSnapshot](docs/ZacksAnalystRatingSnapshot.md)
 - [ZacksAnalystRatingSummary](docs/ZacksAnalystRatingSummary.md)
 - [ZacksEPSEstimate](docs/ZacksEPSEstimate.md)
 - [ZacksEPSGrowthRate](docs/ZacksEPSGrowthRate.md)
 - [ZacksEPSSurprise](docs/ZacksEPSSurprise.md)
 - [ZacksEPSSurpriseSummary](docs/ZacksEPSSurpriseSummary.md)
 - [ZacksETFHolding](docs/ZacksETFHolding.md)
 - [ZacksInstitutionalHolding](docs/ZacksInstitutionalHolding.md)
 - [ZacksInstitutionalHoldingCompanyDetail](docs/ZacksInstitutionalHoldingCompanyDetail.md)
 - [ZacksInstitutionalHoldingCompanySummary](docs/ZacksInstitutionalHoldingCompanySummary.md)
 - [ZacksInstitutionalHoldingHistoricalSummary](docs/ZacksInstitutionalHoldingHistoricalSummary.md)
 - [ZacksInstitutionalHoldingOwnerDetail](docs/ZacksInstitutionalHoldingOwnerDetail.md)
 - [ZacksInstitutionalHoldingOwnerSummary](docs/ZacksInstitutionalHoldingOwnerSummary.md)
 - [ZacksLongTermGrowthRate](docs/ZacksLongTermGrowthRate.md)
 - [ZacksSalesSurprise](docs/ZacksSalesSurprise.md)
 - [ZacksSalesSurpriseSummary](docs/ZacksSalesSurpriseSummary.md)
 - [ZacksTargetPriceConsensus](docs/ZacksTargetPriceConsensus.md)
