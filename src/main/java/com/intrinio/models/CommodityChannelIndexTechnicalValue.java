

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
 * The date_time and cci values of a Commodity Channel Index technical indicator calculation
 */
@ApiModel(description = "The date_time and cci values of a Commodity Channel Index technical indicator calculation")

public class CommodityChannelIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("cci")
  private Float cci = null;

  public CommodityChannelIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public CommodityChannelIndexTechnicalValue cci(Float cci) {
    this.cci = cci;
    return this;
  }

   /**
   * The Commodity Channel Index calculation value
   * @return cci
  **/
  @ApiModelProperty(value = "The Commodity Channel Index calculation value")
  public Float getCci() {
    return cci;
  }

  public void setCci(Float cci) {
    this.cci = cci;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommodityChannelIndexTechnicalValue commodityChannelIndexTechnicalValue = (CommodityChannelIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, commodityChannelIndexTechnicalValue.dateTime) &&
        Objects.equals(this.cci, commodityChannelIndexTechnicalValue.cci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, cci);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommodityChannelIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    cci: ").append(toIndentedString(cci)).append("\n");
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

