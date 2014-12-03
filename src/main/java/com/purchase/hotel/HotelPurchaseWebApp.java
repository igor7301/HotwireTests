package com.purchase.hotel;

import com.info.all.hotel.HotelInfo;
import com.hotwire.HomePage;
import com.purchase.AbstractPurchaseWebApp;
import com.purchase.PurchaseTemplateWebApp;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Admin on 07.11.14.
 */
public class HotelPurchaseWebApp extends PurchaseTemplateWebApp {

    @Autowired
    private HotelInfo hotelInfo;

    @Autowired
    private WebDriver webDriverInstance;

    public HotelPurchaseWebApp() {
        //System.out.println("HotelPurchaseWebApp constructor"); ;
    }

    @Override
    public void makeSearch() {
        HomePage homePage = new HomePage(webDriverInstance);
        homePage.setStartDate(hotelInfo.getStartDate());
        homePage.setEndDate(hotelInfo.getEndDate());
        homePage.setHotelLocation(hotelInfo.getLocation());
        homePage.startHotelSearch();
    }

    @Override
    public void verifyResultPage() {
        System.out.println("need to verify hotel result page");
    }
}
