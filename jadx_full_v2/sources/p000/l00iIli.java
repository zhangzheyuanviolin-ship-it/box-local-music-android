            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            public abstract class l00iIli {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final long I0001Ioi1lo;
                public static final boolean I000II;

                /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
                static {
                    Unsafe unsafe;
                    boolean z;
                    boolean z2;
                    Ooil0oIOI0l0 ooil0oIOI0l0;
/* 1 */             l001OO0 l001oo0 = null;
                    try {
/* 13 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(17));
                    } catch (Throwable unused) {
/* 16 */                unsafe = null;
                    }
/* 17 */            I00000oIO = unsafe;
/* 19 */            int i = iiliOO0o.I00000oIO;
/* 23 */            I00000oOI = Memory.class;
/* 25 */            Class cls = Long.TYPE;
/* 27 */            boolean zI000lI = I000lI(cls);
/* 31 */            Class cls2 = Integer.TYPE;
/* 33 */            boolean zI000lI2 = I000lI(cls2);
/* 37 */            char c = 1;
/* 38 */            int i2 = 0;
/* 39 */            if (unsafe != null) {
/* 42 */                if (zI000lI) {
/* 46 */                    l001oo0 = new l001OO0(unsafe, c == true ? 1 : 0);
                        } else if (zI000lI2) {
/* 54 */                    l001oo0 = new l001OO0(unsafe, i2);
                        }
                    }
/* 57 */            I0000Il00O = l001oo0;
/* 75 */            if (l001oo0 == null) {
/* 77 */                z = false;
                    } else {
                        try {
/* 81 */                    Class<?> cls3 = l001oo0.I00000oOI.getClass();
/* 89 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 96 */                    cls3.getMethod("getLong", Object.class, cls);
/* 103 */                   if (I00000oOI() != null) {
/* 106 */                       z = true;
                            }
                        } catch (Throwable th) {
/* 127 */                   Logger.getLogger(l00iIli.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                        }
                    }
/* 131 */           I0000O = z;
/* 133 */           Ooil0oIOI0l0 ooil0oIOI0l02 = I0000Il00O;
/* 135 */           if (ooil0oIOI0l02 == null) {
/* 137 */               z2 = false;
                    } else {
                        try {
/* 141 */                   Class<?> cls4 = ooil0oIOI0l02.I00000oOI.getClass();
/* 149 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 160 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 169 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 178 */                   cls4.getMethod("getInt", Object.class, cls);
/* 187 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 194 */                   cls4.getMethod("getLong", Object.class, cls);
/* 203 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 212 */                   cls4.getMethod("getObject", Object.class, cls);
/* 221 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 224 */                   z2 = true;
                        } catch (Throwable th2) {
/* 245 */                   Logger.getLogger(l00iIli.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                    }
/* 249 */           I0000oI00 = z2;
/* 258 */           I0001Ioi1lo = I000o00OoI0I(byte[].class);
/* 262 */           I000o00OoI0I(boolean[].class);
/* 265 */           I00000oIO(boolean[].class);
/* 270 */           I000o00OoI0I(int[].class);
/* 273 */           I00000oIO(int[].class);
/* 278 */           I000o00OoI0I(long[].class);
/* 281 */           I00000oIO(long[].class);
/* 286 */           I000o00OoI0I(float[].class);
/* 289 */           I00000oIO(float[].class);
/* 294 */           I000o00OoI0I(double[].class);
/* 297 */           I00000oIO(double[].class);
/* 302 */           I000o00OoI0I(Object[].class);
/* 305 */           I00000oIO(Object[].class);
/* 308 */           Field fieldI00000oOI = I00000oOI();
/* 312 */           if (fieldI00000oOI != null && (ooil0oIOI0l0 = I0000Il00O) != null) {
/* 320 */               ooil0oIOI0l0.I00000oOI.objectFieldOffset(fieldI00000oOI);
                    }
/* 333 */           I000II = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static void I00000oIO(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }

                public static Field I00000oOI() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = iiliOO0o.I00000oIO;
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

                public static void I0000Il00O(Object obj, long j, byte b) {
/* 1 */             Ooil0oIOI0l0 ooil0oIOI0l0 = I0000Il00O;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = ooil0oIOI0l0.I00000oOI.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 30 */            ooil0oIOI0l0.I00000oOI.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
                }

                public static void I0000O(Object obj, long j, byte b) {
/* 1 */             Ooil0oIOI0l0 ooil0oIOI0l0 = I0000Il00O;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 29 */            ooil0oIOI0l0.I00000oOI.putInt(obj, j2, ((255 & b) << i) | (ooil0oIOI0l0.I00000oOI.getInt(obj, j2) & (~(255 << i))));
                }

                public static int I0000oI00(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I0001Ioi1lo(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I000II(Object obj, long j) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I000O01llI0(Object obj, long j, int i) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static void I000OOo1O(Object obj, long j, long j2) {
/* 8 */             I0000Il00O.I00000oOI.putLong(obj, j, j2);
                }

                public static void I000OiO(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }

                public static boolean I000iOII(Object obj, long j) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000l1(Object obj, long j) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000lI(Class cls) {
/* 1 */             int i = iiliOO0o.I00000oIO;
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

                public static int I000o00OoI0I(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 return I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }
            }
