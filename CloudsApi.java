/*
 * Заказ ресурсов в облаке
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

 package io.swagger.client.api;

 import io.swagger.client.ApiCallback;
 import io.swagger.client.ApiClient;
 import io.swagger.client.ApiException;
 import io.swagger.client.ApiResponse;
 import io.swagger.client.Configuration;
 import io.swagger.client.Pair;
 import io.swagger.client.ProgressRequestBody;
 import io.swagger.client.ProgressResponseBody;
 
 import com.google.gson.reflect.TypeToken;
 
 import java.io.IOException;
 
 
 import io.swagger.client.model.Clouds;
 import io.swagger.client.model.Error;
 
 import java.lang.reflect.Type;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 
 public class CloudsApi {
     private ApiClient apiClient;
 
     public CloudsApi() {
         this(Configuration.getDefaultApiClient());
     }
 
     public CloudsApi(ApiClient apiClient) {
         this.apiClient = apiClient;
     }
 
     public ApiClient getApiClient() {
         return apiClient;
     }
 
     public void setApiClient(ApiClient apiClient) {
         this.apiClient = apiClient;
     }
 
     /**
      * Build call for cancelCloudById
      * @param cloudId Идентификатор заказа в облаке (required)
      * @param progressListener Progress listener
      * @param progressRequestListener Progress request listener
      * @return Call to execute
      * @throws ApiException If fail to serialize the request body object
      */
     public com.squareup.okhttp.Call cancelCloudByIdCall(String cloudId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         Object localVarPostBody = null;
         
         // create path and map variables
         String localVarPath = "/clouds/{cloud_id}"
             .replaceAll("\\{" + "cloud_id" + "\\}", apiClient.escapeString(cloudId.toString()));
 
         List<Pair> localVarQueryParams = new ArrayList<Pair>();
         List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
 
         Map<String, String> localVarHeaderParams = new HashMap<String, String>();
 
         Map<String, Object> localVarFormParams = new HashMap<String, Object>();
 
         final String[] localVarAccepts = {
             "adplication/json"
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
 
         String[] localVarAuthNames = new String[] {  };
         return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
     }
     
     @SuppressWarnings("rawtypes")
     private com.squareup.okhttp.Call cancelCloudByIdValidateBeforeCall(String cloudId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         // verify the required parameter 'cloudId' is set
         if (cloudId == null) {
             throw new ApiException("Missing the required parameter 'cloudId' when calling cancelCloudById(Async)");
         }
         
         com.squareup.okhttp.Call call = cancelCloudByIdCall(cloudId, progressListener, progressRequestListener);
         return call;
 
         
         
         
         
     }
 
     /**
      * Метод отмены заказа в облаке по ID
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public void cancelCloudById(String cloudId) throws ApiException {
         cancelCloudByIdWithHttpInfo(cloudId);
     }
 
     /**
      * Метод отмены заказа в облаке по ID
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @return ApiResponse&lt;Void&gt;
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public ApiResponse<Void> cancelCloudByIdWithHttpInfo(String cloudId) throws ApiException {
         com.squareup.okhttp.Call call = cancelCloudByIdValidateBeforeCall(cloudId, null, null);
         return apiClient.execute(call);
     }
 
     /**
      * Метод отмены заказа в облаке по ID (asynchronously)
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @param callback The callback to be executed when the API call finishes
      * @return The request call
      * @throws ApiException If fail to process the API call, e.g. serializing the request body object
      */
     public com.squareup.okhttp.Call cancelCloudByIdAsync(String cloudId, final ApiCallback<Void> callback) throws ApiException {
 
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
 
         com.squareup.okhttp.Call call = cancelCloudByIdValidateBeforeCall(cloudId, progressListener, progressRequestListener);
         apiClient.executeAsync(call, callback);
         return call;
     }
     /**
      * Build call for createCloud
      * @param body  (optional)
      * @param progressListener Progress listener
      * @param progressRequestListener Progress request listener
      * @return Call to execute
      * @throws ApiException If fail to serialize the request body object
      */
     public com.squareup.okhttp.Call createCloudCall(Error body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         Object localVarPostBody = body;
         
         // create path and map variables
         String localVarPath = "/clouds";
 
         List<Pair> localVarQueryParams = new ArrayList<Pair>();
         List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
 
         Map<String, String> localVarHeaderParams = new HashMap<String, String>();
 
         Map<String, Object> localVarFormParams = new HashMap<String, Object>();
 
         final String[] localVarAccepts = {
             "adplication/json"
         };
         final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
         if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
 
         final String[] localVarContentTypes = {
             "adplication/json"
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
 
         String[] localVarAuthNames = new String[] {  };
         return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
     }
     
     @SuppressWarnings("rawtypes")
     private com.squareup.okhttp.Call createCloudValidateBeforeCall(Error body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         
         com.squareup.okhttp.Call call = createCloudCall(body, progressListener, progressRequestListener);
         return call;
 
         
         
         
         
     }
 
     /**
      * Создание заказа в облаке
      * 
      * @param body  (optional)
      * @return Clouds
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public Clouds createCloud(Error body) throws ApiException {
         ApiResponse<Clouds> resp = createCloudWithHttpInfo(body);
         return resp.getData();
     }
 
     /**
      * Создание заказа в облаке
      * 
      * @param body  (optional)
      * @return ApiResponse&lt;Clouds&gt;
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public ApiResponse<Clouds> createCloudWithHttpInfo(Error body) throws ApiException {
         com.squareup.okhttp.Call call = createCloudValidateBeforeCall(body, null, null);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         return apiClient.execute(call, localVarReturnType);
     }
 
     /**
      * Создание заказа в облаке (asynchronously)
      * 
      * @param body  (optional)
      * @param callback The callback to be executed when the API call finishes
      * @return The request call
      * @throws ApiException If fail to process the API call, e.g. serializing the request body object
      */
     public com.squareup.okhttp.Call createCloudAsync(Error body, final ApiCallback<Clouds> callback) throws ApiException {
 
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
 
         com.squareup.okhttp.Call call = createCloudValidateBeforeCall(body, progressListener, progressRequestListener);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         apiClient.executeAsync(call, localVarReturnType, callback);
         return call;
     }
     /**
      * Build call for getAllClouds
      * @param progressListener Progress listener
      * @param progressRequestListener Progress request listener
      * @return Call to execute
      * @throws ApiException If fail to serialize the request body object
      */
     public com.squareup.okhttp.Call getAllCloudsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         Object localVarPostBody = null;
         
         // create path and map variables
         String localVarPath = "/clouds";
 
         List<Pair> localVarQueryParams = new ArrayList<Pair>();
         List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
 
         Map<String, String> localVarHeaderParams = new HashMap<String, String>();
 
         Map<String, Object> localVarFormParams = new HashMap<String, Object>();
 
         final String[] localVarAccepts = {
             "adplication/json"
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
 
         String[] localVarAuthNames = new String[] {  };
         return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
     }
     
     @SuppressWarnings("rawtypes")
     private com.squareup.okhttp.Call getAllCloudsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         
         com.squareup.okhttp.Call call = getAllCloudsCall(progressListener, progressRequestListener);
         return call;
 
         
         
         
         
     }
 
     /**
      * Метод получения списка ресурсов на облаке
      * 
      * @return Clouds
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public Clouds getAllClouds() throws ApiException {
         ApiResponse<Clouds> resp = getAllCloudsWithHttpInfo();
         return resp.getData();
     }
 
     /**
      * Метод получения списка ресурсов на облаке
      * 
      * @return ApiResponse&lt;Clouds&gt;
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public ApiResponse<Clouds> getAllCloudsWithHttpInfo() throws ApiException {
         com.squareup.okhttp.Call call = getAllCloudsValidateBeforeCall(null, null);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         return apiClient.execute(call, localVarReturnType);
     }
 
     /**
      * Метод получения списка ресурсов на облаке (asynchronously)
      * 
      * @param callback The callback to be executed when the API call finishes
      * @return The request call
      * @throws ApiException If fail to process the API call, e.g. serializing the request body object
      */
     public com.squareup.okhttp.Call getAllCloudsAsync(final ApiCallback<Clouds> callback) throws ApiException {
 
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
 
         com.squareup.okhttp.Call call = getAllCloudsValidateBeforeCall(progressListener, progressRequestListener);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         apiClient.executeAsync(call, localVarReturnType, callback);
         return call;
     }
     /**
      * Build call for getCloud
      * @param cloudId Идентификатор заказа в облаке (required)
      * @param progressListener Progress listener
      * @param progressRequestListener Progress request listener
      * @return Call to execute
      * @throws ApiException If fail to serialize the request body object
      */
     public com.squareup.okhttp.Call getCloudCall(String cloudId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         Object localVarPostBody = null;
         
         // create path and map variables
         String localVarPath = "/clouds/{cloud_id}"
             .replaceAll("\\{" + "cloud_id" + "\\}", apiClient.escapeString(cloudId.toString()));
 
         List<Pair> localVarQueryParams = new ArrayList<Pair>();
         List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
 
         Map<String, String> localVarHeaderParams = new HashMap<String, String>();
 
         Map<String, Object> localVarFormParams = new HashMap<String, Object>();
 
         final String[] localVarAccepts = {
             "adplication/json"
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
 
         String[] localVarAuthNames = new String[] {  };
         return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
     }
     
     @SuppressWarnings("rawtypes")
     private com.squareup.okhttp.Call getCloudValidateBeforeCall(String cloudId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
         // verify the required parameter 'cloudId' is set
         if (cloudId == null) {
             throw new ApiException("Missing the required parameter 'cloudId' when calling getCloud(Async)");
         }
         
         com.squareup.okhttp.Call call = getCloudCall(cloudId, progressListener, progressRequestListener);
         return call;
 
         
         
         
         
     }
 
     /**
      * Метод получения заказа по ID
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @return Clouds
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public Clouds getCloud(String cloudId) throws ApiException {
         ApiResponse<Clouds> resp = getCloudWithHttpInfo(cloudId);
         return resp.getData();
     }
 
     /**
      * Метод получения заказа по ID
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @return ApiResponse&lt;Clouds&gt;
      * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
      */
     public ApiResponse<Clouds> getCloudWithHttpInfo(String cloudId) throws ApiException {
         com.squareup.okhttp.Call call = getCloudValidateBeforeCall(cloudId, null, null);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         return apiClient.execute(call, localVarReturnType);
     }
 
     /**
      * Метод получения заказа по ID (asynchronously)
      * 
      * @param cloudId Идентификатор заказа в облаке (required)
      * @param callback The callback to be executed when the API call finishes
      * @return The request call
      * @throws ApiException If fail to process the API call, e.g. serializing the request body object
      */
     public com.squareup.okhttp.Call getCloudAsync(String cloudId, final ApiCallback<Clouds> callback) throws ApiException {
 
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
 
         com.squareup.okhttp.Call call = getCloudValidateBeforeCall(cloudId, progressListener, progressRequestListener);
         Type localVarReturnType = new TypeToken<Clouds>(){}.getType();
         apiClient.executeAsync(call, localVarReturnType, callback);
         return call;
     }
 }