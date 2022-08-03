

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * A security snapshot group contains all security snapshot parts for a given point in time.
 */
@ApiModel(description = "A security snapshot group contains all security snapshot parts for a given point in time.")

public class SecuritySnapshotGroup {
  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("files")
  private List<Object> files = null;

  public SecuritySnapshotGroup time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * The UTC timestamp of this snapshot group.
   * @return time
  **/
  @ApiModelProperty(value = "The UTC timestamp of this snapshot group.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public SecuritySnapshotGroup files(List<Object> files) {
    this.files = files;
    return this;
  }

  public SecuritySnapshotGroup addFilesItem(Object filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * List of all the snapshot parts of this group.
   * @return files
  **/
  @ApiModelProperty(value = "List of all the snapshot parts of this group.")
  public List<Object> getFiles() {
    return files;
  }

  public void setFiles(List<Object> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySnapshotGroup securitySnapshotGroup = (SecuritySnapshotGroup) o;
    return Objects.equals(this.time, securitySnapshotGroup.time) &&
        Objects.equals(this.files, securitySnapshotGroup.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySnapshotGroup {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

