

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
 * An options snapshot group contains all options snapshot parts for a given point in time.
 */
@ApiModel(description = "An options snapshot group contains all options snapshot parts for a given point in time.")

public class OptionSnapshotGroup {
  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("files")
  private List<Object> files = null;

  public OptionSnapshotGroup time(OffsetDateTime time) {
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

  public OptionSnapshotGroup files(List<Object> files) {
    this.files = files;
    return this;
  }

  public OptionSnapshotGroup addFilesItem(Object filesItem) {
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
    OptionSnapshotGroup optionSnapshotGroup = (OptionSnapshotGroup) o;
    return Objects.equals(this.time, optionSnapshotGroup.time) &&
        Objects.equals(this.files, optionSnapshotGroup.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSnapshotGroup {\n");
    
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

