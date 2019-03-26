

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
 * The date_time, adx, di_neg, and di_pos values of a Average Directional Index technical indicator calculation
 */
@ApiModel(description = "The date_time, adx, di_neg, and di_pos values of a Average Directional Index technical indicator calculation")

public class AverageDirectionalIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("adx")
  private Float adx = null;

  @SerializedName("di_neg")
  private Float diNeg = null;

  @SerializedName("di_pos")
  private Float diPos = null;

  public AverageDirectionalIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public AverageDirectionalIndexTechnicalValue adx(Float adx) {
    this.adx = adx;
    return this;
  }

   /**
   * The Average Directional Index value
   * @return adx
  **/
  @ApiModelProperty(value = "The Average Directional Index value")
  public Float getAdx() {
    return adx;
  }

  public void setAdx(Float adx) {
    this.adx = adx;
  }

  public AverageDirectionalIndexTechnicalValue diNeg(Float diNeg) {
    this.diNeg = diNeg;
    return this;
  }

   /**
   * The Minus Directional Indicator value
   * @return diNeg
  **/
  @ApiModelProperty(value = "The Minus Directional Indicator value")
  public Float getDiNeg() {
    return diNeg;
  }

  public void setDiNeg(Float diNeg) {
    this.diNeg = diNeg;
  }

  public AverageDirectionalIndexTechnicalValue diPos(Float diPos) {
    this.diPos = diPos;
    return this;
  }

   /**
   * The Plus Directional Indicator value
   * @return diPos
  **/
  @ApiModelProperty(value = "The Plus Directional Indicator value")
  public Float getDiPos() {
    return diPos;
  }

  public void setDiPos(Float diPos) {
    this.diPos = diPos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AverageDirectionalIndexTechnicalValue averageDirectionalIndexTechnicalValue = (AverageDirectionalIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, averageDirectionalIndexTechnicalValue.dateTime) &&
        Objects.equals(this.adx, averageDirectionalIndexTechnicalValue.adx) &&
        Objects.equals(this.diNeg, averageDirectionalIndexTechnicalValue.diNeg) &&
        Objects.equals(this.diPos, averageDirectionalIndexTechnicalValue.diPos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, adx, diNeg, diPos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageDirectionalIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    adx: ").append(toIndentedString(adx)).append("\n");
    sb.append("    diNeg: ").append(toIndentedString(diNeg)).append("\n");
    sb.append("    diPos: ").append(toIndentedString(diPos)).append("\n");
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

