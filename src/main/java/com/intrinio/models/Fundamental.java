

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Fundamental
 */

public class Fundamental {
  @SerializedName("id")
  private String id = null;

  @SerializedName("statement_code")
  private String statementCode = null;

  @SerializedName("fiscal_year")
  private BigDecimal fiscalYear = null;

  @SerializedName("fiscal_period")
  private String fiscalPeriod = null;

  /**
   * The type of Fundamental
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REPORTED("reported"),
    
    RESTATED("restated"),
    
    CALCULATED("calculated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("filing_date")
  private OffsetDateTime filingDate = null;

  @SerializedName("is_latest")
  private Boolean isLatest = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public Fundamental id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the Fundamental
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the Fundamental")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Fundamental statementCode(String statementCode) {
    this.statementCode = statementCode;
    return this;
  }

   /**
   * The code of the financial statement that the Fundamental represents
   * @return statementCode
  **/
  @ApiModelProperty(value = "The code of the financial statement that the Fundamental represents")
  public String getStatementCode() {
    return statementCode;
  }

  public void setStatementCode(String statementCode) {
    this.statementCode = statementCode;
  }

  public Fundamental fiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The fiscal year
   * @return fiscalYear
  **/
  @ApiModelProperty(value = "The fiscal year")
  public BigDecimal getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public Fundamental fiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * The fiscal period
   * @return fiscalPeriod
  **/
  @ApiModelProperty(value = "The fiscal period")
  public String getFiscalPeriod() {
    return fiscalPeriod;
  }

  public void setFiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public Fundamental type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Fundamental
   * @return type
  **/
  @ApiModelProperty(value = "The type of Fundamental")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Fundamental startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The period start date
   * @return startDate
  **/
  @ApiModelProperty(value = "The period start date")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Fundamental endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The period start date
   * @return endDate
  **/
  @ApiModelProperty(value = "The period start date")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Fundamental filingDate(OffsetDateTime filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The date and time when the Fundamental was filed with the SEC
   * @return filingDate
  **/
  @ApiModelProperty(value = "The date and time when the Fundamental was filed with the SEC")
  public OffsetDateTime getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(OffsetDateTime filingDate) {
    this.filingDate = filingDate;
  }

  public Fundamental isLatest(Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

   /**
   * Is this the latest fundamental available based on the company&#39;s most recent filings? Use the Lookup Fundamental endpoint to find the latest fundamental (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/web_api/lookup_fundamental_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;)
   * @return isLatest
  **/
  @ApiModelProperty(value = "Is this the latest fundamental available based on the company's most recent filings? Use the Lookup Fundamental endpoint to find the latest fundamental (<a href=\"https://docs.intrinio.com/documentation/web_api/lookup_fundamental_v2\" target=\"_blank\">reference</a>)")
  public Boolean isIsLatest() {
    return isLatest;
  }

  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }

  public Fundamental company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The Company that the Fundamental was belongs to
   * @return company
  **/
  @ApiModelProperty(value = "The Company that the Fundamental was belongs to")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fundamental fundamental = (Fundamental) o;
    return Objects.equals(this.id, fundamental.id) &&
        Objects.equals(this.statementCode, fundamental.statementCode) &&
        Objects.equals(this.fiscalYear, fundamental.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, fundamental.fiscalPeriod) &&
        Objects.equals(this.type, fundamental.type) &&
        Objects.equals(this.startDate, fundamental.startDate) &&
        Objects.equals(this.endDate, fundamental.endDate) &&
        Objects.equals(this.filingDate, fundamental.filingDate) &&
        Objects.equals(this.isLatest, fundamental.isLatest) &&
        Objects.equals(this.company, fundamental.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statementCode, fiscalYear, fiscalPeriod, type, startDate, endDate, filingDate, isLatest, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fundamental {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statementCode: ").append(toIndentedString(statementCode)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

