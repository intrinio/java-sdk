

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionSurfaceDatum;
import com.intrinio.models.OptionSurfaceFace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ApiResponseOptionsSurface
 */

public class ApiResponseOptionsSurface {
  @SerializedName("updated_on")
  private OffsetDateTime updatedOn = null;

  @SerializedName("vertices")
  private List<OptionSurfaceDatum> vertices = null;

  @SerializedName("faces")
  private List<OptionSurfaceFace> faces = null;

  public ApiResponseOptionsSurface updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * The date and time when the surface surface data was last updated.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The date and time when the surface surface data was last updated.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public ApiResponseOptionsSurface vertices(List<OptionSurfaceDatum> vertices) {
    this.vertices = vertices;
    return this;
  }

  public ApiResponseOptionsSurface addVerticesItem(OptionSurfaceDatum verticesItem) {
    if (this.vertices == null) {
      this.vertices = new ArrayList<>();
    }
    this.vertices.add(verticesItem);
    return this;
  }

   /**
   * A list of data points for the options volatility surface.
   * @return vertices
  **/
  @ApiModelProperty(value = "A list of data points for the options volatility surface.")
  public List<OptionSurfaceDatum> getVertices() {
    return vertices;
  }

  public void setVertices(List<OptionSurfaceDatum> vertices) {
    this.vertices = vertices;
  }

  public ApiResponseOptionsSurface faces(List<OptionSurfaceFace> faces) {
    this.faces = faces;
    return this;
  }

  public ApiResponseOptionsSurface addFacesItem(OptionSurfaceFace facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * A list of triangular faces for the options volatility surface.
   * @return faces
  **/
  @ApiModelProperty(value = "A list of triangular faces for the options volatility surface.")
  public List<OptionSurfaceFace> getFaces() {
    return faces;
  }

  public void setFaces(List<OptionSurfaceFace> faces) {
    this.faces = faces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsSurface apiResponseOptionsSurface = (ApiResponseOptionsSurface) o;
    return Objects.equals(this.updatedOn, apiResponseOptionsSurface.updatedOn) &&
        Objects.equals(this.vertices, apiResponseOptionsSurface.vertices) &&
        Objects.equals(this.faces, apiResponseOptionsSurface.faces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedOn, vertices, faces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsSurface {\n");
    
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
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

