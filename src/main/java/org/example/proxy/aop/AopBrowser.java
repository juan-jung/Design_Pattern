package org.example.proxy.aop;

import org.example.proxy.cahce.HTML;
import org.example.proxy.cahce.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private HTML html;
    private Runnable before;
    private  Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public HTML show() {
        before.run();

        if(html==null) {
            this.html = new HTML(url);
            System.out.println("AopBrowser html lodaing from : " + url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        after.run();

        System.out.println("AopBrowser html cache from : " + url);
        return null;
    }
}
