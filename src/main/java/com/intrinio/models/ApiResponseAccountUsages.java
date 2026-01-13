

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.AccountCurrentUsage;
import com.intrinio.models.ApiResponseAccountUsagesAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The current usages on an account.
 */
@ApiModel(description = "The current usages on an account.")

public class ApiResponseAccountUsages {
  @SerializedName("usage")
  private List<AccountCurrentUsage> usage = null;

  @SerializedName("account")
  private ApiResponseAccountUsagesAccount account = null;

  public ApiResponseAccountUsages usage(List<AccountCurrentUsage> usage) {
    this.usage = usage;
    return this;
  }

  public ApiResponseAccountUsages addUsageItem(AccountCurrentUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

   /**
   * The usages on the account.
   * @return usage
  **/
  @ApiModelProperty(value = "The usages on the account.")
  public List<AccountCurrentUsage> getUsage() {
    return usage;
  }

  public void setUsage(List<AccountCurrentUsage> usage) {
    this.usage = usage;
  }

  public ApiResponseAccountUsages account(ApiResponseAccountUsagesAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public ApiResponseAccountUsagesAccount getAccount() {
    return account;
  }

  public void setAccount(ApiResponseAccountUsagesAccount account) {
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
    ApiResponseAccountUsages apiResponseAccountUsages = (ApiResponseAccountUsages) o;
    return Objects.equals(this.usage, apiResponseAccountUsages.usage) &&
        Objects.equals(this.account, apiResponseAccountUsages.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseAccountUsages {\n");
    
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

