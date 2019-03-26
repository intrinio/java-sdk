

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
 * The date_time, chikou_span, kijun_sen, senkou_span_a, senkou_span_b, and tenkan_sen values of a Ichimoku Kinko Hyo technical indicator calculation
 */
@ApiModel(description = "The date_time, chikou_span, kijun_sen, senkou_span_a, senkou_span_b, and tenkan_sen values of a Ichimoku Kinko Hyo technical indicator calculation")

public class IchimokuKinkoHyoTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("chikou_span")
  private Float chikouSpan = null;

  @SerializedName("kijun_sen")
  private Float kijunSen = null;

  @SerializedName("senkou_span_a")
  private Float senkouSpanA = null;

  @SerializedName("senkou_span_b")
  private Float senkouSpanB = null;

  @SerializedName("tenkan_sen")
  private Float tenkanSen = null;

  public IchimokuKinkoHyoTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public IchimokuKinkoHyoTechnicalValue chikouSpan(Float chikouSpan) {
    this.chikouSpan = chikouSpan;
    return this;
  }

   /**
   * The Chikou Span (Lagging Span) value of the Ichimoku Kinko Hyo calculation
   * @return chikouSpan
  **/
  @ApiModelProperty(value = "The Chikou Span (Lagging Span) value of the Ichimoku Kinko Hyo calculation")
  public Float getChikouSpan() {
    return chikouSpan;
  }

  public void setChikouSpan(Float chikouSpan) {
    this.chikouSpan = chikouSpan;
  }

  public IchimokuKinkoHyoTechnicalValue kijunSen(Float kijunSen) {
    this.kijunSen = kijunSen;
    return this;
  }

   /**
   * The Kijun-sen (Base Line) value of the Ichimoku Kinko Hyo calculation
   * @return kijunSen
  **/
  @ApiModelProperty(value = "The Kijun-sen (Base Line) value of the Ichimoku Kinko Hyo calculation")
  public Float getKijunSen() {
    return kijunSen;
  }

  public void setKijunSen(Float kijunSen) {
    this.kijunSen = kijunSen;
  }

  public IchimokuKinkoHyoTechnicalValue senkouSpanA(Float senkouSpanA) {
    this.senkouSpanA = senkouSpanA;
    return this;
  }

   /**
   * The Senkou Span A (Leading Span A) value of the Ichimoku Kinko Hyo calculation
   * @return senkouSpanA
  **/
  @ApiModelProperty(value = "The Senkou Span A (Leading Span A) value of the Ichimoku Kinko Hyo calculation")
  public Float getSenkouSpanA() {
    return senkouSpanA;
  }

  public void setSenkouSpanA(Float senkouSpanA) {
    this.senkouSpanA = senkouSpanA;
  }

  public IchimokuKinkoHyoTechnicalValue senkouSpanB(Float senkouSpanB) {
    this.senkouSpanB = senkouSpanB;
    return this;
  }

   /**
   * The Senkou Span B (Leading Span B) value of the Ichimoku Kinko Hyo calculation
   * @return senkouSpanB
  **/
  @ApiModelProperty(value = "The Senkou Span B (Leading Span B) value of the Ichimoku Kinko Hyo calculation")
  public Float getSenkouSpanB() {
    return senkouSpanB;
  }

  public void setSenkouSpanB(Float senkouSpanB) {
    this.senkouSpanB = senkouSpanB;
  }

  public IchimokuKinkoHyoTechnicalValue tenkanSen(Float tenkanSen) {
    this.tenkanSen = tenkanSen;
    return this;
  }

   /**
   * The Tenskan-sen (Conversion Line) value of the Ichimoku Kinko Hyo calculation
   * @return tenkanSen
  **/
  @ApiModelProperty(value = "The Tenskan-sen (Conversion Line) value of the Ichimoku Kinko Hyo calculation")
  public Float getTenkanSen() {
    return tenkanSen;
  }

  public void setTenkanSen(Float tenkanSen) {
    this.tenkanSen = tenkanSen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IchimokuKinkoHyoTechnicalValue ichimokuKinkoHyoTechnicalValue = (IchimokuKinkoHyoTechnicalValue) o;
    return Objects.equals(this.dateTime, ichimokuKinkoHyoTechnicalValue.dateTime) &&
        Objects.equals(this.chikouSpan, ichimokuKinkoHyoTechnicalValue.chikouSpan) &&
        Objects.equals(this.kijunSen, ichimokuKinkoHyoTechnicalValue.kijunSen) &&
        Objects.equals(this.senkouSpanA, ichimokuKinkoHyoTechnicalValue.senkouSpanA) &&
        Objects.equals(this.senkouSpanB, ichimokuKinkoHyoTechnicalValue.senkouSpanB) &&
        Objects.equals(this.tenkanSen, ichimokuKinkoHyoTechnicalValue.tenkanSen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, chikouSpan, kijunSen, senkouSpanA, senkouSpanB, tenkanSen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IchimokuKinkoHyoTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    chikouSpan: ").append(toIndentedString(chikouSpan)).append("\n");
    sb.append("    kijunSen: ").append(toIndentedString(kijunSen)).append("\n");
    sb.append("    senkouSpanA: ").append(toIndentedString(senkouSpanA)).append("\n");
    sb.append("    senkouSpanB: ").append(toIndentedString(senkouSpanB)).append("\n");
    sb.append("    tenkanSen: ").append(toIndentedString(tenkanSen)).append("\n");
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

