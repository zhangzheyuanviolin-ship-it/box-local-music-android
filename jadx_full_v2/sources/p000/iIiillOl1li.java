            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIiillOl1li implements OIOi0lOI {
                public static final iIiillOl1li I00000oIO = new iIiillOl1li();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("featureVersion");
/* 16 */            lioll0I0i1 lioll0i0i1 = new lioll0I0i1();
/* 20 */            lioll0i0i1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(lioll0i0i1);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            lioll0I0i1 lioll0i0i12 = new lioll0I0i1();
/* 46 */            lioll0i0i12.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(lioll0i0i12);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("isColdCall");
/* 68 */            lioll0I0i1 lioll0i0i13 = new lioll0I0i1();
/* 72 */            lioll0i0i13.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(lioll0i0i13);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("inputSize");
/* 94 */            lioll0I0i1 lioll0i0i14 = new lioll0I0i1();
/* 98 */            lioll0i0i14.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(lioll0i0i14);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("outputSize");
/* 120 */           lioll0I0i1 lioll0i0i15 = new lioll0I0i1();
/* 124 */           lioll0i0i15.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(lioll0i0i15);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("latencyMs");
/* 146 */           lioll0I0i1 lioll0i0i16 = new lioll0I0i1();
/* 150 */           lioll0i0i16.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(lioll0i0i16);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
/* 166 */           OlOO1i11110 olOO1i11110I00000oIO7 = IlIO00o1.I00000oIO("firstTokenLatencyMs");
/* 172 */           lioll0I0i1 lioll0i0i17 = new lioll0I0i1();
/* 176 */           lioll0i0i17.I0000O = 7;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           olOO1i11110I00000oIO7.I001i1lo1io(lioll0i0i17);
/* 188 */           I000O01llI0 = olOO1i11110I00000oIO7.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             iOIli0 ioili0 = (iOIli0) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ioili0.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, ioili0.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, ioili0.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, ioili0.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, ioili0.I0000oI00);
/* 44 */            oIOi0o.add(I000II, ioili0.I0001Ioi1lo);
/* 51 */            oIOi0o.add(I000O01llI0, ioili0.I000II);
                }
            }
