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
import java.util.ArrayList;
import java.util.List;
import org.hellosign.openapi.model.BulkSendJobResponse;
import org.hellosign.openapi.model.ListInfoResponse;
import org.hellosign.openapi.model.WarningResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * BulkSendJobListResponse
 */
@JsonPropertyOrder({
    BulkSendJobListResponse.JSON_PROPERTY_BULK_SEND_JOBS,
    BulkSendJobListResponse.JSON_PROPERTY_LIST_INFO,
    BulkSendJobListResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BulkSendJobListResponse {
  public static final String JSON_PROPERTY_BULK_SEND_JOBS = "bulk_send_jobs";
  private List<BulkSendJobResponse> bulkSendJobs = null;

  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public BulkSendJobListResponse() { 
  }

  public BulkSendJobListResponse bulkSendJobs(List<BulkSendJobResponse> bulkSendJobs) {
    this.bulkSendJobs = bulkSendJobs;
    return this;
  }

  public BulkSendJobListResponse addBulkSendJobsItem(BulkSendJobResponse bulkSendJobsItem) {
    if (this.bulkSendJobs == null) {
      this.bulkSendJobs = new ArrayList<>();
    }
    this.bulkSendJobs.add(bulkSendJobsItem);
    return this;
  }

   /**
   * Get bulkSendJobs
   * @return bulkSendJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_SEND_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BulkSendJobResponse> getBulkSendJobs() {
    return bulkSendJobs;
  }


  @JsonProperty(JSON_PROPERTY_BULK_SEND_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkSendJobs(List<BulkSendJobResponse> bulkSendJobs) {
    this.bulkSendJobs = bulkSendJobs;
  }


  public BulkSendJobListResponse listInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
    return this;
  }

   /**
   * Get listInfo
   * @return listInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListInfoResponse getListInfo() {
    return listInfo;
  }


  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
  }


  public BulkSendJobListResponse warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public BulkSendJobListResponse addWarningsItem(WarningResponse warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WarningResponse> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this BulkSendJobListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendJobListResponse bulkSendJobListResponse = (BulkSendJobListResponse) o;
    return Objects.equals(this.bulkSendJobs, bulkSendJobListResponse.bulkSendJobs) &&
        Objects.equals(this.listInfo, bulkSendJobListResponse.listInfo) &&
        Objects.equals(this.warnings, bulkSendJobListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkSendJobs, listInfo, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendJobListResponse {\n");
    sb.append("    bulkSendJobs: ").append(toIndentedString(bulkSendJobs)).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (bulkSendJobs != null) {
        if (isFileTypeOrListOfFiles(bulkSendJobs)) {
            fileTypeFound = true;
        }

        if (bulkSendJobs.getClass().equals(java.io.File.class) ||
            bulkSendJobs.getClass().equals(Integer.class) ||
            bulkSendJobs.getClass().equals(String.class) ) {
            map.put("bulk_send_jobs", bulkSendJobs);
        } else if (isListOfFile(bulkSendJobs)) {
            for(int i = 0; i< getListSize(bulkSendJobs); i++) {
                map.put("bulk_send_jobs[" + i + "]", getFromList(bulkSendJobs, i));
            }
        }
        else {
            map.put("bulk_send_jobs", JSON.getDefault().getMapper().writeValueAsString(bulkSendJobs));
        }
    }
    if (listInfo != null) {
        if (isFileTypeOrListOfFiles(listInfo)) {
            fileTypeFound = true;
        }

        if (listInfo.getClass().equals(java.io.File.class) ||
            listInfo.getClass().equals(Integer.class) ||
            listInfo.getClass().equals(String.class) ) {
            map.put("list_info", listInfo);
        } else if (isListOfFile(listInfo)) {
            for(int i = 0; i< getListSize(listInfo); i++) {
                map.put("list_info[" + i + "]", getFromList(listInfo, i));
            }
        }
        else {
            map.put("list_info", JSON.getDefault().getMapper().writeValueAsString(listInfo));
        }
    }
    if (warnings != null) {
        if (isFileTypeOrListOfFiles(warnings)) {
            fileTypeFound = true;
        }

        if (warnings.getClass().equals(java.io.File.class) ||
            warnings.getClass().equals(Integer.class) ||
            warnings.getClass().equals(String.class) ) {
            map.put("warnings", warnings);
        } else if (isListOfFile(warnings)) {
            for(int i = 0; i< getListSize(warnings); i++) {
                map.put("warnings[" + i + "]", getFromList(warnings, i));
            }
        }
        else {
            map.put("warnings", JSON.getDefault().getMapper().writeValueAsString(warnings));
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

