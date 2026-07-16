package com.shoppingmall.shoppingmall.service;

import com.shoppingmall.shoppingmall.entity.ShopOwner;
import com.shoppingmall.shoppingmall.repository.ShopOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository repository;

    public List<ShopOwner> getAllShopOwners() {
        return repository.findAll();
    }

    public ShopOwner getShopOwnerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ShopOwner addShopOwner(ShopOwner owner) {
        return repository.save(owner);
    }

    public ShopOwner updateShopOwner(Long id, ShopOwner owner) {

        ShopOwner existing = repository.findById(id).orElse(null);

        if(existing != null) {
            existing.setOwnerName(owner.getOwnerName());
            existing.setEmail(owner.getEmail());
            existing.setPhone(owner.getPhone());
            existing.setPassword(owner.getPassword());
            existing.setShopName(owner.getShopName());
            existing.setShopCategory(owner.getShopCategory());
            existing.setShopLocation(owner.getShopLocation());
            existing.setActive(owner.isActive());

            return repository.save(existing);
        }

        return null;
    }

    public void deleteShopOwner(Long id) {
        repository.deleteById(id);
    }
}