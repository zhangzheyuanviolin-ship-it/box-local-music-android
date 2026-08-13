            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class i11l1l0 {
                public iOliil I00000oIO;

                public static i11l1l0 I00000oIO(i11oIoi1 i11oioi1, Object obj, i11oIoi1 i11oioi12, Object obj2) {
/* 3 */             i11l1l0 i11l1l0Var = new i11l1l0();
/* 10 */            iOliil ioliil = new iOliil(15);
/* 13 */            ioliil.I00iiI = i11oioi1;
/* 15 */            ioliil.I00iiO = obj;
/* 17 */            ioliil.I00iio = i11oioi12;
/* 19 */            ioliil.I00ilI0I1 = obj2;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            i11l1l0Var.I00000oIO = ioliil;
/* 26 */            VarHandle.storeStoreFence();
/* 204 */           return i11l1l0Var;
                }
            }
