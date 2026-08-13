            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            public abstract class OooiOl0ioo0i {
                public static WeakHashMap I00000oIO;
                public static final OooiI0iI I00000oOI;

                static {
/* 3 */             OooiI0iI oooiI0iI = new OooiI0iI();
/* 11 */            oooiI0iI.I00iOIl = new WeakHashMap();
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I00000oOI = oooiI0iI;
                }

                public static OoolOO I00000oIO(View view) {
/* 1 */             WeakHashMap weakHashMap = I00000oIO;
/* 3 */             if (weakHashMap == null) {
/* 7 */                 weakHashMap = new WeakHashMap();
/* 10 */                I00000oIO = weakHashMap;
                    }
/* 16 */            OoolOO ooolOO = (OoolOO) weakHashMap.get(view);
/* 18 */            if (ooolOO != null) {
/* 77 */                return ooolOO;
                    }
/* 22 */            OoolOO ooolOO2 = new OoolOO();
/* 30 */            ooolOO2.I00000oIO = new WeakReference(view);
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            I00000oIO.put(view, ooolOO2);
/* 77 */            return ooolOO2;
                }

                public static void I00000oOI(View view, I01lloolio1l i01lloolio1l) {
/* 1 */             if (i01lloolio1l == null && (OooiO1oOi1.I00000oIO(view) instanceof I01lli)) {
/* 13 */                i01lloolio1l = new I01lloolio1l();
                    }
/* 20 */            if (view.getImportantForAccessibility() == 0) {
/* 23 */                view.setImportantForAccessibility(1);
                    }
/* 32 */            view.setAccessibilityDelegate(i01lloolio1l == null ? null : i01lloolio1l.I00iiI);
                }

                public static void I0000Il00O(View view, CharSequence charSequence) {
/* 1 */             OooiO10Oo1.I0000O(view, charSequence);
/* 4 */             OooiI0iI oooiI0iI = I00000oOI;
/* 6 */             if (charSequence == null) {
/* 51 */                oooiI0iI.I00iOIl.remove(view);
/* 54 */                view.removeOnAttachStateChangeListener(oooiI0iI);
/* 61 */                view.getViewTreeObserver().removeOnGlobalLayoutListener(oooiI0iI);
                    } else {
/* 29 */                oooiI0iI.I00iOIl.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
/* 32 */                view.addOnAttachStateChangeListener(oooiI0iI);
/* 39 */                if (view.isAttachedToWindow()) {
/* 45 */                    view.getViewTreeObserver().addOnGlobalLayoutListener(oooiI0iI);
                        }
                    }
                }
            }
