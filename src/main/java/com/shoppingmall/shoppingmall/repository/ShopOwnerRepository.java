package com.shoppingmall.shoppingmall.repository;

import com.shoppingmall.shoppingmall.entity.ShopOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopOwnerRepository extends JpaRepository<ShopOwner, Long> {

    ShopOwner findByEmail(String email);

}