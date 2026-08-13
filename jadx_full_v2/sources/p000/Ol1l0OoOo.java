            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class Ol1l0OoOo implements Iterable, O0IlIoi {
                public static final Ol1l0OoOo I00ilI0I1 = new Ol1l0OoOo(0, 0, 0, null);
                public final long I00iOIl;
                public final long I00iiI;
                public final long I00iiO;
                public final long[] I00iio;

                public Ol1l0OoOo(long j, long j2, long j3, long[] jArr) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = j2;
/* 8 */             this.I00iiO = j3;
/* 10 */            this.I00iio = jArr;
                }

                public final Ol1l0OoOo I00000oOI(Ol1l0OoOo ol1l0OoOo) {
                    long[] jArr;
/* 1 */             Ol1l0OoOo ol1l0OoOoI0000O = this;
/* 5 */             Ol1l0OoOo ol1l0OoOo2 = I00ilI0I1;
/* 7 */             if (ol1l0OoOo == ol1l0OoOo2) {
/* 9 */                 return ol1l0OoOoI0000O;
                    }
/* 10 */            if (ol1l0OoOoI0000O == ol1l0OoOo2) {
/* 12 */                return ol1l0OoOo2;
                    }
/* 13 */            long j = ol1l0OoOo.I00iiO;
/* 15 */            long j2 = ol1l0OoOo.I00iiO;
/* 17 */            long[] jArr2 = ol1l0OoOo.I00iio;
/* 19 */            long j3 = ol1l0OoOo.I00iiI;
/* 21 */            long j4 = ol1l0OoOo.I00iOIl;
/* 23 */            long j5 = ol1l0OoOoI0000O.I00iiO;
/* 27 */            if (j == j5 && jArr2 == (jArr = ol1l0OoOoI0000O.I00iio)) {
/* 49 */                return new Ol1l0OoOo(ol1l0OoOoI0000O.I00iOIl & (~j4), ol1l0OoOoI0000O.I00iiI & (~j3), j5, jArr);
                    }
/* 54 */            if (jArr2 != null) {
/* 58 */                for (long j6 : jArr2) {
/* 62 */                    ol1l0OoOoI0000O = ol1l0OoOoI0000O.I0000O(j6);
                        }
                    }
/* 77 */            if (j3 != 0) {
/* 80 */                for (int i = 0; i < 64; i++) {
/* 87 */                    if (((1 << i) & j3) != 0) {
/* 91 */                        ol1l0OoOoI0000O = ol1l0OoOoI0000O.I0000O(i + j2);
                            }
                        }
                    }
/* 100 */           if (j4 != 0) {
/* 102 */               for (int i2 = 0; i2 < 64; i2++) {
/* 109 */                   if (((1 << i2) & j4) != 0) {
/* 116 */                       ol1l0OoOoI0000O = ol1l0OoOoI0000O.I0000O(i2 + j2 + 64);
                            }
                        }
                    }
/* 168 */           return ol1l0OoOoI0000O;
                }

                public final Ol1l0OoOo I0000O(long j) {
                    long[] jArr;
                    int iI00000oIO;
                    long[] jArr2;
/* 3 */             long j2 = j - this.I00iiO;
/* 15 */            if (O0000Ioio00.I0001Ioi1lo(j2, 0L) >= 0 && O0000Ioio00.I0001Ioi1lo(j2, 64L) < 0) {
/* 24 */                long j3 = 1 << ((int) j2);
/* 26 */                long j4 = this.I00iiI;
/* 32 */                if ((j4 & j3) != 0) {
/* 45 */                    return new Ol1l0OoOo(this.I00iOIl, j4 & (~j3), this.I00iiO, this.I00iio);
                        }
                    } else if (O0000Ioio00.I0001Ioi1lo(j2, 64L) >= 0 && O0000Ioio00.I0001Ioi1lo(j2, 128L) < 0) {
/* 66 */                long j5 = 1 << (((int) j2) - 64);
/* 68 */                long j6 = this.I00iOIl;
/* 74 */                if ((j6 & j5) != 0) {
/* 87 */                    return new Ol1l0OoOo(j6 & (~j5), this.I00iiI, this.I00iiO, this.I00iio);
                        }
                    } else if (O0000Ioio00.I0001Ioi1lo(j2, 0L) < 0 && (jArr = this.I00iio) != null && (iI00000oIO = lOIo0Iioi.I00000oIO(j, jArr)) >= 0) {
/* 109 */               int length = jArr.length;
                        int i = length - 1;
/* 112 */               if (i == 0) {
/* 115 */                   jArr2 = null;
                        } else {
/* 117 */                   long[] jArr3 = new long[i];
/* 119 */                   if (iI00000oIO > 0) {
/* 122 */                       I1IoiO1l.I000OiO(jArr, jArr3, 0, 0, iI00000oIO);
                            }
/* 125 */                   if (iI00000oIO < i) {
/* 129 */                       I1IoiO1l.I000OiO(jArr, jArr3, iI00000oIO, iI00000oIO + 1, length);
                            }
/* 132 */                   jArr2 = jArr3;
                        }
/* 139 */               return new Ol1l0OoOo(this.I00iOIl, this.I00iiI, this.I00iiO, jArr2);
                    }
/* 168 */           return this;
                }

                public final boolean I000OOo1O(long j) {
                    long[] jArr;
/* 3 */             long j2 = j - this.I00iiO;
                    return (O0000Ioio00.I0001Ioi1lo(j2, 0L) < 0 || O0000Ioio00.I0001Ioi1lo(j2, 64L) >= 0) ? (O0000Ioio00.I0001Ioi1lo(j2, 64L) < 0 || O0000Ioio00.I0001Ioi1lo(j2, 128L) >= 0) ? O0000Ioio00.I0001Ioi1lo(j2, 0L) <= 0 && (jArr = this.I00iio) != null && lOIo0Iioi.I00000oIO(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.I00iOIl) != 0 : ((1 << ((int) j2)) & this.I00iiI) != 0;
                }

                public final Ol1l0OoOo I000OiO(Ol1l0OoOo ol1l0OoOo) {
                    Ol1l0OoOo ol1l0OoOoI000iOII;
                    long[] jArr;
/* 1 */             Ol1l0OoOo ol1l0OoOoI000iOII2 = this;
/* 5 */             Ol1l0OoOo ol1l0OoOo2 = I00ilI0I1;
/* 7 */             if (ol1l0OoOo == ol1l0OoOo2) {
/* 9 */                 return ol1l0OoOoI000iOII2;
                    }
/* 10 */            if (ol1l0OoOoI000iOII2 == ol1l0OoOo2) {
/* 3 */                 return ol1l0OoOo;
                    }
/* 13 */            long j = ol1l0OoOo.I00iiO;
/* 15 */            long j2 = ol1l0OoOo.I00iiO;
/* 17 */            long[] jArr2 = ol1l0OoOo.I00iio;
/* 19 */            long j3 = ol1l0OoOo.I00iiI;
/* 21 */            long j4 = ol1l0OoOo.I00iOIl;
/* 23 */            long j5 = ol1l0OoOoI000iOII2.I00iiO;
/* 27 */            long j6 = ol1l0OoOoI000iOII2.I00iiI;
/* 30 */            long j7 = ol1l0OoOoI000iOII2.I00iOIl;
/* 32 */            if (j == j5 && jArr2 == (jArr = ol1l0OoOoI000iOII2.I00iio)) {
/* 48 */                return new Ol1l0OoOo(j7 | j4, j6 | j3, j5, jArr);
                    }
/* 57 */            int i = 0;
/* 62 */            long[] jArr3 = ol1l0OoOoI000iOII2.I00iio;
/* 64 */            if (jArr3 != null) {
/* 137 */               if (jArr2 != null) {
/* 141 */                   for (long j8 : jArr2) {
/* 145 */                       ol1l0OoOoI000iOII2 = ol1l0OoOoI000iOII2.I000iOII(j8);
                            }
                        }
/* 154 */               if (j3 != 0) {
/* 157 */                   for (int i2 = 0; i2 < 64; i2++) {
/* 164 */                       if (((1 << i2) & j3) != 0) {
/* 168 */                           ol1l0OoOoI000iOII2 = ol1l0OoOoI000iOII2.I000iOII(i2 + j2);
                                }
                            }
                        }
/* 177 */               if (j4 != 0) {
/* 179 */                   while (i < 64) {
/* 186 */                       if (((1 << i) & j4) != 0) {
/* 192 */                           ol1l0OoOoI000iOII2 = ol1l0OoOoI000iOII2.I000iOII(i + j2 + 64);
                                }
/* 196 */                       i++;
                            }
                        }
/* 437 */               return ol1l0OoOoI000iOII2;
                    }
/* 66 */            if (jArr3 != null) {
/* 69 */                ol1l0OoOoI000iOII = ol1l0OoOo;
/* 72 */                for (long j9 : jArr3) {
/* 76 */                    ol1l0OoOoI000iOII = ol1l0OoOoI000iOII.I000iOII(j9);
                        }
                    } else {
/* 83 */                ol1l0OoOoI000iOII = ol1l0OoOo;
                    }
/* 87 */            long j10 = ol1l0OoOoI000iOII2.I00iiO;
/* 89 */            if (j6 != 0) {
/* 92 */                for (int i3 = 0; i3 < 64; i3++) {
/* 99 */                    if (((1 << i3) & j6) != 0) {
/* 103 */                       ol1l0OoOoI000iOII = ol1l0OoOoI000iOII.I000iOII(i3 + j10);
                            }
                        }
                    }
/* 113 */           if (j7 != 0) {
/* 115 */               while (i < 64) {
/* 122 */                   if (((1 << i) & j7) != 0) {
/* 128 */                       ol1l0OoOoI000iOII = ol1l0OoOoI000iOII.I000iOII(i + j10 + 64);
                            }
/* 133 */                   i++;
                        }
                    }
/* 136 */           return ol1l0OoOoI000iOII;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Ol1l0OoOo I000iOII(long j) {
                    long[] jArr;
                    long j2;
                    long j3;
                    int i;
                    long[] jArr2;
                    long[] jArr3;
                    int i2;
                    OI0llOl1ooO0 oI0llOl1ooO0;
/* 5 */             long j4 = this.I00iiO;
/* 7 */             long j5 = j - j4;
/* 9 */             long j6 = 0;
/* 11 */            int iI0001Ioi1lo = O0000Ioio00.I0001Ioi1lo(j5, 0L);
/* 15 */            long j7 = this.I00iiI;
/* 21 */            if (iI0001Ioi1lo < 0 || O0000Ioio00.I0001Ioi1lo(j5, 64L) >= 0) {
/* 56 */                int iI0001Ioi1lo2 = O0000Ioio00.I0001Ioi1lo(j5, 64L);
/* 62 */                long j8 = this.I00iOIl;
/* 66 */                int i3 = 64;
/* 70 */                if (iI0001Ioi1lo2 < 0 || O0000Ioio00.I0001Ioi1lo(j5, 128L) >= 0) {
/* 103 */                   int iI0001Ioi1lo3 = O0000Ioio00.I0001Ioi1lo(j5, 128L);
/* 107 */                   long[] jArr4 = this.I00iio;
/* 109 */                   boolean z = 0;
/* 110 */                   if (iI0001Ioi1lo3 < 0) {
/* 355 */                       if (jArr4 == null) {
/* 374 */                           return new Ol1l0OoOo(this.I00iOIl, this.I00iiI, this.I00iiO, new long[]{j});
                                }
/* 378 */                       int iI00000oIO = lOIo0Iioi.I00000oIO(j, jArr4);
/* 382 */                       if (iI00000oIO < 0) {
/* 385 */                           int i4 = -(iI00000oIO + 1);
/* 386 */                           int length = jArr4.length;
/* 389 */                           long[] jArr5 = new long[length + 1];
/* 392 */                           I1IoiO1l.I000OiO(jArr4, jArr5, 0, 0, i4);
/* 397 */                           I1IoiO1l.I000OiO(jArr4, jArr5, i4 + 1, i4, length);
/* 400 */                           jArr5[i4] = j;
/* 410 */                           return new Ol1l0OoOo(this.I00iOIl, this.I00iiI, this.I00iiO, jArr5);
                                }
                            } else if (!I000OOo1O(j)) {
/* 122 */                       long j9 = ((j + 1) / 64) * 64;
/* 128 */                       if (O0000Ioio00.I0001Ioi1lo(j9, 0L) < 0) {
/* 130 */                           j9 = 9223372036854775680L;
                                }
/* 135 */                       long j10 = j8;
/* 137 */                       Oi0Oooi oi0Oooi = null;
                                while (true) {
/* 142 */                           if (O0000Ioio00.I0001Ioi1lo(j4, j9) >= 0) {
/* 301 */                               jArr = null;
/* 303 */                               j2 = j4;
/* 305 */                               j3 = j7;
                                        i = z;
                                        break;
                                    }
/* 146 */                           if (j7 != j6) {
/* 148 */                               if (oi0Oooi == null) {
/* 154 */                                   oi0Oooi = new Oi0Oooi(20, z);
/* 157 */                                   if (jArr4 != null) {
/* 160 */                                       long[] jArrCopyOf = Arrays.copyOf(jArr4, jArr4.length);
/* 166 */                                       jArr = null;
/* 169 */                                       oI0llOl1ooO0 = new OI0llOl1ooO0(jArrCopyOf.length);
/* 172 */                                       int i5 = oI0llOl1ooO0.I00000oOI;
/* 174 */                                       if (i5 < 0) {
/* 227 */                                           lO00l0o.I00000oOI("");
/* 230 */                                           throw null;
                                                }
/* 176 */                                       j3 = j6;
/* 179 */                                       if (jArrCopyOf.length != 0) {
/* 183 */                                           int length2 = jArrCopyOf.length + i5;
/* 184 */                                           long[] jArrCopyOf2 = oI0llOl1ooO0.I00000oIO;
/* 187 */                                           if (jArrCopyOf2.length < length2) {
/* 198 */                                               jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length2, (jArrCopyOf2.length * 3) / 2));
/* 202 */                                               oI0llOl1ooO0.I00000oIO = jArrCopyOf2;
                                                    }
/* 204 */                                           int i6 = oI0llOl1ooO0.I00000oOI;
/* 206 */                                           if (i5 != i6) {
/* 210 */                                               I1IoiO1l.I000OiO(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i5, i5, i6);
                                                    }
/* 215 */                                           System.arraycopy(jArrCopyOf, 0, jArrCopyOf2, i5, jArrCopyOf.length);
                                                    oI0llOl1ooO0.I00000oOI += jArrCopyOf.length;
                                                }
                                            } else {
/* 231 */                                       j3 = j6;
/* 233 */                                       jArr = null;
/* 237 */                                       oI0llOl1ooO0 = new OI0llOl1ooO0();
                                            }
/* 240 */                                   oi0Oooi.I00iiI = oI0llOl1ooO0;
/* 242 */                                   VarHandle.storeStoreFence();
                                        } else {
/* 246 */                                   j3 = j6;
/* 248 */                                   jArr = null;
                                        }
/* 250 */                               i2 = i3;
/* 253 */                               for (int i7 = 0; i7 < i2; i7++) {
/* 260 */                                   if (((1 << i7) & j7) != j3) {
/* 268 */                                       ((OI0llOl1ooO0) oi0Oooi.I00iiI).I00000oIO(i7 + j4);
                                            }
                                        }
                                    } else {
/* 274 */                               j3 = j6;
/* 276 */                               i2 = i3;
/* 278 */                               jArr = null;
                                    }
/* 282 */                           if (j10 == j3) {
/* 284 */                               j2 = j9;
/* 286 */                               i = 0;
                                        break;
                                    }
/* 288 */                           j4 += 64;
/* 290 */                           i3 = i2;
/* 292 */                           j7 = j10;
/* 294 */                           j6 = j3;
/* 296 */                           j10 = j6;
/* 298 */                           z = 0;
                                }
/* 309 */                       if (oi0Oooi == null) {
/* 342 */                           jArr2 = jArr4;
                                } else {
/* 313 */                           OI0llOl1ooO0 oI0llOl1ooO02 = (OI0llOl1ooO0) oi0Oooi.I00iiI;
/* 315 */                           int i8 = oI0llOl1ooO02.I00000oOI;
/* 317 */                           if (i8 == 0) {
/* 319 */                               jArr3 = jArr;
                                    } else {
/* 322 */                               long[] jArr6 = new long[i8];
/* 324 */                               long[] jArr7 = oI0llOl1ooO02.I00000oIO;
/* 326 */                               for (int i9 = i; i9 < i8; i9++) {
/* 330 */                                   jArr6[i9] = jArr7[i9];
                                        }
/* 335 */                               jArr3 = jArr6;
                                    }
/* 336 */                           if (jArr3 != null) {
/* 339 */                               jArr2 = jArr3;
                                    }
                                }
/* 349 */                       return new Ol1l0OoOo(j10, j3, j2, jArr2).I000iOII(j);
                            }
                        } else {
/* 81 */                    long j11 = 1 << (((int) j5) - 64);
/* 87 */                    if ((j8 & j11) == 0) {
/* 99 */                        return new Ol1l0OoOo(j8 | j11, this.I00iiI, this.I00iiO, this.I00iio);
                            }
                        }
                    } else {
/* 30 */                long j12 = 1 << ((int) j5);
/* 36 */                if ((j7 & j12) == 0) {
/* 52 */                    return new Ol1l0OoOo(this.I00iOIl, j7 | j12, this.I00iiO, this.I00iio);
                        }
                    }
/* 1 */             return this;
                }

                @Override
                public final Iterator iterator() {
/* 15 */            return OilOIIlI.I00000oIO((IlliIl1l11O) OilOIIlI.I00000oOI(new Ol1ioIO1o1(this, null)).I00000oOI);
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(this, 10));
/* 16 */            Iterator it = iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                    }
/* 46 */            StringBuilder sb = new StringBuilder();
/* 51 */            sb.append((CharSequence) "");
/* 54 */            int size = arrayList.size();
/* 59 */            int i = 0;
/* 60 */            for (int i2 = 0; i2 < size; i2++) {
/* 62 */                Object obj = arrayList.get(i2);
/* 67 */                i++;
/* 68 */                if (i > 1) {
/* 72 */                    sb.append((CharSequence) ", ");
                        }
/* 80 */                if (obj != null ? obj instanceof CharSequence : true) {
/* 84 */                    sb.append((CharSequence) obj);
                        } else if (obj instanceof Character) {
/* 98 */                    sb.append(((Character) obj).charValue());
                        } else {
/* 106 */                   sb.append((CharSequence) obj.toString());
                        }
                    }
/* 112 */           sb.append((CharSequence) "");
/* 123 */           return Oi010OO0.I001IIilI0O(string, " [", sb.toString(), "]");
                }
            }
