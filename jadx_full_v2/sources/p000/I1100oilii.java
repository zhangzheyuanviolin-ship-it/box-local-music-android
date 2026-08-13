            package p000;

            import android.os.Looper;
            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class I1100oilii {
                public static final ThreadLocal I000OOo1O = new ThreadLocal();
                public Ol0Ii10o1 I00000oIO;
                public ArrayList I00000oOI;
                public IIloOI I0000Il00O;
                public I0100i I0000O;
                public OlOO1i11110 I0000oI00;
                public boolean I0001Ioi1lo;
                public float I000II;
                public IoloOio0I I000O01llI0;

                public static I1100oilii I00000oIO() {
/* 1 */             ThreadLocal threadLocal = I000OOo1O;
/* 7 */             if (threadLocal.get() == null) {
/* 13 */                int i = 3;
/* 14 */                OlOO1i11110 olOO1i11110 = new OlOO1i11110(i);
/* 21 */                olOO1i11110.I00iiI = Choreographer.getInstance();
/* 27 */                olOO1i11110.I00iiO = Looper.myLooper();
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                I1100oilii i1100oilii = new I1100oilii();
/* 41 */                i1100oilii.I00000oIO = new Ol0Ii10o1(0);
/* 48 */                i1100oilii.I00000oOI = new ArrayList();
/* 52 */                IIloOI iIloOI = new IIloOI(i);
/* 55 */                iIloOI.I00iiI = i1100oilii;
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                i1100oilii.I0000Il00O = iIloOI;
/* 65 */                I0100i i0100i = new I0100i(6);
/* 68 */                i0100i.I00iiI = i1100oilii;
/* 70 */                VarHandle.storeStoreFence();
/* 73 */                i1100oilii.I0000O = i0100i;
/* 75 */                i1100oilii.I0001Ioi1lo = false;
/* 79 */                i1100oilii.I000II = 1.0f;
/* 81 */                i1100oilii.I0000oI00 = olOO1i11110;
/* 83 */                VarHandle.storeStoreFence();
/* 86 */                threadLocal.set(i1100oilii);
                    }
/* 93 */            return (I1100oilii) threadLocal.get();
                }
            }
