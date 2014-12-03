package com.purchase;

import com.purchase.car.CarPurchaseWebApp;
import com.purchase.hotel.HotelPurchaseWebApp;

/**
 * Created by Admin on 08.11.14.
 */
public class DelegatePurchaseWebApp extends AbstractPurchaseWebApp {
    private String vertical;

    private HotelPurchaseWebApp hotelPurchaseWebApp;
    private CarPurchaseWebApp carPurchaseWebApp;

    public HotelPurchaseWebApp getHotelPurchaseWebApp() {
        return hotelPurchaseWebApp;
    }

    public void setHotelPurchaseWebApp(HotelPurchaseWebApp hotelPurchaseWebApp) {
        this.hotelPurchaseWebApp = hotelPurchaseWebApp;
    }

    public CarPurchaseWebApp getCarPurchaseWebApp() {
        return carPurchaseWebApp;
    }

    public void setCarPurchaseWebApp(CarPurchaseWebApp carPurchaseWebApp) {
        this.carPurchaseWebApp = carPurchaseWebApp;
    }


    public void setVertical(String vertical) {
        this.vertical = vertical;
    }


    public String getVertical() {
         return vertical;
    }

    @Override
    public void makeSearch() {
        getModel().makeSearch();
    }

    @Override
    public void verifyResultPage() {
        getModel().verifyResultPage();
    }

    public AbstractPurchaseWebApp getModel() {

        if (getVertical().equals("hotel")) {
            return hotelPurchaseWebApp;
        }
        else if (getVertical().equals("car")) {
            return carPurchaseWebApp;
        }

        return null;
    }

}
