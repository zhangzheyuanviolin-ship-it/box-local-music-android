            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0i0iOioOI1 implements OIOi0lOI {
                public static final l0i0iOioOI1 I00000oIO = new l0i0iOioOI1();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            io0o0I0li1 io0o0i0li1 = new io0o0I0li1();
/* 20 */            io0o0i0li1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(io0o0i0li1);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("eventCount");
/* 42 */            io0o0I0li1 io0o0i0li12 = new io0o0I0li1();
/* 46 */            io0o0i0li12.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(io0o0i0li12);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("inferenceDurationStats");
/* 68 */            io0o0I0li1 io0o0i0li13 = new io0o0I0li1();
/* 72 */            io0o0i0li13.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(io0o0i0li13);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             ioiiOII0li ioiioii0li = (ioiiOII0li) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ioiioii0li.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, ioiioii0li.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, ioiioii0li.I0000Il00O);
                }
            }
