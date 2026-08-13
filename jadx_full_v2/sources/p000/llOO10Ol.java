            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class llOO10Ol implements OIOi0lOI {
                public static final llOO10Ol I00000oIO = new llOO10Ol();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("inputType");
/* 16 */            l0OI0lloI l0oi0lloi = new l0OI0lloI();
/* 20 */            l0oi0lloi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi0lloi);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("language");
/* 42 */            l0OI0lloI l0oi0lloi2 = new l0OI0lloI();
/* 46 */            l0oi0lloi2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oi0lloi2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o0lll0ioo o0lll0iooVar = (o0lll0ioo) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o0lll0iooVar.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o0lll0iooVar.I00000oOI);
                }
            }
