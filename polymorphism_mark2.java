interface SearchEngine {
    void search();
}
class GoogleEngine implements SearchEngine {
    @Override
    public void search() {
        System.out.println("search on google");
    }
}
class YandexEngine implements SearchEngine {
    @Override
    public void search() {
        System.out.println("search on yandex");
    }
}
public class Main {
    public static void main(String[] args) {
        GoogleEngine google = new GoogleEngine();
        YandexEngine yandex = new YandexEngine();
        searchOn(google);   // print "search on google"
        searchOn(yandex);   // print "search on yandex"
    }   
    private static void searchOn(SearchEngine engine) {
        engine.search();       
    }
}
