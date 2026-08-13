            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol0iOOio1O1 extends O1ooOo implements O0iOoioOoI {
                public float I00o0iI0io1;
                public float I00o0l1o1o0;
                public float I00o101lO;
                public float I00oI0i;
                public boolean I00oII;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    int iI000l1;
                    int iI000OiO;
                    int iI000iOII;
                    int iI000OOo1O;
                    long jI00000oIO;
/* 1 */             long jI010l1O = I010l1O(o1iOIoOiO0);
/* 7 */             if (this.I00oII) {
/* 9 */                 jI00000oIO = IOo0olo.I0000oI00(j, jI010l1O);
                    } else {
/* 20 */                if (Float.isNaN(this.I00o0iI0io1)) {
/* 27 */                    iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 31 */                    int iI000OiO2 = IOo0oO11ll1O.I000OiO(jI010l1O);
/* 35 */                    if (iI000l1 > iI000OiO2) {
/* 37 */                        iI000l1 = iI000OiO2;
                            }
                        } else {
/* 22 */                    iI000l1 = IOo0oO11ll1O.I000l1(jI010l1O);
                        }
/* 44 */                if (Float.isNaN(this.I00o101lO)) {
/* 51 */                    iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 55 */                    int iI000l12 = IOo0oO11ll1O.I000l1(jI010l1O);
/* 59 */                    if (iI000OiO < iI000l12) {
/* 61 */                        iI000OiO = iI000l12;
                            }
                        } else {
/* 46 */                    iI000OiO = IOo0oO11ll1O.I000OiO(jI010l1O);
                        }
/* 68 */                if (Float.isNaN(this.I00o0l1o1o0)) {
/* 75 */                    iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 79 */                    int iI000OOo1O2 = IOo0oO11ll1O.I000OOo1O(jI010l1O);
/* 83 */                    if (iI000iOII > iI000OOo1O2) {
/* 85 */                        iI000iOII = iI000OOo1O2;
                            }
                        } else {
/* 70 */                    iI000iOII = IOo0oO11ll1O.I000iOII(jI010l1O);
                        }
/* 92 */                if (Float.isNaN(this.I00oI0i)) {
/* 99 */                    iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 103 */                   int iI000iOII2 = IOo0oO11ll1O.I000iOII(jI010l1O);
/* 107 */                   if (iI000OOo1O < iI000iOII2) {
/* 109 */                       iI000OOo1O = iI000iOII2;
                            }
                        } else {
/* 94 */                    iI000OOo1O = IOo0oO11ll1O.I000OOo1O(jI010l1O);
                        }
/* 110 */               jI00000oIO = IOo0olo.I00000oIO(iI000l1, iI000OiO, iI000iOII, iI000OOo1O);
                    }
/* 114 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(jI00000oIO);
/* 118 */           int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 120 */           int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 126 */           I0li0o i0li0o = new I0li0o(11);
/* 129 */           i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 131 */           VarHandle.storeStoreFence();
/* 136 */           return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             long jI010l1O = I010l1O(o1IiO0l);
/* 9 */             if (IOo0oO11ll1O.I000O01llI0(jI010l1O)) {
/* 11 */                return IOo0oO11ll1O.I000OiO(jI010l1O);
                    }
/* 18 */            if (!this.I00oII) {
/* 21 */                i = IOo0olo.I0001Ioi1lo(i, jI010l1O);
                    }
/* 29 */            return IOo0olo.I000II(o1iIo0ll.I001iOo1i0O(i), jI010l1O);
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             long jI010l1O = I010l1O(o1IiO0l);
/* 9 */             if (IOo0oO11ll1O.I000II(jI010l1O)) {
/* 11 */                return IOo0oO11ll1O.I000OOo1O(jI010l1O);
                    }
/* 18 */            if (!this.I00oII) {
/* 21 */                i = IOo0olo.I000II(i, jI010l1O);
                    }
/* 29 */            return IOo0olo.I0001Ioi1lo(o1iIo0ll.I0000Il00O(i), jI010l1O);
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             long jI010l1O = I010l1O(o1IiO0l);
/* 9 */             if (IOo0oO11ll1O.I000II(jI010l1O)) {
/* 11 */                return IOo0oO11ll1O.I000OOo1O(jI010l1O);
                    }
/* 18 */            if (!this.I00oII) {
/* 21 */                i = IOo0olo.I000II(i, jI010l1O);
                    }
/* 29 */            return IOo0olo.I0001Ioi1lo(o1iIo0ll.I00OI1(i), jI010l1O);
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             long jI010l1O = I010l1O(o1IiO0l);
/* 9 */             if (IOo0oO11ll1O.I000O01llI0(jI010l1O)) {
/* 11 */                return IOo0oO11ll1O.I000OiO(jI010l1O);
                    }
/* 18 */            if (!this.I00oII) {
/* 21 */                i = IOo0olo.I0001Ioi1lo(i, jI010l1O);
                    }
/* 29 */            return IOo0olo.I000II(o1iIo0ll.I000l1(i), jI010l1O);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I010l1O(O1iOIoOiO0 o1iOIoOiO0) {
                    int iI00l0OO0IO;
                    int iI00l0OO0IO2;
                    int iI00l0OO0IO3;
/* 10 */            int i = 0;
/* 11 */            if (Float.isNaN(this.I00o101lO)) {
/* 23 */                iI00l0OO0IO = Integer.MAX_VALUE;
                    } else {
/* 15 */                iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(this.I00o101lO);
/* 19 */                if (iI00l0OO0IO < 0) {
/* 21 */                    iI00l0OO0IO = 0;
                        }
                    }
/* 30 */            if (Float.isNaN(this.I00oI0i)) {
/* 42 */                iI00l0OO0IO2 = Integer.MAX_VALUE;
                    } else {
/* 34 */                iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(this.I00oI0i);
/* 38 */                if (iI00l0OO0IO2 < 0) {
/* 40 */                    iI00l0OO0IO2 = 0;
                        }
                    }
/* 49 */            if (Float.isNaN(this.I00o0iI0io1)) {
/* 66 */                iI00l0OO0IO3 = 0;
                    } else {
/* 53 */                iI00l0OO0IO3 = o1iOIoOiO0.I00l0OO0IO(this.I00o0iI0io1);
/* 57 */                if (iI00l0OO0IO3 < 0) {
/* 59 */                    iI00l0OO0IO3 = 0;
                        }
/* 60 */                if (iI00l0OO0IO3 > iI00l0OO0IO) {
/* 62 */                    iI00l0OO0IO3 = iI00l0OO0IO;
                        }
/* 63 */                if (iI00l0OO0IO3 == Integer.MAX_VALUE) {
                        }
                    }
/* 73 */            if (!Float.isNaN(this.I00o0l1o1o0)) {
/* 77 */                int iI00l0OO0IO4 = o1iOIoOiO0.I00l0OO0IO(this.I00o0l1o1o0);
/* 81 */                if (iI00l0OO0IO4 < 0) {
/* 83 */                    iI00l0OO0IO4 = 0;
                        }
/* 84 */                if (iI00l0OO0IO4 > iI00l0OO0IO2) {
/* 86 */                    iI00l0OO0IO4 = iI00l0OO0IO2;
                        }
/* 87 */                if (iI00l0OO0IO4 != Integer.MAX_VALUE) {
/* 89 */                    i = iI00l0OO0IO4;
                        }
                    }
/* 90 */            return IOo0olo.I00000oIO(iI00l0OO0IO3, iI00l0OO0IO, i, iI00l0OO0IO2);
                }
            }
