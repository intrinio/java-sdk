# ZacksApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZacksAnalystRatings**](ZacksApi.md#getZacksAnalystRatings) | **GET** /zacks/analyst_ratings | Zacks Analyst Ratings
[**getZacksEpsEstimates**](ZacksApi.md#getZacksEpsEstimates) | **GET** /zacks/eps_estimates | Zacks EPS Estimates
[**getZacksEpsGrowthRates**](ZacksApi.md#getZacksEpsGrowthRates) | **GET** /zacks/eps_growth_rates | Zacks EPS Growth Rates
[**getZacksEpsSurprises**](ZacksApi.md#getZacksEpsSurprises) | **GET** /zacks/eps_surprises | Zacks EPS Surprises
[**getZacksEtfHoldings**](ZacksApi.md#getZacksEtfHoldings) | **GET** /zacks/etf_holdings | Zacks ETF Holdings
[**getZacksInstitutionalHoldingCompanies**](ZacksApi.md#getZacksInstitutionalHoldingCompanies) | **GET** /zacks/institutional_holdings/companies | Zacks Institutional Holding Companies
[**getZacksInstitutionalHoldingOwners**](ZacksApi.md#getZacksInstitutionalHoldingOwners) | **GET** /zacks/institutional_holdings/owners | Zacks Institutional Holding Owners
[**getZacksInstitutionalHoldings**](ZacksApi.md#getZacksInstitutionalHoldings) | **GET** /zacks/institutional_holdings | Zacks Institutional Holdings
[**getZacksLongTermGrowthRates**](ZacksApi.md#getZacksLongTermGrowthRates) | **GET** /zacks/long_term_growth_rates | Zacks Long Term Growth Rates
[**getZacksSalesSurprises**](ZacksApi.md#getZacksSalesSurprises) | **GET** /zacks/sales_surprises | Zacks Sales Surprises
[**getZacksTargetPriceConsensuses**](ZacksApi.md#getZacksTargetPriceConsensuses) | **GET** /zacks/target_price_consensuses | Zacks Target Price Consensuses



[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksAnalystRatings)

[//]: # (RETURN_TYPE:ApiResponseZacksAnalystRatings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksAnalystRatings.md)

[//]: # (OPERATION:getZacksAnalystRatings_v2)

[//]: # (ENDPOINT:/zacks/analyst_ratings)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksAnalystRatings)

<a name="getZacksAnalystRatings"></a>
## **getZacksAnalystRatings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksAnalystRatings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksAnalystRatings getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage)

#### Zacks Analyst Ratings


Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String identifier = "AAPL";
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    BigDecimal meanGreater = null;
    BigDecimal meanLess = null;
    Integer strongBuysGreater = null;
    Integer strongBuysLess = null;
    Integer buysGreater = null;
    Integer buysLess = null;
    Integer holdsGreater = null;
    Integer holdsLess = null;
    Integer sellsGreater = null;
    Integer sellsLess = null;
    Integer strongSellsGreater = null;
    Integer strongSellsLess = null;
    Integer totalGreater = null;
    Integer totalLess = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksAnalystRatings result = zacksApi.getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | [optional] &nbsp;
 **startDate** | LocalDate| Limit ratings to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit ratings to those on or before this date | [optional] &nbsp;
 **meanGreater** | BigDecimal| Return only records with a mean (average) higher than this value | [optional] &nbsp;
 **meanLess** | BigDecimal| Return only records with a mean (average) lower than this value | [optional] &nbsp;
 **strongBuysGreater** | Integer| Return only records with more than this many Strong Buy recommendations | [optional] &nbsp;
 **strongBuysLess** | Integer| Return only records with fewer than this many Strong Buy recommendations | [optional] &nbsp;
 **buysGreater** | Integer| Return only records with more than this many Buy recommendations | [optional] &nbsp;
 **buysLess** | Integer| Return only records with fewer than this many Buy recommendations | [optional] &nbsp;
 **holdsGreater** | Integer| Return only records with more than this many Hold recommendations | [optional] &nbsp;
 **holdsLess** | Integer| Return only records with fewer than this many Hold recommendations | [optional] &nbsp;
 **sellsGreater** | Integer| Return only records with more than this many Sell recommendations | [optional] &nbsp;
 **sellsLess** | Integer| Return only records with fewer than this many Sell recommendations | [optional] &nbsp;
 **strongSellsGreater** | Integer| Return only records with more than this many Strong Sell recommendations | [optional] &nbsp;
 **strongSellsLess** | Integer| Return only records with fewer than this many Strong Sell recommendations | [optional] &nbsp;
 **totalGreater** | Integer| Return only records with more than this many recommendations, regardless of type | [optional] &nbsp;
 **totalLess** | Integer| Return only records with fewer than this many recommendations, regardless of type | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksAnalystRatings**](ApiResponseZacksAnalystRatings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksEpsEstimates)

[//]: # (RETURN_TYPE:ApiResponseZacksEPSEstimates)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksEPSEstimates.md)

[//]: # (OPERATION:getZacksEpsEstimates_v2)

[//]: # (ENDPOINT:/zacks/eps_estimates)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksEpsEstimates)

<a name="getZacksEpsEstimates"></a>
## **getZacksEpsEstimates**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksEpsEstimates_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksEPSEstimates getZacksEpsEstimates(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage)

#### Zacks EPS Estimates


Returns Zacks consensus earnings-per-share (EPS) data for all Companies.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String identifier = "AAPL";
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    Integer fiscalYear = null;
    String fiscalPeriod = null;
    Integer calendarYear = null;
    String calendarPeriod = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksEPSEstimates result = zacksApi.getZacksEpsEstimates(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | [optional] &nbsp;
 **startDate** | LocalDate| Limit EPS estimates to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit EPS estimates to those on or before this date | [optional] &nbsp;
 **fiscalYear** | Integer| Only for the given fiscal year | [optional] &nbsp;
 **fiscalPeriod** | String| The fiscal period | [optional] [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD] &nbsp;
 **calendarYear** | Integer| Only for the given calendar year | [optional] &nbsp;
 **calendarPeriod** | String| The calendar period | [optional] [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksEPSEstimates**](ApiResponseZacksEPSEstimates.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksEpsGrowthRates)

[//]: # (RETURN_TYPE:ApiResponseZacksEPSGrowthRates)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksEPSGrowthRates.md)

[//]: # (OPERATION:getZacksEpsGrowthRates_v2)

[//]: # (ENDPOINT:/zacks/eps_growth_rates)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksEpsGrowthRates)

<a name="getZacksEpsGrowthRates"></a>
## **getZacksEpsGrowthRates**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksEpsGrowthRates_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksEPSGrowthRates getZacksEpsGrowthRates(company, industryGroupName, industryGroupNumber, pageSize, nextPage)

#### Zacks EPS Growth Rates


Returns the latest Zacks EPS growth rates

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String company = "AAPL";
    String industryGroupName = null;
    String industryGroupNumber = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksEPSGrowthRates result = zacksApi.getZacksEpsGrowthRates(company, industryGroupName, industryGroupNumber, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | String| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) | [optional] &nbsp;
 **industryGroupName** | String| Return only growth rates for companies in the given Zacks industry group name | [optional] &nbsp;
 **industryGroupNumber** | String| Return only growth rates for companies in the given Zacks industry group number | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksEPSGrowthRates**](ApiResponseZacksEPSGrowthRates.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksEpsSurprises)

[//]: # (RETURN_TYPE:ApiResponseZacksEPSSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksEPSSurprises.md)

[//]: # (OPERATION:getZacksEpsSurprises_v2)

[//]: # (ENDPOINT:/zacks/eps_surprises)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksEpsSurprises)

<a name="getZacksEpsSurprises"></a>
## **getZacksEpsSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksEpsSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksEPSSurprises getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage)

#### Zacks EPS Surprises


Returns Zacks eps surprise data for all Securities.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    BigDecimal epsActualGreater = null;
    BigDecimal epsActualLess = null;
    BigDecimal epsMeanEstimateGreater = null;
    BigDecimal epsMeanEstimateLess = null;
    BigDecimal epsAmountDiffGreater = null;
    BigDecimal epsAmountDiffLess = null;
    BigDecimal epsPercentDiffGreater = null;
    BigDecimal epsPercentDiffLess = null;
    BigDecimal epsCountEstimateGreater = null;
    BigDecimal epsCountEstimateLess = null;
    BigDecimal epsStdDevEstimateGreater = null;
    BigDecimal epsStdDevEstimateLess = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksEPSSurprises result = zacksApi.getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | LocalDate| Limit EPS surprises to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit EPS surprises to those on or before this date | [optional] &nbsp;
 **epsActualGreater** | BigDecimal| Return only records with an actual EPS higher than this value | [optional] &nbsp;
 **epsActualLess** | BigDecimal| Return only records with an actual EPS lower than this value | [optional] &nbsp;
 **epsMeanEstimateGreater** | BigDecimal| Return only records with an EPS mean estimate greater than this value | [optional] &nbsp;
 **epsMeanEstimateLess** | BigDecimal| Return only records with an EPS mean estimate lower than this value | [optional] &nbsp;
 **epsAmountDiffGreater** | BigDecimal| Return only records with an EPS amount difference greater than this value | [optional] &nbsp;
 **epsAmountDiffLess** | BigDecimal| Return only records with an EPS amount difference less than this value | [optional] &nbsp;
 **epsPercentDiffGreater** | BigDecimal| Return only records with an EPS percent difference greater than this value | [optional] &nbsp;
 **epsPercentDiffLess** | BigDecimal| Return only records with an EPS percent difference less than this value | [optional] &nbsp;
 **epsCountEstimateGreater** | BigDecimal| Return only records with an EPS count estimate greater than this value | [optional] &nbsp;
 **epsCountEstimateLess** | BigDecimal| Return only records with an EPS count estimate less than this value | [optional] &nbsp;
 **epsStdDevEstimateGreater** | BigDecimal| Return only records with an EPS standard deviation greater than this value | [optional] &nbsp;
 **epsStdDevEstimateLess** | BigDecimal| Return only records with an EPS standard deviation less than this value | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksEPSSurprises**](ApiResponseZacksEPSSurprises.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksEtfHoldings)

[//]: # (RETURN_TYPE:ApiResponseZacksETFHoldings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksETFHoldings.md)

[//]: # (OPERATION:getZacksEtfHoldings_v2)

[//]: # (ENDPOINT:/zacks/etf_holdings)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksEtfHoldings)

<a name="getZacksEtfHoldings"></a>
## **getZacksEtfHoldings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksEtfHoldings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksETFHoldings getZacksEtfHoldings(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage)

#### Zacks ETF Holdings


Returns Zacks ETF holdings data

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String etfTicker = null;
    String holdingSymbol = null;
    BigDecimal weightGreater = null;
    BigDecimal weightLess = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksETFHoldings result = zacksApi.getZacksEtfHoldings(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **etfTicker** | String| Return holdings of the ETF with the given ticker | [optional] &nbsp;
 **holdingSymbol** | String| Return holdings where the instrument being held has the given trading symbol | [optional] &nbsp;
 **weightGreater** | BigDecimal| Return on the holdings with a weight greater than | [optional] &nbsp;
 **weightLess** | BigDecimal| Return on the holdings with a weight less than | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksETFHoldings**](ApiResponseZacksETFHoldings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksInstitutionalHoldingCompanies)

[//]: # (RETURN_TYPE:ApiResponseZacksInstitutionalHoldingCompanies)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksInstitutionalHoldingCompanies.md)

[//]: # (OPERATION:getZacksInstitutionalHoldingCompanies_v2)

[//]: # (ENDPOINT:/zacks/institutional_holdings/companies)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksInstitutionalHoldingCompanies)

<a name="getZacksInstitutionalHoldingCompanies"></a>
## **getZacksInstitutionalHoldingCompanies**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksInstitutionalHoldingCompanies_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksInstitutionalHoldingCompanies getZacksInstitutionalHoldingCompanies(ticker, pageSize, nextPage)

#### Zacks Institutional Holding Companies


Returns Zacks institutional holding companies data

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String ticker = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksInstitutionalHoldingCompanies result = zacksApi.getZacksInstitutionalHoldingCompanies(ticker, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | String| Return companies with the given ticker | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksInstitutionalHoldingCompanies**](ApiResponseZacksInstitutionalHoldingCompanies.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksInstitutionalHoldingOwners)

[//]: # (RETURN_TYPE:ApiResponseZacksInstitutionalHoldingOwners)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksInstitutionalHoldingOwners.md)

[//]: # (OPERATION:getZacksInstitutionalHoldingOwners_v2)

[//]: # (ENDPOINT:/zacks/institutional_holdings/owners)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksInstitutionalHoldingOwners)

<a name="getZacksInstitutionalHoldingOwners"></a>
## **getZacksInstitutionalHoldingOwners**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksInstitutionalHoldingOwners_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksInstitutionalHoldingOwners getZacksInstitutionalHoldingOwners(cik, pageSize, nextPage)

#### Zacks Institutional Holding Owners


Returns Zacks institutional holding owners data

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String cik = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksInstitutionalHoldingOwners result = zacksApi.getZacksInstitutionalHoldingOwners(cik, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cik** | String| Return owners with the given Central Index Key (CIK) | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksInstitutionalHoldingOwners**](ApiResponseZacksInstitutionalHoldingOwners.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksInstitutionalHoldings)

[//]: # (RETURN_TYPE:ApiResponseZacksInstitutionalHoldings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksInstitutionalHoldings.md)

[//]: # (OPERATION:getZacksInstitutionalHoldings_v2)

[//]: # (ENDPOINT:/zacks/institutional_holdings)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksInstitutionalHoldings)

<a name="getZacksInstitutionalHoldings"></a>
## **getZacksInstitutionalHoldings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksInstitutionalHoldings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksInstitutionalHoldings getZacksInstitutionalHoldings(ticker, ownerCik, pageSize, nextPage)

#### Zacks Institutional Holdings


Returns Zacks institutional holdings data

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String ticker = null;
    String ownerCik = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksInstitutionalHoldings result = zacksApi.getZacksInstitutionalHoldings(ticker, ownerCik, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | String| Return holdings where the company being held has the given ticker | [optional] &nbsp;
 **ownerCik** | String| Return holdings where the owner/holder has the given Central Index Key (CIK) | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksInstitutionalHoldings**](ApiResponseZacksInstitutionalHoldings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksLongTermGrowthRates)

[//]: # (RETURN_TYPE:ApiResponseZacksLongTermGrowthRates)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksLongTermGrowthRates.md)

[//]: # (OPERATION:getZacksLongTermGrowthRates_v2)

[//]: # (ENDPOINT:/zacks/long_term_growth_rates)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksLongTermGrowthRates)

<a name="getZacksLongTermGrowthRates"></a>
## **getZacksLongTermGrowthRates**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksLongTermGrowthRates_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksLongTermGrowthRates getZacksLongTermGrowthRates(identifier, pageSize, nextPage)

#### Zacks Long Term Growth Rates


Returns the latest Zacks long term growth rates

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String identifier = "AAPL";
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksLongTermGrowthRates result = zacksApi.getZacksLongTermGrowthRates(identifier, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksLongTermGrowthRates**](ApiResponseZacksLongTermGrowthRates.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksSalesSurprises)

[//]: # (RETURN_TYPE:ApiResponseZacksSalesSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksSalesSurprises.md)

[//]: # (OPERATION:getZacksSalesSurprises_v2)

[//]: # (ENDPOINT:/zacks/sales_surprises)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksSalesSurprises)

<a name="getZacksSalesSurprises"></a>
## **getZacksSalesSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksSalesSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksSalesSurprises getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage)

#### Zacks Sales Surprises


Returns Zacks sales surprise data for all Securities.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    BigDecimal salesActualGreater = null;
    BigDecimal salesActualLess = null;
    BigDecimal salesMeanEstimateGreater = null;
    BigDecimal salesMeanEstimateLess = null;
    BigDecimal salesAmountDiffGreater = null;
    BigDecimal salesAmountDiffLess = null;
    BigDecimal salesPercentDiffGreater = null;
    BigDecimal salesPercentDiffLess = null;
    BigDecimal salesCountEstimateGreater = null;
    BigDecimal salesCountEstimateLess = null;
    BigDecimal salesStdDevEstimateGreater = null;
    BigDecimal salesStdDevEstimateLess = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksSalesSurprises result = zacksApi.getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | LocalDate| Limit sales surprises to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit sales surprises to those on or before this date | [optional] &nbsp;
 **salesActualGreater** | BigDecimal| Return only records with an actual sales higher than this value | [optional] &nbsp;
 **salesActualLess** | BigDecimal| Return only records with an actual sales lower than this value | [optional] &nbsp;
 **salesMeanEstimateGreater** | BigDecimal| Return only records with a sales mean estimate greater than this value | [optional] &nbsp;
 **salesMeanEstimateLess** | BigDecimal| Return only records with a sales mean estimate lower than this value | [optional] &nbsp;
 **salesAmountDiffGreater** | BigDecimal| Return only records with a sales amount difference greater than this value | [optional] &nbsp;
 **salesAmountDiffLess** | BigDecimal| Return only records with a sales amount difference less than this value | [optional] &nbsp;
 **salesPercentDiffGreater** | BigDecimal| Return only records with a sales percent difference greater than this value | [optional] &nbsp;
 **salesPercentDiffLess** | BigDecimal| Return only records with a sales percent difference less than this value | [optional] &nbsp;
 **salesCountEstimateGreater** | BigDecimal| Return only records with a sales count estimate greater than this value | [optional] &nbsp;
 **salesCountEstimateLess** | BigDecimal| Return only records with a sales count estimate less than this value | [optional] &nbsp;
 **salesStdDevEstimateGreater** | BigDecimal| Return only records with a sales standard deviation greater than this value | [optional] &nbsp;
 **salesStdDevEstimateLess** | BigDecimal| Return only records with a sales standard deviation less than this value | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksSalesSurprises**](ApiResponseZacksSalesSurprises.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksTargetPriceConsensuses)

[//]: # (RETURN_TYPE:ApiResponseZacksTargetPriceConsensuses)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksTargetPriceConsensuses.md)

[//]: # (OPERATION:getZacksTargetPriceConsensuses_v2)

[//]: # (ENDPOINT:/zacks/target_price_consensuses)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksTargetPriceConsensuses)

<a name="getZacksTargetPriceConsensuses"></a>
## **getZacksTargetPriceConsensuses**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getZacksTargetPriceConsensuses_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksTargetPriceConsensuses getZacksTargetPriceConsensuses(identifier, industryGroupNumber, pageSize, nextPage)

#### Zacks Target Price Consensuses


Returns the latest Zacks target price consensus data

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    ZacksApi zacksApi = new ZacksApi();

    String identifier = "AAPL";
    String industryGroupNumber = null;
    Integer pageSize = 100;
    String nextPage = null;

    
    ApiResponseZacksTargetPriceConsensuses result = zacksApi.getZacksTargetPriceConsensuses(identifier, industryGroupNumber, pageSize, nextPage);
    System.out.println(result);
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) | [optional] &nbsp;
 **industryGroupNumber** | String| Return only growth rates for companies in the given Zacks industry group number | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksTargetPriceConsensuses**](ApiResponseZacksTargetPriceConsensuses.md)

[//]: # (END_OPERATION)

