            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l1ioo0OlO implements OIOi0lOI {
                public static final l1ioo0OlO I00000oIO = new l1ioo0OlO();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("maxLabels");
/* 16 */            iiOII1o1OiI iioii1o1oii = new iiOII1o1OiI();
/* 20 */            iioii1o1oii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iioii1o1oii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("confidenceThreshold");
/* 42 */            iiOII1o1OiI iioii1o1oii2 = new iiOII1o1OiI();
/* 46 */            iioii1o1oii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iioii1o1oii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("customLocalModelOptions");
/* 68 */            iiOII1o1OiI iioii1o1oii3 = new iiOII1o1OiI();
/* 72 */            iioii1o1oii3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iioii1o1oii3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 8 */             oIOi0o.add(I00000oOI, (Object) null);
/* 15 */            oIOi0o.add(I0000Il00O, ((ll101l00l1) obj).I00000oIO);
/* 20 */            oIOi0o.add(I0000O, (Object) null);
                }
            }
