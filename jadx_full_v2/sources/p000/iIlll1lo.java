            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iIlll1lo {
                public static Oi11lOiIoi I00000oIO;

                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1) {
/* 3 */             II0oOOi iI0oOOi = new II0oOOi();
/* 6 */             iI0oOOi.I00000oIO = function1;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            return o1ooiI111i.I0000O(iI0oOOi);
                }

                public static O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, float f, float f2, float f3, float f4, float f5, float f6, OioOIi1o0I oioOIi1o0I, boolean z, int i) {
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 f = 1.0f;
                    }
/* 10 */            if ((i & 2) != 0) {
/* 12 */                f2 = 1.0f;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                f3 = 1.0f;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                f4 = 0.0f;
                    }
/* 26 */            if ((i & 32) != 0) {
/* 28 */                f5 = 0.0f;
                    }
/* 31 */            if ((i & Barcode.FORMAT_QR_CODE) != 0) {
/* 33 */                f6 = 0.0f;
                    }
/* 34 */            long j = OoI0l01O.I00000oOI;
/* 38 */            if ((i & Barcode.FORMAT_PDF417) != 0) {
/* 40 */                oioOIi1o0I = iO0ioilo.I00000oIO;
                    }
/* 45 */            if ((i & Barcode.FORMAT_AZTEC) != 0) {
/* 47 */                z = false;
                    }
/* 48 */            long j2 = Io10Oi10I.I00000oIO;
/* 53 */            int i2 = (i & 65536) == 0 ? 1 : 0;
/* 57 */            O0iOIOiIIII o0iOIOiIIII = O0iOIOiIIII.I00000oIO;
/* 61 */            Io10O0I0 io10O0I0 = new Io10O0I0();
/* 64 */            io10O0I0.I00000oIO = f;
/* 66 */            io10O0I0.I00000oOI = f2;
/* 68 */            io10O0I0.I0000Il00O = f3;
/* 70 */            io10O0I0.I0000O = f4;
/* 72 */            io10O0I0.I0000oI00 = f5;
/* 74 */            io10O0I0.I0001Ioi1lo = f6;
/* 78 */            io10O0I0.I000II = 8.0f;
/* 80 */            io10O0I0.I000O01llI0 = j;
/* 82 */            io10O0I0.I000OOo1O = oioOIi1o0I;
/* 84 */            io10O0I0.I000OiO = z;
/* 86 */            io10O0I0.I000iOII = j2;
/* 88 */            io10O0I0.I000l1 = j2;
/* 90 */            io10O0I0.I000lI = i2;
/* 93 */            io10O0I0.I000o00OoI0I = 3;
/* 95 */            io10O0I0.I000oI1ioi = o0iOIOiIIII;
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           return o1ooiI111i.I0000O(io10O0I0);
                }
            }
