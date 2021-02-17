

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.InsiderTransaction;
import com.intrinio.models.OwnerSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An insider transaction SEC filing and its associated transactions
 */
@ApiModel(description = "An insider transaction SEC filing and its associated transactions")

public class InsiderTransactionFiling {
  @SerializedName("filing_url")
  private String filingUrl = null;

  @SerializedName("transactions")
  private List<InsiderTransaction> transactions = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("owner")
  private OwnerSummary owner = null;

  public InsiderTransactionFiling filingUrl(String filingUrl) {
    this.filingUrl = filingUrl;
    return this;
  }

   /**
   * The URL of the filing with the SEC
   * @return filingUrl
  **/
  @ApiModelProperty(value = "The URL of the filing with the SEC")
  public String getFilingUrl() {
    return filingUrl;
  }

  public void setFilingUrl(String filingUrl) {
    this.filingUrl = filingUrl;
  }

  public InsiderTransactionFiling transactions(List<InsiderTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public InsiderTransactionFiling addTransactionsItem(InsiderTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * The insider transactions associated with the filing
   * @return transactions
  **/
  @ApiModelProperty(value = "The insider transactions associated with the filing")
  public List<InsiderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<InsiderTransaction> transactions) {
    this.transactions = transactions;
  }

  public InsiderTransactionFiling company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The company associated with the filing
   * @return company
  **/
  @ApiModelProperty(value = "The company associated with the filing")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public InsiderTransactionFiling owner(OwnerSummary owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner associated with the filing
   * @return owner
  **/
  @ApiModelProperty(value = "The owner associated with the filing")
  public OwnerSummary getOwner() {
    return owner;
  }

  public void setOwner(OwnerSummary owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsiderTransactionFiling insiderTransactionFiling = (InsiderTransactionFiling) o;
    return Objects.equals(this.filingUrl, insiderTransactionFiling.filingUrl) &&
        Objects.equals(this.transactions, insiderTransactionFiling.transactions) &&
        Objects.equals(this.company, insiderTransactionFiling.company) &&
        Objects.equals(this.owner, insiderTransactionFiling.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filingUrl, transactions, company, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsiderTransactionFiling {\n");
    
    sb.append("    filingUrl: ").append(toIndentedString(filingUrl)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

