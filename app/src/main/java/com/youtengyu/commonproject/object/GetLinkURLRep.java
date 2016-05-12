
package com.youtengyu.commonproject.object;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class GetLinkURLRep {

    @SerializedName("linkURL")
    @Expose
    private String linkURL;
    @SerializedName("androidURL")
    @Expose
    private String androidURL;
    @SerializedName("iosURL")
    @Expose
    private String iosURL;
    @SerializedName("isTrackingLog")
    @Expose
    private String isTrackingLog;
    @SerializedName("isErrorLog")
    @Expose
    private String isErrorLog;

    /**
     * 
     * @return
     *     The linkURL
     */
    public String getLinkURL() {
        return linkURL;
    }

    /**
     * 
     * @param linkURL
     *     The linkURL
     */
    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    /**
     * 
     * @return
     *     The androidURL
     */
    public String getAndroidURL() {
        return androidURL;
    }

    /**
     * 
     * @param androidURL
     *     The androidURL
     */
    public void setAndroidURL(String androidURL) {
        this.androidURL = androidURL;
    }

    /**
     * 
     * @return
     *     The iosURL
     */
    public String getIosURL() {
        return iosURL;
    }

    /**
     * 
     * @param iosURL
     *     The iosURL
     */
    public void setIosURL(String iosURL) {
        this.iosURL = iosURL;
    }

    /**
     * 
     * @return
     *     The isTrackingLog
     */
    public String getIsTrackingLog() {
        return isTrackingLog;
    }

    /**
     * 
     * @param isTrackingLog
     *     The isTrackingLog
     */
    public void setIsTrackingLog(String isTrackingLog) {
        this.isTrackingLog = isTrackingLog;
    }

    /**
     * 
     * @return
     *     The isErrorLog
     */
    public String getIsErrorLog() {
        return isErrorLog;
    }

    /**
     * 
     * @param isErrorLog
     *     The isErrorLog
     */
    public void setIsErrorLog(String isErrorLog) {
        this.isErrorLog = isErrorLog;
    }

}
