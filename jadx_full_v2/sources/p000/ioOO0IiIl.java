            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class ioOO0IiIl extends lioiOiO {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(15));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(ioOi11iiI.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(ioOi11iiI.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(ioOi11iiI.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(ioOOIoo.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(ioOOIoo.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final ioO100IioiO0 I00000oIO(ioOI0o10I iooi0o10i) {
                    ioO100IioiO0 ioo100iioio0;
/* 1 */             ioO100IioiO0 ioo100iioio02 = ioO100IioiO0.I0000O;
/* 12 */            do {
/* 3 */                 ioo100iioio0 = iooi0o10i.I00iiI;
/* 5 */                 if (ioo100iioio02 == ioo100iioio0) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(iooi0o10i, ioo100iioio0, ioo100iioio02));
/* 29 */            return ioo100iioio0;
                }

                @Override
                public final ioOOIoo I00000oOI(ioOI0o10I iooi0o10i) {
                    ioOOIoo ioooioo;
/* 1 */             ioOOIoo ioooioo2 = ioOOIoo.I0000Il00O;
/* 12 */            do {
/* 3 */                 ioooioo = iooi0o10i.I00iiO;
/* 5 */                 if (ioooioo2 == ioooioo) {
                            break;
                        }
/* 12 */            } while (!I000II(iooi0o10i, ioooioo, ioooioo2));
/* 29 */            return ioooioo;
                }

                @Override
                public final void I0000Il00O(ioOOIoo ioooioo, ioOOIoo ioooioo2) {
/* 5 */             I00000oIO.putObject(ioooioo, I0001Ioi1lo, ioooioo2);
                }

                @Override
                public final void I0000O(ioOOIoo ioooioo, Thread thread) {
/* 5 */             I00000oIO.putObject(ioooioo, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(ioOI0o10I iooi0o10i, ioO100IioiO0 ioo100iioio0, ioO100IioiO0 ioo100iioio02) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 ioOI0o10I iooi0o10i2 = iooi0o10i;
/* 6 */                 ioO100IioiO0 ioo100iioio03 = ioo100iioio0;
/* 7 */                 ioO100IioiO0 ioo100iioio04 = ioo100iioio02;
/* 12 */                if (unsafe.compareAndSwapObject(iooi0o10i2, j, ioo100iioio03, ioo100iioio04)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi0o10i2, j) != ioo100iioio03) {
/* 22 */                    return false;
                        }
/* 24 */                iooi0o10i = iooi0o10i2;
/* 25 */                ioo100iioio0 = ioo100iioio03;
/* 26 */                ioo100iioio02 = ioo100iioio04;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi11iiI iooi11iii, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 ioOi11iiI iooi11iii2 = iooi11iii;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(iooi11iii2, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi11iii2, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                iooi11iii = iooi11iii2;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(ioOi11iiI iooi11iii, ioOOIoo ioooioo, ioOOIoo ioooioo2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 ioOi11iiI iooi11iii2 = iooi11iii;
/* 6 */                 ioOOIoo ioooioo3 = ioooioo;
/* 7 */                 ioOOIoo ioooioo4 = ioooioo2;
/* 12 */                if (unsafe.compareAndSwapObject(iooi11iii2, j, ioooioo3, ioooioo4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi11iii2, j) != ioooioo3) {
/* 22 */                    return false;
                        }
/* 24 */                iooi11iii = iooi11iii2;
/* 25 */                ioooioo = ioooioo3;
/* 26 */                ioooioo2 = ioooioo4;
                    }
                }
            }
