            package p000;

            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import sun.misc.Unsafe;
            
            public abstract class Ooil1O {
                public static final Unsafe I00000oIO;
                public static final Class I00000oOI;
                public static final Ooil0oIOI0l0 I0000Il00O;
                public static final boolean I0000O;
                public static final boolean I0000oI00;
                public static final long I0001Ioi1lo;
                public static final boolean I000II;

                static {
/* 1 */             Unsafe unsafeI000OiO = I000OiO();
/* 5 */             I00000oIO = unsafeI000OiO;
/* 9 */             I00000oOI = I0lI0Ooo.I00000oIO;
/* 13 */            boolean zI0000O = I0000O(Long.TYPE);
/* 19 */            boolean zI0000O2 = I0000O(Integer.TYPE);
/* 23 */            char c = 1;
/* 24 */            int i = 0;
/* 25 */            Ooil00l ooil00l = null;
/* 26 */            if (unsafeI000OiO != null) {
/* 33 */                if (!I0lI0Ooo.I00000oIO()) {
/* 54 */                    ooil00l = new Ooil00l(unsafeI000OiO, 2);
                        } else if (zI0000O) {
/* 39 */                    ooil00l = new Ooil00l(unsafeI000OiO, c == true ? 1 : 0);
                        } else if (zI0000O2) {
/* 47 */                    ooil00l = new Ooil00l(unsafeI000OiO, i);
                        }
                    }
/* 57 */            I0000Il00O = ooil00l;
/* 67 */            I0000O = ooil00l == null ? false : ooil00l.I000OiO();
/* 77 */            I0000oI00 = ooil00l == null ? false : ooil00l.I000OOo1O();
/* 86 */            I0001Ioi1lo = I00000oIO(byte[].class);
/* 90 */            I00000oIO(boolean[].class);
/* 93 */            I00000oOI(boolean[].class);
/* 98 */            I00000oIO(int[].class);
/* 101 */           I00000oOI(int[].class);
/* 106 */           I00000oIO(long[].class);
/* 109 */           I00000oOI(long[].class);
/* 114 */           I00000oIO(float[].class);
/* 117 */           I00000oOI(float[].class);
/* 122 */           I00000oIO(double[].class);
/* 125 */           I00000oOI(double[].class);
/* 130 */           I00000oIO(Object[].class);
/* 133 */           I00000oOI(Object[].class);
/* 136 */           Field fieldI0000Il00O = I0000Il00O();
/* 140 */           if (fieldI0000Il00O != null && ooil00l != null) {
/* 147 */               ooil00l.I00000oOI.objectFieldOffset(fieldI0000Il00O);
                    }
/* 160 */           I000II = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
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
/* 8 */             if (I0lI0Ooo.I00000oIO()) {
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
/* 6 */             if (!I0lI0Ooo.I00000oIO()) {
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

                public static byte I0000oI00(long j, Object obj) {
/* 19 */            return (byte) ((I000II((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
                }

                public static byte I0001Ioi1lo(long j, Object obj) {
/* 18 */            return (byte) ((I000II((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
                }

                public static int I000II(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getInt(obj, j);
                }

                public static long I000O01llI0(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getLong(obj, j);
                }

                public static Object I000OOo1O(long j, Object obj) {
/* 5 */             return I0000Il00O.I00000oOI.getObject(obj, j);
                }

                public static Unsafe I000OiO() {
                    Unsafe unsafe;
                    try {
/* 12 */                unsafe = (Unsafe) AccessController.doPrivileged(new OoiioO0o(1));
                    } catch (Throwable unused) {
/* 15 */                unsafe = null;
                    }
/* 16 */            if (unsafe == null) {
/* 1 */                 return null;
                    }
                    try {
/* 21 */                unsafe.arrayBaseOffset(byte[].class);
/* 24 */                return unsafe;
                    } catch (Exception unused2) {
/* 39 */                Logger.getLogger(Ooil1O.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
/* 1 */                 return null;
                    }
                }

                public static void I000iOII(Throwable th) {
/* 27 */            Logger.getLogger(Ooil1O.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }

                public static void I000l1(byte[] bArr, long j, byte b) {
/* 6 */             I0000Il00O.I0001Ioi1lo(bArr, I0001Ioi1lo + j, b);
                }

                public static void I000lI(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             int iI000II = I000II(j2, obj);
/* 12 */            int i = ((~((int) j)) & 3) << 3;
/* 24 */            I000oI1ioi(obj, ((255 & b) << i) | (iI000II & (~(255 << i))), j2);
                }

                public static void I000o00OoI0I(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 11 */            int i = (((int) j) & 3) << 3;
/* 23 */            I000oI1ioi(obj, ((255 & b) << i) | (I000II(j2, obj) & (~(255 << i))), j2);
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
