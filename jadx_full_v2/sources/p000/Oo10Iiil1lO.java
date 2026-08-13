            package p000;

            import sun.misc.Unsafe;
            
            public final class Oo10Iiil1lO extends O010olO {
                public static final long I00io1l = I1Ioolli0l0o.I00000oIO.objectFieldOffset(Oo10Iiil1lO.class.getDeclaredField("_state$volatile"));
                public Thread I00ilI0I1;
                public IiiOlIiio I00ilO0;
                private volatile int _state$volatile;

                public static void I00100o1O0lo(int i) {
/* 29 */            throw new IllegalStateException(("Illegal state " + i).toString());
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             return true;
                }

                @Override
                public final void I000oI1ioi(Throwable th) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00io1l;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 10 */                if (intVolatile != 0) {
/* 13 */                    if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
/* 26 */                        return;
                            }
/* 21 */                    I00100o1O0lo(intVolatile);
/* 25 */                    throw null;
                        }
/* 30 */                Oo10Iiil1lO oo10Iiil1lO = this;
/* 35 */                if (unsafe.compareAndSwapInt(oo10Iiil1lO, I00io1l, intVolatile, 2)) {
/* 39 */                    oo10Iiil1lO.I00ilI0I1.interrupt();
/* 42 */                    unsafe.putIntVolatile(oo10Iiil1lO, j, 3);
/* 45 */                    return;
                        }
/* 46 */                this = oo10Iiil1lO;
                    }
                }

                public final void I00100l0() {
                    Oo10Iiil1lO oo10Iiil1lO;
                    while (true) {
/* 1 */                 Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 3 */                 long j = I00io1l;
/* 5 */                 int intVolatile = unsafe.getIntVolatile(this, j);
/* 9 */                 if (intVolatile == 0) {
/* 29 */                    oo10Iiil1lO = this;
/* 34 */                    if (unsafe.compareAndSwapInt(oo10Iiil1lO, j, intVolatile, 1)) {
/* 36 */                        IiiOlIiio iiiOlIiio = oo10Iiil1lO.I00ilO0;
/* 38 */                        if (iiiOlIiio != null) {
/* 40 */                            iiiOlIiio.I00000oOI();
/* 43 */                            return;
                                }
/* 43 */                        return;
                            }
                        } else {
/* 12 */                    if (intVolatile != 2) {
/* 15 */                        if (intVolatile == 3) {
/* 17 */                            Thread.interrupted();
/* 20 */                            return;
                                } else {
/* 21 */                            I00100o1O0lo(intVolatile);
/* 25 */                            throw null;
                                }
                            }
/* 26 */                    oo10Iiil1lO = this;
                        }
/* 44 */                this = oo10Iiil1lO;
                    }
                }
            }
