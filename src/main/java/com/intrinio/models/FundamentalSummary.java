

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
 * FundamentalSummary
 */

public class FundamentalSummary {
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
  private LocalDate filingDate = null;

  public FundamentalSummary id(String id) {
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

  public FundamentalSummary statementCode(String statementCode) {
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

  public FundamentalSummary fiscalYear(BigDecimal fiscalYear) {
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

  public FundamentalSummary fiscalPeriod(String fiscalPeriod) {
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

  public FundamentalSummary type(TypeEnum type) {
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

  public FundamentalSummary startDate(LocalDate startDate) {
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

  public FundamentalSummary endDate(LocalDate endDate) {
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

  public FundamentalSummary filingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The date and time when the Fundamental was filed with the SEC
   * @return filingDate
  **/
  @ApiModelProperty(value = "The date and time when the Fundamental was filed with the SEC")
  public LocalDate getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundamentalSummary fundamentalSummary = (FundamentalSummary) o;
    return Objects.equals(this.id, fundamentalSummary.id) &&
        Objects.equals(this.statementCode, fundamentalSummary.statementCode) &&
        Objects.equals(this.fiscalYear, fundamentalSummary.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, fundamentalSummary.fiscalPeriod) &&
        Objects.equals(this.type, fundamentalSummary.type) &&
        Objects.equals(this.startDate, fundamentalSummary.startDate) &&
        Objects.equals(this.endDate, fundamentalSummary.endDate) &&
        Objects.equals(this.filingDate, fundamentalSummary.filingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statementCode, fiscalYear, fiscalPeriod, type, startDate, endDate, filingDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentalSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statementCode: ").append(toIndentedString(statementCode)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
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

