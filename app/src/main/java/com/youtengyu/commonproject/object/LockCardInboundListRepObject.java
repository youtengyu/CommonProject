package com.youtengyu.commonproject.object;

/**
 * 門禁刷卡紀錄物件
 * Created by itc on 2016/3/14.
 */
public class LockCardInboundListRepObject {
    public String CST_CardInbound_ID;//鎖具刷卡紀錄ID
    public String LockName;//鎖具名稱
    public String ActionKindContent;//刷卡種類說明(遠端開鎖或現場開鎖)
    public String Content;//刷卡說明(遠端:XX人遠端刷卡 現場:XXX人使用卡片名稱)
    public String CreateDate;//建立時間

    public LockCardInboundListRepObject(String CST_CardInbound_ID, String LockName,
                                        String ActionKindContent, String Content, String CreateDate){
        this.CST_CardInbound_ID = CST_CardInbound_ID;
        this.LockName = LockName;
        this.ActionKindContent = ActionKindContent;
        this.Content = Content;
        this.CreateDate = CreateDate;
    }

    /**
     * 取得 鎖具刷卡紀錄ID
     * @return
     */
    public String getCST_CardInbound_ID(){
        return CST_CardInbound_ID;
    }
    /**
     * 取得 鎖具名稱
     * @return
     */
    public String getLockName(){
        return LockName;
    }
    /**
     * 取得 刷卡種類說明(遠端開鎖或現場開鎖)
     * @return
     */
    public String getActionKindContent(){
        return ActionKindContent;
    }
    /**
     * 取得 刷卡說明(遠端:XX人遠端刷卡 現場:XXX人使用卡片名稱)
     * @return
     */
    public String getContent(){
        return Content;
    }
    /**
     * 取得 建立時間
     * @return
     */
    public String getCreateDate(){
        return CreateDate;
    }

}
