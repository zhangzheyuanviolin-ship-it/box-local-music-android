            package p000;

            import sun.misc.Unsafe;
            
            public final class iOo011i extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOo011i(Unsafe unsafe, int i) {
/* 5 */             super(unsafe, 9);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final boolean I00111O(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 22 */                    if (!iOo0Ii1l.I0000oI00) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 8 */                     if (!iOo0Ii1l.I0000oI00) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 15 */            return iOo0Ii1l.I000OOo1O(j, obj);
                }

                @Override
                public final void I001IO000(Object obj, long j, boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!iOo0Ii1l.I0000oI00) {
/* 26 */                        iOo0Ii1l.I000iOII(obj, j, z);
                                break;
                            } else {
/* 22 */                        iOo0Ii1l.I000OiO(obj, j, z);
                                break;
                            }
                        default:
/* 8 */                     if (!iOo0Ii1l.I0000oI00) {
/* 14 */                        iOo0Ii1l.I000iOII(obj, j, z);
                                break;
                            } else {
/* 10 */                        iOo0Ii1l.I000OiO(obj, j, z);
                                break;
                            }
                    }
                }

                @Override
                public final float I001i1lo1io(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Float.intBitsToFloat(unsafe.getInt(obj, j));
                }

                @Override
                public final void I001lloI(Object obj, long j, float f) {
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
                public final double I00II0Ol1O0l(long j, Object obj) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Double.longBitsToDouble(unsafe.getLong(obj, j));
                }

                @Override
                public final void I00IOO(Object obj, long j, double d) {
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
