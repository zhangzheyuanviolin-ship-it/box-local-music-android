            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOIIOloOi0ll implements OIOi0lOI {
                public static final lOIIOloOi0ll I00000oIO = new lOIIOloOi0ll();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("pipelineNamespace");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iio00oliii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("name");
/* 42 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 46 */            iio00oliii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iio00oliii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("clientLibraryName");
/* 68 */            iio00OliII iio00oliii3 = new iio00OliII();
/* 72 */            iio00oliii3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iio00oliii3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("clientLibraryVersion");
/* 94 */            iio00OliII iio00oliii4 = new iio00OliII();
/* 98 */            iio00oliii4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iio00oliii4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("minClientLibraryVersion");
/* 120 */           iio00OliII iio00oliii5 = new iio00OliII();
/* 124 */           iio00oliii5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(iio00oliii5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("maxClientLibraryVersion");
/* 146 */           iio00OliII iio00oliii6 = new iio00OliII();
/* 150 */           iio00oliii6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(iio00oliii6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
/* 166 */           OlOO1i11110 olOO1i11110I00000oIO7 = IlIO00o1.I00000oIO("sourceProduct");
/* 172 */           iio00OliII iio00oliii7 = new iio00OliII();
/* 176 */           iio00oliii7.I0000O = 7;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           olOO1i11110I00000oIO7.I001i1lo1io(iio00oliii7);
/* 188 */           I000O01llI0 = olOO1i11110I00000oIO7.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lool1O1l11io lool1o1l11io = (lool1O1l11io) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, lool1o1l11io.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, lool1o1l11io.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, lool1o1l11io.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, lool1o1l11io.I0000O);
/* 36 */            oIOi0o.add(I0001Ioi1lo, (Object) null);
/* 41 */            oIOi0o.add(I000II, (Object) null);
/* 46 */            oIOi0o.add(I000O01llI0, (Object) null);
                }
            }
