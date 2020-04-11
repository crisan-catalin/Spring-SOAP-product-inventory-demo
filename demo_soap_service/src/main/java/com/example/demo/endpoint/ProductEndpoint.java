package com.example.demo.endpoint;

import com.example.demo.repository.ProductRepository;
import com.example.demo.ws.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductEndpoint {

    private static final String NAMESPACE_URI = "http://www.catalin.com/springsoap/gen";

    @Autowired
    private ProductRepository productRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductsRequest")
    @ResponsePayload
    public GetProductsResponse getProducts() {
        GetProductsResponse response = new GetProductsResponse();
        response.getProducts().addAll(productRepository.getProducts());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "removeProductRequest")
    @ResponsePayload
    public RemoveProductResponse removeProduct(@RequestPayload RemoveProductRequest request) {
        RemoveProductResponse response = new RemoveProductResponse();
        response.setSucess(productRepository.removeProduct(request.getCode()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateProductRequest")
    @ResponsePayload
    public UpdateProductResponse updateProduct(@RequestPayload UpdateProductRequest request) {
        UpdateProductResponse response = new UpdateProductResponse();
        response.setSucess(productRepository.updateProduct(request.getProduct()));
        return response;
    }
}
