package com.youtengyu.commonproject.tools;

public class ToolsStringToArray {
    /**
     * 字串轉陣列有取代空白
     * @param value
     * @return
     */
    public static String[] stringToArray(String value){
        return value.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "").split(",");
    }
    /**
     * 字串轉陣列不取代空白
     * @param value
     * @return
     */
    public static String[] stringToArrayNoReplaceSpace(String value){
        return value.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
    }
    
}
