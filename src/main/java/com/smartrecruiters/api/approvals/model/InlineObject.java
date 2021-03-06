/*
 * Approvals API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.approvals.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.approvals.model.DecisionMode;
import com.smartrecruiters.api.approvals.model.Step;
import com.smartrecruiters.api.approvals.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-30T17:54:28.520346+01:00[Europe/Rome]")
public class InlineObject {
  public static final String SERIALIZED_NAME_BASE_ID = "baseId";
  @SerializedName(SERIALIZED_NAME_BASE_ID)
  private String baseId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;

  public static final String SERIALIZED_NAME_DECISION_MODE = "decisionMode";
  @SerializedName(SERIALIZED_NAME_DECISION_MODE)
  private DecisionMode decisionMode;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<Step> steps = new ArrayList<Step>();


  public InlineObject baseId(String baseId) {
    
    this.baseId = baseId;
    return this;
  }

   /**
   * Approval request id
   * @return baseId
  **/
  @ApiModelProperty(required = true, value = "Approval request id")

  public String getBaseId() {
    return baseId;
  }



  public void setBaseId(String baseId) {
    this.baseId = baseId;
  }


  public InlineObject type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public Type getType() {
    return type;
  }



  public void setType(Type type) {
    this.type = type;
  }


  public InlineObject decisionMode(DecisionMode decisionMode) {
    
    this.decisionMode = decisionMode;
    return this;
  }

   /**
   * Get decisionMode
   * @return decisionMode
  **/
  @ApiModelProperty(required = true, value = "")

  public DecisionMode getDecisionMode() {
    return decisionMode;
  }



  public void setDecisionMode(DecisionMode decisionMode) {
    this.decisionMode = decisionMode;
  }


  public InlineObject steps(List<Step> steps) {
    
    this.steps = steps;
    return this;
  }

  public InlineObject addStepsItem(Step stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps to complete approval
   * @return steps
  **/
  @ApiModelProperty(required = true, value = "Steps to complete approval")

  public List<Step> getSteps() {
    return steps;
  }



  public void setSteps(List<Step> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.baseId, inlineObject.baseId) &&
        Objects.equals(this.type, inlineObject.type) &&
        Objects.equals(this.decisionMode, inlineObject.decisionMode) &&
        Objects.equals(this.steps, inlineObject.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseId, type, decisionMode, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    baseId: ").append(toIndentedString(baseId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    decisionMode: ").append(toIndentedString(decisionMode)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

