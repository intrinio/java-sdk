

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * A record of a company&#39;s initial public offering (IPO). The act of \&quot;going public\&quot; is initiated by an IPO, at which point the company&#39;s stock trades on a major stock exchange (such as NYSE or NASDAQ)
 */
@ApiModel(description = "A record of a company's initial public offering (IPO). The act of \"going public\" is initiated by an IPO, at which point the company's stock trades on a major stock exchange (such as NYSE or NASDAQ)")

public class CompanyInitialPublicOffering {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  /**
   * The status of the IPO. Upcoming IPOs have not taken place yet but are expected to. Priced IPOs have taken place. Withdrawn IPOs were expected to take place, but were subsequently withdrawn and did not take place
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UPCOMING("upcoming"),
    
    PRICED("priced"),
    
    WITHDRAWN("withdrawn");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("offer_amount")
  private BigDecimal offerAmount = null;

  @SerializedName("share_price")
  private BigDecimal sharePrice = null;

  @SerializedName("share_price_lowest")
  private BigDecimal sharePriceLowest = null;

  @SerializedName("share_price_highest")
  private BigDecimal sharePriceHighest = null;

  @SerializedName("share_count")
  private BigDecimal shareCount = null;

  @SerializedName("share_count_lowest")
  private BigDecimal shareCountLowest = null;

  @SerializedName("share_count_highest")
  private BigDecimal shareCountHighest = null;

  @SerializedName("announcement_url")
  private String announcementUrl = null;

  @SerializedName("sec_report_url")
  private String secReportUrl = null;

  @SerializedName("open_price")
  private BigDecimal openPrice = null;

  @SerializedName("close_price")
  private BigDecimal closePrice = null;

  @SerializedName("volume")
  private BigDecimal volume = null;

  @SerializedName("day_change")
  private BigDecimal dayChange = null;

  @SerializedName("week_change")
  private BigDecimal weekChange = null;

  @SerializedName("month_change")
  private BigDecimal monthChange = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public CompanyInitialPublicOffering id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the IPO
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the IPO")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanyInitialPublicOffering ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker under which the Company will be traded after the IPO takes place
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker under which the Company will be traded after the IPO takes place")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public CompanyInitialPublicOffering date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the IPO, when the stock first trades on a major exchange
   * @return date
  **/
  @ApiModelProperty(value = "The date of the IPO, when the stock first trades on a major exchange")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public CompanyInitialPublicOffering status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the IPO. Upcoming IPOs have not taken place yet but are expected to. Priced IPOs have taken place. Withdrawn IPOs were expected to take place, but were subsequently withdrawn and did not take place
   * @return status
  **/
  @ApiModelProperty(value = "The status of the IPO. Upcoming IPOs have not taken place yet but are expected to. Priced IPOs have taken place. Withdrawn IPOs were expected to take place, but were subsequently withdrawn and did not take place")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CompanyInitialPublicOffering exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * The acronym of the stock exchange that the company is going to trade publicly on. Typically NYSE or NASDAQ
   * @return exchange
  **/
  @ApiModelProperty(value = "The acronym of the stock exchange that the company is going to trade publicly on. Typically NYSE or NASDAQ")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public CompanyInitialPublicOffering offerAmount(BigDecimal offerAmount) {
    this.offerAmount = offerAmount;
    return this;
  }

   /**
   * The total dollar amount of shares offered in the IPO. Typically this is share price * share count
   * @return offerAmount
  **/
  @ApiModelProperty(value = "The total dollar amount of shares offered in the IPO. Typically this is share price * share count")
  public BigDecimal getOfferAmount() {
    return offerAmount;
  }

  public void setOfferAmount(BigDecimal offerAmount) {
    this.offerAmount = offerAmount;
  }

  public CompanyInitialPublicOffering sharePrice(BigDecimal sharePrice) {
    this.sharePrice = sharePrice;
    return this;
  }

   /**
   * The price per share at which the IPO was offered
   * @return sharePrice
  **/
  @ApiModelProperty(value = "The price per share at which the IPO was offered")
  public BigDecimal getSharePrice() {
    return sharePrice;
  }

  public void setSharePrice(BigDecimal sharePrice) {
    this.sharePrice = sharePrice;
  }

  public CompanyInitialPublicOffering sharePriceLowest(BigDecimal sharePriceLowest) {
    this.sharePriceLowest = sharePriceLowest;
    return this;
  }

   /**
   * The expected lowest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs)
   * @return sharePriceLowest
  **/
  @ApiModelProperty(value = "The expected lowest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs)")
  public BigDecimal getSharePriceLowest() {
    return sharePriceLowest;
  }

  public void setSharePriceLowest(BigDecimal sharePriceLowest) {
    this.sharePriceLowest = sharePriceLowest;
  }

  public CompanyInitialPublicOffering sharePriceHighest(BigDecimal sharePriceHighest) {
    this.sharePriceHighest = sharePriceHighest;
    return this;
  }

   /**
   * The expected highest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs)
   * @return sharePriceHighest
  **/
  @ApiModelProperty(value = "The expected highest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs)")
  public BigDecimal getSharePriceHighest() {
    return sharePriceHighest;
  }

  public void setSharePriceHighest(BigDecimal sharePriceHighest) {
    this.sharePriceHighest = sharePriceHighest;
  }

  public CompanyInitialPublicOffering shareCount(BigDecimal shareCount) {
    this.shareCount = shareCount;
    return this;
  }

   /**
   * The number of shares offered in the IPO
   * @return shareCount
  **/
  @ApiModelProperty(value = "The number of shares offered in the IPO")
  public BigDecimal getShareCount() {
    return shareCount;
  }

  public void setShareCount(BigDecimal shareCount) {
    this.shareCount = shareCount;
  }

  public CompanyInitialPublicOffering shareCountLowest(BigDecimal shareCountLowest) {
    this.shareCountLowest = shareCountLowest;
    return this;
  }

   /**
   * The expected lowest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs)
   * @return shareCountLowest
  **/
  @ApiModelProperty(value = "The expected lowest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs)")
  public BigDecimal getShareCountLowest() {
    return shareCountLowest;
  }

  public void setShareCountLowest(BigDecimal shareCountLowest) {
    this.shareCountLowest = shareCountLowest;
  }

  public CompanyInitialPublicOffering shareCountHighest(BigDecimal shareCountHighest) {
    this.shareCountHighest = shareCountHighest;
    return this;
  }

   /**
   * The expected highest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs)
   * @return shareCountHighest
  **/
  @ApiModelProperty(value = "The expected highest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs)")
  public BigDecimal getShareCountHighest() {
    return shareCountHighest;
  }

  public void setShareCountHighest(BigDecimal shareCountHighest) {
    this.shareCountHighest = shareCountHighest;
  }

  public CompanyInitialPublicOffering announcementUrl(String announcementUrl) {
    this.announcementUrl = announcementUrl;
    return this;
  }

   /**
   * The URL to the company&#39;s announcement of the IPO
   * @return announcementUrl
  **/
  @ApiModelProperty(value = "The URL to the company's announcement of the IPO")
  public String getAnnouncementUrl() {
    return announcementUrl;
  }

  public void setAnnouncementUrl(String announcementUrl) {
    this.announcementUrl = announcementUrl;
  }

  public CompanyInitialPublicOffering secReportUrl(String secReportUrl) {
    this.secReportUrl = secReportUrl;
    return this;
  }

   /**
   * The IRL to the company&#39;s S-1, S-1/A, F-1, or F-1/A SEC filing, which is required to be filed before an IPO takes place.
   * @return secReportUrl
  **/
  @ApiModelProperty(value = "The IRL to the company's S-1, S-1/A, F-1, or F-1/A SEC filing, which is required to be filed before an IPO takes place.")
  public String getSecReportUrl() {
    return secReportUrl;
  }

  public void setSecReportUrl(String secReportUrl) {
    this.secReportUrl = secReportUrl;
  }

  public CompanyInitialPublicOffering openPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
    return this;
  }

   /**
   * The opening price at the beginning of the first trading day (only available for priced IPOs)
   * @return openPrice
  **/
  @ApiModelProperty(value = "The opening price at the beginning of the first trading day (only available for priced IPOs)")
  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public void setOpenPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
  }

  public CompanyInitialPublicOffering closePrice(BigDecimal closePrice) {
    this.closePrice = closePrice;
    return this;
  }

   /**
   * The closing price at the end of the first trading day (only available for priced IPOs)
   * @return closePrice
  **/
  @ApiModelProperty(value = "The closing price at the end of the first trading day (only available for priced IPOs)")
  public BigDecimal getClosePrice() {
    return closePrice;
  }

  public void setClosePrice(BigDecimal closePrice) {
    this.closePrice = closePrice;
  }

  public CompanyInitialPublicOffering volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume at the end of the first trading day (only available for priced IPOs)
   * @return volume
  **/
  @ApiModelProperty(value = "The volume at the end of the first trading day (only available for priced IPOs)")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public CompanyInitialPublicOffering dayChange(BigDecimal dayChange) {
    this.dayChange = dayChange;
    return this;
  }

   /**
   * The percentage change between the open price and the close price on the first trading day (only available for priced IPOs)
   * @return dayChange
  **/
  @ApiModelProperty(value = "The percentage change between the open price and the close price on the first trading day (only available for priced IPOs)")
  public BigDecimal getDayChange() {
    return dayChange;
  }

  public void setDayChange(BigDecimal dayChange) {
    this.dayChange = dayChange;
  }

  public CompanyInitialPublicOffering weekChange(BigDecimal weekChange) {
    this.weekChange = weekChange;
    return this;
  }

   /**
   * The percentage change between the open price on the first trading day and the close price approximately a week after the first trading day (only available for priced IPOs)
   * @return weekChange
  **/
  @ApiModelProperty(value = "The percentage change between the open price on the first trading day and the close price approximately a week after the first trading day (only available for priced IPOs)")
  public BigDecimal getWeekChange() {
    return weekChange;
  }

  public void setWeekChange(BigDecimal weekChange) {
    this.weekChange = weekChange;
  }

  public CompanyInitialPublicOffering monthChange(BigDecimal monthChange) {
    this.monthChange = monthChange;
    return this;
  }

   /**
   * The percentage change between the open price on the first trading day and the close price approximately a month after the first trading day (only available for priced IPOs)
   * @return monthChange
  **/
  @ApiModelProperty(value = "The percentage change between the open price on the first trading day and the close price approximately a month after the first trading day (only available for priced IPOs)")
  public BigDecimal getMonthChange() {
    return monthChange;
  }

  public void setMonthChange(BigDecimal monthChange) {
    this.monthChange = monthChange;
  }

  public CompanyInitialPublicOffering company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The Company that is going public via the IPO
   * @return company
  **/
  @ApiModelProperty(value = "The Company that is going public via the IPO")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public CompanyInitialPublicOffering security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The primary Security for the Company that is going public via the IPO
   * @return security
  **/
  @ApiModelProperty(value = "The primary Security for the Company that is going public via the IPO")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInitialPublicOffering companyInitialPublicOffering = (CompanyInitialPublicOffering) o;
    return Objects.equals(this.id, companyInitialPublicOffering.id) &&
        Objects.equals(this.ticker, companyInitialPublicOffering.ticker) &&
        Objects.equals(this.date, companyInitialPublicOffering.date) &&
        Objects.equals(this.status, companyInitialPublicOffering.status) &&
        Objects.equals(this.exchange, companyInitialPublicOffering.exchange) &&
        Objects.equals(this.offerAmount, companyInitialPublicOffering.offerAmount) &&
        Objects.equals(this.sharePrice, companyInitialPublicOffering.sharePrice) &&
        Objects.equals(this.sharePriceLowest, companyInitialPublicOffering.sharePriceLowest) &&
        Objects.equals(this.sharePriceHighest, companyInitialPublicOffering.sharePriceHighest) &&
        Objects.equals(this.shareCount, companyInitialPublicOffering.shareCount) &&
        Objects.equals(this.shareCountLowest, companyInitialPublicOffering.shareCountLowest) &&
        Objects.equals(this.shareCountHighest, companyInitialPublicOffering.shareCountHighest) &&
        Objects.equals(this.announcementUrl, companyInitialPublicOffering.announcementUrl) &&
        Objects.equals(this.secReportUrl, companyInitialPublicOffering.secReportUrl) &&
        Objects.equals(this.openPrice, companyInitialPublicOffering.openPrice) &&
        Objects.equals(this.closePrice, companyInitialPublicOffering.closePrice) &&
        Objects.equals(this.volume, companyInitialPublicOffering.volume) &&
        Objects.equals(this.dayChange, companyInitialPublicOffering.dayChange) &&
        Objects.equals(this.weekChange, companyInitialPublicOffering.weekChange) &&
        Objects.equals(this.monthChange, companyInitialPublicOffering.monthChange) &&
        Objects.equals(this.company, companyInitialPublicOffering.company) &&
        Objects.equals(this.security, companyInitialPublicOffering.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, date, status, exchange, offerAmount, sharePrice, sharePriceLowest, sharePriceHighest, shareCount, shareCountLowest, shareCountHighest, announcementUrl, secReportUrl, openPrice, closePrice, volume, dayChange, weekChange, monthChange, company, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInitialPublicOffering {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    offerAmount: ").append(toIndentedString(offerAmount)).append("\n");
    sb.append("    sharePrice: ").append(toIndentedString(sharePrice)).append("\n");
    sb.append("    sharePriceLowest: ").append(toIndentedString(sharePriceLowest)).append("\n");
    sb.append("    sharePriceHighest: ").append(toIndentedString(sharePriceHighest)).append("\n");
    sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
    sb.append("    shareCountLowest: ").append(toIndentedString(shareCountLowest)).append("\n");
    sb.append("    shareCountHighest: ").append(toIndentedString(shareCountHighest)).append("\n");
    sb.append("    announcementUrl: ").append(toIndentedString(announcementUrl)).append("\n");
    sb.append("    secReportUrl: ").append(toIndentedString(secReportUrl)).append("\n");
    sb.append("    openPrice: ").append(toIndentedString(openPrice)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    dayChange: ").append(toIndentedString(dayChange)).append("\n");
    sb.append("    weekChange: ").append(toIndentedString(weekChange)).append("\n");
    sb.append("    monthChange: ").append(toIndentedString(monthChange)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

