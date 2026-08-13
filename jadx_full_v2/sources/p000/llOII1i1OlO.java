            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class llOII1i1OlO implements OIOi0lOI {
                public static final llOII1i1OlO I00000oIO = new llOII1i1OlO();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("featureVersion");
/* 16 */            l0OI0lloI l0oi0lloi = new l0OI0lloI();
/* 20 */            l0oi0lloi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi0lloi);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            l0OI0lloI l0oi0lloi2 = new l0OI0lloI();
/* 46 */            l0oi0lloi2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oi0lloi2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("isColdCall");
/* 68 */            l0OI0lloI l0oi0lloi3 = new l0OI0lloI();
/* 72 */            l0oi0lloi3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(l0oi0lloi3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("inputSize");
/* 94 */            l0OI0lloI l0oi0lloi4 = new l0OI0lloI();
/* 98 */            l0oi0lloi4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(l0oi0lloi4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("outputSize");
/* 120 */           l0OI0lloI l0oi0lloi5 = new l0OI0lloI();
/* 124 */           l0oi0lloi5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(l0oi0lloi5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("latencyMs");
/* 146 */           l0OI0lloI l0oi0lloi6 = new l0OI0lloI();
/* 150 */           l0oi0lloi6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(l0oi0lloi6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
/* 166 */           OlOO1i11110 olOO1i11110I00000oIO7 = IlIO00o1.I00000oIO("firstTokenLatencyMs");
/* 172 */           l0OI0lloI l0oi0lloi7 = new l0OI0lloI();
/* 176 */           l0oi0lloi7.I0000O = 7;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           olOO1i11110I00000oIO7.I001i1lo1io(l0oi0lloi7);
/* 188 */           I000O01llI0 = olOO1i11110I00000oIO7.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o0lOIi1 o0loii1 = (o0lOIi1) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o0loii1.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o0loii1.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, o0loii1.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, o0loii1.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, o0loii1.I0000oI00);
/* 44 */            oIOi0o.add(I000II, o0loii1.I0001Ioi1lo);
/* 51 */            oIOi0o.add(I000O01llI0, o0loii1.I000II);
                }
            }
