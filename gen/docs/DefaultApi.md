# DefaultApi

All URIs are relative to *http://https*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCLibrary**](DefaultApi.md#getCLibrary) | **GET** /CLibrary | Get Single Common Library
[**postCLibrary**](DefaultApi.md#postCLibrary) | **POST** /CLibrary | Save, Update Single Common Library


<a name="getCLibrary"></a>
# **getCLibrary**
> GetCLibraryDto getCLibrary()

Get Single Common Library

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetCLibraryDto result = apiInstance.getCLibrary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCLibrary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCLibraryDto**](GetCLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 성공 |  -  |
**400** | 실패 |  -  |

<a name="postCLibrary"></a>
# **postCLibrary**
> postCLibrary()

Save, Update Single Common Library

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.postCLibrary();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#postCLibrary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 성공 |  -  |
**400** | 실패 |  -  |

