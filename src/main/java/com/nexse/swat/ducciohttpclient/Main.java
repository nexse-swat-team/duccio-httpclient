package com.nexse.swat.ducciohttpclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.protocol.Protocol;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // this registers our custom protocol handler
        Protocol.registerProtocol("https", new Protocol("https", new NoCertificateSSLProtocolSocketFactory(), 443));

        HttpClient client = new HttpClient();
        String url = "https://facebook.com";

        HttpMethod method = new GetMethod(url);
        client.executeMethod(method);
        String response = method.getResponseBodyAsString();
        System.out.println(response);
    }

}
