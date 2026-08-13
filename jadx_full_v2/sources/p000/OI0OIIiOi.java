            package p000;

            import android.text.Layout;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OI0OIIiOi {
                public final I1ii1o0 I00000oIO;
                public final int I00000oOI;
                public final boolean I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final int I0001Ioi1lo;
                public final ArrayList I000II;
                public final ArrayList I000O01llI0;

                public OI0OIIiOi(I1ii1o0 i1ii1o0, long j, int i, int i2) {
                    boolean z;
                    int iI000OOo1O;
/* 8 */             this.I00000oIO = i1ii1o0;
/* 12 */            this.I00000oOI = i;
/* 18 */            if (IOo0oO11ll1O.I000l1(j) != 0 || IOo0oO11ll1O.I000iOII(j) != 0) {
/* 29 */                Ioliol.I00000oIO("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                    }
/* 34 */            ArrayList arrayList = new ArrayList();
/* 39 */            ArrayList arrayList2 = (ArrayList) i1ii1o0.I00ilO0;
/* 41 */            int size = arrayList2.size();
/* 46 */            float f = 0.0f;
/* 47 */            int i3 = 0;
/* 48 */            int i4 = 0;
/* 49 */            while (i3 < size) {
/* 55 */                OIoiOI0OI oIoiOI0OI = (OIoiOI0OI) arrayList2.get(i3);
/* 57 */                I0ol0iioI i0ol0iioI = oIoiOI0OI.I00000oIO;
/* 59 */                int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 67 */                if (IOo0oO11ll1O.I0000oI00(j)) {
/* 80 */                    iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j) - ((int) Math.ceil(f));
/* 81 */                    if (iI000OOo1O < 0) {
/* 83 */                        iI000OOo1O = 0;
                            }
                        } else {
/* 85 */                    iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
                        }
/* 99 */                I0oilIol11i i0oilIol11iI00000oIO = l1oI100ii.I00000oIO(i0ol0iioI, IOo0olo.I00000oOI(0, iI000OiO, 0, iI000OOo1O, 5), this.I00000oOI - i4, i2);
/* 103 */               Oo0iOioO oo0iOioO = i0oilIol11iI00000oIO.I0000Il00O;
/* 107 */               float f2 = i0oilIol11iI00000oIO.I0000oI00 + f;
/* 110 */               int i5 = oo0iOioO.I000II + i4;
/* 113 */               int i6 = oIoiOI0OI.I00000oOI;
/* 115 */               int i7 = oIoiOI0OI.I0000Il00O;
/* 117 */               OIoiIo0o1O oIoiIo0o1O = new OIoiIo0o1O();
/* 120 */               oIoiIo0o1O.I00000oIO = i0oilIol11iI00000oIO;
/* 122 */               oIoiIo0o1O.I00000oOI = i6;
/* 124 */               oIoiIo0o1O.I0000Il00O = i7;
/* 126 */               oIoiIo0o1O.I0000O = i4;
/* 128 */               oIoiIo0o1O.I0000oI00 = i5;
/* 130 */               oIoiIo0o1O.I0001Ioi1lo = f;
/* 132 */               oIoiIo0o1O.I000II = f2;
/* 134 */               VarHandle.storeStoreFence();
/* 137 */               arrayList.add(oIoiIo0o1O);
/* 142 */               if (oo0iOioO.I0000O || (i5 == this.I00000oOI && i3 != IOOi1I.I000II((ArrayList) this.I00000oIO.I00ilO0))) {
/* 166 */                   z = true;
/* 167 */                   f = f2;
/* 168 */                   i4 = i5;
                            break;
                        } else {
/* 161 */                   i3++;
/* 163 */                   f = f2;
/* 164 */                   i4 = i5;
                        }
                    }
/* 170 */           z = false;
/* 171 */           this.I0000oI00 = f;
/* 173 */           this.I0001Ioi1lo = i4;
/* 175 */           this.I0000Il00O = z;
/* 177 */           this.I000O01llI0 = arrayList;
/* 184 */           this.I0000O = IOo0oO11ll1O.I000OiO(j);
/* 192 */           ArrayList arrayList3 = new ArrayList(arrayList.size());
/* 195 */           int size2 = arrayList.size();
/* 201 */           for (int i8 = 0; i8 < size2; i8++) {
/* 207 */               OIoiIo0o1O oIoiIo0o1O2 = (OIoiIo0o1O) arrayList.get(i8);
/* 211 */               List list = oIoiIo0o1O2.I00000oIO.I000II;
/* 219 */               ArrayList arrayList4 = new ArrayList(list.size());
/* 225 */               int size3 = list.size();
/* 230 */               for (int i9 = 0; i9 < size3; i9++) {
/* 236 */                   OOo0IO oOo0IO = (OOo0IO) list.get(i9);
/* 246 */                   arrayList4.add(oOo0IO != null ? oIoiIo0o1O2.I00000oIO(oOo0IO) : null);
                        }
/* 252 */               IOOii0O10Io0.I00100l0(arrayList3, arrayList4);
                    }
/* 272 */           if (arrayList3.size() < ((List) this.I00000oIO.I00iiO).size()) {
/* 288 */               int size4 = ((List) this.I00000oIO.I00iiO).size() - arrayList3.size();
/* 291 */               ArrayList arrayList5 = new ArrayList(size4);
/* 294 */               for (int i10 = 0; i10 < size4; i10++) {
/* 296 */                   arrayList5.add(null);
                        }
/* 302 */               arrayList3 = IOOi0Ool1i.I00O10llo(arrayList3, arrayList5);
                    }
/* 306 */           this.I000II = arrayList3;
                }

                public static void I000OiO(OI0OIIiOi oI0OIIiOi, IIolOo iIolOo, long j, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = IOOiio0i.I000o00OoI0I;
                    }
/* 33 */            oI0OIIiOi.I000OOo1O(iIolOo, j, (i & 4) != 0 ? null : oioOII0oI, (i & 8) != 0 ? null : olooIOI0O, (i & 16) != 0 ? null : iilloo0IOoIo, 3);
                }

                public final void I00000oIO(long j, float[] fArr) {
/* 5 */             I000iOII(Oo0lI00l.I000II(j));
/* 12 */            I000l1(Oo0lI00l.I0001Ioi1lo(j));
/* 17 */            OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 21 */            oOo0ll111.I00iOIl = 0;
/* 25 */            OOo0lO oOo0lO = new OOo0lO();
/* 31 */            II1I00o001 iI1I00o001 = new II1I00o001(1);
/* 34 */            iI1I00o001.I00iiI = j;
/* 36 */            iI1I00o001.I00iiO = fArr;
/* 38 */            iI1I00o001.I00iio = oOo0ll111;
/* 40 */            iI1I00o001.I00ilI0I1 = oOo0lO;
/* 42 */            VarHandle.storeStoreFence();
/* 47 */            l1i1Il1il1.I0000O(this.I000O01llI0, j, iI1I00o001);
                }

                public final float I00000oOI(int i) {
/* 1 */             I000lI(i);
/* 4 */             ArrayList arrayList = this.I000O01llI0;
/* 14 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 16 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 38 */            return (i0oilIol11i.I00000oOI() ? i0oilIol11i.I0000oI00 : i0oilIol11i.I0000Il00O.I0000oI00(i - oIoiIo0o1O.I0000O)) + oIoiIo0o1O.I0001Ioi1lo;
                }

                public final int I0000Il00O(int i, boolean z) {
                    int iI0001Ioi1lo;
/* 1 */             I000lI(i);
/* 4 */             ArrayList arrayList = this.I000O01llI0;
/* 14 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 16 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 20 */            int i2 = i - oIoiIo0o1O.I0000O;
/* 21 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 23 */            if (z) {
/* 25 */                Layout layout = oo0iOioO.I0001Ioi1lo;
/* 27 */                ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
/* 33 */                if (layout.getEllipsisCount(i2) <= 0 || oo0iOioO.I00000oOI != TextUtils.TruncateAt.END) {
/* 51 */                    I1ii1o0 i1ii1o0I0000Il00O = oo0iOioO.I0000Il00O();
/* 57 */                    Layout layout2 = (Layout) i1ii1o0I0000Il00O.I00iiI;
/* 67 */                    iI0001Ioi1lo = i1ii1o0I0000Il00O.I00IlilI0i0i(layout2.getLineEnd(i2), layout2.getLineStart(i2));
                        } else {
/* 49 */                    iI0001Ioi1lo = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
                        }
                    } else {
/* 72 */                iI0001Ioi1lo = oo0iOioO.I0001Ioi1lo(i2);
                    }
/* 78 */            return iI0001Ioi1lo + oIoiIo0o1O.I00000oOI;
                }

                public final int I0000O(int i) {
/* 9 */             int length = ((I1111OO10i) this.I00000oIO.I00iiI).I00iiI.length();
/* 13 */            ArrayList arrayList = this.I000O01llI0;
/* 34 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i >= length ? IOOi1I.I000II(arrayList) : i < 0 ? 0 : l1i1Il1il1.I00000oIO(i, arrayList));
/* 50 */            return oIoiIo0o1O.I00000oIO.I0000Il00O.I000II(oIoiIo0o1O.I0000O(i)) + oIoiIo0o1O.I0000O;
                }

                public final int I0000oI00(float f) {
                    int lineForVertical;
/* 1 */             ArrayList arrayList = this.I000O01llI0;
/* 11 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I0000Il00O(arrayList, f));
/* 17 */            int i = oIoiIo0o1O.I0000Il00O - oIoiIo0o1O.I00000oOI;
/* 18 */            int i2 = oIoiIo0o1O.I0000O;
/* 20 */            if (i == 0) {
/* 22 */                return i2;
                    }
/* 23 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 27 */            float f2 = f - oIoiIo0o1O.I0001Ioi1lo;
/* 28 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 33 */            int i3 = (int) (f2 - i0oilIol11i.I0001Ioi1lo);
/* 34 */            int i4 = oo0iOioO.I000II;
/* 36 */            if (i4 <= 0) {
/* 38 */                lineForVertical = 0;
                    } else {
/* 45 */                lineForVertical = oo0iOioO.I0001Ioi1lo.getLineForVertical(i3 - oo0iOioO.I000O01llI0);
                        int i5 = i4 - 1;
/* 51 */                if (lineForVertical > i5) {
/* 53 */                    lineForVertical = i5;
                        }
                    }
/* 54 */            return lineForVertical + i2;
                }

                public final float I0001Ioi1lo(int i) {
/* 1 */             I000lI(i);
/* 4 */             ArrayList arrayList = this.I000O01llI0;
/* 14 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 16 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 37 */            return (i0oilIol11i.I00000oOI() ? 0.0f : i0oilIol11i.I0000Il00O.I000O01llI0(i - oIoiIo0o1O.I0000O)) + oIoiIo0o1O.I0001Ioi1lo;
                }

                public final int I000II(long j) {
                    int offsetForHorizontal;
/* 8 */             int i = (int) (j & 4294967295L);
/* 9 */             float fIntBitsToFloat = Float.intBitsToFloat(i);
/* 13 */            ArrayList arrayList = this.I000O01llI0;
/* 23 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I0000Il00O(arrayList, fIntBitsToFloat));
/* 25 */            int i2 = oIoiIo0o1O.I0000Il00O;
/* 27 */            int i3 = oIoiIo0o1O.I00000oOI;
/* 30 */            if (i2 - i3 == 0) {
/* 32 */                return i3;
                    }
/* 33 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 39 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
/* 49 */            float fIntBitsToFloat3 = Float.intBitsToFloat(i) - oIoiIo0o1O.I0001Ioi1lo;
/* 62 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
/* 63 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 74 */            int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - i0oilIol11i.I0001Ioi1lo);
/* 75 */            Layout layout = oo0iOioO.I0001Ioi1lo;
/* 80 */            int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - oo0iOioO.I000O01llI0);
/* 86 */            if (lineForVertical >= oo0iOioO.I000II) {
/* 92 */                offsetForHorizontal = layout.getText().length();
                    } else {
/* 111 */               offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (oo0iOioO.I00000oOI(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                    }
/* 115 */           return offsetForHorizontal + i3;
                }

                public final long I000O01llI0(OOo0IO oOo0IO, int i, OIiilo1Ool0o oIiilo1Ool0o) {
                    long jI00000oOI;
                    long j;
/* 1 */             float f = oOo0IO.I00000oOI;
/* 3 */             ArrayList arrayList = this.I000O01llI0;
/* 5 */             int iI0000Il00O = l1i1Il1il1.I0000Il00O(arrayList, f);
/* 15 */            float f2 = ((OIoiIo0o1O) arrayList.get(iI0000Il00O)).I000II;
/* 17 */            float f3 = oOo0IO.I0000O;
/* 22 */            if (f2 >= f3 || iI0000Il00O == IOOi1I.I000II(arrayList)) {
/* 138 */               OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(iI0000Il00O);
/* 150 */               return oIoiIo0o1O.I00000oOI(oIoiIo0o1O.I00000oIO.I0000O(oIoiIo0o1O.I0000Il00O(oOo0IO), i, oIiilo1Ool0o), true);
                    }
/* 31 */            int iI0000Il00O2 = l1i1Il1il1.I0000Il00O(arrayList, f3);
/* 35 */            long jI00000oOI2 = Oo0lI00l.I00000oOI;
                    while (true) {
/* 37 */                jI00000oOI = Oo0lI00l.I00000oOI;
/* 43 */                if (!Oo0lI00l.I0000Il00O(jI00000oOI2, jI00000oOI) || iI0000Il00O > iI0000Il00O2) {
                            break;
                        }
/* 51 */                OIoiIo0o1O oIoiIo0o1O2 = (OIoiIo0o1O) arrayList.get(iI0000Il00O);
/* 63 */                jI00000oOI2 = oIoiIo0o1O2.I00000oOI(oIoiIo0o1O2.I00000oIO.I0000O(oIoiIo0o1O2.I0000Il00O(oOo0IO), i, oIiilo1Ool0o), true);
/* 67 */                iI0000Il00O++;
                    }
/* 74 */            if (Oo0lI00l.I0000Il00O(jI00000oOI2, jI00000oOI)) {
/* 76 */                return jI00000oOI;
                    }
                    while (true) {
/* 77 */                j = Oo0lI00l.I00000oOI;
/* 83 */                if (!Oo0lI00l.I0000Il00O(jI00000oOI, j) || iI0000Il00O > iI0000Il00O2) {
                            break;
                        }
/* 91 */                OIoiIo0o1O oIoiIo0o1O3 = (OIoiIo0o1O) arrayList.get(iI0000Il00O2);
/* 103 */               jI00000oOI = oIoiIo0o1O3.I00000oOI(oIoiIo0o1O3.I00000oIO.I0000O(oIoiIo0o1O3.I0000Il00O(oOo0IO), i, oIiilo1Ool0o), true);
                        iI0000Il00O2--;
                    }
                    return Oo0lI00l.I0000Il00O(jI00000oOI, j) ? jI00000oOI2 : lOliOi0Oi.I00000oIO((int) (jI00000oOI2 >> 32), (int) (4294967295L & jI00000oOI));
                }

                public final void I000OOo1O(IIolOo iIolOo, long j, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 1 */             iIolOo.I000II();
/* 4 */             ArrayList arrayList = this.I000O01llI0;
/* 6 */             int size = arrayList.size();
/* 11 */            for (int i2 = 0; i2 < size; i2++) {
/* 17 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i2);
/* 30 */                oIoiIo0o1O.I00000oIO.I000II(iIolOo, j, oioOII0oI, olooIOI0O, iilloo0IOoIo, i);
/* 38 */                iIolOo.I000o00OoI0I(0.0f, oIoiIo0o1O.I00000oIO.I0000oI00);
                    }
/* 44 */            iIolOo.I00100l0();
                }

                public final void I000iOII(int i) {
/* 5 */             I1111OO10i i1111OO10i = (I1111OO10i) this.I00000oIO.I00iiI;
/* 7 */             if (i < 0 || i >= i1111OO10i.I00iiI.length()) {
/* 51 */                Ioliol.I00000oIO("offset(" + i + ") is out of bounds [0, " + i1111OO10i.I00iiI.length() + ")");
                    }
                }

                public final void I000l1(int i) {
/* 5 */             I1111OO10i i1111OO10i = (I1111OO10i) this.I00000oIO.I00iiI;
/* 7 */             if (i < 0 || i > i1111OO10i.I00iiI.length()) {
/* 51 */                Ioliol.I00000oIO("offset(" + i + ") is out of bounds [0, " + i1111OO10i.I00iiI.length() + "]");
                    }
                }

                public final void I000lI(int i) {
/* 1 */             boolean z = false;
/* 2 */             int i2 = this.I0001Ioi1lo;
/* 4 */             if (i >= 0 && i < i2) {
/* 8 */                 z = true;
                    }
/* 9 */             if (z) {
/* 77 */                return;
                    }
/* 38 */            Ioliol.I00000oIO("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
                }
            }
