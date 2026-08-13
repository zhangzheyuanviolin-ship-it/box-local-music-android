            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l1Io0OO implements OIOi0lOI {
                public static final l1Io0OO I00000oIO = new l1Io0OO();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("source");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iio00oliii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 46 */            iio00oliii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iio00oliii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             loo1ilOi loo1iloi = (loo1ilOi) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, loo1iloi.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, loo1iloi.I00000oOI);
                }
            }
