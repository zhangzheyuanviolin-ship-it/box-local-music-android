            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lliOio0OO0oI implements OIOi0lOI {
                public static final lliOio0OO0oI I00000oIO = new lliOio0OO0oI();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("options");
/* 16 */            l0OI1ioioli l0oi1ioioli = new l0OI1ioioli();
/* 20 */            l0oi1ioioli.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi1ioioli);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("sapiInferenceCommonEvent");
/* 42 */            l0OI1ioioli l0oi1ioioli2 = new l0OI1ioioli();
/* 46 */            l0oi1ioioli2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oi1ioioli2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o0oi1iOll1lI o0oi1ioll1li = (o0oi1iOll1lI) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o0oi1ioll1li.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o0oi1ioll1li.I00000oOI);
                }
            }
