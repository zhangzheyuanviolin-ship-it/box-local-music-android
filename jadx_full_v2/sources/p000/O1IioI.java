            package p000;

            import java.io.IOException;
            import kotlin.jvm.functions.Function1;
            
            public final class O1IioI extends OO1I0001000i implements O1iIo0ll, I0l00oIIo1O1, OI01OioIIoo {
                public O0iioO I00ilO0;
                public boolean I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public O0iiOi I00l0OO0IO;
                public boolean I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public IOo0oO11ll1O I00lll10;
                public long I00o0iI0io1;
                public Function1 I00o0l1o1o0;
                public Io10IOI I00o101lO;
                public O1IiloI0il I00oI0i;
                public O0iiOlo I00oII;
                public OI110O0 I00oIiI10;
                public boolean I00oO101o;
                public boolean I00oOio10iI1;
                public O1IiliOI I00ol1;
                public boolean I00olI;
                public Object I00oli;
                public long I00oliIiO01i;
                public O1IiliOI I00oo1iO0ll;
                public O1IiliOI I00ooIo0;
                public boolean I00ooiO1I;

                @Override
                public final O0iiOlo I00000oOI() {
/* 1 */             return this.I00oII;
                }

                @Override
                public final int I0000Il00O(int i) {
/* 1 */             I00o0iI0io1();
/* 14 */            return this.I00ilO0.I00000oIO().I01101IOlO().I0000Il00O(i);
                }

                @Override
                public final Iollol0oI I0001Ioi1lo() {
/* 9 */             return (Iollol0oI) this.I00ilO0.I00000oIO.I010101Oo1lO.I00iio;
                }

                @Override
                public final I0l00oIIo1O1 I000O01llI0() {
                    O0iioO o0iioO;
/* 5 */             O0iiOioolIi o0iiOioolIiI001IO000 = this.I00ilO0.I00000oIO.I001IO000();
/* 9 */             if (o0iiOioolIiI001IO000 == null || (o0iioO = o0iiOioolIiI001IO000.I010I0) == null) {
/* 18 */                return null;
                    }
/* 15 */            return o0iioO.I00100o1O0lo;
                }

                @Override
                public final int I000l1(int i) {
/* 1 */             I00o0iI0io1();
/* 14 */            return this.I00ilO0.I00000oIO().I01101IOlO().I000l1(i);
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final int I001iOo1i0O(int i) {
/* 1 */             I00o0iI0io1();
/* 14 */            return this.I00ilO0.I00000oIO().I01101IOlO().I001iOo1i0O(i);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OO1I0001000i I001lllioOl(long j) {
                    O0iiOi o0iiOi;
/* 1 */             O0iiOi o0iiOi2 = O0iiOi.I00iiO;
/* 3 */             O0iioO o0iioO = this.I00ilO0;
/* 5 */             O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 7 */             O0iiOioolIi o0iiOioolIi2 = o0iioO.I00000oIO;
/* 9 */             O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 24 */            if ((o0iiOioolIiI001IO000 != null ? o0iiOioolIiI001IO000.I010I0.I0000O : null) == O0iiOII1OO.I00iiI) {
/* 43 */                o0iioO.I00000oOI = false;
                    } else {
/* 26 */                O0iiOioolIi o0iiOioolIiI001IO0002 = o0iiOioolIi2.I001IO000();
/* 40 */                if ((o0iiOioolIiI001IO0002 != null ? o0iiOioolIiI001IO0002.I010I0.I0000O : null) == O0iiOII1OO.I00iio) {
                        }
                    }
/* 45 */            O0iiOioolIi o0iiOioolIiI001IO0003 = o0iiOioolIi2.I001IO000();
/* 49 */            if (o0iiOioolIiI001IO0003 != null) {
/* 51 */                O0iioO o0iioO2 = o0iiOioolIiI001IO0003.I010I0;
/* 55 */                if (this.I00l0OO0IO != o0iiOi2 && !o0iiOioolIi2.I0100o111I) {
/* 64 */                    IolioOO1.I0000Il00O("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                        }
/* 69 */                int iOrdinal = o0iioO2.I0000O.ordinal();
/* 73 */                if (iOrdinal == 0 || iOrdinal == 1) {
/* 96 */                    o0iiOi = O0iiOi.I00iOIl;
                        } else {
/* 79 */                    if (iOrdinal != 2 && iOrdinal != 3) {
/* 89 */                        IoOOl0iOl1io.I0010I0i("Measurable could be only measured from the parent's measure or layout block. Parents state is ", o0iioO2.I0000O);
/* 13 */                        return null;
                            }
/* 93 */                    o0iiOi = O0iiOi.I00iiI;
                        }
/* 98 */                this.I00l0OO0IO = o0iiOi;
                    } else {
/* 101 */               this.I00l0OO0IO = o0iiOi2;
                    }
/* 105 */           if (o0iiOioolIi2.I00oooO == o0iiOi2) {
/* 107 */               o0iiOioolIi2.I0000oI00();
                    }
/* 110 */           I00olI(j);
/* 168 */           return this;
                }

                @Override
                public final Object I00II0Ol1O0l() {
/* 1 */             return this.I00oli;
                }

                @Override
                public final void I00IO1(boolean z) {
                    O1IiiOil0o0l o1IiiOil0o0lI01101IOlO;
/* 1 */             O0iioO o0iioO = this.I00ilO0;
/* 7 */             O1IiiOil0o0l o1IiiOil0o0lI01101IOlO2 = o0iioO.I00000oIO().I01101IOlO();
/* 29 */            if (Boolean.valueOf(z).equals(o1IiiOil0o0lI01101IOlO2 != null ? Boolean.valueOf(o1IiiOil0o0lI01101IOlO2.I00ll1) : null) || (o1IiiOil0o0lI01101IOlO = o0iioO.I00000oIO().I01101IOlO()) == null) {
/* 77 */                return;
                    }
/* 41 */            o1IiiOil0o0lI01101IOlO.I00ll1 = z;
                }

                @Override
                public final void I00IO1oi11O(IIOIlOoI111 iIOIlOoI111) throws IOException {
/* 5 */             OI110O0 oi110o0I001lIiIIo1O = this.I00ilO0.I00000oIO.I001lIiIIo1O();
/* 9 */             Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 11 */            int i = oi110o0I001lIiIIo1O.I00iiO;
/* 14 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                iIOIlOoI111.invoke(((O0iiOioolIi) objArr[i2]).I010I0.I00100o1O0lo);
                    }
                }

                @Override
                public final void I00IOO() {
/* 2 */             this.I00oOio10iI1 = true;
/* 4 */             O0iiOlo o0iiOlo = this.I00oII;
/* 6 */             o0iiOlo.I000O01llI0();
/* 9 */             O0iioO o0iioO = this.I00ilO0;
/* 11 */            boolean z = o0iioO.I0001Ioi1lo;
/* 13 */            O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 16 */            if (z) {
/* 18 */                OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi.I001lIiIIo1O();
/* 22 */                Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 24 */                int i = oi110o0I001lIiIIo1O.I00iiO;
/* 27 */                for (int i2 = 0; i2 < i; i2++) {
/* 31 */                    O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) objArr[i2];
/* 37 */                    if (o0iiOioolIi2.I010I0.I0000oI00 && o0iiOioolIi2.I0010o() == O0iiOi.I00iOIl) {
/* 49 */                        O1IioI o1IioI = o0iiOioolIi2.I010I0.I00100o1O0lo;
/* 63 */                        if (o1IioI.I00olI((o1IioI != null ? o1IioI.I00lll10 : null).I00000oIO)) {
/* 66 */                            O0iiOioolIi.I00OilO00Il(o0iiOioolIi, false, 7);
                                }
                            }
                        }
                    }
/* 76 */            Iollo1 iollo1 = I0001Ioi1lo().I011iO;
/* 80 */            if (o0iioO.I000II || (!this.I00li1OI && !iollo1.I00o0iI0io1 && o0iioO.I0001Ioi1lo)) {
/* 94 */                o0iioO.I0001Ioi1lo = false;
/* 96 */                O0iiOII1OO o0iiOII1OO = o0iioO.I0000O;
/* 100 */               o0iioO.I0000O = O0iiOII1OO.I00iio;
/* 102 */               o0iioO.I000OOo1O(false);
/* 111 */               OIlOIi0 snapshotObserver = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getSnapshotObserver();
/* 121 */               snapshotObserver.I00000oIO.I0000oI00(o0iiOioolIi, snapshotObserver.I000O01llI0, this.I00ol1);
/* 124 */               o0iioO.I0000O = o0iiOII1OO;
/* 128 */               if (o0iioO.I000lI && iollo1.I00o0iI0io1) {
/* 134 */                   requestLayout();
                        }
/* 137 */               o0iioO.I000II = false;
                    }
/* 141 */           if (o0iiOlo.I0000O) {
/* 143 */               o0iiOlo.I0000oI00 = true;
                    }
/* 147 */           if (o0iiOlo.I00000oOI && o0iiOlo.I0000oI00()) {
/* 155 */               o0iiOlo.I000II();
                    }
/* 158 */           this.I00oOio10iI1 = false;
                }

                @Override
                public final void I00O10llo() {
/* 7 */             O0iiOioolIi.I00OilO00Il(this.I00ilO0.I00000oIO, false, 7);
                }

                @Override
                public final int I00OI1(int i) {
/* 1 */             I00o0iI0io1();
/* 14 */            return this.I00ilO0.I00000oIO().I01101IOlO().I00OI1(i);
                }

                @Override
                public final int I00OilO00Il(I0iolili01 i0iolili01) {
/* 1 */             O0iiOlo o0iiOlo = this.I00oII;
/* 3 */             O0iioO o0iioO = this.I00ilO0;
/* 7 */             O0iiOioolIi o0iiOioolIiI001IO000 = o0iioO.I00000oIO.I001IO000();
/* 23 */            if ((o0iiOioolIiI001IO000 != null ? o0iiOioolIiI001IO000.I010I0.I0000O : null) == O0iiOII1OO.I00iiI) {
/* 25 */                o0iiOlo.I0000Il00O = true;
                    } else {
/* 30 */                O0iiOioolIi o0iiOioolIiI001IO0002 = o0iioO.I00000oIO.I001IO000();
/* 42 */                if ((o0iiOioolIiI001IO0002 != null ? o0iiOioolIiI001IO0002.I010I0.I0000O : null) == O0iiOII1OO.I00iio) {
/* 44 */                    o0iiOlo.I0000O = true;
                        }
                    }
/* 46 */            this.I00li1OI = true;
/* 56 */            int iI00OilO00Il = o0iioO.I00000oIO().I01101IOlO().I00OilO00Il(i0iolili01);
/* 61 */            this.I00li1OI = false;
/* 77 */            return iI00OilO00Il;
                }

                @Override
                public final int I00Oio() {
/* 11 */            return this.I00ilO0.I00000oIO().I01101IOlO().I00Oio();
                }

                @Override
                public final int I00Ol10() {
/* 11 */            return this.I00ilO0.I00000oIO().I01101IOlO().I00Ol10();
                }

                @Override
                public final void I00iIO(long j, float f, Io10IOI io10IOI) {
/* 2 */             I00oOio10iI1(j, io10IOI, null);
                }

                @Override
                public final void I00iIi0i1o(long j, float f, Function1 function1) {
/* 2 */             I00oOio10iI1(j, null, function1);
                }

                public final boolean I00ioIO() {
/* 1 */             O0iioO o0iioO = this.I00ilO0;
                    return l0o11i.I00000oIO(o0iioO.I00000oIO) || o0iioO.I0000Il00O;
                }

                public final void I00l0I0l0lO1(boolean z) {
/* 1 */             if (z && I00ioIO()) {
/* 77 */                return;
                    }
/* 9 */             if (z || I00ioIO()) {
/* 20 */                this.I00oI0i = O1IiloI0il.I00iiO;
/* 26 */                OI110O0 oi110o0I001lIiIIo1O = this.I00ilO0.I00000oIO.I001lIiIIo1O();
/* 30 */                Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 32 */                int i = oi110o0I001lIiIIo1O.I00iiO;
/* 35 */                for (int i2 = 0; i2 < i; i2++) {
/* 46 */                    ((O0iiOioolIi) objArr[i2]).I010I0.I00100o1O0lo.I00l0I0l0lO1(true);
                        }
                    }
                }

                public final void I00li1OI() {
/* 1 */             O1IiloI0il o1IiloI0il = this.I00oI0i;
/* 3 */             O0iioO o0iioO = this.I00ilO0;
/* 5 */             boolean z = o0iioO.I0000Il00O;
/* 7 */             O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 9 */             if (z) {
/* 13 */                this.I00oI0i = O1IiloI0il.I00iiI;
                    } else {
/* 18 */                this.I00oI0i = O1IiloI0il.I00iOIl;
                    }
/* 22 */            if (o1IiloI0il != O1IiloI0il.I00iOIl && o0iioO.I0000oI00) {
/* 30 */                O0iiOioolIi.I00OilO00Il(o0iiOioolIi, true, 6);
                    }
/* 33 */            OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi.I001lIiIIo1O();
/* 37 */            Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 39 */            int i = oi110o0I001lIiIIo1O.I00iiO;
/* 42 */            for (int i2 = 0; i2 < i; i2++) {
/* 46 */                O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) objArr[i2];
/* 50 */                O1IioI o1IioI = o0iiOioolIi2.I010I0.I00100o1O0lo;
/* 52 */                if (o1IioI == null) {
/* 72 */                    I000II.I000iOII("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
/* 110 */                   return;
                        }
/* 59 */                if (o1IioI.I00l0I0l0lO1 != Integer.MAX_VALUE) {
/* 61 */                    o1IioI.I00li1OI();
/* 64 */                    O0iiOioolIi.I00Ol10(o0iiOioolIi2);
                        }
                    }
                }

                public final void I00ll1() {
/* 1 */             O0iioO o0iioO = this.I00ilO0;
/* 5 */             if (o0iioO.I000oI1ioi > 0) {
/* 9 */                 OI110O0 oi110o0I001lIiIIo1O = o0iioO.I00000oIO.I001lIiIIo1O();
/* 13 */                Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 15 */                int i = oi110o0I001lIiIIo1O.I00iiO;
/* 19 */                for (int i2 = 0; i2 < i; i2++) {
/* 23 */                    O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) objArr[i2];
/* 25 */                    O0iioO o0iioO2 = o0iiOioolIi.I010I0;
/* 29 */                    if ((o0iioO2.I000lI || o0iioO2.I000o00OoI0I) && !o0iioO2.I0001Ioi1lo) {
/* 39 */                        o0iiOioolIi.I00OOll1(false);
                            }
/* 42 */                    O1IioI o1IioI = o0iioO2.I00100o1O0lo;
/* 44 */                    if (o1IioI != null) {
/* 46 */                        o1IioI.I00ll1();
                            }
                        }
                    }
                }

                public final void I00o0iI0io1() {
/* 1 */             O0iioO o0iioO = this.I00ilO0;
/* 7 */             O0iiOioolIi.I00OilO00Il(o0iioO.I00000oIO, false, 7);
/* 10 */            O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 12 */            O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 16 */            if (o0iiOioolIiI001IO000 == null || o0iiOioolIi.I00oooO != O0iiOi.I00iiO) {
/* 55 */                return;
                    }
/* 28 */            int iOrdinal = o0iiOioolIiI001IO000.I010I0.I0000O.ordinal();
/* 45 */            o0iiOioolIi.I00oooO = iOrdinal != 0 ? iOrdinal != 2 ? o0iiOioolIiI001IO000.I00oooO : O0iiOi.I00iiI : O0iiOi.I00iOIl;
                }

                public final void I00oIiI10() {
                    O0iiOII1OO o0iiOII1OO;
/* 2 */             this.I00ooiO1I = true;
/* 4 */             O0iioO o0iioO = this.I00ilO0;
/* 8 */             O0iiOioolIi o0iiOioolIiI001IO000 = o0iioO.I00000oIO.I001IO000();
/* 12 */            O1IiloI0il o1IiloI0il = this.I00oI0i;
/* 17 */            if ((o1IiloI0il != O1IiloI0il.I00iOIl && !o0iioO.I0000Il00O) || (o1IiloI0il != O1IiloI0il.I00iiI && o0iioO.I0000Il00O)) {
/* 31 */                I00li1OI();
/* 36 */                if (this.I00io1l && o0iiOioolIiI001IO000 != null) {
/* 40 */                    o0iiOioolIiI001IO000.I00OOll1(false);
                        }
                    }
/* 43 */            if (o0iiOioolIiI001IO000 != null) {
/* 45 */                O0iioO o0iioO2 = o0iiOioolIiI001IO000.I010I0;
/* 49 */                if (!this.I00io1l && ((o0iiOII1OO = o0iioO2.I0000O) == O0iiOII1OO.I00iiO || o0iiOII1OO == O0iiOII1OO.I00iio)) {
/* 66 */                    if (this.I00l0I0l0lO1 != Integer.MAX_VALUE) {
/* 71 */                        IolioOO1.I0000Il00O("Place was called on a node which was placed already");
                            }
/* 74 */                    int i = o0iioO2.I000O01llI0;
/* 76 */                    this.I00l0I0l0lO1 = i;
/* 79 */                    o0iioO2.I000O01llI0 = i + 1;
                        }
                    } else {
/* 82 */                this.I00l0I0l0lO1 = 0;
                    }
/* 84 */            I00IOO();
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0081, B:31:0x006b), top: B:36:0x0007 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00oOio10iI1(long j, Io10IOI io10IOI, Function1 function1) {
/* 1 */             O0iioO o0iioO = this.I00ilO0;
/* 3 */             O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 5 */             O0iiOioolIi o0iiOioolIi2 = o0iioO.I00000oIO;
                    try {
/* 8 */                 O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 19 */                O0iiOII1OO o0iiOII1OO = o0iiOioolIiI001IO000 != null ? o0iiOioolIiI001IO000.I010I0.I0000O : null;
/* 20 */                O0iiOII1OO o0iiOII1OO2 = O0iiOII1OO.I00iio;
/* 23 */                if (o0iiOII1OO == o0iiOII1OO2) {
/* 25 */                    o0iioO.I0000Il00O = false;
                        }
/* 32 */                if (o0iiOioolIi2.I010o0o0oO) {
/* 36 */                    IolioOO1.I00000oIO("place is called on a deactivated node");
                        }
/* 39 */                o0iioO.I0000O = o0iiOII1OO2;
/* 41 */                boolean z = true;
/* 42 */                this.I00ll1 = true;
/* 44 */                this.I00ooiO1I = false;
/* 52 */                if (!IooO0O.I0000Il00O(j, this.I00o0iI0io1)) {
/* 56 */                    if (o0iioO.I000o00OoI0I || o0iioO.I000lI) {
/* 62 */                        o0iioO.I0001Ioi1lo = true;
                            }
/* 64 */                    I00ll1();
                        }
/* 67 */                OIlO000O01 oIlO000O01I00000oIO = O0iillo1ol0.I00000oIO(o0iiOioolIi2);
/* 71 */                this.I00o0iI0io1 = j;
/* 75 */                if (o0iioO.I0001Ioi1lo) {
/* 108 */                   o0iioO.I000O01llI0(false);
/* 113 */                   this.I00oII.I000II = false;
/* 117 */                   OIlOIi0 snapshotObserver = ((I0lio1O01i01) oIlO000O01I00000oIO).getSnapshotObserver();
/* 127 */                   snapshotObserver.I00000oIO.I0000oI00(o0iiOioolIi2, snapshotObserver.I000II, this.I00ooIo0);
                        } else {
/* 81 */                    if (this.I00oI0i == O1IiloI0il.I00iiO) {
/* 84 */                        z = false;
                            }
/* 85 */                    if (z) {
/* 91 */                        O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = o0iioO.I00000oIO().I01101IOlO();
/* 101 */                       o1IiiOil0o0lI01101IOlO.I010iIIOlo(IooO0O.I0000oI00(j, o1IiiOil0o0lI01101IOlO.I00ilI0I1));
/* 104 */                       I00oIiI10();
                            }
                        }
/* 130 */               this.I00o0l1o1o0 = function1;
/* 132 */               this.I00o101lO = io10IOI;
/* 136 */               o0iioO.I0000O = O0iiOII1OO.I00ilI0I1;
                    } catch (Throwable th) {
/* 139 */               o0iiOioolIi.I00OloOo(th);
/* 408 */               throw null;
                    }
                }

                public final boolean I00olI(long j) {
/* 1 */             O0iioO o0iioO = this.I00ilO0;
/* 3 */             O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 5 */             O0iiOioolIi o0iiOioolIi2 = o0iioO.I00000oIO;
                    try {
/* 9 */                 if (o0iiOioolIi.I010o0o0oO) {
/* 13 */                    IolioOO1.I00000oIO("measure is called on a deactivated node");
                        }
/* 20 */                O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi2.I001IO000();
/* 40 */                o0iiOioolIi2.I0100o111I = o0iiOioolIi2.I0100o111I || (o0iiOioolIiI001IO000 != null && o0iiOioolIiI001IO000.I0100o111I);
/* 46 */                if (!o0iiOioolIi2.I010I0.I0000oI00) {
/* 48 */                    IOo0oO11ll1O iOo0oO11ll1O = this.I00lll10;
/* 60 */                    if (iOo0oO11ll1O == null ? false : IOo0oO11ll1O.I0000O(iOo0oO11ll1O.I00000oIO, j)) {
/* 63 */                        OIlO000O01 oIlO000O01 = o0iiOioolIi2.I00o0iI0io1;
/* 65 */                        if (oIlO000O01 != null) {
/* 69 */                            ((I0lio1O01i01) oIlO000O01).I000O01llI0(o0iiOioolIi2, true);
                                }
/* 72 */                        o0iiOioolIi2.I00Ol1ll1();
/* 27 */                        return false;
                            }
                        }
/* 80 */                this.I00lll10 = IOo0oO11ll1O.I00000oIO(j);
/* 82 */                I00ilO0(j);
/* 87 */                this.I00oII.I0001Ioi1lo = false;
/* 89 */                OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi2.I001lIiIIo1O();
/* 93 */                Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 95 */                int i = oi110o0I001lIiIIo1O.I00iiO;
/* 98 */                for (int i2 = 0; i2 < i; i2++) {
/* 110 */                   ((O0iiOioolIi) objArr[i2]).I010I0.I00100o1O0lo.I00oII.I0000Il00O = false;
                        }
/* 122 */               long j2 = this.I00lli11 ? this.I00iiO : -9223372034707292160L;
/* 127 */               this.I00lli11 = true;
/* 133 */               O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = o0iioO.I00000oIO().I01101IOlO();
/* 137 */               if (o1IiiOil0o0lI01101IOlO == null) {
/* 142 */                   IolioOO1.I0000Il00O("Lookahead result from lookaheadRemeasure cannot be null");
                        }
/* 145 */               o0iioO.I0000Il00O(j);
/* 164 */               I00iOIl((o1IiiOil0o0lI01101IOlO.I00iOIl << 32) | (o1IiiOil0o0lI01101IOlO.I00iiI & 4294967295L));
                        return (((int) (j2 >> 32)) == o1IiiOil0o0lI01101IOlO.I00iOIl && ((int) (j2 & 4294967295L)) == o1IiiOil0o0lI01101IOlO.I00iiI) ? false : true;
                    } catch (Throwable th) {
/* 184 */               o0iiOioolIi.I00OloOo(th);
/* 437 */               throw null;
                    }
                }

                @Override
                public final void requestLayout() {
/* 6 */             this.I00ilO0.I00000oIO.I00OOll1(false);
                }
            }
