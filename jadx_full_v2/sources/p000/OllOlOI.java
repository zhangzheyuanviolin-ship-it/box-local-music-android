            package p000;

            import android.view.View;
            import java.util.WeakHashMap;
            import kotlin.jvm.functions.Function1;
            
            public final class OllOlOI extends Ioo11Oooi0Il {
                public Function1 I00oI0i;
                public i00lIlOOll0 I00oII;

                @Override
                public final void I010101Oo1lO() {
/* 1 */             View viewI00000oIO = il0lIIII.I00000oIO(this);
/* 5 */             WeakHashMap weakHashMap = i00lIlOOll0.I001i1O0Ol;
/* 7 */             i00lIlOOll0 i00lilooll0I00000oOI = liIIiol0oI10.I00000oOI(viewI00000oIO);
/* 11 */            i00lilooll0I00000oOI.I00000oIO(viewI00000oIO);
/* 20 */            i00O0OOIlOO i00o0ooiloo = (i00O0OOIlOO) this.I00oI0i.invoke(i00lilooll0I00000oOI);
/* 28 */            if (!O0000Ioio00.I0000O(i00o0ooiloo, this.I00o101lO)) {
/* 30 */                this.I00o101lO = i00o0ooiloo;
/* 32 */                I010l1ol111();
                    }
/* 35 */            this.I00oII = i00lilooll0I00000oOI;
/* 37 */            super.I010101Oo1lO();
                }

                @Override
                public final void I010I0() {
/* 1 */             View viewI00000oIO = il0lIIII.I00000oIO(this);
/* 5 */             i00lIlOOll0 i00lilooll0 = this.I00oII;
/* 7 */             if (i00lilooll0 != null) {
                        int i = i00lilooll0.I001IIilI0O - 1;
/* 13 */                i00lilooll0.I001IIilI0O = i;
/* 15 */                if (i == 0) {
/* 17 */                    WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 20 */                    OooiIOIoi.I00000oOI(viewI00000oIO, null);
/* 23 */                    viewI00000oIO.setWindowInsetsAnimationCallback(null);
/* 28 */                    viewI00000oIO.removeOnAttachStateChangeListener(i00lilooll0.I001IO000);
                        }
                    }
/* 31 */            super.I010I0();
                }
            }
