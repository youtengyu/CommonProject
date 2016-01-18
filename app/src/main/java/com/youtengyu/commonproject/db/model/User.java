package com.youtengyu.commonproject.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * http://ormlite.com/javadoc/ormlite-core/doc-files/ormlite_2.html#DAO-Enabled-Objects
 * Created by Yellow on 2015/12/18.
 */

@DatabaseTable(tableName = "user")
public class User {

    static public final String User_Name = "name";

    static public final String User_Age = "age";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = User_Name)
    private String name;
    @DatabaseField(columnName = User_Age)
    private int age;

    public User(){

    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


}
