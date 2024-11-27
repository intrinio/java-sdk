

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

/**
 * A beta value for a security.
 */
@ApiModel(description = "A beta value for a security.")

public class Beta {
  /**
   * Type of period for this beta value.
   */
  @JsonAdapter(PeriodTypeEnum.Adapter.class)
  public enum PeriodTypeEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodTypeEnum fromValue(String text) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("period_type")
  private PeriodTypeEnum periodType = null;

  @SerializedName("one_year_beta")
  private BigDecimal oneYearBeta = null;

  @SerializedName("three_year_beta")
  private BigDecimal threeYearBeta = null;

  @SerializedName("five_year_beta")
  private BigDecimal fiveYearBeta = null;

  @SerializedName("seven_year_beta")
  private BigDecimal sevenYearBeta = null;

  @SerializedName("ten_year_beta")
  private BigDecimal tenYearBeta = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public Beta periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
    return this;
  }

   /**
   * Type of period for this beta value.
   * @return periodType
  **/
  @ApiModelProperty(value = "Type of period for this beta value.")
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }

  public Beta oneYearBeta(BigDecimal oneYearBeta) {
    this.oneYearBeta = oneYearBeta;
    return this;
  }

   /**
   * The one year beta value for this security.
   * @return oneYearBeta
  **/
  @ApiModelProperty(value = "The one year beta value for this security.")
  public BigDecimal getOneYearBeta() {
    return oneYearBeta;
  }

  public void setOneYearBeta(BigDecimal oneYearBeta) {
    this.oneYearBeta = oneYearBeta;
  }

  public Beta threeYearBeta(BigDecimal threeYearBeta) {
    this.threeYearBeta = threeYearBeta;
    return this;
  }

   /**
   * The three year beta value for this security.
   * @return threeYearBeta
  **/
  @ApiModelProperty(value = "The three year beta value for this security.")
  public BigDecimal getThreeYearBeta() {
    return threeYearBeta;
  }

  public void setThreeYearBeta(BigDecimal threeYearBeta) {
    this.threeYearBeta = threeYearBeta;
  }

  public Beta fiveYearBeta(BigDecimal fiveYearBeta) {
    this.fiveYearBeta = fiveYearBeta;
    return this;
  }

   /**
   * The five year beta value for this security.
   * @return fiveYearBeta
  **/
  @ApiModelProperty(value = "The five year beta value for this security.")
  public BigDecimal getFiveYearBeta() {
    return fiveYearBeta;
  }

  public void setFiveYearBeta(BigDecimal fiveYearBeta) {
    this.fiveYearBeta = fiveYearBeta;
  }

  public Beta sevenYearBeta(BigDecimal sevenYearBeta) {
    this.sevenYearBeta = sevenYearBeta;
    return this;
  }

   /**
   * The seven year beta value for this security.
   * @return sevenYearBeta
  **/
  @ApiModelProperty(value = "The seven year beta value for this security.")
  public BigDecimal getSevenYearBeta() {
    return sevenYearBeta;
  }

  public void setSevenYearBeta(BigDecimal sevenYearBeta) {
    this.sevenYearBeta = sevenYearBeta;
  }

  public Beta tenYearBeta(BigDecimal tenYearBeta) {
    this.tenYearBeta = tenYearBeta;
    return this;
  }

   /**
   * The ten year beta value for this security.
   * @return tenYearBeta
  **/
  @ApiModelProperty(value = "The ten year beta value for this security.")
  public BigDecimal getTenYearBeta() {
    return tenYearBeta;
  }

  public void setTenYearBeta(BigDecimal tenYearBeta) {
    this.tenYearBeta = tenYearBeta;
  }

  public Beta security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security.
   * @return security
  **/
  @ApiModelProperty(value = "The Security.")
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
    Beta beta = (Beta) o;
    return Objects.equals(this.periodType, beta.periodType) &&
        Objects.equals(this.oneYearBeta, beta.oneYearBeta) &&
        Objects.equals(this.threeYearBeta, beta.threeYearBeta) &&
        Objects.equals(this.fiveYearBeta, beta.fiveYearBeta) &&
        Objects.equals(this.sevenYearBeta, beta.sevenYearBeta) &&
        Objects.equals(this.tenYearBeta, beta.tenYearBeta) &&
        Objects.equals(this.security, beta.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, oneYearBeta, threeYearBeta, fiveYearBeta, sevenYearBeta, tenYearBeta, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beta {\n");
    
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    oneYearBeta: ").append(toIndentedString(oneYearBeta)).append("\n");
    sb.append("    threeYearBeta: ").append(toIndentedString(threeYearBeta)).append("\n");
    sb.append("    fiveYearBeta: ").append(toIndentedString(fiveYearBeta)).append("\n");
    sb.append("    sevenYearBeta: ").append(toIndentedString(sevenYearBeta)).append("\n");
    sb.append("    tenYearBeta: ").append(toIndentedString(tenYearBeta)).append("\n");
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

