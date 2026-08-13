            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIIli1l implements OIOi0lOI {
                public static final iIIli1l I00000oIO = new iIIli1l();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("detectorOptions");
/* 16 */            lioll0I0i1 lioll0i0i1 = new lioll0I0i1();
/* 20 */            lioll0i0i1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I00100l0 = OooioIOo1.I00100l0(olOO1i11110I00000oIO, lioll0i0i1, "errorCode");
/* 33 */            lioll0I0i1 lioll0i0i12 = new lioll0I0i1();
/* 37 */            lioll0i0i12.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I00100l02 = OooioIOo1.I00100l0(olOO1i11110I00100l0, lioll0i0i12, "durationMs");
/* 50 */            lioll0I0i1 lioll0i0i13 = new lioll0I0i1();
/* 54 */            lioll0i0i13.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I00100l02.I001i1lo1io(lioll0i0i13);
/* 62 */            olOO1i11110I00100l02.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
