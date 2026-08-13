            package p000;

            import sun.misc.Unsafe;
            
            public abstract class IOlOio11 {
                public static final long I00iOIl;
                public static final long I00iiI;
                public static final int I00iiO = 0;
                private volatile Object _next$volatile;
                private volatile Object _prev$volatile;

                static {
/* 1 */             Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 15 */            I00iOIl = unsafe.objectFieldOffset(IOlOio11.class.getDeclaredField("_next$volatile"));
/* 27 */            I00iiI = unsafe.objectFieldOffset(IOlOio11.class.getDeclaredField("_prev$volatile"));
                }

                public IOlOio11(Oii1O0I oii1O0I) {
/* 4 */             this._prev$volatile = oii1O0I;
                }

                public final void I00000oIO() {
/* 6 */             I1Ioolli0l0o.I00000oIO.putObjectVolatile(this, I00iiI, (Object) null);
                }

                public final IOlOio11 I0000Il00O() {
/* 5 */             Object objectVolatile = I1Ioolli0l0o.I00000oIO.getObjectVolatile(this, I00iOIl);
/* 11 */            if (objectVolatile == IOlOiIllI01O.I00000oIO) {
/* 13 */                return null;
                    }
/* 15 */            return (IOlOio11) objectVolatile;
                }

                public abstract boolean I0000O();

                public final void I0000oI00() {
                    IOlOio11 iOlOio11;
                    Unsafe unsafe;
                    Object objectVolatile;
/* 5 */             if (I0000Il00O() == null) {
/* 7 */                 return;
                    }
                    while (true) {
/* 8 */                 Unsafe unsafe2 = I1Ioolli0l0o.I00000oIO;
/* 10 */                long j = I00iiI;
/* 16 */                IOlOio11 iOlOio112 = (IOlOio11) unsafe2.getObjectVolatile(this, j);
/* 18 */                while (iOlOio112 != null && iOlOio112.I0000O()) {
/* 32 */                    iOlOio112 = (IOlOio11) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iOlOio112, j);
                        }
/* 35 */                IOlOio11 iOlOio11I0000Il00O = I0000Il00O();
/* 50 */                do {
/* 39 */                    iOlOio11 = iOlOio11I0000Il00O;
/* 44 */                    if (!iOlOio11.I0000O()) {
                                break;
                            } else {
/* 46 */                        iOlOio11I0000Il00O = iOlOio11.I0000Il00O();
                            }
/* 50 */                } while (iOlOio11I0000Il00O != null);
/* 73 */                do {
/* 52 */                    unsafe = I1Ioolli0l0o.I00000oIO;
/* 54 */                    objectVolatile = unsafe.getObjectVolatile(iOlOio11, j);
/* 73 */                } while (!unsafe.compareAndSwapObject(iOlOio11, I00iiI, objectVolatile, ((IOlOio11) objectVolatile) == null ? null : iOlOio112));
/* 75 */                if (iOlOio112 != null) {
/* 79 */                    unsafe.putObjectVolatile(iOlOio112, I00iOIl, iOlOio11);
                        }
/* 86 */                if (!iOlOio11.I0000O() || iOlOio11.I0000Il00O() == null) {
/* 94 */                    if (iOlOio112 == null || !iOlOio112.I0000O()) {
/* 113 */                       return;
                            }
                        }
                    }
                }
            }
