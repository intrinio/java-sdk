

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
 * A public float data point.
 */
@ApiModel(description = "A public float data point.")

public class CompanyPublicFloat {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("filing_date")
  private LocalDate filingDate = null;

  @SerializedName("public_float_value")
  private BigDecimal publicFloatValue = null;

  @SerializedName("public_float_shares")
  private BigDecimal publicFloatShares = null;

  public CompanyPublicFloat date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the public float.
   * @return date
  **/
  @ApiModelProperty(value = "The date of the public float.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CompanyPublicFloat filingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The filing date of the public float.
   * @return filingDate
  **/
  @ApiModelProperty(value = "The filing date of the public float.")
  public LocalDate getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
  }

  public CompanyPublicFloat publicFloatValue(BigDecimal publicFloatValue) {
    this.publicFloatValue = publicFloatValue;
    return this;
  }

   /**
   * The dollar value for company float.
   * @return publicFloatValue
  **/
  @ApiModelProperty(value = "The dollar value for company float.")
  public BigDecimal getPublicFloatValue() {
    return publicFloatValue;
  }

  public void setPublicFloatValue(BigDecimal publicFloatValue) {
    this.publicFloatValue = publicFloatValue;
  }

  public CompanyPublicFloat publicFloatShares(BigDecimal publicFloatShares) {
    this.publicFloatShares = publicFloatShares;
    return this;
  }

   /**
   * The public shares for the company.
   * @return publicFloatShares
  **/
  @ApiModelProperty(value = "The public shares for the company.")
  public BigDecimal getPublicFloatShares() {
    return publicFloatShares;
  }

  public void setPublicFloatShares(BigDecimal publicFloatShares) {
    this.publicFloatShares = publicFloatShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPublicFloat companyPublicFloat = (CompanyPublicFloat) o;
    return Objects.equals(this.date, companyPublicFloat.date) &&
        Objects.equals(this.filingDate, companyPublicFloat.filingDate) &&
        Objects.equals(this.publicFloatValue, companyPublicFloat.publicFloatValue) &&
        Objects.equals(this.publicFloatShares, companyPublicFloat.publicFloatShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, filingDate, publicFloatValue, publicFloatShares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPublicFloat {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    publicFloatValue: ").append(toIndentedString(publicFloatValue)).append("\n");
    sb.append("    publicFloatShares: ").append(toIndentedString(publicFloatShares)).append("\n");
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

