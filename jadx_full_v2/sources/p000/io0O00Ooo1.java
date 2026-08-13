            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class io0O00Ooo1 implements OIOi0lOI {
                public static final io0O00Ooo1 I00000oIO = new io0O00Ooo1();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            iiio100i00IO iiio100i00io = new iiio100i00IO();
/* 20 */            iiio100i00io.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiio100i00io);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("eventCount");
/* 42 */            iiio100i00IO iiio100i00io2 = new iiio100i00IO();
/* 46 */            iiio100i00io2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiio100i00io2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("inferenceDurationStats");
/* 68 */            iiio100i00IO iiio100i00io3 = new iiio100i00IO();
/* 72 */            iiio100i00io3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iiio100i00io3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             ilI0il ili0il = (ilI0il) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ili0il.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, ili0il.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, ili0il.I0000Il00O);
                }
            }
