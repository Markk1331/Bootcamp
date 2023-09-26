package com.horo.demohoroscope.model.crawler;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupCrawler {   

    public static String retrieveHoroscope(String url) {
        try {
            Document document = Jsoup.connect(url).get();
            Element horoscopeElement = document.select("p").first();
            
            if (horoscopeElement != null) {
                String horoscopeText = horoscopeElement.text();
                String[] lines = horoscopeText.split(" - ", 2);
                
                if (lines.length == 2) {
                    return lines[1].trim();
                } else {
                    return "Unable to retrieve horoscope.";
                }
            } else {
                return "Unable to retrieve horoscope.";
            }
        } catch (Exception e) {
            return "An error occurred: " + e.getMessage();
        }
    }
  
  public static void main(String[] args) {
       String url = "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=11";
        String zodaic = retrieveHoroscope(url);
        System.out.println(zodaic);
    }
}