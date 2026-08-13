            package p000;

            import sun.misc.Unsafe;
            
            public final class ii10OOi0loOO extends Ooil0oIOI0l0 {
                public final int I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii10OOi0loOO(Unsafe unsafe, int i) {
/* 5 */             super(unsafe, 10);
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
/* 20 */                    if (!ii10Oo1I0.I000II) {
/* 26 */                        ii10Oo1I0.I0000O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 22 */                        ii10Oo1I0.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                        default:
/* 8 */                     if (!ii10Oo1I0.I000II) {
/* 14 */                        ii10Oo1I0.I0000O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            } else {
/* 10 */                        ii10Oo1I0.I0000Il00O(obj, j, z ? (byte) 1 : (byte) 0);
                                break;
                            }
                    }
                }

                @Override
                public final void I001lIiIIo1O(Object obj, long j, byte b) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 20 */                    if (!ii10Oo1I0.I000II) {
/* 26 */                        ii10Oo1I0.I0000O(obj, j, b);
                                break;
                            } else {
/* 22 */                        ii10Oo1I0.I0000Il00O(obj, j, b);
                                break;
                            }
                        default:
/* 8 */                     if (!ii10Oo1I0.I000II) {
/* 14 */                        ii10Oo1I0.I0000O(obj, j, b);
                                break;
                            } else {
/* 10 */                        ii10Oo1I0.I0000Il00O(obj, j, b);
                                break;
                            }
                    }
                }

                @Override
                public final void I00II0oii1o(Object obj, long j, double d) {
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
                public final void I00IioO0OiOi(Object obj, long j, float f) {
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
                public final boolean I00Io1o110i(Object obj, long j) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 22 */                    if (!ii10Oo1I0.I000II) {
                                break;
                            } else {
                                break;
                            }
                        default:
/* 8 */                     if (!ii10Oo1I0.I000II) {
                                break;
                            } else {
                                break;
                            }
                    }
/* 15 */            return ii10Oo1I0.I000lI(obj, j);
                }
            }
