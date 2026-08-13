            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OIo1liiIIOOl {
                public Oi00IilOloo0 I00000oIO;
                public OI0l1oli1I I00000oOI;
                public OI0lOIOi1l I0000Il00O;
                public OI0l1iIo1 I0000O;
                public OI0l1oli1I I0000oI00;
                public float I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public boolean I000l1;
                public int I000lI;
                public O0llioI1 I000o00OoI0I;
                public IoIlOo1o0IIl I000oI1ioi;

                public final int I00000oIO(IoIlOo1o0IIl ioIlOo1o0IIl, int i, boolean z) {
                    List list;
                    List list2;
/* 1 */             OI0l1oli1I oI0l1oli1I = this.I00000oOI;
/* 3 */             OI0l1oli1I oI0l1oli1I2 = this.I0000oI00;
/* 9 */             if (oI0l1oli1I2.I00000oIO(i)) {
/* 17 */                return ((IIi1oI) oI0l1oli1I2.I00000oOI(i)).I00000oOI;
                    }
/* 24 */            int i2 = 0;
/* 25 */            if (oI0l1oli1I.I00000oIO(i)) {
/* 27 */                if (!z || (list2 = (List) oI0l1oli1I.I00000oOI(i)) == null) {
/* 108 */                   return -1;
                        }
/* 40 */                int size = list2.size();
/* 44 */                while (i2 < size) {
/* 52 */                    ((O0llilIO0) list2.get(i2)).I00000oIO();
/* 55 */                    i2++;
                        }
/* 108 */               return -1;
                    }
/* 60 */            IIi1iOi iIi1iOi = new IIi1iOi(i2);
/* 63 */            iIi1iOi.I00iiI = this;
/* 65 */            iIi1iOi.I00iiO = ioIlOo1o0IIl;
/* 67 */            VarHandle.storeStoreFence();
/* 74 */            oI0l1oli1I.I000OOo1O(i, ioIlOo1o0IIl.I00Io1o110i(i, iIi1iOi));
/* 77 */            if (!z || (list = (List) oI0l1oli1I.I00000oOI(i)) == null) {
/* 108 */               return -1;
                    }
/* 90 */            int size2 = list.size();
/* 94 */            while (i2 < size2) {
/* 102 */               ((O0llilIO0) list.get(i2)).I00000oIO();
/* 105 */               i2++;
                    }
/* 108 */           return -1;
                }

                public final boolean I00000oOI() {
                    return (this.I000O01llI0 == Integer.MAX_VALUE || this.I000OOo1O == Integer.MIN_VALUE) ? false : true;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(IoIlOo1o0IIl ioIlOo1o0IIl, int i, int i2) {
                    int i3;
/* 1 */             OI0l1oli1I oI0l1oli1I = this.I0000oI00;
/* 7 */             IIi1oI iIi1oI = (IIi1oI) oI0l1oli1I.I00000oOI(i);
/* 9 */             liIoOiiO1Oi liiooiio1oi = IIi1oI.I0000Il00O;
/* 11 */            if (iIi1oI != null) {
/* 13 */                iIi1oI.I00000oOI = i2;
/* 15 */                iIi1oI.I00000oIO = liiooiio1oi;
                    } else {
/* 20 */                iIi1oI = new IIi1oI();
/* 23 */                iIi1oI.I00000oIO = liiooiio1oi;
/* 25 */                iIi1oI.I00000oOI = i2;
                    }
/* 27 */            oI0l1oli1I.I000OOo1O(i, iIi1oI);
/* 32 */            if (i > this.I000OOo1O) {
/* 34 */                this.I000OOo1O = i;
                        this.I000iOII -= i2;
                    } else if (i < this.I000O01llI0) {
/* 46 */                this.I000O01llI0 = i;
                        this.I000OiO -= i2;
                    }
/* 62 */            int i4 = 1;
/* 64 */            if (Math.signum(this.I0001Ioi1lo) <= 0.0f) {
/* 92 */                i3 = this.I000iOII > 0 ? this.I000OOo1O + 1 : -1;
                    } else if (Math.signum(this.I0001Ioi1lo) > 0.0f && this.I000OiO > 0) {
/* 90 */                i3 = this.I000O01llI0 - 1;
                    }
/* 93 */            if (i3 > 0) {
/* 95 */                ioIlOo1o0IIl.getClass();
/* 98 */                if (i3 != -1 && i3 < this.I000lI) {
/* 104 */                   OI0l1oli1I oI0l1oli1I2 = this.I00000oOI;
/* 108 */                   IIi1iOi iIi1iOi = new IIi1iOi(i4);
/* 111 */                   iIi1iOi.I00iiI = this;
/* 113 */                   iIi1iOi.I00iiO = ioIlOo1o0IIl;
/* 115 */                   VarHandle.storeStoreFence();
/* 122 */                   oI0l1oli1I2.I000OOo1O(i3, ioIlOo1o0IIl.I00Io1o110i(i3, iIi1iOi));
                        }
                    }
/* 125 */           I000O01llI0();
                }

                public final void I0000O(IoIlOo1o0IIl ioIlOo1o0IIl, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
                    int i6;
                    int i7;
/* 19 */            boolean z2 = Math.signum(f) == Math.signum(this.I0001Ioi1lo);
/* 22 */            if (!z) {
/* 115 */               if (!z2 || this.I000l1) {
/* 141 */                   this.I000OiO = i3 - i5;
/* 143 */                   this.I000O01llI0 = i;
                        } else {
/* 132 */                   int iI000II = O1OooO0IlOo.I000II(Math.abs(f)) + this.I000OiO;
/* 133 */                   int i8 = i3 - i5;
/* 134 */                   if (iI000II > i8) {
/* 136 */                       iI000II = i8;
                            }
/* 137 */                   this.I000OiO = iI000II;
                        }
/* 147 */               while (this.I000OiO > 0 && (i6 = this.I000O01llI0) > 0) {
/* 179 */                   int iI00000oIO = I00000oIO(ioIlOo1o0IIl, this.I000O01llI0 - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
/* 183 */                   if (iI00000oIO == -1) {
/* 1750 */                      return;
                            }
                            this.I000O01llI0--;
                            this.I000OiO -= iI00000oIO;
                        }
/* 1750 */              return;
                    }
/* 24 */            if (!z2 || this.I000l1) {
/* 50 */                this.I000iOII = i3 - i4;
/* 52 */                this.I000OOo1O = i2;
                    } else {
/* 41 */                int iI000II2 = O1OooO0IlOo.I000II(Math.abs(f)) + this.I000iOII;
/* 42 */                int i9 = i3 - i4;
/* 43 */                if (iI000II2 > i9) {
/* 45 */                    iI000II2 = i9;
                        }
/* 46 */                this.I000iOII = iI000II2;
                    }
/* 56 */            while (this.I000iOII > 0) {
/* 58 */                int i10 = this.I000OOo1O;
/* 60 */                ioIlOo1o0IIl.getClass();
/* 63 */                if (i10 == -1 || (i7 = this.I000OOo1O) >= this.I000lI - 1) {
/* 1750 */                  return;
                        }
/* 98 */                int iI00000oIO2 = I00000oIO(ioIlOo1o0IIl, this.I000OOo1O + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
/* 102 */               if (iI00000oIO2 == -1) {
/* 1750 */                  return;
                        }
                        this.I000OOo1O++;
                        this.I000iOII -= iI00000oIO2;
                    }
                }

                public final void I0000oI00(float f, OIoI1lIli oIoI1lIli) {
                    OIo1liiIIOOl oIo1liiIIOOl;
                    int i;
                    int i2;
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I000oI1ioi;
/* 3 */             ioIlOo1o0IIl.I00iiO = oIoI1lIli;
/* 7 */             ioIlOo1o0IIl.I00iio = this.I000o00OoI0I;
/* 9 */             float f2 = -f;
/* 10 */            Oi00IilOloo0 oi00IilOloo0 = this.I00000oIO;
/* 12 */            I000O01llI0();
/* 22 */            if (ioIlOo1o0IIl.I001IO000()) {
/* 28 */                l1o01i0.I00000oIO(ioIlOo1o0IIl.I001i1lo1io());
/* 37 */                if (ioIlOo1o0IIl.I001i1lo1io().I00111O != null) {
/* 39 */                    oi00IilOloo0.getClass();
                        }
/* 46 */                this.I000lI = ioIlOo1o0IIl.I001lllioOl();
/* 48 */                int iI001IIilI0O = ioIlOo1o0IIl.I001IIilI0O();
/* 52 */                int iI001i1O0Ol = ioIlOo1o0IIl.I001i1O0Ol();
/* 56 */                int iI001lllioOl = ioIlOo1o0IIl.I001lllioOl();
/* 60 */                int iI001l0I00 = ioIlOo1o0IIl.I001l0I00();
/* 64 */                int iI001iOo1i0O = ioIlOo1o0IIl.I001iOo1i0O();
/* 68 */                OI0l1oli1I oI0l1oli1I = this.I0000oI00;
/* 72 */                if (f2 <= 0.0f) {
/* 76 */                    this.I000OiO = 0 - iI001l0I00;
/* 78 */                    this.I000O01llI0 = iI001IIilI0O;
/* 82 */                    while (this.I000OiO > 0 && (i2 = this.I000O01llI0) > 0 && oI0l1oli1I.I00000oIO(i2 - 1)) {
                                this.I000O01llI0--;
/* 105 */                       this.I000OiO -= ((IIi1oI) oI0l1oli1I.I00000oOI(this.I000O01llI0 - 1)).I00000oOI;
                            }
/* 122 */                   I0001Ioi1lo(0, this.I000O01llI0 - 1);
                        } else {
/* 128 */                   this.I000iOII = 0 - iI001iOo1i0O;
/* 130 */                   this.I000OOo1O = iI001i1O0Ol;
/* 134 */                   while (this.I000iOII > 0 && (i = this.I000OOo1O) < iI001lllioOl - 1 && oI0l1oli1I.I00000oIO(i + 1)) {
/* 159 */                       int i3 = ((IIi1oI) oI0l1oli1I.I00000oOI(this.I000OOo1O + 1)).I00000oOI;
                                this.I000OOo1O++;
                                this.I000iOII -= i3;
                            }
/* 176 */                   I0001Ioi1lo(this.I000OOo1O + 1, iI001lllioOl - 1);
                        }
                    }
/* 183 */           if (ioIlOo1o0IIl.I001IO000()) {
/* 189 */               l1o01i0.I00000oIO(ioIlOo1o0IIl.I001i1lo1io());
/* 233 */               oIo1liiIIOOl = this;
/* 237 */               oIo1liiIIOOl.I0000O(ioIlOo1o0IIl, ioIlOo1o0IIl.I001IIilI0O(), ioIlOo1o0IIl.I001i1O0Ol(), ioIlOo1o0IIl.I001i1lo1io().I00111O != null ? ((IiI0O1Io) oi00IilOloo0.I00iOIl).I000oI1ioi : 0, ioIlOo1o0IIl.I001iOo1i0O(), ioIlOo1o0IIl.I001l0I00(), f2, f2 <= 0.0f);
                    } else {
/* 241 */               oIo1liiIIOOl = this;
                    }
/* 242 */           oIo1liiIIOOl.I0001Ioi1lo = f2;
/* 244 */           oIo1liiIIOOl.I000O01llI0();
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(int i, int i2) {
                    long j;
                    char c;
                    long j2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
/* 7 */             OI0l1oli1I oI0l1oli1I = this.I0000oI00;
/* 9 */             OI0l1iIo1 oI0l1iIo1 = this.I0000O;
/* 11 */            OI0lOIOi1l oI0lOIOi1l = this.I0000Il00O;
/* 13 */            oI0lOIOi1l.I00000oOI();
/* 16 */            OI0l1oli1I oI0l1oli1I2 = this.I00000oOI;
/* 18 */            int[] iArr = oI0l1oli1I2.I00000oOI;
/* 20 */            long[] jArr = oI0l1oli1I2.I00000oIO;
                    int length = jArr.length - 2;
/* 27 */            int i9 = 8;
/* 29 */            if (length >= 0) {
/* 31 */                int i10 = 0;
/* 32 */                j = 255;
                        while (true) {
/* 34 */                    long j3 = jArr[i10];
/* 36 */                    c = 7;
/* 38 */                    j2 = -9187201950435737472L;
/* 51 */                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 58 */                        int i11 = 8 - ((~(i10 - length)) >>> 31);
/* 61 */                        for (int i12 = 0; i12 < i11; i12++) {
/* 67 */                            if ((j3 & 255) < 128 && i <= (i8 = iArr[(i10 << 3) + i12]) && i8 <= i2) {
/* 78 */                                oI0lOIOi1l.I00000oIO(i8);
                                    }
/* 81 */                            j3 >>= 8;
                                }
/* 85 */                        if (i11 != 8) {
                                    break;
                                } else if (i10 == length) {
                                    break;
                                } else {
/* 89 */                            i10++;
                                }
                            }
                        }
                    } else {
/* 92 */                j = 255;
/* 94 */                c = 7;
/* 96 */                j2 = -9187201950435737472L;
                    }
/* 101 */           int[] iArr2 = oI0l1iIo1.I00000oOI;
/* 103 */           long[] jArr2 = oI0l1iIo1.I00000oIO;
                    int length2 = jArr2.length - 2;
/* 108 */           if (length2 >= 0) {
/* 110 */               int i13 = 0;
                        while (true) {
/* 111 */                   long j4 = jArr2[i13];
/* 121 */                   if ((((~j4) << c) & j4 & j2) != j2) {
/* 128 */                       int i14 = 8 - ((~(i13 - length2)) >>> 31);
/* 131 */                       for (int i15 = 0; i15 < i14; i15++) {
/* 137 */                           if ((j4 & j) < 128 && i <= (i7 = iArr2[(i13 << 3) + i15]) && i7 <= i2) {
/* 148 */                               oI0lOIOi1l.I00000oIO(i7);
                                    }
/* 151 */                           j4 >>= 8;
                                }
/* 155 */                       if (i14 != 8) {
                                    break;
                                } else if (i13 == length2) {
                                    break;
                                } else {
/* 159 */                           i13++;
                                }
                            }
                        }
                    }
/* 162 */           int[] iArr3 = oI0l1oli1I.I00000oOI;
/* 164 */           long[] jArr3 = oI0l1oli1I.I00000oIO;
                    int length3 = jArr3.length - 2;
/* 169 */           if (length3 >= 0) {
/* 171 */               int i16 = 0;
                        while (true) {
/* 172 */                   long j5 = jArr3[i16];
/* 182 */                   if ((((~j5) << c) & j5 & j2) != j2) {
/* 189 */                       int i17 = 8 - ((~(i16 - length3)) >>> 31);
/* 192 */                       for (int i18 = 0; i18 < i17; i18++) {
/* 198 */                           if ((j5 & j) < 128 && i <= (i6 = iArr3[(i16 << 3) + i18]) && i6 <= i2) {
/* 209 */                               oI0lOIOi1l.I00000oIO(i6);
                                    }
/* 212 */                           j5 >>= 8;
                                }
/* 216 */                       if (i17 != 8) {
                                    break;
                                } else if (i16 == length3) {
                                    break;
                                } else {
/* 220 */                           i16++;
                                }
                            }
                        }
                    }
/* 223 */           int[] iArr4 = oI0lOIOi1l.I00000oOI;
/* 225 */           long[] jArr4 = oI0lOIOi1l.I00000oIO;
                    int length4 = jArr4.length - 2;
/* 230 */           if (length4 < 0) {
/* 900 */               return;
                    }
/* 232 */           int i19 = 0;
                    while (true) {
/* 233 */               long j6 = jArr4[i19];
/* 243 */               if ((((~j6) << c) & j6 & j2) != j2) {
/* 250 */                   int i20 = 8 - ((~(i19 - length4)) >>> 31);
/* 252 */                   int i21 = 0;
/* 253 */                   while (i21 < i20) {
/* 259 */                       if ((j6 & j) < 128) {
/* 264 */                           int i22 = iArr4[(i19 << 3) + i21];
/* 270 */                           List list = (List) oI0l1oli1I2.I000II(i22);
/* 272 */                           if (list != null) {
/* 277 */                               int size = list.size();
/* 282 */                               for (int i23 = 0; i23 < size; i23++) {
/* 290 */                                   ((O0llilIO0) list.get(i23)).cancel();
                                        }
                                    }
/* 296 */                           int iI0000Il00O = oI0l1iIo1.I0000Il00O(i22);
/* 300 */                           if (iI0000Il00O >= 0) {
                                        oI0l1iIo1.I0000oI00--;
/* 308 */                               long[] jArr5 = oI0l1iIo1.I00000oIO;
/* 310 */                               int i24 = oI0l1iIo1.I0000O;
/* 312 */                               int i25 = iI0000Il00O >> 3;
/* 316 */                               int i26 = (iI0000Il00O & 7) << 3;
/* 320 */                               i4 = i9;
/* 322 */                               i5 = i20;
/* 333 */                               long j7 = (jArr5[i25] & (~(j << i26))) | (254 << i26);
/* 335 */                               jArr5[i25] = j7;
/* 345 */                               jArr5[(((iI0000Il00O - 7) & i24) + (i24 & 7)) >> 3] = j7;
                                    } else {
/* 348 */                               i4 = i9;
/* 350 */                               i5 = i20;
                                    }
/* 352 */                           oI0l1oli1I.I000II(i22);
                                } else {
/* 356 */                           i4 = i9;
/* 358 */                           i5 = i20;
                                }
/* 360 */                       j6 >>= i4;
/* 362 */                       i21++;
/* 364 */                       i20 = i5;
/* 366 */                       i9 = i4;
                            }
/* 369 */                   i3 = i9;
/* 371 */                   if (i20 != i3) {
/* 900 */                       return;
                            }
                        } else {
/* 374 */                   i3 = i9;
                        }
/* 375 */               if (i19 == length4) {
/* 900 */                   return;
                        }
/* 377 */               i19++;
/* 379 */               i9 = i3;
                    }
                }

                public final void I000II() {
/* 4 */             this.I000O01llI0 = Integer.MAX_VALUE;
/* 8 */             this.I000OOo1O = Integer.MIN_VALUE;
/* 11 */            this.I000OiO = 0;
/* 13 */            this.I000iOII = 0;
/* 15 */            this.I000l1 = false;
/* 19 */            this.I0000O.I00000oIO();
/* 24 */            this.I0000oI00.I0000Il00O();
/* 27 */            OI0l1oli1I oI0l1oli1I = this.I00000oOI;
/* 29 */            long[] jArr = oI0l1oli1I.I00000oIO;
                    int length = jArr.length - 2;
/* 34 */            if (length < 0) {
/* 245 */               return;
                    }
/* 36 */            int i = 0;
                    while (true) {
/* 37 */                long j = jArr[i];
/* 51 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 60 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 63 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 72 */                        if ((255 & j) < 128) {
/* 76 */                            int i4 = (i << 3) + i3;
/* 79 */                            int i5 = oI0l1oli1I.I00000oOI[i4];
/* 85 */                            List list = (List) oI0l1oli1I.I0000Il00O[i4];
/* 90 */                            int size = list.size();
/* 95 */                            for (int i6 = 0; i6 < size; i6++) {
/* 103 */                               ((O0llilIO0) list.get(i6)).cancel();
                                    }
/* 109 */                           oI0l1oli1I.I000O01llI0(i4);
                                }
/* 112 */                       j >>= 8;
                            }
/* 116 */                   if (i2 != 8) {
/* 245 */                       return;
                            }
                        }
/* 118 */               if (i == length) {
/* 245 */                   return;
                        } else {
/* 120 */                   i++;
                        }
                    }
                }

                public final void I000O01llI0() {
/* 6 */             Trace.setCounter("prefetchWindowStartExtraSpace", this.I000OiO);
/* 14 */            Trace.setCounter("prefetchWindowEndExtraSpace", this.I000iOII);
/* 22 */            Trace.setCounter("prefetchWindowStartIndex", this.I000O01llI0);
/* 30 */            Trace.setCounter("prefetchWindowEndIndex", this.I000OOo1O);
                }
            }
