
package com.youtengyu.commonproject.object;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class LockCardInboundListRep {

    @SerializedName("CST_CardInbound_ID")
    @Expose
    private String CSTCardInboundID;
    @SerializedName("LockName")
    @Expose
    private String LockName;
    @SerializedName("ActionKindContent")
    @Expose
    private String ActionKindContent;
    @SerializedName("Content")
    @Expose
    private String Content;
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
     * 
     * @return
     *     The CSTCardInboundID
     */
    public String getCSTCardInboundID() {
        return CSTCardInboundID;
    }

    /**
     * 
     * @param CSTCardInboundID
     *     The CST_CardInbound_ID
     */
    public void setCSTCardInboundID(String CSTCardInboundID) {
        this.CSTCardInboundID = CSTCardInboundID;
    }

    /**
     * 
     * @return
     *     The LockName
     */
    public String getLockName() {
        return LockName;
    }

    /**
     * 
     * @param LockName
     *     The LockName
     */
    public void setLockName(String LockName) {
        this.LockName = LockName;
    }

    /**
     * 
     * @return
     *     The ActionKindContent
     */
    public String getActionKindContent() {
        return ActionKindContent;
    }

    /**
     * 
     * @param ActionKindContent
     *     The ActionKindContent
     */
    public void setActionKindContent(String ActionKindContent) {
        this.ActionKindContent = ActionKindContent;
    }

    /**
     * 
     * @return
     *     The Content
     */
    public String getContent() {
        return Content;
    }

    /**
     * 
     * @param Content
     *     The Content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * 
     * @return
     *     The CreateDate
     */
    public String getCreateDate() {
        return CreateDate;
    }

    /**
     * 
     * @param CreateDate
     *     The CreateDate
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

}
