package oop.encapsulation;

import JavaBasic.array.Day3;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Vector;

public class Product {
    private  int id;
    private String productName;
    private String uuid;
    private Double price;
    private String image;
    private String description;
    private LocalDateTime releasedDate;
    private LocalDateTime expiredDate;
    private Boolean isDeleted;
    private Boolean isNew;
    private Boolean isIncludedVat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(LocalDateTime releasedDate) {
        this.releasedDate = releasedDate;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getIncludedVat() {
        return isIncludedVat;
    }

    public void setIncludedVat(Boolean includedVat) {
        isIncludedVat = includedVat;
    }

    @Override
    public String toString() {
        return "================= Application of Product ===============" + '\n'+
                "Product of id    :" + id + '\n'+
                "productName      :" + productName + '\n' +
                "product of uuid  :" + uuid + '\n' +
                "Product of price :" + price + '$' + '\n'+
                "Product of image :" + image + '\n' +
                "Product of description :" + description + '\n' +
                "Product of releasedDate:" + releasedDate + '\n'+
                "Product of expiredDate :" + expiredDate +'\n'+
                "Product of isDeleted   :" + isDeleted +'\n'+
                "Product of isNew       :" + isNew + '\n'+
                "Product of isIncludedVat:" + isIncludedVat + '\n'+
                "========================================================";
    }



}
