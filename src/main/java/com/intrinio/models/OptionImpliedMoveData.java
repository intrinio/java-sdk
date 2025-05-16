

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
import java.math.BigDecimal;

/**
 * The data pertaining to the implied move.
 */
@ApiModel(description = "The data pertaining to the implied move.")

public class OptionImpliedMoveData {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("percentage")
  private BigDecimal percentage = null;

  public OptionImpliedMoveData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the implied move.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of the implied move.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public OptionImpliedMoveData percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the implied move.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the implied move.")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionImpliedMoveData optionImpliedMoveData = (OptionImpliedMoveData) o;
    return Objects.equals(this.amount, optionImpliedMoveData.amount) &&
        Objects.equals(this.percentage, optionImpliedMoveData.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionImpliedMoveData {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

