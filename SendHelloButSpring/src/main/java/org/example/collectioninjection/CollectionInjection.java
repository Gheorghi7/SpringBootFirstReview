package org.example.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private List documentList;
    private Set documentSet;
    private Map documentMap;
    private Properties properties;

    public List getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List documentList) {
        System.out.println("List: " + documentList);
        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        System.out.println("Set: " + documentSet);
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        System.out.println("Map: " + documentMap);
        this.documentMap = documentMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        System.out.println("Properties: " + properties);
        this.properties = properties;
    }
}
