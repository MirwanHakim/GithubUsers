package com.example.github.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/github/db/DatabaseContract;", "", "()V", "Companion", "UserColums", "app_debug"})
public final class DatabaseContract {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORITY = "com.example.github";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCHEME = "content";
    public static final com.example.github.db.DatabaseContract.Companion Companion = null;
    
    public DatabaseContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/github/db/DatabaseContract$UserColums;", "Landroid/provider/BaseColumns;", "()V", "Companion", "app_debug"})
    public static final class UserColums implements android.provider.BaseColumns {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "favorite_user";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USERNAME = "username";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AVATAR_URL = "avatar_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROLE = "type";
        @org.jetbrains.annotations.NotNull()
        private static final android.net.Uri CONTENT_URI = null;
        public static final com.example.github.db.DatabaseContract.UserColums.Companion Companion = null;
        
        public UserColums() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/github/db/DatabaseContract$UserColums$Companion;", "", "()V", "AVATAR_URL", "", "CONTENT_URI", "Landroid/net/Uri;", "getCONTENT_URI", "()Landroid/net/Uri;", "ROLE", "TABLE_NAME", "USERNAME", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final android.net.Uri getCONTENT_URI() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/github/db/DatabaseContract$Companion;", "", "()V", "AUTHORITY", "", "SCHEME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}