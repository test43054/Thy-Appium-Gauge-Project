package com.thy;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.util.List;
import java.util.Random;


public class StepImpl extends HookImpl{


    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Step({"Kalkış yerini <key> olarak seç"})
    public void sendKey(String key){
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys(key);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el1.click();

    }

    @Step({"Varış yerini <key> olarak seç"})
    public void sendArrival(String key){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_llTo");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys("ESB");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();
    }
    @Step({"Tarih seç"})
    public void selectDate(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_rlDeparture");
        el1.click();
        List<MobileElement> els7 = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.view.ViewGroup\"]/android.view.ViewGroup/android.widget.FrameLayout");
        els7.get(0).isSelected();
        int index = 0;
        for (MobileElement element: els7) {
            if (element.isSelected()){
                index = els7.indexOf(element) + 2;
            }
        }
        els7.get(index).click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el2.click();
    }

    @Step({"Uçuş liste kontrol"})
    public void listControl(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");
        Assert.assertTrue(el1.isDisplayed());
    }








}
