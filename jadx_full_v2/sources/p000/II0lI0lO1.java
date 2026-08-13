            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public class II0lI0lO1 extends OooioIIoi0O {
                public Executor I00000oOI;
                public iOOol1iOiIO I0000Il00O;
                public II0ilOIlloOl I0000O;
                public I1ii1o0 I0000oI00;
                public IoloOio0I I0001Ioi1lo;
                public IoIlOo1o0IIl I000II;
                public II0l0lIIO I000O01llI0;
                public boolean I000OOo1O;
                public boolean I000OiO;
                public boolean I000iOII;
                public OI0lOii0I I000l1;
                public OI0lOii0I I000lI;
                public OI0lOii0I I000o00OoI0I;
                public OI0lOii0I I000oI1ioi;
                public OI0lOii0I I00100l0;
                public OI0lOii0I I00100o1O0lo;

                public static void I000II(OI0lOii0I oI0lOii0I, Object obj) {
/* 13 */            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
/* 15 */                oI0lOii0I.I000iOII(obj);
                    } else {
/* 19 */                oI0lOii0I.I000OOo1O(obj);
                    }
                }

                public final Executor I0000oI00() {
/* 1 */             Executor executor = this.I00000oOI;
/* 3 */             if (executor != null) {
/* 5 */                 return executor;
                    }
/* 9 */             II0l011 iI0l011 = new II0l011(0);
/* 21 */            iI0l011.I00iiI = new Handler(Looper.getMainLooper());
/* 23 */            VarHandle.storeStoreFence();
/* 55 */            return iI0l011;
                }

                public final void I0001Ioi1lo(boolean z) {
/* 1 */             OI0lOii0I oI0lOii0I = this.I00100l0;
/* 3 */             if (oI0lOii0I == null) {
/* 7 */                 oI0lOii0I = new OI0lOii0I();
/* 10 */                this.I00100l0 = oI0lOii0I;
                    }
/* 16 */            I000II(oI0lOii0I, Boolean.valueOf(z));
                }
            }
