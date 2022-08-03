

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
import org.threeten.bp.LocalDate;

/**
 * ESGComprehensiveRating
 */

public class ESGComprehensiveRating {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("country_average_rating")
  private BigDecimal countryAverageRating = null;

  @SerializedName("industry_average_rating")
  private BigDecimal industryAverageRating = null;

  @SerializedName("overall_rating")
  private BigDecimal overallRating = null;

  @SerializedName("community_rating")
  private BigDecimal communityRating = null;

  @SerializedName("employee_rating")
  private BigDecimal employeeRating = null;

  @SerializedName("environment_rating")
  private BigDecimal environmentRating = null;

  @SerializedName("governance_rating")
  private BigDecimal governanceRating = null;

  @SerializedName("human_rights_and_supply_chain_rating")
  private BigDecimal humanRightsAndSupplyChainRating = null;

  @SerializedName("community_dev_and_philanthropy_rating")
  private BigDecimal communityDevAndPhilanthropyRating = null;

  @SerializedName("product_rating")
  private BigDecimal productRating = null;

  @SerializedName("compensation_and_benefits_rating")
  private BigDecimal compensationAndBenefitsRating = null;

  @SerializedName("diversity_and_labor_rights_rating")
  private BigDecimal diversityAndLaborRightsRating = null;

  @SerializedName("training_health_and_safety_rating")
  private BigDecimal trainingHealthAndSafetyRating = null;

  @SerializedName("energy_climate_change_rating")
  private BigDecimal energyClimateChangeRating = null;

  @SerializedName("environment_policy_and_reporting_rating")
  private BigDecimal environmentPolicyAndReportingRating = null;

  @SerializedName("resource_management_rating")
  private BigDecimal resourceManagementRating = null;

  @SerializedName("board_rating")
  private BigDecimal boardRating = null;

  @SerializedName("leadership_ethics_rating")
  private BigDecimal leadershipEthicsRating = null;

  @SerializedName("transparency_reporting_rating")
  private BigDecimal transparencyReportingRating = null;

  @SerializedName("country_percentile_rank")
  private BigDecimal countryPercentileRank = null;

  @SerializedName("industry_percentile_rank")
  private BigDecimal industryPercentileRank = null;

  @SerializedName("overall_percentile_rank")
  private BigDecimal overallPercentileRank = null;

  @SerializedName("community_percentile_rank")
  private BigDecimal communityPercentileRank = null;

  @SerializedName("employee_percentile_rank")
  private BigDecimal employeePercentileRank = null;

  @SerializedName("environment_percentile_rank")
  private BigDecimal environmentPercentileRank = null;

  @SerializedName("governance_percentile_rank")
  private BigDecimal governancePercentileRank = null;

  @SerializedName("human_rights_and_supply_chain_percentile_rank")
  private BigDecimal humanRightsAndSupplyChainPercentileRank = null;

  @SerializedName("community_dev_and_philanthropy_percentile_rank")
  private BigDecimal communityDevAndPhilanthropyPercentileRank = null;

  @SerializedName("product_percentile_rank")
  private BigDecimal productPercentileRank = null;

  @SerializedName("compensation_and_benefits_percentile_rank")
  private BigDecimal compensationAndBenefitsPercentileRank = null;

  @SerializedName("diversity_and_labor_rights_percentile_rank")
  private BigDecimal diversityAndLaborRightsPercentileRank = null;

  @SerializedName("training_health_and_safety_percentile_rank")
  private BigDecimal trainingHealthAndSafetyPercentileRank = null;

  @SerializedName("energy_climate_change_percentile_rank")
  private BigDecimal energyClimateChangePercentileRank = null;

  @SerializedName("environment_policy_and_reporting_percentile_rank")
  private BigDecimal environmentPolicyAndReportingPercentileRank = null;

  @SerializedName("resource_management_percentile_rank")
  private BigDecimal resourceManagementPercentileRank = null;

  @SerializedName("board_percentile_rank")
  private BigDecimal boardPercentileRank = null;

  @SerializedName("leadership_ethics_percentile_rank")
  private BigDecimal leadershipEthicsPercentileRank = null;

  @SerializedName("transparency_reporting_percentile_rank")
  private BigDecimal transparencyReportingPercentileRank = null;

  public ESGComprehensiveRating date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Indicates the date on which the ESG Rating was calculated.
   * @return date
  **/
  @ApiModelProperty(value = "Indicates the date on which the ESG Rating was calculated.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ESGComprehensiveRating countryAverageRating(BigDecimal countryAverageRating) {
    this.countryAverageRating = countryAverageRating;
    return this;
  }

   /**
   * The average ESG rating of all companies in a particular country in which the company is a peer of.
   * @return countryAverageRating
  **/
  @ApiModelProperty(value = "The average ESG rating of all companies in a particular country in which the company is a peer of.")
  public BigDecimal getCountryAverageRating() {
    return countryAverageRating;
  }

  public void setCountryAverageRating(BigDecimal countryAverageRating) {
    this.countryAverageRating = countryAverageRating;
  }

  public ESGComprehensiveRating industryAverageRating(BigDecimal industryAverageRating) {
    this.industryAverageRating = industryAverageRating;
    return this;
  }

   /**
   * The average ESG rating of all companies in a particular industry in which the company is a peer of.
   * @return industryAverageRating
  **/
  @ApiModelProperty(value = "The average ESG rating of all companies in a particular industry in which the company is a peer of.")
  public BigDecimal getIndustryAverageRating() {
    return industryAverageRating;
  }

  public void setIndustryAverageRating(BigDecimal industryAverageRating) {
    this.industryAverageRating = industryAverageRating;
  }

  public ESGComprehensiveRating overallRating(BigDecimal overallRating) {
    this.overallRating = overallRating;
    return this;
  }

   /**
   * The company&#39;s overall aggregated ESG rating, taking into account its ESG scoring from the Community, Employee, Enviroment, and Governance categories.
   * @return overallRating
  **/
  @ApiModelProperty(value = "The company's overall aggregated ESG rating, taking into account its ESG scoring from the Community, Employee, Enviroment, and Governance categories.")
  public BigDecimal getOverallRating() {
    return overallRating;
  }

  public void setOverallRating(BigDecimal overallRating) {
    this.overallRating = overallRating;
  }

  public ESGComprehensiveRating communityRating(BigDecimal communityRating) {
    this.communityRating = communityRating;
    return this;
  }

   /**
   * The Community Category reflects a companys citizenship, charitable giving, and volunteerism. This category covers the company&#39;s human rights record and treatment of its supply chain. It also covers the environmental and social impacts of the companys products and services, and the development of sustainable products, processes and technologies.
   * @return communityRating
  **/
  @ApiModelProperty(value = "The Community Category reflects a companys citizenship, charitable giving, and volunteerism. This category covers the company's human rights record and treatment of its supply chain. It also covers the environmental and social impacts of the companys products and services, and the development of sustainable products, processes and technologies.")
  public BigDecimal getCommunityRating() {
    return communityRating;
  }

  public void setCommunityRating(BigDecimal communityRating) {
    this.communityRating = communityRating;
  }

  public ESGComprehensiveRating employeeRating(BigDecimal employeeRating) {
    this.employeeRating = employeeRating;
    return this;
  }

   /**
   * The Employees category includes disclosure of policies, programs, and performance in diversity, labor relations and labor rights. The evaluation focuses on the quality of policies and programs, compliance with national laws and regulations, and proactive management initiatives. The category includes evaluation of inclusive diversity policies, fair treatment of all employees, robust diversity (EEO-1) programs and training.
   * @return employeeRating
  **/
  @ApiModelProperty(value = "The Employees category includes disclosure of policies, programs, and performance in diversity, labor relations and labor rights. The evaluation focuses on the quality of policies and programs, compliance with national laws and regulations, and proactive management initiatives. The category includes evaluation of inclusive diversity policies, fair treatment of all employees, robust diversity (EEO-1) programs and training.")
  public BigDecimal getEmployeeRating() {
    return employeeRating;
  }

  public void setEmployeeRating(BigDecimal employeeRating) {
    this.employeeRating = employeeRating;
  }

  public ESGComprehensiveRating environmentRating(BigDecimal environmentRating) {
    this.environmentRating = environmentRating;
    return this;
  }

   /**
   * The Environment category data covers a company&#39;s interactions with the environment at large, including use of natural resources. The category evaluates corporate environmental performance, compliance with environmental regulations, and mitigation of environmental footprint. It also includes leadership in addressing climate change through appropriate policies and strategies.
   * @return environmentRating
  **/
  @ApiModelProperty(value = "The Environment category data covers a company's interactions with the environment at large, including use of natural resources. The category evaluates corporate environmental performance, compliance with environmental regulations, and mitigation of environmental footprint. It also includes leadership in addressing climate change through appropriate policies and strategies.")
  public BigDecimal getEnvironmentRating() {
    return environmentRating;
  }

  public void setEnvironmentRating(BigDecimal environmentRating) {
    this.environmentRating = environmentRating;
  }

  public ESGComprehensiveRating governanceRating(BigDecimal governanceRating) {
    this.governanceRating = governanceRating;
    return this;
  }

   /**
   * Corporate governance refers to leadership structure and the values that determine corporate direction, ethics and performance. The Governance category covers disclosure of policies and procedures, board independence and diversity, executive compensation, attention to stakeholder concerns, and evaluation of a company&#39;s culture of ethical leadership and compliance.
   * @return governanceRating
  **/
  @ApiModelProperty(value = "Corporate governance refers to leadership structure and the values that determine corporate direction, ethics and performance. The Governance category covers disclosure of policies and procedures, board independence and diversity, executive compensation, attention to stakeholder concerns, and evaluation of a company's culture of ethical leadership and compliance.")
  public BigDecimal getGovernanceRating() {
    return governanceRating;
  }

  public void setGovernanceRating(BigDecimal governanceRating) {
    this.governanceRating = governanceRating;
  }

  public ESGComprehensiveRating humanRightsAndSupplyChainRating(BigDecimal humanRightsAndSupplyChainRating) {
    this.humanRightsAndSupplyChainRating = humanRightsAndSupplyChainRating;
    return this;
  }

   /**
   * The Human Rights and Supply Chain subcategory measures a company&#39;s commitment to respecting fundamental human rights conventions. This subcategory covers a company&#39;s transparency in overseas sourcing disclosure and monitoring. The subcategory also covers the relationship with and respect for the human rights of indigenous peoples near its proposed or current operations.
   * @return humanRightsAndSupplyChainRating
  **/
  @ApiModelProperty(value = "The Human Rights and Supply Chain subcategory measures a company's commitment to respecting fundamental human rights conventions. This subcategory covers a company's transparency in overseas sourcing disclosure and monitoring. The subcategory also covers the relationship with and respect for the human rights of indigenous peoples near its proposed or current operations.")
  public BigDecimal getHumanRightsAndSupplyChainRating() {
    return humanRightsAndSupplyChainRating;
  }

  public void setHumanRightsAndSupplyChainRating(BigDecimal humanRightsAndSupplyChainRating) {
    this.humanRightsAndSupplyChainRating = humanRightsAndSupplyChainRating;
  }

  public ESGComprehensiveRating communityDevAndPhilanthropyRating(BigDecimal communityDevAndPhilanthropyRating) {
    this.communityDevAndPhilanthropyRating = communityDevAndPhilanthropyRating;
    return this;
  }

   /**
   * The Community Development and Philanthropy subcategory covers the relationship between a company and the communities within which it is embedded. It reflects a company&#39;s community citizenship through charitable giving, donations of goods, and volunteerism of staff time. It also includes protecting public health (e.g., avoidance of industrial accidents) and managing the social impacts of its operations.
   * @return communityDevAndPhilanthropyRating
  **/
  @ApiModelProperty(value = "The Community Development and Philanthropy subcategory covers the relationship between a company and the communities within which it is embedded. It reflects a company's community citizenship through charitable giving, donations of goods, and volunteerism of staff time. It also includes protecting public health (e.g., avoidance of industrial accidents) and managing the social impacts of its operations.")
  public BigDecimal getCommunityDevAndPhilanthropyRating() {
    return communityDevAndPhilanthropyRating;
  }

  public void setCommunityDevAndPhilanthropyRating(BigDecimal communityDevAndPhilanthropyRating) {
    this.communityDevAndPhilanthropyRating = communityDevAndPhilanthropyRating;
  }

  public ESGComprehensiveRating productRating(BigDecimal productRating) {
    this.productRating = productRating;
    return this;
  }

   /**
   * The Product subcategory covers the responsibility of a company for the development, design, and management of its products and services. This subcategory reflects a company&#39;s capacity to reduce environmental costs, create new market opportunities, and produce or market goods and services that enhance the health and quality of life for consumers.
   * @return productRating
  **/
  @ApiModelProperty(value = "The Product subcategory covers the responsibility of a company for the development, design, and management of its products and services. This subcategory reflects a company's capacity to reduce environmental costs, create new market opportunities, and produce or market goods and services that enhance the health and quality of life for consumers.")
  public BigDecimal getProductRating() {
    return productRating;
  }

  public void setProductRating(BigDecimal productRating) {
    this.productRating = productRating;
  }

  public ESGComprehensiveRating compensationAndBenefitsRating(BigDecimal compensationAndBenefitsRating) {
    this.compensationAndBenefitsRating = compensationAndBenefitsRating;
    return this;
  }

   /**
   * The Compensation and Benefits subcategory covers a company&#39;s capacity to increase its workforce loyalty and productivity. It includes benefits that engage employees and improve worker development. This subcategory also focuses on long-term employment growth and stability by promotion practices, lay-off practices, and relations with retired employees.
   * @return compensationAndBenefitsRating
  **/
  @ApiModelProperty(value = "The Compensation and Benefits subcategory covers a company's capacity to increase its workforce loyalty and productivity. It includes benefits that engage employees and improve worker development. This subcategory also focuses on long-term employment growth and stability by promotion practices, lay-off practices, and relations with retired employees.")
  public BigDecimal getCompensationAndBenefitsRating() {
    return compensationAndBenefitsRating;
  }

  public void setCompensationAndBenefitsRating(BigDecimal compensationAndBenefitsRating) {
    this.compensationAndBenefitsRating = compensationAndBenefitsRating;
  }

  public ESGComprehensiveRating diversityAndLaborRightsRating(BigDecimal diversityAndLaborRightsRating) {
    this.diversityAndLaborRightsRating = diversityAndLaborRightsRating;
    return this;
  }

   /**
   * The Diversity and Labor Rights subcategory covers workplace policies and practices covering fair and non-discriminatory treatment of employees. It covers a company&#39;s labor-management relations and participation by employees. Fundamental labor rights include freedom of association and protection of the right to organize.
   * @return diversityAndLaborRightsRating
  **/
  @ApiModelProperty(value = "The Diversity and Labor Rights subcategory covers workplace policies and practices covering fair and non-discriminatory treatment of employees. It covers a company's labor-management relations and participation by employees. Fundamental labor rights include freedom of association and protection of the right to organize.")
  public BigDecimal getDiversityAndLaborRightsRating() {
    return diversityAndLaborRightsRating;
  }

  public void setDiversityAndLaborRightsRating(BigDecimal diversityAndLaborRightsRating) {
    this.diversityAndLaborRightsRating = diversityAndLaborRightsRating;
  }

  public ESGComprehensiveRating trainingHealthAndSafetyRating(BigDecimal trainingHealthAndSafetyRating) {
    this.trainingHealthAndSafetyRating = trainingHealthAndSafetyRating;
    return this;
  }

   /**
   * The Training, Safety and Health subcategory measures a company&#39;s effectiveness in providing a healthy and safe workplace. It includes programs to support the health, well-being and productivity of all employees. This subcategory includes workplace policies and programs that boost employee morale, workplace productivity and worker development.
   * @return trainingHealthAndSafetyRating
  **/
  @ApiModelProperty(value = "The Training, Safety and Health subcategory measures a company's effectiveness in providing a healthy and safe workplace. It includes programs to support the health, well-being and productivity of all employees. This subcategory includes workplace policies and programs that boost employee morale, workplace productivity and worker development.")
  public BigDecimal getTrainingHealthAndSafetyRating() {
    return trainingHealthAndSafetyRating;
  }

  public void setTrainingHealthAndSafetyRating(BigDecimal trainingHealthAndSafetyRating) {
    this.trainingHealthAndSafetyRating = trainingHealthAndSafetyRating;
  }

  public ESGComprehensiveRating energyClimateChangeRating(BigDecimal energyClimateChangeRating) {
    this.energyClimateChangeRating = energyClimateChangeRating;
    return this;
  }

   /**
   * The Energy and Climate Change subcategory measures a company&#39;s effectiveness in addressing climate change through appropriate policies and strategies. The subcategory includes energy use, emissions to air of CO2 and other Greenhouse Gas Emissions (GHG) and other alternative environmental technologies.
   * @return energyClimateChangeRating
  **/
  @ApiModelProperty(value = "The Energy and Climate Change subcategory measures a company's effectiveness in addressing climate change through appropriate policies and strategies. The subcategory includes energy use, emissions to air of CO2 and other Greenhouse Gas Emissions (GHG) and other alternative environmental technologies.")
  public BigDecimal getEnergyClimateChangeRating() {
    return energyClimateChangeRating;
  }

  public void setEnergyClimateChangeRating(BigDecimal energyClimateChangeRating) {
    this.energyClimateChangeRating = energyClimateChangeRating;
  }

  public ESGComprehensiveRating environmentPolicyAndReportingRating(BigDecimal environmentPolicyAndReportingRating) {
    this.environmentPolicyAndReportingRating = environmentPolicyAndReportingRating;
    return this;
  }

   /**
   * The Environmental Policy and Reporting subcategory includes a company&#39;s policies and intention to reduce the environmental impact of a company. The data includes the company&#39;s environmental reporting performance, adherence to environmental reporting standards and compliance with investor, regulatory and stakeholders&#39; requests for transparency. Compliance data consists of breaches of regulatory limits and accidental releases.
   * @return environmentPolicyAndReportingRating
  **/
  @ApiModelProperty(value = "The Environmental Policy and Reporting subcategory includes a company's policies and intention to reduce the environmental impact of a company. The data includes the company's environmental reporting performance, adherence to environmental reporting standards and compliance with investor, regulatory and stakeholders' requests for transparency. Compliance data consists of breaches of regulatory limits and accidental releases.")
  public BigDecimal getEnvironmentPolicyAndReportingRating() {
    return environmentPolicyAndReportingRating;
  }

  public void setEnvironmentPolicyAndReportingRating(BigDecimal environmentPolicyAndReportingRating) {
    this.environmentPolicyAndReportingRating = environmentPolicyAndReportingRating;
  }

  public ESGComprehensiveRating resourceManagementRating(BigDecimal resourceManagementRating) {
    this.resourceManagementRating = resourceManagementRating;
    return this;
  }

   /**
   * The Resource Management subcategory covers how efficiently resources are used in manufacturing and delivering products and services. It includes a company&#39;s capacity to reduce the use of materials, energy or water, and to find more efficient solutions by improving its supply chain management. This subcategory includes environmental performance relative to production size.
   * @return resourceManagementRating
  **/
  @ApiModelProperty(value = "The Resource Management subcategory covers how efficiently resources are used in manufacturing and delivering products and services. It includes a company's capacity to reduce the use of materials, energy or water, and to find more efficient solutions by improving its supply chain management. This subcategory includes environmental performance relative to production size.")
  public BigDecimal getResourceManagementRating() {
    return resourceManagementRating;
  }

  public void setResourceManagementRating(BigDecimal resourceManagementRating) {
    this.resourceManagementRating = resourceManagementRating;
  }

  public ESGComprehensiveRating boardRating(BigDecimal boardRating) {
    this.boardRating = boardRating;
    return this;
  }

   /**
   * The Board subcategory covers a company&#39;s effectiveness in following best practices in corporate governance principles related to board membership. It includes how the company provides competitive and proportionate management compensation and its ability to incent executives and board members to achieve both financial and extra-financial targets.
   * @return boardRating
  **/
  @ApiModelProperty(value = "The Board subcategory covers a company's effectiveness in following best practices in corporate governance principles related to board membership. It includes how the company provides competitive and proportionate management compensation and its ability to incent executives and board members to achieve both financial and extra-financial targets.")
  public BigDecimal getBoardRating() {
    return boardRating;
  }

  public void setBoardRating(BigDecimal boardRating) {
    this.boardRating = boardRating;
  }

  public ESGComprehensiveRating leadershipEthicsRating(BigDecimal leadershipEthicsRating) {
    this.leadershipEthicsRating = leadershipEthicsRating;
    return this;
  }

   /**
   * The Leadership Ethics subcategory measures how a company manages its relationships with its various stakeholders, including investors, customers, communities, and regulators. It measures a company&#39;s commitment and effectiveness toward the vision of integrating social and environmental aspects into the overall core strategy. It also measures whether sustainability principles are integrated from the top down into the day-to-day operations of the company.
   * @return leadershipEthicsRating
  **/
  @ApiModelProperty(value = "The Leadership Ethics subcategory measures how a company manages its relationships with its various stakeholders, including investors, customers, communities, and regulators. It measures a company's commitment and effectiveness toward the vision of integrating social and environmental aspects into the overall core strategy. It also measures whether sustainability principles are integrated from the top down into the day-to-day operations of the company.")
  public BigDecimal getLeadershipEthicsRating() {
    return leadershipEthicsRating;
  }

  public void setLeadershipEthicsRating(BigDecimal leadershipEthicsRating) {
    this.leadershipEthicsRating = leadershipEthicsRating;
  }

  public ESGComprehensiveRating transparencyReportingRating(BigDecimal transparencyReportingRating) {
    this.transparencyReportingRating = transparencyReportingRating;
    return this;
  }

   /**
   * The Transparency and Reporting subcategory rates factors including are corporate policies and practices aligned with sustainability goals. It also covers whether the company is a signatory of Global Compact and other leading global entities. It evaluates the assurance (3rd party audit) of the accuracy, completeness, and reliability of its Sustainability or Corporate Social Responsibility reports.
   * @return transparencyReportingRating
  **/
  @ApiModelProperty(value = "The Transparency and Reporting subcategory rates factors including are corporate policies and practices aligned with sustainability goals. It also covers whether the company is a signatory of Global Compact and other leading global entities. It evaluates the assurance (3rd party audit) of the accuracy, completeness, and reliability of its Sustainability or Corporate Social Responsibility reports.")
  public BigDecimal getTransparencyReportingRating() {
    return transparencyReportingRating;
  }

  public void setTransparencyReportingRating(BigDecimal transparencyReportingRating) {
    this.transparencyReportingRating = transparencyReportingRating;
  }

  public ESGComprehensiveRating countryPercentileRank(BigDecimal countryPercentileRank) {
    this.countryPercentileRank = countryPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s ESG rating in comparison to it&#39;s country peers.
   * @return countryPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's ESG rating in comparison to it's country peers.")
  public BigDecimal getCountryPercentileRank() {
    return countryPercentileRank;
  }

  public void setCountryPercentileRank(BigDecimal countryPercentileRank) {
    this.countryPercentileRank = countryPercentileRank;
  }

  public ESGComprehensiveRating industryPercentileRank(BigDecimal industryPercentileRank) {
    this.industryPercentileRank = industryPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s ESG rating in comparison to it&#39;s industry peers.
   * @return industryPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's ESG rating in comparison to it's industry peers.")
  public BigDecimal getIndustryPercentileRank() {
    return industryPercentileRank;
  }

  public void setIndustryPercentileRank(BigDecimal industryPercentileRank) {
    this.industryPercentileRank = industryPercentileRank;
  }

  public ESGComprehensiveRating overallPercentileRank(BigDecimal overallPercentileRank) {
    this.overallPercentileRank = overallPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s overall ESG rating in comparison to all companies within the CSRHub ESG universe.
   * @return overallPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's overall ESG rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getOverallPercentileRank() {
    return overallPercentileRank;
  }

  public void setOverallPercentileRank(BigDecimal overallPercentileRank) {
    this.overallPercentileRank = overallPercentileRank;
  }

  public ESGComprehensiveRating communityPercentileRank(BigDecimal communityPercentileRank) {
    this.communityPercentileRank = communityPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Community rating in comparison to all companies within the CSRHub ESG universe.
   * @return communityPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Community rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getCommunityPercentileRank() {
    return communityPercentileRank;
  }

  public void setCommunityPercentileRank(BigDecimal communityPercentileRank) {
    this.communityPercentileRank = communityPercentileRank;
  }

  public ESGComprehensiveRating employeePercentileRank(BigDecimal employeePercentileRank) {
    this.employeePercentileRank = employeePercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Employee rating in comparison to all companies within the CSRHub ESG universe.
   * @return employeePercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Employee rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getEmployeePercentileRank() {
    return employeePercentileRank;
  }

  public void setEmployeePercentileRank(BigDecimal employeePercentileRank) {
    this.employeePercentileRank = employeePercentileRank;
  }

  public ESGComprehensiveRating environmentPercentileRank(BigDecimal environmentPercentileRank) {
    this.environmentPercentileRank = environmentPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Environment rating in comparison to all companies within the CSRHub ESG universe.
   * @return environmentPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Environment rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getEnvironmentPercentileRank() {
    return environmentPercentileRank;
  }

  public void setEnvironmentPercentileRank(BigDecimal environmentPercentileRank) {
    this.environmentPercentileRank = environmentPercentileRank;
  }

  public ESGComprehensiveRating governancePercentileRank(BigDecimal governancePercentileRank) {
    this.governancePercentileRank = governancePercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Governance rating in comparison to all companies within the CSRHub ESG universe.
   * @return governancePercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Governance rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getGovernancePercentileRank() {
    return governancePercentileRank;
  }

  public void setGovernancePercentileRank(BigDecimal governancePercentileRank) {
    this.governancePercentileRank = governancePercentileRank;
  }

  public ESGComprehensiveRating humanRightsAndSupplyChainPercentileRank(BigDecimal humanRightsAndSupplyChainPercentileRank) {
    this.humanRightsAndSupplyChainPercentileRank = humanRightsAndSupplyChainPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Human Rights and Supply Chain rating in comparison to all companies within the CSRHub ESG universe.
   * @return humanRightsAndSupplyChainPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Human Rights and Supply Chain rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getHumanRightsAndSupplyChainPercentileRank() {
    return humanRightsAndSupplyChainPercentileRank;
  }

  public void setHumanRightsAndSupplyChainPercentileRank(BigDecimal humanRightsAndSupplyChainPercentileRank) {
    this.humanRightsAndSupplyChainPercentileRank = humanRightsAndSupplyChainPercentileRank;
  }

  public ESGComprehensiveRating communityDevAndPhilanthropyPercentileRank(BigDecimal communityDevAndPhilanthropyPercentileRank) {
    this.communityDevAndPhilanthropyPercentileRank = communityDevAndPhilanthropyPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Community, Dev, and Philanthropy rating in comparison to all companies within the CSRHub ESG universe.
   * @return communityDevAndPhilanthropyPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Community, Dev, and Philanthropy rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getCommunityDevAndPhilanthropyPercentileRank() {
    return communityDevAndPhilanthropyPercentileRank;
  }

  public void setCommunityDevAndPhilanthropyPercentileRank(BigDecimal communityDevAndPhilanthropyPercentileRank) {
    this.communityDevAndPhilanthropyPercentileRank = communityDevAndPhilanthropyPercentileRank;
  }

  public ESGComprehensiveRating productPercentileRank(BigDecimal productPercentileRank) {
    this.productPercentileRank = productPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Product rating in comparison to all companies within the CSRHub ESG universe.
   * @return productPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Product rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getProductPercentileRank() {
    return productPercentileRank;
  }

  public void setProductPercentileRank(BigDecimal productPercentileRank) {
    this.productPercentileRank = productPercentileRank;
  }

  public ESGComprehensiveRating compensationAndBenefitsPercentileRank(BigDecimal compensationAndBenefitsPercentileRank) {
    this.compensationAndBenefitsPercentileRank = compensationAndBenefitsPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Compensation and Benefits rating in comparison to all companies within the CSRHub ESG universe.
   * @return compensationAndBenefitsPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Compensation and Benefits rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getCompensationAndBenefitsPercentileRank() {
    return compensationAndBenefitsPercentileRank;
  }

  public void setCompensationAndBenefitsPercentileRank(BigDecimal compensationAndBenefitsPercentileRank) {
    this.compensationAndBenefitsPercentileRank = compensationAndBenefitsPercentileRank;
  }

  public ESGComprehensiveRating diversityAndLaborRightsPercentileRank(BigDecimal diversityAndLaborRightsPercentileRank) {
    this.diversityAndLaborRightsPercentileRank = diversityAndLaborRightsPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Diversity and Labor Rights rating in comparison to all companies within the CSRHub ESG universe.
   * @return diversityAndLaborRightsPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Diversity and Labor Rights rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getDiversityAndLaborRightsPercentileRank() {
    return diversityAndLaborRightsPercentileRank;
  }

  public void setDiversityAndLaborRightsPercentileRank(BigDecimal diversityAndLaborRightsPercentileRank) {
    this.diversityAndLaborRightsPercentileRank = diversityAndLaborRightsPercentileRank;
  }

  public ESGComprehensiveRating trainingHealthAndSafetyPercentileRank(BigDecimal trainingHealthAndSafetyPercentileRank) {
    this.trainingHealthAndSafetyPercentileRank = trainingHealthAndSafetyPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Training, Health, and Safety rating in comparison to all companies within the CSRHub ESG universe.
   * @return trainingHealthAndSafetyPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Training, Health, and Safety rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getTrainingHealthAndSafetyPercentileRank() {
    return trainingHealthAndSafetyPercentileRank;
  }

  public void setTrainingHealthAndSafetyPercentileRank(BigDecimal trainingHealthAndSafetyPercentileRank) {
    this.trainingHealthAndSafetyPercentileRank = trainingHealthAndSafetyPercentileRank;
  }

  public ESGComprehensiveRating energyClimateChangePercentileRank(BigDecimal energyClimateChangePercentileRank) {
    this.energyClimateChangePercentileRank = energyClimateChangePercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Energy Climate Change rating in comparison to all companies within the CSRHub ESG universe.
   * @return energyClimateChangePercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Energy Climate Change rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getEnergyClimateChangePercentileRank() {
    return energyClimateChangePercentileRank;
  }

  public void setEnergyClimateChangePercentileRank(BigDecimal energyClimateChangePercentileRank) {
    this.energyClimateChangePercentileRank = energyClimateChangePercentileRank;
  }

  public ESGComprehensiveRating environmentPolicyAndReportingPercentileRank(BigDecimal environmentPolicyAndReportingPercentileRank) {
    this.environmentPolicyAndReportingPercentileRank = environmentPolicyAndReportingPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Environment Policy and Reporting rating in comparison to all companies within the CSRHub ESG universe.
   * @return environmentPolicyAndReportingPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Environment Policy and Reporting rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getEnvironmentPolicyAndReportingPercentileRank() {
    return environmentPolicyAndReportingPercentileRank;
  }

  public void setEnvironmentPolicyAndReportingPercentileRank(BigDecimal environmentPolicyAndReportingPercentileRank) {
    this.environmentPolicyAndReportingPercentileRank = environmentPolicyAndReportingPercentileRank;
  }

  public ESGComprehensiveRating resourceManagementPercentileRank(BigDecimal resourceManagementPercentileRank) {
    this.resourceManagementPercentileRank = resourceManagementPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Resource Management rating in comparison to all companies within the CSRHub ESG universe.
   * @return resourceManagementPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Resource Management rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getResourceManagementPercentileRank() {
    return resourceManagementPercentileRank;
  }

  public void setResourceManagementPercentileRank(BigDecimal resourceManagementPercentileRank) {
    this.resourceManagementPercentileRank = resourceManagementPercentileRank;
  }

  public ESGComprehensiveRating boardPercentileRank(BigDecimal boardPercentileRank) {
    this.boardPercentileRank = boardPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Board rating in comparison to all companies within the CSRHub ESG universe.
   * @return boardPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Board rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getBoardPercentileRank() {
    return boardPercentileRank;
  }

  public void setBoardPercentileRank(BigDecimal boardPercentileRank) {
    this.boardPercentileRank = boardPercentileRank;
  }

  public ESGComprehensiveRating leadershipEthicsPercentileRank(BigDecimal leadershipEthicsPercentileRank) {
    this.leadershipEthicsPercentileRank = leadershipEthicsPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Leadership Ethics rating in comparison to all companies within the CSRHub ESG universe.
   * @return leadershipEthicsPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Leadership Ethics rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getLeadershipEthicsPercentileRank() {
    return leadershipEthicsPercentileRank;
  }

  public void setLeadershipEthicsPercentileRank(BigDecimal leadershipEthicsPercentileRank) {
    this.leadershipEthicsPercentileRank = leadershipEthicsPercentileRank;
  }

  public ESGComprehensiveRating transparencyReportingPercentileRank(BigDecimal transparencyReportingPercentileRank) {
    this.transparencyReportingPercentileRank = transparencyReportingPercentileRank;
    return this;
  }

   /**
   * The percentile rank of the company&#39;s Transaperency Reporting rating in comparison to all companies within the CSRHub ESG universe.
   * @return transparencyReportingPercentileRank
  **/
  @ApiModelProperty(value = "The percentile rank of the company's Transaperency Reporting rating in comparison to all companies within the CSRHub ESG universe.")
  public BigDecimal getTransparencyReportingPercentileRank() {
    return transparencyReportingPercentileRank;
  }

  public void setTransparencyReportingPercentileRank(BigDecimal transparencyReportingPercentileRank) {
    this.transparencyReportingPercentileRank = transparencyReportingPercentileRank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESGComprehensiveRating esGComprehensiveRating = (ESGComprehensiveRating) o;
    return Objects.equals(this.date, esGComprehensiveRating.date) &&
        Objects.equals(this.countryAverageRating, esGComprehensiveRating.countryAverageRating) &&
        Objects.equals(this.industryAverageRating, esGComprehensiveRating.industryAverageRating) &&
        Objects.equals(this.overallRating, esGComprehensiveRating.overallRating) &&
        Objects.equals(this.communityRating, esGComprehensiveRating.communityRating) &&
        Objects.equals(this.employeeRating, esGComprehensiveRating.employeeRating) &&
        Objects.equals(this.environmentRating, esGComprehensiveRating.environmentRating) &&
        Objects.equals(this.governanceRating, esGComprehensiveRating.governanceRating) &&
        Objects.equals(this.humanRightsAndSupplyChainRating, esGComprehensiveRating.humanRightsAndSupplyChainRating) &&
        Objects.equals(this.communityDevAndPhilanthropyRating, esGComprehensiveRating.communityDevAndPhilanthropyRating) &&
        Objects.equals(this.productRating, esGComprehensiveRating.productRating) &&
        Objects.equals(this.compensationAndBenefitsRating, esGComprehensiveRating.compensationAndBenefitsRating) &&
        Objects.equals(this.diversityAndLaborRightsRating, esGComprehensiveRating.diversityAndLaborRightsRating) &&
        Objects.equals(this.trainingHealthAndSafetyRating, esGComprehensiveRating.trainingHealthAndSafetyRating) &&
        Objects.equals(this.energyClimateChangeRating, esGComprehensiveRating.energyClimateChangeRating) &&
        Objects.equals(this.environmentPolicyAndReportingRating, esGComprehensiveRating.environmentPolicyAndReportingRating) &&
        Objects.equals(this.resourceManagementRating, esGComprehensiveRating.resourceManagementRating) &&
        Objects.equals(this.boardRating, esGComprehensiveRating.boardRating) &&
        Objects.equals(this.leadershipEthicsRating, esGComprehensiveRating.leadershipEthicsRating) &&
        Objects.equals(this.transparencyReportingRating, esGComprehensiveRating.transparencyReportingRating) &&
        Objects.equals(this.countryPercentileRank, esGComprehensiveRating.countryPercentileRank) &&
        Objects.equals(this.industryPercentileRank, esGComprehensiveRating.industryPercentileRank) &&
        Objects.equals(this.overallPercentileRank, esGComprehensiveRating.overallPercentileRank) &&
        Objects.equals(this.communityPercentileRank, esGComprehensiveRating.communityPercentileRank) &&
        Objects.equals(this.employeePercentileRank, esGComprehensiveRating.employeePercentileRank) &&
        Objects.equals(this.environmentPercentileRank, esGComprehensiveRating.environmentPercentileRank) &&
        Objects.equals(this.governancePercentileRank, esGComprehensiveRating.governancePercentileRank) &&
        Objects.equals(this.humanRightsAndSupplyChainPercentileRank, esGComprehensiveRating.humanRightsAndSupplyChainPercentileRank) &&
        Objects.equals(this.communityDevAndPhilanthropyPercentileRank, esGComprehensiveRating.communityDevAndPhilanthropyPercentileRank) &&
        Objects.equals(this.productPercentileRank, esGComprehensiveRating.productPercentileRank) &&
        Objects.equals(this.compensationAndBenefitsPercentileRank, esGComprehensiveRating.compensationAndBenefitsPercentileRank) &&
        Objects.equals(this.diversityAndLaborRightsPercentileRank, esGComprehensiveRating.diversityAndLaborRightsPercentileRank) &&
        Objects.equals(this.trainingHealthAndSafetyPercentileRank, esGComprehensiveRating.trainingHealthAndSafetyPercentileRank) &&
        Objects.equals(this.energyClimateChangePercentileRank, esGComprehensiveRating.energyClimateChangePercentileRank) &&
        Objects.equals(this.environmentPolicyAndReportingPercentileRank, esGComprehensiveRating.environmentPolicyAndReportingPercentileRank) &&
        Objects.equals(this.resourceManagementPercentileRank, esGComprehensiveRating.resourceManagementPercentileRank) &&
        Objects.equals(this.boardPercentileRank, esGComprehensiveRating.boardPercentileRank) &&
        Objects.equals(this.leadershipEthicsPercentileRank, esGComprehensiveRating.leadershipEthicsPercentileRank) &&
        Objects.equals(this.transparencyReportingPercentileRank, esGComprehensiveRating.transparencyReportingPercentileRank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, countryAverageRating, industryAverageRating, overallRating, communityRating, employeeRating, environmentRating, governanceRating, humanRightsAndSupplyChainRating, communityDevAndPhilanthropyRating, productRating, compensationAndBenefitsRating, diversityAndLaborRightsRating, trainingHealthAndSafetyRating, energyClimateChangeRating, environmentPolicyAndReportingRating, resourceManagementRating, boardRating, leadershipEthicsRating, transparencyReportingRating, countryPercentileRank, industryPercentileRank, overallPercentileRank, communityPercentileRank, employeePercentileRank, environmentPercentileRank, governancePercentileRank, humanRightsAndSupplyChainPercentileRank, communityDevAndPhilanthropyPercentileRank, productPercentileRank, compensationAndBenefitsPercentileRank, diversityAndLaborRightsPercentileRank, trainingHealthAndSafetyPercentileRank, energyClimateChangePercentileRank, environmentPolicyAndReportingPercentileRank, resourceManagementPercentileRank, boardPercentileRank, leadershipEthicsPercentileRank, transparencyReportingPercentileRank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESGComprehensiveRating {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    countryAverageRating: ").append(toIndentedString(countryAverageRating)).append("\n");
    sb.append("    industryAverageRating: ").append(toIndentedString(industryAverageRating)).append("\n");
    sb.append("    overallRating: ").append(toIndentedString(overallRating)).append("\n");
    sb.append("    communityRating: ").append(toIndentedString(communityRating)).append("\n");
    sb.append("    employeeRating: ").append(toIndentedString(employeeRating)).append("\n");
    sb.append("    environmentRating: ").append(toIndentedString(environmentRating)).append("\n");
    sb.append("    governanceRating: ").append(toIndentedString(governanceRating)).append("\n");
    sb.append("    humanRightsAndSupplyChainRating: ").append(toIndentedString(humanRightsAndSupplyChainRating)).append("\n");
    sb.append("    communityDevAndPhilanthropyRating: ").append(toIndentedString(communityDevAndPhilanthropyRating)).append("\n");
    sb.append("    productRating: ").append(toIndentedString(productRating)).append("\n");
    sb.append("    compensationAndBenefitsRating: ").append(toIndentedString(compensationAndBenefitsRating)).append("\n");
    sb.append("    diversityAndLaborRightsRating: ").append(toIndentedString(diversityAndLaborRightsRating)).append("\n");
    sb.append("    trainingHealthAndSafetyRating: ").append(toIndentedString(trainingHealthAndSafetyRating)).append("\n");
    sb.append("    energyClimateChangeRating: ").append(toIndentedString(energyClimateChangeRating)).append("\n");
    sb.append("    environmentPolicyAndReportingRating: ").append(toIndentedString(environmentPolicyAndReportingRating)).append("\n");
    sb.append("    resourceManagementRating: ").append(toIndentedString(resourceManagementRating)).append("\n");
    sb.append("    boardRating: ").append(toIndentedString(boardRating)).append("\n");
    sb.append("    leadershipEthicsRating: ").append(toIndentedString(leadershipEthicsRating)).append("\n");
    sb.append("    transparencyReportingRating: ").append(toIndentedString(transparencyReportingRating)).append("\n");
    sb.append("    countryPercentileRank: ").append(toIndentedString(countryPercentileRank)).append("\n");
    sb.append("    industryPercentileRank: ").append(toIndentedString(industryPercentileRank)).append("\n");
    sb.append("    overallPercentileRank: ").append(toIndentedString(overallPercentileRank)).append("\n");
    sb.append("    communityPercentileRank: ").append(toIndentedString(communityPercentileRank)).append("\n");
    sb.append("    employeePercentileRank: ").append(toIndentedString(employeePercentileRank)).append("\n");
    sb.append("    environmentPercentileRank: ").append(toIndentedString(environmentPercentileRank)).append("\n");
    sb.append("    governancePercentileRank: ").append(toIndentedString(governancePercentileRank)).append("\n");
    sb.append("    humanRightsAndSupplyChainPercentileRank: ").append(toIndentedString(humanRightsAndSupplyChainPercentileRank)).append("\n");
    sb.append("    communityDevAndPhilanthropyPercentileRank: ").append(toIndentedString(communityDevAndPhilanthropyPercentileRank)).append("\n");
    sb.append("    productPercentileRank: ").append(toIndentedString(productPercentileRank)).append("\n");
    sb.append("    compensationAndBenefitsPercentileRank: ").append(toIndentedString(compensationAndBenefitsPercentileRank)).append("\n");
    sb.append("    diversityAndLaborRightsPercentileRank: ").append(toIndentedString(diversityAndLaborRightsPercentileRank)).append("\n");
    sb.append("    trainingHealthAndSafetyPercentileRank: ").append(toIndentedString(trainingHealthAndSafetyPercentileRank)).append("\n");
    sb.append("    energyClimateChangePercentileRank: ").append(toIndentedString(energyClimateChangePercentileRank)).append("\n");
    sb.append("    environmentPolicyAndReportingPercentileRank: ").append(toIndentedString(environmentPolicyAndReportingPercentileRank)).append("\n");
    sb.append("    resourceManagementPercentileRank: ").append(toIndentedString(resourceManagementPercentileRank)).append("\n");
    sb.append("    boardPercentileRank: ").append(toIndentedString(boardPercentileRank)).append("\n");
    sb.append("    leadershipEthicsPercentileRank: ").append(toIndentedString(leadershipEthicsPercentileRank)).append("\n");
    sb.append("    transparencyReportingPercentileRank: ").append(toIndentedString(transparencyReportingPercentileRank)).append("\n");
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

