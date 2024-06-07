package org.example.proxy.cahce;

public class Main {
    public static void main(String[] args) {

        //cache test
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        IBrowser browser2 = new BrowserProxy("www.naver.com");
        browser2.show();
        browser2.show();
        browser2.show();
        browser2.show();


    }
}
