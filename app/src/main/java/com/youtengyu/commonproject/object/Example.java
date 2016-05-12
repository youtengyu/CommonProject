
package com.youtengyu.commonproject.object;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("LockCardInboundListReps")
    @Expose
    private List<LockCardInboundListRep> LockCardInboundListReps = new ArrayList<LockCardInboundListRep>();
    @SerializedName("IsLive")
    @Expose
    private String IsLive;
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * 
     * @return
     *     The LockCardInboundListReps
     */
    public List<LockCardInboundListRep> getLockCardInboundListReps() {
        return LockCardInboundListReps;
    }

    /**
     * 
     * @param LockCardInboundListReps
     *     The LockCardInboundListReps
     */
    public void setLockCardInboundListReps(List<LockCardInboundListRep> LockCardInboundListReps) {
        this.LockCardInboundListReps = LockCardInboundListReps;
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
