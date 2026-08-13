            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Iioi0ilo1oi0 extends Iioi0OlliO {
                @Override
                public void I00000oIO(OllO11I0Ooo ollO11I0Ooo, OllO11I0Ooo ollO11I0Ooo2, Window window, View view, boolean z, boolean z2) {
/* 2 */             liIIO0.I00000oIO(window, false);
/* 5 */             window.setStatusBarColor(0);
/* 8 */             window.setNavigationBarColor(0);
/* 17 */            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
/* 19 */            if (viewGroup != null) {
/* 25 */                I01I0Iioooo0 i01I0Iioooo0 = new I01I0Iioooo0(8);
/* 28 */                i01I0Iioooo0.I00iiO = viewGroup;
/* 30 */                VarHandle.storeStoreFence();
                        while (true) {
/* 37 */                    if (!i01I0Iioooo0.hasNext()) {
                                break;
                            }
/* 45 */                    Object tag = ((View) i01I0Iioooo0.next()).getTag();
/* 51 */                    if (tag instanceof List) {
/* 54 */                        List list = (List) tag;
/* 61 */                        if (list.size() == 4 && (list.get(0) instanceof IOOl00ioiOil)) {
/* 73 */                            Iterator it = ((Iterable) tag).iterator();
/* 81 */                            while (it.hasNext()) {
/* 83 */                                it.next();
                                    }
                                }
                            }
                        }
                    }
/* 88 */            window.setNavigationBarContrastEnforced(true);
/* 93 */            new Oi00IilOloo0(view);
/* 110 */           OoOlO1O0o i00ioooo11i = Build.VERSION.SDK_INT >= 35 ? new i00ioooO11i(window) : new OoOlO1O0o(window);
/* 115 */           i00ioooo11i.I0000oI00(!z);
/* 119 */           i00ioooo11i.I0000Il00O(true ^ z2);
                }
            }
