package gtq.com.demo.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import static com.google.common.base.Preconditions.checkNotNull;
/**
 * Created by guotengqian on 2016/12/15 15:08.
 * def
 */

public class ActivityUtils {

    /**
     *@def [方法定义]
     *@params [入参说明]
     *@reture [返回参数说明]
     *@time 2016/12/15
     *@user guotengqian
    */
    public static void addFragmentToActivity (@NonNull FragmentManager fragmentManager,
                                              @NonNull Fragment fragment, int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }


}
