            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class ioOO0OllIil0 extends lioii00ii {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(14));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(ioOi0ll1.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(ioOi0ll1.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(ioOi0ll1.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(ioOOO0liOIIo.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(ioOOO0liOIIo.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final ioO100ol0 I00000oIO(ioOI0i0o11I iooi0i0o11i) {
                    ioO100ol0 ioo100ol0;
/* 1 */             ioO100ol0 ioo100ol02 = ioO100ol0.I0000O;
/* 12 */            do {
/* 3 */                 ioo100ol0 = iooi0i0o11i.I00iiI;
/* 5 */                 if (ioo100ol02 == ioo100ol0) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(iooi0i0o11i, ioo100ol0, ioo100ol02));
/* 29 */            return ioo100ol0;
                }

                @Override
                public final ioOOO0liOIIo I00000oOI(ioOI0i0o11I iooi0i0o11i) {
                    ioOOO0liOIIo ioooo0lioiio;
/* 1 */             ioOOO0liOIIo ioooo0lioiio2 = ioOOO0liOIIo.I0000Il00O;
/* 12 */            do {
/* 3 */                 ioooo0lioiio = iooi0i0o11i.I00iiO;
/* 5 */                 if (ioooo0lioiio2 == ioooo0lioiio) {
                            break;
                        }
/* 12 */            } while (!I000II(iooi0i0o11i, ioooo0lioiio, ioooo0lioiio2));
/* 29 */            return ioooo0lioiio;
                }

                @Override
                public final void I0000Il00O(ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
/* 5 */             I00000oIO.putObject(ioooo0lioiio, I0001Ioi1lo, ioooo0lioiio2);
                }

                @Override
                public final void I0000O(ioOOO0liOIIo ioooo0lioiio, Thread thread) {
/* 5 */             I00000oIO.putObject(ioooo0lioiio, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(ioOI0i0o11I iooi0i0o11i, ioO100ol0 ioo100ol0, ioO100ol0 ioo100ol02) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 ioOI0i0o11I iooi0i0o11i2 = iooi0i0o11i;
/* 6 */                 ioO100ol0 ioo100ol03 = ioo100ol0;
/* 7 */                 ioO100ol0 ioo100ol04 = ioo100ol02;
/* 12 */                if (unsafe.compareAndSwapObject(iooi0i0o11i2, j, ioo100ol03, ioo100ol04)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi0i0o11i2, j) != ioo100ol03) {
/* 22 */                    return false;
                        }
/* 24 */                iooi0i0o11i = iooi0i0o11i2;
/* 25 */                ioo100ol0 = ioo100ol03;
/* 26 */                ioo100ol02 = ioo100ol04;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(ioOi0ll1 iooi0ll1, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 ioOi0ll1 iooi0ll12 = iooi0ll1;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(iooi0ll12, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi0ll12, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                iooi0ll1 = iooi0ll12;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(ioOi0ll1 iooi0ll1, ioOOO0liOIIo ioooo0lioiio, ioOOO0liOIIo ioooo0lioiio2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 ioOi0ll1 iooi0ll12 = iooi0ll1;
/* 6 */                 ioOOO0liOIIo ioooo0lioiio3 = ioooo0lioiio;
/* 7 */                 ioOOO0liOIIo ioooo0lioiio4 = ioooo0lioiio2;
/* 12 */                if (unsafe.compareAndSwapObject(iooi0ll12, j, ioooo0lioiio3, ioooo0lioiio4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iooi0ll12, j) != ioooo0lioiio3) {
/* 22 */                    return false;
                        }
/* 24 */                iooi0ll1 = iooi0ll12;
/* 25 */                ioooo0lioiio = ioooo0lioiio3;
/* 26 */                ioooo0lioiio2 = ioooo0lioiio4;
                    }
                }
            }
