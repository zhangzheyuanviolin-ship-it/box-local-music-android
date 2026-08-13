            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            
            public final class II1oOo0O implements O1iOIl0o10 {
                public final I0iolI1I11l1 I00000oIO;
                public final boolean I00000oOI;

                public II1oOo0O(I0iolI1I11l1 i0iolI1I11l1, boolean z) {
/* 4 */             this.I00000oIO = i0iolI1I11l1;
/* 6 */             this.I00000oOI = z;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    int iI000l1;
                    int iI000iOII;
                    OO1I0001000i oO1I0001000iI001lllioOl;
/* 7 */             boolean zIsEmpty = list.isEmpty();
/* 11 */            Map map = Il011I1OiO0I.I00iOIl;
/* 13 */            if (zIsEmpty) {
/* 30 */                return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000iOII(j), map, new I10I0o1ii10(24));
                    }
/* 47 */            long j2 = this.I00000oOI ? j : j & (-8589934589L);
/* 54 */            int i = 0;
/* 55 */            if (list.size() == 1) {
/* 61 */                O1iIo0ll o1iIo0ll = (O1iIo0ll) list.get(0);
/* 63 */                Object objI00II0Ol1O0l = o1iIo0ll.I00II0Ol1O0l();
/* 75 */                II1oO1 iI1oO1 = objI00II0Ol1O0l instanceof II1oO1 ? (II1oO1) objI00II0Ol1O0l : null;
/* 82 */                if (iI1oO1 != null ? iI1oO1.I00o0l1o1o0 : false) {
/* 109 */                   iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 113 */                   iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 117 */                   int iI000l12 = IOo0oO11ll1O.I000l1(j);
/* 121 */                   int iI000iOII2 = IOo0oO11ll1O.I000iOII(j);
/* 135 */                   if (!((iI000iOII2 >= 0) & (iI000l12 >= 0))) {
/* 139 */                       Ioliol1Ii.I00000oIO("width and height must be >= 0");
                            }
/* 146 */                   oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000O01llI0(iI000l12, iI000l12, iI000iOII2, iI000iOII2));
                        } else {
/* 84 */                    oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j2);
/* 94 */                    iI000l1 = Math.max(IOo0oO11ll1O.I000l1(j), oO1I0001000iI001lllioOl.I00iOIl);
/* 104 */                   iI000iOII = Math.max(IOo0oO11ll1O.I000iOII(j), oO1I0001000iI001lllioOl.I00iiI);
                        }
/* 152 */               II1oOo01OlOl iI1oOo01OlOl = new II1oOo01OlOl(i);
/* 155 */               iI1oOo01OlOl.I00iiI = oO1I0001000iI001lllioOl;
/* 157 */               iI1oOo01OlOl.I00ilI0I1 = o1iIo0ll;
/* 159 */               iI1oOo01OlOl.I00ilO0 = o1iOIoOiO0;
/* 161 */               iI1oOo01OlOl.I00iiO = iI000l1;
/* 163 */               iI1oOo01OlOl.I00iio = iI000iOII;
/* 165 */               iI1oOo01OlOl.I00io1l = this;
/* 167 */               VarHandle.storeStoreFence();
/* 170 */               return o1iOIoOiO0.I001i1lo1io(iI000l1, iI000iOII, map, iI1oOo01OlOl);
                    }
/* 179 */           OO1I0001000i[] oO1I0001000iArr = new OO1I0001000i[list.size()];
/* 183 */           OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 190 */           oOo0ll111.I00iOIl = IOo0oO11ll1O.I000l1(j);
/* 194 */           OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 201 */           oOo0ll1112.I00iOIl = IOo0oO11ll1O.I000iOII(j);
/* 204 */           List list2 = list;
/* 206 */           int size = list2.size();
/* 211 */           boolean z = false;
/* 212 */           for (int i2 = 0; i2 < size; i2++) {
/* 220 */               O1iIo0ll o1iIo0ll2 = (O1iIo0ll) list.get(i2);
/* 222 */               Object objI00II0Ol1O0l2 = o1iIo0ll2.I00II0Ol1O0l();
/* 233 */               II1oO1 iI1oO12 = objI00II0Ol1O0l2 instanceof II1oO1 ? (II1oO1) objI00II0Ol1O0l2 : null;
/* 240 */               if (iI1oO12 != null ? iI1oO12.I00o0l1o1o0 : false) {
/* 269 */                   z = true;
                        } else {
/* 242 */                   OO1I0001000i oO1I0001000iI001lllioOl2 = o1iIo0ll2.I001lllioOl(j2);
/* 246 */                   oO1I0001000iArr[i2] = oO1I0001000iI001lllioOl2;
/* 256 */                   oOo0ll111.I00iOIl = Math.max(oOo0ll111.I00iOIl, oO1I0001000iI001lllioOl2.I00iOIl);
/* 266 */                   oOo0ll1112.I00iOIl = Math.max(oOo0ll1112.I00iOIl, oO1I0001000iI001lllioOl2.I00iiI);
                        }
                    }
/* 275 */           if (z) {
/* 277 */               int i3 = oOo0ll111.I00iOIl;
/* 286 */               int i4 = i3 != Integer.MAX_VALUE ? i3 : 0;
/* 287 */               int i5 = oOo0ll1112.I00iOIl;
/* 294 */               long jI00000oIO = IOo0olo.I00000oIO(i4, i3, i5 != Integer.MAX_VALUE ? i5 : 0, i5);
/* 298 */               int size2 = list2.size();
/* 303 */               for (int i6 = 0; i6 < size2; i6++) {
/* 309 */                   O1iIo0ll o1iIo0ll3 = (O1iIo0ll) list.get(i6);
/* 311 */                   Object objI00II0Ol1O0l3 = o1iIo0ll3.I00II0Ol1O0l();
/* 322 */                   II1oO1 iI1oO13 = objI00II0Ol1O0l3 instanceof II1oO1 ? (II1oO1) objI00II0Ol1O0l3 : null;
/* 329 */                   if (iI1oO13 != null ? iI1oO13.I00o0l1o1o0 : false) {
/* 335 */                       oO1I0001000iArr[i6] = o1iIo0ll3.I001lllioOl(jI00000oIO);
                            }
                        }
                    }
/* 340 */           int i7 = oOo0ll111.I00iOIl;
/* 342 */           int i8 = oOo0ll1112.I00iOIl;
/* 347 */           I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(4);
/* 350 */           i0O0o00OlIoi.I00iio = oO1I0001000iArr;
/* 352 */           i0O0o00OlIoi.I00iiO = list;
/* 354 */           i0O0o00OlIoi.I00ilI0I1 = o1iOIoOiO0;
/* 356 */           i0O0o00OlIoi.I00ilO0 = oOo0ll111;
/* 358 */           i0O0o00OlIoi.I00iiI = oOo0ll1112;
/* 360 */           i0O0o00OlIoi.I00io1l = this;
/* 362 */           VarHandle.storeStoreFence();
/* 365 */           return o1iOIoOiO0.I001i1lo1io(i7, i8, map, i0O0o00OlIoi);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof II1oOo0O)) {
/* 28 */                return false;
                    }
/* 9 */             II1oOo0O iI1oOo0O = (II1oOo0O) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iI1oOo0O.I00000oIO) && this.I00000oOI == iI1oOo0O.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "BoxMeasurePolicy(alignment=" + this.I00000oIO + ", propagateMinConstraints=" + this.I00000oOI + ")";
                }
            }
