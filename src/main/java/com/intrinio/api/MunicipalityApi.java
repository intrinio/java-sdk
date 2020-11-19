

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


import com.intrinio.models.ApiResponseMunicipalities;
import com.intrinio.models.ApiResponseMunicipalitiyFinancials;
import java.math.BigDecimal;
import com.intrinio.models.Municipality;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MunicipalityApi {
    private ApiClient apiClient;

    public MunicipalityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MunicipalityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllMunicipalities
     * @param hasFinancials Return municipalities with financials (optional)
     * @param governmentName Return municipalities with a government name matching the given query (optional)
     * @param governmentType Return municipalities with the given government type (optional)
     * @param areaName Return municipalities with an area name matching the given query (optional)
     * @param areaType Return municipalities with the given area type (optional)
     * @param city Return municipalities in the given city (optional)
     * @param state Return municipalities in the given state (optional)
     * @param zipcode Return municipalities in the given zipcode (optional)
     * @param populationGreaterThan Return municipalities with a population greater than the given number (optional)
     * @param populationLessThan Return municipalities with a population less than the given number (optional)
     * @param enrollmentGreaterThan Return municipalities with an enrollment greater than the given number (optional)
     * @param enrollmentLessThan Return municipalities with an enrollment less than the given number (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllMunicipalitiesCall(Boolean hasFinancials, String governmentName, String governmentType, String areaName, String areaType, String city, String state, BigDecimal zipcode, BigDecimal populationGreaterThan, BigDecimal populationLessThan, BigDecimal enrollmentGreaterThan, BigDecimal enrollmentLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/municipalities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (hasFinancials != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("has_financials", hasFinancials));
        if (governmentName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("government_name", governmentName));
        if (governmentType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("government_type", governmentType));
        if (areaName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("area_name", areaName));
        if (areaType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("area_type", areaType));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("city", city));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
        if (zipcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("zipcode", zipcode));
        if (populationGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("population_greater_than", populationGreaterThan));
        if (populationLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("population_less_than", populationLessThan));
        if (enrollmentGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("enrollment_greater_than", enrollmentGreaterThan));
        if (enrollmentLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("enrollment_less_than", enrollmentLessThan));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));

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
    private com.squareup.okhttp.Call getAllMunicipalitiesValidateBeforeCall(Boolean hasFinancials, String governmentName, String governmentType, String areaName, String areaType, String city, String state, BigDecimal zipcode, BigDecimal populationGreaterThan, BigDecimal populationLessThan, BigDecimal enrollmentGreaterThan, BigDecimal enrollmentLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllMunicipalitiesCall(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Municipalities
     * Returns all Municipalities. When parameters are specified, returns matching municipalities.
     * @param hasFinancials Return municipalities with financials (optional)
     * @param governmentName Return municipalities with a government name matching the given query (optional)
     * @param governmentType Return municipalities with the given government type (optional)
     * @param areaName Return municipalities with an area name matching the given query (optional)
     * @param areaType Return municipalities with the given area type (optional)
     * @param city Return municipalities in the given city (optional)
     * @param state Return municipalities in the given state (optional)
     * @param zipcode Return municipalities in the given zipcode (optional)
     * @param populationGreaterThan Return municipalities with a population greater than the given number (optional)
     * @param populationLessThan Return municipalities with a population less than the given number (optional)
     * @param enrollmentGreaterThan Return municipalities with an enrollment greater than the given number (optional)
     * @param enrollmentLessThan Return municipalities with an enrollment less than the given number (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseMunicipalities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseMunicipalities getAllMunicipalities(Boolean hasFinancials, String governmentName, String governmentType, String areaName, String areaType, String city, String state, BigDecimal zipcode, BigDecimal populationGreaterThan, BigDecimal populationLessThan, BigDecimal enrollmentGreaterThan, BigDecimal enrollmentLessThan, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = MunicipalityApi.class.getMethod("getAllMunicipalitiesWithHttpInfo", Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage };
      ApiResponse<ApiResponseMunicipalities> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Municipalities
     * Returns all Municipalities. When parameters are specified, returns matching municipalities.
     * @param hasFinancials Return municipalities with financials (optional)
     * @param governmentName Return municipalities with a government name matching the given query (optional)
     * @param governmentType Return municipalities with the given government type (optional)
     * @param areaName Return municipalities with an area name matching the given query (optional)
     * @param areaType Return municipalities with the given area type (optional)
     * @param city Return municipalities in the given city (optional)
     * @param state Return municipalities in the given state (optional)
     * @param zipcode Return municipalities in the given zipcode (optional)
     * @param populationGreaterThan Return municipalities with a population greater than the given number (optional)
     * @param populationLessThan Return municipalities with a population less than the given number (optional)
     * @param enrollmentGreaterThan Return municipalities with an enrollment greater than the given number (optional)
     * @param enrollmentLessThan Return municipalities with an enrollment less than the given number (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseMunicipalities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseMunicipalities> getAllMunicipalitiesWithHttpInfo(Boolean hasFinancials, String governmentName, String governmentType, String areaName, String areaType, String city, String state, BigDecimal zipcode, BigDecimal populationGreaterThan, BigDecimal populationLessThan, BigDecimal enrollmentGreaterThan, BigDecimal enrollmentLessThan, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllMunicipalitiesValidateBeforeCall(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseMunicipalities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Municipalities (asynchronously)
     * Returns all Municipalities. When parameters are specified, returns matching municipalities.
     * @param hasFinancials Return municipalities with financials (optional)
     * @param governmentName Return municipalities with a government name matching the given query (optional)
     * @param governmentType Return municipalities with the given government type (optional)
     * @param areaName Return municipalities with an area name matching the given query (optional)
     * @param areaType Return municipalities with the given area type (optional)
     * @param city Return municipalities in the given city (optional)
     * @param state Return municipalities in the given state (optional)
     * @param zipcode Return municipalities in the given zipcode (optional)
     * @param populationGreaterThan Return municipalities with a population greater than the given number (optional)
     * @param populationLessThan Return municipalities with a population less than the given number (optional)
     * @param enrollmentGreaterThan Return municipalities with an enrollment greater than the given number (optional)
     * @param enrollmentLessThan Return municipalities with an enrollment less than the given number (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllMunicipalitiesAsync(Boolean hasFinancials, String governmentName, String governmentType, String areaName, String areaType, String city, String state, BigDecimal zipcode, BigDecimal populationGreaterThan, BigDecimal populationLessThan, BigDecimal enrollmentGreaterThan, BigDecimal enrollmentLessThan, String nextPage, final ApiCallback<ApiResponseMunicipalities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllMunicipalitiesValidateBeforeCall(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseMunicipalities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMunicipalityById
     * @param id An Intrinio ID of a Municipality (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMunicipalityByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/municipalities/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getMunicipalityByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMunicipalityById(Async)");
        }
        

        com.squareup.okhttp.Call call = getMunicipalityByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Municipality by ID
     * Returns the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @return Municipality
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Municipality getMunicipalityById(String id) throws ApiException, NoSuchMethodException {
      Method targetMethod = MunicipalityApi.class.getMethod("getMunicipalityByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { id };
      ApiResponse<Municipality> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Municipality by ID
     * Returns the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @return ApiResponse&lt;Municipality&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Municipality> getMunicipalityByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getMunicipalityByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Municipality>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Municipality by ID (asynchronously)
     * Returns the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMunicipalityByIdAsync(String id, final ApiCallback<Municipality> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMunicipalityByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Municipality>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMunicipalityFinancials
     * @param id An Intrinio ID of a Municipality (required)
     * @param fiscalYear Return financials for the given fiscal year (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMunicipalityFinancialsCall(String id, BigDecimal fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/municipalities/{id}/financials"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));

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
    private com.squareup.okhttp.Call getMunicipalityFinancialsValidateBeforeCall(String id, BigDecimal fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMunicipalityFinancials(Async)");
        }
        

        com.squareup.okhttp.Call call = getMunicipalityFinancialsCall(id, fiscalYear, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Financials for a Municipality
     * Returns financial statement data for the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @param fiscalYear Return financials for the given fiscal year (optional)
     * @return ApiResponseMunicipalitiyFinancials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseMunicipalitiyFinancials getMunicipalityFinancials(String id, BigDecimal fiscalYear) throws ApiException, NoSuchMethodException {
      Method targetMethod = MunicipalityApi.class.getMethod("getMunicipalityFinancialsWithHttpInfo", String.class, BigDecimal.class);
      
      Object[] apiCallArguments = { id, fiscalYear };
      ApiResponse<ApiResponseMunicipalitiyFinancials> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Financials for a Municipality
     * Returns financial statement data for the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @param fiscalYear Return financials for the given fiscal year (optional)
     * @return ApiResponse&lt;ApiResponseMunicipalitiyFinancials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseMunicipalitiyFinancials> getMunicipalityFinancialsWithHttpInfo(String id, BigDecimal fiscalYear) throws ApiException {
        com.squareup.okhttp.Call call = getMunicipalityFinancialsValidateBeforeCall(id, fiscalYear, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseMunicipalitiyFinancials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Financials for a Municipality (asynchronously)
     * Returns financial statement data for the Municipality with the given ID
     * @param id An Intrinio ID of a Municipality (required)
     * @param fiscalYear Return financials for the given fiscal year (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMunicipalityFinancialsAsync(String id, BigDecimal fiscalYear, final ApiCallback<ApiResponseMunicipalitiyFinancials> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMunicipalityFinancialsValidateBeforeCall(id, fiscalYear, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseMunicipalitiyFinancials>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
