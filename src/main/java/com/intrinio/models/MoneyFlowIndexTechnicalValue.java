

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
 * The date_time and mfi value of a Money Flow Index technical indicator calculation
 */
@ApiModel(description = "The date_time and mfi value of a Money Flow Index technical indicator calculation")

public class MoneyFlowIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("mfi")
  private Float mfi = null;

  public MoneyFlowIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public MoneyFlowIndexTechnicalValue mfi(Float mfi) {
    this.mfi = mfi;
    return this;
  }

   /**
   * The Money Flow Index calculation value
   * @return mfi
  **/
  @ApiModelProperty(value = "The Money Flow Index calculation value")
  public Float getMfi() {
    return mfi;
  }

  public void setMfi(Float mfi) {
    this.mfi = mfi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyFlowIndexTechnicalValue moneyFlowIndexTechnicalValue = (MoneyFlowIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, moneyFlowIndexTechnicalValue.dateTime) &&
        Objects.equals(this.mfi, moneyFlowIndexTechnicalValue.mfi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, mfi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyFlowIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    mfi: ").append(toIndentedString(mfi)).append("\n");
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

