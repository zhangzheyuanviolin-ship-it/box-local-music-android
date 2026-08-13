            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lliIoI11lOO implements OIOi0lOI {
                public static final lliIoI11lOO I00000oIO = new lliIoI11lOO();
                public static final IlIO00o1 I00000oOI;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("options");
/* 16 */            l0OI1ioioli l0oi1ioioli = new l0OI1ioioli();
/* 20 */            l0oi1ioioli.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l0oi1ioioli);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 9 */             ((OIOi0o) obj2).add(I00000oOI, ((o0oOI00li) obj).I00000oIO);
                }
            }
