package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdaptador extends FragmentStateAdapter {
    public VPAdaptador(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new MaterialsFragment();
            case 1: return new WeaponsFragment();
            default:return new WeaponsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
