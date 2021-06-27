package amazon.scrape.model;

public class Search {
    int Id;
    String search;
    String sku;
    String URL;
    String URL1;
    String scrape_code;
    String url;
    String Product_url;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Search{" + "Id=" + Id + ", search='" + search + '\'' + ", sku='" + sku + '\'' + ", URL='" + URL + '\'' + ", URL1='" + URL1 + '\'' + ", scrape_code='" + scrape_code + '\'' + ", url='" + url + '\'' + ", Product_url='" + Product_url + '\'' + '}';
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL1() {
        return URL1;
    }

    public void setURL1(String URL1) {
        this.URL1 = URL1;
    }

    public String getScrape_code() {
        return scrape_code;
    }

    public void setScrape_code(String scrape_code) {
        this.scrape_code = scrape_code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProduct_url() {
        return Product_url;
    }

    public void setProduct_url(String product_url) {
        Product_url = product_url;
    }
}
