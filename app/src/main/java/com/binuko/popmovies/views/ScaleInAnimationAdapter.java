package com.binuko.popmovies.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Angger Binuko on 5/10/2016.
 */

public class ScaleInAnimationAdapter extends AnimationAdapter {

    private static final float DEFAULT_SCALE_FROM = .8f;
    private final float mFrom;

    public ScaleInAnimationAdapter(RecyclerView.Adapter adapter) {
        this(adapter, DEFAULT_SCALE_FROM);
    }

    public ScaleInAnimationAdapter(RecyclerView.Adapter adapter, float from) {
        super(adapter);
        mFrom = from;
    }

    @Override protected Animator[] getAnimators(View view) {
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", mFrom, 1f);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", mFrom, 1f);
        return new ObjectAnimator[] { scaleX, scaleY };
    }
}
