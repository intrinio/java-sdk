

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.AccountWebsocketStatus;
import com.intrinio.models.ApiResponseAccountUsagesAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The current websocket statuses on an account.
 */
@ApiModel(description = "The current websocket statuses on an account.")

public class ApiResponseWebsocketStatuses {
  @SerializedName("statuses")
  private List<AccountWebsocketStatus> statuses = null;

  @SerializedName("account")
  private ApiResponseAccountUsagesAccount account = null;

  public ApiResponseWebsocketStatuses statuses(List<AccountWebsocketStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ApiResponseWebsocketStatuses addStatusesItem(AccountWebsocketStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The websocket statuses on the account.
   * @return statuses
  **/
  @ApiModelProperty(value = "The websocket statuses on the account.")
  public List<AccountWebsocketStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<AccountWebsocketStatus> statuses) {
    this.statuses = statuses;
  }

  public ApiResponseWebsocketStatuses account(ApiResponseAccountUsagesAccount account) {
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
    ApiResponseWebsocketStatuses apiResponseWebsocketStatuses = (ApiResponseWebsocketStatuses) o;
    return Objects.equals(this.statuses, apiResponseWebsocketStatuses.statuses) &&
        Objects.equals(this.account, apiResponseWebsocketStatuses.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseWebsocketStatuses {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

