            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1ilOO0OI implements OIOi0lOI {
                public static final I1ilOO0OI I00000oIO = new I1ilOO0OI();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("currentCacheSizeBytes");
/* 16 */            I1Ool1110li i1Ool1110li = new I1Ool1110li();
/* 20 */            i1Ool1110li.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(i1Ool1110li);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("maxCacheSizeBytes");
/* 42 */            I1Ool1110li i1Ool1110li2 = new I1Ool1110li();
/* 46 */            i1Ool1110li2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(i1Ool1110li2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             OlOIOII olOIOII = (OlOIOII) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, olOIOII.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, olOIOII.I00000oOI);
                }
            }
