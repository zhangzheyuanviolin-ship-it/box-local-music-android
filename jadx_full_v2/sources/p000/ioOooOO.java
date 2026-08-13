            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class ioOooOO extends lioiiOOIoO {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(16));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(ioi01lIi1.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(ioi01lIi1.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(ioi01lIi1.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(ioOooi000.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(ioOooi000.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final ioOlIi I00000oIO(ioOlolI0ll00 ioololi0ll00) {
                    ioOlIi ioolii;
/* 1 */             ioOlIi ioolii2 = ioOlIi.I0000O;
/* 12 */            do {
/* 3 */                 ioolii = ioololi0ll00.I00iiI;
/* 5 */                 if (ioolii2 == ioolii) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(ioololi0ll00, ioolii, ioolii2));
/* 29 */            return ioolii;
                }

                @Override
                public final ioOooi000 I00000oOI(ioOlolI0ll00 ioololi0ll00) {
                    ioOooi000 iooooi000;
/* 1 */             ioOooi000 iooooi0002 = ioOooi000.I0000Il00O;
/* 12 */            do {
/* 3 */                 iooooi000 = ioololi0ll00.I00iiO;
/* 5 */                 if (iooooi0002 == iooooi000) {
                            break;
                        }
/* 12 */            } while (!I000II(ioololi0ll00, iooooi000, iooooi0002));
/* 29 */            return iooooi000;
                }

                @Override
                public final void I0000Il00O(ioOooi000 iooooi000, ioOooi000 iooooi0002) {
/* 5 */             I00000oIO.putObject(iooooi000, I0001Ioi1lo, iooooi0002);
                }

                @Override
                public final void I0000O(ioOooi000 iooooi000, Thread thread) {
/* 5 */             I00000oIO.putObject(iooooi000, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(ioOlolI0ll00 ioololi0ll00, ioOlIi ioolii, ioOlIi ioolii2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 ioOlolI0ll00 ioololi0ll002 = ioololi0ll00;
/* 6 */                 ioOlIi ioolii3 = ioolii;
/* 7 */                 ioOlIi ioolii4 = ioolii2;
/* 12 */                if (unsafe.compareAndSwapObject(ioololi0ll002, j, ioolii3, ioolii4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(ioololi0ll002, j) != ioolii3) {
/* 22 */                    return false;
                        }
/* 24 */                ioololi0ll00 = ioololi0ll002;
/* 25 */                ioolii = ioolii3;
/* 26 */                ioolii2 = ioolii4;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioi01lIi1 ioi01lii1, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 ioi01lIi1 ioi01lii12 = ioi01lii1;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(ioi01lii12, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(ioi01lii12, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                ioi01lii1 = ioi01lii12;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(ioi01lIi1 ioi01lii1, ioOooi000 iooooi000, ioOooi000 iooooi0002) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 ioi01lIi1 ioi01lii12 = ioi01lii1;
/* 6 */                 ioOooi000 iooooi0003 = iooooi000;
/* 7 */                 ioOooi000 iooooi0004 = iooooi0002;
/* 12 */                if (unsafe.compareAndSwapObject(ioi01lii12, j, iooooi0003, iooooi0004)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(ioi01lii12, j) != iooooi0003) {
/* 22 */                    return false;
                        }
/* 24 */                ioi01lii1 = ioi01lii12;
/* 25 */                iooooi000 = iooooi0003;
/* 26 */                iooooi0002 = iooooi0004;
                    }
                }
            }
