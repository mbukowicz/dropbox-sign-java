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
import org.hellosign.openapi.model.EventCallbackRequestEvent;
import org.hellosign.openapi.model.SignatureRequestResponse;
import org.hellosign.openapi.model.TemplateResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * EventCallbackAccountRequestPayload
 */
@JsonPropertyOrder({
    EventCallbackAccountRequestPayload.JSON_PROPERTY_EVENT,
    EventCallbackAccountRequestPayload.JSON_PROPERTY_SIGNATURE_REQUEST,
    EventCallbackAccountRequestPayload.JSON_PROPERTY_TEMPLATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventCallbackAccountRequestPayload {
  public static final String JSON_PROPERTY_EVENT = "event";
  private EventCallbackRequestEvent event;

  public static final String JSON_PROPERTY_SIGNATURE_REQUEST = "signature_request";
  private SignatureRequestResponse signatureRequest;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private TemplateResponse template;

  public EventCallbackAccountRequestPayload() { 
  }

  public EventCallbackAccountRequestPayload event(EventCallbackRequestEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventCallbackRequestEvent getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(EventCallbackRequestEvent event) {
    this.event = event;
  }


  public EventCallbackAccountRequestPayload signatureRequest(SignatureRequestResponse signatureRequest) {
    this.signatureRequest = signatureRequest;
    return this;
  }

   /**
   * Get signatureRequest
   * @return signatureRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureRequestResponse getSignatureRequest() {
    return signatureRequest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureRequest(SignatureRequestResponse signatureRequest) {
    this.signatureRequest = signatureRequest;
  }


  public EventCallbackAccountRequestPayload template(TemplateResponse template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateResponse getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(TemplateResponse template) {
    this.template = template;
  }


  /**
   * Return true if this EventCallbackAccountRequestPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCallbackAccountRequestPayload eventCallbackAccountRequestPayload = (EventCallbackAccountRequestPayload) o;
    return Objects.equals(this.event, eventCallbackAccountRequestPayload.event) &&
        Objects.equals(this.signatureRequest, eventCallbackAccountRequestPayload.signatureRequest) &&
        Objects.equals(this.template, eventCallbackAccountRequestPayload.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, signatureRequest, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCallbackAccountRequestPayload {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    signatureRequest: ").append(toIndentedString(signatureRequest)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (event != null) {
        if (isFileTypeOrListOfFiles(event)) {
            fileTypeFound = true;
        }

        if (event.getClass().equals(java.io.File.class) ||
            event.getClass().equals(Integer.class) ||
            event.getClass().equals(String.class) ) {
            map.put("event", event);
        } else if (isListOfFile(event)) {
            for(int i = 0; i< getListSize(event); i++) {
                map.put("event[" + i + "]", getFromList(event, i));
            }
        }
        else {
            map.put("event", JSON.getDefault().getMapper().writeValueAsString(event));
        }
    }
    if (signatureRequest != null) {
        if (isFileTypeOrListOfFiles(signatureRequest)) {
            fileTypeFound = true;
        }

        if (signatureRequest.getClass().equals(java.io.File.class) ||
            signatureRequest.getClass().equals(Integer.class) ||
            signatureRequest.getClass().equals(String.class) ) {
            map.put("signature_request", signatureRequest);
        } else if (isListOfFile(signatureRequest)) {
            for(int i = 0; i< getListSize(signatureRequest); i++) {
                map.put("signature_request[" + i + "]", getFromList(signatureRequest, i));
            }
        }
        else {
            map.put("signature_request", JSON.getDefault().getMapper().writeValueAsString(signatureRequest));
        }
    }
    if (template != null) {
        if (isFileTypeOrListOfFiles(template)) {
            fileTypeFound = true;
        }

        if (template.getClass().equals(java.io.File.class) ||
            template.getClass().equals(Integer.class) ||
            template.getClass().equals(String.class) ) {
            map.put("template", template);
        } else if (isListOfFile(template)) {
            for(int i = 0; i< getListSize(template); i++) {
                map.put("template[" + i + "]", getFromList(template, i));
            }
        }
        else {
            map.put("template", JSON.getDefault().getMapper().writeValueAsString(template));
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

