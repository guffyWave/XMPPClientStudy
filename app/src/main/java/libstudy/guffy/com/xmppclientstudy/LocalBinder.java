package libstudy.guffy.com.xmppclientstudy;

import android.os.Binder;

import java.lang.ref.WeakReference;

/**
 * Created by gufran on 1/28/16.
 */
public class LocalBinder<S> extends Binder {
    private final WeakReference<S> mService;

    public LocalBinder(final S service) {
        mService = new WeakReference<S>(service);
    }

    public S getService() {
        return mService.get();
    }

}
