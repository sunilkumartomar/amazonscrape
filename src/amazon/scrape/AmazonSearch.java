package amazon.scrape;

import amazon.scrape.dao.MysqlDB;
import amazon.scrape.model.Search;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;

public class AmazonSearch {

    public static void main(String[] args) throws IOException {
        MysqlDB db = new MysqlDB();
        Search searchObj = new Search();

        String scrapeUrl = "https://www.amazon.in/s?k=dove&ref=nb_sb_noss";
        // ResultSet rs=db.check("select * from input_sku");
        Document document = Jsoup.connect(scrapeUrl).get();

        if (document.toString().contains("MAIN-SEARCH_RESULTS")) {
            String fileName = "D:\\Sunil Tomar\\Htmls";

            File myFile = new File(fileName);
            FileWriter fw=new FileWriter(myFile);

            System.out.println(document);
            Elements linkBunch = document.select("div[class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col sg-col-4-of-20']");
               /*  String description = document.select("meta[name=description]")
                .first().attr("content");*/

            for (Element links : linkBunch) {
                System.out.println(links);
                String url = links.attr("img[src]");
            }
        }
    }

}

