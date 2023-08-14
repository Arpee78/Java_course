package stringmethods.url;

import java.util.ArrayList;
import java.util.List;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        findProtocolInURL(url);
        findPortInURL(url);
        findHostInURL(url);
        findPathInURL(url);
        findQueryInURL(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        boolean hasKey = false;
        String[] queries = getQuery().split("&");
        for (String query : queries) {
            String[] keyValue = query.split("=");
            if (keyValue[0].equals(key) ){
                hasKey = true;
            }
        }
        return hasKey;
    }

    public String getProperty(String key) {
        String value = null;

        if (!hasProperty(key)) {
            return value;
        }

        String[] queries = getQuery().split("&");
        for (String query : queries) {
            String[] keyValue = query.split("=");
            if (keyValue[0].equals(key) ){
                value = keyValue[1];
            }
        }
        return value;
    }

    private void findProtocolInURL(String url) {
        protocol = url.substring(0, url.indexOf(":")).toLowerCase();
    }

    private void findPortInURL(String url) {
        String portStr = url.substring(protocol.length() + 3);
        portStr = portStr.split("/")[0];
        portStr = portStr.split("\\?")[0];
        if (portStr.contains(":")) {
            port = Integer.parseInt(portStr.split(":")[1]);
        }
    }

    private void findHostInURL(String url) {
        host = url.substring(protocol.length() + 3);
        host = host.split(":")[0];
        host = host.split("/")[0];
        host = host.split("\\?")[0].toLowerCase();
    }

    private void findPathInURL(String url) {
        path = "";
        int startPos = url.indexOf("/", protocol.length() + 3);
        if (startPos >= 0) {
            path = url.substring(startPos + 1);
            path = path.split("\\?")[0];
        }
    }

    private void findQueryInURL(String url) {
        query = "";
        if (url.contains("?")) {
            query = url.split("\\?")[1];
        }
    }

}
