            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l0IOoOo0O0O {
                public static final O00i1OoOll1I I00000oIO(OIO0ii oIO0ii) {
                    O01O0o1iI o01O0o1iII0000Il00O;
/* 5 */             String value = oIO0ii.getMethod().getValue();
/* 9 */             OIO1iOO1iiOI oIO1iOO1iiOII00000oIO = oIO0ii.I00000oIO();
/* 13 */            if (oIO1iOO1iiOII00000oIO != null) {
/* 15 */                O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 19 */                i1i0olI i1i0oli = o011OoiO1I00000oIO.I00000oOI;
/* 29 */                o01O0o1iII0000Il00O = o011OoiO1I00000oIO.I0000Il00O(OIO1iOO1iiOI.Companion.serializer(), oIO1iOO1iiOII00000oIO);
                    } else {
/* 34 */                o01O0o1iII0000Il00O = null;
                    }
/* 37 */            O00i1OoOll1I o00i1OoOll1I = new O00i1OoOll1I();
/* 40 */            o00i1OoOll1I.I00000oIO = value;
/* 42 */            o00i1OoOll1I.I00000oOI = o01O0o1iII0000Il00O;
/* 46 */            o00i1OoOll1I.I0000Il00O = "2.0";
/* 48 */            VarHandle.storeStoreFence();
/* 186 */           return o00i1OoOll1I;
                }
            }
