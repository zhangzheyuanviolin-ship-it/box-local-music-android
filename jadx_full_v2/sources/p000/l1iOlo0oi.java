            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l1iOlo0oi implements OIOi0lOI {
                public static final l1iOlo0oi I00000oIO = new l1iOlo0oi();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("detectorOptions");
/* 16 */            iiio100i00IO iiio100i00io = new iiio100i00IO();
/* 20 */            iiio100i00io.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiio100i00io);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            iiio100i00IO iiio100i00io2 = new iiio100i00IO();
/* 46 */            iiio100i00io2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiio100i00io2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ((ll00o1ll) obj).I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, li0o0II.NO_ERROR);
                }
            }
