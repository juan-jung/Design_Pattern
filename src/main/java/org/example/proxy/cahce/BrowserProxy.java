package org.example.proxy.cahce;

public class BrowserProxy implements IBrowser{

    private String url;
    private HTML html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public HTML show() {
        if(html==null) {
            this.html = new HTML(url);
            System.out.println("Browser Proxy loading html from : "+ url);
        }

        System.out.println("Boowser Proxy use cahce html : " + url);
        return html;
    }
}
