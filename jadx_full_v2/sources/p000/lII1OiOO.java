            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lII1OiOO implements OIOi0lOI {
                public static final lII1OiOO I00000oIO = new lII1OiOO();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("inferenceCommonLogEvent");
/* 16 */            iiiiIilO1iIo iiiiiilo1iio = new iiiiIilO1iIo();
/* 20 */            iiiiiilo1iio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiiiiilo1iio);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("imageInfo");
/* 42 */            iiiiIilO1iIo iiiiiilo1iio2 = new iiiiIilO1iIo();
/* 46 */            iiiiiilo1iio2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiiiiilo1iio2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("subjectSegmenterOptions");
/* 68 */            iiiiIilO1iIo iiiiiilo1iio3 = new iiiiIilO1iIo();
/* 72 */            iiiiiilo1iio3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iiiiiilo1iio3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("subjectInfos");
/* 94 */            iiiiIilO1iIo iiiiiilo1iio4 = new iiiiIilO1iIo();
/* 98 */            iiiiiilo1iio4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iiiiiilo1iio4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("qualityScores");
/* 120 */           iiiiIilO1iIo iiiiiilo1iio5 = new iiiiIilO1iIo();
/* 124 */           iiiiiilo1iio5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(iiiiiilo1iio5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lliOIl0IO llioil0io = (lliOIl0IO) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, llioil0io.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, llioil0io.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, llioil0io.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, llioil0io.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, llioil0io.I0000oI00);
                }
            }
