package com.rome.test;

import java.io.IOException;
import java.net.URL;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class RomeClass {

    private SyndFeed feed;
    
    public RomeClass() throws IllegalArgumentException, FeedException, IOException {
        String url = "https://news.google.com/atom";

        this.feed = new SyndFeedInput().build(new XmlReader(new URL(url)));
    }

    public RomeClass(String url) throws IllegalArgumentException, FeedException, IOException {
        this.feed = new SyndFeedInput().build(new XmlReader(new URL(url)));
    }

    public void printAttribute() {
        System.out.println(feed.getTitle());
    }

    public String stringAttribute() {
        return feed.getTitle();
    }

}
