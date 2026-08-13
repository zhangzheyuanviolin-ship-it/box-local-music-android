            package p000;

            import sun.misc.Unsafe;
            
            public final class i1oo0o0o extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i1oo0o0o(Unsafe unsafe, int i) {
/* 4 */             super(unsafe, 6);
/* 1 */             this.I0000Il00O = i;
                }

                @Override
                public final double I0010I0i(Object obj, long j) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Double.longBitsToDouble(unsafe.getLong(obj, j));
                }

                @Override
                public final float I001IIilI0O(Object obj, long j) {
/* 1 */             int i = this.I0000Il00O;
/* 3 */             Unsafe unsafe = this.I00000oOI;
                    switch (i) {
                    }
/* 12 */            return Float.intBitsToFloat(unsafe.getInt(obj, j));
                }

                @Override
                public final void I001iOo1i0O(Object obj, long j, boolean z) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!iI001OlIIlol.I0001Ioi1lo) {
/* 26 */                        iI001OlIIlol.I0000oI00(obj, j, z);
                                break;
                            } else {
/* 22 */                        iI001OlIIlol.I0000O(obj, j, z);
                                break;
                            }
                        default:
/* 8 */                     if (!iI001OlIIlol.I0001Ioi1lo) {
/* 14 */                        iI001OlIIlol.I0000oI00(obj, j, z);
                                break;
                            } else {
/* 10 */                        iI001OlIIlol.I0000O(obj, j, z);
                                break;
                            }
                    }
                }

                @Override
                public final void I001lllioOl(Object obj, long j, double d) {
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
                public final boolean I00IlilI0i0i(long j, Object obj) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 22 */                    if (!iI001OlIIlol.I0001Ioi1lo) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 8 */                     if (!iI001OlIIlol.I0001Ioi1lo) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 15 */            return iI001OlIIlol.I000OOo1O(j, obj);
                }
            }
