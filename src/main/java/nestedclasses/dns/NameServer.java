package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public List<DnsEntry> getDnsEntries() {
        return new ArrayList<>(dnsEntries);
    }

    public void addEntry(String hostName, String hostIp) {
        if (testHostName(hostName) || testHostIp(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public String getIpByName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName)){
                return dnsEntry.hostIp;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(hostIp)){
                return dnsEntry.hostName;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public void removeEntryByName(String hostName) {
        DnsEntry dnsEntryToRemove = null;
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName)){
                dnsEntryToRemove = dnsEntry;
            }
        }
        if (dnsEntryToRemove!=null){
            dnsEntries.remove(dnsEntryToRemove);
        } else {
            throw new IllegalArgumentException("Element not found");
        }
    }

    public void removeEntryByIp(String hostIp) {
        DnsEntry dnsEntryToRemove = null;
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(hostIp)){
                dnsEntryToRemove = dnsEntry;
            }
        }
        if (dnsEntryToRemove!=null){
            dnsEntries.remove(dnsEntryToRemove);
        } else {
            throw new IllegalArgumentException("Element not found");
        }
    }

    public class DnsEntry {

        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }

    public boolean testHostName(String hostName) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostName.equals(hostName)) {
                return true;
            }
        }
        return false;
    }

    public boolean testHostIp(String hostIp) {
        for (DnsEntry dnsEntry : dnsEntries) {
            if (dnsEntry.hostIp.equals(hostIp)) {
                return true;
            }
        }
        return false;
    }
}
