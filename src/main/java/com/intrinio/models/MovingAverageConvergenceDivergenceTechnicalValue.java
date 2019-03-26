

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
 * The date_time, macd_histogram, macd_line, and signal_line values of a Moving Average Convergence Divergence technical indicator calculation
 */
@ApiModel(description = "The date_time, macd_histogram, macd_line, and signal_line values of a Moving Average Convergence Divergence technical indicator calculation")

public class MovingAverageConvergenceDivergenceTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("macd_histogram")
  private Float macdHistogram = null;

  @SerializedName("macd_line")
  private Float macdLine = null;

  @SerializedName("signal_line")
  private Float signalLine = null;

  public MovingAverageConvergenceDivergenceTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public MovingAverageConvergenceDivergenceTechnicalValue macdHistogram(Float macdHistogram) {
    this.macdHistogram = macdHistogram;
    return this;
  }

   /**
   * The histogram value of the Moving Average Convergence Divergence calculation
   * @return macdHistogram
  **/
  @ApiModelProperty(value = "The histogram value of the Moving Average Convergence Divergence calculation")
  public Float getMacdHistogram() {
    return macdHistogram;
  }

  public void setMacdHistogram(Float macdHistogram) {
    this.macdHistogram = macdHistogram;
  }

  public MovingAverageConvergenceDivergenceTechnicalValue macdLine(Float macdLine) {
    this.macdLine = macdLine;
    return this;
  }

   /**
   * The line value of the Moving Average Convergence Divergence calculation
   * @return macdLine
  **/
  @ApiModelProperty(value = "The line value of the Moving Average Convergence Divergence calculation")
  public Float getMacdLine() {
    return macdLine;
  }

  public void setMacdLine(Float macdLine) {
    this.macdLine = macdLine;
  }

  public MovingAverageConvergenceDivergenceTechnicalValue signalLine(Float signalLine) {
    this.signalLine = signalLine;
    return this;
  }

   /**
   * The signal line value of the Moving Average Convergence Divergence calculation
   * @return signalLine
  **/
  @ApiModelProperty(value = "The signal line value of the Moving Average Convergence Divergence calculation")
  public Float getSignalLine() {
    return signalLine;
  }

  public void setSignalLine(Float signalLine) {
    this.signalLine = signalLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovingAverageConvergenceDivergenceTechnicalValue movingAverageConvergenceDivergenceTechnicalValue = (MovingAverageConvergenceDivergenceTechnicalValue) o;
    return Objects.equals(this.dateTime, movingAverageConvergenceDivergenceTechnicalValue.dateTime) &&
        Objects.equals(this.macdHistogram, movingAverageConvergenceDivergenceTechnicalValue.macdHistogram) &&
        Objects.equals(this.macdLine, movingAverageConvergenceDivergenceTechnicalValue.macdLine) &&
        Objects.equals(this.signalLine, movingAverageConvergenceDivergenceTechnicalValue.signalLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, macdHistogram, macdLine, signalLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovingAverageConvergenceDivergenceTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    macdHistogram: ").append(toIndentedString(macdHistogram)).append("\n");
    sb.append("    macdLine: ").append(toIndentedString(macdLine)).append("\n");
    sb.append("    signalLine: ").append(toIndentedString(signalLine)).append("\n");
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

