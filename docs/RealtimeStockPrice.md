
[//]: # (CLASS:RealtimeStockPrice)

[//]: # (KIND:object)

### RealtimeStockPrice

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**lastPrice** | [**BigDecimal**](BigDecimal.md) | The price of the last trade. &nbsp;
**lastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the last trade occurred. &nbsp;
**lastSize** | [**BigDecimal**](BigDecimal.md) | The size of the last trade. &nbsp;
**bidPrice** | [**BigDecimal**](BigDecimal.md) | The price of the top bid order. &nbsp;
**bidSize** | [**BigDecimal**](BigDecimal.md) | The size of the top bid order. &nbsp;
**bidTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the last bid occurred. &nbsp;
**askPrice** | [**BigDecimal**](BigDecimal.md) | The price of the top ask order. &nbsp;
**askSize** | [**BigDecimal**](BigDecimal.md) | The size of the top ask order. &nbsp;
**askTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the last ask occurred. &nbsp;
**openPrice** | [**BigDecimal**](BigDecimal.md) | The price at the open of the trading day. &nbsp;
**closePrice** | [**BigDecimal**](BigDecimal.md) | The price at the close of the trading day. (IEX only) &nbsp;
**highPrice** | [**BigDecimal**](BigDecimal.md) | The high price for the trading day. &nbsp;
**lowPrice** | [**BigDecimal**](BigDecimal.md) | The low price for the trading day. &nbsp;
**exchangeVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the trading day on the exchange. &nbsp;
**marketVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the trading day for the whole market. &nbsp;
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the data was last updated. &nbsp;
**eodClosePrice** | [**BigDecimal**](BigDecimal.md) | The previous trading session&#39;s closing price. &nbsp;
**eodCloseDate** | [**LocalDate**](LocalDate.md) | The date of the previous trading session&#39;s closing price. &nbsp;
**normalMarketHoursLastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time of the last trade that qualifies for last price consideration during normal market hours according to exchange rules on trade conditions. &nbsp;
**normalMarketHoursLastPrice** | [**BigDecimal**](BigDecimal.md) | The price of the last that qualifies for last price consideration during normal market hours according to exchange rules on trade conditions. &nbsp;
**normalMarketHoursLastSize** | [**BigDecimal**](BigDecimal.md) | The size of the last trade that qualifies for last price consideration during normal market hours according to exchange rules on trade conditions. &nbsp;
**qualifiedLastPrice** | [**BigDecimal**](BigDecimal.md) | The price of the last trade that qualifies for last price consideration according to exchange rules on trade conditions. &nbsp;
**qualifiedLastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time of the last trade that qualifies for last price consideration according to exchange rules on trade conditions. &nbsp;
**qualifiedLastSize** | [**BigDecimal**](BigDecimal.md) | The size of the last trade that qualifies for last price consideration according to exchange rules on trade conditions. &nbsp;
**source** | String | The source of the data. &nbsp;
**listingVenue** | String | The listing venue where the trade took place. Available only where source is SIP. Listing Venue Modifiers include: Q – Nasdaq | N – NYSE | A – NYSE American | P – NYSE Arca | u – Other OTC Markets | V – Investors Exchange LLC  &nbsp;
**salesConditions** | String | When applicable, indicates any sales condition modifiers associated with the trade. Sales Condition Modifers include: @ – Regular Sale | A – Acquisition | B – Bunched Trade | C – Cash Sale | D – Distribution | E – Placeholder | F – Intermarket Sweep | G – Bunched Sold Trade  | H – Priced Variation Trade | I – Odd Lot Trade | K – Rule 155 Trade (AMEX) | L – Sold Last | M – Market Center Official Close | N – Next Day | O – Opening Prints  | P – Prior Reference Price | Q – Market Center Official Open | R – Seller | S – Split Trade | T – Form T | U – Extended Trading Hours (Sold Out of Sequence)  | V – Contingent Trade | W – Average Price Trade | X – Cross/Periodic Auction Trade | Y – Yellow Flag Regular Trade | Z – Sold (Out of Sequence)  | 1 – Stopped Stock (Regular Trade) | 4 – Derivatively Priced | 5 – Re-Opening Prints | 6 – Closing Prints | 7 – Qualified Contingent Trade (QCT)  | 8 – Placeholder for 611 Exempt | 9 – Corrected Consolidated Close (Per Listing Market)  &nbsp;
**quoteConditions** | String | When applicable, indicates any quote condition modifiers associated with the trade. Quote Condition Modifiers include: R – Regular | A – Slow on Ask | – Slow on Bid | C – Closing | D – News Dissemination | F – Slow on ASK (LRP or Gap Quote)  | E – Slow on Bid (LRP or Gap Quote) | G – Trading Range Indication | H – Slow on Bid and Ask | I – Order Imbalance  |  J – Due to Related - News Dissemination | K – Due to Related - News Pending | O – Open | L – Closed  | M – Volatility Trading Pause | N – Non-Firm Quote | O – Opening | P – News Pending | S – Due to Related  | T – Resume | U – Slow on Bid and Ask (LRP or Gap Quote) | V – In View of Common | W – Slow on Bid and Ask (LRP or Gap Quote)  | X – Equipment Changeover | Y – Sub-Penny Trading | Z – No Open / No Resume | F – Fast Trading | U – Slow on Bid and Ask (Non-Firm)  | One-Sided – One-Sided | X – Order Influx | 0 – Special Opening Quote | Halted – Halted | Benchmark – Benchmark | Implied – Implied  | Exchange Best – Exchange Best | 1 – Market Wide Circuit Breaker Level 1 | 2 – Market Wide Circuit Breaker Level 2  | 3 – Market Wide Circuit Breaker Level 3 | Rotation – Rotation | Auto Exec Eligible – Auto Exec Eligible | Bid Side Firm – Bid Side Firm  | Ask Side Firm – Ask Side Firm | 4 – On Demand Intraday Auction | I – Indicative Value (OPRA) | 45 – Additional Information Required (CTS)  | 46 – Regulatory Concern (CTS) | 47 – Merger Effective | 49 – Corporate Action (CTS) | 50 – New Security Offering (CTS)  | 51 – Intraday Indicative Value Unavailable (CTS)  &nbsp;
**marketCenterCode** | String | The market center character code. &nbsp;
**isDarkpool** | Boolean | Whether or not the current trade is from a darkpool or not. &nbsp;
**security** | [**RealtimeStockPriceSecurity**](RealtimeStockPriceSecurity.md) |  &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:RealtimeStockPriceSecurity)





