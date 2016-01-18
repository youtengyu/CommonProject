package com.youtengyu.commonproject.db.databaseHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.youtengyu.commonproject.db.model.User;

import java.sql.SQLException;

/**
 * 資料庫的 DatabaseHelper
 * Created by Yellow on 2015/12/18.
 */
public class UserDatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String TABLE_NAME = "sqlite-test.db";

    private final static int databaseVersion = 1;

    /**
     * userDao 每張表對應一個，若有其他的資料表就需額外新增
     */
    private Dao<User, Integer> userDao;

    private UserDatabaseHelper(Context context)
    {
        super(context, TABLE_NAME, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try
        {
            TableUtils.createTable(connectionSource, User.class);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try
        {
            TableUtils.dropTable(connectionSource, User.class, true);

            onCreate(database, connectionSource);

            if( newVersion > oldVersion ){
                database.beginTransaction();
                switch (oldVersion){
                    case 1:
                    case 2:
//                        getCityDao().executeRaw("ALTER TABLE `city` ADD COLUMN area ;");
                    case 3:



                }
                database.setTransactionSuccessful();
                database.endTransaction();
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }



    private static UserDatabaseHelper instance;

    /**
     * 单例获取该Helper
     *
     * @param context
     * @return
     */
    public static synchronized UserDatabaseHelper getHelper(Context context)
    {
        if (instance == null)
        {
            synchronized (UserDatabaseHelper.class)
            {
                if (instance == null)
                    instance = new UserDatabaseHelper(context);
            }
        }

        return instance;
    }

    /**
     * 获得userDao
     *
     * @return
     * @throws SQLException
     */
    public Dao<User, Integer> getUserDao() throws SQLException
    {
        if (userDao == null)
        {
            userDao = getDao(User.class);
        }
        return userDao;
    }

    /**
     * 释放资源
     */
    @Override
    public void close()
    {
        super.close();
        userDao = null;
    }
}
