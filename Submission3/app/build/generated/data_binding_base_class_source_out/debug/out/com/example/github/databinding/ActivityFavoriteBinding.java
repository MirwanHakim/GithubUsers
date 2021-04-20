// Generated by view binder compiler. Do not edit!
package com.example.github.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.github.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFavoriteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar progressBarFavorite;

  @NonNull
  public final RecyclerView recyclerViewFavorite;

  private ActivityFavoriteBinding(@NonNull RelativeLayout rootView,
      @NonNull ProgressBar progressBarFavorite, @NonNull RecyclerView recyclerViewFavorite) {
    this.rootView = rootView;
    this.progressBarFavorite = progressBarFavorite;
    this.recyclerViewFavorite = recyclerViewFavorite;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBarFavorite;
      ProgressBar progressBarFavorite = rootView.findViewById(id);
      if (progressBarFavorite == null) {
        break missingId;
      }

      id = R.id.recyclerViewFavorite;
      RecyclerView recyclerViewFavorite = rootView.findViewById(id);
      if (recyclerViewFavorite == null) {
        break missingId;
      }

      return new ActivityFavoriteBinding((RelativeLayout) rootView, progressBarFavorite,
          recyclerViewFavorite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
