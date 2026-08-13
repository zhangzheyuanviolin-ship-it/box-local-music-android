            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class ioo0l0l implements OIOi0lOI {
                public static final ioo0l0l I00000oIO = new ioo0l0l();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("maxMs");
/* 16 */            iiooo00 iiooo00Var = new iiooo00();
/* 20 */            iiooo00Var.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiooo00Var);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("minMs");
/* 42 */            iiooo00 iiooo00Var2 = new iiooo00();
/* 46 */            iiooo00Var2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiooo00Var2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("avgMs");
/* 68 */            iiooo00 iiooo00Var3 = new iiooo00();
/* 72 */            iiooo00Var3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iiooo00Var3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("firstQuartileMs");
/* 94 */            iiooo00 iiooo00Var4 = new iiooo00();
/* 98 */            iiooo00Var4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iiooo00Var4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("medianMs");
/* 120 */           iiooo00 iiooo00Var5 = new iiooo00();
/* 124 */           iiooo00Var5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(iiooo00Var5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("thirdQuartileMs");
/* 146 */           iiooo00 iiooo00Var6 = new iiooo00();
/* 150 */           iiooo00Var6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(iiooo00Var6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             l1o1O00 l1o1o00 = (l1o1O00) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, l1o1o00.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, l1o1o00.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, l1o1o00.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, l1o1o00.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, l1o1o00.I0000oI00);
/* 44 */            oIOi0o.add(I000II, l1o1o00.I0001Ioi1lo);
                }
            }
