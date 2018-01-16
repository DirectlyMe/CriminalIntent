package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Jack on 1/4/18.
 */

public class ImageDialogFragment extends DialogFragment {

    private static final String BIT_MAP_IMAGE = "bitmap image";

    private ImageView mImageView;

    public static ImageDialogFragment newInstance(Bitmap image) {
        Bundle args = new Bundle();
        args.putParcelable(BIT_MAP_IMAGE, image);

        ImageDialogFragment fragment = new ImageDialogFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Bitmap image = getArguments().getParcelable(BIT_MAP_IMAGE);

        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.image_dialog_fragment, null);

        mImageView = (ImageView) v.findViewById(R.id.dialog_image_view);
        mImageView.setImageBitmap(image);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setView(v);

        return builder.create();


    }
}
