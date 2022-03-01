package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * @author prima elgania
 * @version $Id: ShrineAutomation.java, v 0.1 2022‐02‐25 13.38 $$
 */
public class ShrineAutomation {

    @Test
    public void SelectProduct() throws MalformedURLException, InterruptedException {
        System.out.println("Start Run Testcase : SelectProduct");
        AppiumConfig shrineAppium = new AppiumConfig(false);
        //swipe till get shrine
        shrineAppium.swipeLeft();
        Thread.sleep(3000);
        shrineAppium.clickByCoordinate();
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.9,0.8);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.1,0.05);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.5,0.4);
        Thread.sleep(3000);
        shrineAppium.swipeByCoordinate(0.9,0.5,0.05,0.5);
        Thread.sleep(3000);
        shrineAppium.swipeByCoordinate(0.9,0.5,0.05,0.5);
        Thread.sleep(3000);
        shrineAppium.swipeByCoordinate(0.9,0.5,0.05,0.5);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.7,0.5);
        //choose accessoris
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.1,0.05);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.5,0.3);
        Thread.sleep(3000);
        shrineAppium.swipeByCoordinate(0.9,0.5,0.7,0.5);
        //choose bag
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.7,0.6);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.95,0.95);
        Thread.sleep(3000);
        shrineAppium.clickByCoordinateWithInput(0.5,0.95);
        Thread.sleep(3000);
        System.out.println("Success Load");
    }

}
