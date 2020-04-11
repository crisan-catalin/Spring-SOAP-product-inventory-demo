package com.example.demo;

import com.example.demo.ws.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ProductClient extends WebServiceGatewaySupport {

    private static final String HTTP_8080_WS_PRODUCTS = "http://localhost:8080/ws/products";

    public GetProductsResponse getProducts() {
        return (GetProductsResponse) getWebServiceTemplate()
                .marshalSendAndReceive(HTTP_8080_WS_PRODUCTS, new GetProductsRequest());
    }

    public UpdateProductResponse updateProduct(Product product) {
        UpdateProductRequest request = new UpdateProductRequest();
        request.setProduct(product);

        return (UpdateProductResponse) getWebServiceTemplate()
                .marshalSendAndReceive(HTTP_8080_WS_PRODUCTS, request);
    }

    public RemoveProductResponse removeProduct(String code) {
        RemoveProductRequest request = new RemoveProductRequest();
        request.setCode(code);

        return (RemoveProductResponse) getWebServiceTemplate()
                .marshalSendAndReceive(HTTP_8080_WS_PRODUCTS, request);
    }
}
