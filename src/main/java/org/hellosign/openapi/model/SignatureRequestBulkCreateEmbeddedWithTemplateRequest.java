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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hellosign.openapi.model.SubBulkSignerList;
import org.hellosign.openapi.model.SubCC;
import org.hellosign.openapi.model.SubCustomField;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * Calls SignatureRequestBulkSendWithTemplate in controller
 */
@ApiModel(description = "Calls SignatureRequestBulkSendWithTemplate in controller")
@JsonPropertyOrder({
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TEMPLATE_IDS,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CLIENT_ID,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SIGNER_FILE,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SIGNER_LIST,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_ALLOW_DECLINE,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CCS,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CUSTOM_FIELDS,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_MESSAGE,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_METADATA,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SIGNING_REDIRECT_URL,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SUBJECT,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TEST_MODE,
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignatureRequestBulkCreateEmbeddedWithTemplateRequest {
  public static final String JSON_PROPERTY_TEMPLATE_IDS = "template_ids";
  private List<String> templateIds = new ArrayList<>();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_SIGNER_FILE = "signer_file";
  private File signerFile;

  public static final String JSON_PROPERTY_SIGNER_LIST = "signer_list";
  private List<SubBulkSignerList> signerList = null;

  public static final String JSON_PROPERTY_ALLOW_DECLINE = "allow_decline";
  private Boolean allowDecline = false;

  public static final String JSON_PROPERTY_CCS = "ccs";
  private List<SubCC> ccs = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private List<SubCustomField> customFields = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_SIGNING_REDIRECT_URL = "signing_redirect_url";
  private String signingRedirectUrl;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  private Boolean testMode = false;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest() { 
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest templateIds(List<String> templateIds) {
    this.templateIds = templateIds;
    return this;
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest addTemplateIdsItem(String templateIdsItem) {
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * Use &#x60;template_ids&#x60; to create a SignatureRequest from one or more templates, in the order in which the template will be used.
   * @return templateIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Use `template_ids` to create a SignatureRequest from one or more templates, in the order in which the template will be used.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTemplateIds() {
    return templateIds;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateIds(List<String> templateIds) {
    this.templateIds = templateIds;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client id of the app you&#39;re using to create this embedded signature request. Visit our [embedded page](https://app.hellosign.com/api/embeddedSigningWalkthrough) to learn more about this parameter.
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Client id of the app you're using to create this embedded signature request. Visit our [embedded page](https://app.hellosign.com/api/embeddedSigningWalkthrough) to learn more about this parameter.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest signerFile(File signerFile) {
    this.signerFile = signerFile;
    return this;
  }

   /**
   * &#x60;signer_file&#x60; is a CSV file defining values and options for signer fields. Required unless a &#x60;signer_list&#x60; is used, you may not use both. The CSV can have the following columns:  - &#x60;name&#x60;: the name of the signer filling the role of RoleName - &#x60;email_address&#x60;: email address of the signer filling the role of RoleName - &#x60;pin&#x60;: the 4- to 12-character access code that will secure this signer&#39;s signature page (optional) - &#x60;sms_phone_number&#x60;: An E.164 formatted phone number that will receive a code via SMS to access this signer&#39;s signature page. (optional)      **Note**: Not available in test mode and requires a Platinum plan or higher. - &#x60;*_field&#x60;: any column with a _field\&quot; suffix will be treated as a custom field (optional)      You may only specify field values here, any other options should be set in the custom_fields request parameter.  Example CSV:  &#x60;&#x60;&#x60; name, email_address, pin, company_field George, george@example.com, d79a3td, ABC Corp Mary, mary@example.com, gd9as5b, 123 LLC &#x60;&#x60;&#x60;
   * @return signerFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`signer_file` is a CSV file defining values and options for signer fields. Required unless a `signer_list` is used, you may not use both. The CSV can have the following columns:  - `name`: the name of the signer filling the role of RoleName - `email_address`: email address of the signer filling the role of RoleName - `pin`: the 4- to 12-character access code that will secure this signer's signature page (optional) - `sms_phone_number`: An E.164 formatted phone number that will receive a code via SMS to access this signer's signature page. (optional)      **Note**: Not available in test mode and requires a Platinum plan or higher. - `*_field`: any column with a _field\" suffix will be treated as a custom field (optional)      You may only specify field values here, any other options should be set in the custom_fields request parameter.  Example CSV:  ``` name, email_address, pin, company_field George, george@example.com, d79a3td, ABC Corp Mary, mary@example.com, gd9as5b, 123 LLC ```")
  @JsonProperty(JSON_PROPERTY_SIGNER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getSignerFile() {
    return signerFile;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignerFile(File signerFile) {
    this.signerFile = signerFile;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest signerList(List<SubBulkSignerList> signerList) {
    this.signerList = signerList;
    return this;
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest addSignerListItem(SubBulkSignerList signerListItem) {
    if (this.signerList == null) {
      this.signerList = new ArrayList<>();
    }
    this.signerList.add(signerListItem);
    return this;
  }

   /**
   * &#x60;signer_list&#x60; is an array defining values and options for signer fields. Required unless a &#x60;signer_file&#x60; is used, you may not use both.
   * @return signerList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`signer_list` is an array defining values and options for signer fields. Required unless a `signer_file` is used, you may not use both.")
  @JsonProperty(JSON_PROPERTY_SIGNER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubBulkSignerList> getSignerList() {
    return signerList;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignerList(List<SubBulkSignerList> signerList) {
    this.signerList = signerList;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest allowDecline(Boolean allowDecline) {
    this.allowDecline = allowDecline;
    return this;
  }

   /**
   * Allows signers to decline to sign a document if &#x60;true&#x60;. Defaults to &#x60;false&#x60;.
   * @return allowDecline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows signers to decline to sign a document if `true`. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_ALLOW_DECLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowDecline() {
    return allowDecline;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_DECLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowDecline(Boolean allowDecline) {
    this.allowDecline = allowDecline;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest ccs(List<SubCC> ccs) {
    this.ccs = ccs;
    return this;
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest addCcsItem(SubCC ccsItem) {
    if (this.ccs == null) {
      this.ccs = new ArrayList<>();
    }
    this.ccs.add(ccsItem);
    return this;
  }

   /**
   * Add CC email recipients. Required when a CC role exists for the Template.
   * @return ccs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add CC email recipients. Required when a CC role exists for the Template.")
  @JsonProperty(JSON_PROPERTY_CCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubCC> getCcs() {
    return ccs;
  }


  @JsonProperty(JSON_PROPERTY_CCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcs(List<SubCC> ccs) {
    this.ccs = ccs;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest customFields(List<SubCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest addCustomFieldsItem(SubCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An array defining values and options for custom fields. Required when defining pre-set values in &#x60;form_fields_per_document&#x60; or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro).
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array defining values and options for custom fields. Required when defining pre-set values in `form_fields_per_document` or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro).")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubCustomField> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<SubCustomField> customFields) {
    this.customFields = customFields;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The custom message in the email that will be sent to the signers.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom message in the email that will be sent to the signers.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Key-value data that should be attached to the signature request. This metadata is included in all API responses and events involving the signature request. For example, use the metadata field to store a signer&#39;s order number for look up when receiving events for the signature request.  Each request can include up to 10 metadata keys, with key names up to 40 characters long and values up to 1000 characters long.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key-value data that should be attached to the signature request. This metadata is included in all API responses and events involving the signature request. For example, use the metadata field to store a signer's order number for look up when receiving events for the signature request.  Each request can include up to 10 metadata keys, with key names up to 40 characters long and values up to 1000 characters long.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest signingRedirectUrl(String signingRedirectUrl) {
    this.signingRedirectUrl = signingRedirectUrl;
    return this;
  }

   /**
   * The URL you want signers redirected to after they successfully sign.
   * @return signingRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL you want signers redirected to after they successfully sign.")
  @JsonProperty(JSON_PROPERTY_SIGNING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigningRedirectUrl() {
    return signingRedirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_SIGNING_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigningRedirectUrl(String signingRedirectUrl) {
    this.signingRedirectUrl = signingRedirectUrl;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject in the email that will be sent to the signers.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject in the email that will be sent to the signers.")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Whether this is a test, the signature request will not be legally binding if set to &#x60;true&#x60;. Defaults to &#x60;false&#x60;.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is a test, the signature request will not be legally binding if set to `true`. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestMode() {
    return testMode;
  }


  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }


  public SignatureRequestBulkCreateEmbeddedWithTemplateRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title you want to assign to the SignatureRequest.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title you want to assign to the SignatureRequest.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this SignatureRequestBulkCreateEmbeddedWithTemplateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequestBulkCreateEmbeddedWithTemplateRequest signatureRequestBulkCreateEmbeddedWithTemplateRequest = (SignatureRequestBulkCreateEmbeddedWithTemplateRequest) o;
    return Objects.equals(this.templateIds, signatureRequestBulkCreateEmbeddedWithTemplateRequest.templateIds) &&
        Objects.equals(this.clientId, signatureRequestBulkCreateEmbeddedWithTemplateRequest.clientId) &&
        Objects.equals(this.signerFile, signatureRequestBulkCreateEmbeddedWithTemplateRequest.signerFile) &&
        Objects.equals(this.signerList, signatureRequestBulkCreateEmbeddedWithTemplateRequest.signerList) &&
        Objects.equals(this.allowDecline, signatureRequestBulkCreateEmbeddedWithTemplateRequest.allowDecline) &&
        Objects.equals(this.ccs, signatureRequestBulkCreateEmbeddedWithTemplateRequest.ccs) &&
        Objects.equals(this.customFields, signatureRequestBulkCreateEmbeddedWithTemplateRequest.customFields) &&
        Objects.equals(this.message, signatureRequestBulkCreateEmbeddedWithTemplateRequest.message) &&
        Objects.equals(this.metadata, signatureRequestBulkCreateEmbeddedWithTemplateRequest.metadata) &&
        Objects.equals(this.signingRedirectUrl, signatureRequestBulkCreateEmbeddedWithTemplateRequest.signingRedirectUrl) &&
        Objects.equals(this.subject, signatureRequestBulkCreateEmbeddedWithTemplateRequest.subject) &&
        Objects.equals(this.testMode, signatureRequestBulkCreateEmbeddedWithTemplateRequest.testMode) &&
        Objects.equals(this.title, signatureRequestBulkCreateEmbeddedWithTemplateRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateIds, clientId, signerFile, signerList, allowDecline, ccs, customFields, message, metadata, signingRedirectUrl, subject, testMode, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequestBulkCreateEmbeddedWithTemplateRequest {\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    signerFile: ").append(toIndentedString(signerFile)).append("\n");
    sb.append("    signerList: ").append(toIndentedString(signerList)).append("\n");
    sb.append("    allowDecline: ").append(toIndentedString(allowDecline)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signingRedirectUrl: ").append(toIndentedString(signingRedirectUrl)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templateIds != null) {
        if (isFileTypeOrListOfFiles(templateIds)) {
            fileTypeFound = true;
        }

        if (templateIds.getClass().equals(java.io.File.class) ||
            templateIds.getClass().equals(Integer.class) ||
            templateIds.getClass().equals(String.class) ) {
            map.put("template_ids", templateIds);
        } else if (isListOfFile(templateIds)) {
            for(int i = 0; i< getListSize(templateIds); i++) {
                map.put("template_ids[" + i + "]", getFromList(templateIds, i));
            }
        }
        else {
            map.put("template_ids", JSON.getDefault().getMapper().writeValueAsString(templateIds));
        }
    }
    if (clientId != null) {
        if (isFileTypeOrListOfFiles(clientId)) {
            fileTypeFound = true;
        }

        if (clientId.getClass().equals(java.io.File.class) ||
            clientId.getClass().equals(Integer.class) ||
            clientId.getClass().equals(String.class) ) {
            map.put("client_id", clientId);
        } else if (isListOfFile(clientId)) {
            for(int i = 0; i< getListSize(clientId); i++) {
                map.put("client_id[" + i + "]", getFromList(clientId, i));
            }
        }
        else {
            map.put("client_id", JSON.getDefault().getMapper().writeValueAsString(clientId));
        }
    }
    if (signerFile != null) {
        if (isFileTypeOrListOfFiles(signerFile)) {
            fileTypeFound = true;
        }

        if (signerFile.getClass().equals(java.io.File.class) ||
            signerFile.getClass().equals(Integer.class) ||
            signerFile.getClass().equals(String.class) ) {
            map.put("signer_file", signerFile);
        } else if (isListOfFile(signerFile)) {
            for(int i = 0; i< getListSize(signerFile); i++) {
                map.put("signer_file[" + i + "]", getFromList(signerFile, i));
            }
        }
        else {
            map.put("signer_file", JSON.getDefault().getMapper().writeValueAsString(signerFile));
        }
    }
    if (signerList != null) {
        if (isFileTypeOrListOfFiles(signerList)) {
            fileTypeFound = true;
        }

        if (signerList.getClass().equals(java.io.File.class) ||
            signerList.getClass().equals(Integer.class) ||
            signerList.getClass().equals(String.class) ) {
            map.put("signer_list", signerList);
        } else if (isListOfFile(signerList)) {
            for(int i = 0; i< getListSize(signerList); i++) {
                map.put("signer_list[" + i + "]", getFromList(signerList, i));
            }
        }
        else {
            map.put("signer_list", JSON.getDefault().getMapper().writeValueAsString(signerList));
        }
    }
    if (allowDecline != null) {
        if (isFileTypeOrListOfFiles(allowDecline)) {
            fileTypeFound = true;
        }

        if (allowDecline.getClass().equals(java.io.File.class) ||
            allowDecline.getClass().equals(Integer.class) ||
            allowDecline.getClass().equals(String.class) ) {
            map.put("allow_decline", allowDecline);
        } else if (isListOfFile(allowDecline)) {
            for(int i = 0; i< getListSize(allowDecline); i++) {
                map.put("allow_decline[" + i + "]", getFromList(allowDecline, i));
            }
        }
        else {
            map.put("allow_decline", JSON.getDefault().getMapper().writeValueAsString(allowDecline));
        }
    }
    if (ccs != null) {
        if (isFileTypeOrListOfFiles(ccs)) {
            fileTypeFound = true;
        }

        if (ccs.getClass().equals(java.io.File.class) ||
            ccs.getClass().equals(Integer.class) ||
            ccs.getClass().equals(String.class) ) {
            map.put("ccs", ccs);
        } else if (isListOfFile(ccs)) {
            for(int i = 0; i< getListSize(ccs); i++) {
                map.put("ccs[" + i + "]", getFromList(ccs, i));
            }
        }
        else {
            map.put("ccs", JSON.getDefault().getMapper().writeValueAsString(ccs));
        }
    }
    if (customFields != null) {
        if (isFileTypeOrListOfFiles(customFields)) {
            fileTypeFound = true;
        }

        if (customFields.getClass().equals(java.io.File.class) ||
            customFields.getClass().equals(Integer.class) ||
            customFields.getClass().equals(String.class) ) {
            map.put("custom_fields", customFields);
        } else if (isListOfFile(customFields)) {
            for(int i = 0; i< getListSize(customFields); i++) {
                map.put("custom_fields[" + i + "]", getFromList(customFields, i));
            }
        }
        else {
            map.put("custom_fields", JSON.getDefault().getMapper().writeValueAsString(customFields));
        }
    }
    if (message != null) {
        if (isFileTypeOrListOfFiles(message)) {
            fileTypeFound = true;
        }

        if (message.getClass().equals(java.io.File.class) ||
            message.getClass().equals(Integer.class) ||
            message.getClass().equals(String.class) ) {
            map.put("message", message);
        } else if (isListOfFile(message)) {
            for(int i = 0; i< getListSize(message); i++) {
                map.put("message[" + i + "]", getFromList(message, i));
            }
        }
        else {
            map.put("message", JSON.getDefault().getMapper().writeValueAsString(message));
        }
    }
    if (metadata != null) {
        if (isFileTypeOrListOfFiles(metadata)) {
            fileTypeFound = true;
        }

        if (metadata.getClass().equals(java.io.File.class) ||
            metadata.getClass().equals(Integer.class) ||
            metadata.getClass().equals(String.class) ) {
            map.put("metadata", metadata);
        } else if (isListOfFile(metadata)) {
            for(int i = 0; i< getListSize(metadata); i++) {
                map.put("metadata[" + i + "]", getFromList(metadata, i));
            }
        }
        else {
            map.put("metadata", JSON.getDefault().getMapper().writeValueAsString(metadata));
        }
    }
    if (signingRedirectUrl != null) {
        if (isFileTypeOrListOfFiles(signingRedirectUrl)) {
            fileTypeFound = true;
        }

        if (signingRedirectUrl.getClass().equals(java.io.File.class) ||
            signingRedirectUrl.getClass().equals(Integer.class) ||
            signingRedirectUrl.getClass().equals(String.class) ) {
            map.put("signing_redirect_url", signingRedirectUrl);
        } else if (isListOfFile(signingRedirectUrl)) {
            for(int i = 0; i< getListSize(signingRedirectUrl); i++) {
                map.put("signing_redirect_url[" + i + "]", getFromList(signingRedirectUrl, i));
            }
        }
        else {
            map.put("signing_redirect_url", JSON.getDefault().getMapper().writeValueAsString(signingRedirectUrl));
        }
    }
    if (subject != null) {
        if (isFileTypeOrListOfFiles(subject)) {
            fileTypeFound = true;
        }

        if (subject.getClass().equals(java.io.File.class) ||
            subject.getClass().equals(Integer.class) ||
            subject.getClass().equals(String.class) ) {
            map.put("subject", subject);
        } else if (isListOfFile(subject)) {
            for(int i = 0; i< getListSize(subject); i++) {
                map.put("subject[" + i + "]", getFromList(subject, i));
            }
        }
        else {
            map.put("subject", JSON.getDefault().getMapper().writeValueAsString(subject));
        }
    }
    if (testMode != null) {
        if (isFileTypeOrListOfFiles(testMode)) {
            fileTypeFound = true;
        }

        if (testMode.getClass().equals(java.io.File.class) ||
            testMode.getClass().equals(Integer.class) ||
            testMode.getClass().equals(String.class) ) {
            map.put("test_mode", testMode);
        } else if (isListOfFile(testMode)) {
            for(int i = 0; i< getListSize(testMode); i++) {
                map.put("test_mode[" + i + "]", getFromList(testMode, i));
            }
        }
        else {
            map.put("test_mode", JSON.getDefault().getMapper().writeValueAsString(testMode));
        }
    }
    if (title != null) {
        if (isFileTypeOrListOfFiles(title)) {
            fileTypeFound = true;
        }

        if (title.getClass().equals(java.io.File.class) ||
            title.getClass().equals(Integer.class) ||
            title.getClass().equals(String.class) ) {
            map.put("title", title);
        } else if (isListOfFile(title)) {
            for(int i = 0; i< getListSize(title); i++) {
                map.put("title[" + i + "]", getFromList(title, i));
            }
        }
        else {
            map.put("title", JSON.getDefault().getMapper().writeValueAsString(title));
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

