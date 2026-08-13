            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOI1OllI implements OIOi0lOI {
                public static final lOI1OllI I00000oIO = new lOI1OllI();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("name");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iio00oliii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("stages");
/* 42 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 46 */            iio00oliii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iio00oliii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("runMiniBenchmark");
/* 68 */            iio00OliII iio00oliii3 = new iio00OliII();
/* 72 */            iio00oliii3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iio00oliii3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ((looOio1l) obj).I00000oIO);
/* 15 */            oIOi0o.add(I0000Il00O, (Object) null);
/* 20 */            oIOi0o.add(I0000O, (Object) null);
                }
            }
