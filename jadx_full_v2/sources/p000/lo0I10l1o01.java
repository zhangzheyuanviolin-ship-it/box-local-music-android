            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lo0I10l1o01 implements OIOi0lOI {
                public static final lo0I10l1o01 I00000oIO = new lo0I10l1o01();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("featureVersion");
/* 16 */            l11OIolOi l11oioloi = new l11OIolOi();
/* 20 */            l11oioloi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l11oioloi);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            l11OIolOi l11oioloi2 = new l11OIolOi();
/* 46 */            l11oioloi2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l11oioloi2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("isColdCall");
/* 68 */            l11OIolOi l11oioloi3 = new l11OIolOi();
/* 72 */            l11oioloi3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(l11oioloi3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("inputSize");
/* 94 */            l11OIolOi l11oioloi4 = new l11OIolOi();
/* 98 */            l11oioloi4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(l11oioloi4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("outputSize");
/* 120 */           l11OIolOi l11oioloi5 = new l11OIolOi();
/* 124 */           l11oioloi5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(l11oioloi5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("latencyMs");
/* 146 */           l11OIolOi l11oioloi6 = new l11OIolOi();
/* 150 */           l11oioloi6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(l11oioloi6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
/* 166 */           OlOO1i11110 olOO1i11110I00000oIO7 = IlIO00o1.I00000oIO("firstTokenLatencyMs");
/* 172 */           l11OIolOi l11oioloi7 = new l11OIolOi();
/* 176 */           l11oioloi7.I0000O = 7;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           olOO1i11110I00000oIO7.I001i1lo1io(l11oioloi7);
/* 188 */           I000O01llI0 = olOO1i11110I00000oIO7.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o10l1l o10l1lVar = (o10l1l) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o10l1lVar.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o10l1lVar.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, o10l1lVar.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, o10l1lVar.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, o10l1lVar.I0000oI00);
/* 44 */            oIOi0o.add(I000II, o10l1lVar.I0001Ioi1lo);
/* 51 */            oIOi0o.add(I000O01llI0, o10l1lVar.I000II);
                }
            }
