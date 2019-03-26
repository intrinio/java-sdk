

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
 * The date_time and fi values of a Force Index technical indicator calculation
 */
@ApiModel(description = "The date_time and fi values of a Force Index technical indicator calculation")

public class ForceIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("fi")
  private Float fi = null;

  public ForceIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public ForceIndexTechnicalValue fi(Float fi) {
    this.fi = fi;
    return this;
  }

   /**
   * The Force Index calculation value
   * @return fi
  **/
  @ApiModelProperty(value = "The Force Index calculation value")
  public Float getFi() {
    return fi;
  }

  public void setFi(Float fi) {
    this.fi = fi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForceIndexTechnicalValue forceIndexTechnicalValue = (ForceIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, forceIndexTechnicalValue.dateTime) &&
        Objects.equals(this.fi, forceIndexTechnicalValue.fi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, fi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForceIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    fi: ").append(toIndentedString(fi)).append("\n");
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

