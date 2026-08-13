            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1O0l0olo extends O1ooOo implements O0iOoioOoI {
                public float I00o0iI0io1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             int i = 1;
/* 2 */             long jI010l1ol111 = I010l1ol111(j, true);
/* 13 */            if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 16 */                jI010l1ol111 = I010l1O(j, true);
/* 24 */                if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 27 */                    jI010l1ol111 = I010o0o0oO(j, true);
/* 35 */                    if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 38 */                        jI010l1ol111 = I010lI0oi(j, true);
/* 46 */                        if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 49 */                            jI010l1ol111 = I010l1ol111(j, false);
/* 57 */                            if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 60 */                                jI010l1ol111 = I010l1O(j, false);
/* 68 */                                if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 71 */                                    jI010l1ol111 = I010o0o0oO(j, false);
/* 79 */                                    if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 82 */                                        jI010l1ol111 = I010lI0oi(j, false);
/* 90 */                                        if (IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 93 */                                            jI010l1ol111 = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 98 */            if (!IooOl0ol01.I0000Il00O(jI010l1ol111, 0L)) {
/* 104 */               int i2 = (int) (jI010l1ol111 >> 32);
/* 111 */               int i3 = (int) (4294967295L & jI010l1ol111);
/* 121 */               if (!((i2 >= 0) & (i3 >= 0))) {
/* 125 */                   Ioliol1Ii.I00000oIO("width and height must be >= 0");
                        }
/* 128 */               j = IOo0olo.I000O01llI0(i2, i2, i3, i3);
                    }
/* 132 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 136 */           int i4 = oO1I0001000iI001lllioOl.I00iOIl;
/* 138 */           int i5 = oO1I0001000iI001lllioOl.I00iiI;
/* 142 */           I0li0o i0li0o = new I0li0o(i);
/* 145 */           i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 147 */           VarHandle.storeStoreFence();
/* 152 */           return o1iOIoOiO0.I001i1lo1io(i4, i5, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return i != Integer.MAX_VALUE ? Math.round(i * this.I00o0iI0io1) : o1iIo0ll.I001iOo1i0O(i);
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return i != Integer.MAX_VALUE ? Math.round(i / this.I00o0iI0io1) : o1iIo0ll.I0000Il00O(i);
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return i != Integer.MAX_VALUE ? Math.round(i / this.I00o0iI0io1) : o1iIo0ll.I00OI1(i);
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
                    return i != Integer.MAX_VALUE ? Math.round(i * this.I00o0iI0io1) : o1iIo0ll.I000l1(i);
                }

                public final long I010l1O(long j, boolean z) {
                    int iRound;
/* 1 */             int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 8 */             if (iI000OOo1O == Integer.MAX_VALUE || (iRound = Math.round(iI000OOo1O * this.I00o0iI0io1)) <= 0) {
/* 41 */                return 0L;
                    }
/* 20 */            if (!z || Oi1oIiilI.I00000oOI(j, iRound, iI000OOo1O)) {
/* 39 */                return (iRound << 32) | (iI000OOo1O & 4294967295L);
                    }
/* 41 */            return 0L;
                }

                public final long I010l1ol111(long j, boolean z) {
                    int iRound;
/* 1 */             int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 8 */             if (iI000OiO == Integer.MAX_VALUE || (iRound = Math.round(iI000OiO / this.I00o0iI0io1)) <= 0) {
/* 42 */                return 0L;
                    }
/* 20 */            if (!z || Oi1oIiilI.I00000oOI(j, iI000OiO, iRound)) {
/* 39 */                return (iI000OiO << 32) | (iRound & 4294967295L);
                    }
/* 42 */            return 0L;
                }

                public final long I010lI0oi(long j, boolean z) {
/* 1 */             int iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 9 */             int iRound = Math.round(iI000iOII * this.I00o0iI0io1);
/* 13 */            if (iRound <= 0) {
/* 36 */                return 0L;
                    }
/* 15 */            if (!z || Oi1oIiilI.I00000oOI(j, iRound, iI000iOII)) {
/* 34 */                return (iRound << 32) | (iI000iOII & 4294967295L);
                    }
/* 36 */            return 0L;
                }

                public final long I010o0o0oO(long j, boolean z) {
/* 1 */             int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 9 */             int iRound = Math.round(iI000l1 / this.I00o0iI0io1);
/* 13 */            if (iRound <= 0) {
/* 37 */                return 0L;
                    }
/* 15 */            if (!z || Oi1oIiilI.I00000oOI(j, iI000l1, iRound)) {
/* 34 */                return (iI000l1 << 32) | (iRound & 4294967295L);
                    }
/* 37 */            return 0L;
                }
            }
