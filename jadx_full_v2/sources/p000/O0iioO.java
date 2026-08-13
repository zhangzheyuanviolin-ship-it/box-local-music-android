            package p000;
            
            public final class O0iioO {
                public O0iiOioolIi I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public O0iiOII1OO I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public boolean I000OiO;
                public boolean I000iOII;
                public int I000l1;
                public boolean I000lI;
                public boolean I000o00OoI0I;
                public int I000oI1ioi;
                public O1iO1i I00100l0;
                public O1IioI I00100o1O0lo;

                public final OIIlIII0Ili I00000oIO() {
/* 7 */             return (OIIlIII0Ili) this.I00000oIO.I010101Oo1lO.I00ilI0I1;
                }

                public final void I00000oOI() {
/* 5 */             O0iiOII1OO o0iiOII1OO = this.I00000oIO.I010I0.I0000O;
/* 10 */            if (o0iiOII1OO == O0iiOII1OO.I00iiO || o0iiOII1OO == O0iiOII1OO.I00iio) {
/* 20 */                if (this.I00100l0.I00ooIo0) {
/* 22 */                    I000II(true);
                        } else {
/* 26 */                    I0001Ioi1lo(true);
                        }
                    }
/* 31 */            if (o0iiOII1OO == O0iiOII1OO.I00iio) {
/* 33 */                O1IioI o1IioI = this.I00100o1O0lo;
/* 35 */                if (o1IioI == null || !o1IioI.I00oOio10iI1) {
/* 45 */                    I000O01llI0(true);
                        } else {
/* 41 */                    I000OOo1O(true);
                        }
                    }
                }

                public final void I0000Il00O(long j) {
/* 1 */             O1IioI o1IioI = this.I00100o1O0lo;
/* 3 */             if (o1IioI != null) {
/* 5 */                 O0iiOII1OO o0iiOII1OO = O0iiOII1OO.I00iiI;
/* 7 */                 O0iioO o0iioO = o1IioI.I00ilO0;
/* 9 */                 o0iioO.I0000O = o0iiOII1OO;
/* 11 */                O0iiOioolIi o0iiOioolIi = o0iioO.I00000oIO;
/* 14 */                o0iioO.I0000oI00 = false;
/* 16 */                o1IioI.I00oliIiO01i = j;
/* 24 */                OIlOIi0 snapshotObserver = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getSnapshotObserver();
/* 28 */                O1IiliOI o1IiliOI = o1IioI.I00oo1iO0ll;
/* 34 */                snapshotObserver.I00000oIO.I0000oI00(o0iiOioolIi, snapshotObserver.I00000oOI, o1IiliOI);
/* 38 */                o0iioO.I0001Ioi1lo = true;
/* 40 */                o0iioO.I000II = true;
/* 42 */                boolean zI00000oIO = l0o11i.I00000oIO(o0iiOioolIi);
/* 46 */                O1iO1i o1iO1i = o0iioO.I00100l0;
/* 48 */                if (zI00000oIO) {
/* 50 */                    o1iO1i.I00ol1 = true;
/* 52 */                    o1iO1i.I00olI = true;
                        } else {
/* 55 */                    o1iO1i.I00oOio10iI1 = true;
                        }
/* 59 */                o0iioO.I0000O = O0iiOII1OO.I00ilI0I1;
                    }
                }

                public final void I0000O(int i) {
/* 1 */             int i2 = this.I000l1;
/* 3 */             this.I000l1 = i;
/* 15 */            if ((i2 == 0) != (i == 0)) {
/* 19 */                O0iiOioolIi o0iiOioolIiI001IO000 = this.I00000oIO.I001IO000();
/* 28 */                O0iioO o0iioO = o0iiOioolIiI001IO000 != null ? o0iiOioolIiI001IO000.I010I0 : null;
/* 29 */                if (o0iioO != null) {
/* 31 */                    int i3 = o0iioO.I000l1;
/* 33 */                    if (i == 0) {
/* 37 */                        o0iioO.I0000O(i3 - 1);
                            } else {
/* 42 */                        o0iioO.I0000O(i3 + 1);
                            }
                        }
                    }
                }

                public final void I0000oI00(int i) {
/* 1 */             int i2 = this.I000oI1ioi;
/* 3 */             this.I000oI1ioi = i;
/* 15 */            if ((i2 == 0) != (i == 0)) {
/* 19 */                O0iiOioolIi o0iiOioolIiI001IO000 = this.I00000oIO.I001IO000();
/* 28 */                O0iioO o0iioO = o0iiOioolIiI001IO000 != null ? o0iiOioolIiI001IO000.I010I0 : null;
/* 29 */                if (o0iioO != null) {
/* 31 */                    int i3 = o0iioO.I000oI1ioi;
/* 33 */                    if (i == 0) {
/* 37 */                        o0iioO.I0000oI00(i3 - 1);
                            } else {
/* 42 */                        o0iioO.I0000oI00(i3 + 1);
                            }
                        }
                    }
                }

                public final void I0001Ioi1lo(boolean z) {
/* 3 */             if (this.I000iOII != z) {
/* 5 */                 this.I000iOII = z;
/* 7 */                 if (z && !this.I000OiO) {
/* 17 */                    I0000O(this.I000l1 + 1);
                        } else {
/* 21 */                    if (z || this.I000OiO) {
/* 77 */                        return;
                            }
/* 31 */                    I0000O(this.I000l1 - 1);
                        }
                    }
                }

                public final void I000II(boolean z) {
/* 3 */             if (this.I000OiO != z) {
/* 5 */                 this.I000OiO = z;
/* 7 */                 if (z && !this.I000iOII) {
/* 17 */                    I0000O(this.I000l1 + 1);
                        } else {
/* 21 */                    if (z || this.I000iOII) {
/* 77 */                        return;
                            }
/* 31 */                    I0000O(this.I000l1 - 1);
                        }
                    }
                }

                public final void I000O01llI0(boolean z) {
/* 3 */             if (this.I000o00OoI0I != z) {
/* 5 */                 this.I000o00OoI0I = z;
/* 7 */                 if (z && !this.I000lI) {
/* 17 */                    I0000oI00(this.I000oI1ioi + 1);
                        } else {
/* 21 */                    if (z || this.I000lI) {
/* 77 */                        return;
                            }
/* 31 */                    I0000oI00(this.I000oI1ioi - 1);
                        }
                    }
                }

                public final void I000OOo1O(boolean z) {
/* 3 */             if (this.I000lI != z) {
/* 5 */                 this.I000lI = z;
/* 7 */                 if (z && !this.I000o00OoI0I) {
/* 17 */                    I0000oI00(this.I000oI1ioi + 1);
                        } else {
/* 21 */                    if (z || this.I000o00OoI0I) {
/* 77 */                        return;
                            }
/* 31 */                    I0000oI00(this.I000oI1ioi - 1);
                        }
                    }
                }

                public final void I000OiO() {
/* 1 */             O0iiOioolIi o0iiOioolIi = this.I00000oIO;
/* 3 */             O1iO1i o1iO1i = this.I00100l0;
/* 5 */             O0iioO o0iioO = o1iO1i.I00ilO0;
/* 11 */            if ((o1iO1i.I00oII != null || o0iioO.I00000oIO().I00II0Ol1O0l() != null) && o1iO1i.I00oI0i) {
/* 29 */                o1iO1i.I00oI0i = false;
/* 39 */                o1iO1i.I00oII = o0iioO.I00000oIO().I00II0Ol1O0l();
/* 41 */                O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 45 */                if (o0iiOioolIiI001IO000 != null) {
/* 47 */                    O0iiOioolIi.I00Ol00(o0iiOioolIiI001IO000, false, 7);
                        }
                    }
/* 50 */            O1IioI o1IioI = this.I00100o1O0lo;
/* 52 */            if (o1IioI != null) {
/* 54 */                O0iioO o0iioO2 = o1IioI.I00ilO0;
/* 58 */                if (!(o1IioI.I00oli == null && o0iioO2.I00000oIO().I01101IOlO().I00oO101o.I00II0Ol1O0l() == null) && o1IioI.I00olI) {
/* 82 */                    o1IioI.I00olI = false;
/* 98 */                    o1IioI.I00oli = o0iioO2.I00000oIO().I01101IOlO().I00oO101o.I00II0Ol1O0l();
/* 104 */                   if (l0o11i.I00000oIO(o0iiOioolIi)) {
/* 106 */                       O0iiOioolIi o0iiOioolIiI001IO0002 = o0iiOioolIi.I001IO000();
/* 110 */                       if (o0iiOioolIiI001IO0002 != null) {
/* 112 */                           O0iiOioolIi.I00Ol00(o0iiOioolIiI001IO0002, false, 7);
/* 115 */                           return;
                                }
/* 245 */                       return;
                            }
/* 116 */                   O0iiOioolIi o0iiOioolIiI001IO0003 = o0iiOioolIi.I001IO000();
/* 120 */                   if (o0iiOioolIiI001IO0003 != null) {
/* 122 */                       O0iiOioolIi.I00OilO00Il(o0iiOioolIiI001IO0003, false, 7);
                            }
                        }
                    }
                }
            }
