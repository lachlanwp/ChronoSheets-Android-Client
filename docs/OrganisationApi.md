# OrganisationApi

All URIs are relative to *https://api.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationGetOrganisation**](OrganisationApi.md#organisationGetOrganisation) | **GET** /Organisation/GetOrganisation | Get your organisation.    Requires &#39;OrganisationAdmin&#39; permission.
[**organisationUpdateOrganisation**](OrganisationApi.md#organisationUpdateOrganisation) | **PUT** /Organisation/UpdateOrganisation | Update an organisation.    Requires &#39;OrganisationAdmin&#39; permission.



## organisationGetOrganisation

> ApiResponseOrganisation organisationGetOrganisation(xChronosheetsAuth)

Get your organisation.    Requires &#39;OrganisationAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
try {
    ApiResponseOrganisation result = apiInstance.organisationGetOrganisation(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationGetOrganisation");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]

### Return type

[**ApiResponseOrganisation**](ApiResponseOrganisation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data


## organisationUpdateOrganisation

> ApiResponseUpdateOrganisationResponse organisationUpdateOrganisation(xChronosheetsAuth, request)

Update an organisation.    Requires &#39;OrganisationAdmin&#39; permission.

### Example

```java
// Import classes:
//import ChronoSheetsClientLibApi.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String xChronosheetsAuth = null; // String | The ChronoSheets Auth Token
UpdateOrganisationRequest request = new UpdateOrganisationRequest(); // UpdateOrganisationRequest | An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update
try {
    ApiResponseUpdateOrganisationResponse result = apiInstance.organisationUpdateOrganisation(xChronosheetsAuth, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationUpdateOrganisation");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token | [default to null]
 **request** | [**UpdateOrganisationRequest**](UpdateOrganisationRequest.md)| An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update |

### Return type

[**ApiResponseUpdateOrganisationResponse**](ApiResponseUpdateOrganisationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

