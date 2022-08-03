

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionSnapshotGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An options snapshot result contains all options snapshot groups corresponding to the provided query.
 */
@ApiModel(description = "An options snapshot result contains all options snapshot groups corresponding to the provided query.")

public class OptionSnapshotsResult {
  @SerializedName("snapshots")
  private List<OptionSnapshotGroup> snapshots = null;

  public OptionSnapshotsResult snapshots(List<OptionSnapshotGroup> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public OptionSnapshotsResult addSnapshotsItem(OptionSnapshotGroup snapshotsItem) {
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
  public List<OptionSnapshotGroup> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<OptionSnapshotGroup> snapshots) {
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
    OptionSnapshotsResult optionSnapshotsResult = (OptionSnapshotsResult) o;
    return Objects.equals(this.snapshots, optionSnapshotsResult.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSnapshotsResult {\n");
    
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

