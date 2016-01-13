package com.youtengyu.commonproject.tools;


/**
 * @author RD2-3
 *
 */
public class ToolsAppVersion {
    /**APP現在要上線的版本*/
    private final static int NOW_APP_VERSION=0;

    /**
     * 第一階段
     */
    public final static int APP_VERSION_1=1;
    /**
     * 第二階段
     */
    public final static int APP_VERSION_2=2;
    /**
     * 第三階段
     */
    public final static int APP_VERSION_3=3;

    /**
     * 確認版本是否可以使用，若 = 0就全開
     * @param version
     * @return
     */
    public static boolean isCanOpen(int version){
        if(NOW_APP_VERSION>=version || NOW_APP_VERSION==0){
            return true;
        }
        return false;
    }
}
