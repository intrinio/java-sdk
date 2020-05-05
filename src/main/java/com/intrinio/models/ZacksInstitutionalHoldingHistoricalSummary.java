

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
 * Returns number of shares held in previous quarters
 */
@ApiModel(description = "Returns number of shares held in previous quarters")

public class ZacksInstitutionalHoldingHistoricalSummary {
  @SerializedName("as_of_date")
  private LocalDate asOfDate = null;

  @SerializedName("shares_held")
  private BigDecimal sharesHeld = null;

  public ZacksInstitutionalHoldingHistoricalSummary asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * The date of the institutional holding
   * @return asOfDate
  **/
  @ApiModelProperty(value = "The date of the institutional holding")
  public LocalDate getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }

  public ZacksInstitutionalHoldingHistoricalSummary sharesHeld(BigDecimal sharesHeld) {
    this.sharesHeld = sharesHeld;
    return this;
  }

   /**
   * The number of shares held
   * @return sharesHeld
  **/
  @ApiModelProperty(value = "The number of shares held")
  public BigDecimal getSharesHeld() {
    return sharesHeld;
  }

  public void setSharesHeld(BigDecimal sharesHeld) {
    this.sharesHeld = sharesHeld;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHoldingHistoricalSummary zacksInstitutionalHoldingHistoricalSummary = (ZacksInstitutionalHoldingHistoricalSummary) o;
    return Objects.equals(this.asOfDate, zacksInstitutionalHoldingHistoricalSummary.asOfDate) &&
        Objects.equals(this.sharesHeld, zacksInstitutionalHoldingHistoricalSummary.sharesHeld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, sharesHeld);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHoldingHistoricalSummary {\n");
    
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    sharesHeld: ").append(toIndentedString(sharesHeld)).append("\n");
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

