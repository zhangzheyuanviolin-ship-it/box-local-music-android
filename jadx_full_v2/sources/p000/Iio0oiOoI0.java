            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iio0oiOoI0 implements OO1ll1 {
                public long I00iOIl;
                public IiIooOOOI I00iiI;
                public int I00iiO;
                public IiI01lI I00iio;
                public OIooliIO0 I00ilI0I1;

                /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
                
                    r2 = 0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[LOOP:1: B:30:0x00bb->B:44:0x0101, LOOP_START, PHI: r3 r4
                  0x00bb: PHI (r3v3 int) = (r3v2 int), (r3v9 int) binds: [B:29:0x00b9, B:44:0x0101] A[DONT_GENERATE, DONT_INLINE]
                  0x00bb: PHI (r4v4 int) = (r4v1 int), (r4v7 int) binds: [B:29:0x00b9, B:44:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I00000oIO(IooO1IOlo iooO1IOlo, long j, O0iOOoiioO o0iOOoiioO, long j2) {
                    int i;
                    int iI0000Il00O;
                    int i2;
                    int i3;
                    long j3;
                    int iI0000Il00O2;
                    int i4;
/* 13 */            O1l0O1O o1l0O1O = new O1l0O1O();
/* 16 */            o1l0O1O.I00000oIO = iooO1IOlo;
/* 18 */            o1l0O1O.I00000oOI = j;
/* 20 */            o1l0O1O.I0000Il00O = j2;
/* 22 */            o1l0O1O.I0000O = o0iOOoiioO;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            IoloOio0I ioloOio0I = IoloOio0I.I00iio;
/* 37 */            OI0l1iiooO oI0l1iiooO = (OI0l1iiooO) ((O0o01OIl) ioloOio0I.I00iiI).invoke(o1l0O1O);
/* 47 */            OI0l1iiooO oI0l1iiooO2 = (OI0l1iiooO) ((O0o01OIl) ioloOio0I.I00iiO).invoke(o1l0O1O);
/* 49 */            IiIooOOOI iiIooOOOI = this.I00iiI;
/* 51 */            long j4 = this.I00iOIl;
/* 68 */            int iI00l0OO0IO = iiIooOOOI.I00l0OO0IO(Iil1I1il0I1.I00000oIO(j4)) * (o0iOOoiioO == O0iOOoiioO.I00iOIl ? 1 : -1);
/* 73 */            int iI00l0OO0IO2 = iiIooOOOI.I00l0OO0IO(Iil1I1il0I1.I00000oOI(j4));
/* 80 */            IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, oI0l1iiooO.I00000oOI);
/* 84 */            int i5 = iooO11lI000O01llI0.I00iOIl;
/* 86 */            int i6 = iooO11lI000O01llI0.I00iiI;
/* 94 */            if (i5 <= i6) {
                        while (true) {
/* 102 */                   iI0000Il00O = oI0l1iiooO.I0000Il00O(i5) + iI00l0OO0IO;
/* 104 */                   int i7 = iI00l0OO0IO;
/* 106 */                   if (iI0000Il00O >= 0 && ((int) (j2 >> 32)) + iI0000Il00O <= ((int) (j >> 32))) {
                                break;
                            }
/* 123 */                   if (i5 != oI0l1iiooO.I00000oOI - 1) {
/* 161 */                       i = 0;
/* 162 */                       if (i5 == i6) {
                                    break;
                                }
/* 164 */                       i5++;
/* 167 */                       iI00l0OO0IO = i7;
                            } else {
/* 127 */                       int i8 = (int) (j2 >> 32);
/* 130 */                       int i9 = (int) (j >> 32);
/* 131 */                       if (i8 >= i9) {
/* 147 */                           iI0000Il00O = Math.round(((o0iOOoiioO == O0iOOoiioO.I00iOIl ? 0.0f : -0.0f) + 1.0f) * ((i9 - i8) / 2.0f));
                                } else {
/* 153 */                           int i10 = i9 - i8;
/* 154 */                           i = 0;
/* 155 */                           iI0000Il00O = lIiioliIlo.I0000Il00O(iI0000Il00O, 0, i10);
                                }
                            }
                        }
/* 178 */               IooO11l iooO11lI000O01llI02 = lIiioliIlo.I000O01llI0(i, oI0l1iiooO2.I00000oOI);
/* 182 */               i2 = iooO11lI000O01llI02.I00iOIl;
/* 184 */               i3 = iooO11lI000O01llI02.I00iiI;
/* 186 */               if (i2 > i3) {
                            while (true) {
/* 192 */                       iI0000Il00O2 = oI0l1iiooO2.I0000Il00O(i2) + iI00l0OO0IO2;
/* 193 */                       int i11 = this.I00iiO;
/* 195 */                       if (iI0000Il00O2 >= i11) {
/* 197 */                           j3 = 4294967295L;
/* 206 */                           i4 = i3;
/* 211 */                           if (((int) (j2 & 4294967295L)) + iI0000Il00O2 > ((int) (j & 4294967295L)) - i11) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
/* 214 */                       i4 = i3;
/* 215 */                       j3 = 4294967295L;
/* 224 */                       if (i2 != oI0l1iiooO2.I00000oOI - 1) {
/* 256 */                           if (i2 == i4) {
                                        break;
                                    }
/* 258 */                           i2++;
/* 260 */                           i3 = i4;
                                } else {
/* 228 */                           int i12 = (int) (j2 & j3);
/* 231 */                           int i13 = (int) (j & j3);
/* 251 */                           iI0000Il00O2 = i12 >= i13 - (i11 * 2) ? Math.round(((i13 - i12) / 2.0f) * 1.0f) : lIiioliIlo.I0000Il00O(iI0000Il00O2, i11, (i13 - i11) - i12);
                                }
                            }
                        } else {
/* 263 */                   j3 = 4294967295L;
                        }
/* 268 */               iI0000Il00O2 = 0;
/* 275 */               long j5 = (iI0000Il00O << 32) | (iI0000Il00O2 & j3);
/* 290 */               this.I00ilI0I1.setValue(OoI0l01O.I00000oIO(O1ioliIli0o.I0000Il00O(iooO1IOlo, ioooOioll1.I00000oIO(j5, j2))));
/* 1182 */              return j5;
                    }
/* 172 */           i = 0;
/* 175 */           iI0000Il00O = i;
/* 178 */           IooO11l iooO11lI000O01llI022 = lIiioliIlo.I000O01llI0(i, oI0l1iiooO2.I00000oOI);
/* 182 */           i2 = iooO11lI000O01llI022.I00iOIl;
/* 184 */           i3 = iooO11lI000O01llI022.I00iiI;
/* 186 */           if (i2 > i3) {
                    }
/* 268 */           iI0000Il00O2 = 0;
/* 275 */           long j52 = (iI0000Il00O << 32) | (iI0000Il00O2 & j3);
/* 290 */           this.I00ilI0I1.setValue(OoI0l01O.I00000oIO(O1ioliIli0o.I0000Il00O(iooO1IOlo, ioooOioll1.I00000oIO(j52, j2))));
/* 1182 */          return j52;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Iio0oiOoI0) {
/* 11 */                Iio0oiOoI0 iio0oiOoI0 = (Iio0oiOoI0) obj;
                        return this.I00iOIl == iio0oiOoI0.I00iOIl && O0000Ioio00.I0000O(this.I00iiI, iio0oiOoI0.I00iiI) && this.I00iiO == iio0oiOoI0.I00iiO && this.I00iio == iio0oiOoI0.I00iio;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 43 */            return this.I00iio.hashCode() + IIl001iO0Io.I0000O(0, IIl001iO0Io.I0000O(this.I00iiO, (IoloOio0I.I00iio.hashCode() + ((this.I00iiI.hashCode() + (Long.hashCode(this.I00iOIl) * 31)) * 31)) * 31, 31), 31);
                }

                public final String toString() {
/* 62 */            return "DropdownMenuPositionProvider(contentOffset=" + Iil1I1il0I1.I0000Il00O(this.I00iOIl) + ", density=" + this.I00iiI + ", dropdownMenuAnchorPosition=" + IoloOio0I.I00iio + ", verticalMargin=" + this.I00iiO + ", horizontalMargin=0, onPositionCalculated=" + this.I00iio + ")";
                }
            }
