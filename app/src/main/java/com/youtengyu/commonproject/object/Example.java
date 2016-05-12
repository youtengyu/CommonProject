
package com.youtengyu.commonproject.object;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Example {

    @SerializedName("GetLinkURLRep")
    @Expose
    private GetLinkURLRep GetLinkURLRep;
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * 
     * @return
     *     The GetLinkURLRep
     */
    public GetLinkURLRep getGetLinkURLRep() {
        return GetLinkURLRep;
    }

    /**
     * 
     * @param GetLinkURLRep
     *     The GetLinkURLRep
     */
    public void setGetLinkURLRep(GetLinkURLRep GetLinkURLRep) {
        this.GetLinkURLRep = GetLinkURLRep;
    }

    /**
     * 
     * @return
     *     The ErrorMessage
     */
    public String getErrorMessage() {
        return ErrorMessage;
    }

    /**
     * 
     * @param ErrorMessage
     *     The ErrorMessage
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

}
