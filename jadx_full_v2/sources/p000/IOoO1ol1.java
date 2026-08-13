            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOoO1ol1 extends O1ooOo implements IOlIil1, O1iOiiOo {
                public OIilII I00o0iI0io1;
                public Oii00o1ll I00o0l1o1o0;
                public boolean I00o101lO;
                public III0liIO I00oI0i;
                public OiOo1I1o0ilI I00oII;
                public Oi00IilOloo0 I00oIiI10;
                public boolean I00oO101o;
                public long I00oOio10iI1;
                public boolean I00ol1;

                public static boolean I010lI0oi(IOoO1ol1 iOoO1ol1, OOo0IO oOo0IO, long j, long j2, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 j = iOoO1ol1.I010l1ol111();
                    }
/* 9 */             long j3 = j;
/* 12 */            if ((i & 2) != 0) {
/* 14 */                j2 = 0;
                    }
/* 19 */            long jI010oio1OO0 = iOoO1ol1.I010oio1OO0(oOo0IO, j3, j2);
                    return Math.abs(Float.intBitsToFloat((int) (jI010oio1OO0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jI010oio1OO0 & 4294967295L))) <= 0.5f;
                }

                @Override
                public final void I00000oOI(long j) {
                    int iI0000oI00;
/* 1 */             long jI010l1ol111 = I010l1ol111();
/* 5 */             this.I00oOio10iI1 = j;
/* 9 */             int iOrdinal = this.I00o0iI0io1.ordinal();
/* 21 */            if (iOrdinal == 0) {
/* 46 */                iI0000oI00 = O0000Ioio00.I0000oI00((int) (j & 4294967295L), (int) (jI010l1ol111 & 4294967295L));
                    } else {
/* 23 */                if (iOrdinal != 1) {
/* 36 */                    I000II.I00000oIO();
/* 39 */                    return;
                        }
/* 31 */                iI0000oI00 = O0000Ioio00.I0000oI00((int) (j >> 32), (int) (jI010l1ol111 >> 32));
                    }
/* 50 */            if (iI0000oI00 >= 0) {
/* 168 */               return;
                    }
/* 84 */            long j2 = !this.I00o101lO ? this.I00o0iI0io1 == OIilII.I00iOIl ? (((int) (jI010l1ol111 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (jI010l1ol111 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
/* 93 */            OOo0IO oOo0IO = (OOo0IO) this.I00oII.invoke();
/* 95 */            if (oOo0IO == null || this.I00ol1 || this.I00oO101o || !I010lI0oi(this, oOo0IO, jI010l1ol111, 0L, 2) || I010lI0oi(this, oOo0IO, 0L, j2, 1)) {
/* 168 */               return;
                    }
/* 127 */           this.I00oO101o = true;
/* 129 */           I010o0o0oO(j2);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final float I010l1O(III0liIO iII0liIO, long j) {
                    float f;
                    OOo0IO oOo0IO;
                    int iCompare;
/* 5 */             long j2 = this.I00oOio10iI1;
/* 11 */            OI110O0 oi110o0 = (OI110O0) this.I00oIiI10.I00iOIl;
/* 16 */            int i = oi110o0.I00iiO - 1;
/* 17 */            Object[] objArr = oi110o0.I00iOIl;
/* 28 */            if (i < objArr.length) {
/* 30 */                oOo0IO = null;
                        while (true) {
/* 31 */                    if (i < 0) {
/* 123 */                       f = 0.0f;
                                break;
                            }
/* 43 */                    OOo0IO oOo0IO2 = (OOo0IO) ((IOoO0I1OIoi) objArr[i]).I00000oIO.invoke();
/* 45 */                    if (oOo0IO2 != null) {
/* 47 */                        long jI0000O = oOo0IO2.I0000O();
/* 55 */                        long jI00000oOI = l000O1l.I00000oOI(I010l1ol111());
/* 59 */                        f = 0.0f;
/* 63 */                        int iOrdinal = this.I00o0iI0io1.ordinal();
/* 67 */                        if (iOrdinal == 0) {
/* 106 */                           iCompare = Float.compare(Float.intBitsToFloat((int) (jI0000O & 4294967295L)), Float.intBitsToFloat((int) (jI00000oOI & 4294967295L)));
                                } else {
/* 69 */                            if (iOrdinal != 1) {
/* 89 */                                I000II.I00000oIO();
/* 59 */                                return 0.0f;
                                    }
/* 84 */                            iCompare = Float.compare(Float.intBitsToFloat((int) (jI0000O >> 32)), Float.intBitsToFloat((int) (jI00000oOI >> 32)));
                                }
/* 110 */                       if (iCompare <= 0) {
/* 112 */                           oOo0IO = oOo0IO2;
                                } else if (oOo0IO == null) {
/* 116 */                           oOo0IO = oOo0IO2;
                                }
                            }
                            i--;
                        }
                    } else {
/* 126 */               f = 0.0f;
/* 128 */               oOo0IO = null;
                    }
/* 129 */           if (oOo0IO == null) {
/* 142 */               OOo0IO oOo0IO3 = this.I00oO101o ? (OOo0IO) this.I00oII.invoke() : null;
/* 144 */               if (oOo0IO3 == null) {
/* 146 */                   return f;
                        }
/* 147 */               oOo0IO = oOo0IO3;
                    }
/* 148 */           long jI00000oOI2 = l000O1l.I00000oOI(j2);
/* 154 */           int iOrdinal2 = this.I00o0iI0io1.ordinal();
/* 158 */           if (iOrdinal2 == 0) {
/* 188 */               float f2 = oOo0IO.I00000oOI;
/* 205 */               return iII0liIO.I00000oIO(f2 - ((int) (j & 4294967295L)), oOo0IO.I0000O - f2, Float.intBitsToFloat((int) (jI00000oOI2 & 4294967295L)));
                    }
/* 160 */           if (iOrdinal2 == 1) {
/* 162 */               float f3 = oOo0IO.I00000oIO;
/* 179 */               return iII0liIO.I00000oIO(f3 - ((int) (j >> 32)), oOo0IO.I0000Il00O - f3, Float.intBitsToFloat((int) (jI00000oOI2 >> 32)));
                    }
/* 184 */           I000II.I00000oIO();
/* 187 */           return f;
                }

                public final long I010l1ol111() {
/* 1 */             long j = this.I00oOio10iI1;
/* 9 */             if (IooOl0ol01.I0000Il00O(j, -1L)) {
/* 11 */                return 0L;
                    }
/* 20 */            return j;
                }

                public final void I010o0o0oO(long j) {
/* 1 */             III0liIO iII0liIO = this.I00oI0i;
/* 3 */             if (iII0liIO == null) {
/* 11 */                iII0liIO = (III0liIO) iiliIooIliOo.I00000oIO(this, III0o1oi.I00000oIO);
                    }
/* 13 */            III0liIO iII0liIO2 = iII0liIO;
/* 16 */            if (this.I00ol1) {
/* 20 */                Ioll0IliO1l.I0000Il00O("launchAnimation called when previous animation was running");
                    }
/* 25 */            III0liIO iII0liIO3 = this.I00oI0i;
/* 27 */            if (iII0liIO3 == null) {
/* 35 */                iII0liIO3 = (III0liIO) iiliIooIliOo.I00000oIO(this, III0o1oi.I00000oIO);
                    }
/* 37 */            iII0liIO3.getClass();
/* 42 */            III0liIO.I00000oIO.getClass();
/* 45 */            OlIOiI1iI1 olIOiI1iI1 = III0l0Ili1l.I00000oOI;
/* 47 */            Ooioool0 ooioool0 = new Ooioool0();
/* 56 */            ooioool0.I00000oIO = olIOiI1iI1.I00000oIO(Ooo0ii.I00000oIO);
/* 60 */            ooioool0.I00000oOI = Long.MIN_VALUE;
/* 64 */            ooioool0.I0000Il00O = Ooioool0.I0001Ioi1lo;
/* 66 */            VarHandle.storeStoreFence();
/* 85 */            iOi1II01i0.I0000O(I00ooiO1I(), null, Ii01I10.I00iio, new IOoO1Ooii(this, ooioool0, iII0liIO2, j, null), 1);
                }

                public final long I010oio1OO0(OOo0IO oOo0IO, long j, long j2) {
/* 1 */             long jI00000oOI = l000O1l.I00000oOI(j);
/* 7 */             int iOrdinal = this.I00o0iI0io1.ordinal();
/* 19 */            if (iOrdinal == 0) {
/* 77 */                III0liIO iII0liIO = this.I00oI0i;
/* 79 */                if (iII0liIO == null) {
/* 88 */                    iII0liIO = (III0liIO) iiliIooIliOo.I00000oIO(this, III0o1oi.I00000oIO);
                        }
/* 90 */                float f = oOo0IO.I00000oOI;
/* 106 */               float fI00000oIO = iII0liIO.I00000oIO(f - ((int) (j2 & 4294967295L)), oOo0IO.I0000O - f, Float.intBitsToFloat((int) (jI00000oOI & 4294967295L)));
/* 124 */               return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fI00000oIO) & 4294967295L);
                    }
/* 22 */            if (iOrdinal != 1) {
/* 71 */                I000II.I00000oIO();
/* 74 */                return 0L;
                    }
/* 24 */            III0liIO iII0liIO2 = this.I00oI0i;
/* 26 */            if (iII0liIO2 == null) {
/* 35 */                iII0liIO2 = (III0liIO) iiliIooIliOo.I00000oIO(this, III0o1oi.I00000oIO);
                    }
/* 37 */            float f2 = oOo0IO.I00000oIO;
/* 69 */            return (Float.floatToRawIntBits(iII0liIO2.I00000oIO(f2 - ((int) (j2 >> 32)), oOo0IO.I0000Il00O - f2, Float.intBitsToFloat((int) (jI00000oOI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                }
            }
