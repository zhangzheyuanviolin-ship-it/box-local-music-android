            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            public abstract class i11oI1O {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final long I0001Ioi1lo;
                public static final boolean I000II;

                /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
                static {
                    Unsafe unsafe;
                    boolean z;
                    boolean z2;
                    Ooil0oIOI0l0 ooil0oIOI0l0;
/* 1 */             i11o1l01 i11o1l01Var = null;
                    try {
/* 12 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(3));
                    } catch (Throwable unused) {
/* 15 */                unsafe = null;
                    }
/* 16 */            I00000oIO = unsafe;
/* 18 */            int i = i111I1I110lI.I00000oIO;
/* 22 */            I00000oOI = Memory.class;
/* 24 */            Class cls = Long.TYPE;
/* 26 */            boolean zI000l1 = I000l1(cls);
/* 30 */            Class cls2 = Integer.TYPE;
/* 32 */            boolean zI000l12 = I000l1(cls2);
/* 36 */            char c = 1;
/* 37 */            int i2 = 0;
/* 38 */            if (unsafe != null) {
/* 41 */                if (zI000l1) {
/* 45 */                    i11o1l01Var = new i11o1l01(unsafe, c == true ? 1 : 0);
                        } else if (zI000l12) {
/* 53 */                    i11o1l01Var = new i11o1l01(unsafe, i2);
                        }
                    }
/* 56 */            I0000Il00O = i11o1l01Var;
/* 74 */            if (i11o1l01Var == null) {
/* 76 */                z = false;
                    } else {
                        try {
/* 80 */                    Class<?> cls3 = i11o1l01Var.I00000oOI.getClass();
/* 88 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 95 */                    cls3.getMethod("getLong", Object.class, cls);
/* 102 */                   if (I00000oOI() != null) {
/* 105 */                       z = true;
                            }
                        } catch (Throwable th) {
/* 126 */                   Logger.getLogger(i11oI1O.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
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
/* 244 */                   Logger.getLogger(i11oI1O.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                    }
/* 248 */           I0000oI00 = z2;
/* 257 */           I0001Ioi1lo = I000lI(byte[].class);
/* 261 */           I000lI(boolean[].class);
/* 264 */           I00000oIO(boolean[].class);
/* 269 */           I000lI(int[].class);
/* 272 */           I00000oIO(int[].class);
/* 277 */           I000lI(long[].class);
/* 280 */           I00000oIO(long[].class);
/* 285 */           I000lI(float[].class);
/* 288 */           I00000oIO(float[].class);
/* 293 */           I000lI(double[].class);
/* 296 */           I00000oIO(double[].class);
/* 301 */           I000lI(Object[].class);
/* 304 */           I00000oIO(Object[].class);
/* 307 */           Field fieldI00000oOI = I00000oOI();
/* 311 */           if (fieldI00000oOI != null && (ooil0oIOI0l0 = I0000Il00O) != null) {
/* 319 */               ooil0oIOI0l0.I00000oOI.objectFieldOffset(fieldI00000oOI);
                    }
/* 332 */           I000II = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static void I00000oIO(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }

                public static Field I00000oOI() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = i111I1I110lI.I00000oIO;
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

                public static int I0000oI00(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I0001Ioi1lo(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I000II(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I000O01llI0(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static void I000OOo1O(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }

                public static boolean I000OiO(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000iOII(long j, Object obj) {
                    return ((byte) ((I0000Il00O.I00000oOI.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean I000l1(Class cls) {
/* 1 */             int i = i111I1I110lI.I00000oIO;
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

                public static int I000lI(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 return I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }
            }
