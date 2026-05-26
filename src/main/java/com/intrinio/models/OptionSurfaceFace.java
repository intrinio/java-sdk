

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
 * A triangular face in the options volatility surface.
 */
@ApiModel(description = "A triangular face in the options volatility surface.")

public class OptionSurfaceFace {
  @SerializedName("vertex_a")
  private Integer vertexA = null;

  @SerializedName("vertex_b")
  private Integer vertexB = null;

  @SerializedName("vertex_c")
  private Integer vertexC = null;

  public OptionSurfaceFace vertexA(Integer vertexA) {
    this.vertexA = vertexA;
    return this;
  }

   /**
   * The index of vertex A in the vertices array.
   * @return vertexA
  **/
  @ApiModelProperty(value = "The index of vertex A in the vertices array.")
  public Integer getVertexA() {
    return vertexA;
  }

  public void setVertexA(Integer vertexA) {
    this.vertexA = vertexA;
  }

  public OptionSurfaceFace vertexB(Integer vertexB) {
    this.vertexB = vertexB;
    return this;
  }

   /**
   * The index of vertex B in the vertices array.
   * @return vertexB
  **/
  @ApiModelProperty(value = "The index of vertex B in the vertices array.")
  public Integer getVertexB() {
    return vertexB;
  }

  public void setVertexB(Integer vertexB) {
    this.vertexB = vertexB;
  }

  public OptionSurfaceFace vertexC(Integer vertexC) {
    this.vertexC = vertexC;
    return this;
  }

   /**
   * The index of vertex B in the vertices array.
   * @return vertexC
  **/
  @ApiModelProperty(value = "The index of vertex B in the vertices array.")
  public Integer getVertexC() {
    return vertexC;
  }

  public void setVertexC(Integer vertexC) {
    this.vertexC = vertexC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionSurfaceFace optionSurfaceFace = (OptionSurfaceFace) o;
    return Objects.equals(this.vertexA, optionSurfaceFace.vertexA) &&
        Objects.equals(this.vertexB, optionSurfaceFace.vertexB) &&
        Objects.equals(this.vertexC, optionSurfaceFace.vertexC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexA, vertexB, vertexC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSurfaceFace {\n");
    
    sb.append("    vertexA: ").append(toIndentedString(vertexA)).append("\n");
    sb.append("    vertexB: ").append(toIndentedString(vertexB)).append("\n");
    sb.append("    vertexC: ").append(toIndentedString(vertexC)).append("\n");
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

