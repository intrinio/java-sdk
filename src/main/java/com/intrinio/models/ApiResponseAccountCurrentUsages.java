

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.AccountCurrentUsage;
import com.intrinio.models.ApiResponseAccountCurrentUsagesAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseAccountCurrentUsages
 */

public class ApiResponseAccountCurrentUsages {
  @SerializedName("usage")
  private List<AccountCurrentUsage> usage = null;

  @SerializedName("account")
  private ApiResponseAccountCurrentUsagesAccount account = null;

  public ApiResponseAccountCurrentUsages usage(List<AccountCurrentUsage> usage) {
    this.usage = usage;
    return this;
  }

  public ApiResponseAccountCurrentUsages addUsageItem(AccountCurrentUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public List<AccountCurrentUsage> getUsage() {
    return usage;
  }

  public void setUsage(List<AccountCurrentUsage> usage) {
    this.usage = usage;
  }

  public ApiResponseAccountCurrentUsages account(ApiResponseAccountCurrentUsagesAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public ApiResponseAccountCurrentUsagesAccount getAccount() {
    return account;
  }

  public void setAccount(ApiResponseAccountCurrentUsagesAccount account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseAccountCurrentUsages apiResponseAccountCurrentUsages = (ApiResponseAccountCurrentUsages) o;
    return Objects.equals(this.usage, apiResponseAccountCurrentUsages.usage) &&
        Objects.equals(this.account, apiResponseAccountCurrentUsages.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseAccountCurrentUsages {\n");
    
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

