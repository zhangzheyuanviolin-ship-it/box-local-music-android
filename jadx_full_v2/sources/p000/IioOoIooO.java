            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.Window;
            
            public abstract class IioOoIooO {
                public void I00000oIO(OllO11I0Ooo ollO11I0Ooo, OllO11I0Ooo ollO11I0Ooo2, Window window, View view, boolean z, boolean z2) {
/* 2 */             liIIO0.I00000oIO(window, false);
/* 12 */            window.setStatusBarColor(z ? ollO11I0Ooo.I00000oOI : ollO11I0Ooo.I00000oIO);
/* 22 */            window.setNavigationBarColor(z2 ? ollO11I0Ooo2.I00000oOI : ollO11I0Ooo2.I00000oIO);
/* 27 */            new Oi00IilOloo0(view);
/* 44 */            OoOlO1O0o i00ioooo11i = Build.VERSION.SDK_INT >= 35 ? new i00ioooO11i(window) : new OoOlO1O0o(window);
/* 49 */            i00ioooo11i.I0000oI00(!z);
/* 54 */            i00ioooo11i.I0000Il00O(!z2);
                }
            }
