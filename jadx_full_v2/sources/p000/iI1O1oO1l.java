            package p000;

            import sun.misc.Unsafe;
            
            public final class iI1O1oO1l extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iI1O1oO1l(Unsafe unsafe, int i) {
/* 5 */             super(unsafe, 8);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final void I0010o(Object obj, long j, byte b) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!iI1Oili0OI.I0001Ioi1lo) {
/* 26 */                        iI1Oili0OI.I0000Il00O(obj, j, b);
                                break;
                            } else {
/* 22 */                        iI1Oili0OI.I00000oOI(obj, j, b);
                                break;
                            }
                        default:
/* 8 */                     if (!iI1Oili0OI.I0001Ioi1lo) {
/* 14 */                        iI1Oili0OI.I0000Il00O(obj, j, b);
                                break;
                            } else {
/* 10 */                        iI1Oili0OI.I00000oOI(obj, j, b);
                                break;
                            }
                    }
                }

                @Override
                public final boolean I001i1O0Ol(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 22 */                    if (!iI1Oili0OI.I0001Ioi1lo) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 8 */                     if (!iI1Oili0OI.I0001Ioi1lo) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 15 */            return iI1Oili0OI.I000o00OoI0I(obj, j);
                }

                @Override
                public final void I001iOo1i0O(Object obj, long j, boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!iI1Oili0OI.I0001Ioi1lo) {
/* 26 */                        iI1Oili0OI.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 22 */                        iI1Oili0OI.I00000oOI(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                        default:
/* 8 */                     if (!iI1Oili0OI.I0001Ioi1lo) {
/* 14 */                        iI1Oili0OI.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 10 */                        iI1Oili0OI.I00000oOI(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                    }
                }

                @Override
                public final float I001l0I00(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Float.intBitsToFloat(unsafe.getInt(obj, j));
                }

                @Override
                public final void I00IO1(Object obj, long j, float f) {
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
                public final double I00IO1oi11O(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Double.longBitsToDouble(unsafe.getLong(obj, j));
                }

                @Override
                public final void I00Io1lO(Object obj, long j, double d) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 24 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                        default:
/* 12 */                    this.I00000oOI.putLong(obj, j, Double.doubleToLongBits(d));
                            break;
                    }
                }
            }
