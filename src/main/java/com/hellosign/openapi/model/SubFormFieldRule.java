/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hellosign.openapi.model.SubFormFieldRuleAction;
import com.hellosign.openapi.model.SubFormFieldRuleTrigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * SubFormFieldRule
 */
@JsonPropertyOrder({
    SubFormFieldRule.JSON_PROPERTY_ID,
    SubFormFieldRule.JSON_PROPERTY_TRIGGER_OPERATOR,
    SubFormFieldRule.JSON_PROPERTY_TRIGGERS,
    SubFormFieldRule.JSON_PROPERTY_ACTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubFormFieldRule {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TRIGGER_OPERATOR = "trigger_operator";
  private String triggerOperator = "AND";

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<SubFormFieldRuleTrigger> triggers = new ArrayList<>();

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  private List<SubFormFieldRuleAction> actions = new ArrayList<>();

  public SubFormFieldRule() { 
  }

  public SubFormFieldRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Must be unique across all defined rules.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Must be unique across all defined rules.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public SubFormFieldRule triggerOperator(String triggerOperator) {
    this.triggerOperator = triggerOperator;
    return this;
  }

   /**
   * Currently only &#x60;AND&#x60; is supported. Support for &#x60;OR&#x60; is being worked on.
   * @return triggerOperator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currently only `AND` is supported. Support for `OR` is being worked on.")
  @JsonProperty(JSON_PROPERTY_TRIGGER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTriggerOperator() {
    return triggerOperator;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTriggerOperator(String triggerOperator) {
    this.triggerOperator = triggerOperator;
  }


  public SubFormFieldRule triggers(List<SubFormFieldRuleTrigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  public SubFormFieldRule addTriggersItem(SubFormFieldRuleTrigger triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of trigger definitions, the \&quot;if this\&quot; part of \&quot;**if this**, then that\&quot;. Currently only a single trigger per rule is allowed.
   * @return triggers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of trigger definitions, the \"if this\" part of \"**if this**, then that\". Currently only a single trigger per rule is allowed.")
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubFormFieldRuleTrigger> getTriggers() {
    return triggers;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTriggers(List<SubFormFieldRuleTrigger> triggers) {
    this.triggers = triggers;
  }


  public SubFormFieldRule actions(List<SubFormFieldRuleAction> actions) {
    this.actions = actions;
    return this;
  }

  public SubFormFieldRule addActionsItem(SubFormFieldRuleAction actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * An array of action definitions, the \&quot;then that\&quot; part of \&quot;if this, **then that**\&quot;. Any number of actions may be attached to a single rule.
   * @return actions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of action definitions, the \"then that\" part of \"if this, **then that**\". Any number of actions may be attached to a single rule.")
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubFormFieldRuleAction> getActions() {
    return actions;
  }


  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActions(List<SubFormFieldRuleAction> actions) {
    this.actions = actions;
  }


  /**
   * Return true if this SubFormFieldRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldRule subFormFieldRule = (SubFormFieldRule) o;
    return Objects.equals(this.id, subFormFieldRule.id) &&
        Objects.equals(this.triggerOperator, subFormFieldRule.triggerOperator) &&
        Objects.equals(this.triggers, subFormFieldRule.triggers) &&
        Objects.equals(this.actions, subFormFieldRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, triggerOperator, triggers, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldRule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    triggerOperator: ").append(toIndentedString(triggerOperator)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (id != null) {
        if (isFileTypeOrListOfFiles(id)) {
            fileTypeFound = true;
        }

        if (id.getClass().equals(java.io.File.class) ||
            id.getClass().equals(Integer.class) ||
            id.getClass().equals(String.class) ||
            id.getClass().isEnum()) {
            map.put("id", id);
        } else if (isListOfFile(id)) {
            for(int i = 0; i< getListSize(id); i++) {
                map.put("id[" + i + "]", getFromList(id, i));
            }
        }
        else {
            map.put("id", JSON.getDefault().getMapper().writeValueAsString(id));
        }
    }
    if (triggerOperator != null) {
        if (isFileTypeOrListOfFiles(triggerOperator)) {
            fileTypeFound = true;
        }

        if (triggerOperator.getClass().equals(java.io.File.class) ||
            triggerOperator.getClass().equals(Integer.class) ||
            triggerOperator.getClass().equals(String.class) ||
            triggerOperator.getClass().isEnum()) {
            map.put("trigger_operator", triggerOperator);
        } else if (isListOfFile(triggerOperator)) {
            for(int i = 0; i< getListSize(triggerOperator); i++) {
                map.put("trigger_operator[" + i + "]", getFromList(triggerOperator, i));
            }
        }
        else {
            map.put("trigger_operator", JSON.getDefault().getMapper().writeValueAsString(triggerOperator));
        }
    }
    if (triggers != null) {
        if (isFileTypeOrListOfFiles(triggers)) {
            fileTypeFound = true;
        }

        if (triggers.getClass().equals(java.io.File.class) ||
            triggers.getClass().equals(Integer.class) ||
            triggers.getClass().equals(String.class) ||
            triggers.getClass().isEnum()) {
            map.put("triggers", triggers);
        } else if (isListOfFile(triggers)) {
            for(int i = 0; i< getListSize(triggers); i++) {
                map.put("triggers[" + i + "]", getFromList(triggers, i));
            }
        }
        else {
            map.put("triggers", JSON.getDefault().getMapper().writeValueAsString(triggers));
        }
    }
    if (actions != null) {
        if (isFileTypeOrListOfFiles(actions)) {
            fileTypeFound = true;
        }

        if (actions.getClass().equals(java.io.File.class) ||
            actions.getClass().equals(Integer.class) ||
            actions.getClass().equals(String.class) ||
            actions.getClass().isEnum()) {
            map.put("actions", actions);
        } else if (isListOfFile(actions)) {
            for(int i = 0; i< getListSize(actions); i++) {
                map.put("actions[" + i + "]", getFromList(actions, i));
            }
        }
        else {
            map.put("actions", JSON.getDefault().getMapper().writeValueAsString(actions));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

