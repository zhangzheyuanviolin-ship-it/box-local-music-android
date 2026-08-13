            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lll01ii implements OIOi0lOI {
                public static final lll01ii I00000oIO = new lll01ii();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("options");
/* 16 */            l0OliiOIio l0oliioiio = new l0OliiOIio();
/* 20 */            l0oliioiio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oliioiio);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("sapiInferenceCommonEvent");
/* 42 */            l0OliiOIio l0oliioiio2 = new l0OliiOIio();
/* 46 */            l0oliioiio2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oliioiio2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o0oiol1 o0oiol1Var = (o0oiol1) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o0oiol1Var.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o0oiol1Var.I00000oOI);
                }
            }
