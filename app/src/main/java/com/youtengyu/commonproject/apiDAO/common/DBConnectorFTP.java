package com.youtengyu.commonproject.apiDAO.common;

/**
 * FTP連線資訊
 * Created by RD2-3 on 2015/6/24.
 */
public class DBConnectorFTP {
    /** 上傳圖片副檔名 */
    public final static String fileExtension = ".jpg";
    public final static int bufferSize = 512;
    /** 上傳FTP失敗字串 */
    public final static String result_Fault = "Fault";
    /** 上傳FTP程公字串 */
    public final static String result_OK = "OK";

    //---------------------正式---------------------------------
//	public static String FTP_URL = "175.99.87.134"; 	//正式
//	public static Integer FTP_PORT = 21; //正式
//	public static String FileDownloadDomain = "http://175.99.87.134:81/";// 	正式
//	public final static String FTP_ACCOUT = "xlive";
//	public final static String FTP_PWD = "22939355CFamily";
//	/**FTP的虛擬資料夾名稱*/
//    public final static String FilePathName="\\ManDan";
    //---------------------測試---------------------------------
    public final static String FTP_ACCOUT = "ManDan22939355";// 204
    public final static String FTP_PWD = "ManDanXlive22939355";//204
    public static Integer FTP_PORT = 25; //204
    public static String FileDownloadDomain = "http://192.168.10.204:8025/"; //204
    public static String FTP_URL = "192.168.10.204"; //204
    /**FTP的虛擬資料夾名稱*/
    public final static String FilePathName="";

}
