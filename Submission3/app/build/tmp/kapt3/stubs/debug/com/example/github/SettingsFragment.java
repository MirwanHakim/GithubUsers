package com.example.github;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0017J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0017J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\b\u0010\u001a\u001a\u00020\fH\u0002R\u0018\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083.\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/github/SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "alarmReceiver", "Lcom/example/github/AlarmReceiver;", "getAlarmReceiver$annotations", "reminder", "", "reminderPreference", "Landroidx/preference/SwitchPreferenceCompat;", "init", "", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onPause", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "setReminder", "state", "", "setSummaries", "app_debug"})
public final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private androidx.preference.SwitchPreferenceCompat reminderPreference;
    private java.lang.String reminder;
    private com.example.github.AlarmReceiver alarmReceiver;
    private java.util.HashMap _$_findViewCache;
    
    @kotlinx.coroutines.InternalCoroutinesApi()
    @java.lang.Deprecated()
    private static void getAlarmReceiver$annotations() {
    }
    
    @kotlinx.coroutines.InternalCoroutinesApi()
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    java.lang.String rootKey) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @kotlinx.coroutines.InternalCoroutinesApi()
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    private final void init() {
    }
    
    @kotlinx.coroutines.InternalCoroutinesApi()
    private final void setReminder(boolean state) {
    }
    
    private final void setSummaries() {
    }
    
    public SettingsFragment() {
        super();
    }
}