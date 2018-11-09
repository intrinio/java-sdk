# Intrinio Java SDK

WARNING: THIS IS IS A BETA - DO NOT USE IN PRODUCTION.

To request a beta access key, [sign up here](https://intrinio.com/api-v2-beta).

Welcome to the Intrinio API! Through our Marketplace, we offer a wide selection of financial data feeds sourced by our own proprietary processes as well as from many data vendors. The primary application of the Intrinio API is for use in third-party applications and integrations or for end-users utilizing the Excel add-in and Google Sheets add-on. The Intrinio API uses HTTPS verbs and a RESTful endpoint structure, which makes it easy to request data from Intrinio. Responses are delivered in JSON format. If you need additional help in using the API, go to our home page (https://intrinio.com) and click on the chat icon in the lower right corner.

- API version: 2.0.2


## Requirements

Building the Intrinio Java SDK requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the Intrinio Java SDK to your local Maven repository, simply execute:

```shell
mvn install
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.intrinio</groupId>
    <artifactId>sdk</artifactId>
    <version>0.9.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.intrinio:sdk:0.9.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/sdk-0.9.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instructions and execute the following Java code:

```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import .;

import java.io.File;
import java.util.*;

public class CompanyApiExample {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
        auth.setApiKey("YOUR API KEY");

        CompanyApi companyApi = new CompanyApi();
      
        try {
            List<CompanySummary> result = companyApi.getAllCompanies(null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#filterCompanies");
            e.printStackTrace();
        }
    }
}
```

## Multi-threading Recommendation

It's recommended to create one instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Documentation for API Endpoints

All URIs are relative to *https://api-v2.intrinio.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompanyApi* | [**filterCompanies**](docs/CompanyApi.md#filterCompanies) | **GET** /companies/filter | Filter Companies
*CompanyApi* | [**filterCompanyFundamentals**](docs/CompanyApi.md#filterCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals/filter | Filter Fundamentals for a Company
*CompanyApi* | [**getAllCompanies**](docs/CompanyApi.md#getAllCompanies) | **GET** /companies | Get All Companies
*CompanyApi* | [**getAllCompanyNews**](docs/CompanyApi.md#getAllCompanyNews) | **GET** /companies/news | Get All Company News
*CompanyApi* | [**getCompany**](docs/CompanyApi.md#getCompany) | **GET** /companies/{identifier} | Get a Company by ID
*CompanyApi* | [**getCompanyDataPointNumber**](docs/CompanyApi.md#getCompanyDataPointNumber) | **GET** /companies/{identifier}/data_point/{tag}/number | Get Company Data Point (Number)
*CompanyApi* | [**getCompanyDataPointText**](docs/CompanyApi.md#getCompanyDataPointText) | **GET** /companies/{identifier}/data_point/{tag}/text | Get Company Data Point (Text)
*CompanyApi* | [**getCompanyFilings**](docs/CompanyApi.md#getCompanyFilings) | **GET** /companies/{identifier}/filings | Get Filings for a Company
*CompanyApi* | [**getCompanyFundamentals**](docs/CompanyApi.md#getCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals | Get All Fundamentals for a Company
*CompanyApi* | [**getCompanyHistoricalData**](docs/CompanyApi.md#getCompanyHistoricalData) | **GET** /companies/{identifier}/historical_data/{tag} | Get Company Historical Data
*CompanyApi* | [**getCompanyNews**](docs/CompanyApi.md#getCompanyNews) | **GET** /companies/{identifier}/news | Get News for a Company
*CompanyApi* | [**getCompanySecurities**](docs/CompanyApi.md#getCompanySecurities) | **GET** /companies/{identifier}/securities | Get Securities by Company
*CompanyApi* | [**lookupCompanyFundamental**](docs/CompanyApi.md#lookupCompanyFundamental) | **GET** /companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup a Fundamental for a Company
*CompanyApi* | [**searchCompanies**](docs/CompanyApi.md#searchCompanies) | **GET** /companies/search | Search Companies
*DataPointApi* | [**getDataPointNumber**](docs/DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Get a Data Point (Number)
*DataPointApi* | [**getDataPointText**](docs/DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Get a Data Point (Text)
*DataTagApi* | [**filterDataTags**](docs/DataTagApi.md#filterDataTags) | **GET** /data_tags/filter | Filter Data Tags
*DataTagApi* | [**getAllDataTags**](docs/DataTagApi.md#getAllDataTags) | **GET** /data_tags | Get All Data Tags
*DataTagApi* | [**getDataTagById**](docs/DataTagApi.md#getDataTagById) | **GET** /data_tags/{identifier} | Get a Data Tag by ID
*DataTagApi* | [**searchDataTags**](docs/DataTagApi.md#searchDataTags) | **GET** /data_tags/search | Search Data Tags
*FilingApi* | [**filterFilings**](docs/FilingApi.md#filterFilings) | **GET** /filings/filter | Filter Filings
*FilingApi* | [**getAllFilings**](docs/FilingApi.md#getAllFilings) | **GET** /filings | Get All Filings
*FilingApi* | [**getFilingById**](docs/FilingApi.md#getFilingById) | **GET** /filings/{id} | Get a Filing by ID
*FundamentalsApi* | [**getFundamentalById**](docs/FundamentalsApi.md#getFundamentalById) | **GET** /fundamentals/{id} | Get a Fundamental by ID
*FundamentalsApi* | [**getFundamentalReportedFinancials**](docs/FundamentalsApi.md#getFundamentalReportedFinancials) | **GET** /fundamentals/{id}/reported_financials | Get Reported Financials for a Fundamental
*FundamentalsApi* | [**getFundamentalStandardizedFinancials**](docs/FundamentalsApi.md#getFundamentalStandardizedFinancials) | **GET** /fundamentals/{id}/standardized_financials | Get Standardized Financials for a Fundamental
*FundamentalsApi* | [**lookupFundamental**](docs/FundamentalsApi.md#lookupFundamental) | **GET** /fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup a Fundamental
*HistoricalDataApi* | [**getHistoricalData**](docs/HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Get Historical Data
*IndexApi* | [**getAllEconomicIndices**](docs/IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | Get All Economic Indices
*IndexApi* | [**getAllSicIndices**](docs/IndexApi.md#getAllSicIndices) | **GET** /indices/sic | Get All SIC Indices
*IndexApi* | [**getAllStockMarketIndices**](docs/IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | Get All Stock Market Indices
*IndexApi* | [**getEconomicIndexById**](docs/IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Get an Economic Index by ID
*IndexApi* | [**getEconomicIndexDataPointNumber**](docs/IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{tag}/number | Get Economic Index Data Point (Number)
*IndexApi* | [**getEconomicIndexDataPointText**](docs/IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{tag}/text | Get Economic Index Data Point (Text)
*IndexApi* | [**getEconomicIndexHistoricalData**](docs/IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{tag} | Get Economic Index Historical Data
*IndexApi* | [**getSicIndexById**](docs/IndexApi.md#getSicIndexById) | **GET** /indices/sic/{identifier} | Get an SIC Index by ID
*IndexApi* | [**getSicIndexDataPointNumber**](docs/IndexApi.md#getSicIndexDataPointNumber) | **GET** /indices/sic/{identifier}/data_point/{tag}/number | Get SIC Index Data Point (Number)
*IndexApi* | [**getSicIndexDataPointText**](docs/IndexApi.md#getSicIndexDataPointText) | **GET** /indices/sic/{identifier}/data_point/{tag}/text | Get SIC Index Data Point (Text)
*IndexApi* | [**getSicIndexHistoricalData**](docs/IndexApi.md#getSicIndexHistoricalData) | **GET** /indices/sic/{identifier}/historical_data/{tag} | Get SIC Index Historical Data
*IndexApi* | [**getStockMarketIndexById**](docs/IndexApi.md#getStockMarketIndexById) | **GET** /indices/stock_market/{identifier} | Get a Stock Market Index by ID
*IndexApi* | [**getStockMarketIndexDataPointNumber**](docs/IndexApi.md#getStockMarketIndexDataPointNumber) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/number | Get Stock Market Index Data Point (Number)
*IndexApi* | [**getStockMarketIndexDataPointText**](docs/IndexApi.md#getStockMarketIndexDataPointText) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/text | Get Stock Market Index Data Point (Text)
*IndexApi* | [**getStockMarketIndexHistoricalData**](docs/IndexApi.md#getStockMarketIndexHistoricalData) | **GET** /indices/stock_market/{identifier}/historical_data/{tag} | Get Stock Market Index Historical Data
*IndexApi* | [**searchEconomicIndices**](docs/IndexApi.md#searchEconomicIndices) | **GET** /indices/economic/search | Search Economic Indices
*IndexApi* | [**searchSicIndices**](docs/IndexApi.md#searchSicIndices) | **GET** /indices/sic/search | Search SIC Indices
*IndexApi* | [**searchStockMarketsIndices**](docs/IndexApi.md#searchStockMarketsIndices) | **GET** /indices/stock_market/search | Search Stock Market Indices
*SecurityApi* | [**getAllSecurities**](docs/SecurityApi.md#getAllSecurities) | **GET** /securities | Get All Securiites
*SecurityApi* | [**getSecurityById**](docs/SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Get a Security by ID
*SecurityApi* | [**getSecurityDataPointNumber**](docs/SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{tag}/number | Get Security Data Point (Number)
*SecurityApi* | [**getSecurityDataPointText**](docs/SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{tag}/text | Get Security Data Point (Text)
*SecurityApi* | [**getSecurityHistoricalData**](docs/SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{tag} | Get Security Historical Data
*SecurityApi* | [**getSecurityStockPriceAdjustments**](docs/SecurityApi.md#getSecurityStockPriceAdjustments) | **GET** /securities/{identifier}/prices/adjustments | Get Stock Price Adjustments for Security
*SecurityApi* | [**getSecurityStockPrices**](docs/SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Get Stock Prices for Security
*SecurityApi* | [**screenSecurities**](docs/SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
*SecurityApi* | [**searchSecurities**](docs/SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities
*StockExchangeApi* | [**filterStockExchanges**](docs/StockExchangeApi.md#filterStockExchanges) | **GET** /stock_exchanges/filter | Filter Stock Exchanges
*StockExchangeApi* | [**getAllStockExchanges**](docs/StockExchangeApi.md#getAllStockExchanges) | **GET** /stock_exchanges | Get All Stock Exchanges
*StockExchangeApi* | [**getStockExchangeById**](docs/StockExchangeApi.md#getStockExchangeById) | **GET** /stock_exchanges/{identifier} | Get Stock Exchange by ID
*StockExchangeApi* | [**getStockExchangePriceAdjustments**](docs/StockExchangeApi.md#getStockExchangePriceAdjustments) | **GET** /stock_exchanges/{identifier}/prices/adjustments | Get Stock Price Adjustments by Exchange
*StockExchangeApi* | [**getStockExchangePrices**](docs/StockExchangeApi.md#getStockExchangePrices) | **GET** /stock_exchanges/{identifier}/prices | Get Stock Prices by Exchange
*StockExchangeApi* | [**getStockExchangeSecurities**](docs/StockExchangeApi.md#getStockExchangeSecurities) | **GET** /stock_exchanges/{identifier}/securities | Get Securities by Exchange


## Documentation for Models

 - [ApiResponseCompanies](docs/ApiResponseCompanies.md)
 - [ApiResponseCompanyFilings](docs/ApiResponseCompanyFilings.md)
 - [ApiResponseCompanyFundamentals](docs/ApiResponseCompanyFundamentals.md)
 - [ApiResponseCompanyHistoricalData](docs/ApiResponseCompanyHistoricalData.md)
 - [ApiResponseCompanyNews](docs/ApiResponseCompanyNews.md)
 - [ApiResponseCompanySecurities](docs/ApiResponseCompanySecurities.md)
 - [ApiResponseDataTags](docs/ApiResponseDataTags.md)
 - [ApiResponseEconomicIndexHistoricalData](docs/ApiResponseEconomicIndexHistoricalData.md)
 - [ApiResponseEconomicIndices](docs/ApiResponseEconomicIndices.md)
 - [ApiResponseFilings](docs/ApiResponseFilings.md)
 - [ApiResponseHistoricalData](docs/ApiResponseHistoricalData.md)
 - [ApiResponseNews](docs/ApiResponseNews.md)
 - [ApiResponseReportedFinancials](docs/ApiResponseReportedFinancials.md)
 - [ApiResponseSICIndexHistoricalData](docs/ApiResponseSICIndexHistoricalData.md)
 - [ApiResponseSICIndices](docs/ApiResponseSICIndices.md)
 - [ApiResponseSecurities](docs/ApiResponseSecurities.md)
 - [ApiResponseSecurityHistoricalData](docs/ApiResponseSecurityHistoricalData.md)
 - [ApiResponseSecurityStockPriceAdjustments](docs/ApiResponseSecurityStockPriceAdjustments.md)
 - [ApiResponseSecurityStockPrices](docs/ApiResponseSecurityStockPrices.md)
 - [ApiResponseStandardizedFinancials](docs/ApiResponseStandardizedFinancials.md)
 - [ApiResponseStockExchangeSecurities](docs/ApiResponseStockExchangeSecurities.md)
 - [ApiResponseStockExchangeStockPriceAdjustments](docs/ApiResponseStockExchangeStockPriceAdjustments.md)
 - [ApiResponseStockExchangeStockPrices](docs/ApiResponseStockExchangeStockPrices.md)
 - [ApiResponseStockMarketIndexHistoricalData](docs/ApiResponseStockMarketIndexHistoricalData.md)
 - [ApiResponseStockMarketIndices](docs/ApiResponseStockMarketIndices.md)
 - [Company](docs/Company.md)
 - [CompanyFiling](docs/CompanyFiling.md)
 - [CompanyNews](docs/CompanyNews.md)
 - [CompanyNewsSummary](docs/CompanyNewsSummary.md)
 - [CompanySummary](docs/CompanySummary.md)
 - [DataTag](docs/DataTag.md)
 - [DataTagSummary](docs/DataTagSummary.md)
 - [EconomicIndex](docs/EconomicIndex.md)
 - [EconomicIndexSummary](docs/EconomicIndexSummary.md)
 - [Filing](docs/Filing.md)
 - [FilingSummary](docs/FilingSummary.md)
 - [Fundamental](docs/Fundamental.md)
 - [FundamentalSummary](docs/FundamentalSummary.md)
 - [HistoricalData](docs/HistoricalData.md)
 - [ReportedFinancial](docs/ReportedFinancial.md)
 - [ReportedTag](docs/ReportedTag.md)
 - [SICIndex](docs/SICIndex.md)
 - [Security](docs/Security.md)
 - [SecurityScreenClause](docs/SecurityScreenClause.md)
 - [SecurityScreenGroup](docs/SecurityScreenGroup.md)
 - [SecurityScreenResult](docs/SecurityScreenResult.md)
 - [SecurityScreenResultData](docs/SecurityScreenResultData.md)
 - [SecuritySummary](docs/SecuritySummary.md)
 - [StandardizedFinancial](docs/StandardizedFinancial.md)
 - [StockExchange](docs/StockExchange.md)
 - [StockMarketIndex](docs/StockMarketIndex.md)
 - [StockMarketIndexSummary](docs/StockMarketIndexSummary.md)
 - [StockPrice](docs/StockPrice.md)
 - [StockPriceAdjustment](docs/StockPriceAdjustment.md)
 - [StockPriceAdjustmentSummary](docs/StockPriceAdjustmentSummary.md)
 - [StockPriceSummary](docs/StockPriceSummary.md)

