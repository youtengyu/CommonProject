package com.youtengyu.commonproject.apiDAO;

/**
 * 系統的API
 * Created by RD2-3 on 2015/7/24.
 */
public class SystemAPIDAO {
//    /**
//     * 更新DeviceID 取得USR_AppDeviceInfo_ID
//     * @param context
//     * @param responListener
//     * @param errorListener
//     * @param APP_Version
//     */
//    public static void AppDeviceInfo(Context context, Response.Listener<JSONObject> responListener,
//            Response.ErrorListener errorListener,
//            String APP_Version) {
//        String urlString= DBConnector.IPDomen+DBConnector.AppDeviceInfo;
//        final JSONObject jsonObject = new JSONObject();
//
//        try {
//            jsonObject.put("SYS_DeviceType_ID", "1");//[裝置類型 1:Android、2:IOS、3:WEB]
//            jsonObject.put("Device_Version", Build.VERSION.RELEASE);
//            jsonObject.put("APP_Version", APP_Version);
//            jsonObject.put("USR_AccountInfo_ID", MemberInfo.getInstance().getUSR_AccountInfo_ID(context));
//            jsonObject.put("DeviceID", MemberInfo.getInstance().getDeviceID(context));
//            jsonObject.put("USR_MemberInfo_ID", MemberInfo.getInstance().getAccount_Key(context));
//            jsonObject.put("USR_AppDeviceInfo_ID",MemberInfo.getInstance().getUSR_AppDeviceInfo_ID(context));
//        }catch (Exception e){
//
//        }
//        RequestDAO.getJsonRequest(context, urlString, responListener, errorListener, jsonObject);
//    }
//
//    /**
//     * 檢測版本號
//     * @param context
//     * @param responListener
//     * @param errorListener
//     * @param APP_Version
//     */
//    public static void CheckVersion(Context context, Response.Listener<JSONObject> responListener,
//            Response.ErrorListener errorListener,
//            String APP_Version) {
//        String urlString=DBConnector.IPDomen+DBConnector.CheckVersion;
//        final JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("DeviceType", "1");
//            jsonObject.put("AppVersion", APP_Version);
//        }catch (Exception e){
//
//        }
//        RequestDAO.getJsonRequest(context, urlString, responListener, errorListener, jsonObject);
//    }
//
//    /**
//     * 推播設定List
//     * @param context
//     * @param responListener
//     * @param errorListener
//     */
//    public static void DeviceAlertSettingList(final Context context,Response.Listener<JSONObject> responListener ,
//                                            Response.ErrorListener errorListener) {
//        String urlString=DBConnector.IPDomen+DBConnector.DeviceAlertSettingList;
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("USR_AccountInfo_ID", MemberInfo.getInstance().getUSR_AccountInfo_ID(context));
//            jsonObject.put("DeviceID", MemberInfo.getInstance().getDeviceID(context));
//            jsonObject.put("USR_MemberInfo_ID", MemberInfo.getInstance().getAccount_Key(context));
//            jsonObject.put("USR_AppDeviceInfo_ID",MemberInfo.getInstance().getUSR_AppDeviceInfo_ID(context));
//        }catch (Exception e){
//
//        }
//        RequestDAO.getJsonRequest(context, urlString, responListener, errorListener, jsonObject);
//    }
//
//    /**
//     * 設定推播設定
//     * @param context
//     * @param iFunctionListener
//     * @param errorListener
//     * @param ActionType
//     */
//    public static void DeviceAlertSetting(final Context context, final FunctionSettingAdapter.IFunctionListener iFunctionListener,
//                                            Response.ErrorListener errorListener,String ActionType) {
//        String urlString=DBConnector.IPDomen+DBConnector.DeviceAlertSetting;
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("ActionType", ActionType);
//            jsonObject.put("USR_AccountInfo_ID", MemberInfo.getInstance().getUSR_AccountInfo_ID(context));
//            jsonObject.put("DeviceID", MemberInfo.getInstance().getDeviceID(context));
//            jsonObject.put("USR_MemberInfo_ID", MemberInfo.getInstance().getAccount_Key(context));
//            jsonObject.put("USR_AppDeviceInfo_ID",MemberInfo.getInstance().getUSR_AppDeviceInfo_ID(context));
//        }catch (Exception e){
//
//        }
//        Response.Listener<JSONObject> DeviceAlertSettingResponListener = new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                if(ToolsVolleyResponseCheck.isCheckState(context, response, true)){
//                    return;
//                }
//                iFunctionListener.updateDeviceAlertSetting();
//            }
//        };
//        RequestDAO.getJsonRequest(context, urlString, DeviceAlertSettingResponListener, errorListener, jsonObject);
//    }
//
//    /**
//     * 取得現在API伺服器時間
//     * @param context
//     * @param responListener
//     * @param errorListener
//     */
//    public static void ServerNowDateTime(final Context context,Response.Listener<JSONObject> responListener ,
//                                              Response.ErrorListener errorListener) {
//        String urlString=DBConnector.IPDomen+DBConnector.ServerNowDateTime;
//        JSONObject jsonObject = new JSONObject();
//
//        RequestDAO.getJsonRequest(context, urlString, responListener, errorListener, jsonObject);
//    }
//
//    /**
//     * 側選單外部連結
//     * @param context
//     */
//    public static void OutletURL(final Context context) {
//        String urlString=DBConnector.IPDomen+DBConnector.OutletURL;
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("DeviceType", "1");
//            jsonObject.put("USR_AccountInfo_ID", MemberInfo.getInstance().getUSR_AccountInfo_ID(context));
//            jsonObject.put("DeviceID", MemberInfo.getInstance().getDeviceID(context));
//            jsonObject.put("USR_MemberInfo_ID", MemberInfo.getInstance().getAccount_Key(context));
//            jsonObject.put("USR_AppDeviceInfo_ID",MemberInfo.getInstance().getUSR_AppDeviceInfo_ID(context));
//        }catch (Exception e){
//
//        }
//        Response.Listener<JSONObject> DeviceAlertSettingResponListener = new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                if(ToolsVolleyResponseCheck.isCheckState(context, response, false)){
//                    return;
//                }
//            OutLetURL.ShareRecommend = response.optString("ShareRecommend");
//            OutLetURL.ProposalCooperation = response.optString("ProposalCooperation");
//            OutLetURL.Score = response.optString("Score");
//            OutLetURL.LoginStore = response.optString("LoginStore");
//                OutLetURL.FeedBack = response.optString("FeedBack");
//            }
//        };
//        RequestDAO.getJsonRequest(context, urlString, DeviceAlertSettingResponListener, null, jsonObject);
//    }


}
