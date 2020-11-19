

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.ZacksAnalystRatingSnapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityZacksAnalystRatingsSnapshot
 */

public class ApiResponseSecurityZacksAnalystRatingsSnapshot {
  @SerializedName("snapshots")
  private List<ZacksAnalystRatingSnapshot> snapshots = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public ApiResponseSecurityZacksAnalystRatingsSnapshot snapshots(List<ZacksAnalystRatingSnapshot> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public ApiResponseSecurityZacksAnalystRatingsSnapshot addSnapshotsItem(ZacksAnalystRatingSnapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @ApiModelProperty(value = "")
  public List<ZacksAnalystRatingSnapshot> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<ZacksAnalystRatingSnapshot> snapshots) {
    this.snapshots = snapshots;
  }

  public ApiResponseSecurityZacksAnalystRatingsSnapshot security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security resolved from the given identifier
   * @return security
  **/
  @ApiModelProperty(value = "The Security resolved from the given identifier")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecurityZacksAnalystRatingsSnapshot apiResponseSecurityZacksAnalystRatingsSnapshot = (ApiResponseSecurityZacksAnalystRatingsSnapshot) o;
    return Objects.equals(this.snapshots, apiResponseSecurityZacksAnalystRatingsSnapshot.snapshots) &&
        Objects.equals(this.security, apiResponseSecurityZacksAnalystRatingsSnapshot.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshots, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityZacksAnalystRatingsSnapshot {\n");
    
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

