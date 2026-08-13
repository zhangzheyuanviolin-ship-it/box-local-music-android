            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            public abstract class Ooil0oIOI0l0 {
                public final int I00000oIO;
                public final Unsafe I00000oOI;

                public Ooil0oIOI0l0(Unsafe unsafe, int i) {
/* 1 */             this.I00000oIO = i;
/* 3 */             this.I00000oOI = unsafe;
                }

                public abstract boolean I00000oIO(long j, Object obj);

                public abstract byte I00000oOI(long j, Object obj);

                public abstract double I0000Il00O(long j, Object obj);

                public abstract float I0000O(long j, Object obj);

                public abstract void I0000oI00(Object obj, long j, boolean z);

                public abstract void I0001Ioi1lo(Object obj, long j, byte b);

                public abstract void I000II(Object obj, long j, double d);

                public abstract void I000O01llI0(Object obj, long j, float f);

                public boolean I000OOo1O() {
/* 3 */             int i = this.I00000oIO;
/* 13 */            Class cls = Integer.TYPE;
/* 17 */            Class cls2 = Long.TYPE;
/* 33 */            Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 200 */                   if (unsafe != null) {
                                try {
/* 205 */                           Class<?> cls3 = unsafe.getClass();
/* 213 */                           cls3.getMethod("objectFieldOffset", Field.class);
/* 220 */                           cls3.getMethod("arrayBaseOffset", Class.class);
/* 227 */                           cls3.getMethod("arrayIndexScale", Class.class);
/* 234 */                           cls3.getMethod("getInt", Object.class, cls2);
/* 241 */                           cls3.getMethod("putInt", Object.class, cls2, cls);
/* 248 */                           cls3.getMethod("getLong", Object.class, cls2);
/* 255 */                           cls3.getMethod("putLong", Object.class, cls2, cls2);
/* 262 */                           cls3.getMethod("getObject", Object.class, cls2);
/* 269 */                           cls3.getMethod("putObject", Object.class, cls2, Object.class);
                                    break;
                                } catch (Throwable th) {
/* 275 */                           Ooil11Oi.I000iOII(th);
                                }
                            }
                            break;
                        case 1:
/* 120 */                   if (unsafe != null) {
                                try {
/* 125 */                           Class<?> cls4 = unsafe.getClass();
/* 133 */                           cls4.getMethod("objectFieldOffset", Field.class);
/* 140 */                           cls4.getMethod("arrayBaseOffset", Class.class);
/* 147 */                           cls4.getMethod("arrayIndexScale", Class.class);
/* 154 */                           cls4.getMethod("getInt", Object.class, cls2);
/* 161 */                           cls4.getMethod("putInt", Object.class, cls2, cls);
/* 168 */                           cls4.getMethod("getLong", Object.class, cls2);
/* 175 */                           cls4.getMethod("putLong", Object.class, cls2, cls2);
/* 182 */                           cls4.getMethod("getObject", Object.class, cls2);
/* 189 */                           cls4.getMethod("putObject", Object.class, cls2, Object.class);
                                    break;
                                } catch (Throwable th2) {
/* 195 */                           Ooil1O.I000iOII(th2);
                                }
                            }
                            break;
                        default:
/* 40 */                    if (unsafe != null) {
                                try {
/* 45 */                            Class<?> cls5 = unsafe.getClass();
/* 53 */                            cls5.getMethod("objectFieldOffset", Field.class);
/* 60 */                            cls5.getMethod("arrayBaseOffset", Class.class);
/* 67 */                            cls5.getMethod("arrayIndexScale", Class.class);
/* 74 */                            cls5.getMethod("getInt", Object.class, cls2);
/* 81 */                            cls5.getMethod("putInt", Object.class, cls2, cls);
/* 88 */                            cls5.getMethod("getLong", Object.class, cls2);
/* 95 */                            cls5.getMethod("putLong", Object.class, cls2, cls2);
/* 102 */                           cls5.getMethod("getObject", Object.class, cls2);
/* 109 */                           cls5.getMethod("putObject", Object.class, cls2, Object.class);
                                    break;
                                } catch (Throwable th3) {
/* 115 */                           OoilIIl.I000OOo1O(th3);
                                }
                            }
                            break;
                    }
/* 35 */            return false;
                }

                public abstract boolean I000OiO();

                public abstract double I000iOII(long j, Object obj);

                public abstract float I000l1(long j, Object obj);

                public abstract void I000lI(Object obj, long j, boolean z);

                public abstract void I000o00OoI0I(Object obj, long j, byte b);

                public abstract void I000oI1ioi(Object obj, long j, double d);

                public abstract void I00100l0(Object obj, long j, float f);

                public abstract boolean I00100o1O0lo(long j, Object obj);

                public abstract double I0010I0i(Object obj, long j);

                public abstract void I0010o(Object obj, long j, byte b);

                public abstract boolean I00111O(long j, Object obj);

                public abstract float I001IIilI0O(Object obj, long j);

                public abstract void I001IO000(Object obj, long j, boolean z);

                public abstract boolean I001i1O0Ol(long j, Object obj);

                public abstract float I001i1lo1io(long j, Object obj);

                public abstract void I001iOo1i0O(Object obj, long j, boolean z);

                public abstract float I001l0I00(long j, Object obj);

                public abstract void I001lIiIIo1O(Object obj, long j, byte b);

                public abstract void I001lllioOl(Object obj, long j, double d);

                public abstract void I001lloI(Object obj, long j, float f);

                public abstract double I00II0Ol1O0l(long j, Object obj);

                public abstract void I00II0oii1o(Object obj, long j, double d);

                public abstract void I00IO1(Object obj, long j, float f);

                public abstract double I00IO1oi11O(long j, Object obj);

                public abstract void I00IOO(Object obj, long j, double d);

                public abstract void I00IioO0OiOi(Object obj, long j, float f);

                public abstract boolean I00IlilI0i0i(long j, Object obj);

                public abstract void I00Io1lO(Object obj, long j, double d);

                public abstract boolean I00Io1o110i(Object obj, long j);
            }
