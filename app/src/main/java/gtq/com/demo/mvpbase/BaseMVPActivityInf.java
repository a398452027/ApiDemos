package gtq.com.demo.mvpbase;



/**
 * MVP模式步骤
 * 1.activity实现BaseMVPActivityInf,并在onCreate，调用initPresenter
 * 2.initPresenter初始化Presenter
 * 3.获取fragment对象（此对象必须继承Baseview），并使用添加到Activity
 * 4.fragment和Presenter都实例化后使用baseview.setPresenter绑定Presenter
 * 5.Fragment的onResume要调用presenter.start方法
 * MVP流程
 * activity.onCreate -- initPresenter -- addFragment -- setPresenter -- presenter.start
 *
 *
 * Created by guotengqian on 2016/12/15 15:37.
 * def Activity集成此接口
 */

public interface BaseMVPActivityInf {
    BasePresenter mPresenter = null;
    /**
     *@def [方法定义] 初始化Presenter
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    void initPresenter();


}
