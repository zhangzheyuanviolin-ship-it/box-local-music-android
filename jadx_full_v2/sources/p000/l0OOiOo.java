            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0OOiOo implements OIOi0lOI {
                public static final l0OOiOo I00000oIO = new l0OOiOo();
                public static final IlIO00o1 I00000oOI;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            iiooo00 iiooo00Var = new iiooo00();
/* 20 */            iiooo00Var.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiooo00Var);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 9 */             ((OIOi0o) obj2).add(I00000oOI, ((lIo0010ol) obj).I00000oIO);
                }
            }
