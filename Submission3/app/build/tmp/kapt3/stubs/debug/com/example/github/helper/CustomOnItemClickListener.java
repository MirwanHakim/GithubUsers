package com.example.github.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/github/helper/CustomOnItemClickListener;", "Landroid/view/View$OnClickListener;", "position", "", "onItemClickCallback", "Lcom/example/github/helper/CustomOnItemClickListener$OnItemClickCallback;", "(ILcom/example/github/helper/CustomOnItemClickListener$OnItemClickCallback;)V", "onClick", "", "view", "Landroid/view/View;", "OnItemClickCallback", "app_debug"})
public final class CustomOnItemClickListener implements android.view.View.OnClickListener {
    private final int position = 0;
    private final com.example.github.helper.CustomOnItemClickListener.OnItemClickCallback onItemClickCallback = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public CustomOnItemClickListener(int position, @org.jetbrains.annotations.NotNull()
    com.example.github.helper.CustomOnItemClickListener.OnItemClickCallback onItemClickCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/github/helper/CustomOnItemClickListener$OnItemClickCallback;", "", "onItemClicked", "", "view", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface OnItemClickCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position);
    }
}