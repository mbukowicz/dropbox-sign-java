/*
 * HelloSign API
 * HelloSign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * TemplateResponseDocumentFieldGroup
 */
@JsonPropertyOrder({
    TemplateResponseDocumentFieldGroup.JSON_PROPERTY_NAME,
    TemplateResponseDocumentFieldGroup.JSON_PROPERTY_RULE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponseDocumentFieldGroup {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private String rule;

  public TemplateResponseDocumentFieldGroup() { 
  }

  public TemplateResponseDocumentFieldGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field group.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TemplateResponseDocumentFieldGroup rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * The rule used to validate checkboxes in the form field group. See [checkbox field grouping](/api/reference/constants/#checkbox-field-grouping).
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rule used to validate checkboxes in the form field group. See [checkbox field grouping](/api/reference/constants/#checkbox-field-grouping).")
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRule() {
    return rule;
  }


  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRule(String rule) {
    this.rule = rule;
  }


  /**
   * Return true if this TemplateResponseDocumentFieldGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFieldGroup templateResponseDocumentFieldGroup = (TemplateResponseDocumentFieldGroup) o;
    return Objects.equals(this.name, templateResponseDocumentFieldGroup.name) &&
        Objects.equals(this.rule, templateResponseDocumentFieldGroup.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFieldGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (rule != null) {
        if (isFileTypeOrListOfFiles(rule)) {
            fileTypeFound = true;
        }

        if (rule.getClass().equals(java.io.File.class) ||
            rule.getClass().equals(Integer.class) ||
            rule.getClass().equals(String.class) ) {
            map.put("rule", rule);
        } else if (isListOfFile(rule)) {
            for(int i = 0; i< getListSize(rule); i++) {
                map.put("rule[" + i + "]", getFromList(rule, i));
            }
        }
        else {
            map.put("rule", JSON.getDefault().getMapper().writeValueAsString(rule));
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

