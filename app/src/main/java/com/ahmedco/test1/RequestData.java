package com.ahmedco.test1;

public class RequestData {

    private String metaDBData;
    private String metaFileData;
    private String metaCloudData;


    public String getMetaDBData() {
        return metaDBData;
    }

    public void setMetaDBData(String metaDBData) {
        this.metaDBData = metaDBData;
    }
    public String getMetaFileData() {
        return metaFileData;
    }
    public void setMetaFileData(String metaFileData) {
        this.metaFileData = metaFileData;
    }
    public String getMetaCloudData() {
        return metaCloudData;
    }
    public void setMetaCloudData(String metaCloudData) {
        this.metaCloudData = metaCloudData;
    }


    @Override
    public String toString() {
        return "RequestData [metaDBData=" + metaDBData + ",\n " +
        "metaFileData=" + metaFileData + ",\n metaCloudData=" +
        metaCloudData + "]";
    }
}
