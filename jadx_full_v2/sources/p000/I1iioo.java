            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1iioo implements OIOi0lOI {
                public static final I1iioo I00000oIO = new I1iioo();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("window");
/* 16 */            I1Ool1110li i1Ool1110li = new I1Ool1110li();
/* 20 */            i1Ool1110li.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(i1Ool1110li);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("logSourceMetrics");
/* 42 */            I1Ool1110li i1Ool1110li2 = new I1Ool1110li();
/* 46 */            i1Ool1110li2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(i1Ool1110li2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("globalMetrics");
/* 68 */            I1Ool1110li i1Ool1110li3 = new I1Ool1110li();
/* 72 */            i1Ool1110li3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(i1Ool1110li3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("appNamespace");
/* 94 */            I1Ool1110li i1Ool1110li4 = new I1Ool1110li();
/* 98 */            i1Ool1110li4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(i1Ool1110li4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             IOIololliO iOIololliO = (IOIololliO) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, iOIololliO.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, iOIololliO.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, iOIololliO.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, iOIololliO.I0000O);
                }
            }
