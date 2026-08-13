            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0l11l1iOO {
                public OIooi1iOiOol I00000oIO;
                public OIooi1iOiOol I00000oOI;

                public static O1ooiI111i I00000oIO(O0l11l1iOO o0l11l1iOO, O1ooiI111i o1ooiI111i, int i) {
                    OlIOiI1iI1 olIOiI1iI1I0000Il00O;
/* 6 */             OlIOiI1iI1 olIOiI1iI1I0000Il00O2 = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
/* 12 */            if ((i & 2) != 0) {
/* 14 */                OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 26 */                olIOiI1iI1I0000Il00O = iOO01lio0.I0000Il00O(0.0f, 400.0f, IooO0O.I00000oIO(4294967297L), 1);
                    } else {
/* 31 */                olIOiI1iI1I0000Il00O = null;
                    }
/* 32 */            OlIOiI1iI1 olIOiI1iI1I0000Il00O3 = iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5);
/* 36 */            o0l11l1iOO.getClass();
/* 41 */            O0lO11O o0lO11O = new O0lO11O();
/* 44 */            o0lO11O.I00000oIO = olIOiI1iI1I0000Il00O2;
/* 46 */            o0lO11O.I00000oOI = olIOiI1iI1I0000Il00O;
/* 48 */            o0lO11O.I0000Il00O = olIOiI1iI1I0000Il00O3;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            return o1ooiI111i.I0000O(o0lO11O);
                }
            }
