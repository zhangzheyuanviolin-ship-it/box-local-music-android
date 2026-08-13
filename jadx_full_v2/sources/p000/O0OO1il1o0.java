            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class O0OO1il1o0 implements Iio1i00IOI {
                public O0OO1iIo I00000oIO;

                @Override
                public final OIi0ooo0l1 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
                    int[] iArr;
                    Object[] objArr;
                    int[] iArr2;
                    Object[] objArr2;
                    int i;
/* 5 */             O0OO1iIo o0OO1iIo = this.I00000oIO;
/* 7 */             OI0l1oli1I oI0l1oli1I = o0OO1iIo.I00000oOI;
/* 13 */            OI0l1iiooO oI0l1iiooO = new OI0l1iiooO(oI0l1oli1I.I0000oI00 + 2);
/* 20 */            OI0l1oli1I oI0l1oli1I2 = new OI0l1oli1I(oI0l1oli1I.I0000oI00);
/* 23 */            int[] iArr3 = oI0l1oli1I.I00000oOI;
/* 25 */            Object[] objArr3 = oI0l1oli1I.I0000Il00O;
/* 27 */            long[] jArr = oI0l1oli1I.I00000oIO;
                    int length = jArr.length - 2;
/* 32 */            if (length >= 0) {
/* 34 */                int i2 = 0;
                        while (true) {
/* 35 */                    long j = jArr[i2];
/* 49 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 56 */                        int i3 = 8;
/* 58 */                        int i4 = 8 - ((~(i2 - length)) >>> 31);
/* 60 */                        int i5 = 0;
/* 61 */                        while (i5 < i4) {
/* 70 */                            if ((255 & j) < 128) {
/* 74 */                                int i6 = (i2 << 3) + i5;
/* 75 */                                int i7 = iArr3[i6];
/* 79 */                                O0OO0OlO o0OO0OlO = (O0OO0OlO) objArr3[i6];
/* 81 */                                oI0l1iiooO.I00000oIO(i7);
/* 84 */                                i = i3;
/* 88 */                                iArr2 = iArr3;
/* 90 */                                objArr2 = objArr3;
/* 102 */                               I110ooool i110ooool = (I110ooool) ooIoOiiO1.I00000oIO.invoke(o0OO0OlO.I00000oIO);
/* 104 */                               IioIllI11l0I iioIllI11l0I = o0OO0OlO.I00000oOI;
/* 106 */                               OooI1i111oO oooI1i111oO = new OooI1i111oO();
/* 109 */                               oooI1i111oO.I00000oIO = i110ooool;
/* 111 */                               oooI1i111oO.I00000oOI = iioIllI11l0I;
/* 113 */                               VarHandle.storeStoreFence();
/* 116 */                               oI0l1oli1I2.I000OOo1O(i7, oooI1i111oO);
                                    } else {
/* 120 */                               iArr2 = iArr3;
/* 122 */                               objArr2 = objArr3;
/* 124 */                               i = i3;
                                    }
/* 126 */                           j >>= i;
/* 128 */                           i5++;
/* 130 */                           i3 = i;
/* 132 */                           iArr3 = iArr2;
/* 134 */                           objArr3 = objArr2;
                                }
/* 137 */                       iArr = iArr3;
/* 139 */                       objArr = objArr3;
/* 142 */                       if (i4 != i3) {
                                    break;
                                }
                            } else {
/* 147 */                       iArr = iArr3;
/* 149 */                       objArr = objArr3;
                            }
/* 151 */                   if (i2 == length) {
                                break;
                            }
/* 153 */                   i2++;
/* 155 */                   iArr3 = iArr;
/* 157 */                   objArr3 = objArr;
                        }
                    }
/* 164 */           if (!oI0l1oli1I.I00000oIO(0)) {
/* 166 */               int i8 = oI0l1iiooO.I00000oOI;
/* 168 */               if (i8 < 0) {
/* 194 */                   lO00l0o.I00000oOI("Index must be between 0 and size");
/* 198 */                   throw null;
                        }
/* 172 */               oI0l1iiooO.I00000oOI(i8 + 1);
/* 175 */               int[] iArr4 = oI0l1iiooO.I00000oIO;
/* 177 */               int i9 = oI0l1iiooO.I00000oOI;
/* 179 */               if (i9 != 0) {
/* 181 */                   I1IoiO1l.I000O01llI0(1, 0, i9, iArr4, iArr4);
                        }
/* 184 */               iArr4[0] = 0;
                        oI0l1iiooO.I00000oOI++;
                    }
/* 205 */           if (!oI0l1oli1I.I00000oIO(o0OO1iIo.I00000oIO)) {
/* 209 */               oI0l1iiooO.I00000oIO(o0OO1iIo.I00000oIO);
                    }
/* 212 */           int i10 = oI0l1iiooO.I00000oOI;
/* 214 */           if (i10 != 0) {
/* 220 */               Arrays.sort(oI0l1iiooO.I00000oIO, 0, i10);
                    }
/* 225 */           int i11 = o0OO1iIo.I00000oIO;
/* 227 */           IioIoO10iOiI iioIoO10iOiI = IioO00o.I0000O;
/* 229 */           OIi0ooo0l1 oIi0ooo0l1 = new OIi0ooo0l1();
/* 232 */           oIi0ooo0l1.I00iiO = oI0l1iiooO;
/* 234 */           oIi0ooo0l1.I00iio = oI0l1oli1I2;
/* 236 */           oIi0ooo0l1.I00iOIl = i11;
/* 238 */           oIi0ooo0l1.I00ilI0I1 = iioIoO10iOiI;
/* 242 */           oIi0ooo0l1.I00iiI = Ooo1lo1l.I00000oIO;
/* 244 */           float[] fArr = Ooo1lo1l.I00000oOI;
/* 246 */           oIi0ooo0l1.I00ilO0 = fArr;
/* 248 */           oIi0ooo0l1.I00li1OI = fArr;
/* 250 */           oIi0ooo0l1.I00ll1 = fArr;
/* 254 */           oIi0ooo0l1.I00lli11 = Ooo1lo1l.I0000Il00O;
/* 256 */           VarHandle.storeStoreFence();
/* 437 */           return oIi0ooo0l1;
                }
            }
