

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Municipality;
import com.intrinio.models.MunicipalityFinancial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseMunicipalitiyFinancials
 */

public class ApiResponseMunicipalitiyFinancials {
  @SerializedName("financials")
  private List<MunicipalityFinancial> financials = null;

  @SerializedName("municipality")
  private Municipality municipality = null;

  public ApiResponseMunicipalitiyFinancials financials(List<MunicipalityFinancial> financials) {
    this.financials = financials;
    return this;
  }

  public ApiResponseMunicipalitiyFinancials addFinancialsItem(MunicipalityFinancial financialsItem) {
    if (this.financials == null) {
      this.financials = new ArrayList<MunicipalityFinancial>();
    }
    this.financials.add(financialsItem);
    return this;
  }

   /**
   * Get financials
   * @return financials
  **/
  @ApiModelProperty(value = "")
  public List<MunicipalityFinancial> getFinancials() {
    return financials;
  }

  public void setFinancials(List<MunicipalityFinancial> financials) {
    this.financials = financials;
  }

  public ApiResponseMunicipalitiyFinancials municipality(Municipality municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Get municipality
   * @return municipality
  **/
  @ApiModelProperty(value = "")
  public Municipality getMunicipality() {
    return municipality;
  }

  public void setMunicipality(Municipality municipality) {
    this.municipality = municipality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseMunicipalitiyFinancials apiResponseMunicipalitiyFinancials = (ApiResponseMunicipalitiyFinancials) o;
    return Objects.equals(this.financials, apiResponseMunicipalitiyFinancials.financials) &&
        Objects.equals(this.municipality, apiResponseMunicipalitiyFinancials.municipality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financials, municipality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseMunicipalitiyFinancials {\n");
    
    sb.append("    financials: ").append(toIndentedString(financials)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
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

