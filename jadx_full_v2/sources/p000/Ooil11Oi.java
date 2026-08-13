            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import sun.misc.Unsafe;
            
            public abstract class Ooil11Oi {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final long I0001Ioi1lo;
                public static final boolean I000II;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Unsafe unsafe;
/* 1 */             Object[] objArr = 0;
/* 2 */             Ooiiol ooiiol = null;
                    try {
/* 12 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(0 == true ? 1 : 0));
                    } catch (Throwable unused) {
/* 15 */                unsafe = null;
                    }
/* 16 */            I00000oIO = unsafe;
/* 20 */            I00000oOI = I0l1oIioiOi0.I00000oIO;
/* 24 */            boolean zI0000O = I0000O(Long.TYPE);
/* 30 */            boolean zI0000O2 = I0000O(Integer.TYPE);
/* 34 */            int i = 1;
/* 35 */            if (unsafe != null) {
/* 42 */                if (!I0l1oIioiOi0.I00000oIO()) {
/* 63 */                    ooiiol = new Ooiiol(unsafe, 2);
                        } else if (zI0000O) {
/* 48 */                    ooiiol = new Ooiiol(unsafe, i);
                        } else if (zI0000O2) {
/* 56 */                    ooiiol = new Ooiiol(unsafe, objArr == true ? 1 : 0);
                        }
                    }
/* 66 */            I0000Il00O = ooiiol;
/* 76 */            I0000O = ooiiol == null ? false : ooiiol.I000OiO();
/* 86 */            I0000oI00 = ooiiol == null ? false : ooiiol.I000OOo1O();
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
/* 149 */           if (fieldI0000Il00O != null && ooiiol != null) {
/* 156 */               ooiiol.I00000oOI.objectFieldOffset(fieldI0000Il00O);
                    }
/* 168 */           I000II = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
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
/* 8 */             if (I0l1oIioiOi0.I00000oIO()) {
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
/* 6 */             if (!I0l1oIioiOi0.I00000oIO()) {
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

                public static byte I0000oI00(long j, byte[] bArr) {
/* 6 */             return I0000Il00O.I00000oOI(I0001Ioi1lo + j, bArr);
                }

                public static byte I0001Ioi1lo(long j, Object obj) {
/* 19 */            return (byte) ((I000O01llI0((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
                }

                public static byte I000II(long j, Object obj) {
/* 18 */            return (byte) ((I000O01llI0((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
                }

                public static int I000O01llI0(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I000OOo1O(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I000OiO(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static void I000iOII(Throwable th) {
/* 27 */            Logger.getLogger(Ooil11Oi.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }

                public static void I000l1(byte[] bArr, long j, byte b) {
/* 6 */             I0000Il00O.I0001Ioi1lo(bArr, I0001Ioi1lo + j, b);
                }

                public static void I000lI(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             int iI000O01llI0 = I000O01llI0(j2, obj);
/* 12 */            int i = ((~((int) j)) & 3) << 3;
/* 24 */            I000oI1ioi(obj, ((255 & b) << i) | (iI000O01llI0 & (~(255 << i))), j2);
                }

                public static void I000o00OoI0I(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 11 */            int i = (((int) j) & 3) << 3;
/* 23 */            I000oI1ioi(obj, ((255 & b) << i) | (I000O01llI0(j2, obj) & (~(255 << i))), j2);
                }

                public static void I000oI1ioi(Object obj, int i, long j) {
/* 5 */             I0000Il00O.I00000oOI.putInt(obj, j, i);
                }

                public static void I00100l0(Object obj, long j, long j2) {
/* 8 */             I0000Il00O.I00000oOI.putLong(obj, j, j2);
                }

                public static void I00100o1O0lo(Object obj, long j, Object obj2) {
/* 5 */             I0000Il00O.I00000oOI.putObject(obj, j, obj2);
                }
            }
