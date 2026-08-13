            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            public abstract class iI1Oili0OI {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final long I0000oI00;
                public static final boolean I0001Ioi1lo;

                static {
                    boolean z;
                    Ooil0oIOI0l0 ooil0oIOI0l0;
/* 1 */             Unsafe unsafeI000iOII = I000iOII();
/* 5 */             I00000oIO = unsafeI000iOII;
/* 7 */             int i = i1ioiooIiOol.I00000oIO;
/* 11 */            I00000oOI = Memory.class;
/* 13 */            Class cls = Long.TYPE;
/* 15 */            boolean zI000l1 = I000l1(cls);
/* 19 */            Class cls2 = Integer.TYPE;
/* 21 */            boolean zI000l12 = I000l1(cls2);
/* 25 */            char c = 1;
/* 26 */            iI1O1oO1l ii1o1oo1l = null;
/* 27 */            int i2 = 0;
/* 28 */            if (unsafeI000iOII != null) {
/* 31 */                if (zI000l1) {
/* 35 */                    ii1o1oo1l = new iI1O1oO1l(unsafeI000iOII, c == true ? 1 : 0);
                        } else if (zI000l12) {
/* 43 */                    ii1o1oo1l = new iI1O1oO1l(unsafeI000iOII, i2);
                        }
                    }
/* 46 */            I0000Il00O = ii1o1oo1l;
/* 64 */            if (ii1o1oo1l != null) {
                        try {
/* 68 */                    Class<?> cls3 = ii1o1oo1l.I00000oOI.getClass();
/* 76 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 83 */                    cls3.getMethod("getLong", Object.class, cls);
/* 86 */                    I00000oIO();
                        } catch (Throwable th) {
/* 109 */                   Logger.getLogger(iI1Oili0OI.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                        }
                    }
/* 112 */           Ooil0oIOI0l0 ooil0oIOI0l02 = I0000Il00O;
/* 114 */           if (ooil0oIOI0l02 == null) {
/* 116 */               z = false;
                    } else {
                        try {
/* 120 */                   Class<?> cls4 = ooil0oIOI0l02.I00000oOI.getClass();
/* 128 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 139 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 148 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 157 */                   cls4.getMethod("getInt", Object.class, cls);
/* 166 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 173 */                   cls4.getMethod("getLong", Object.class, cls);
/* 182 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 191 */                   cls4.getMethod("getObject", Object.class, cls);
/* 200 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 203 */                   z = true;
                        } catch (Throwable th2) {
/* 224 */                   Logger.getLogger(iI1Oili0OI.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                    }
/* 228 */           I0000O = z;
/* 237 */           I0000oI00 = I000oI1ioi(byte[].class);
/* 241 */           I000oI1ioi(boolean[].class);
/* 244 */           I00100l0(boolean[].class);
/* 249 */           I000oI1ioi(int[].class);
/* 252 */           I00100l0(int[].class);
/* 257 */           I000oI1ioi(long[].class);
/* 260 */           I00100l0(long[].class);
/* 265 */           I000oI1ioi(float[].class);
/* 268 */           I00100l0(float[].class);
/* 273 */           I000oI1ioi(double[].class);
/* 276 */           I00100l0(double[].class);
/* 281 */           I000oI1ioi(Object[].class);
/* 284 */           I00100l0(Object[].class);
/* 287 */           Field fieldI00000oIO = I00000oIO();
/* 291 */           if (fieldI00000oIO != null && (ooil0oIOI0l0 = I0000Il00O) != null) {
/* 299 */               ooil0oIOI0l0.I00000oOI.objectFieldOffset(fieldI00000oIO);
                    }
/* 312 */           I0001Ioi1lo = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static Field I00000oIO() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = i1ioiooIiOol.I00000oIO;
                    try {
/* 8 */                 declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
/* 13 */                declaredField = null;
                    }
/* 14 */            if (declaredField != null) {
/* 55 */                return declaredField;
                    }
                    try {
/* 18 */                declaredField2 = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
/* 23 */                declaredField2 = null;
                    }
/* 24 */            if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
/* 7 */                 return null;
                    }
/* 34 */            return declaredField2;
                }

                public static void I00000oOI(Object obj, long j, byte b) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = unsafe.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 28 */            unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
                }

                public static void I0000Il00O(Object obj, long j, byte b) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 27 */            unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
                }

                public static int I0000O(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static void I0000oI00(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static long I0001Ioi1lo(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static void I000II(Object obj, long j, long j2) {
/* 8 */             I0000Il00O.I00000oOI.putLong(obj, j, j2);
                }

                public static Object I000O01llI0(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I000OOo1O(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }

                public static void I000OiO(byte[] bArr, long j, byte b) {
/* 6 */             I0000Il00O.I0010o(bArr, I0000oI00 + j, b);
                }

                public static Unsafe I000iOII() {
                    Unsafe unsafe;
                    try {
/* 13 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(8));
                    } catch (Throwable unused) {
/* 16 */                unsafe = null;
                    }
/* 17 */            if (unsafe == null) {
/* 1 */                 return null;
                    }
                    try {
/* 22 */                unsafe.arrayBaseOffset(byte[].class);
/* 25 */                return unsafe;
                    } catch (Exception unused2) {
/* 44 */                Logger.getLogger(iI1Oili0OI.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
/* 1 */                 return null;
                    }
                }

                public static boolean I000l1(Class cls) {
/* 1 */             int i = i1ioiooIiOol.I00000oIO;
                    try {
/* 3 */                 Class cls2 = I00000oOI;
/* 7 */                 Class cls3 = Boolean.TYPE;
/* 13 */                cls2.getMethod("peekLong", cls, cls3);
/* 24 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 29 */                Class cls4 = Integer.TYPE;
/* 35 */                cls2.getMethod("pokeInt", cls, cls4, cls3);
/* 44 */                cls2.getMethod("peekInt", cls, cls3);
/* 55 */                cls2.getMethod("pokeByte", cls, Byte.TYPE);
/* 64 */                cls2.getMethod("peekByte", cls);
/* 75 */                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
/* 84 */                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
/* 87 */                return true;
                    } catch (Throwable unused) {
/* 89 */                return false;
                    }
                }

                public static boolean I000lI(Object obj, long j) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000o00OoI0I(Object obj, long j) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static int I000oI1ioi(Class cls) {
/* 3 */             if (I0000O) {
/* 9 */                 return I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }

                public static void I00100l0(Class cls) {
/* 3 */             if (I0000O) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }
            }
