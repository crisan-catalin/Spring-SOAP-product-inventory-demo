package com.example.demo.controller;

import com.example.demo.ProductClient;
import com.example.demo.ws.Currency;
import com.example.demo.ws.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class InventoryController {

    @Autowired
    private ProductClient client;

    @GetMapping("/")
    public String getView(Model model) {
        model.addAttribute("products", client.getProducts().getProducts());
        model.addAttribute("product", new Product());
        return "index";
    }

    @PostMapping(value = "/update")
    @ResponseBody
    public boolean updateProduct(@RequestBody Product obj) {
        return client.updateProduct(obj).isSucess();
    }

    @PostMapping(value = "/remove")
    @ResponseBody
    public boolean removeProduct(@RequestBody Product obj) {
        return client.removeProduct(obj.getCode()).isSucess();
    }
}
