            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lIoii1l01l0i {
                public static final Oi10Ii1i1lo I00000oIO(Throwable th) {
/* 3 */             Oi10Ii1i1lo oi10Ii1i1lo = new Oi10Ii1i1lo();
/* 6 */             oi10Ii1i1lo.I00iOIl = th;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oi10Ii1i1lo;
                }

                public static final void I00000oOI(Object obj) throws Throwable {
/* 3 */             if (obj instanceof Oi10Ii1i1lo) {
/* 49 */                throw ((Oi10Ii1i1lo) obj).I00iOIl;
                    }
                }
            }
