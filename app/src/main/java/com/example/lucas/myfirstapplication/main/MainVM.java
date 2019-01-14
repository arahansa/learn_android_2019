package com.example.lucas.myfirstapplication.main;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.design.widget.NavigationView;

import com.example.lucas.myfirstapplication.R;
import com.example.lucas.myfirstapplication.common.BaseViewModel;

import java.util.List;

public class MainVM extends BaseViewModel {
    ObservableBoolean isLogin = new ObservableBoolean();
    ObservableInt menuResId = new ObservableInt();

    @BindingAdapter("app:menu")
    public static void nvMenuSetting(NavigationView view, boolean login){
        if(login){
            view.inflateMenu(R.menu.drawermenulogin);
            return;
        }
        view.inflateMenu(R.menu.drawermenulogout);
    }

    public void setIsLogin(Boolean check) {

        this.isLogin.set(check);
    }

    public ObservableBoolean getIsLogin(){
        return isLogin;
    }

    public void setMenuResId(Boolean isLogin) {
        if(isLogin){
            this.menuResId.set(R.menu.drawermenulogin);
            return;
        }
        this.menuResId.set(R.menu.drawermenulogout);
    }

    public ObservableInt getMenuResId(){
        return menuResId;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
