package com.example.github.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/github/helper/FavoriteHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "close", "", "deleteById", "", "id", "", "insert", "", "values", "Landroid/content/ContentValues;", "open", "queryAll", "Landroid/database/Cursor;", "queryByUsername", "username", "update", "Companion", "app_debug"})
public final class FavoriteHelper {
    private static final java.lang.String DATABASE_TABLE = "favorite_user";
    private static com.example.github.helper.DatabaseHelper databaseHelper;
    private static com.example.github.helper.FavoriteHelper INSTANCE;
    private static android.database.sqlite.SQLiteDatabase database;
    public static final com.example.github.helper.FavoriteHelper.Companion Companion = null;
    
    public final void open() throws android.database.SQLException {
    }
    
    public final void close() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor queryAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor queryByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final long insert(@org.jetbrains.annotations.Nullable()
    android.content.ContentValues values) {
        return 0L;
    }
    
    public final int update(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values) {
        return 0;
    }
    
    public final int deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return 0;
    }
    
    public FavoriteHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/github/helper/FavoriteHelper$Companion;", "", "()V", "DATABASE_TABLE", "", "INSTANCE", "Lcom/example/github/helper/FavoriteHelper;", "database", "Landroid/database/sqlite/SQLiteDatabase;", "databaseHelper", "Lcom/example/github/helper/DatabaseHelper;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.github.helper.FavoriteHelper getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}