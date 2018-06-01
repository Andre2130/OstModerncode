package com.example.mcs.ostmoderncode;

public class ApiUtils {
    public static final String baseUrl = "http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000/api/sets/";

    public static ApiInterface getApiInterface() {
        return ApiClient.getApiClient(baseUrl).create(ApiInterface.class);
    }
}
