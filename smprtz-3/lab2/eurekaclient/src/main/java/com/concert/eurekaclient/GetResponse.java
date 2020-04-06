package com.concert.eurekaclient;

import org.springframework.beans.factory.annotation.Value;

public class GetResponse<T> {
    private final T data;
    private final String instanceId;

    public GetResponse(T data, String instanceId) {
        this.data = data;
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public T getData() {
        return data;
    }
}