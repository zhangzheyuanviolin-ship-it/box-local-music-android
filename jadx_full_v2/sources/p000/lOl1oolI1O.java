            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOl1oolI1O implements OIOi0lOI {
                public static final lOl1oolI1O I00000oIO = new lOl1oolI1O();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("metric");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iio00oliii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("result");
/* 42 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 46 */            iio00oliii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iio00oliii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o00OIIOi1I1 o00oiioi1i1 = (o00OIIOi1I1) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 5 */             o00oiioi1i1.getClass();
/* 12 */            oIOi0o.add(I00000oOI, o00I11l.MEAN_ABSOLUTE_ERROR);
/* 19 */            oIOi0o.add(I0000Il00O, o00oiioi1i1.I00000oIO);
                }
            }
