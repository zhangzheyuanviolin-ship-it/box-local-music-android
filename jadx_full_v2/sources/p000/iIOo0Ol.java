            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class iIOo0Ol extends liiOI1lOOIOO {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(9));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(iIOoOi1oli.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(iIOoOi1oli.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(iIOoOi1oli.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(iIOo0i01l.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(iIOo0i01l.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final iIOloo00l0 I00000oIO(iIOoOi1oli iioooi1oli) {
                    iIOloo00l0 iioloo00l0;
/* 1 */             iIOloo00l0 iioloo00l02 = iIOloo00l0.I0000O;
/* 12 */            do {
/* 3 */                 iioloo00l0 = iioooi1oli.I00iiI;
/* 5 */                 if (iioloo00l02 == iioloo00l0) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(iioooi1oli, iioloo00l0, iioloo00l02));
/* 29 */            return iioloo00l0;
                }

                @Override
                public final iIOo0i01l I00000oOI(iIOoOi1oli iioooi1oli) {
                    iIOo0i01l iioo0i01l;
/* 1 */             iIOo0i01l iioo0i01l2 = iIOo0i01l.I0000Il00O;
/* 12 */            do {
/* 3 */                 iioo0i01l = iioooi1oli.I00iiO;
/* 5 */                 if (iioo0i01l2 == iioo0i01l) {
                            break;
                        }
/* 12 */            } while (!I000II(iioooi1oli, iioo0i01l, iioo0i01l2));
/* 29 */            return iioo0i01l;
                }

                @Override
                public final void I0000Il00O(iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
/* 5 */             I00000oIO.putObject(iioo0i01l, I0001Ioi1lo, iioo0i01l2);
                }

                @Override
                public final void I0000O(iIOo0i01l iioo0i01l, Thread thread) {
/* 5 */             I00000oIO.putObject(iioo0i01l, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(iIOoOi1oli iioooi1oli, iIOloo00l0 iioloo00l0, iIOloo00l0 iioloo00l02) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 iIOoOi1oli iioooi1oli2 = iioooi1oli;
/* 6 */                 iIOloo00l0 iioloo00l03 = iioloo00l0;
/* 7 */                 iIOloo00l0 iioloo00l04 = iioloo00l02;
/* 12 */                if (unsafe.compareAndSwapObject(iioooi1oli2, j, iioloo00l03, iioloo00l04)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iioooi1oli2, j) != iioloo00l03) {
/* 22 */                    return false;
                        }
/* 24 */                iioooi1oli = iioooi1oli2;
/* 25 */                iioloo00l0 = iioloo00l03;
/* 26 */                iioloo00l02 = iioloo00l04;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(iIOoOi1oli iioooi1oli, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 iIOoOi1oli iioooi1oli2 = iioooi1oli;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(iioooi1oli2, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iioooi1oli2, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                iioooi1oli = iioooi1oli2;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(iIOoOi1oli iioooi1oli, iIOo0i01l iioo0i01l, iIOo0i01l iioo0i01l2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 iIOoOi1oli iioooi1oli2 = iioooi1oli;
/* 6 */                 iIOo0i01l iioo0i01l3 = iioo0i01l;
/* 7 */                 iIOo0i01l iioo0i01l4 = iioo0i01l2;
/* 12 */                if (unsafe.compareAndSwapObject(iioooi1oli2, j, iioo0i01l3, iioo0i01l4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iioooi1oli2, j) != iioo0i01l3) {
/* 22 */                    return false;
                        }
/* 24 */                iioooi1oli = iioooi1oli2;
/* 25 */                iioo0i01l = iioo0i01l3;
/* 26 */                iioo0i01l2 = iioo0i01l4;
                    }
                }
            }
