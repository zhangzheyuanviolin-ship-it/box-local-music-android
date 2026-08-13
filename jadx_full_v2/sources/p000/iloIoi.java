            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class iloIoi extends lioI0I {
                public static final Unsafe I00000oIO;
                public static final long I00000oOI;
                public static final long I0000Il00O;
                public static final long I0000O;
                public static final long I0000oI00;
                public static final long I0001Ioi1lo;

                static {
                    Unsafe unsafe;
                    try {
                        try {
/* 1 */                     unsafe = Unsafe.getUnsafe();
                        } catch (SecurityException unused) {
/* 12 */                    unsafe = (Unsafe) AccessController.doPrivileged(OoiioO0o.I00000oOI);
                        }
                        try {
/* 26 */                    I0000Il00O = unsafe.objectFieldOffset(iloOO0lI0llo.class.getDeclaredField("I00iiO"));
/* 38 */                    I00000oOI = unsafe.objectFieldOffset(iloOO0lI0llo.class.getDeclaredField("I00iiI"));
/* 50 */                    I0000O = unsafe.objectFieldOffset(iloOO0lI0llo.class.getDeclaredField("I00iOIl"));
/* 64 */                    I0000oI00 = unsafe.objectFieldOffset(iloO01.class.getDeclaredField("I00000oIO"));
/* 76 */                    I0001Ioi1lo = unsafe.objectFieldOffset(iloO01.class.getDeclaredField("I00000oOI"));
/* 78 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 82 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 93 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final void I00000oIO(iloO01 iloo01, Thread thread) {
/* 5 */             I00000oIO.putObject(iloo01, I0000oI00, thread);
                }

                @Override
                public final void I00000oOI(iloO01 iloo01, iloO01 iloo012) {
/* 5 */             I00000oIO.putObject(iloo01, I0001Ioi1lo, iloo012);
                }

                @Override
                public final boolean I0000Il00O(iloOO0lI0llo ilooo0li0llo, iloO01 iloo01, iloO01 iloo012) {
/* 8 */             return I00000oIO.compareAndSwapObject(ilooo0li0llo, I0000Il00O, iloo01, iloo012);
                }

                @Override
                public final iloO01 I0000O(iloOO0lI0llo ilooo0li0llo) {
                    iloO01 iloo01;
/* 1 */             iloO01 iloo012 = iloO01.I0000Il00O;
/* 12 */            do {
/* 3 */                 iloo01 = ilooo0li0llo.I00iiO;
/* 5 */                 if (iloo012 == iloo01) {
                            break;
                        }
/* 12 */            } while (!I0000Il00O(ilooo0li0llo, iloo01, iloo012));
/* 29 */            return iloo01;
                }

                @Override
                public final iloI0IOOI I0000oI00(iloOO0lI0llo ilooo0li0llo) {
                    iloI0IOOI iloi0iooi;
/* 1 */             iloI0IOOI iloi0iooi2 = iloI0IOOI.I00000oOI;
                    while (true) {
/* 3 */                 iloi0iooi = ilooo0li0llo.I00iiI;
/* 5 */                 if (iloi0iooi2 == iloi0iooi) {
                            break;
                        }
/* 12 */                iloOO0lI0llo ilooo0li0llo2 = ilooo0li0llo;
/* 17 */                if (I00000oIO.compareAndSwapObject(ilooo0li0llo2, I00000oOI, iloi0iooi, iloi0iooi2)) {
                            break;
                        }
/* 20 */                ilooo0li0llo = ilooo0li0llo2;
                    }
/* 19 */            return iloi0iooi;
                }

                @Override
                public final boolean I0001Ioi1lo(iloOO0lI0llo ilooo0li0llo, Object obj, Object obj2) {
/* 8 */             return I00000oIO.compareAndSwapObject(ilooo0li0llo, I0000O, obj, obj2);
                }
            }
