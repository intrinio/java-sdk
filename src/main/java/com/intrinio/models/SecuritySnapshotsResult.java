

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySnapshotGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A security snapshot result contains all security snapshot groups corresponding to the provided query.
 */
@ApiModel(description = "A security snapshot result contains all security snapshot groups corresponding to the provided query.")

public class SecuritySnapshotsResult {
  @SerializedName("snapshots")
  private List<SecuritySnapshotGroup> snapshots = null;

  public SecuritySnapshotsResult snapshots(List<SecuritySnapshotGroup> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public SecuritySnapshotsResult addSnapshotsItem(SecuritySnapshotGroup snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * List of all the snapshot groups comprising the queried result.
   * @return snapshots
  **/
  @ApiModelProperty(value = "List of all the snapshot groups comprising the queried result.")
  public List<SecuritySnapshotGroup> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<SecuritySnapshotGroup> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySnapshotsResult securitySnapshotsResult = (SecuritySnapshotsResult) o;
    return Objects.equals(this.snapshots, securitySnapshotsResult.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySnapshotsResult {\n");
    
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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

