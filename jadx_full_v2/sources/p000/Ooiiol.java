            package p000;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            public final class Ooiiol extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ooiiol(Unsafe unsafe, int i) {
/* 4 */             super(unsafe, 0);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final boolean I00000oIO(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 39 */                    if (Ooil11Oi.I000II) {
/* 45 */                        if (Ooil11Oi.I0001Ioi1lo(j, obj) == 0) {
/* 37 */                            return false;
                                }
                            } else if (Ooil11Oi.I000II(j, obj) == 0) {
/* 37 */                        return false;
                            }
/* 38 */                    return true;
                        case 1:
/* 17 */                    if (Ooil11Oi.I000II) {
/* 23 */                        if (Ooil11Oi.I0001Ioi1lo(j, obj) == 0) {
/* 15 */                            return false;
                                }
                            } else if (Ooil11Oi.I000II(j, obj) == 0) {
/* 15 */                        return false;
                            }
/* 16 */                    return true;
                        default:
/* 8 */                     return this.I00000oOI.getBoolean(obj, j);
                    }
                }

                @Override
                public final byte I00000oOI(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
                            return Ooil11Oi.I000II ? Ooil11Oi.I0001Ioi1lo(j, obj) : Ooil11Oi.I000II(j, obj);
                        case 1:
                            return Ooil11Oi.I000II ? Ooil11Oi.I0001Ioi1lo(j, obj) : Ooil11Oi.I000II(j, obj);
                        default:
/* 8 */                     return this.I00000oOI.getByte(obj, j);
                    }
                }

                @Override
                public final double I0000Il00O(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 30 */                    return Double.longBitsToDouble(this.I00000oOI.getLong(obj, j));
                        case 1:
/* 19 */                    return Double.longBitsToDouble(this.I00000oOI.getLong(obj, j));
                        default:
/* 8 */                     return this.I00000oOI.getDouble(obj, j);
                    }
                }

                @Override
                public final float I0000O(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 30 */                    return Float.intBitsToFloat(this.I00000oOI.getInt(obj, j));
                        case 1:
/* 19 */                    return Float.intBitsToFloat(this.I00000oOI.getInt(obj, j));
                        default:
/* 8 */                     return this.I00000oOI.getFloat(obj, j);
                    }
                }

                @Override
                public final void I0000oI00(Object obj, long j, boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 28 */                    if (!Ooil11Oi.I000II) {
/* 36 */                        Ooil11Oi.I000o00OoI0I(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 31 */                        Ooil11Oi.I000lI(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                        case 1:
/* 14 */                    if (!Ooil11Oi.I000II) {
/* 22 */                        Ooil11Oi.I000o00OoI0I(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 17 */                        Ooil11Oi.I000lI(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                        default:
/* 8 */                     this.I00000oOI.putBoolean(obj, j, z);
                            break;
                    }
                }

                @Override
                public final void I0001Ioi1lo(Object obj, long j, byte b) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 26 */                    if (!Ooil11Oi.I000II) {
/* 32 */                        Ooil11Oi.I000o00OoI0I(obj, j, b);
                                break;
                            } else {
/* 28 */                        Ooil11Oi.I000lI(obj, j, b);
                                break;
                            }
                        case 1:
/* 14 */                    if (!Ooil11Oi.I000II) {
/* 20 */                        Ooil11Oi.I000o00OoI0I(obj, j, b);
                                break;
                            } else {
/* 16 */                        Ooil11Oi.I000lI(obj, j, b);
                                break;
                            }
                        default:
/* 8 */                     this.I00000oOI.putByte(obj, j, b);
                            break;
                    }
                }

                @Override
                public final void I000II(Object obj, long j, double d) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 32 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                        case 1:
/* 20 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                        default:
/* 8 */                     this.I00000oOI.putDouble(obj, j, d);
                            break;
                    }
                }

                @Override
                public final void I000O01llI0(Object obj, long j, float f) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 28 */                    this.I00000oOI.putInt(obj, j, Float.floatToIntBits(f));
                            break;
                        case 1:
/* 18 */                    this.I00000oOI.putInt(obj, j, Float.floatToIntBits(f));
                            break;
                        default:
/* 8 */                     this.I00000oOI.putFloat(obj, j, f);
                            break;
                    }
                }

                @Override
                public boolean I000OOo1O() {
                    switch (this.I0000Il00O) {
                        case 2:
/* 16 */                    if (!super.I000OOo1O()) {
/* 15 */                        return false;
                            }
                            try {
/* 21 */                        Class<?> cls = this.I00000oOI.getClass();
/* 29 */                        Class cls2 = Long.TYPE;
/* 35 */                        cls.getMethod("getByte", Object.class, cls2);
/* 46 */                        cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
/* 55 */                        cls.getMethod("getBoolean", Object.class, cls2);
/* 66 */                        cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
/* 75 */                        cls.getMethod("getFloat", Object.class, cls2);
/* 86 */                        cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
/* 95 */                        cls.getMethod("getDouble", Object.class, cls2);
/* 106 */                       cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
/* 109 */                       return true;
                            } catch (Throwable th) {
/* 112 */                       Ooil11Oi.I000iOII(th);
/* 15 */                        return false;
                            }
                        default:
/* 6 */                     return super.I000OOo1O();
                    }
                }

                @Override
                public final boolean I000OiO() {
                    switch (this.I0000Il00O) {
                        case 0:
                        case 1:
                            break;
                        default:
/* 11 */                    Unsafe unsafe = this.I00000oOI;
/* 13 */                    if (unsafe != null) {
                                try {
/* 17 */                            Class<?> cls = unsafe.getClass();
/* 29 */                            cls.getMethod("objectFieldOffset", Field.class);
/* 34 */                            Class cls2 = Long.TYPE;
/* 40 */                            cls.getMethod("getLong", Object.class, cls2);
/* 47 */                            if (Ooil11Oi.I0000Il00O() != null) {
                                        try {
/* 50 */                                    Class<?> cls3 = unsafe.getClass();
/* 60 */                                    cls3.getMethod("getByte", cls2);
/* 71 */                                    cls3.getMethod("putByte", cls2, Byte.TYPE);
/* 80 */                                    cls3.getMethod("getInt", cls2);
/* 91 */                                    cls3.getMethod("putInt", cls2, Integer.TYPE);
/* 98 */                                    cls3.getMethod("getLong", cls2);
/* 107 */                                   cls3.getMethod("putLong", cls2, cls2);
/* 114 */                                   cls3.getMethod("copyMemory", cls2, cls2, cls2);
/* 121 */                                   cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                                            break;
                                        } catch (Throwable th) {
/* 127 */                                   Ooil11Oi.I000iOII(th);
/* 3 */                                     return false;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 132 */                           Ooil11Oi.I000iOII(th2);
/* 3 */                             return false;
                                }
                            }
                            break;
                    }
/* 3 */             return false;
                }
            }
