package com.youtengyu.commonproject.db.dbDAO;

import android.content.Context;
import android.util.Log;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.youtengyu.commonproject.db.databaseHelper.UserDatabaseHelper;
import com.youtengyu.commonproject.db.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * http://ormlite.com/javadoc/ormlite-core/doc-files/ormlite_3.html#Statement-Builder
 * Created by Yellow on 2015/12/18.
 */
public class UserDAO {

    static public Dao.CreateOrUpdateStatus addUser(Context context,User user){
        UserDatabaseHelper helper = UserDatabaseHelper.getHelper(context);
        try
        {

            return helper.getUserDao().createOrUpdate(user);

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    static public int deleteUser(Context context)
    {
        UserDatabaseHelper helper = UserDatabaseHelper.getHelper(context);
        try
        {
            return helper.getUserDao().deleteById(2);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return 0;
    }

    static public int updateUser(Context context)
    {
        UserDatabaseHelper helper = UserDatabaseHelper.getHelper(context);
        try
        {
            User u1 = new User("zhy-android",10);
            u1.setId(1);
           return helper.getUserDao().update(u1);

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return 0;
    }

    static public List<User> queryList(Context context)
    {
        UserDatabaseHelper helper = UserDatabaseHelper.getHelper(context);
        try
        {
//            return helper.getUserDao().queryForAll();
            QueryBuilder<User, Integer> queryBuilder =
                    helper.getUserDao().queryBuilder();
            queryBuilder.where().gt(User.User_Age,50).and().lt(User.User_Age,60);
            //輸出SQL語法
            Log.e("Query", "SQL Command:" + queryBuilder.prepare().getStatement());
            return helper.getUserDao().query(queryBuilder.prepare());
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
