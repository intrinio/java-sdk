

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
 * Financial statement data for a Municipality and a Fiscal Year
 */
@ApiModel(description = "Financial statement data for a Municipality and a Fiscal Year")

public class MunicipalityFinancial {
  @SerializedName("fiscal_year")
  private BigDecimal fiscalYear = null;

  @SerializedName("current_assets")
  private BigDecimal currentAssets = null;

  @SerializedName("non_current_assets")
  private BigDecimal nonCurrentAssets = null;

  @SerializedName("deferred_outflows")
  private BigDecimal deferredOutflows = null;

  @SerializedName("total_assets")
  private BigDecimal totalAssets = null;

  @SerializedName("total_assets_plus_deferred_outflows")
  private BigDecimal totalAssetsPlusDeferredOutflows = null;

  @SerializedName("current_liabilities")
  private BigDecimal currentLiabilities = null;

  @SerializedName("current_portion_of_long_term_debt")
  private BigDecimal currentPortionOfLongTermDebt = null;

  @SerializedName("net_pension_liability")
  private BigDecimal netPensionLiability = null;

  @SerializedName("net_opeb_liability")
  private BigDecimal netOpebLiability = null;

  @SerializedName("all_other_long_term_debt")
  private BigDecimal allOtherLongTermDebt = null;

  @SerializedName("total_liabilities")
  private BigDecimal totalLiabilities = null;

  @SerializedName("deferred_inflows")
  private BigDecimal deferredInflows = null;

  @SerializedName("total_liabilities_plus_deferred_inflows")
  private BigDecimal totalLiabilitiesPlusDeferredInflows = null;

  @SerializedName("total_net_position")
  private BigDecimal totalNetPosition = null;

  @SerializedName("total_unrestricted_net_position")
  private BigDecimal totalUnrestrictedNetPosition = null;

  @SerializedName("total_expenses")
  private BigDecimal totalExpenses = null;

  @SerializedName("charges_for_services")
  private BigDecimal chargesForServices = null;

  @SerializedName("operating_grants_and_contributions")
  private BigDecimal operatingGrantsAndContributions = null;

  @SerializedName("capital_grants_and_contributions")
  private BigDecimal capitalGrantsAndContributions = null;

  @SerializedName("general_revenues")
  private BigDecimal generalRevenues = null;

  @SerializedName("other_revenues")
  private BigDecimal otherRevenues = null;

  @SerializedName("total_revenues")
  private BigDecimal totalRevenues = null;

  @SerializedName("change_in_net_assets")
  private BigDecimal changeInNetAssets = null;

  @SerializedName("non_spendable_general_fund_balance")
  private BigDecimal nonSpendableGeneralFundBalance = null;

  @SerializedName("restricted_general_fund_balance")
  private BigDecimal restrictedGeneralFundBalance = null;

  @SerializedName("committed_general_fund_balance")
  private BigDecimal committedGeneralFundBalance = null;

  @SerializedName("unassigned_general_fund_balance")
  private BigDecimal unassignedGeneralFundBalance = null;

  @SerializedName("assigned_general_fund_balance")
  private BigDecimal assignedGeneralFundBalance = null;

  @SerializedName("total_general_fund_balance")
  private BigDecimal totalGeneralFundBalance = null;

  @SerializedName("non_spendable_governmental_fund_balance")
  private BigDecimal nonSpendableGovernmentalFundBalance = null;

  @SerializedName("restricted_governmental_fund_balance")
  private BigDecimal restrictedGovernmentalFundBalance = null;

  @SerializedName("committed_governmental_fund_balance")
  private BigDecimal committedGovernmentalFundBalance = null;

  @SerializedName("unassigned_governmental_fund_balance")
  private BigDecimal unassignedGovernmentalFundBalance = null;

  @SerializedName("assigned_governmental_fund_balance")
  private BigDecimal assignedGovernmentalFundBalance = null;

  @SerializedName("total_governmental_fund_balance")
  private BigDecimal totalGovernmentalFundBalance = null;

  @SerializedName("general_fund_revenues")
  private BigDecimal generalFundRevenues = null;

  @SerializedName("general_fund_expenditures")
  private BigDecimal generalFundExpenditures = null;

  @SerializedName("general_fund_revenues_over_under_expenditure")
  private BigDecimal generalFundRevenuesOverUnderExpenditure = null;

  @SerializedName("governmental_fund_revenues")
  private BigDecimal governmentalFundRevenues = null;

  @SerializedName("governmental_fund_expenditures")
  private BigDecimal governmentalFundExpenditures = null;

  @SerializedName("governmental_fund_revenues_over_under_expenditure")
  private BigDecimal governmentalFundRevenuesOverUnderExpenditure = null;

  public MunicipalityFinancial fiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The fiscal year from which the financial data came from
   * @return fiscalYear
  **/
  @ApiModelProperty(value = "The fiscal year from which the financial data came from")
  public BigDecimal getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(BigDecimal fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public MunicipalityFinancial currentAssets(BigDecimal currentAssets) {
    this.currentAssets = currentAssets;
    return this;
  }

   /**
   * Government-wide holdings that can be liquidated on short notice
   * @return currentAssets
  **/
  @ApiModelProperty(value = "Government-wide holdings that can be liquidated on short notice")
  public BigDecimal getCurrentAssets() {
    return currentAssets;
  }

  public void setCurrentAssets(BigDecimal currentAssets) {
    this.currentAssets = currentAssets;
  }

  public MunicipalityFinancial nonCurrentAssets(BigDecimal nonCurrentAssets) {
    this.nonCurrentAssets = nonCurrentAssets;
    return this;
  }

   /**
   * Government-wide holdings not intended for near-term liquidation
   * @return nonCurrentAssets
  **/
  @ApiModelProperty(value = "Government-wide holdings not intended for near-term liquidation")
  public BigDecimal getNonCurrentAssets() {
    return nonCurrentAssets;
  }

  public void setNonCurrentAssets(BigDecimal nonCurrentAssets) {
    this.nonCurrentAssets = nonCurrentAssets;
  }

  public MunicipalityFinancial deferredOutflows(BigDecimal deferredOutflows) {
    this.deferredOutflows = deferredOutflows;
    return this;
  }

   /**
   * Government-wide consumptions of net position applicable to a future year
   * @return deferredOutflows
  **/
  @ApiModelProperty(value = "Government-wide consumptions of net position applicable to a future year")
  public BigDecimal getDeferredOutflows() {
    return deferredOutflows;
  }

  public void setDeferredOutflows(BigDecimal deferredOutflows) {
    this.deferredOutflows = deferredOutflows;
  }

  public MunicipalityFinancial totalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
    return this;
  }

   /**
   * Government-wide holdings
   * @return totalAssets
  **/
  @ApiModelProperty(value = "Government-wide holdings")
  public BigDecimal getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(BigDecimal totalAssets) {
    this.totalAssets = totalAssets;
  }

  public MunicipalityFinancial totalAssetsPlusDeferredOutflows(BigDecimal totalAssetsPlusDeferredOutflows) {
    this.totalAssetsPlusDeferredOutflows = totalAssetsPlusDeferredOutflows;
    return this;
  }

   /**
   * Sum of government-wide total assets and deferred outflows of resources
   * @return totalAssetsPlusDeferredOutflows
  **/
  @ApiModelProperty(value = "Sum of government-wide total assets and deferred outflows of resources")
  public BigDecimal getTotalAssetsPlusDeferredOutflows() {
    return totalAssetsPlusDeferredOutflows;
  }

  public void setTotalAssetsPlusDeferredOutflows(BigDecimal totalAssetsPlusDeferredOutflows) {
    this.totalAssetsPlusDeferredOutflows = totalAssetsPlusDeferredOutflows;
  }

  public MunicipalityFinancial currentLiabilities(BigDecimal currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
    return this;
  }

   /**
   * Government-wide liabilities that typically become due within one year
   * @return currentLiabilities
  **/
  @ApiModelProperty(value = "Government-wide liabilities that typically become due within one year")
  public BigDecimal getCurrentLiabilities() {
    return currentLiabilities;
  }

  public void setCurrentLiabilities(BigDecimal currentLiabilities) {
    this.currentLiabilities = currentLiabilities;
  }

  public MunicipalityFinancial currentPortionOfLongTermDebt(BigDecimal currentPortionOfLongTermDebt) {
    this.currentPortionOfLongTermDebt = currentPortionOfLongTermDebt;
    return this;
  }

   /**
   * Government-wide portion of long term obligations, such as bond and loan debt coming due within the next year
   * @return currentPortionOfLongTermDebt
  **/
  @ApiModelProperty(value = "Government-wide portion of long term obligations, such as bond and loan debt coming due within the next year")
  public BigDecimal getCurrentPortionOfLongTermDebt() {
    return currentPortionOfLongTermDebt;
  }

  public void setCurrentPortionOfLongTermDebt(BigDecimal currentPortionOfLongTermDebt) {
    this.currentPortionOfLongTermDebt = currentPortionOfLongTermDebt;
  }

  public MunicipalityFinancial netPensionLiability(BigDecimal netPensionLiability) {
    this.netPensionLiability = netPensionLiability;
    return this;
  }

   /**
   * Government-wide liability for employee pensions net of the fiduciary net position of pension plans in which the government has an interest
   * @return netPensionLiability
  **/
  @ApiModelProperty(value = "Government-wide liability for employee pensions net of the fiduciary net position of pension plans in which the government has an interest")
  public BigDecimal getNetPensionLiability() {
    return netPensionLiability;
  }

  public void setNetPensionLiability(BigDecimal netPensionLiability) {
    this.netPensionLiability = netPensionLiability;
  }

  public MunicipalityFinancial netOpebLiability(BigDecimal netOpebLiability) {
    this.netOpebLiability = netOpebLiability;
    return this;
  }

   /**
   * Government-wide liability for other postemployment benefits (OPEB). These are benefits (such as death benefits, life insurance, disability, and long-term care) that are paid in the period after employment and that are provided separately from a pension plan, as well as healthcare benefits paid in the period after employment, regardless of the manner in which they are provided. OPEB does not include termination benefits or termination payments for sick leave. Liability is reported net of any OPEB assets the government may control.
   * @return netOpebLiability
  **/
  @ApiModelProperty(value = "Government-wide liability for other postemployment benefits (OPEB). These are benefits (such as death benefits, life insurance, disability, and long-term care) that are paid in the period after employment and that are provided separately from a pension plan, as well as healthcare benefits paid in the period after employment, regardless of the manner in which they are provided. OPEB does not include termination benefits or termination payments for sick leave. Liability is reported net of any OPEB assets the government may control.")
  public BigDecimal getNetOpebLiability() {
    return netOpebLiability;
  }

  public void setNetOpebLiability(BigDecimal netOpebLiability) {
    this.netOpebLiability = netOpebLiability;
  }

  public MunicipalityFinancial allOtherLongTermDebt(BigDecimal allOtherLongTermDebt) {
    this.allOtherLongTermDebt = allOtherLongTermDebt;
    return this;
  }

   /**
   * Government-wide liabilities not elsewhere classified
   * @return allOtherLongTermDebt
  **/
  @ApiModelProperty(value = "Government-wide liabilities not elsewhere classified")
  public BigDecimal getAllOtherLongTermDebt() {
    return allOtherLongTermDebt;
  }

  public void setAllOtherLongTermDebt(BigDecimal allOtherLongTermDebt) {
    this.allOtherLongTermDebt = allOtherLongTermDebt;
  }

  public MunicipalityFinancial totalLiabilities(BigDecimal totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
    return this;
  }

   /**
   * The sum of the Municipality&#39;s all other long term debt, net open liability, net pension liability, and current portion of long term debt
   * @return totalLiabilities
  **/
  @ApiModelProperty(value = "The sum of the Municipality's all other long term debt, net open liability, net pension liability, and current portion of long term debt")
  public BigDecimal getTotalLiabilities() {
    return totalLiabilities;
  }

  public void setTotalLiabilities(BigDecimal totalLiabilities) {
    this.totalLiabilities = totalLiabilities;
  }

  public MunicipalityFinancial deferredInflows(BigDecimal deferredInflows) {
    this.deferredInflows = deferredInflows;
    return this;
  }

   /**
   * Government-wide acquisitions of net position applicable to a future year
   * @return deferredInflows
  **/
  @ApiModelProperty(value = "Government-wide acquisitions of net position applicable to a future year")
  public BigDecimal getDeferredInflows() {
    return deferredInflows;
  }

  public void setDeferredInflows(BigDecimal deferredInflows) {
    this.deferredInflows = deferredInflows;
  }

  public MunicipalityFinancial totalLiabilitiesPlusDeferredInflows(BigDecimal totalLiabilitiesPlusDeferredInflows) {
    this.totalLiabilitiesPlusDeferredInflows = totalLiabilitiesPlusDeferredInflows;
    return this;
  }

   /**
   * Sum of government-wide liabilities and deferred inflows of resources
   * @return totalLiabilitiesPlusDeferredInflows
  **/
  @ApiModelProperty(value = "Sum of government-wide liabilities and deferred inflows of resources")
  public BigDecimal getTotalLiabilitiesPlusDeferredInflows() {
    return totalLiabilitiesPlusDeferredInflows;
  }

  public void setTotalLiabilitiesPlusDeferredInflows(BigDecimal totalLiabilitiesPlusDeferredInflows) {
    this.totalLiabilitiesPlusDeferredInflows = totalLiabilitiesPlusDeferredInflows;
  }

  public MunicipalityFinancial totalNetPosition(BigDecimal totalNetPosition) {
    this.totalNetPosition = totalNetPosition;
    return this;
  }

   /**
   * Government-wide assets and deferred outflows less government-wide liabilities and deferred inflows
   * @return totalNetPosition
  **/
  @ApiModelProperty(value = "Government-wide assets and deferred outflows less government-wide liabilities and deferred inflows")
  public BigDecimal getTotalNetPosition() {
    return totalNetPosition;
  }

  public void setTotalNetPosition(BigDecimal totalNetPosition) {
    this.totalNetPosition = totalNetPosition;
  }

  public MunicipalityFinancial totalUnrestrictedNetPosition(BigDecimal totalUnrestrictedNetPosition) {
    this.totalUnrestrictedNetPosition = totalUnrestrictedNetPosition;
    return this;
  }

   /**
   * Net amount of government-wide assets, deferred outflows of resources, liabilities, and deferred inflows of resources that are not included in the determination of net investment in capital assets or the restricted components of net position
   * @return totalUnrestrictedNetPosition
  **/
  @ApiModelProperty(value = "Net amount of government-wide assets, deferred outflows of resources, liabilities, and deferred inflows of resources that are not included in the determination of net investment in capital assets or the restricted components of net position")
  public BigDecimal getTotalUnrestrictedNetPosition() {
    return totalUnrestrictedNetPosition;
  }

  public void setTotalUnrestrictedNetPosition(BigDecimal totalUnrestrictedNetPosition) {
    this.totalUnrestrictedNetPosition = totalUnrestrictedNetPosition;
  }

  public MunicipalityFinancial totalExpenses(BigDecimal totalExpenses) {
    this.totalExpenses = totalExpenses;
    return this;
  }

   /**
   * Decreases in net position that occurred during the past year, government-wide
   * @return totalExpenses
  **/
  @ApiModelProperty(value = "Decreases in net position that occurred during the past year, government-wide")
  public BigDecimal getTotalExpenses() {
    return totalExpenses;
  }

  public void setTotalExpenses(BigDecimal totalExpenses) {
    this.totalExpenses = totalExpenses;
  }

  public MunicipalityFinancial chargesForServices(BigDecimal chargesForServices) {
    this.chargesForServices = chargesForServices;
    return this;
  }

   /**
   * Charges for services is the term used for a broad category of program revenues that arise from charges to customers, applicants, or others who purchase, use, or directly benefit from the goods, services, or privileges provided, or are otherwise directly affected by the services. Revenues in this category include fees charged for specific services, such as water use or garbage collection; licenses and permits, such as dog licenses, liquor licenses, and building permits; operating special assessments, such as for street cleaning or special street lighting; and any other amounts charged to service recipients. Fines and forfeitures are also included in this category because they result from direct charges to those who are otherwise directly affected by a program or service, even though they receive no benefit. Payments from other governments for goods or services should be reported in this category.
   * @return chargesForServices
  **/
  @ApiModelProperty(value = "Charges for services is the term used for a broad category of program revenues that arise from charges to customers, applicants, or others who purchase, use, or directly benefit from the goods, services, or privileges provided, or are otherwise directly affected by the services. Revenues in this category include fees charged for specific services, such as water use or garbage collection; licenses and permits, such as dog licenses, liquor licenses, and building permits; operating special assessments, such as for street cleaning or special street lighting; and any other amounts charged to service recipients. Fines and forfeitures are also included in this category because they result from direct charges to those who are otherwise directly affected by a program or service, even though they receive no benefit. Payments from other governments for goods or services should be reported in this category.")
  public BigDecimal getChargesForServices() {
    return chargesForServices;
  }

  public void setChargesForServices(BigDecimal chargesForServices) {
    this.chargesForServices = chargesForServices;
  }

  public MunicipalityFinancial operatingGrantsAndContributions(BigDecimal operatingGrantsAndContributions) {
    this.operatingGrantsAndContributions = operatingGrantsAndContributions;
    return this;
  }

   /**
   * Program-specific grants and contributions - includes revenues arising from mandatory and voluntary nonexchange transactions with other governments, organizations, or individuals that are restricted for use in a particular program. Some grants and contributions consist of capital assets or resources that are restricted for capital purposes—to purchase, construct, or renovate capital assets associated with a specific program. These should be reported separately from grants and contributions that may be used either for operating expenses or for capital expenditures of the program at the discretion of the reporting government. These categories of program revenue are specifically attributable to a program and reduce the net expense of that program to the reporting government. For example, a state may provide an operating grant to a county sheriff&#39;s department for a drug-awareness-and-enforcement program.
   * @return operatingGrantsAndContributions
  **/
  @ApiModelProperty(value = "Program-specific grants and contributions - includes revenues arising from mandatory and voluntary nonexchange transactions with other governments, organizations, or individuals that are restricted for use in a particular program. Some grants and contributions consist of capital assets or resources that are restricted for capital purposes—to purchase, construct, or renovate capital assets associated with a specific program. These should be reported separately from grants and contributions that may be used either for operating expenses or for capital expenditures of the program at the discretion of the reporting government. These categories of program revenue are specifically attributable to a program and reduce the net expense of that program to the reporting government. For example, a state may provide an operating grant to a county sheriff's department for a drug-awareness-and-enforcement program.")
  public BigDecimal getOperatingGrantsAndContributions() {
    return operatingGrantsAndContributions;
  }

  public void setOperatingGrantsAndContributions(BigDecimal operatingGrantsAndContributions) {
    this.operatingGrantsAndContributions = operatingGrantsAndContributions;
  }

  public MunicipalityFinancial capitalGrantsAndContributions(BigDecimal capitalGrantsAndContributions) {
    this.capitalGrantsAndContributions = capitalGrantsAndContributions;
    return this;
  }

   /**
   * Program-specific grants and contributions - includes revenues arising from mandatory and voluntary nonexchange transactions with other governments, organizations, or individuals that are restricted for use in a particular program. Some grants and contributions consist of capital assets or resources that are restricted for capital purposes—to purchase, construct, or renovate capital assets associated with a specific program. These should be reported separately from grants and contributions that may be used either for operating expenses or for capital expenditures of the program at the discretion of the reporting government. These categories of program revenue are specifically attributable to a program and reduce the net expense of that program to the reporting government. For example, a state may provide a capital grant to finance construction of a new jail.
   * @return capitalGrantsAndContributions
  **/
  @ApiModelProperty(value = "Program-specific grants and contributions - includes revenues arising from mandatory and voluntary nonexchange transactions with other governments, organizations, or individuals that are restricted for use in a particular program. Some grants and contributions consist of capital assets or resources that are restricted for capital purposes—to purchase, construct, or renovate capital assets associated with a specific program. These should be reported separately from grants and contributions that may be used either for operating expenses or for capital expenditures of the program at the discretion of the reporting government. These categories of program revenue are specifically attributable to a program and reduce the net expense of that program to the reporting government. For example, a state may provide a capital grant to finance construction of a new jail.")
  public BigDecimal getCapitalGrantsAndContributions() {
    return capitalGrantsAndContributions;
  }

  public void setCapitalGrantsAndContributions(BigDecimal capitalGrantsAndContributions) {
    this.capitalGrantsAndContributions = capitalGrantsAndContributions;
  }

  public MunicipalityFinancial generalRevenues(BigDecimal generalRevenues) {
    this.generalRevenues = generalRevenues;
    return this;
  }

   /**
   * All revenues are general revenues unless they are required to be reported as program revenues. All taxes, even those that are levied for a specific purpose, are general revenues and should be reported by type of tax—for example, sales tax, property tax, franchise tax, income tax. All other nontax revenues (including interest, grants, and contributions) that do not meet the criteria to be reported as program revenues should also be reported as general revenues. General revenues should be reported after total net expense of the government&#39;s functions.
   * @return generalRevenues
  **/
  @ApiModelProperty(value = "All revenues are general revenues unless they are required to be reported as program revenues. All taxes, even those that are levied for a specific purpose, are general revenues and should be reported by type of tax—for example, sales tax, property tax, franchise tax, income tax. All other nontax revenues (including interest, grants, and contributions) that do not meet the criteria to be reported as program revenues should also be reported as general revenues. General revenues should be reported after total net expense of the government's functions.")
  public BigDecimal getGeneralRevenues() {
    return generalRevenues;
  }

  public void setGeneralRevenues(BigDecimal generalRevenues) {
    this.generalRevenues = generalRevenues;
  }

  public MunicipalityFinancial otherRevenues(BigDecimal otherRevenues) {
    this.otherRevenues = otherRevenues;
    return this;
  }

   /**
   * Government-wide revenues not elsewhere classified
   * @return otherRevenues
  **/
  @ApiModelProperty(value = "Government-wide revenues not elsewhere classified")
  public BigDecimal getOtherRevenues() {
    return otherRevenues;
  }

  public void setOtherRevenues(BigDecimal otherRevenues) {
    this.otherRevenues = otherRevenues;
  }

  public MunicipalityFinancial totalRevenues(BigDecimal totalRevenues) {
    this.totalRevenues = totalRevenues;
    return this;
  }

   /**
   * Increases in net position that occurred during the past year, government-wide
   * @return totalRevenues
  **/
  @ApiModelProperty(value = "Increases in net position that occurred during the past year, government-wide")
  public BigDecimal getTotalRevenues() {
    return totalRevenues;
  }

  public void setTotalRevenues(BigDecimal totalRevenues) {
    this.totalRevenues = totalRevenues;
  }

  public MunicipalityFinancial changeInNetAssets(BigDecimal changeInNetAssets) {
    this.changeInNetAssets = changeInNetAssets;
    return this;
  }

   /**
   * Difference between the government&#39;s net position at the end of the fiscal year and the government&#39;s net position at the beginning of the fiscal year
   * @return changeInNetAssets
  **/
  @ApiModelProperty(value = "Difference between the government's net position at the end of the fiscal year and the government's net position at the beginning of the fiscal year")
  public BigDecimal getChangeInNetAssets() {
    return changeInNetAssets;
  }

  public void setChangeInNetAssets(BigDecimal changeInNetAssets) {
    this.changeInNetAssets = changeInNetAssets;
  }

  public MunicipalityFinancial nonSpendableGeneralFundBalance(BigDecimal nonSpendableGeneralFundBalance) {
    this.nonSpendableGeneralFundBalance = nonSpendableGeneralFundBalance;
    return this;
  }

   /**
   * The portion of general fund balance classified as nonspendable. The nonspendable fund balance classification includes amounts that cannot be spent because they are either (a) not in spendable form or (b) legally or contractually required to be maintained intact. The “not in spendable form” criterion includes items that are not expected to be converted to cash, for example, inventories and prepaid amounts. It also includes the long-term amount of loans and notes receivable, as well as property acquired for resale. However, if the use of the proceeds from the collection of those receivables or from the sale of those properties is restricted, committed, or assigned, then they should be included in the appropriate fund balance classification (restricted, committed, or assigned), rather than nonspendable fund balance. The corpus (or principal) of a permanent fund is an example of an amount that is legally or contractually required to be maintained intact.
   * @return nonSpendableGeneralFundBalance
  **/
  @ApiModelProperty(value = "The portion of general fund balance classified as nonspendable. The nonspendable fund balance classification includes amounts that cannot be spent because they are either (a) not in spendable form or (b) legally or contractually required to be maintained intact. The “not in spendable form” criterion includes items that are not expected to be converted to cash, for example, inventories and prepaid amounts. It also includes the long-term amount of loans and notes receivable, as well as property acquired for resale. However, if the use of the proceeds from the collection of those receivables or from the sale of those properties is restricted, committed, or assigned, then they should be included in the appropriate fund balance classification (restricted, committed, or assigned), rather than nonspendable fund balance. The corpus (or principal) of a permanent fund is an example of an amount that is legally or contractually required to be maintained intact.")
  public BigDecimal getNonSpendableGeneralFundBalance() {
    return nonSpendableGeneralFundBalance;
  }

  public void setNonSpendableGeneralFundBalance(BigDecimal nonSpendableGeneralFundBalance) {
    this.nonSpendableGeneralFundBalance = nonSpendableGeneralFundBalance;
  }

  public MunicipalityFinancial restrictedGeneralFundBalance(BigDecimal restrictedGeneralFundBalance) {
    this.restrictedGeneralFundBalance = restrictedGeneralFundBalance;
    return this;
  }

   /**
   * The portion of general fund balance classified as restricted. Fund balance should be reported as restricted when constraints placed on the use of resources are either (a) Externally imposed by creditors (such as through debt covenants), grantors, contributors, or laws or regulations of other governments or (b) Imposed by law through constitutional provisions or enabling legislation.
   * @return restrictedGeneralFundBalance
  **/
  @ApiModelProperty(value = "The portion of general fund balance classified as restricted. Fund balance should be reported as restricted when constraints placed on the use of resources are either (a) Externally imposed by creditors (such as through debt covenants), grantors, contributors, or laws or regulations of other governments or (b) Imposed by law through constitutional provisions or enabling legislation.")
  public BigDecimal getRestrictedGeneralFundBalance() {
    return restrictedGeneralFundBalance;
  }

  public void setRestrictedGeneralFundBalance(BigDecimal restrictedGeneralFundBalance) {
    this.restrictedGeneralFundBalance = restrictedGeneralFundBalance;
  }

  public MunicipalityFinancial committedGeneralFundBalance(BigDecimal committedGeneralFundBalance) {
    this.committedGeneralFundBalance = committedGeneralFundBalance;
    return this;
  }

   /**
   * The portion of general fund balance classified as committed. Amounts that can only be used for specific purposes pursuant to constraints imposed by formal action of the government’s highest level of decision-making authority should be reported as committed fund balance. Those committed amounts cannot be used for any other purpose unless the government removes or changes the specified use by taking the same type of action (for example, legislation, resolution, ordinance) it employed to previously commit those amounts. The authorization specifying the purposes for which amounts can be used should have the consent of both the legislative and executive branches of the government, if applicable. Committed fund balance also should incorporate contractual obligations to the extent that existing resources in the fund have been specifically committed for use in satisfying those contractual requirements.
   * @return committedGeneralFundBalance
  **/
  @ApiModelProperty(value = "The portion of general fund balance classified as committed. Amounts that can only be used for specific purposes pursuant to constraints imposed by formal action of the government’s highest level of decision-making authority should be reported as committed fund balance. Those committed amounts cannot be used for any other purpose unless the government removes or changes the specified use by taking the same type of action (for example, legislation, resolution, ordinance) it employed to previously commit those amounts. The authorization specifying the purposes for which amounts can be used should have the consent of both the legislative and executive branches of the government, if applicable. Committed fund balance also should incorporate contractual obligations to the extent that existing resources in the fund have been specifically committed for use in satisfying those contractual requirements.")
  public BigDecimal getCommittedGeneralFundBalance() {
    return committedGeneralFundBalance;
  }

  public void setCommittedGeneralFundBalance(BigDecimal committedGeneralFundBalance) {
    this.committedGeneralFundBalance = committedGeneralFundBalance;
  }

  public MunicipalityFinancial unassignedGeneralFundBalance(BigDecimal unassignedGeneralFundBalance) {
    this.unassignedGeneralFundBalance = unassignedGeneralFundBalance;
    return this;
  }

   /**
   * The portion of general fund balance classified as unassigned. Unassigned fund balance is the residual classification for the general fund. This classification represents fund balance that has not been assigned to other funds and that has not been restricted, committed, or assigned to specific purposes within the general fund. The general fund should be the only fund that reports a positive unassigned fund balance amount. In other governmental funds, if expenditures incurred for specific purposes exceeded the amounts restricted, committed, or assigned to those purposes, it may be necessary to report a negative unassigned fund balance.
   * @return unassignedGeneralFundBalance
  **/
  @ApiModelProperty(value = "The portion of general fund balance classified as unassigned. Unassigned fund balance is the residual classification for the general fund. This classification represents fund balance that has not been assigned to other funds and that has not been restricted, committed, or assigned to specific purposes within the general fund. The general fund should be the only fund that reports a positive unassigned fund balance amount. In other governmental funds, if expenditures incurred for specific purposes exceeded the amounts restricted, committed, or assigned to those purposes, it may be necessary to report a negative unassigned fund balance.")
  public BigDecimal getUnassignedGeneralFundBalance() {
    return unassignedGeneralFundBalance;
  }

  public void setUnassignedGeneralFundBalance(BigDecimal unassignedGeneralFundBalance) {
    this.unassignedGeneralFundBalance = unassignedGeneralFundBalance;
  }

  public MunicipalityFinancial assignedGeneralFundBalance(BigDecimal assignedGeneralFundBalance) {
    this.assignedGeneralFundBalance = assignedGeneralFundBalance;
    return this;
  }

   /**
   * The portion of general fund balance classified as assigned. Amounts that are constrained by the government’s intent to be used for specific purposes, but are neither restricted nor committed, should be reported as assigned fund balance, except for stabilization arrangements.. Intent should be expressed by (a) the governing body itself or (b) a body (a budget or finance committee, for example) or official to which the governing body has delegated the authority to assign amounts to be used for specific purposes.
   * @return assignedGeneralFundBalance
  **/
  @ApiModelProperty(value = "The portion of general fund balance classified as assigned. Amounts that are constrained by the government’s intent to be used for specific purposes, but are neither restricted nor committed, should be reported as assigned fund balance, except for stabilization arrangements.. Intent should be expressed by (a) the governing body itself or (b) a body (a budget or finance committee, for example) or official to which the governing body has delegated the authority to assign amounts to be used for specific purposes.")
  public BigDecimal getAssignedGeneralFundBalance() {
    return assignedGeneralFundBalance;
  }

  public void setAssignedGeneralFundBalance(BigDecimal assignedGeneralFundBalance) {
    this.assignedGeneralFundBalance = assignedGeneralFundBalance;
  }

  public MunicipalityFinancial totalGeneralFundBalance(BigDecimal totalGeneralFundBalance) {
    this.totalGeneralFundBalance = totalGeneralFundBalance;
    return this;
  }

   /**
   * General fund balance in all classifications. Fund balance is the difference between governmental fund assets and deferred outflows of resources, and liabilities and deferred inflows of resources. It is sometimes referred to as fund equity. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.
   * @return totalGeneralFundBalance
  **/
  @ApiModelProperty(value = "General fund balance in all classifications. Fund balance is the difference between governmental fund assets and deferred outflows of resources, and liabilities and deferred inflows of resources. It is sometimes referred to as fund equity. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.")
  public BigDecimal getTotalGeneralFundBalance() {
    return totalGeneralFundBalance;
  }

  public void setTotalGeneralFundBalance(BigDecimal totalGeneralFundBalance) {
    this.totalGeneralFundBalance = totalGeneralFundBalance;
  }

  public MunicipalityFinancial nonSpendableGovernmentalFundBalance(BigDecimal nonSpendableGovernmentalFundBalance) {
    this.nonSpendableGovernmentalFundBalance = nonSpendableGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of fund balances that are classified as nonspendable. The nonspendable fund balance classification includes amounts that cannot be spent because they are either (a) not in spendable form or (b) legally or contractually required to be maintained intact. The “not in spendable form” criterion includes items that are not expected to be converted to cash, for example, inventories and prepaid amounts. It also includes the long-term amount of loans and notes receivable, as well as property acquired for resale. However, if the use of the proceeds from the collection of those receivables or from the sale of those properties is restricted, committed, or assigned, then they should be included in the appropriate fund balance classification (restricted, committed, or assigned), rather than nonspendable fund balance.
   * @return nonSpendableGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of fund balances that are classified as nonspendable. The nonspendable fund balance classification includes amounts that cannot be spent because they are either (a) not in spendable form or (b) legally or contractually required to be maintained intact. The “not in spendable form” criterion includes items that are not expected to be converted to cash, for example, inventories and prepaid amounts. It also includes the long-term amount of loans and notes receivable, as well as property acquired for resale. However, if the use of the proceeds from the collection of those receivables or from the sale of those properties is restricted, committed, or assigned, then they should be included in the appropriate fund balance classification (restricted, committed, or assigned), rather than nonspendable fund balance.")
  public BigDecimal getNonSpendableGovernmentalFundBalance() {
    return nonSpendableGovernmentalFundBalance;
  }

  public void setNonSpendableGovernmentalFundBalance(BigDecimal nonSpendableGovernmentalFundBalance) {
    this.nonSpendableGovernmentalFundBalance = nonSpendableGovernmentalFundBalance;
  }

  public MunicipalityFinancial restrictedGovernmentalFundBalance(BigDecimal restrictedGovernmentalFundBalance) {
    this.restrictedGovernmentalFundBalance = restrictedGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of fund balances that are classified as restricted. Fund balance should be reported as restricted when constraints placed on the use of resources are either (a) Externally imposed by creditors (such as through debt covenants), grantors, contributors, or laws or regulations of other governments; or (b) Imposed by law through constitutional provisions or enabling legislation.
   * @return restrictedGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of fund balances that are classified as restricted. Fund balance should be reported as restricted when constraints placed on the use of resources are either (a) Externally imposed by creditors (such as through debt covenants), grantors, contributors, or laws or regulations of other governments; or (b) Imposed by law through constitutional provisions or enabling legislation.")
  public BigDecimal getRestrictedGovernmentalFundBalance() {
    return restrictedGovernmentalFundBalance;
  }

  public void setRestrictedGovernmentalFundBalance(BigDecimal restrictedGovernmentalFundBalance) {
    this.restrictedGovernmentalFundBalance = restrictedGovernmentalFundBalance;
  }

  public MunicipalityFinancial committedGovernmentalFundBalance(BigDecimal committedGovernmentalFundBalance) {
    this.committedGovernmentalFundBalance = committedGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of fund balances that are classified as committed. Amounts that can only be used for specific purposes pursuant to constraints imposed by formal action of the government’s highest level of decision-making authority should be reported as committed fund balance. Those committed amounts cannot be used for any other purpose unless the government removes or changes the specified use by taking the same type of action (for example, legislation, resolution, ordinance) it employed to previously commit those amounts. The authorization specifying the purposes for which amounts can be used should have the consent of both the legislative and executive branches of the government, if applicable. Committed fund balance also should incorporate contractual obligations to the extent that existing resources in the fund have been specifically committed for use in satisfying those contractual requirements.
   * @return committedGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of fund balances that are classified as committed. Amounts that can only be used for specific purposes pursuant to constraints imposed by formal action of the government’s highest level of decision-making authority should be reported as committed fund balance. Those committed amounts cannot be used for any other purpose unless the government removes or changes the specified use by taking the same type of action (for example, legislation, resolution, ordinance) it employed to previously commit those amounts. The authorization specifying the purposes for which amounts can be used should have the consent of both the legislative and executive branches of the government, if applicable. Committed fund balance also should incorporate contractual obligations to the extent that existing resources in the fund have been specifically committed for use in satisfying those contractual requirements.")
  public BigDecimal getCommittedGovernmentalFundBalance() {
    return committedGovernmentalFundBalance;
  }

  public void setCommittedGovernmentalFundBalance(BigDecimal committedGovernmentalFundBalance) {
    this.committedGovernmentalFundBalance = committedGovernmentalFundBalance;
  }

  public MunicipalityFinancial unassignedGovernmentalFundBalance(BigDecimal unassignedGovernmentalFundBalance) {
    this.unassignedGovernmentalFundBalance = unassignedGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of fund balances that are classified as unassigned. Unassigned fund balance is the residual classification for the general fund. This classification represents fund balance that has not been assigned to other funds and that has not been restricted, committed, or assigned to specific purposes within the general fund. The general fund should be the only fund that reports a positive unassigned fund balance amount. In other governmental funds, if expenditures incurred for specific purposes exceeded the amounts restricted, committed, or assigned to those purposes, it may be necessary to report a negative unassigned fund balance.
   * @return unassignedGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of fund balances that are classified as unassigned. Unassigned fund balance is the residual classification for the general fund. This classification represents fund balance that has not been assigned to other funds and that has not been restricted, committed, or assigned to specific purposes within the general fund. The general fund should be the only fund that reports a positive unassigned fund balance amount. In other governmental funds, if expenditures incurred for specific purposes exceeded the amounts restricted, committed, or assigned to those purposes, it may be necessary to report a negative unassigned fund balance.")
  public BigDecimal getUnassignedGovernmentalFundBalance() {
    return unassignedGovernmentalFundBalance;
  }

  public void setUnassignedGovernmentalFundBalance(BigDecimal unassignedGovernmentalFundBalance) {
    this.unassignedGovernmentalFundBalance = unassignedGovernmentalFundBalance;
  }

  public MunicipalityFinancial assignedGovernmentalFundBalance(BigDecimal assignedGovernmentalFundBalance) {
    this.assignedGovernmentalFundBalance = assignedGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of fund balances that are classified as assigned. Amounts that are constrained by the government’s intent to be used for specific purposes, but are neither restricted nor committed, should be reported as assigned fund balance, except for stabilization arrangements.. Intent should be expressed by (a) the governing body itself or (b) a body (a budget or finance committee, for example) or official to which the governing body has delegated the authority to assign amounts to be used for specific purposes.
   * @return assignedGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of fund balances that are classified as assigned. Amounts that are constrained by the government’s intent to be used for specific purposes, but are neither restricted nor committed, should be reported as assigned fund balance, except for stabilization arrangements.. Intent should be expressed by (a) the governing body itself or (b) a body (a budget or finance committee, for example) or official to which the governing body has delegated the authority to assign amounts to be used for specific purposes.")
  public BigDecimal getAssignedGovernmentalFundBalance() {
    return assignedGovernmentalFundBalance;
  }

  public void setAssignedGovernmentalFundBalance(BigDecimal assignedGovernmentalFundBalance) {
    this.assignedGovernmentalFundBalance = assignedGovernmentalFundBalance;
  }

  public MunicipalityFinancial totalGovernmentalFundBalance(BigDecimal totalGovernmentalFundBalance) {
    this.totalGovernmentalFundBalance = totalGovernmentalFundBalance;
    return this;
  }

   /**
   * For all governmental funds, the aggregate of all fund balances in any classification. Fund balance is the difference between governmental fund assets and deferred outflows of resources, and liabilities and deferred inflows of resources. It is sometimes referred to as fund equity. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.
   * @return totalGovernmentalFundBalance
  **/
  @ApiModelProperty(value = "For all governmental funds, the aggregate of all fund balances in any classification. Fund balance is the difference between governmental fund assets and deferred outflows of resources, and liabilities and deferred inflows of resources. It is sometimes referred to as fund equity. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.")
  public BigDecimal getTotalGovernmentalFundBalance() {
    return totalGovernmentalFundBalance;
  }

  public void setTotalGovernmentalFundBalance(BigDecimal totalGovernmentalFundBalance) {
    this.totalGovernmentalFundBalance = totalGovernmentalFundBalance;
  }

  public MunicipalityFinancial generalFundRevenues(BigDecimal generalFundRevenues) {
    this.generalFundRevenues = generalFundRevenues;
    return this;
  }

   /**
   * Increases in financial resources attributable to the general fund. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.
   * @return generalFundRevenues
  **/
  @ApiModelProperty(value = "Increases in financial resources attributable to the general fund. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.")
  public BigDecimal getGeneralFundRevenues() {
    return generalFundRevenues;
  }

  public void setGeneralFundRevenues(BigDecimal generalFundRevenues) {
    this.generalFundRevenues = generalFundRevenues;
  }

  public MunicipalityFinancial generalFundExpenditures(BigDecimal generalFundExpenditures) {
    this.generalFundExpenditures = generalFundExpenditures;
    return this;
  }

   /**
   * Decreases in financial resources attributable to the general fund. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.
   * @return generalFundExpenditures
  **/
  @ApiModelProperty(value = "Decreases in financial resources attributable to the general fund. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.")
  public BigDecimal getGeneralFundExpenditures() {
    return generalFundExpenditures;
  }

  public void setGeneralFundExpenditures(BigDecimal generalFundExpenditures) {
    this.generalFundExpenditures = generalFundExpenditures;
  }

  public MunicipalityFinancial generalFundRevenuesOverUnderExpenditure(BigDecimal generalFundRevenuesOverUnderExpenditure) {
    this.generalFundRevenuesOverUnderExpenditure = generalFundRevenuesOverUnderExpenditure;
    return this;
  }

   /**
   * Difference between general fund revenues and expenditures.  If positive, this amount is called a surplus.  If negative, it represents a deficit. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.
   * @return generalFundRevenuesOverUnderExpenditure
  **/
  @ApiModelProperty(value = "Difference between general fund revenues and expenditures.  If positive, this amount is called a surplus.  If negative, it represents a deficit. The general fund is used to account for and report all financial resources not accounted for and reported in another governmental fund.")
  public BigDecimal getGeneralFundRevenuesOverUnderExpenditure() {
    return generalFundRevenuesOverUnderExpenditure;
  }

  public void setGeneralFundRevenuesOverUnderExpenditure(BigDecimal generalFundRevenuesOverUnderExpenditure) {
    this.generalFundRevenuesOverUnderExpenditure = generalFundRevenuesOverUnderExpenditure;
  }

  public MunicipalityFinancial governmentalFundRevenues(BigDecimal governmentalFundRevenues) {
    this.governmentalFundRevenues = governmentalFundRevenues;
    return this;
  }

   /**
   * Increases in financial resources attributable to any governmental fund. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.
   * @return governmentalFundRevenues
  **/
  @ApiModelProperty(value = "Increases in financial resources attributable to any governmental fund. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.")
  public BigDecimal getGovernmentalFundRevenues() {
    return governmentalFundRevenues;
  }

  public void setGovernmentalFundRevenues(BigDecimal governmentalFundRevenues) {
    this.governmentalFundRevenues = governmentalFundRevenues;
  }

  public MunicipalityFinancial governmentalFundExpenditures(BigDecimal governmentalFundExpenditures) {
    this.governmentalFundExpenditures = governmentalFundExpenditures;
    return this;
  }

   /**
   * Decreases in financial resources attributable to any governmental fund. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.
   * @return governmentalFundExpenditures
  **/
  @ApiModelProperty(value = "Decreases in financial resources attributable to any governmental fund. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.")
  public BigDecimal getGovernmentalFundExpenditures() {
    return governmentalFundExpenditures;
  }

  public void setGovernmentalFundExpenditures(BigDecimal governmentalFundExpenditures) {
    this.governmentalFundExpenditures = governmentalFundExpenditures;
  }

  public MunicipalityFinancial governmentalFundRevenuesOverUnderExpenditure(BigDecimal governmentalFundRevenuesOverUnderExpenditure) {
    this.governmentalFundRevenuesOverUnderExpenditure = governmentalFundRevenuesOverUnderExpenditure;
    return this;
  }

   /**
   * Difference between revenues and expenditures attributable to all governmental funds.  If positive, this amount is called a surplus.  If negative, it represents a deficit. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.
   * @return governmentalFundRevenuesOverUnderExpenditure
  **/
  @ApiModelProperty(value = "Difference between revenues and expenditures attributable to all governmental funds.  If positive, this amount is called a surplus.  If negative, it represents a deficit. Governmental funds are used to account for general government activities that are financed primarily through taxes, intergovernmental revenues, and other nonexchange revenues.")
  public BigDecimal getGovernmentalFundRevenuesOverUnderExpenditure() {
    return governmentalFundRevenuesOverUnderExpenditure;
  }

  public void setGovernmentalFundRevenuesOverUnderExpenditure(BigDecimal governmentalFundRevenuesOverUnderExpenditure) {
    this.governmentalFundRevenuesOverUnderExpenditure = governmentalFundRevenuesOverUnderExpenditure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MunicipalityFinancial municipalityFinancial = (MunicipalityFinancial) o;
    return Objects.equals(this.fiscalYear, municipalityFinancial.fiscalYear) &&
        Objects.equals(this.currentAssets, municipalityFinancial.currentAssets) &&
        Objects.equals(this.nonCurrentAssets, municipalityFinancial.nonCurrentAssets) &&
        Objects.equals(this.deferredOutflows, municipalityFinancial.deferredOutflows) &&
        Objects.equals(this.totalAssets, municipalityFinancial.totalAssets) &&
        Objects.equals(this.totalAssetsPlusDeferredOutflows, municipalityFinancial.totalAssetsPlusDeferredOutflows) &&
        Objects.equals(this.currentLiabilities, municipalityFinancial.currentLiabilities) &&
        Objects.equals(this.currentPortionOfLongTermDebt, municipalityFinancial.currentPortionOfLongTermDebt) &&
        Objects.equals(this.netPensionLiability, municipalityFinancial.netPensionLiability) &&
        Objects.equals(this.netOpebLiability, municipalityFinancial.netOpebLiability) &&
        Objects.equals(this.allOtherLongTermDebt, municipalityFinancial.allOtherLongTermDebt) &&
        Objects.equals(this.totalLiabilities, municipalityFinancial.totalLiabilities) &&
        Objects.equals(this.deferredInflows, municipalityFinancial.deferredInflows) &&
        Objects.equals(this.totalLiabilitiesPlusDeferredInflows, municipalityFinancial.totalLiabilitiesPlusDeferredInflows) &&
        Objects.equals(this.totalNetPosition, municipalityFinancial.totalNetPosition) &&
        Objects.equals(this.totalUnrestrictedNetPosition, municipalityFinancial.totalUnrestrictedNetPosition) &&
        Objects.equals(this.totalExpenses, municipalityFinancial.totalExpenses) &&
        Objects.equals(this.chargesForServices, municipalityFinancial.chargesForServices) &&
        Objects.equals(this.operatingGrantsAndContributions, municipalityFinancial.operatingGrantsAndContributions) &&
        Objects.equals(this.capitalGrantsAndContributions, municipalityFinancial.capitalGrantsAndContributions) &&
        Objects.equals(this.generalRevenues, municipalityFinancial.generalRevenues) &&
        Objects.equals(this.otherRevenues, municipalityFinancial.otherRevenues) &&
        Objects.equals(this.totalRevenues, municipalityFinancial.totalRevenues) &&
        Objects.equals(this.changeInNetAssets, municipalityFinancial.changeInNetAssets) &&
        Objects.equals(this.nonSpendableGeneralFundBalance, municipalityFinancial.nonSpendableGeneralFundBalance) &&
        Objects.equals(this.restrictedGeneralFundBalance, municipalityFinancial.restrictedGeneralFundBalance) &&
        Objects.equals(this.committedGeneralFundBalance, municipalityFinancial.committedGeneralFundBalance) &&
        Objects.equals(this.unassignedGeneralFundBalance, municipalityFinancial.unassignedGeneralFundBalance) &&
        Objects.equals(this.assignedGeneralFundBalance, municipalityFinancial.assignedGeneralFundBalance) &&
        Objects.equals(this.totalGeneralFundBalance, municipalityFinancial.totalGeneralFundBalance) &&
        Objects.equals(this.nonSpendableGovernmentalFundBalance, municipalityFinancial.nonSpendableGovernmentalFundBalance) &&
        Objects.equals(this.restrictedGovernmentalFundBalance, municipalityFinancial.restrictedGovernmentalFundBalance) &&
        Objects.equals(this.committedGovernmentalFundBalance, municipalityFinancial.committedGovernmentalFundBalance) &&
        Objects.equals(this.unassignedGovernmentalFundBalance, municipalityFinancial.unassignedGovernmentalFundBalance) &&
        Objects.equals(this.assignedGovernmentalFundBalance, municipalityFinancial.assignedGovernmentalFundBalance) &&
        Objects.equals(this.totalGovernmentalFundBalance, municipalityFinancial.totalGovernmentalFundBalance) &&
        Objects.equals(this.generalFundRevenues, municipalityFinancial.generalFundRevenues) &&
        Objects.equals(this.generalFundExpenditures, municipalityFinancial.generalFundExpenditures) &&
        Objects.equals(this.generalFundRevenuesOverUnderExpenditure, municipalityFinancial.generalFundRevenuesOverUnderExpenditure) &&
        Objects.equals(this.governmentalFundRevenues, municipalityFinancial.governmentalFundRevenues) &&
        Objects.equals(this.governmentalFundExpenditures, municipalityFinancial.governmentalFundExpenditures) &&
        Objects.equals(this.governmentalFundRevenuesOverUnderExpenditure, municipalityFinancial.governmentalFundRevenuesOverUnderExpenditure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currentAssets, nonCurrentAssets, deferredOutflows, totalAssets, totalAssetsPlusDeferredOutflows, currentLiabilities, currentPortionOfLongTermDebt, netPensionLiability, netOpebLiability, allOtherLongTermDebt, totalLiabilities, deferredInflows, totalLiabilitiesPlusDeferredInflows, totalNetPosition, totalUnrestrictedNetPosition, totalExpenses, chargesForServices, operatingGrantsAndContributions, capitalGrantsAndContributions, generalRevenues, otherRevenues, totalRevenues, changeInNetAssets, nonSpendableGeneralFundBalance, restrictedGeneralFundBalance, committedGeneralFundBalance, unassignedGeneralFundBalance, assignedGeneralFundBalance, totalGeneralFundBalance, nonSpendableGovernmentalFundBalance, restrictedGovernmentalFundBalance, committedGovernmentalFundBalance, unassignedGovernmentalFundBalance, assignedGovernmentalFundBalance, totalGovernmentalFundBalance, generalFundRevenues, generalFundExpenditures, generalFundRevenuesOverUnderExpenditure, governmentalFundRevenues, governmentalFundExpenditures, governmentalFundRevenuesOverUnderExpenditure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MunicipalityFinancial {\n");
    
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    currentAssets: ").append(toIndentedString(currentAssets)).append("\n");
    sb.append("    nonCurrentAssets: ").append(toIndentedString(nonCurrentAssets)).append("\n");
    sb.append("    deferredOutflows: ").append(toIndentedString(deferredOutflows)).append("\n");
    sb.append("    totalAssets: ").append(toIndentedString(totalAssets)).append("\n");
    sb.append("    totalAssetsPlusDeferredOutflows: ").append(toIndentedString(totalAssetsPlusDeferredOutflows)).append("\n");
    sb.append("    currentLiabilities: ").append(toIndentedString(currentLiabilities)).append("\n");
    sb.append("    currentPortionOfLongTermDebt: ").append(toIndentedString(currentPortionOfLongTermDebt)).append("\n");
    sb.append("    netPensionLiability: ").append(toIndentedString(netPensionLiability)).append("\n");
    sb.append("    netOpebLiability: ").append(toIndentedString(netOpebLiability)).append("\n");
    sb.append("    allOtherLongTermDebt: ").append(toIndentedString(allOtherLongTermDebt)).append("\n");
    sb.append("    totalLiabilities: ").append(toIndentedString(totalLiabilities)).append("\n");
    sb.append("    deferredInflows: ").append(toIndentedString(deferredInflows)).append("\n");
    sb.append("    totalLiabilitiesPlusDeferredInflows: ").append(toIndentedString(totalLiabilitiesPlusDeferredInflows)).append("\n");
    sb.append("    totalNetPosition: ").append(toIndentedString(totalNetPosition)).append("\n");
    sb.append("    totalUnrestrictedNetPosition: ").append(toIndentedString(totalUnrestrictedNetPosition)).append("\n");
    sb.append("    totalExpenses: ").append(toIndentedString(totalExpenses)).append("\n");
    sb.append("    chargesForServices: ").append(toIndentedString(chargesForServices)).append("\n");
    sb.append("    operatingGrantsAndContributions: ").append(toIndentedString(operatingGrantsAndContributions)).append("\n");
    sb.append("    capitalGrantsAndContributions: ").append(toIndentedString(capitalGrantsAndContributions)).append("\n");
    sb.append("    generalRevenues: ").append(toIndentedString(generalRevenues)).append("\n");
    sb.append("    otherRevenues: ").append(toIndentedString(otherRevenues)).append("\n");
    sb.append("    totalRevenues: ").append(toIndentedString(totalRevenues)).append("\n");
    sb.append("    changeInNetAssets: ").append(toIndentedString(changeInNetAssets)).append("\n");
    sb.append("    nonSpendableGeneralFundBalance: ").append(toIndentedString(nonSpendableGeneralFundBalance)).append("\n");
    sb.append("    restrictedGeneralFundBalance: ").append(toIndentedString(restrictedGeneralFundBalance)).append("\n");
    sb.append("    committedGeneralFundBalance: ").append(toIndentedString(committedGeneralFundBalance)).append("\n");
    sb.append("    unassignedGeneralFundBalance: ").append(toIndentedString(unassignedGeneralFundBalance)).append("\n");
    sb.append("    assignedGeneralFundBalance: ").append(toIndentedString(assignedGeneralFundBalance)).append("\n");
    sb.append("    totalGeneralFundBalance: ").append(toIndentedString(totalGeneralFundBalance)).append("\n");
    sb.append("    nonSpendableGovernmentalFundBalance: ").append(toIndentedString(nonSpendableGovernmentalFundBalance)).append("\n");
    sb.append("    restrictedGovernmentalFundBalance: ").append(toIndentedString(restrictedGovernmentalFundBalance)).append("\n");
    sb.append("    committedGovernmentalFundBalance: ").append(toIndentedString(committedGovernmentalFundBalance)).append("\n");
    sb.append("    unassignedGovernmentalFundBalance: ").append(toIndentedString(unassignedGovernmentalFundBalance)).append("\n");
    sb.append("    assignedGovernmentalFundBalance: ").append(toIndentedString(assignedGovernmentalFundBalance)).append("\n");
    sb.append("    totalGovernmentalFundBalance: ").append(toIndentedString(totalGovernmentalFundBalance)).append("\n");
    sb.append("    generalFundRevenues: ").append(toIndentedString(generalFundRevenues)).append("\n");
    sb.append("    generalFundExpenditures: ").append(toIndentedString(generalFundExpenditures)).append("\n");
    sb.append("    generalFundRevenuesOverUnderExpenditure: ").append(toIndentedString(generalFundRevenuesOverUnderExpenditure)).append("\n");
    sb.append("    governmentalFundRevenues: ").append(toIndentedString(governmentalFundRevenues)).append("\n");
    sb.append("    governmentalFundExpenditures: ").append(toIndentedString(governmentalFundExpenditures)).append("\n");
    sb.append("    governmentalFundRevenuesOverUnderExpenditure: ").append(toIndentedString(governmentalFundRevenuesOverUnderExpenditure)).append("\n");
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

