

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
 * The date_time, lower_bound, and uppoer_bound values of a Donchian Channel technical indicator calculation
 */
@ApiModel(description = "The date_time, lower_bound, and uppoer_bound values of a Donchian Channel technical indicator calculation")

public class DonchianChannelTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("lower_bound")
  private Float lowerBound = null;

  @SerializedName("upper_bound")
  private Float upperBound = null;

  public DonchianChannelTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public DonchianChannelTechnicalValue lowerBound(Float lowerBound) {
    this.lowerBound = lowerBound;
    return this;
  }

   /**
   * The lower bound value of the Donchian Channel calculation
   * @return lowerBound
  **/
  @ApiModelProperty(value = "The lower bound value of the Donchian Channel calculation")
  public Float getLowerBound() {
    return lowerBound;
  }

  public void setLowerBound(Float lowerBound) {
    this.lowerBound = lowerBound;
  }

  public DonchianChannelTechnicalValue upperBound(Float upperBound) {
    this.upperBound = upperBound;
    return this;
  }

   /**
   * The upper bound value of the Donchian Channel calculation
   * @return upperBound
  **/
  @ApiModelProperty(value = "The upper bound value of the Donchian Channel calculation")
  public Float getUpperBound() {
    return upperBound;
  }

  public void setUpperBound(Float upperBound) {
    this.upperBound = upperBound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DonchianChannelTechnicalValue donchianChannelTechnicalValue = (DonchianChannelTechnicalValue) o;
    return Objects.equals(this.dateTime, donchianChannelTechnicalValue.dateTime) &&
        Objects.equals(this.lowerBound, donchianChannelTechnicalValue.lowerBound) &&
        Objects.equals(this.upperBound, donchianChannelTechnicalValue.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, lowerBound, upperBound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DonchianChannelTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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

