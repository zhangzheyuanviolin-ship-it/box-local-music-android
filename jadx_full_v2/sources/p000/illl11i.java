            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class illl11i implements OIOi0lOI {
                public static final illl11i I00000oIO = new illl11i();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            iiooo00 iiooo00Var = new iiooo00();
/* 20 */            iiooo00Var.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000lI = OooioIOo1.I000lI(olOO1i11110I00000oIO, iiooo00Var, "eventCount");
/* 33 */            iiooo00 iiooo00Var2 = new iiooo00();
/* 37 */            iiooo00Var2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000lI2 = OooioIOo1.I000lI(olOO1i11110I000lI, iiooo00Var2, "inferenceDurationStats");
/* 50 */            iiooo00 iiooo00Var3 = new iiooo00();
/* 54 */            iiooo00Var3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I000lI2.I001i1lo1io(iiooo00Var3);
/* 62 */            olOO1i11110I000lI2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
