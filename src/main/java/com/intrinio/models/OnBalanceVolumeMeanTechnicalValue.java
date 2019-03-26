

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
 * The date_time and obv_mean values of a On-balance Volume Mean technical indicator calculation
 */
@ApiModel(description = "The date_time and obv_mean values of a On-balance Volume Mean technical indicator calculation")

public class OnBalanceVolumeMeanTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("obv_mean")
  private Float obvMean = null;

  public OnBalanceVolumeMeanTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public OnBalanceVolumeMeanTechnicalValue obvMean(Float obvMean) {
    this.obvMean = obvMean;
    return this;
  }

   /**
   * The On-balance Volume Mean calculation value
   * @return obvMean
  **/
  @ApiModelProperty(value = "The On-balance Volume Mean calculation value")
  public Float getObvMean() {
    return obvMean;
  }

  public void setObvMean(Float obvMean) {
    this.obvMean = obvMean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnBalanceVolumeMeanTechnicalValue onBalanceVolumeMeanTechnicalValue = (OnBalanceVolumeMeanTechnicalValue) o;
    return Objects.equals(this.dateTime, onBalanceVolumeMeanTechnicalValue.dateTime) &&
        Objects.equals(this.obvMean, onBalanceVolumeMeanTechnicalValue.obvMean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, obvMean);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnBalanceVolumeMeanTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    obvMean: ").append(toIndentedString(obvMean)).append("\n");
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

