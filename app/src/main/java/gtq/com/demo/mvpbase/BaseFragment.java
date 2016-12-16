package gtq.com.demo.mvpbase;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by guotengqian on 2016/12/15 14:39.
 * def
 */

public abstract class BaseFragment extends Fragment{

    protected Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initPresenter();
        if(getResLayoutId()!=0) {
            View view= inflater.inflate(getResLayoutId(), null);
            initView(view,savedInstanceState);
            return view;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     *@def [方法定义] 跳转页面
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    public void moveToNextPage(Class<Activity> activityClass,Bundle bundle){
        Intent intent=new Intent(mContext,activityClass);
        if (bundle!=null){
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public void moveToNextPage(Class<Activity> activityClass){
      moveToNextPage(activityClass,null);
    }

    /**
     *@def [方法定义] 界面初始化
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    public abstract void initView(View view,@Nullable Bundle savedInstanceState);

    /**
     *@def [方法定义] presenter初始化
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    protected abstract void initPresenter();

    /**
     *@def [方法定义] 获取界面资源ID
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    public abstract int getResLayoutId();

}
