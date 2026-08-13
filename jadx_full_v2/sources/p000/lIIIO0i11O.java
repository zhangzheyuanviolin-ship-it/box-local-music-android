            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lIIIO0i11O implements OIOi0lOI {
                public static final lIIIO0i11O I00000oIO = new lIIIO0i11O();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorSpace");
/* 16 */            iiOII1o1OiI iioii1o1oii = new iiOII1o1OiI();
/* 20 */            iioii1o1oii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iioii1o1oii);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("errorCode");
/* 42 */            iiOII1o1OiI iioii1o1oii2 = new iiOII1o1OiI();
/* 46 */            iioii1o1oii2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iioii1o1oii2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lll0io1I lll0io1i = (lll0io1I) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, lll0io1i.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, lll0io1i.I00000oOI);
                }
            }
