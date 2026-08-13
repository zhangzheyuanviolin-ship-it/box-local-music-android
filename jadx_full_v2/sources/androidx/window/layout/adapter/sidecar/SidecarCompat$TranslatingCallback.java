            package androidx.window.layout.adapter.sidecar;

            import android.app.Activity;
            import android.os.IBinder;
            import android.util.Log;
            import android.view.Window;
            import android.view.WindowManager;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Collection;
            import kotlin.Metadata;
            import p000.IoIlOo1o0IIl;
            import p000.Ol01ol0;
            import p000.Ol0I0o1OI1i;
            import p000.i00lliOilOo;
            
            @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "LOoiIlOl1iI;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
                public Ol0I0o1OI1i I00000oIO;

                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface;
                    Window window;
                    WindowManager.LayoutParams attributes;
/* 5 */             Collection<Activity> collectionValues = this.I00000oIO.I0000Il00O.values();
/* 11 */            Ol0I0o1OI1i ol0I0o1OI1i = this.I00000oIO;
/* 21 */            for (Activity activity : collectionValues) {
/* 29 */                SidecarWindowLayoutInfo windowLayoutInfo = null;
/* 47 */                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 48 */                if (iBinder != null && (sidecarInterface = ol0I0o1OI1i.I00000oIO) != null) {
/* 54 */                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
                        }
/* 58 */                IoIlOo1o0IIl ioIlOo1o0IIl = ol0I0o1OI1i.I0000oI00;
/* 60 */                if (ioIlOo1o0IIl != null) {
/* 68 */                    ioIlOo1o0IIl.I00IO1oi11O(activity, ol0I0o1OI1i.I00000oOI.I0000Il00O(windowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    SidecarDeviceState sidecarDeviceState;
/* 9 */             Activity activity = (Activity) this.I00000oIO.I0000Il00O.get(windowToken);
/* 11 */            if (activity == null) {
/* 17 */                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
/* 20 */                return;
                    }
/* 21 */            Ol0I0o1OI1i ol0I0o1OI1i = this.I00000oIO;
/* 23 */            Ol01ol0 ol01ol0 = ol0I0o1OI1i.I00000oOI;
/* 25 */            SidecarInterface sidecarInterface = ol0I0o1OI1i.I00000oIO;
/* 27 */            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
/* 37 */                sidecarDeviceState = new SidecarDeviceState();
                    }
/* 40 */            i00lliOilOo i00llioilooI0000Il00O = ol01ol0.I0000Il00O(newLayout, sidecarDeviceState);
/* 46 */            IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oIO.I0000oI00;
/* 48 */            if (ioIlOo1o0IIl != null) {
/* 50 */                ioIlOo1o0IIl.I00IO1oi11O(activity, i00llioilooI0000Il00O);
                    }
                }
            }
