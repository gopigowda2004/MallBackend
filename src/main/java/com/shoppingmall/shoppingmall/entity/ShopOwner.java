package com.shoppingmall.shoppingmall.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shop_owners")
public class ShopOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    @Column(nullable = false)
    private String ownerName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String shopName;

    private String shopCategory;

    private String shopLocation;

    @Column(nullable = false)
    private boolean active = true;

    public ShopOwner() {
    }

    public ShopOwner(Long ownerId, String ownerName, String email, String phone,
                     String password, String shopName, String shopCategory,
                     String shopLocation, boolean active) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.shopName = shopName;
        this.shopCategory = shopCategory;
        this.shopLocation = shopLocation;
        this.active = active;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}