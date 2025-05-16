

package com.intrinio.api;

import com.intrinio.invoker.ApiCallback;
import com.intrinio.invoker.ApiClient;
import com.intrinio.invoker.ApiException;
import com.intrinio.invoker.ApiResponse;
import com.intrinio.invoker.Configuration;
import com.intrinio.invoker.Pair;
import com.intrinio.invoker.ProgressRequestBody;
import com.intrinio.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.intrinio.models.ApiResponseIndexIntervals;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesApi {
    private ApiClient apiClient;

    public IndicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IndicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getIndexIntervals
     * @param identifier The index identifier (required)
     * @param intervalSize The interval size to return in minutes (m) or hour (h). (required)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Interprets the input times in this time zone, as well as returns times in this timezone. (optional, default to UTC)
     * @param pageSize The number of results to return per page. (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIndexIntervalsCall(String identifier, String intervalSize, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/{identifier}/intervals"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (intervalSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval_size", intervalSize));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIndexIntervalsValidateBeforeCall(String identifier, String intervalSize, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getIndexIntervals(Async)");
        }
        
        // verify the required parameter 'intervalSize' is set
        if (intervalSize == null) {
            throw new ApiException("Missing the required parameter 'intervalSize' when calling getIndexIntervals(Async)");
        }
        

        com.squareup.okhttp.Call call = getIndexIntervalsCall(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Index Intervals
     * Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.
     * @param identifier The index identifier (required)
     * @param intervalSize The interval size to return in minutes (m) or hour (h). (required)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Interprets the input times in this time zone, as well as returns times in this timezone. (optional, default to UTC)
     * @param pageSize The number of results to return per page. (optional, default to 100)
     * @return ApiResponseIndexIntervals
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseIndexIntervals getIndexIntervals(String identifier, String intervalSize, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = IndicesApi.class.getMethod("getIndexIntervalsWithHttpInfo", String.class, String.class, LocalDate.class, String.class, LocalDate.class, String.class, String.class, Integer.class);
      
      Object[] apiCallArguments = { identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize };
      ApiResponse<ApiResponseIndexIntervals> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Index Intervals
     * Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.
     * @param identifier The index identifier (required)
     * @param intervalSize The interval size to return in minutes (m) or hour (h). (required)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Interprets the input times in this time zone, as well as returns times in this timezone. (optional, default to UTC)
     * @param pageSize The number of results to return per page. (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseIndexIntervals&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseIndexIntervals> getIndexIntervalsWithHttpInfo(String identifier, String intervalSize, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getIndexIntervalsValidateBeforeCall(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseIndexIntervals>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Index Intervals (asynchronously)
     * Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.
     * @param identifier The index identifier (required)
     * @param intervalSize The interval size to return in minutes (m) or hour (h). (required)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Interprets the input times in this time zone, as well as returns times in this timezone. (optional, default to UTC)
     * @param pageSize The number of results to return per page. (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIndexIntervalsAsync(String identifier, String intervalSize, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, final ApiCallback<ApiResponseIndexIntervals> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getIndexIntervalsValidateBeforeCall(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseIndexIntervals>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
