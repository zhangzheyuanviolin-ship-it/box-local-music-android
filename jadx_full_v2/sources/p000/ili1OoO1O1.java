            package p000;

            import java.security.AccessController;
            import java.security.PrivilegedActionException;
            import sun.misc.Unsafe;
            
            public final class ili1OoO1O1 extends lio0Oolo1li1 {
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
/* 17 */                    unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(12));
                        }
                        try {
/* 31 */                    I0000Il00O = unsafe.objectFieldOffset(iliIlI0o00ii.class.getDeclaredField("I00iiO"));
/* 43 */                    I00000oOI = unsafe.objectFieldOffset(iliIlI0o00ii.class.getDeclaredField("I00iiI"));
/* 55 */                    I0000O = unsafe.objectFieldOffset(iliIlI0o00ii.class.getDeclaredField("I00iOIl"));
/* 69 */                    I0000oI00 = unsafe.objectFieldOffset(ili1iI1O0lIl.class.getDeclaredField("I00000oIO"));
/* 81 */                    I0001Ioi1lo = unsafe.objectFieldOffset(ili1iI1O0lIl.class.getDeclaredField("I00000oOI"));
/* 83 */                    I00000oIO = unsafe;
                        } catch (NoSuchFieldException e) {
/* 87 */                    IioIoO10iOiI.I000lI(e);
                        }
                    } catch (PrivilegedActionException e2) {
/* 98 */                OIiilo1Ool0o.I000iOII("Could not initialize intrinsics", e2.getCause());
                    }
                }

                @Override
                public final ili1II I00000oIO(iliIlI0o00ii iliili0o00ii) {
                    ili1II ili1ii;
/* 1 */             ili1II ili1ii2 = ili1II.I0000O;
/* 12 */            do {
/* 3 */                 ili1ii = iliili0o00ii.I00iiI;
/* 5 */                 if (ili1ii2 == ili1ii) {
                            break;
                        }
/* 12 */            } while (!I0000oI00(iliili0o00ii, ili1ii, ili1ii2));
/* 29 */            return ili1ii;
                }

                @Override
                public final ili1iI1O0lIl I00000oOI(iliIlI0o00ii iliili0o00ii) {
                    ili1iI1O0lIl ili1ii1o0lil;
/* 1 */             ili1iI1O0lIl ili1ii1o0lil2 = ili1iI1O0lIl.I0000Il00O;
/* 12 */            do {
/* 3 */                 ili1ii1o0lil = iliili0o00ii.I00iiO;
/* 5 */                 if (ili1ii1o0lil2 == ili1ii1o0lil) {
                            break;
                        }
/* 12 */            } while (!I000II(iliili0o00ii, ili1ii1o0lil, ili1ii1o0lil2));
/* 29 */            return ili1ii1o0lil;
                }

                @Override
                public final void I0000Il00O(ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
/* 5 */             I00000oIO.putObject(ili1ii1o0lil, I0001Ioi1lo, ili1ii1o0lil2);
                }

                @Override
                public final void I0000O(ili1iI1O0lIl ili1ii1o0lil, Thread thread) {
/* 5 */             I00000oIO.putObject(ili1ii1o0lil, I0000oI00, thread);
                }

                @Override
                public final boolean I0000oI00(iliIlI0o00ii iliili0o00ii, ili1II ili1ii, ili1II ili1ii2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I00000oOI;
/* 5 */                 iliIlI0o00ii iliili0o00ii2 = iliili0o00ii;
/* 6 */                 ili1II ili1ii3 = ili1ii;
/* 7 */                 ili1II ili1ii4 = ili1ii2;
/* 12 */                if (unsafe.compareAndSwapObject(iliili0o00ii2, j, ili1ii3, ili1ii4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iliili0o00ii2, j) != ili1ii3) {
/* 22 */                    return false;
                        }
/* 24 */                iliili0o00ii = iliili0o00ii2;
/* 25 */                ili1ii = ili1ii3;
/* 26 */                ili1ii2 = ili1ii4;
                    }
                }

                @Override
                public final boolean I0001Ioi1lo(iliIlI0o00ii iliili0o00ii, Object obj, Object obj2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000O;
/* 5 */                 iliIlI0o00ii iliili0o00ii2 = iliili0o00ii;
/* 6 */                 Object obj3 = obj;
/* 7 */                 Object obj4 = obj2;
/* 12 */                if (unsafe.compareAndSwapObject(iliili0o00ii2, j, obj3, obj4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iliili0o00ii2, j) != obj3) {
/* 22 */                    return false;
                        }
/* 24 */                iliili0o00ii = iliili0o00ii2;
/* 25 */                obj = obj3;
/* 26 */                obj2 = obj4;
                    }
                }

                @Override
                public final boolean I000II(iliIlI0o00ii iliili0o00ii, ili1iI1O0lIl ili1ii1o0lil, ili1iI1O0lIl ili1ii1o0lil2) {
                    while (true) {
/* 1 */                 Unsafe unsafe = I00000oIO;
/* 3 */                 long j = I0000Il00O;
/* 5 */                 iliIlI0o00ii iliili0o00ii2 = iliili0o00ii;
/* 6 */                 ili1iI1O0lIl ili1ii1o0lil3 = ili1ii1o0lil;
/* 7 */                 ili1iI1O0lIl ili1ii1o0lil4 = ili1ii1o0lil2;
/* 12 */                if (unsafe.compareAndSwapObject(iliili0o00ii2, j, ili1ii1o0lil3, ili1ii1o0lil4)) {
/* 14 */                    return true;
                        }
/* 20 */                if (unsafe.getObject(iliili0o00ii2, j) != ili1ii1o0lil3) {
/* 22 */                    return false;
                        }
/* 24 */                iliili0o00ii = iliili0o00ii2;
/* 25 */                ili1ii1o0lil = ili1ii1o0lil3;
/* 26 */                ili1ii1o0lil2 = ili1ii1o0lil4;
                    }
                }
            }
