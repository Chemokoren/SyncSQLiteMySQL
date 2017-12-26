package com.msomihub.synctest;

/**
 * Created by kibsoft on 12/24/17.
 */

public class DbContract {
    public static final int SYNC_STATUS_OK = 0;
    public static final int SYNC_STATUS_FAILED = 1;
    public static final String SERVER_URL = "http://10.0.2.2/syncdemo/syncinfo.php";
    public static final String UI_UPDATE_BROADCAST ="com.msomihub.synctest.uiupdatebroadcast";

    public static final String DATABASE_NAME ="contactdb";
    public static final String TABLE_NAME ="contactinfo";
    public static final String NAME ="name";
    public static final String SYNC_STATUS ="syncstatus";
}
