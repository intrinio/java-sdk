

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
import java.math.BigDecimal;

/**
 * ApiResponseOptionsSurfaceInterpolatedIv
 */

public class ApiResponseOptionsSurfaceInterpolatedIv {
  @SerializedName("implied_volatility")
  private BigDecimal impliedVolatility = null;

  public ApiResponseOptionsSurfaceInterpolatedIv impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The interpolated implied volatility for the given strike and expiration, calculated from the smoothed volatility surface.
   * @return impliedVolatility
  **/
  @ApiModelProperty(value = "The interpolated implied volatility for the given strike and expiration, calculated from the smoothed volatility surface.")
  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }

  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsSurfaceInterpolatedIv apiResponseOptionsSurfaceInterpolatedIv = (ApiResponseOptionsSurfaceInterpolatedIv) o;
    return Objects.equals(this.impliedVolatility, apiResponseOptionsSurfaceInterpolatedIv.impliedVolatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impliedVolatility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsSurfaceInterpolatedIv {\n");
    
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
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

