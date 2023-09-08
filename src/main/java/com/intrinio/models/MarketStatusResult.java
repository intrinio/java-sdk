

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
 * Returns the open status of NYSE.
 */
@ApiModel(description = "Returns the open status of NYSE.")

public class MarketStatusResult {
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("is_open")
  private Boolean isOpen = null;

  public MarketStatusResult timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC timestamp.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The UTC timestamp.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public MarketStatusResult isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Whether the market is open or not.
   * @return isOpen
  **/
  @ApiModelProperty(value = "Whether the market is open or not.")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketStatusResult marketStatusResult = (MarketStatusResult) o;
    return Objects.equals(this.timestamp, marketStatusResult.timestamp) &&
        Objects.equals(this.isOpen, marketStatusResult.isOpen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, isOpen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketStatusResult {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
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

