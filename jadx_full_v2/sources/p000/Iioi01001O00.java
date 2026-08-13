            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            
            public abstract class Iioi01001O00 extends IioOoo0 {
                @Override
                public void I00000oIO(OllO11I0Ooo ollO11I0Ooo, OllO11I0Ooo ollO11I0Ooo2, Window window, View view, boolean z, boolean z2) {
/* 2 */             liIIO0.I00000oIO(window, false);
/* 5 */             window.setStatusBarColor(0);
/* 8 */             window.setNavigationBarColor(0);
/* 11 */            window.setStatusBarContrastEnforced(false);
/* 15 */            window.setNavigationBarContrastEnforced(true);
/* 20 */            new Oi00IilOloo0(view);
/* 37 */            OoOlO1O0o i00ioooo11i = Build.VERSION.SDK_INT >= 35 ? new i00ioooO11i(window) : new OoOlO1O0o(window);
/* 42 */            i00ioooo11i.I0000oI00(!z);
/* 46 */            i00ioooo11i.I0000Il00O(true ^ z2);
                }
            }
