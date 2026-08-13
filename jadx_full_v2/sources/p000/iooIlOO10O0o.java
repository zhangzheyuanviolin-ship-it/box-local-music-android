            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iooIlOO10O0o implements OIOi0lOI {
                public static final iooIlOO10O0o I00000oIO = new iooIlOO10O0o();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("options");
/* 16 */            ii100liOOI0 ii100liooi0 = new ii100liOOI0();
/* 20 */            ii100liooi0.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(ii100liooi0);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("eventType");
/* 42 */            ii100liOOI0 ii100liooi02 = new ii100liOOI0();
/* 46 */            ii100liooi02.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(ii100liooi02);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("errorCode");
/* 68 */            ii100liOOI0 ii100liooi03 = new ii100liOOI0();
/* 72 */            ii100liooi03.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(ii100liooi03);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lO1o1OIl lo1o1oil = (lO1o1OIl) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, lo1o1oil.I00000oIO);
/* 15 */            oIOi0o.add(I0000Il00O, (Object) null);
/* 22 */            oIOi0o.add(I0000O, lo1o1oil.I00000oOI);
                }
            }
