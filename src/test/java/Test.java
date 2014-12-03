import com.application.ApplicationWebApp;
import com.purchase.DelegatePurchaseWebApp;
import com.purchase.PurchaseTemplateWebApp;
import com.purchase.hotel.HotelPurchaseWebApp;
import com.sun.java.util.jar.pack.*;
import java.lang.Package;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * Created by Admin on 07.11.14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class Test {

    @Autowired
    private HotelPurchaseWebApp hotelPurchaseWebApp;

    @Autowired
    private ApplicationWebApp applicationWebApp;

    @Autowired
    private DelegatePurchaseWebApp modelWebApp;

    @org.junit.Test
    public void FirstTest() {

        applicationWebApp.loadApplication();
        modelWebApp.setVertical("hotel");
        modelWebApp.makeSearch();

        //- - - - -REFLECTION PATTERN - - - - - -  -
//        try {
//            Class hotel = Class.forName("com.purchase.hotel.HotelPurchaseWebApp");
//            hotel.getMethod("verifyResultPage", null).invoke(hotel.newInstance(), null);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        applicationWebApp.loadApplication();
        modelWebApp.setVertical("car");
        modelWebApp.makeSearch();


    }
}
