

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecurityScreenClause;
import com.intrinio.models.SecurityScreenGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A group of clauses and groups combined with a logic operator, used to screen securities
 */
@ApiModel(description = "A group of clauses and groups combined with a logic operator, used to screen securities")

public class SecurityScreenGroup {
  @SerializedName("operator")
  private String operator = null;

  @SerializedName("clauses")
  private List<SecurityScreenClause> clauses = null;

  @SerializedName("groups")
  private List<SecurityScreenGroup> groups = null;

  public SecurityScreenGroup operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The logic operator for the group (AND, OR, NOT)
   * @return operator
  **/
  @ApiModelProperty(value = "The logic operator for the group (AND, OR, NOT)")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public SecurityScreenGroup clauses(List<SecurityScreenClause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public SecurityScreenGroup addClausesItem(SecurityScreenClause clausesItem) {
    if (this.clauses == null) {
      this.clauses = new ArrayList<SecurityScreenClause>();
    }
    this.clauses.add(clausesItem);
    return this;
  }

   /**
   * The logic clauses in the group
   * @return clauses
  **/
  @ApiModelProperty(value = "The logic clauses in the group")
  public List<SecurityScreenClause> getClauses() {
    return clauses;
  }

  public void setClauses(List<SecurityScreenClause> clauses) {
    this.clauses = clauses;
  }

  public SecurityScreenGroup groups(List<SecurityScreenGroup> groups) {
    this.groups = groups;
    return this;
  }

  public SecurityScreenGroup addGroupsItem(SecurityScreenGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<SecurityScreenGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The nested groups within the group
   * @return groups
  **/
  @ApiModelProperty(value = "The nested groups within the group")
  public List<SecurityScreenGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<SecurityScreenGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScreenGroup securityScreenGroup = (SecurityScreenGroup) o;
    return Objects.equals(this.operator, securityScreenGroup.operator) &&
        Objects.equals(this.clauses, securityScreenGroup.clauses) &&
        Objects.equals(this.groups, securityScreenGroup.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, clauses, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScreenGroup {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

