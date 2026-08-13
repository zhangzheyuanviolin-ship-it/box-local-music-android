            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import sun.misc.Unsafe;
            
            public abstract class OoilIIl {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final long I0001Ioi1lo;
                public static final boolean I000II;

                static {
                    Unsafe unsafe;
/* 1 */             int i = 2;
/* 2 */             Ooil01oOo ooil01oOo = null;
                    try {
/* 12 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(i));
                    } catch (Throwable unused) {
/* 15 */                unsafe = null;
                    }
/* 16 */            I00000oIO = unsafe;
/* 20 */            I00000oOI = I0lI0iiol.I00000oIO;
/* 24 */            boolean zI0000O = I0000O(Long.TYPE);
/* 30 */            boolean zI0000O2 = I0000O(Integer.TYPE);
/* 34 */            char c = 1;
/* 35 */            int i2 = 0;
/* 36 */            if (unsafe != null) {
/* 43 */                if (!I0lI0iiol.I00000oIO()) {
/* 63 */                    ooil01oOo = new Ooil01oOo(unsafe, i);
                        } else if (zI0000O) {
/* 49 */                    ooil01oOo = new Ooil01oOo(unsafe, c == true ? 1 : 0);
                        } else if (zI0000O2) {
/* 57 */                    ooil01oOo = new Ooil01oOo(unsafe, i2);
                        }
                    }
/* 66 */            I0000Il00O = ooil01oOo;
/* 76 */            I0000O = ooil01oOo == null ? false : ooil01oOo.I000OiO();
/* 86 */            I0000oI00 = ooil01oOo == null ? false : ooil01oOo.I000OOo1O();
/* 95 */            I0001Ioi1lo = I00000oIO(byte[].class);
/* 99 */            I00000oIO(boolean[].class);
/* 102 */           I00000oOI(boolean[].class);
/* 107 */           I00000oIO(int[].class);
/* 110 */           I00000oOI(int[].class);
/* 115 */           I00000oIO(long[].class);
/* 118 */           I00000oOI(long[].class);
/* 123 */           I00000oIO(float[].class);
/* 126 */           I00000oOI(float[].class);
/* 131 */           I00000oIO(double[].class);
/* 134 */           I00000oOI(double[].class);
/* 139 */           I00000oIO(Object[].class);
/* 142 */           I00000oOI(Object[].class);
/* 145 */           Field fieldI0000Il00O = I0000Il00O();
/* 149 */           if (fieldI0000Il00O != null && ooil01oOo != null) {
/* 156 */               ooil01oOo.I00000oOI.objectFieldOffset(fieldI0000Il00O);
                    }
/* 169 */           I000II = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                public static int I00000oIO(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 return I0000Il00O.I00000oOI.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }

                public static void I00000oOI(Class cls) {
/* 3 */             if (I0000oI00) {
/* 9 */                 I0000Il00O.I00000oOI.arrayIndexScale(cls);
                    }
                }

                public static Field I0000Il00O() {
                    Field declaredField;
                    Field declaredField2;
/* 8 */             if (I0lI0iiol.I00000oIO()) {
                        try {
/* 12 */                    declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        } catch (Throwable unused) {
/* 17 */                    declaredField2 = null;
                        }
/* 18 */                if (declaredField2 != null) {
/* 20 */                    return declaredField2;
                        }
                    }
                    try {
/* 23 */                declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
/* 28 */                declaredField = null;
                    }
/* 29 */            if (declaredField == null || declaredField.getType() != Long.TYPE) {
/* 7 */                 return null;
                    }
/* 39 */            return declaredField;
                }

                public static boolean I0000O(Class cls) {
/* 6 */             if (!I0lI0iiol.I00000oIO()) {
/* 5 */                 return false;
                    }
                    try {
/* 9 */                 Class cls2 = I00000oOI;
/* 13 */                Class cls3 = Boolean.TYPE;
/* 19 */                cls2.getMethod("peekLong", cls, cls3);
/* 30 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 35 */                Class cls4 = Integer.TYPE;
/* 41 */                cls2.getMethod("pokeInt", cls, cls4, cls3);
/* 50 */                cls2.getMethod("peekInt", cls, cls3);
/* 61 */                cls2.getMethod("pokeByte", cls, Byte.TYPE);
/* 70 */                cls2.getMethod("peekByte", cls);
/* 81 */                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
/* 90 */                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
/* 93 */                return true;
                    } catch (Throwable unused) {
/* 5 */                 return false;
                    }
                }

                public static boolean I0000oI00(long j, Object obj) {
                    return ((byte) ((I0001Ioi1lo((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static int I0001Ioi1lo(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I000II(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I000O01llI0(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I000OOo1O(Throwable th) {
/* 27 */            Logger.getLogger(OoilIIl.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }

                public static void I000OiO(byte[] bArr, long j, byte b) {
/* 6 */             I0000Il00O.I0001Ioi1lo(bArr, I0001Ioi1lo + j, b);
                }

                public static void I000iOII(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             int iI0001Ioi1lo = I0001Ioi1lo(j2, obj);
/* 12 */            int i = ((~((int) j)) & 3) << 3;
/* 24 */            I000lI(obj, ((255 & b) << i) | (iI0001Ioi1lo & (~(255 << i))), j2);
                }

                public static void I000l1(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 11 */            int i = (((int) j) & 3) << 3;
/* 23 */            I000lI(obj, ((255 & b) << i) | (I0001Ioi1lo(j2, obj) & (~(255 << i))), j2);
                }

                public static void I000lI(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static void I000o00OoI0I(Object obj, long j, long j2) {
/* 8 */             I0000Il00O.I00000oOI.putLong(obj, j, j2);
                }

                public static void I000oI1ioi(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }
            }
