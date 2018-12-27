

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * A dividend record for the identifier
 */
@ApiModel(description = "A dividend record for the identifier")

public class DividendRecord {
  @SerializedName("ex_dividend")
  private BigDecimal exDividend = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("announcement_date")
  private LocalDate announcementDate = null;

  @SerializedName("record_date")
  private LocalDate recordDate = null;

  @SerializedName("pay_date")
  private LocalDate payDate = null;

  @SerializedName("frequency")
  private String frequency = null;

  /**
   * Status of the dividend
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    P("P"),
    
    X("X"),
    
    S("S"),
    
    R("R");

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

  @SerializedName("forward_yield")
  private BigDecimal forwardYield = null;

  @SerializedName("forward_rate")
  private BigDecimal forwardRate = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public DividendRecord exDividend(BigDecimal exDividend) {
    this.exDividend = exDividend;
    return this;
  }

   /**
   * Amount of dividend in US dollars
   * @return exDividend
  **/
  @ApiModelProperty(value = "Amount of dividend in US dollars")
  public BigDecimal getExDividend() {
    return exDividend;
  }

  public void setExDividend(BigDecimal exDividend) {
    this.exDividend = exDividend;
  }

  public DividendRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The 3-digit currency code the dividend amount was reported in
   * @return currency
  **/
  @ApiModelProperty(value = "The 3-digit currency code the dividend amount was reported in")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DividendRecord announcementDate(LocalDate announcementDate) {
    this.announcementDate = announcementDate;
    return this;
  }

   /**
   * Date dividend was announced
   * @return announcementDate
  **/
  @ApiModelProperty(value = "Date dividend was announced")
  public LocalDate getAnnouncementDate() {
    return announcementDate;
  }

  public void setAnnouncementDate(LocalDate announcementDate) {
    this.announcementDate = announcementDate;
  }

  public DividendRecord recordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
    return this;
  }

   /**
   * Date before which holders-of-record will receive the dividend
   * @return recordDate
  **/
  @ApiModelProperty(value = "Date before which holders-of-record will receive the dividend")
  public LocalDate getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
  }

  public DividendRecord payDate(LocalDate payDate) {
    this.payDate = payDate;
    return this;
  }

   /**
   * Date the divdiend was paid
   * @return payDate
  **/
  @ApiModelProperty(value = "Date the divdiend was paid")
  public LocalDate getPayDate() {
    return payDate;
  }

  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }

  public DividendRecord frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Identifies payment frequency of announced dividend
   * @return frequency
  **/
  @ApiModelProperty(value = "Identifies payment frequency of announced dividend")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public DividendRecord status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the dividend
   * @return status
  **/
  @ApiModelProperty(value = "Status of the dividend")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DividendRecord forwardYield(BigDecimal forwardYield) {
    this.forwardYield = forwardYield;
    return this;
  }

   /**
   * The forward dividend yield
   * @return forwardYield
  **/
  @ApiModelProperty(value = "The forward dividend yield")
  public BigDecimal getForwardYield() {
    return forwardYield;
  }

  public void setForwardYield(BigDecimal forwardYield) {
    this.forwardYield = forwardYield;
  }

  public DividendRecord forwardRate(BigDecimal forwardRate) {
    this.forwardRate = forwardRate;
    return this;
  }

   /**
   * The forward dividend rate
   * @return forwardRate
  **/
  @ApiModelProperty(value = "The forward dividend rate")
  public BigDecimal getForwardRate() {
    return forwardRate;
  }

  public void setForwardRate(BigDecimal forwardRate) {
    this.forwardRate = forwardRate;
  }

  public DividendRecord security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
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
    DividendRecord dividendRecord = (DividendRecord) o;
    return Objects.equals(this.exDividend, dividendRecord.exDividend) &&
        Objects.equals(this.currency, dividendRecord.currency) &&
        Objects.equals(this.announcementDate, dividendRecord.announcementDate) &&
        Objects.equals(this.recordDate, dividendRecord.recordDate) &&
        Objects.equals(this.payDate, dividendRecord.payDate) &&
        Objects.equals(this.frequency, dividendRecord.frequency) &&
        Objects.equals(this.status, dividendRecord.status) &&
        Objects.equals(this.forwardYield, dividendRecord.forwardYield) &&
        Objects.equals(this.forwardRate, dividendRecord.forwardRate) &&
        Objects.equals(this.security, dividendRecord.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exDividend, currency, announcementDate, recordDate, payDate, frequency, status, forwardYield, forwardRate, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividendRecord {\n");
    
    sb.append("    exDividend: ").append(toIndentedString(exDividend)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    announcementDate: ").append(toIndentedString(announcementDate)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    forwardYield: ").append(toIndentedString(forwardYield)).append("\n");
    sb.append("    forwardRate: ").append(toIndentedString(forwardRate)).append("\n");
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

