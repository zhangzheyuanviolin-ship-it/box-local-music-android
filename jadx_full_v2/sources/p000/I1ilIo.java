            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1ilIo implements OIOi0lOI {
                public static final I1ilIo I00000oIO = new I1ilIo();
                public static final IlIO00o1 I00000oOI;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("messagingClientEvent");
/* 16 */            I1Ool1110li i1Ool1110li = new I1Ool1110li();
/* 20 */            i1Ool1110li.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(i1Ool1110li);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 9 */             ((OIOi0o) obj2).add(I00000oOI, ((O1lOll) obj).I00000oIO);
                }
            }
