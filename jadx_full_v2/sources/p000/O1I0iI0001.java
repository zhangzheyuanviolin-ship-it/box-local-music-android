            package p000;

            import sun.misc.Unsafe;
            
            public class O1I0iI0001 {
                public static final long I00000oIO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(O1I0iI0001.class.getDeclaredField("_cur$volatile"));
                private volatile Object _cur$volatile = new O1I0l0iol(8, false);

                public final boolean I00000oIO(Runnable runnable) {
                    O1I0iI0001 o1I0iI0001;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00000oIO;
/* 10 */                O1I0l0iol o1I0l0iol = (O1I0l0iol) unsafe.getObjectVolatile(this, j);
/* 12 */                int iI00000oIO = o1I0l0iol.I00000oIO(runnable);
/* 17 */                if (iI00000oIO == 0) {
/* 16 */                    return true;
                        }
/* 19 */                if (iI00000oIO == 1) {
/* 32 */                    o1I0iI0001 = this;
/* 33 */                    unsafe.compareAndSwapObject(o1I0iI0001, j, o1I0l0iol, o1I0l0iol.I0000Il00O());
                        } else {
/* 22 */                    if (iI00000oIO == 2) {
/* 26 */                        return false;
                            }
/* 24 */                    o1I0iI0001 = this;
                        }
/* 36 */                this = o1I0iI0001;
                    }
                }

                public final int I00000oOI() {
/* 9 */             O1I0l0iol o1I0l0iol = (O1I0l0iol) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00000oIO);
/* 11 */            o1I0l0iol.getClass();
/* 18 */            long longVolatile = I1Ioolli0l0o.I00000oIO.getLongVolatile(o1I0l0iol, O1I0l0iol.I000II);
/* 41 */            return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
                }

                public final Object I0000Il00O() {
                    while (true) {
/* 10 */                O1I0l0iol o1I0l0iol = (O1I0l0iol) I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00000oIO);
/* 12 */                Object objI0000O = o1I0l0iol.I0000O();
/* 18 */                if (objI0000O != O1I0l0iol.I0000oI00) {
/* 20 */                    return objI0000O;
                        }
/* 30 */                I1Ioolli0l0o.I00000oIO.compareAndSwapObject(this, I00000oIO, o1I0l0iol, o1I0l0iol.I0000Il00O());
                    }
                }
            }
