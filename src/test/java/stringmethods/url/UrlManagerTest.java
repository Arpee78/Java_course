package stringmethods.url;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlManagerTest {

    UrlManager urlFull;

    @BeforeEach
    void setUp() {
        urlFull = new UrlManager("https://earthquake.usgs.gov:8080/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
    }

    @Test
    void getProtocol() {
        assertEquals("https",urlFull.getProtocol());
    }

    @Test
    void getPort() {
        assertEquals(8080,urlFull.getPort());
        UrlManager urlWithOutPort = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        assertEquals(null,urlWithOutPort.getPort());
    }

    @Test
    void getHost() {
        assertEquals("earthquake.usgs.gov",urlFull.getHost());
    }

    @Test
    void getPath() {
        assertEquals("fdsnws/event/1/query",urlFull.getPath());
        UrlManager urlWithOutPath = new UrlManager("https://earthquake.usgs.gov?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        assertEquals("",urlWithOutPath.getPath());
    }

    @Test
    void getQuery() {
        assertEquals("format=geojson&starttime=2014-01-01&endtime=2014-01-02",urlFull.getQuery());
        UrlManager urlWithOutQuery = new UrlManager("https://earthquake.usgs.gov:8080/fdsnws/event/1/query");
        assertEquals("",urlWithOutQuery.getQuery());
    }

    @Test
    void hasProperty() {
        assertEquals(true,urlFull.hasProperty("format"));
        assertEquals(false,urlFull.hasProperty("time"));
        UrlManager urlWithOutQuery = new UrlManager("https://earthquake.usgs.gov:8080/fdsnws/event/1/query");
        assertEquals(false,urlWithOutQuery.hasProperty("format"));

    }

    @Test
    void getProperty() {
        assertEquals("geojson",urlFull.getProperty("format"));
        UrlManager urlWithOutQuery = new UrlManager("https://earthquake.usgs.gov:8080/fdsnws/event/1/query");
        assertEquals(null,urlWithOutQuery.getProperty("geojson"));
    }
}