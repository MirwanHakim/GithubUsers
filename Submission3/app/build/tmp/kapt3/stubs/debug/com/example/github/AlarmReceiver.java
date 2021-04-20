package com.example.github;

import java.lang.System;

@kotlinx.coroutines.InternalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/github/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "cancelAlarm", "", "context", "Landroid/content/Context;", "onReceive", "intent", "Landroid/content/Intent;", "setNotification", "setRepeatingAlarm", "Companion", "app_debug"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    private static final int REPEATING_ID = 101;
    public static final com.example.github.AlarmReceiver.Companion Companion = null;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void setNotification(android.content.Context context) {
    }
    
    public final void setRepeatingAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void cancelAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public AlarmReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/github/AlarmReceiver$Companion;", "", "()V", "REPEATING_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}