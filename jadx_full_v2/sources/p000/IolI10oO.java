            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IolI10oO implements Iill1Iloi0 {
                public Iilio0oo0 I00iOIl;
                public Iol1ii0Ol I00iiI;
                public Iol1olioO0 I00iiO;
                public Iol1lo1I1oli I00iio;
                public Iol1l0i0 I00ilI0I1;
                public ioOll0I11I I00ilO0;
                public OooIoi01IiI I00io1l;
                public Io1OIO1l0o I00ioIO;
                public O1I1OO I00l0I0l0lO1;
                public O1I1OO I00l0OO0IO;

                public static void I0000Il00O(IolI10oO iolI10oO, Iol1O1 iol1O1, long j, long j2, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 j2 = 0;
                    }
/* 7 */             Iilio0oo0 iilio0oo0 = iolI10oO.I00iOIl;
/* 9 */             Iol1lo1I1oli iol1lo1I1oli = iolI10oO.I00iio;
/* 12 */            if (iol1lo1I1oli == null) {
/* 16 */                iol1lo1I1oli = new Iol1lo1I1oli();
/* 20 */                iol1lo1I1oli.I00000oIO = null;
/* 27 */                iol1lo1I1oli.I00000oOI = Long.MAX_VALUE;
/* 29 */                iol1lo1I1oli.I0000Il00O = false;
/* 31 */                iolI10oO.I00iio = iol1lo1I1oli;
                    }
/* 33 */            iol1lo1I1oli.I00000oIO = iol1O1;
/* 35 */            iol1lo1I1oli.I00000oOI = j;
/* 37 */            Io1OIO1l0o io1OIO1l0o = iolI10oO.I00ioIO;
/* 39 */            OIilII oIilII = iilio0oo0.I00o101lO;
/* 41 */            if (io1OIO1l0o == null) {
/* 49 */                iolI10oO.I00ioIO = new Io1OIO1l0o(oIilII, 2);
                    } else {
/* 52 */                io1OIO1l0o.I00iiO = oIilII;
/* 54 */                io1OIO1l0o.I00iiI = j2;
                    }
/* 56 */            iol1lo1I1oli.I0000Il00O = false;
/* 58 */            iolI10oO.I00ilO0 = iol1lo1I1oli;
                }

                public final void I00000oIO() {
/* 1 */             Iol1ii0Ol iol1ii0Ol = this.I00iiI;
/* 4 */             if (iol1ii0Ol == null) {
/* 8 */                 Iol1Ooli iol1Ooli = Iol1Ooli.I00iiO;
/* 10 */                iol1ii0Ol = new Iol1ii0Ol();
/* 13 */                iol1ii0Ol.I00000oIO = iol1Ooli;
/* 15 */                iol1ii0Ol.I00000oOI = false;
/* 17 */                iol1ii0Ol.I0000Il00O = false;
/* 19 */                this.I00iiI = iol1ii0Ol;
                    }
/* 23 */            iol1ii0Ol.I00000oIO = Iol1Ooli.I00iiO;
/* 25 */            iol1ii0Ol.I00000oOI = false;
/* 27 */            iol1ii0Ol.I0000Il00O = false;
/* 29 */            this.I00ilO0 = iol1ii0Ol;
                }

                public final void I00000oOI(Iol1O1 iol1O1, long j, Io1OIO1l0o io1OIO1l0o) {
/* 1 */             Iol1l0i0 iol1l0i0 = this.I00ilI0I1;
/* 3 */             if (iol1l0i0 == null) {
/* 7 */                 iol1l0i0 = new Iol1l0i0();
/* 11 */                iol1l0i0.I00000oIO = null;
/* 18 */                iol1l0i0.I00000oOI = Long.MAX_VALUE;
/* 20 */                this.I00ilI0I1 = iol1l0i0;
                    }
/* 22 */            iol1l0i0.I00000oIO = iol1O1;
/* 24 */            iol1l0i0.I00000oOI = j;
/* 28 */            io1OIO1l0o.I00iiI = 0L;
/* 30 */            this.I00ilO0 = iol1l0i0;
                }

                public final OooIoi01IiI I0000O() {
/* 1 */             OooIoi01IiI oooIoi01IiI = this.I00io1l;
/* 3 */             if (oooIoi01IiI != null) {
/* 5 */                 return oooIoi01IiI;
                    }
/* 8 */             I000II.I000iOII("Velocity Tracker not initialized.");
/* 11 */            return null;
                }

                public final void I0000oI00(Iol1O1 iol1O1, Iol1IlIII10 iol1IlIII10, long j) {
                    long j2;
                    float fIntBitsToFloat;
/* 7 */             long j3 = iol1O1.I0000Il00O;
/* 9 */             Iilio0oo0 iilio0oo0 = this.I00iOIl;
/* 11 */            OIilII oIilII = iilio0oo0.I00o101lO;
/* 13 */            IillI1lo11l0 iillI1lo11l0 = IillIi1.I00000oIO;
/* 19 */            long j4 = 4294967295L;
/* 45 */            if (Math.abs(Float.intBitsToFloat((int) (oIilII == OIilII.I00iOIl ? j & 4294967295L : j >> 32))) > 2.0f) {
/* 47 */                OooIoi01IiI oooIoi01IiII0000O = I0000O();
/* 51 */                OIilII oIilII2 = iilio0oo0.I00o101lO;
/* 53 */                O1I1OO o1i1oo = this.I00l0I0l0lO1;
/* 57 */                OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) o1i1oo.I00iiO;
/* 62 */                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
/* 68 */                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
/* 77 */                if (ioi000.I00000oIO(iol1O1)) {
/* 79 */                    o1i1oo.I00iiI = 0;
/* 81 */                    oI0oiiIO0.I0000oI00();
                        }
/* 91 */                float fIntBitsToFloat4 = 0.0f;
/* 93 */                if (ioi000.I00000oOI(iol1O1) || ioi000.I00000oIO(iol1O1)) {
/* 195 */                   j2 = 4294967295L;
                        } else {
/* 103 */                   if (oI0oiiIO0.I00000oOI == 3) {
/* 105 */                       int i = o1i1oo.I00iiI;
/* 109 */                       o1i1oo.I00iiI = i + 1;
/* 111 */                       oI0oiiIO0.I000oI1ioi(i, iol1O1);
                            } else {
/* 115 */                       oI0oiiIO0.I00000oOI(iol1O1);
                            }
/* 120 */                   if (o1i1oo.I00iiI == 3) {
/* 122 */                       o1i1oo.I00iiI = 0;
                            }
/* 124 */                   Object[] objArr = oI0oiiIO0.I00000oIO;
/* 126 */                   int i2 = oI0oiiIO0.I00000oOI;
/* 128 */                   int i3 = 0;
/* 129 */                   float fIntBitsToFloat5 = 0.0f;
/* 131 */                   while (i3 < i2) {
/* 150 */                       fIntBitsToFloat5 += Float.intBitsToFloat((int) (((Iol1O1) objArr[i3]).I0000Il00O >> 32));
/* 151 */                       i3++;
/* 153 */                       j4 = j4;
                            }
/* 156 */                   j2 = j4;
/* 158 */                   int i4 = oI0oiiIO0.I00000oOI;
/* 161 */                   fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
/* 162 */                   Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 165 */                   float fIntBitsToFloat6 = 0.0f;
/* 167 */                   for (int i5 = 0; i5 < i4; i5++) {
/* 184 */                       fIntBitsToFloat6 += Float.intBitsToFloat((int) (((Iol1O1) objArr2[i5]).I0000Il00O & j2));
                            }
/* 192 */                   fIntBitsToFloat3 = fIntBitsToFloat6 / oI0oiiIO0.I00000oOI;
                        }
/* 211 */               long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat3) & j2) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
/* 213 */               if (oIilII2 != null) {
/* 218 */                   int i6 = iol1IlIII10.I00000oIO;
/* 220 */                   if (i6 == 1) {
/* 225 */                       fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                            } else if (i6 == 2) {
/* 236 */                       fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                            }
/* 274 */                   jFloatToRawIntBits = oIilII2 == OIilII.I00iiI ? (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(fIntBitsToFloat) & j2) | (Float.floatToRawIntBits(0.0f) << 32);
                        }
/* 279 */               oooIoi01IiII0000O.I00000oIO.I0000Il00O(iol1O1.I00000oOI, jFloatToRawIntBits);
/* 284 */               O1I1OO o1i1oo2 = this.I00l0OO0IO;
/* 288 */               OI0llOl1ooO0 oI0llOl1ooO0 = (OI0llOl1ooO0) o1i1oo2.I00iiO;
/* 290 */               int i7 = oI0llOl1ooO0.I00000oOI;
/* 293 */               if (i7 == 3) {
/* 295 */                   int i8 = o1i1oo2.I00iiI;
/* 299 */                   o1i1oo2.I00iiI = i8 + 1;
/* 301 */                   if (i8 < 0 || i8 >= i7) {
/* 314 */                       lO00l0o.I00000oOI("Index must be between 0 and size");
/* 318 */                       throw null;
                            }
/* 305 */                   long[] jArr = oI0llOl1ooO0.I00000oIO;
/* 307 */                   long j5 = jArr[i8];
/* 309 */                   jArr[i8] = j;
                        } else {
/* 319 */                   oI0llOl1ooO0.I00000oIO(j);
                        }
/* 325 */               if (o1i1oo2.I00iiI == 3) {
/* 327 */                   o1i1oo2.I00iiI = 0;
                        }
/* 329 */               long[] jArr2 = oI0llOl1ooO0.I00000oIO;
/* 331 */               int i9 = oI0llOl1ooO0.I00000oOI;
/* 334 */               float fIntBitsToFloat7 = 0.0f;
/* 336 */               for (int i10 = 0; i10 < i9; i10++) {
/* 347 */                   fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
                        }
/* 351 */               int i11 = oI0llOl1ooO0.I00000oOI;
/* 354 */               float f = fIntBitsToFloat7 / i11;
/* 355 */               long[] jArr3 = oI0llOl1ooO0.I00000oIO;
/* 357 */               for (int i12 = 0; i12 < i11; i12++) {
/* 368 */                   fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
                        }
/* 396 */               iilio0oo0.I0110o(new IilIiOlii((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4 / oI0llOl1ooO0.I00000oOI) & j2), true));
                    }
                }

                public final void I0001Ioi1lo(Iol1O1 iol1O1, Iol1O1 iol1O12, Iol1IlIII10 iol1IlIII10, long j) {
                    char c;
                    long j2;
                    float fIntBitsToFloat;
/* 7 */             Iilio0oo0 iilio0oo0 = this.I00iOIl;
/* 11 */            if (this.I00io1l == null) {
/* 18 */                this.I00io1l = new OooIoi01IiI();
                    }
/* 20 */            OooIoi01IiI oooIoi01IiII0000O = I0000O();
/* 24 */            OIilII oIilII = iilio0oo0.I00o101lO;
/* 26 */            O1I1OO o1i1oo = this.I00l0I0l0lO1;
/* 30 */            OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) o1i1oo.I00iiO;
/* 34 */            char c2 = ' ';
/* 38 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iol1O1.I0000Il00O >> 32));
/* 44 */            long j3 = 4294967295L;
/* 51 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iol1O1.I0000Il00O & 4294967295L));
/* 60 */            if (ioi000.I00000oIO(iol1O1)) {
/* 62 */                o1i1oo.I00iiI = 0;
/* 64 */                oI0oiiIO0.I0000oI00();
                    }
/* 72 */            if (ioi000.I00000oOI(iol1O1) || ioi000.I00000oIO(iol1O1)) {
/* 177 */               c = ' ';
/* 179 */               j2 = 4294967295L;
                    } else {
/* 83 */                if (oI0oiiIO0.I00000oOI == 3) {
/* 85 */                    int i = o1i1oo.I00iiI;
/* 89 */                    o1i1oo.I00iiI = i + 1;
/* 91 */                    oI0oiiIO0.I000oI1ioi(i, iol1O1);
                        } else {
/* 95 */                    oI0oiiIO0.I00000oOI(iol1O1);
                        }
/* 100 */               if (o1i1oo.I00iiI == 3) {
/* 102 */                   o1i1oo.I00iiI = 0;
                        }
/* 104 */               Object[] objArr = oI0oiiIO0.I00000oIO;
/* 106 */               int i2 = oI0oiiIO0.I00000oOI;
/* 108 */               int i3 = 0;
/* 109 */               float fIntBitsToFloat4 = 0.0f;
/* 110 */               while (i3 < i2) {
/* 114 */                   char c3 = c2;
/* 131 */                   fIntBitsToFloat4 += Float.intBitsToFloat((int) (((Iol1O1) objArr[i3]).I0000Il00O >> c3));
/* 132 */                   i3++;
/* 134 */                   c2 = c3;
/* 136 */                   j3 = j3;
                        }
/* 139 */               c = c2;
/* 141 */               j2 = j3;
/* 143 */               int i4 = oI0oiiIO0.I00000oOI;
/* 146 */               fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
/* 148 */               Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 151 */               float fIntBitsToFloat5 = 0.0f;
/* 152 */               for (int i5 = 0; i5 < i4; i5++) {
/* 167 */                   fIntBitsToFloat5 += Float.intBitsToFloat((int) (((Iol1O1) objArr2[i5]).I0000Il00O & j2));
                        }
/* 174 */               fIntBitsToFloat3 = fIntBitsToFloat5 / oI0oiiIO0.I00000oOI;
                    }
/* 195 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << c) | (Float.floatToRawIntBits(fIntBitsToFloat3) & j2);
/* 197 */           if (oIilII != null) {
/* 200 */               int i6 = iol1IlIII10.I00000oIO;
/* 202 */               if (i6 == 1) {
/* 207 */                   fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i6 == 2) {
/* 218 */                   fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                        }
/* 257 */               jFloatToRawIntBits = oIilII == OIilII.I00iiI ? (Float.floatToRawIntBits(fIntBitsToFloat) << c) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(fIntBitsToFloat) & j2);
                    }
/* 263 */           oooIoi01IiII0000O.I00000oIO.I0000Il00O(iol1O1.I00000oOI, jFloatToRawIntBits);
/* 276 */           long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(ioi000.I0000O(iol1O12, iilio0oo0.I00o101lO, iol1IlIII10), j);
/* 280 */           Function1 function1 = iilio0oo0.I00oI0i;
/* 284 */           OO1l0oO oO1l0oO = new OO1l0oO();
/* 287 */           oO1l0oO.I00000oIO = 1;
/* 289 */           VarHandle.storeStoreFence();
/* 302 */           if (((Boolean) function1.invoke(oO1l0oO)).booleanValue()) {
/* 309 */               iilio0oo0.I0110o(new IilIli(jI0001Ioi1lo));
                    }
/* 312 */           O1I1OO o1i1oo2 = this.I00l0OO0IO;
/* 314 */           o1i1oo2.I00iiI = 0;
/* 320 */           ((OI0llOl1ooO0) o1i1oo2.I00iiO).I00000oOI = 0;
                }

                @Override
                public final String I00O0i0ii() {
/* 1 */             ioOll0I11I iooll0i11i = this.I00ilO0;
                    return iooll0i11i instanceof Iol1ii0Ol ? ((Iol1ii0Ol) iooll0i11i).I0000Il00O ? "waiting" : "idle" : ((iooll0i11i instanceof Iol1lo1I1oli) || (iooll0i11i instanceof Iol1l0i0)) ? "waiting" : iooll0i11i instanceof Iol1olioO0 ? "recognized" : "idle";
                }

                @Override
                public final OIilII I00Oio() {
/* 3 */             return this.I00iOIl.I00o101lO;
                }
            }
