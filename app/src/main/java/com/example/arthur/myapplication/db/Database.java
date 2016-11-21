package com.example.arthur.myapplication.db;

import android.provider.BaseColumns;

/**
 * Created by Arthur on 17/11/2016.
 */

public class Database {
    public static final String DB_NAME = "com.example.arthur.myapplication.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}
