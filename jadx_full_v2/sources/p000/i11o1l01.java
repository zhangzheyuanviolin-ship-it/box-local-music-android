            package p000;

            import sun.misc.Unsafe;
            
            public final class i11o1l01 extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i11o1l01(Unsafe unsafe, int i) {
/* 4 */             super(unsafe, 3);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final double I000iOII(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Double.longBitsToDouble(unsafe.getLong(obj, j));
                }

                @Override
                public final float I000l1(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Float.intBitsToFloat(unsafe.getInt(obj, j));
                }

                @Override
                public final void I000lI(Object obj, long j, boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!i11oI1O.I000II) {
/* 26 */                        i11oI1O.I0000O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 22 */                        i11oI1O.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                        default:
/* 8 */                     if (!i11oI1O.I000II) {
/* 14 */                        i11oI1O.I0000O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 10 */                        i11oI1O.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                    }
                }

                @Override
                public final void I000o00OoI0I(Object obj, long j, byte b) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!i11oI1O.I000II) {
/* 26 */                        i11oI1O.I0000O(obj, j, b);
                                break;
                            } else {
/* 22 */                        i11oI1O.I0000Il00O(obj, j, b);
                                break;
                            }
                        default:
/* 8 */                     if (!i11oI1O.I000II) {
/* 14 */                        i11oI1O.I0000O(obj, j, b);
                                break;
                            } else {
/* 10 */                        i11oI1O.I0000Il00O(obj, j, b);
                                break;
                            }
                    }
                }

                @Override
                public final void I000oI1ioi(Object obj, long j, double d) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 24 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                        default:
/* 12 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                    }
                }

                @Override
                public final void I00100l0(Object obj, long j, float f) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                        case 0:
/* 20 */                    unsafe.putInt(obj, j, Float.floatToIntBits(f));
                            break;
                        default:
/* 12 */                    unsafe.putInt(obj, j, Float.floatToIntBits(f));
                            break;
                    }
                }

                @Override
                public final boolean I00100o1O0lo(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 22 */                    if (!i11oI1O.I000II) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 8 */                     if (!i11oI1O.I000II) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 15 */            return i11oI1O.I000iOII(j, obj);
                }
            }
