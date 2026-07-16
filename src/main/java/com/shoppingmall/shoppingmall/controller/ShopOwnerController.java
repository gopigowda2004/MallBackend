package com.shoppingmall.shoppingmall.controller;

import com.shoppingmall.shoppingmall.entity.ShopOwner;
import com.shoppingmall.shoppingmall.service.ShopOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopowners")
@CrossOrigin(origins = "http://localhost:3000")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService service;

    @GetMapping
    public List<ShopOwner> getAll() {
        return service.getAllShopOwners();
    }

    @GetMapping("/{id}")
    public ShopOwner getById(@PathVariable Long id) {
        return service.getShopOwnerById(id);
    }

    @PostMapping
    public ShopOwner save(@RequestBody ShopOwner owner) {
        return service.addShopOwner(owner);
    }

    @PutMapping("/{id}")
    public ShopOwner update(@PathVariable Long id,
                            @RequestBody ShopOwner owner) {

        return service.updateShopOwner(id, owner);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteShopOwner(id);
    }
}