package com.ahmedco.test1;

public interface RequestHandler {

    void setNextRequestHandler(RequestHandler requestHandler);

    boolean process(RequestData requestData);
}
