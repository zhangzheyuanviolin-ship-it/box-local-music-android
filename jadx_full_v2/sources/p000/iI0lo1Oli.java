            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            public abstract class iI0lo1Oli {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final boolean I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
                static {
                    Unsafe unsafe;
                    boolean z;
                    boolean z2;
                    Ooil0oIOI0l0 ooil0oIOI0l0;
/* 1 */             iI0lOolI ii0looli = null;
                    try {
/* 12 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(7));
                    } catch (Throwable unused) {
/* 15 */                unsafe = null;
                    }
/* 16 */            I00000oIO = unsafe;
/* 18 */            int i = i1i1oioIl0.I00000oIO;
/* 22 */            I00000oOI = Memory.class;
/* 24 */            Class cls = Long.TYPE;
/* 26 */            boolean zI000OiO = I000OiO(cls);
/* 30 */            Class cls2 = Integer.TYPE;
/* 32 */            boolean zI000OiO2 = I000OiO(cls2);
/* 36 */            char c = 1;
/* 37 */            int i2 = 0;
/* 38 */            if (unsafe != null) {
/* 41 */                if (zI000OiO) {
/* 45 */                    ii0looli = new iI0lOolI(unsafe, c == true ? 1 : 0);
                        } else if (zI000OiO2) {
/* 53 */                    ii0looli = new iI0lOolI(unsafe, i2);
                        }
                    }
/* 56 */            I0000Il00O = ii0looli;
/* 74 */            if (ii0looli == null) {
/* 76 */                z = false;
                    } else {
                        try {
/* 80 */                    Class<?> cls3 = ii0looli.I00000oOI.getClass();
/* 88 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 95 */                    cls3.getMethod("getLong", Object.class, cls);
/* 102 */                   if (I000lI() != null) {
/* 105 */                       z = true;
                            }
                        } catch (Throwable th) {
/* 126 */                   Logger.getLogger(iI0lo1Oli.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                        }
                    }
/* 130 */           I0000O = z;
/* 132 */           Ooil0oIOI0l0 ooil0oIOI0l02 = I0000Il00O;
/* 134 */           if (ooil0oIOI0l02 == null) {
/* 136 */               z2 = false;
                    } else {
                        try {
/* 140 */                   Class<?> cls4 = ooil0oIOI0l02.I00000oOI.getClass();
/* 148 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 159 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 168 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 177 */                   cls4.getMethod("getInt", Object.class, cls);
/* 186 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 193 */                   cls4.getMethod("getLong", Object.class, cls);
/* 202 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 211 */                   cls4.getMethod("getObject", Object.class, cls);
/* 220 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 223 */                   z2 = true;
                        } catch (Throwable th2) {
/* 244 */                   Logger.getLogger(iI0lo1Oli.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                    }
/* 248 */           I0000oI00 = z2;
/* 252 */           I000iOII(byte[].class);
/* 257 */           I000iOII(boolean[].class);
/* 260 */           I000l1(boolean[].class);
/* 265 */           I000iOII(int[].class);
/* 268 */           I000l1(int[].class);
/* 273 */           I000iOII(long[].class);
/* 276 */           I000l1(long[].class);
/* 281 */           I000iOII(float[].class);
/* 284 */           I000l1(float[].class);
/* 289 */           I000iOII(double[].class);
/* 292 */           I000l1(double[].class);
/* 297 */           I000iOII(Object[].class);
/* 300 */           I000l1(Object[].class);
/* 303 */           Field fieldI000lI = I000lI();
/* 307 */           if (fieldI000lI != null && (ooil0oIOI0l0 = I0000Il00O) != null) {
/* 315 */               ooil0oIOI0l0.I00000oOI.objectFieldOffset(fieldI000lI);
                    }
/* 328 */           I0001Ioi1lo = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static int I00000oIO(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I00000oOI(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I0000Il00O(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I0000O(Object obj, long j, boolean z) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = unsafe.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 26 */            unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
                }

                public static void I0000oI00(Object obj, long j, boolean z) {
/* 3 */             Unsafe unsafe = I0000Il00O.I00000oOI;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 25 */            unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
                }

                public static void I0001Ioi1lo(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static void I000II(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }

                public static boolean I000O01llI0(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000OOo1O(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000OiO(Class cls) {
/* 1 */             int i = i1i1oioIl0.I00000oIO;
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

                public static void I000iOII(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
                }

                public static void I000l1(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }

                public static Field I000lI() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = i1i1oioIl0.I00000oIO;
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
