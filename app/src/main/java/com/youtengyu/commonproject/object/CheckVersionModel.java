
package com.youtengyu.commonproject.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CheckVersionModel {

    @SerializedName("IsMaintain")
    @Expose
    private String IsMaintain;
    @SerializedName("IsNeedToUpdateAPPVersion")
    @Expose
    private String IsNeedToUpdateAPPVersion;
    @SerializedName("IsLive")
    @Expose
    private String IsLive;
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * 
     * @return
     *     The IsMaintain
     */
    public String getIsMaintain() {
        return IsMaintain;
    }

    /**
     * 
     * @param IsMaintain
     *     The IsMaintain
     */
    public void setIsMaintain(String IsMaintain) {
        this.IsMaintain = IsMaintain;
    }

    /**
     * 
     * @return
     *     The IsNeedToUpdateAPPVersion
     */
    public String getIsNeedToUpdateAPPVersion() {
        return IsNeedToUpdateAPPVersion;
    }

    /**
     * 
     * @param IsNeedToUpdateAPPVersion
     *     The IsNeedToUpdateAPPVersion
     */
    public void setIsNeedToUpdateAPPVersion(String IsNeedToUpdateAPPVersion) {
        this.IsNeedToUpdateAPPVersion = IsNeedToUpdateAPPVersion;
    }

    /**
     * 
     * @return
     *     The IsLive
     */
    public String getIsLive() {
        return IsLive;
    }

    /**
     * 
     * @param IsLive
     *     The IsLive
     */
    public void setIsLive(String IsLive) {
        this.IsLive = IsLive;
    }

    /**
     * 
     * @return
     *     The ErrorMsg
     */
    public String getErrorMsg() {
        return ErrorMsg;
    }

    /**
     * 
     * @param ErrorMsg
     *     The ErrorMsg
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

}
