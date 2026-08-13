            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l1Il0OI1 implements OIOi0lOI {
                public static final l1Il0OI1 I00000oIO = new l1Il0OI1();
                public static final IlIO00o1 I00000oOI;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("format");
/* 16 */            io0o0I0li1 io0o0i0li1 = new io0o0I0li1();
/* 20 */            io0o0i0li1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(io0o0i0li1);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 9 */             ((OIOi0o) obj2).add(I00000oOI, ((o0Ii11Oi1li) obj).I00000oIO);
                }
            }
