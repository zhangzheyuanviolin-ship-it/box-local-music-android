            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iloOloI implements OIOi0lOI {
                public static final iloOloI I00000oIO = new iloOloI();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            iiooo00 iiooo00Var = new iiooo00();
/* 20 */            iiooo00Var.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiooo00Var);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("eventCount");
/* 42 */            iiooo00 iiooo00Var2 = new iiooo00();
/* 46 */            iiooo00Var2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiooo00Var2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("inferenceDurationStats");
/* 68 */            iiooo00 iiooo00Var3 = new iiooo00();
/* 72 */            iiooo00Var3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iiooo00Var3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             ilO0o0olO0 ilo0o0olo0 = (ilO0o0olO0) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ilo0o0olo0.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, ilo0o0olo0.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, ilo0o0olo0.I0000Il00O);
                }
            }
