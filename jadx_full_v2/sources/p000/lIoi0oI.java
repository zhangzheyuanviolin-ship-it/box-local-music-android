            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lIoi0oI implements OIOi0lOI {
                public static final lIoi0oI I00000oIO = new lIoi0oI();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("inferenceCommonLogEvent");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iio00oliii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("imageInfo");
/* 42 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 46 */            iio00oliii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iio00oliii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("detectorOptions");
/* 68 */            iio00OliII iio00oliii3 = new iio00OliII();
/* 72 */            iio00oliii3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iio00oliii3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("loadDurationMs");
/* 94 */            iio00OliII iio00oliii4 = new iio00OliII();
/* 98 */            iio00oliii4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iio00oliii4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("sessionDurationMs");
/* 120 */           iio00OliII iio00oliii5 = new iio00OliII();
/* 124 */           iio00oliii5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(iio00oliii5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("sessionTotalInferenceDurationMs");
/* 146 */           iio00OliII iio00oliii6 = new iio00OliII();
/* 150 */           iio00oliii6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(iio00oliii6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lo0O0OO1i lo0o0oo1i = (lo0O0OO1i) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, lo0o0oo1i.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, lo0o0oo1i.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, lo0o0oo1i.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, lo0o0oo1i.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, lo0o0oo1i.I0000oI00);
/* 44 */            oIOi0o.add(I000II, lo0o0oo1i.I0001Ioi1lo);
                }
            }
