            package p000;

            import android.window.OnBackInvokedDispatcher;
            import java.lang.invoke.VarHandle;
            
            public final class OIOo00o extends OII10o1l1IO {
                public final OnBackInvokedDispatcher I0000Il00O;
                public final int I0000O;
                public final OIOo01 I0000oI00;
                public boolean I0001Ioi1lo;

                public OIOo00o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
/* 4 */             this.I0000Il00O = onBackInvokedDispatcher;
/* 6 */             this.I0000O = i;
/* 10 */            OIOo01 oIOo01 = new OIOo01();
/* 13 */            oIOo01.I00000oIO = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            this.I0000oI00 = oIOo01;
                }

                @Override
                public final void I00000oOI(boolean z) {
/* 1 */             OIOo01 oIOo01 = this.I0000oI00;
/* 3 */             OnBackInvokedDispatcher onBackInvokedDispatcher = this.I0000Il00O;
/* 5 */             if (z && !this.I0001Ioi1lo) {
/* 13 */                onBackInvokedDispatcher.registerOnBackInvokedCallback(this.I0000O, oIOo01);
/* 17 */                this.I0001Ioi1lo = true;
                    } else {
/* 20 */                if (z || !this.I0001Ioi1lo) {
/* 77 */                    return;
                        }
/* 26 */                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(oIOo01);
/* 30 */                this.I0001Ioi1lo = false;
                    }
                }
            }
