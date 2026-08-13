            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class l01l0iooIil extends liooi0 {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(19));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(l01loiOOo11l.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(l01loiOOo11l.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(l01loiOOo11l.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(l01l0oIOl1.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(l01l0oIOl1.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final l01Olo10 I00000oIO(l01iOilOl1il l01ioilol1il) {
                    l01Olo10 l01olo10;
/* 1 */             l01Olo10 l01olo102 = l01Olo10.I0000O;
/* 12 */            do {
/* 3 */                 l01olo10 = l01ioilol1il.I00iiI;
/* 5 */                 if (l01olo102 == l01olo10) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(l01ioilol1il, l01olo10, l01olo102));
/* 29 */            return l01olo10;
                }

                @Override
                public final l01l0oIOl1 I00000oOI(l01iOilOl1il l01ioilol1il) {
                    l01l0oIOl1 l01l0oiol1;
/* 1 */             l01l0oIOl1 l01l0oiol12 = l01l0oIOl1.I0000Il00O;
/* 12 */            do {
/* 3 */                 l01l0oiol1 = l01ioilol1il.I00iiO;
/* 5 */                 if (l01l0oiol12 == l01l0oiol1) {
                            break;
                        }
/* 12 */            } while (!I000II(l01ioilol1il, l01l0oiol1, l01l0oiol12));
/* 29 */            return l01l0oiol1;
                }

                @Override
                public final void I0000Il00O(l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
/* 5 */             I00000oIO.putObject(l01l0oiol1, I0001Ioi1lo, l01l0oiol12);
                }

                @Override
                public final void I0000O(l01l0oIOl1 l01l0oiol1, Thread thread) {
/* 5 */             I00000oIO.putObject(l01l0oiol1, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(l01iOilOl1il l01ioilol1il, l01Olo10 l01olo10, l01Olo10 l01olo102) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 l01iOilOl1il l01ioilol1il2 = l01ioilol1il;
/* 6 */                 l01Olo10 l01olo103 = l01olo10;
/* 7 */                 l01Olo10 l01olo104 = l01olo102;
/* 12 */                if (unsafe.compareAndSwapObject(l01ioilol1il2, j, l01olo103, l01olo104)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(l01ioilol1il2, j) != l01olo103) {
/* 22 */                    return false;
                        }
/* 24 */                l01ioilol1il = l01ioilol1il2;
/* 25 */                l01olo10 = l01olo103;
/* 26 */                l01olo102 = l01olo104;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(l01loiOOo11l l01loiooo11l, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 l01loiOOo11l l01loiooo11l2 = l01loiooo11l;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(l01loiooo11l2, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(l01loiooo11l2, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                l01loiooo11l = l01loiooo11l2;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(l01loiOOo11l l01loiooo11l, l01l0oIOl1 l01l0oiol1, l01l0oIOl1 l01l0oiol12) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 l01loiOOo11l l01loiooo11l2 = l01loiooo11l;
/* 6 */                 l01l0oIOl1 l01l0oiol13 = l01l0oiol1;
/* 7 */                 l01l0oIOl1 l01l0oiol14 = l01l0oiol12;
/* 12 */                if (unsafe.compareAndSwapObject(l01loiooo11l2, j, l01l0oiol13, l01l0oiol14)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(l01loiooo11l2, j) != l01l0oiol13) {
/* 22 */                    return false;
                        }
/* 24 */                l01loiooo11l = l01loiooo11l2;
/* 25 */                l01l0oiol1 = l01l0oiol13;
/* 26 */                l01l0oiol12 = l01l0oiol14;
                    }
                }
            }
