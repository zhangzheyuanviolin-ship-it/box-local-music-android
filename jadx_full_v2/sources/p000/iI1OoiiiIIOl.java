            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iI1OoiiiIIOl implements OIOi0lOI {
                public static final iI1OoiiiIIOl I00000oIO = new iI1OoiiiIIOl();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("options");
/* 16 */            lioll0I0i1 lioll0i0i1 = new lioll0I0i1();
/* 20 */            lioll0i0i1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I00100l0 = OooioIOo1.I00100l0(olOO1i11110I00000oIO, lioll0i0i1, "roughDownloadDurationMs");
/* 33 */            lioll0I0i1 lioll0i0i12 = new lioll0I0i1();
/* 37 */            lioll0i0i12.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I00100l02 = OooioIOo1.I00100l0(olOO1i11110I00100l0, lioll0i0i12, "errorCode");
/* 50 */            lioll0I0i1 lioll0i0i13 = new lioll0I0i1();
/* 54 */            lioll0i0i13.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 61 */            OlOO1i11110 olOO1i11110I00100l03 = OooioIOo1.I00100l0(olOO1i11110I00100l02, lioll0i0i13, "exactDownloadDurationMs");
/* 67 */            lioll0I0i1 lioll0i0i14 = new lioll0I0i1();
/* 71 */            lioll0i0i14.I0000O = 4;
/* 73 */            VarHandle.storeStoreFence();
/* 78 */            OlOO1i11110 olOO1i11110I00100l04 = OooioIOo1.I00100l0(olOO1i11110I00100l03, lioll0i0i14, "downloadStatus");
/* 84 */            lioll0I0i1 lioll0i0i15 = new lioll0I0i1();
/* 88 */            lioll0i0i15.I0000O = 5;
/* 90 */            VarHandle.storeStoreFence();
/* 95 */            OlOO1i11110 olOO1i11110I00100l05 = OooioIOo1.I00100l0(olOO1i11110I00100l04, lioll0i0i15, "downloadFailureStatus");
/* 101 */           lioll0I0i1 lioll0i0i16 = new lioll0I0i1();
/* 105 */           lioll0i0i16.I0000O = 6;
/* 107 */           VarHandle.storeStoreFence();
/* 112 */           OlOO1i11110 olOO1i11110I00100l06 = OooioIOo1.I00100l0(olOO1i11110I00100l05, lioll0i0i16, "mddDownloadErrorCodes");
/* 118 */           lioll0I0i1 lioll0i0i17 = new lioll0I0i1();
/* 122 */           lioll0i0i17.I0000O = 7;
/* 124 */           VarHandle.storeStoreFence();
/* 127 */           olOO1i11110I00100l06.I001i1lo1io(lioll0i0i17);
/* 130 */           olOO1i11110I00100l06.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
