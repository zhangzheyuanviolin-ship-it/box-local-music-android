            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lo010I1o1i1i implements OIOi0lOI {
                public static final lo010I1o1i1i I00000oIO = new lo010I1o1i1i();
                public static final IlIO00o1 I00000oOI;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("sapiInferenceCommonEvent");
/* 16 */            l11OIolOi l11oioloi = new l11OIolOi();
/* 20 */            l11oioloi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(l11oioloi);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 9 */             ((OIOi0o) obj2).add(I00000oOI, ((o10iO00iOl) obj).I00000oIO);
                }
            }
