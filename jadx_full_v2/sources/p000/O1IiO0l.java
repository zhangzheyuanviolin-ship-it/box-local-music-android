            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1IiO0l extends OO1I0001000i implements OI01OioIIoo, OIlO0l10o01, O1iOIoOiO0 {
                public static final O0o01OIl I00oII = new O0o01OIl(7);
                public static final O0o01OIl I00oIiI10 = new O0o01OIl(8);
                public O1Ii0OO I00ilO0;
                public Function1 I00io1l;
                public IlliIl1l11O I00ioIO;
                public Function1 I00l0I0l0lO1;
                public OO1I01i I00l0OO0IO;
                public OI10I1IoI0Ol I00li1OI;
                public boolean I00ll1;
                public OI10I1IoI0Ol I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public final O1IiOiiol I00o0l1o1o0;
                public I11l01l I00o101lO;
                public OI10I1IoI0Ol I00oI0i;

                public O1IiO0l() {
/* 7 */             O1IiOiiol o1IiOiiol = new O1IiOiiol(0);
/* 10 */            o1IiOiiol.I00iiO = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I00o0l1o1o0 = o1IiOiiol;
                }

                public static void I0100o111I(OIIlIII0Ili oIIlIII0Ili) {
                    O0iiOlo o0iiOlo;
/* 1 */             OIIlIII0Ili oIIlIII0Ili2 = oIIlIII0Ili.I00olI;
/* 3 */             O0iiOioolIi o0iiOioolIi = oIIlIII0Ili.I00oO101o;
/* 15 */            if (!O0000Ioio00.I0000O(oIIlIII0Ili2 != null ? oIIlIII0Ili2.I00oO101o : null, o0iiOioolIi)) {
/* 23 */                o0iiOioolIi.I010I0.I00100l0.I00oli.I0001Ioi1lo();
/* 26 */                return;
                    }
/* 31 */            I0l00oIIo1O1 i0l00oIIo1O1I000O01llI0 = o0iiOioolIi.I010I0.I00100l0.I000O01llI0();
/* 35 */            if (i0l00oIIo1O1I000O01llI0 == null || (o0iiOlo = ((O1iO1i) i0l00oIIo1O1I000O01llI0).I00oli) == null) {
/* 77 */                return;
                    }
/* 43 */            o0iiOlo.I0001Ioi1lo();
                }

                @Override
                public boolean I001IIilI0O() {
/* 5 */             return I00olI().I00Io1lO();
                }

                @Override
                public final void I00IO1(boolean z) {
/* 1 */             O1IiO0l o1IiO0lI00ooiO1I = I00ooiO1I();
/* 13 */            O0iiOioolIi o0iiOioolIiI00olI = o1IiO0lI00ooiO1I != null ? o1IiO0lI00ooiO1I.I00olI() : null;
/* 22 */            if (O0000Ioio00.I0000O(o0iiOioolIiI00olI, I00olI())) {
/* 24 */                this.I00ll1 = z;
/* 26 */                return;
                    }
/* 37 */            if ((o0iiOioolIiI00olI != null ? o0iiOioolIiI00olI.I010I0.I0000O : null) != O0iiOII1OO.I00iiO) {
/* 47 */                if ((o0iiOioolIiI00olI != null ? o0iiOioolIiI00olI.I010I0.I0000O : null) != O0iiOII1OO.I00iio) {
/* 50 */                    return;
                        }
                    }
/* 51 */            this.I00ll1 = z;
                }

                @Override
                public final int I00OilO00Il(I0iolili01 i0iolili01) {
                    int iI00l0I0l0lO1;
/* 7 */             if (!I00oOio10iI1() || (iI00l0I0l0lO1 = I00l0I0l0lO1(i0iolili01)) == Integer.MIN_VALUE) {
/* 5 */                 return Integer.MIN_VALUE;
                    }
/* 17 */            boolean z = i0iolili01 instanceof OooOio0IilO;
/* 19 */            long j = this.I00ilI0I1;
/* 36 */            return iI00l0I0l0lO1 + ((int) (z ? j >> 32 : 4294967295L & j));
                }

                @Override
                public boolean I00OloOo() {
/* 1 */             return false;
                }

                @Override
                public final O1iOIo0o0 I00io1l(int i, int i2, Map map, Function1 function1, Function1 function12) {
/* 5 */             int i3 = 1;
/* 14 */            if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
/* 43 */                IolioOO1.I0000Il00O("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
                    }
/* 48 */            I1IOio1Ooo11 i1IOio1Ooo11 = new I1IOio1Ooo11(i3);
/* 51 */            i1IOio1Ooo11.I00000oOI = i;
/* 53 */            i1IOio1Ooo11.I0000Il00O = i2;
/* 55 */            i1IOio1Ooo11.I0000O = map;
/* 57 */            i1IOio1Ooo11.I0000oI00 = function1;
/* 59 */            i1IOio1Ooo11.I0001Ioi1lo = function12;
/* 61 */            i1IOio1Ooo11.I000II = this;
/* 63 */            VarHandle.storeStoreFence();
/* 399 */           return i1IOio1Ooo11;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00ioIO(O0iiOioolIi o0iiOioolIi, IoI1O1i1 ioI1O1i1) {
                    char c;
                    long j;
                    long j2;
                    long j3;
                    long[] jArr;
                    long[] jArr2;
                    long j4;
                    int i;
                    char c2;
                    long j5;
                    long j6;
                    int i2;
                    int i3;
                    int i4;
/* 5 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00oI0i;
/* 7 */             char c3 = 7;
/* 8 */             long j7 = -9187201950435737472L;
/* 13 */            int i5 = 8;
/* 15 */            if (oI10I1IoI0Ol != null) {
/* 17 */                Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 19 */                long[] jArr3 = oI10I1IoI0Ol.I00000oIO;
                        int length = jArr3.length - 2;
/* 24 */                if (length >= 0) {
/* 26 */                    int i6 = 0;
/* 27 */                    long j8 = 128;
                            while (true) {
/* 29 */                        long j9 = jArr3[i6];
/* 31 */                        j2 = 255;
/* 39 */                        if ((((~j9) << c3) & j9 & j7) != j7) {
/* 46 */                            int i7 = 8 - ((~(i6 - length)) >>> 31);
/* 48 */                            int i8 = 0;
/* 49 */                            while (i8 < i7) {
/* 55 */                                if ((j9 & 255) < j8) {
/* 63 */                                    c2 = c3;
/* 67 */                                    OI10IIO oi10iio = (OI10IIO) objArr[(i6 << 3) + i8];
/* 69 */                                    j5 = j7;
/* 71 */                                    Object[] objArr2 = oi10iio.I00000oOI;
/* 73 */                                    long[] jArr4 = oi10iio.I00000oIO;
                                            int length2 = jArr4.length - 2;
/* 78 */                                    if (length2 >= 0) {
/* 80 */                                        j6 = j8;
/* 82 */                                        int i9 = 0;
/* 83 */                                        int i10 = i5;
                                                while (true) {
/* 85 */                                            int i11 = length2;
/* 87 */                                            long j10 = jArr4[i9];
/* 89 */                                            jArr2 = jArr3;
/* 91 */                                            j4 = j9;
/* 101 */                                           if ((((~j10) << c2) & j10 & j5) != j5) {
/* 108 */                                               int i12 = 8 - ((~(i9 - i11)) >>> 31);
/* 110 */                                               int i13 = 0;
/* 111 */                                               while (i13 < i12) {
/* 117 */                                                   if ((j10 & 255) < j6) {
/* 121 */                                                       int i14 = (i9 << 3) + i13;
/* 130 */                                                       O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) ((i000iilOi) objArr2[i14]).get();
/* 132 */                                                       i3 = i13;
/* 134 */                                                       if (o0iiOioolIi2 != null) {
/* 136 */                                                           boolean zI00Io1lO = o0iiOioolIi2.I00Io1lO();
/* 140 */                                                           i4 = i8;
/* 143 */                                                           if (zI00Io1lO) {
                                                                    }
                                                                } else {
/* 146 */                                                           i4 = i8;
                                                                }
/* 148 */                                                       oi10iio.I000lI(i14);
                                                            } else {
/* 152 */                                                       i3 = i13;
/* 154 */                                                       i4 = i8;
                                                            }
/* 156 */                                                   j10 >>= i10;
/* 158 */                                                   i13 = i3 + 1;
/* 160 */                                                   i8 = i4;
                                                        }
/* 163 */                                               i = i8;
/* 167 */                                               if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
/* 172 */                                               i = i8;
                                                    }
/* 169 */                                           length2 = i11;
/* 175 */                                           if (i9 == length2) {
                                                        break;
                                                    }
/* 177 */                                           i9++;
/* 179 */                                           jArr3 = jArr2;
/* 181 */                                           j9 = j4;
/* 183 */                                           i8 = i;
/* 185 */                                           i10 = 8;
                                                }
                                            } else {
/* 188 */                                       jArr2 = jArr3;
/* 190 */                                       j4 = j9;
/* 192 */                                       i = i8;
/* 194 */                                       j6 = j8;
                                            }
/* 196 */                                   i2 = 8;
                                        } else {
/* 199 */                                   jArr2 = jArr3;
/* 201 */                                   j4 = j9;
/* 203 */                                   i = i8;
/* 205 */                                   c2 = c3;
/* 207 */                                   j5 = j7;
/* 209 */                                   j6 = j8;
/* 211 */                                   i2 = i5;
                                        }
/* 216 */                               i5 = i2;
/* 212 */                               j9 = j4 >> i2;
/* 218 */                               c3 = c2;
/* 220 */                               j7 = j5;
/* 222 */                               j8 = j6;
/* 214 */                               i8 = i + 1;
/* 225 */                               jArr3 = jArr2;
                                    }
/* 229 */                           jArr = jArr3;
/* 231 */                           c = c3;
/* 233 */                           j = j7;
/* 236 */                           j3 = j8;
/* 238 */                           if (i7 != i5) {
                                        break;
                                    }
                                } else {
/* 241 */                           jArr = jArr3;
/* 243 */                           c = c3;
/* 245 */                           j = j7;
/* 247 */                           j3 = j8;
                                }
/* 249 */                       if (i6 == length) {
                                    break;
                                }
/* 251 */                       i6++;
/* 253 */                       c3 = c;
/* 255 */                       j7 = j;
/* 257 */                       j8 = j3;
/* 259 */                       jArr3 = jArr;
/* 261 */                       i5 = 8;
                            }
                        } else {
/* 265 */                   c = 7;
/* 267 */                   j = -9187201950435737472L;
/* 269 */                   j2 = 255;
/* 271 */                   j3 = 128;
                        }
                    }
/* 273 */           OI10I1IoI0Ol oI10I1IoI0Ol2 = this.I00oI0i;
/* 275 */           if (oI10I1IoI0Ol2 != null) {
/* 277 */               long[] jArr5 = oI10I1IoI0Ol2.I00000oIO;
                        int length3 = jArr5.length - 2;
/* 282 */               if (length3 >= 0) {
/* 284 */                   int i15 = 0;
                            while (true) {
/* 285 */                       long j11 = jArr5[i15];
/* 295 */                       if ((((~j11) << c) & j11 & j) != j) {
/* 304 */                           int i16 = 8 - ((~(i15 - length3)) >>> 31);
/* 307 */                           for (int i17 = 0; i17 < i16; i17++) {
/* 313 */                               if ((j11 & j2) < j3) {
/* 317 */                                   int i18 = (i15 << 3) + i17;
/* 334 */                                   if (((OI10IIO) oI10I1IoI0Ol2.I0000Il00O[i18]).I000II()) {
/* 336 */                                       oI10I1IoI0Ol2.I000l1(i18);
                                            }
                                        }
/* 341 */                               j11 >>= 8;
                                    }
/* 347 */                           if (i16 != 8) {
                                        break;
                                    }
                                }
/* 352 */                       if (i15 == length3) {
                                    break;
                                } else {
/* 354 */                           i15++;
                                }
                            }
                        }
                    }
/* 357 */           OI10I1IoI0Ol oI10I1IoI0Ol3 = this.I00oI0i;
/* 359 */           if (oI10I1IoI0Ol3 == null) {
/* 363 */               oI10I1IoI0Ol3 = new OI10I1IoI0Ol();
/* 366 */               this.I00oI0i = oI10I1IoI0Ol3;
                    }
/* 368 */           Object objI000II = oI10I1IoI0Ol3.I000II(ioI1O1i1);
/* 372 */           if (objI000II == null) {
/* 376 */               objI000II = new OI10IIO();
/* 379 */               oI10I1IoI0Ol3.I000lI(ioI1O1i1, objI000II);
                    }
/* 391 */           ((OI10IIO) objI000II).I000iOII(new i000iilOi(o0iiOioolIi));
                }

                public abstract int I00l0I0l0lO1(I0iolili01 i0iolili01);

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00li1OI(OO1I01i oO1I01i, long j, long j2) {
                    boolean z;
                    char c;
                    long j3;
                    long j4;
                    O0iiOioolIi o0iiOioolIi;
                    boolean z2;
                    int i;
                    char c2;
                    OI10IIO oi10iio;
                    OIlOIi0 snapshotObserver;
/* 1 */             O1IiO0l o1IiO0l = this;
/* 5 */             OI10I1IoI0Ol oI10I1IoI0Ol = o1IiO0l.I00oI0i;
/* 7 */             I11l01l i11l01l = o1IiO0l.I00o101lO;
/* 9 */             if (i11l01l == null) {
/* 13 */                i11l01l = new I11l01l();
/* 16 */                o1IiO0l.I00o101lO = i11l01l;
                    }
/* 22 */            OIlO000O01 oIlO000O01 = o1IiO0l.I00olI().I00o0iI0io1;
/* 24 */            if (oIlO000O01 != null && (snapshotObserver = ((I0lio1O01i01) oIlO000O01).getSnapshotObserver()) != null) {
/* 36 */                O1IOoo00Ol o1IOoo00Ol = new O1IOoo00Ol();
/* 39 */                o1IOoo00Ol.I00iOIl = o1IiO0l;
/* 43 */                o1IOoo00Ol.I00iiI = j;
/* 47 */                o1IOoo00Ol.I00iiO = j2;
/* 49 */                o1IOoo00Ol.I00iio = oO1I01i;
/* 51 */                VarHandle.storeStoreFence();
/* 58 */                snapshotObserver.I00000oIO.I0000oI00(oO1I01i, I00oII, o1IOoo00Ol);
                    }
/* 61 */            boolean zI00OloOo = o1IiO0l.I00OloOo();
/* 67 */            OI10IIO oi10iio2 = (OI10IIO) i11l01l.I0001Ioi1lo;
/* 71 */            OI10IIO oi10iio3 = (OI10IIO) i11l01l.I000II;
/* 73 */            int i2 = i11l01l.I00000oOI;
/* 76 */            for (int i3 = 0; i3 < i2; i3++) {
/* 82 */                byte b = ((byte[]) i11l01l.I0000oI00)[i3];
/* 85 */                if (b == 3) {
/* 93 */                    oi10iio3.I000iOII(((IoI1O1i1[]) i11l01l.I0000Il00O)[i3]);
                        } else if (b != 0 && oI10I1IoI0Ol != null && (oi10iio = (OI10IIO) oI10I1IoI0Ol.I000iOII(((IoI1O1i1[]) i11l01l.I0000Il00O)[i3])) != null) {
/* 115 */                   oi10iio2.I000OiO(oi10iio);
                        }
                    }
/* 121 */           int i4 = i11l01l.I00000oOI;
/* 124 */           int i5 = 0;
/* 126 */           for (int i6 = 0; i6 < i4; i6++) {
/* 130 */               byte[] bArr = (byte[]) i11l01l.I0000oI00;
/* 134 */               if (bArr[i6] == 2) {
/* 136 */                   i5++;
                        } else if (i5 > 0) {
/* 145 */                   IoI1O1i1[] ioI1O1i1Arr = (IoI1O1i1[]) i11l01l.I0000Il00O;
/* 149 */                   ioI1O1i1Arr[i6 - i5] = ioI1O1i1Arr[i6];
                        }
/* 151 */               bArr[i6] = 2;
                    }
/* 156 */           int i7 = i11l01l.I00000oOI;
/* 161 */           for (int i8 = i7 - i5; i8 < i7; i8++) {
/* 167 */               ((IoI1O1i1[]) i11l01l.I0000Il00O)[i8] = null;
                    }
                    i11l01l.I00000oOI -= i5;
/* 177 */           O1IiO0l o1IiO0lI00ooiO1I = o1IiO0l.I00ooiO1I();
/* 181 */           Object[] objArr = oi10iio3.I00000oOI;
/* 183 */           long[] jArr = oi10iio3.I00000oIO;
/* 186 */           int length = jArr.length - 2;
/* 187 */           char c3 = 7;
/* 195 */           int i9 = 8;
/* 197 */           if (length >= 0) {
/* 199 */               j3 = 128;
/* 201 */               int i10 = 0;
                        while (true) {
/* 202 */                   long j5 = jArr[i10];
/* 204 */                   j4 = 255;
/* 213 */                   if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 220 */                       int i11 = 8 - ((~(i10 - length)) >>> 31);
/* 222 */                       int i12 = 0;
/* 223 */                       while (i12 < i11) {
/* 229 */                           if ((j5 & 255) < 128) {
/* 237 */                               c2 = c3;
/* 241 */                               IoI1O1i1 ioI1O1i1 = (IoI1O1i1) objArr[(i10 << 3) + i12];
/* 247 */                               O1IiO0l o1IiO0l2 = o1IiO0lI00ooiO1I == null ? o1IiO0l : o1IiO0lI00ooiO1I;
/* 248 */                               i = i9;
/* 250 */                               O1IiO0l o1IiO0l3 = o1IiO0l2;
                                        while (true) {
/* 251 */                                   I11l01l i11l01l2 = o1IiO0l3.I00o101lO;
/* 253 */                                   if (i11l01l2 != null) {
/* 263 */                                       z2 = zI00OloOo;
/* 266 */                                       if (!I1IoiO1l.I0001Ioi1lo((IoI1O1i1[]) i11l01l2.I0000Il00O, ioI1O1i1)) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                            }
/* 269 */                                   z2 = zI00OloOo;
/* 271 */                                   O1IiO0l o1IiO0lI00ooiO1I2 = o1IiO0l3.I00ooiO1I();
/* 275 */                                   if (o1IiO0lI00ooiO1I2 == null) {
                                                break;
                                            }
/* 295 */                                   o1IiO0l3 = o1IiO0lI00ooiO1I2;
/* 296 */                                   zI00OloOo = z2;
                                        }
/* 277 */                               OI10I1IoI0Ol oI10I1IoI0Ol2 = o1IiO0l3.I00oI0i;
/* 288 */                               OI10IIO oi10iio4 = oI10I1IoI0Ol2 != null ? (OI10IIO) oI10I1IoI0Ol2.I000iOII(ioI1O1i1) : null;
/* 289 */                               if (oi10iio4 != null) {
/* 291 */                                   o1IiO0l2.I010101Oo1lO(oi10iio4);
                                        }
                                    } else {
/* 299 */                               z2 = zI00OloOo;
/* 301 */                               i = i9;
/* 303 */                               c2 = c3;
                                    }
/* 305 */                           j5 >>= i;
/* 307 */                           i12++;
/* 309 */                           o1IiO0l = this;
/* 311 */                           c3 = c2;
/* 313 */                           i9 = i;
/* 315 */                           zI00OloOo = z2;
                                }
/* 318 */                       z = zI00OloOo;
/* 321 */                       c = c3;
/* 323 */                       if (i11 != i9) {
                                    break;
                                }
                            } else {
/* 326 */                       z = zI00OloOo;
/* 328 */                       c = c3;
                            }
/* 330 */                   if (i10 == length) {
                                break;
                            }
/* 332 */                   i10++;
/* 334 */                   o1IiO0l = this;
/* 336 */                   c3 = c;
/* 338 */                   zI00OloOo = z;
/* 340 */                   i9 = 8;
                        }
                    } else {
/* 344 */               z = zI00OloOo;
/* 346 */               c = 7;
/* 348 */               j3 = 128;
/* 350 */               j4 = 255;
                    }
/* 352 */           oi10iio3.I00000oOI();
/* 355 */           Object[] objArr2 = oi10iio2.I00000oOI;
/* 357 */           long[] jArr2 = oi10iio2.I00000oIO;
                    int length2 = jArr2.length - 2;
/* 362 */           if (length2 >= 0) {
/* 364 */               int i13 = 0;
                        while (true) {
/* 365 */                   long j6 = jArr2[i13];
/* 375 */                   if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 384 */                       int i14 = 8 - ((~(i13 - length2)) >>> 31);
/* 387 */                       for (int i15 = 0; i15 < i14; i15++) {
/* 393 */                           if ((j6 & j4) < j3 && (o0iiOioolIi = (O0iiOioolIi) ((i000iilOi) objArr2[(i13 << 3) + i15]).get()) != null) {
/* 410 */                               if (z) {
/* 413 */                                   o0iiOioolIi.I00OOll1(false);
                                        } else {
/* 418 */                                   o0iiOioolIi.I00Oio(false);
                                        }
                                    }
/* 426 */                           j6 >>= 8;
                                }
/* 433 */                       if (i14 != 8) {
                                    break;
                                }
                            }
/* 439 */                   if (i13 == length2) {
                                break;
                            } else {
/* 441 */                       i13++;
                            }
                        }
                    }
/* 444 */           oi10iio2.I00000oOI();
                }

                /* JADX WARN: Removed duplicated region for block: B:121:0x0141 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00ll1(O1iOIo0o0 o1iOIo0o0) {
                    long j;
                    char c;
                    long j2;
                    long j3;
                    O1Ii0OO o1Ii0OO;
                    OI10I1IoI0Ol oI10I1IoI0Ol;
                    long[] jArr;
                    Object[] objArr;
                    int i;
                    long[] jArr2;
                    Object[] objArr2;
                    int i2;
                    boolean z;
                    O1Ii0OO o1Ii0OO2;
                    long j4;
/* 7 */             if (this.I00o0iI0io1) {
/* 1261 */              return;
                    }
/* 11 */            Function1 function1I000II = o1iOIo0o0.I000II();
/* 15 */            IlliIl1l11O illiIl1l11OI0000oI00 = o1iOIo0o0.I0000oI00();
/* 19 */            Function1 function1I0000Il00O = o1iOIo0o0.I0000Il00O();
/* 23 */            long jI000iOII = 0;
/* 25 */            if (illiIl1l11OI0000oI00 == null) {
/* 364 */               long jI00000oOI = 9223372034707292159L;
/* 369 */               if (function1I000II == null) {
/* 371 */                   I010II();
/* 375 */                   this.I00io1l = null;
/* 377 */                   this.I00ioIO = null;
/* 379 */                   this.I00l0I0l0lO1 = null;
/* 381 */                   O1Ii0OO o1Ii0OO3 = this.I00ilO0;
/* 383 */                   if (o1Ii0OO3 != null) {
/* 386 */                       o1Ii0OO3.I00iOIl = false;
                            }
/* 388 */                   if (o1Ii0OO3 != null) {
/* 390 */                       o1Ii0OO3.I00iiI = 9223372034707292159L;
/* 392 */                       return;
                            }
/* 1261 */                  return;
                        }
/* 395 */               this.I00ioIO = null;
/* 397 */               this.I00l0I0l0lO1 = null;
/* 405 */               boolean z2 = this.I00io1l != function1I000II;
/* 406 */               if (!z2 && I0100i().I00iOIl) {
/* 416 */                   O0iOOo0Ii o0iOOo0IiI00oIiI10 = I00oIiI10();
/* 424 */                   jI00000oOI = ioolillioIIO.I00000oOI(o0iOOo0IiI00oIiI10.I001l0I00(0L));
/* 428 */                   jI000iOII = o0iOOo0IiI00oIiI10.I000iOII();
/* 442 */                   z2 = (IooO0O.I0000Il00O(jI00000oOI, I0100i().I00iiI) && IooOl0ol01.I0000Il00O(jI000iOII, I0100i().I00iiO)) ? false : true;
                        }
/* 458 */               if (z2) {
/* 460 */                   OO1I01i oO1I01i = this.I00l0OO0IO;
/* 462 */                   if (oO1I01i != null) {
/* 464 */                       oO1I01i.I00iOIl = o1iOIo0o0;
                            } else {
/* 470 */                       oO1I01i = new OO1I01i(o1iOIo0o0, this, null);
/* 473 */                       this.I00l0OO0IO = oO1I01i;
                            }
/* 475 */                   I00li1OI(oO1I01i, jI00000oOI, jI000iOII);
/* 482 */                   this.I00io1l = o1iOIo0o0.I000II();
/* 1261 */                  return;
                        }
/* 1261 */              return;
                    }
/* 29 */            if (illiIl1l11OI0000oI00 != this.I00ioIO || function1I0000Il00O != this.I00l0I0l0lO1) {
/* 356 */               this.I00ioIO = illiIl1l11OI0000oI00;
/* 358 */               this.I00l0I0l0lO1 = function1I0000Il00O;
/* 360 */               I010II();
/* 363 */               return;
                    }
/* 37 */            OI10I1IoI0Ol oI10I1IoI0Ol2 = this.I00lli11;
/* 39 */            long j5 = -9187201950435737472L;
/* 44 */            int i3 = 8;
/* 46 */            if (oI10I1IoI0Ol2 != null) {
/* 48 */                Object[] objArr3 = oI10I1IoI0Ol2.I0000Il00O;
/* 50 */                long[] jArr3 = oI10I1IoI0Ol2.I00000oIO;
/* 52 */                j2 = 128;
                        int length = jArr3.length - 2;
/* 57 */                if (length >= 0) {
/* 59 */                    c = 7;
/* 61 */                    int i4 = 0;
/* 62 */                    o1Ii0OO2 = null;
                            while (true) {
/* 64 */                        long j6 = jArr3[i4];
/* 66 */                        j3 = 255;
/* 75 */                        if ((((~j6) << 7) & j6 & j5) != j5) {
/* 82 */                            int i5 = 8 - ((~(i4 - length)) >>> 31);
/* 84 */                            int i6 = 0;
/* 85 */                            while (i6 < i5) {
/* 91 */                                if ((j6 & 255) < 128) {
/* 99 */                                    j4 = j5;
/* 103 */                                   O1Ii0OO o1Ii0OO4 = (O1Ii0OO) objArr3[(i4 << 3) + i6];
/* 107 */                                   if (o1Ii0OO4.I00iOIl) {
/* 109 */                                       o1Ii0OO2 = o1Ii0OO4;
                                            }
                                        } else {
/* 112 */                                   j4 = j5;
                                        }
/* 114 */                               j6 >>= 8;
/* 115 */                               i6++;
/* 117 */                               j5 = j4;
                                    }
/* 120 */                           j = j5;
/* 122 */                           if (i5 != 8) {
                                        break;
                                    }
                                } else {
/* 125 */                           j = j5;
                                }
/* 127 */                       if (i4 == length) {
                                    break;
                                }
/* 129 */                       i4++;
/* 131 */                       j5 = j;
                            }
                        } else {
/* 134 */                   j = -9187201950435737472L;
/* 136 */                   c = 7;
/* 138 */                   j3 = 255;
/* 140 */                   o1Ii0OO2 = null;
                        }
/* 142 */               o1Ii0OO = o1Ii0OO2;
                    } else {
/* 145 */               j = -9187201950435737472L;
/* 147 */               c = 7;
/* 149 */               j2 = 128;
/* 151 */               j3 = 255;
/* 153 */               o1Ii0OO = null;
                    }
/* 154 */           if (o1Ii0OO == null) {
/* 1261 */              return;
                    }
/* 156 */           O0iOOo0Ii o0iOOo0IiI00oIiI102 = I00oIiI10();
/* 164 */           long jI00000oOI2 = ioolillioIIO.I00000oOI(o0iOOo0IiI00oIiI102.I001l0I00(0L));
/* 168 */           long jI000iOII2 = o0iOOo0IiI00oIiI102.I000iOII();
/* 178 */           if ((IooO0O.I0000Il00O(jI00000oOI2, o1Ii0OO.I00iiI) && IooOl0ol01.I0000Il00O(jI000iOII2, o1Ii0OO.I00iiO)) || (oI10I1IoI0Ol = this.I00lli11) == null) {
/* 1261 */              return;
                    }
/* 192 */           Object[] objArr4 = oI10I1IoI0Ol.I00000oOI;
/* 194 */           Object[] objArr5 = oI10I1IoI0Ol.I0000Il00O;
/* 196 */           long[] jArr4 = oI10I1IoI0Ol.I00000oIO;
                    int length2 = jArr4.length - 2;
/* 201 */           if (length2 < 0) {
/* 1261 */              return;
                    }
/* 203 */           int i7 = 0;
                    while (true) {
/* 204 */               long j7 = jArr4[i7];
/* 206 */               int i8 = length2;
/* 216 */               if ((((~j7) << c) & j7 & j) != j) {
/* 223 */                   int i9 = 8 - ((~(i7 - i8)) >>> 31);
/* 225 */                   int i10 = 0;
/* 226 */                   while (i10 < i9) {
/* 232 */                       if ((j7 & j3) < j2) {
/* 236 */                           int i11 = (i7 << 3) + i10;
/* 238 */                           Object obj = objArr4[i11];
/* 244 */                           O1Ii0OO o1Ii0OO5 = (O1Ii0OO) objArr5[i11];
/* 246 */                           i2 = i3;
/* 250 */                           IoI1O1i1 ioI1O1i1 = (IoI1O1i1) obj;
/* 254 */                           jArr2 = jArr4;
/* 256 */                           if (o1Ii0OO5.I00iOIl) {
/* 258 */                               objArr2 = objArr4;
/* 265 */                               z = (IooOl0ol01.I0000Il00O(o1Ii0OO5.I00iiO, jI000iOII2) && IooO0O.I0000Il00O(o1Ii0OO5.I00iiI, jI00000oOI2)) ? false : true;
/* 279 */                               o1Ii0OO5.I00iiO = jI000iOII2;
/* 281 */                               o1Ii0OO5.I00iiI = jI00000oOI2;
/* 284 */                               o1Ii0OO5.I00iOIl = false;
/* 286 */                               if (z) {
/* 288 */                                   I11l01l i11l01l = this.I00o101lO;
/* 290 */                                   if (i11l01l != null) {
/* 292 */                                       i11l01l.I00IlilI0i0i(ioI1O1i1);
                                            }
/* 295 */                                   OI10I1IoI0Ol oI10I1IoI0Ol3 = this.I00oI0i;
/* 307 */                                   OI10IIO oi10iio = oI10I1IoI0Ol3 != null ? (OI10IIO) oI10I1IoI0Ol3.I000II(ioI1O1i1) : null;
/* 308 */                                   if (oi10iio != null) {
/* 310 */                                       I010101Oo1lO(oi10iio);
/* 313 */                                       oi10iio.I00000oOI();
                                            }
                                        }
                                    } else {
/* 277 */                               objArr2 = objArr4;
                                    }
/* 279 */                           o1Ii0OO5.I00iiO = jI000iOII2;
/* 281 */                           o1Ii0OO5.I00iiI = jI00000oOI2;
/* 284 */                           o1Ii0OO5.I00iOIl = false;
/* 286 */                           if (z) {
                                    }
                                } else {
/* 317 */                           jArr2 = jArr4;
/* 319 */                           objArr2 = objArr4;
/* 320 */                           i2 = i3;
                                }
/* 322 */                       j7 >>= i2;
/* 324 */                       i10++;
/* 326 */                       objArr4 = objArr2;
/* 327 */                       i3 = i2;
/* 329 */                       jArr4 = jArr2;
                            }
/* 332 */                   jArr = jArr4;
/* 334 */                   objArr = objArr4;
/* 335 */                   i = i3;
/* 336 */                   if (i9 != i) {
/* 1261 */                      return;
                            }
                        } else {
/* 341 */                   jArr = jArr4;
/* 343 */                   objArr = objArr4;
/* 344 */                   i = i3;
                        }
/* 338 */               length2 = i8;
/* 346 */               if (i7 == length2) {
/* 1261 */                  return;
                        }
/* 348 */               i7++;
/* 350 */               i3 = i;
/* 351 */               objArr4 = objArr;
/* 352 */               jArr4 = jArr;
                    }
                }

                public abstract O1IiO0l I00o0iI0io1();

                public abstract O0iOOo0Ii I00oIiI10();

                public abstract boolean I00oOio10iI1();

                public abstract O0iiOioolIi I00olI();

                public abstract O1iOIo0o0 I00ooIo0();

                public abstract O1IiO0l I00ooiO1I();

                public abstract long I00oooO();

                public final O1Ii0OO I0100i() {
/* 1 */             O1Ii0OO o1Ii0OO = this.I00ilO0;
/* 3 */             if (o1Ii0OO != null) {
/* 20 */                return o1Ii0OO;
                    }
/* 7 */             O1Ii0OO o1Ii0OO2 = new O1Ii0OO(this);
/* 10 */            this.I00ilO0 = o1Ii0OO2;
/* 20 */            return o1Ii0OO2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I010101Oo1lO(OI10IIO oi10iio) {
                    O0iiOioolIi o0iiOioolIi;
/* 1 */             Object[] objArr = oi10iio.I00000oOI;
/* 3 */             long[] jArr = oi10iio.I00000oIO;
                    int length = jArr.length - 2;
/* 8 */             if (length < 0) {
/* 168 */               return;
                    }
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                long j = jArr[i];
/* 26 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 35 */                    int i2 = 8 - ((~(i - length)) >>> 31);
/* 38 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 47 */                        if ((255 & j) < 128 && (o0iiOioolIi = (O0iiOioolIi) ((i000iilOi) objArr[(i << 3) + i3]).get()) != null) {
/* 68 */                            if (I00OloOo()) {
/* 70 */                                o0iiOioolIi.I00OOll1(false);
                                    } else {
/* 74 */                                o0iiOioolIi.I00Oio(false);
                                    }
                                }
/* 77 */                        j >>= 8;
                            }
/* 81 */                    if (i2 != 8) {
/* 168 */                       return;
                            }
                        }
/* 83 */                if (i == length) {
/* 168 */                   return;
                        } else {
/* 85 */                    i++;
                        }
                    }
                }

                public abstract void I010I0();

                /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010II() {
/* 1 */             I11l01l i11l01l = this.I00o101lO;
/* 4 */             if (i11l01l != null) {
/* 6 */                 int i = i11l01l.I00000oOI;
/* 9 */                 for (int i2 = 0; i2 < i; i2++) {
/* 16 */                    ((IoI1O1i1[]) i11l01l.I0000Il00O)[i2] = null;
/* 24 */                    ((float[]) i11l01l.I0000O)[i2] = Float.NaN;
/* 30 */                    ((byte[]) i11l01l.I0000oI00)[i2] = 0;
                        }
/* 35 */                i11l01l.I00000oOI = 0;
                    }
/* 37 */            OI10I1IoI0Ol oI10I1IoI0Ol = this.I00oI0i;
/* 39 */            if (oI10I1IoI0Ol == null) {
/* 41 */                return;
                    }
/* 42 */            Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 44 */            long[] jArr = oI10I1IoI0Ol.I00000oIO;
                    int length = jArr.length - 2;
/* 49 */            if (length >= 0) {
/* 51 */                int i3 = 0;
                        while (true) {
/* 52 */                    long j = jArr[i3];
/* 66 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 75 */                        int i4 = 8 - ((~(i3 - length)) >>> 31);
/* 78 */                        for (int i5 = 0; i5 < i4; i5++) {
/* 87 */                            if ((255 & j) < 128) {
/* 96 */                                I010101Oo1lO((OI10IIO) objArr[(i3 << 3) + i5]);
                                    }
/* 99 */                            j >>= 8;
                                }
/* 103 */                       if (i4 != 8) {
                                    break;
                                } else if (i3 == length) {
                                    break;
                                } else {
/* 107 */                           i3++;
                                }
                            }
                        }
                    }
/* 110 */           oI10I1IoI0Ol.I00000oIO();
                }
            }
