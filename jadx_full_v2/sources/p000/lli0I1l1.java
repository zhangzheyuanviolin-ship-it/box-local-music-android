            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lli0I1l1 implements OIOi0lOI {
                public static final lli0I1l1 I00000oIO = new lli0I1l1();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("outputType");
/* 16 */            l0OI1ioioli l0oi1ioioli = new l0OI1ioioli();
/* 20 */            l0oi1ioioli.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi1ioioli);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("language");
/* 42 */            l0OI1ioioli l0oi1ioioli2 = new l0OI1ioioli();
/* 46 */            l0oi1ioioli2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(l0oi1ioioli2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             o0o0I0i01Ii o0o0i0i01ii = (o0o0I0i01Ii) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, o0o0i0i01ii.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, o0o0i0i01ii.I00000oOI);
                }
            }
