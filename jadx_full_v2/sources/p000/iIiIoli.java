            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIiIoli implements OIOi0lOI {
                public static final iIiIoli I00000oIO = new iIiIoli();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("modality");
/* 16 */            lioll0I0i1 lioll0i0i1 = new lioll0I0i1();
/* 20 */            lioll0i0i1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(lioll0i0i1);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("size");
/* 42 */            lioll0I0i1 lioll0i0i12 = new lioll0I0i1();
/* 46 */            lioll0i0i12.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(lioll0i0i12);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("textInfo");
/* 68 */            lioll0I0i1 lioll0i0i13 = new lioll0I0i1();
/* 72 */            lioll0i0i13.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(lioll0i0i13);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             iOIOii0OI00O ioioii0oi00o = (iOIOii0OI00O) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ioioii0oi00o.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, ioioii0oi00o.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, ioioii0oi00o.I0000Il00O);
                }
            }
