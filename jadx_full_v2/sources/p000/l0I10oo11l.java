            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0I10oo11l implements OIOi0lOI {
                public static final l0I10oo11l I00000oIO = new l0I10oo11l();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("imageFormat");
/* 16 */            iiOII1o1OiI iioii1o1oii = new iiOII1o1OiI();
/* 20 */            iioii1o1oii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iioii1o1oii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("originalImageSize");
/* 42 */            iiOII1o1OiI iioii1o1oii2 = new iiOII1o1OiI();
/* 46 */            iioii1o1oii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iioii1o1oii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("compressedImageSize");
/* 68 */            iiOII1o1OiI iioii1o1oii3 = new iiOII1o1OiI();
/* 72 */            iioii1o1oii3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iioii1o1oii3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("isOdmlImage");
/* 94 */            iiOII1o1OiI iioii1o1oii4 = new iiOII1o1OiI();
/* 98 */            iioii1o1oii4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iioii1o1oii4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lOiiiIli loiiiili = (lOiiiIli) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, loiiiili.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, loiiiili.I00000oOI);
/* 22 */            oIOi0o.add(I0000O, (Object) null);
/* 27 */            oIOi0o.add(I0000oI00, (Object) null);
                }
            }
