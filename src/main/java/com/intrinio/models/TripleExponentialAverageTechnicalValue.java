

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
import org.threeten.bp.OffsetDateTime;

/**
 * The date_time and trix values of a Triple Exponential Average technical indicator calculation
 */
@ApiModel(description = "The date_time and trix values of a Triple Exponential Average technical indicator calculation")

public class TripleExponentialAverageTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("trix")
  private Float trix = null;

  public TripleExponentialAverageTechnicalValue dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date_time of the observation
   * @return dateTime
  **/
  @ApiModelProperty(value = "The date_time of the observation")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public TripleExponentialAverageTechnicalValue trix(Float trix) {
    this.trix = trix;
    return this;
  }

   /**
   * The Triple Exponential Average calculation value
   * @return trix
  **/
  @ApiModelProperty(value = "The Triple Exponential Average calculation value")
  public Float getTrix() {
    return trix;
  }

  public void setTrix(Float trix) {
    this.trix = trix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripleExponentialAverageTechnicalValue tripleExponentialAverageTechnicalValue = (TripleExponentialAverageTechnicalValue) o;
    return Objects.equals(this.dateTime, tripleExponentialAverageTechnicalValue.dateTime) &&
        Objects.equals(this.trix, tripleExponentialAverageTechnicalValue.trix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, trix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripleExponentialAverageTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    trix: ").append(toIndentedString(trix)).append("\n");
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

