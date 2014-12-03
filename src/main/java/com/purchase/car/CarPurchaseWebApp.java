package com.purchase.car;

import com.application.AbstractApplicationWebApp;
import com.purchase.AbstractPurchaseWebApp;
import com.purchase.PurchaseTemplateWebApp;

/**
 * Created by Admin on 08.11.14.
 */
public class CarPurchaseWebApp extends PurchaseTemplateWebApp {

    @Override
    public void makeSearch() {
        System.out.println("Car search method. Implement me!");
    }
}
