# FileAttachmentsApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileAttachmentsDeleteTimesheetFileAttachment**](FileAttachmentsApi.md#fileAttachmentsDeleteTimesheetFileAttachment) | **DELETE** /FileAttachments/DeleteTimesheetFileAttachment | Delete a particular timesheet file attachment  Requires the &#39;SubmitTimesheets&#39; permission.
[**fileAttachmentsGetFileAttachmentById**](FileAttachmentsApi.md#fileAttachmentsGetFileAttachmentById) | **GET** /FileAttachments/GetFileAttachmentById | Get a particular file attachment by ID.  User must own the file attachment for access.
[**fileAttachmentsGetMyFileAttachments**](FileAttachmentsApi.md#fileAttachmentsGetMyFileAttachments) | **GET** /FileAttachments/GetMyFileAttachments | Get my file attachments.  Get files you&#39;ve attached to timesheets.



## fileAttachmentsDeleteTimesheetFileAttachment

> ApiResponseBoolean fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth)

Delete a particular timesheet file attachment  Requires the &#39;SubmitTimesheets&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FileAttachmentsApi;

FileAttachmentsApi apiInstance = new FileAttachmentsApi();
Integer fileAttachmentId = null; // Integer | The Id of the file attachment to delete
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseBoolean result = apiInstance.fileAttachmentsDeleteTimesheetFileAttachment(fileAttachmentId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsDeleteTimesheetFileAttachment");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileAttachmentId** | **Integer**| The Id of the file attachment to delete | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseBoolean**](ApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fileAttachmentsGetFileAttachmentById

> ApiResponseTimesheetFileAttachment fileAttachmentsGetFileAttachmentById(fileAttachmentId, xChronosheetsAuth)

Get a particular file attachment by ID.  User must own the file attachment for access.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FileAttachmentsApi;

FileAttachmentsApi apiInstance = new FileAttachmentsApi();
Integer fileAttachmentId = null; // Integer | The ID of the file attachment
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseTimesheetFileAttachment result = apiInstance.fileAttachmentsGetFileAttachmentById(fileAttachmentId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsGetFileAttachmentById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileAttachmentId** | **Integer**| The ID of the file attachment | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseTimesheetFileAttachment**](ApiResponseTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## fileAttachmentsGetMyFileAttachments

> ApiResponseForPaginatedListTimesheetFileAttachment fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take)

Get my file attachments.  Get files you&#39;ve attached to timesheets.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.FileAttachmentsApi;

FileAttachmentsApi apiInstance = new FileAttachmentsApi();
Date startDate = null; // Date | The Start date of the date range.  File attachments after this date will be obtained.
Date endDate = null; // Date | The End date of the date range.  File attachments before this date will be obtained.
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
Integer skip = null; // Integer | Skip this many File attachments
Integer take = null; // Integer | Take this many File attachments
try {
    ApiResponseForPaginatedListTimesheetFileAttachment result = apiInstance.fileAttachmentsGetMyFileAttachments(startDate, endDate, xChronosheetsAuth, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileAttachmentsApi#fileAttachmentsGetMyFileAttachments");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| The Start date of the date range.  File attachments after this date will be obtained. | [default to null]
 **endDate** | **Date**| The End date of the date range.  File attachments before this date will be obtained. | [default to null]
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **skip** | **Integer**| Skip this many File attachments | [optional] [default to null]
 **take** | **Integer**| Take this many File attachments | [optional] [default to null]

### Return type

[**ApiResponseForPaginatedListTimesheetFileAttachment**](ApiResponseForPaginatedListTimesheetFileAttachment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

