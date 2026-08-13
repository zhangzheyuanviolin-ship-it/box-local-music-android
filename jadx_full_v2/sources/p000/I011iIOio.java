            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class I011iIOio extends iOI011o {
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
/* 15 */                    unsafe = (Unsafe) AccessController.doPrivileged(new I011Ol0());
                        }
                        try {
/* 29 */                    I0000Il00O = unsafe.objectFieldOffset(I011iiii0i.class.getDeclaredField("I00iiO"));
/* 41 */                    I00000oOI = unsafe.objectFieldOffset(I011iiii0i.class.getDeclaredField("I00iiI"));
/* 53 */                    I0000O = unsafe.objectFieldOffset(I011iiii0i.class.getDeclaredField("I00iOIl"));
/* 67 */                    I0000oI00 = unsafe.objectFieldOffset(I011iO.class.getDeclaredField("I00000oIO"));
/* 79 */                    I0001Ioi1lo = unsafe.objectFieldOffset(I011iO.class.getDeclaredField("I00000oOI"));
/* 81 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 85 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 96 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final boolean I00000oIO(I011IO1I11OI i011io1i11oi, I010o0o0oO i010o0o0oO, I010o0o0oO i010o0o0oO2) {
/* 8 */             return I00000oIO.compareAndSwapObject(i011io1i11oi, I00000oOI, i010o0o0oO, i010o0o0oO2);
                }

                @Override
                public final boolean I00000oOI(I011iiii0i i011iiii0i, Object obj, Object obj2) {
/* 8 */             return I00000oIO.compareAndSwapObject(i011iiii0i, I0000O, obj, obj2);
                }

                @Override
                public final boolean I0000Il00O(I011iiii0i i011iiii0i, I011iO i011iO, I011iO i011iO2) {
/* 8 */             return I00000oIO.compareAndSwapObject(i011iiii0i, I0000Il00O, i011iO, i011iO2);
                }

                @Override
                public final I010o0o0oO I0000O(I011IO1I11OI i011io1i11oi) {
                    I010o0o0oO i010o0o0oO;
/* 1 */             I010o0o0oO i010o0o0oO2 = I010o0o0oO.I0000O;
/* 12 */            do {
/* 3 */                 i010o0o0oO = i011io1i11oi.I00iiI;
/* 5 */                 if (i010o0o0oO2 == i010o0o0oO) {
                            break;
                        }
/* 12 */            } while (!I00000oIO(i011io1i11oi, i010o0o0oO, i010o0o0oO2));
/* 49 */            return i010o0o0oO;
                }

                @Override
                public final I011iO I0000oI00(I011IO1I11OI i011io1i11oi) {
                    I011iO i011iO;
/* 1 */             I011iO i011iO2 = I011iO.I0000Il00O;
/* 12 */            do {
/* 3 */                 i011iO = i011io1i11oi.I00iiO;
/* 5 */                 if (i011iO2 == i011iO) {
                            break;
                        }
/* 12 */            } while (!I0000Il00O(i011io1i11oi, i011iO, i011iO2));
/* 49 */            return i011iO;
                }

                @Override
                public final void I0001Ioi1lo(I011iO i011iO, I011iO i011iO2) {
/* 5 */             I00000oIO.putObject(i011iO, I0001Ioi1lo, i011iO2);
                }

                @Override
                public final void I000II(I011iO i011iO, Thread thread) {
/* 5 */             I00000oIO.putObject(i011iO, I0000oI00, thread);
                }
            }
