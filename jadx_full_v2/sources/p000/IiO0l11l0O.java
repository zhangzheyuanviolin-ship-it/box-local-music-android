            package p000;
            
            public final class IiO0l11l0O extends OlO1Ol0il0i {
                public static final Object I000O01llI0 = new Object();
                public long I0000Il00O;
                public int I0000O;
                public OI0o11I1 I0000oI00;
                public Object I0001Ioi1lo;
                public int I000II;

                public IiO0l11l0O(long j) {
/* 1 */             super(j);
/* 6 */             this.I0000oI00 = OIOi1iO01.I00000oIO;
/* 10 */            this.I0001Ioi1lo = I000O01llI0;
                }

                @Override
                public final void I00000oIO(OlO1Ol0il0i olO1Ol0il0i) {
/* 1 */             IiO0l11l0O iiO0l11l0O = (IiO0l11l0O) olO1Ol0il0i;
/* 5 */             this.I0000oI00 = iiO0l11l0O.I0000oI00;
/* 9 */             this.I0001Ioi1lo = iiO0l11l0O.I0001Ioi1lo;
/* 13 */            this.I000II = iiO0l11l0O.I000II;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI(long j) {
/* 3 */             return new IiO0l11l0O(j);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000Il00O(IiO0o1I iiO0o1I, Ol1il1o1 ol1il1o1) {
                    boolean z;
                    boolean z2;
/* 1 */             Object obj = Ol1l1lI1Ili.I0000Il00O;
                    synchronized (obj) {
/* 12 */                z = true;
/* 14 */                if (this.I0000Il00O == ol1il1o1.I000II()) {
/* 29 */                    z2 = this.I0000O != ol1il1o1.I000O01llI0();
                        }
                    }
/* 35 */            if (this.I0001Ioi1lo == I000O01llI0 || (z2 && this.I000II != I0000O(iiO0o1I, ol1il1o1))) {
/* 48 */                z = false;
                    }
/* 49 */            if (!z || !z2) {
/* 71 */                return z;
                    }
                    synchronized (obj) {
/* 58 */                this.I0000Il00O = ol1il1o1.I000II();
/* 64 */                this.I0000O = ol1il1o1.I000O01llI0();
                    }
/* 67 */            return z;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
                  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r13v10, types: [IiO0l11l0O] */
                /* JADX WARN: Type inference failed for: r13v5, types: [OlO1Ol0il0i] */
                /* JADX WARN: Type inference failed for: r13v6, types: [OlO1Ol0il0i, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000O(IiO0o1I iiO0o1I, Ol1il1o1 ol1il1o1) {
                    OI0o11I1 oI0o11I1;
                    int iIdentityHashCode;
                    long[] jArr;
                    int i;
                    Object[] objArr;
                    long[] jArr2;
                    int i2;
                    Object[] objArr2;
                    long j;
                    long j2;
                    int i3;
                    ?? I000II;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 8 */                 oI0o11I1 = this.I0000oI00;
                    }
/* 13 */            int i4 = 7;
/* 14 */            if (oI0o11I1.I0000oI00 == 0) {
/* 13 */                return 7;
                    }
/* 16 */            OI110O0 oi110o0I00000oIO = Ol1llolil.I00000oIO();
/* 20 */            Object[] objArr3 = oi110o0I00000oIO.I00iOIl;
/* 22 */            int i5 = oi110o0I00000oIO.I00iiO;
/* 24 */            boolean z = false;
/* 26 */            for (int i6 = 0; i6 < i5; i6++) {
/* 32 */                ((Ilo1olo) objArr3[i6]).I00000oOI();
                    }
                    try {
/* 38 */                Object[] objArr4 = oI0o11I1.I00000oOI;
/* 40 */                int[] iArr = oI0o11I1.I0000Il00O;
/* 42 */                long[] jArr3 = oI0o11I1.I00000oIO;
                        int length = jArr3.length - 2;
/* 47 */                if (length >= 0) {
/* 49 */                    iIdentityHashCode = 7;
/* 50 */                    int i7 = 0;
                            while (true) {
/* 51 */                        long j3 = jArr3[i7];
/* 56 */                        long j4 = -9187201950435737472L;
/* 64 */                        if ((((~j3) << i4) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 71 */                            int i8 = 8;
/* 73 */                            int i9 = 8 - ((~(i7 - length)) >>> 31);
/* 75 */                            i = i4;
/* 77 */                            int i10 = z ? 1 : 0;
/* 78 */                            while (i10 < i9) {
/* 88 */                                if ((j3 & 255) < 128) {
/* 92 */                                    int i11 = (i7 << 3) + i10;
/* 96 */                                    j2 = j4;
/* 102 */                                   OlO11I0O1l olO11I0O1l = (OlO11I0O1l) objArr4[i11];
/* 104 */                                   int i12 = i8;
/* 107 */                                   if (iArr[i11] != 1) {
/* 109 */                                       jArr2 = jArr3;
/* 111 */                                       i2 = i10;
/* 113 */                                       objArr2 = objArr4;
/* 115 */                                       j = j3;
                                            } else {
/* 121 */                                       if (olO11I0O1l instanceof IiO0o1I) {
/* 123 */                                           IiO0o1I iiO0o1I2 = (IiO0o1I) olO11I0O1l;
/* 135 */                                           I000II = iiO0o1I2.I000II((IiO0l11l0O) Ol1l1lI1Ili.I000II(iiO0o1I2.I00iio, ol1il1o1), ol1il1o1, z, iiO0o1I2.I00iiI);
/* 139 */                                           OI0o11I1 oI0o11I12 = I000II.I0000oI00;
/* 141 */                                           Object[] objArr5 = oI0o11I12.I00000oOI;
/* 143 */                                           long[] jArr4 = oI0o11I12.I00000oIO;
                                                    int length2 = jArr4.length - 2;
/* 148 */                                           jArr2 = jArr3;
/* 150 */                                           i2 = i10;
/* 152 */                                           objArr2 = objArr4;
/* 154 */                                           if (length2 >= 0) {
/* 156 */                                               int i13 = 0;
                                                        while (true) {
/* 157 */                                                   long j5 = jArr4[i13];
/* 159 */                                                   j = j3;
/* 161 */                                                   int iIdentityHashCode2 = iIdentityHashCode;
/* 170 */                                                   if ((((~j5) << i) & j5 & j2) != j2) {
/* 177 */                                                       int i14 = 8 - ((~(i13 - length2)) >>> 31);
/* 180 */                                                       for (int i15 = 0; i15 < i14; i15++) {
/* 186 */                                                           if ((j5 & 255) < 128) {
/* 202 */                                                               iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((OlO11I0O1l) objArr5[(i13 << 3) + i15]);
                                                                    }
/* 208 */                                                           j5 >>= i12;
                                                                }
/* 215 */                                                       if (i14 != i12) {
/* 219 */                                                           iIdentityHashCode = iIdentityHashCode2;
                                                                    break;
                                                                }
/* 217 */                                                       iIdentityHashCode = iIdentityHashCode2;
/* 221 */                                                       if (i13 == length2) {
                                                                    break;
                                                                }
/* 223 */                                                       i13++;
/* 225 */                                                       j3 = j;
/* 227 */                                                       i12 = 8;
                                                            }
                                                        }
                                                    } else {
/* 230 */                                               j = j3;
                                                    }
                                                } else {
/* 233 */                                           jArr2 = jArr3;
/* 235 */                                           i2 = i10;
/* 237 */                                           objArr2 = objArr4;
/* 239 */                                           j = j3;
/* 245 */                                           I000II = Ol1l1lI1Ili.I000II(olO11I0O1l.I00000oOI(), ol1il1o1);
                                                }
/* 264 */                                       iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I000II)) * 31) + Long.hashCode(I000II.I00000oIO);
                                            }
/* 265 */                                   i3 = 8;
                                        } else {
/* 268 */                                   jArr2 = jArr3;
/* 270 */                                   i2 = i10;
/* 272 */                                   objArr2 = objArr4;
/* 274 */                                   j = j3;
/* 276 */                                   j2 = j4;
/* 278 */                                   i3 = i8;
                                        }
/* 279 */                               j3 = j >> i3;
/* 283 */                               i8 = i3;
/* 284 */                               j4 = j2;
/* 286 */                               objArr4 = objArr2;
/* 288 */                               z = false;
/* 281 */                               i10 = i2 + 1;
/* 290 */                               jArr3 = jArr2;
                                    }
/* 294 */                           jArr = jArr3;
/* 296 */                           objArr = objArr4;
/* 299 */                           if (i9 != i8) {
                                        break;
                                    }
                                } else {
/* 302 */                           jArr = jArr3;
/* 304 */                           i = i4;
/* 306 */                           objArr = objArr4;
                                }
/* 308 */                       if (i7 == length) {
/* 321 */                           i4 = iIdentityHashCode;
                                    break;
                                }
/* 310 */                       i7++;
/* 312 */                       i4 = i;
/* 314 */                       jArr3 = jArr;
/* 316 */                       objArr4 = objArr;
/* 318 */                       z = false;
                            }
                        }
/* 325 */               iIdentityHashCode = i4;
/* 326 */               Object[] objArr6 = oi110o0I00000oIO.I00iOIl;
/* 328 */               int i16 = oi110o0I00000oIO.I00iiO;
/* 331 */               for (int i17 = 0; i17 < i16; i17++) {
/* 337 */                   ((Ilo1olo) objArr6[i17]).I00000oIO();
                        }
/* 343 */               return iIdentityHashCode;
                    } catch (Throwable th) {
/* 344 */               Object[] objArr7 = oi110o0I00000oIO.I00iOIl;
/* 346 */               int i18 = oi110o0I00000oIO.I00iiO;
/* 349 */               for (int i19 = 0; i19 < i18; i19++) {
/* 355 */                   ((Ilo1olo) objArr7[i19]).I00000oIO();
                        }
/* 361 */               throw th;
                    }
                }
            }
