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


public class ClickImpl extends HookImpl{


    @Step({"Al butonuna varsa tikla"})
    public void existClickByKey() {
        MobileElement el3 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        el3.click();
    }

    @Step({"Tek Yön Uçuş seç"})
    public void oneWay(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        el1.click();
    }

    @Step({"kalkış yeri seç"})
    public void selectDeparture(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
        el1.click();
    }

    @Step({"Kişi sayısını <key> artır"})
    public void numberOfPassengers(int key){
        MobileElement els9 = (MobileElement)driver.findElementByXPath("//*[@class='android.widget.TextView' and @bounds='[925,1040][1079,1194]']");
        for (int i = 0; i < key; i++){
            els9.click();
        }

    }
    @Step({"Uçuş ara"})
    public void searchFlight(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el1.click();
    }

    @Step({"Ekonomik Uçuş seç"})
    public void selectEcoFly(){
        List<MobileElement> els1 = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(els1.size());
        els1.get(randomNumber).click();

        List<MobileElement> els2 = (List<MobileElement>) driver.findElementsByXPath("//*[@class=\"android.widget.LinearLayout\"]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
        els2.get(0).click();
    }

    @Step({"Devam Butonuna tıklanır"})
    public void pressContinue(){
        MobileElement el1 = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el1.click();
    }

}
