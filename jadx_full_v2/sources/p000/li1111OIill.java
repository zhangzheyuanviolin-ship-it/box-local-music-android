            package p000;

            import java.lang.reflect.Field;
            import java.security.PrivilegedExceptionAction;
            import sun.misc.Unsafe;
            
            public final class li1111OIill extends ll0lOI {
                public static final Unsafe I00000oIO;
                public static final long I00000oOI;
                public static final long I0000Il00O;
                public static final long I0000O;
                public static final long I0000oI00;
                public static final long I0001Ioi1lo;

                static {
                    Unsafe unsafeI000O01llI0;
                    try {
                        try {
/* 1 */                     unsafeI000O01llI0 = Unsafe.getUnsafe();
                        } catch (SecurityException unused) {
                            try {
/* 35 */                        unsafeI000O01llI0 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, OoiioO0o.I0000Il00O);
                            } catch (Exception unused2) {
/* 38 */                        unsafeI000O01llI0 = I000O01llI0();
                            }
                        }
                        try {
/* 54 */                    I0000Il00O = unsafeI000O01llI0.objectFieldOffset(li11oiolO.class.getDeclaredField("I00iiO"));
/* 66 */                    I00000oOI = unsafeI000O01llI0.objectFieldOffset(li11oiolO.class.getDeclaredField("I00iiI"));
/* 78 */                    I0000O = unsafeI000O01llI0.objectFieldOffset(li11oiolO.class.getDeclaredField("I00iOIl"));
/* 92 */                    I0000oI00 = unsafeI000O01llI0.objectFieldOffset(li111il1iiIi.class.getDeclaredField("I00000oIO"));
/* 104 */                   I0001Ioi1lo = unsafeI000O01llI0.objectFieldOffset(li111il1iiIi.class.getDeclaredField("I00000oOI"));
/* 106 */                   I00000oIO = unsafeI000O01llI0;
                        } catch (NoSuchFieldException e) {
/* 110 */                   IioIoO10iOiI.I000lI(e);
                        }
                    } catch (Exception e2) {
/* 117 */               OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2);
                    }
                }

                public static Unsafe I000O01llI0() throws IllegalAccessException, SecurityException, IllegalArgumentException {
/* 9 */             for (Field field : Unsafe.class.getDeclaredFields()) {
/* 14 */                field.setAccessible(true);
/* 18 */                Object obj = field.get(null);
/* 26 */                if (Unsafe.class.isInstance(obj)) {
/* 32 */                    return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
/* 55 */            throw new NoSuchFieldError("the Unsafe");
                }

                @Override
                public final void I00000oIO(li111il1iiIi li111il1iiii, Thread thread) {
/* 5 */             I00000oIO.putObject(li111il1iiii, I0000oI00, thread);
                }

                @Override
                public final void I00000oOI(li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
/* 5 */             I00000oIO.putObject(li111il1iiii, I0001Ioi1lo, li111il1iiii2);
                }

                @Override
                public final boolean I0000Il00O(li11oiolO li11oiolo, li111il1iiIi li111il1iiii, li111il1iiIi li111il1iiii2) {
/* 8 */             return I00000oIO.compareAndSwapObject(li11oiolo, I0000Il00O, li111il1iiii, li111il1iiii2);
                }

                @Override
                public final boolean I0000O(li10iIlI1O li10iili1o, li10IIOIIO li10iioiio, li10IIOIIO li10iioiio2) {
/* 8 */             return I00000oIO.compareAndSwapObject(li10iili1o, I00000oOI, li10iioiio, li10iioiio2);
                }

                @Override
                public final li111il1iiIi I0000oI00(li10iIlI1O li10iili1o) {
                    li111il1iiIi li111il1iiii;
/* 1 */             li111il1iiIi li111il1iiii2 = li111il1iiIi.I0000Il00O;
/* 12 */            do {
/* 3 */                 li111il1iiii = li10iili1o.I00iiO;
/* 5 */                 if (li111il1iiii2 == li111il1iiii) {
                            break;
                        }
/* 12 */            } while (!I0000Il00O(li10iili1o, li111il1iiii, li111il1iiii2));
/* 29 */            return li111il1iiii;
                }

                @Override
                public final li10IIOIIO I0001Ioi1lo(li10iIlI1O li10iili1o) {
                    li10IIOIIO li10iioiio;
/* 1 */             li10IIOIIO li10iioiio2 = li10IIOIIO.I0000O;
/* 12 */            do {
/* 3 */                 li10iioiio = li10iili1o.I00iiI;
/* 5 */                 if (li10iioiio2 == li10iioiio) {
                            break;
                        }
/* 12 */            } while (!I0000O(li10iili1o, li10iioiio, li10iioiio2));
/* 29 */            return li10iioiio;
                }

                @Override
                public final boolean I000II(li11oiolO li11oiolo, Object obj, Object obj2) {
/* 8 */             return I00000oIO.compareAndSwapObject(li11oiolo, I0000O, obj, obj2);
                }
            }
