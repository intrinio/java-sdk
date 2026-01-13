

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

/**
 * The usage summary for a particular access code.
 */
@ApiModel(description = "The usage summary for a particular access code.")

public class AccountCurrentUsage {
  @SerializedName("access_code")
  private String accessCode = null;

  @SerializedName("restriction")
  private String restriction = null;

  @SerializedName("count")
  private String count = null;

  @SerializedName("limit")
  private String limit = null;

  @SerializedName("seconds_until_reset")
  private String secondsUntilReset = null;

  @SerializedName("percentage_used")
  private String percentageUsed = null;

  public AccountCurrentUsage accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * The access code.
   * @return accessCode
  **/
  @ApiModelProperty(value = "The access code.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public AccountCurrentUsage restriction(String restriction) {
    this.restriction = restriction;
    return this;
  }

   /**
   * Restrictions on this access code.
   * @return restriction
  **/
  @ApiModelProperty(value = "Restrictions on this access code.")
  public String getRestriction() {
    return restriction;
  }

  public void setRestriction(String restriction) {
    this.restriction = restriction;
  }

  public AccountCurrentUsage count(String count) {
    this.count = count;
    return this;
  }

   /**
   * The current count of API calls using this access code for this period.
   * @return count
  **/
  @ApiModelProperty(value = "The current count of API calls using this access code for this period.")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public AccountCurrentUsage limit(String limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The limit for this access code
   * @return limit
  **/
  @ApiModelProperty(value = "The limit for this access code")
  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public AccountCurrentUsage secondsUntilReset(String secondsUntilReset) {
    this.secondsUntilReset = secondsUntilReset;
    return this;
  }

   /**
   * The period in seconds for count reset.
   * @return secondsUntilReset
  **/
  @ApiModelProperty(value = "The period in seconds for count reset.")
  public String getSecondsUntilReset() {
    return secondsUntilReset;
  }

  public void setSecondsUntilReset(String secondsUntilReset) {
    this.secondsUntilReset = secondsUntilReset;
  }

  public AccountCurrentUsage percentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
    return this;
  }

   /**
   * The percentage of limit used.
   * @return percentageUsed
  **/
  @ApiModelProperty(value = "The percentage of limit used.")
  public String getPercentageUsed() {
    return percentageUsed;
  }

  public void setPercentageUsed(String percentageUsed) {
    this.percentageUsed = percentageUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCurrentUsage accountCurrentUsage = (AccountCurrentUsage) o;
    return Objects.equals(this.accessCode, accountCurrentUsage.accessCode) &&
        Objects.equals(this.restriction, accountCurrentUsage.restriction) &&
        Objects.equals(this.count, accountCurrentUsage.count) &&
        Objects.equals(this.limit, accountCurrentUsage.limit) &&
        Objects.equals(this.secondsUntilReset, accountCurrentUsage.secondsUntilReset) &&
        Objects.equals(this.percentageUsed, accountCurrentUsage.percentageUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, restriction, count, limit, secondsUntilReset, percentageUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCurrentUsage {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    secondsUntilReset: ").append(toIndentedString(secondsUntilReset)).append("\n");
    sb.append("    percentageUsed: ").append(toIndentedString(percentageUsed)).append("\n");
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

