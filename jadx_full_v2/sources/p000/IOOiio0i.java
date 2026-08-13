            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOOiio0i {
                public static final long I00000oOI = iiO01ll11o1l.I0000Il00O(4278190080L);
                public static final long I0000Il00O = iiO01ll11o1l.I0000Il00O(4282664004L);
                public static final long I0000O = iiO01ll11o1l.I0000Il00O(4287137928L);
                public static final long I0000oI00 = iiO01ll11o1l.I0000Il00O(4291611852L);
                public static final long I0001Ioi1lo = iiO01ll11o1l.I0000Il00O(4294967295L);
                public static final long I000II = iiO01ll11o1l.I0000Il00O(4294901760L);
                public static final long I000O01llI0 = iiO01ll11o1l.I0000Il00O(4278255360L);
                public static final long I000OOo1O = iiO01ll11o1l.I0000Il00O(4278190335L);
                public static final long I000OiO = iiO01ll11o1l.I0000Il00O(4294967040L);
                public static final long I000iOII = iiO01ll11o1l.I0000Il00O(4278255615L);
                public static final long I000l1 = iiO01ll11o1l.I0000Il00O(4294902015L);
                public static final long I000lI = iiO01ll11o1l.I00000oOI(0);
                public static final long I000o00OoI0I;
                public static final int I000oI1ioi = 0;
                public long I00000oIO;

                static {
/* 129 */           float[] fArr = IOOlIOOi0O0.I00000oIO;
/* 138 */           I000o00OoI0I = iiO01ll11o1l.I00000oIO(0.0f, 0.0f, 0.0f, 0.0f, IOOlIOOi0O0.I001IIilI0O);
                }

                public static final IOOiio0i I00000oIO(long j) {
/* 3 */             IOOiio0i iOOiio0i = new IOOiio0i();
/* 6 */             iOOiio0i.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iOOiio0i;
                }

                public static final long I00000oOI(long j, IOOl0ll iOOl0ll) {
                    IOlooIIIi iOlooIIIiI0000O;
/* 1 */             IOOl0ll iOOl0llI0001Ioi1lo = I0001Ioi1lo(j);
/* 5 */             int i = iOOl0llI0001Ioi1lo.I0000Il00O;
/* 7 */             int i2 = iOOl0ll.I0000Il00O;
/* 11 */            if ((i | i2) < 0) {
/* 13 */                iOlooIIIiI0000O = iiOiII0.I0000O(iOOl0llI0001Ioi1lo, iOOl0ll);
                    } else {
/* 18 */                OI0l1oli1I oI0l1oli1I = IOloolllII.I00000oIO;
/* 22 */                int i3 = i | (i2 << 6);
/* 23 */                Object objI00000oOI = oI0l1oli1I.I00000oOI(i3);
/* 27 */                if (objI00000oOI == null) {
/* 29 */                    objI00000oOI = iiOiII0.I0000O(iOOl0llI0001Ioi1lo, iOOl0ll);
/* 33 */                    oI0l1oli1I.I000OOo1O(i3, objI00000oOI);
                        }
/* 37 */                iOlooIIIiI0000O = (IOlooIIIi) objI00000oOI;
                    }
/* 39 */            return iOlooIIIiI0000O.I00000oIO(j);
                }

                public static long I0000Il00O(float f, long j) {
/* 17 */            return iiO01ll11o1l.I00000oIO(I000O01llI0(j), I000II(j), I0000oI00(j), f, I0001Ioi1lo(j));
                }

                public static final float I0000O(long j) {
                    float fI00000oIO;
                    float f;
/* 8 */             if ((63 & j) == 0) {
/* 20 */                fI00000oIO = (float) li01Io1li.I00000oIO((j >>> 56) & 255);
/* 21 */                f = 255.0f;
                    } else {
/* 34 */                fI00000oIO = (float) li01Io1li.I00000oIO((j >>> 6) & 1023);
/* 35 */                f = 1023.0f;
                    }
/* 23 */            return fI00000oIO / f;
                }

                public static final float I0000oI00(long j) {
                    int i;
                    int i2;
                    int i3;
/* 8 */             if ((63 & j) == 0) {
/* 23 */                return ((float) li01Io1li.I00000oIO((j >>> 32) & 255)) / 255.0f;
                    }
/* 33 */            short s = (short) ((j >>> 16) & 65535);
/* 41 */            int i4 = 32768 & s;
/* 46 */            int i5 = ((65535 & s) >>> 10) & 31;
/* 47 */            int i6 = s & 1023;
/* 49 */            if (i5 != 0) {
/* 71 */                int i7 = i6 << 13;
/* 73 */                if (i5 == 31) {
/* 75 */                    i = 255;
/* 77 */                    if (i7 != 0) {
/* 81 */                        i7 |= 4194304;
                            }
                        } else {
/* 86 */                    i = i5 + 112;
                        }
/* 82 */                int i8 = i;
/* 83 */                i2 = i7;
/* 84 */                i3 = i8;
                    } else {
/* 51 */                if (i6 != 0) {
/* 62 */                    float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - IlOO1i0O.I00000oIO;
                            return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
                        }
/* 68 */                i3 = 0;
/* 69 */                i2 = 0;
                    }
/* 95 */            return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
                }

                public static final IOOl0ll I0001Ioi1lo(long j) {
/* 1 */             float[] fArr = IOOlIOOi0O0.I00000oIO;
/* 9 */             return IOOlIOOi0O0.I001iOo1i0O[(int) (j & 63)];
                }

                public static final float I000II(long j) {
                    int i;
                    int i2;
                    int i3;
/* 8 */             if ((63 & j) == 0) {
/* 23 */                return ((float) li01Io1li.I00000oIO((j >>> 40) & 255)) / 255.0f;
                    }
/* 33 */            short s = (short) ((j >>> 32) & 65535);
/* 41 */            int i4 = 32768 & s;
/* 46 */            int i5 = ((65535 & s) >>> 10) & 31;
/* 47 */            int i6 = s & 1023;
/* 49 */            if (i5 != 0) {
/* 71 */                int i7 = i6 << 13;
/* 73 */                if (i5 == 31) {
/* 75 */                    i = 255;
/* 77 */                    if (i7 != 0) {
/* 81 */                        i7 |= 4194304;
                            }
                        } else {
/* 86 */                    i = i5 + 112;
                        }
/* 82 */                int i8 = i;
/* 83 */                i2 = i7;
/* 84 */                i3 = i8;
                    } else {
/* 51 */                if (i6 != 0) {
/* 62 */                    float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - IlOO1i0O.I00000oIO;
                            return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
                        }
/* 68 */                i3 = 0;
/* 69 */                i2 = 0;
                    }
/* 95 */            return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
                }

                public static final float I000O01llI0(long j) {
                    int i;
                    int i2;
                    int i3;
/* 10 */            if ((63 & j) == 0) {
/* 23 */                return ((float) li01Io1li.I00000oIO((j >>> 48) & 255)) / 255.0f;
                    }
/* 31 */            short s = (short) ((j >>> 48) & 65535);
/* 39 */            int i4 = 32768 & s;
/* 44 */            int i5 = ((65535 & s) >>> 10) & 31;
/* 45 */            int i6 = s & 1023;
/* 47 */            if (i5 != 0) {
/* 69 */                int i7 = i6 << 13;
/* 71 */                if (i5 == 31) {
/* 73 */                    i = 255;
/* 75 */                    if (i7 != 0) {
/* 79 */                        i7 |= 4194304;
                            }
                        } else {
/* 84 */                    i = i5 + 112;
                        }
/* 80 */                int i8 = i;
/* 81 */                i2 = i7;
/* 82 */                i3 = i8;
                    } else {
/* 49 */                if (i6 != 0) {
/* 60 */                    float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - IlOO1i0O.I00000oIO;
                            return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
                        }
/* 66 */                i3 = 0;
/* 67 */                i2 = 0;
                    }
/* 93 */            return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
                }

                public static String I000OOo1O(long j) {
/* 1 */             float fI000O01llI0 = I000O01llI0(j);
/* 5 */             float fI000II = I000II(j);
/* 9 */             float fI0000oI00 = I0000oI00(j);
/* 13 */            float fI0000O = I0000O(j);
/* 21 */            String str = I0001Ioi1lo(j).I00000oIO;
/* 27 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("Color(", fI000O01llI0, ", ", fI000II, ", ");
/* 31 */            sbI00100l0.append(fI0000oI00);
/* 34 */            sbI00100l0.append(", ");
/* 37 */            sbI00100l0.append(fI0000O);
/* 40 */            sbI00100l0.append(", ");
/* 45 */            return IIl001iO0Io.I00100l0(sbI00100l0, str, ")");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IOOiio0i) && this.I00000oIO == ((IOOiio0i) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I000OOo1O(this.I00000oIO);
                }
            }
