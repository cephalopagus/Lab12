package com.company.classes;


import com.company.interfaces.Add;
import com.company.interfaces.Change;

import java.util.List;

public class Sales implements Add, Change {
    List<Products> saleList;


    public Sales(List<Products> saleList) {
        this.saleList = saleList;
    }

    public List<Products> getSaleList() {
        return saleList;
    }

    @Override
    public void change(int num, int price) {
        Products products = saleList.get(num+1);
        products.setPrice(price);

    }

    @Override
    public void add(Products products) {
        saleList.add(products);
    }
}
