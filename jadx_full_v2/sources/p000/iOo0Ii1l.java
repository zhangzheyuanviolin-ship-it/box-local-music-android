            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            public abstract class iOo0Ii1l {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;

                static {
                    boolean z;
                    Ooil0oIOI0l0 ooil0oIOI0l0;
/* 1 */             Unsafe unsafeI0001Ioi1lo = I0001Ioi1lo();
/* 5 */             I00000oIO = unsafeI0001Ioi1lo;
/* 7 */             int i = iOl10iIiIiOi.I00000oIO;
/* 11 */            I00000oOI = Memory.class;
/* 13 */            Class cls = Long.TYPE;
/* 15 */            boolean zI000II = I000II(cls);
/* 19 */            Class cls2 = Integer.TYPE;
/* 21 */            boolean zI000II2 = I000II(cls2);
/* 25 */            char c = 1;
/* 26 */            iOo011i ioo011i = null;
/* 27 */            int i2 = 0;
/* 28 */            if (unsafeI0001Ioi1lo != null) {
/* 31 */                if (zI000II) {
/* 35 */                    ioo011i = new iOo011i(unsafeI0001Ioi1lo, c == true ? 1 : 0);
                        } else if (zI000II2) {
/* 43 */                    ioo011i = new iOo011i(unsafeI0001Ioi1lo, i2);
                        }
                    }
/* 46 */            I0000Il00O = ioo011i;
/* 64 */            if (ioo011i != null) {
                        try {
/* 68 */                    Class<?> cls3 = ioo011i.I00000oOI.getClass();
/* 76 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 83 */                    cls3.getMethod("getLong", Object.class, cls);
/* 86 */                    I000o00OoI0I();
                        } catch (Throwable th) {
/* 109 */                   Logger.getLogger(iOo0Ii1l.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
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
/* 224 */                   Logger.getLogger(iOo0Ii1l.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                    }
/* 228 */           I0000O = z;
/* 232 */           I000l1(byte[].class);
/* 237 */           I000l1(boolean[].class);
/* 240 */           I000lI(boolean[].class);
/* 245 */           I000l1(int[].class);
/* 248 */           I000lI(int[].class);
/* 253 */           I000l1(long[].class);
/* 256 */           I000lI(long[].class);
/* 261 */           I000l1(float[].class);
/* 264 */           I000lI(float[].class);
/* 269 */           I000l1(double[].class);
/* 272 */           I000lI(double[].class);
/* 277 */           I000l1(Object[].class);
/* 280 */           I000lI(Object[].class);
/* 283 */           Field fieldI000o00OoI0I = I000o00OoI0I();
/* 287 */           if (fieldI000o00OoI0I != null && (ooil0oIOI0l0 = I0000Il00O) != null) {
/* 295 */               ooil0oIOI0l0.I00000oOI.objectFieldOffset(fieldI000o00OoI0I);
                    }
/* 308 */           I0000oI00 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static int I00000oIO(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static void I00000oOI(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static long I0000Il00O(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I0000O(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I0000oI00(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }

                public static Unsafe I0001Ioi1lo() {
                    Unsafe unsafe;
                    try {
/* 13 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(10));
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
/* 44 */                Logger.getLogger(iOo0Ii1l.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
/* 1 */                 return null;
                    }
                }

                public static boolean I000II(Class cls) {
/* 1 */             int i = iOl10iIiIiOi.I00000oIO;
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

                public static boolean I000O01llI0(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000OOo1O(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static void I000OiO(Object obj, long j, boolean z) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = unsafe.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 26 */            unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
                }

                public static void I000iOII(Object obj, long j, boolean z) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 25 */            unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
                }

                public static void I000l1(Class cls) {
/* 3 */             if (I0000O) {
/* 9 */                 I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
                }

                public static void I000lI(Class cls) {
/* 3 */             if (I0000O) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }

                public static Field I000o00OoI0I() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = iOl10iIiIiOi.I00000oIO;
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
            }
