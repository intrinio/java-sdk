

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
 * A historcial value for the identifier/item combination a specific date
 */
@ApiModel(description = "A historcial value for the identifier/item combination a specific date")

public class HistoricalData {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("value")
  private BigDecimal value = null;

  public HistoricalData date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date that the value is present
   * @return date
  **/
  @ApiModelProperty(value = "The date that the value is present")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public HistoricalData value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The historical value
   * @return value
  **/
  @ApiModelProperty(value = "The historical value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalData historicalData = (HistoricalData) o;
    return Objects.equals(this.date, historicalData.date) &&
        Objects.equals(this.value, historicalData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalData {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

