            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class O0lOoio0l11 {
                public O0lOll0I0o00[] I00000oIO;
                public IOo0oO11ll1O I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public O0li0o I000O01llI0;

                public static void I00000oOI(O0lOoio0l11 o0lOoio0l11, O0lilO o0lilO, Ii0110 ii0110, Io10IIII io10IIII, int i, int i2, boolean z) {
/* 3 */             o0lOoio0l11.I000O01llI0.getClass();
/* 7 */             long jI000II = o0lilO.I000II(0);
/* 32 */            o0lOoio0l11.I00000oIO(o0lilO, ii0110, io10IIII, i, i2, (int) (!z ? jI000II & 4294967295L : jI000II >> 32));
                }

                public final void I00000oIO(O0lilO o0lilO, Ii0110 ii0110, Io10IIII io10IIII, int i, int i2, int i3) {
                    O0lOll0I0o00[] o0lOll0I0o00Arr;
/* 1 */             O0lOll0I0o00[] o0lOll0I0o00Arr2 = this.I00000oIO;
/* 3 */             int length = o0lOll0I0o00Arr2.length;
/* 5 */             int i4 = 0;
                    while (true) {
/* 6 */                 if (i4 >= length) {
/* 21 */                    this.I0001Ioi1lo = i;
/* 23 */                    this.I000II = i2;
                            break;
                        } else {
/* 8 */                     O0lOll0I0o00 o0lOll0I0o00 = o0lOll0I0o00Arr2[i4];
/* 10 */                    if (o0lOll0I0o00 != null && o0lOll0I0o00.I000II) {
                                break;
                            } else {
/* 18 */                        i4++;
                            }
                        }
                    }
/* 29 */            int size = o0lilO.I0000oI00().size();
/* 35 */            int length2 = this.I00000oIO.length;
                    while (true) {
/* 36 */                o0lOll0I0o00Arr = this.I00000oIO;
/* 38 */                if (size >= length2) {
                            break;
                        }
/* 40 */                O0lOll0I0o00 o0lOll0I0o002 = o0lOll0I0o00Arr[size];
/* 42 */                if (o0lOll0I0o002 != null) {
/* 44 */                    o0lOll0I0o002.I0000Il00O();
                        }
/* 47 */                size++;
                    }
/* 59 */            if (o0lOll0I0o00Arr.length != o0lilO.I0000oI00().size()) {
/* 77 */                this.I00000oIO = (O0lOll0I0o00[]) Arrays.copyOf(this.I00000oIO, o0lilO.I0000oI00().size());
                    }
/* 87 */            this.I00000oOI = IOo0oO11ll1O.I00000oIO(o0lilO.I0000O());
/* 89 */            this.I0000Il00O = i3;
/* 95 */            this.I0000O = o0lilO.I000O01llI0();
/* 101 */           this.I0000oI00 = o0lilO.I00000oOI();
/* 107 */           int size2 = o0lilO.I0000oI00().size();
/* 111 */           O0li0o o0li0o = this.I000O01llI0;
/* 113 */           for (int i5 = 0; i5 < size2; i5++) {
/* 125 */               Object objI00II0Ol1O0l = ((OO1I0001000i) o0lilO.I0000oI00().get(i5)).I00II0Ol1O0l();
/* 137 */               O0lO1IooO0I0 o0lO1IooO0I0 = objI00II0Ol1O0l instanceof O0lO1IooO0I0 ? (O0lO1IooO0I0) objI00II0Ol1O0l : null;
/* 138 */               O0lOll0I0o00[] o0lOll0I0o00Arr3 = this.I00000oIO;
/* 140 */               if (o0lO1IooO0I0 == null) {
/* 142 */                   O0lOll0I0o00 o0lOll0I0o003 = o0lOll0I0o00Arr3[i5];
/* 144 */                   if (o0lOll0I0o003 != null) {
/* 146 */                       o0lOll0I0o003.I0000Il00O();
                            }
/* 151 */                   this.I00000oIO[i5] = null;
                        } else {
/* 155 */                   O0lOll0I0o00 o0lOll0I0o004 = o0lOll0I0o00Arr3[i5];
/* 157 */                   if (o0lOll0I0o004 == null) {
/* 165 */                       IlIi0Il ilIi0Il = new IlIi0Il(11);
/* 168 */                       ilIi0Il.I00iiI = o0li0o;
/* 170 */                       VarHandle.storeStoreFence();
/* 173 */                       o0lOll0I0o004 = new O0lOll0I0o00();
/* 176 */                       o0lOll0I0o004.I00000oIO = ii0110;
/* 178 */                       o0lOll0I0o004.I00000oOI = io10IIII;
/* 180 */                       o0lOll0I0o004.I0000Il00O = ilIi0Il;
/* 182 */                       Boolean bool = Boolean.FALSE;
/* 188 */                       o0lOll0I0o004.I000O01llI0 = lOO00IiI0li.I00000oIO(bool);
/* 194 */                       o0lOll0I0o004.I000OOo1O = lOO00IiI0li.I00000oIO(bool);
/* 200 */                       o0lOll0I0o004.I000OiO = lOO00IiI0li.I00000oIO(bool);
/* 206 */                       o0lOll0I0o004.I000iOII = lOO00IiI0li.I00000oIO(bool);
/* 213 */                       o0lOll0I0o004.I000l1 = 9223372034707292159L;
/* 217 */                       o0lOll0I0o004.I000lI = 0L;
/* 219 */                       o0lOll0I0o004.I000o00OoI0I = 9223372034707292159L;
/* 229 */                       o0lOll0I0o004.I000oI1ioi = io10IIII != null ? io10IIII.I0000Il00O() : null;
/* 244 */                       o0lOll0I0o004.I00100l0 = new I10i01(IooO0O.I00000oIO(0L), Ooo0ii.I000II, null, 12);
/* 259 */                       o0lOll0I0o004.I00100o1O0lo = new I10i01(Float.valueOf(1.0f), Ooo0ii.I00000oIO, null, 12);
/* 269 */                       o0lOll0I0o004.I0010I0i = lOO00IiI0li.I00000oIO(IooO0O.I00000oIO(0L));
/* 271 */                       VarHandle.storeStoreFence();
/* 276 */                       this.I00000oIO[i5] = o0lOll0I0o004;
                            }
/* 280 */                   o0lOll0I0o004.I0000O = o0lO1IooO0I0.I00o0iI0io1;
/* 284 */                   o0lOll0I0o004.I0000oI00 = o0lO1IooO0I0.I00o0l1o1o0;
/* 288 */                   o0lOll0I0o004.I0001Ioi1lo = o0lO1IooO0I0.I00o101lO;
                        }
                    }
                }
            }
