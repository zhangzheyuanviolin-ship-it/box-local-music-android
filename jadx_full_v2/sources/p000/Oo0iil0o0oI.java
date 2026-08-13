            package p000;

            import android.graphics.RectF;
            import android.text.Layout;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class Oo0iil0o0oI {
                public final Oo0iiO1 I00000oIO;
                public final OI0OIIiOi I00000oOI;
                public final long I0000Il00O;
                public final float I0000O;
                public final float I0000oI00;
                public final ArrayList I0001Ioi1lo;

                public Oo0iil0o0oI(Oo0iiO1 oo0iiO1, OI0OIIiOi oI0OIIiOi, long j) {
                    float fI0000O;
/* 4 */             this.I00000oIO = oo0iiO1;
/* 6 */             this.I00000oOI = oI0OIIiOi;
/* 8 */             this.I0000Il00O = j;
/* 10 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            float fI0000O2 = 0.0f;
/* 17 */            if (arrayList.isEmpty()) {
/* 19 */                fI0000O = 0.0f;
                    } else {
/* 28 */                I0oilIol11i i0oilIol11i = ((OIoiIo0o1O) arrayList.get(0)).I00000oIO;
/* 38 */                fI0000O = i0oilIol11i.I0000Il00O.I0000O(0) + i0oilIol11i.I0001Ioi1lo;
                    }
/* 39 */            this.I0000O = fI0000O;
/* 45 */            if (!arrayList.isEmpty()) {
/* 52 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) IOOi0Ool1i.I00Io1o110i(arrayList);
/* 54 */                I0oilIol11i i0oilIol11i2 = oIoiIo0o1O.I00000oIO;
/* 71 */                fI0000O2 = i0oilIol11i2.I0000Il00O.I0000O(r6.I000II - 1) + i0oilIol11i2.I0001Ioi1lo + oIoiIo0o1O.I0001Ioi1lo;
                    }
/* 72 */            this.I0000oI00 = fI0000O2;
/* 76 */            this.I0001Ioi1lo = oI0OIIiOi.I000II;
                }

                public final Oi0il01O01IO I00000oIO(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000l1(i);
/* 14 */            int length = ((I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI).I00iiI.length();
/* 18 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 35 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i == length ? IOOi1I.I000II(arrayList) : l1i1Il1il1.I00000oIO(i, arrayList));
                    return oIoiIo0o1O.I00000oIO.I0000Il00O.I0001Ioi1lo.isRtlCharAt(oIoiIo0o1O.I0000O(i)) ? Oi0il01O01IO.I00iiI : Oi0il01O01IO.I00iOIl;
                }

                public final OOo0IO I00000oOI(int i) {
                    float fI000OiO;
                    float fI000OiO2;
                    float fI000OOo1O;
                    float fI000OOo1O2;
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000iOII(i);
/* 6 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oIO(i, arrayList));
/* 18 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 20 */            int iI0000O = oIoiIo0o1O.I0000O(i);
/* 24 */            CharSequence charSequence = i0oilIol11i.I0000O;
/* 26 */            if (iI0000O < 0 || iI0000O >= charSequence.length()) {
/* 66 */                Ioliol.I00000oIO("offset(" + iI0000O + ") is out of bounds [0," + charSequence.length() + ")");
                    }
/* 69 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 71 */            int iI000II = oo0iOioO.I000II(iI0000O);
/* 75 */            float fI000O01llI0 = oo0iOioO.I000O01llI0(iI000II);
/* 79 */            float fI0000oI00 = oo0iOioO.I0000oI00(iI000II);
/* 83 */            Layout layout = oo0iOioO.I0001Ioi1lo;
/* 95 */            boolean z = layout.getParagraphDirection(iI000II) == 1;
/* 96 */            boolean zIsRtlCharAt = layout.isRtlCharAt(iI0000O);
/* 100 */           if (!z || zIsRtlCharAt) {
/* 114 */               if (z && zIsRtlCharAt) {
/* 118 */                   fI000OOo1O = oo0iOioO.I000OiO(iI0000O, false);
/* 123 */                   fI000OOo1O2 = oo0iOioO.I000OiO(iI0000O + 1, true);
                        } else if (zIsRtlCharAt) {
/* 133 */                   fI000OOo1O = oo0iOioO.I000OOo1O(iI0000O, false);
/* 138 */                   fI000OOo1O2 = oo0iOioO.I000OOo1O(iI0000O + 1, true);
                        } else {
/* 143 */                   fI000OiO = oo0iOioO.I000OiO(iI0000O, false);
/* 148 */                   fI000OiO2 = oo0iOioO.I000OiO(iI0000O + 1, true);
                        }
/* 127 */               float f = fI000OOo1O;
/* 128 */               fI000OiO = fI000OOo1O2;
/* 129 */               fI000OiO2 = f;
                    } else {
/* 104 */               fI000OiO = oo0iOioO.I000OOo1O(iI0000O, false);
/* 109 */               fI000OiO2 = oo0iOioO.I000OOo1O(iI0000O + 1, true);
                    }
/* 154 */           RectF rectF = new RectF(fI000OiO, fI000O01llI0, fI000OiO2, fI0000oI00);
/* 159 */           float f2 = rectF.left;
/* 161 */           float f3 = rectF.top;
/* 163 */           float f4 = i0oilIol11i.I0001Ioi1lo;
/* 174 */           return oIoiIo0o1O.I00000oIO(new OOo0IO(f2, f3 + f4, rectF.right, rectF.bottom + f4));
                }

                public final OOo0IO I0000Il00O(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000l1(i);
/* 14 */            int length = ((I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI).I00iiI.length();
/* 18 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 35 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i == length ? IOOi1I.I000II(arrayList) : l1i1Il1il1.I00000oIO(i, arrayList));
/* 37 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 39 */            int iI0000O = oIoiIo0o1O.I0000O(i);
/* 43 */            CharSequence charSequence = i0oilIol11i.I0000O;
/* 45 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 47 */            if (iI0000O < 0 || iI0000O > charSequence.length()) {
/* 87 */                Ioliol.I00000oIO("offset(" + iI0000O + ") is out of bounds [0," + charSequence.length() + "]");
                    }
/* 91 */            float fI000OOo1O = oo0iOioO.I000OOo1O(iI0000O, false);
/* 95 */            int iI000II = oo0iOioO.I000II(iI0000O);
/* 118 */           return oIoiIo0o1O.I00000oIO(new OOo0IO(fI000OOo1O, oo0iOioO.I000O01llI0(iI000II) + i0oilIol11i.I0001Ioi1lo, fI000OOo1O, oo0iOioO.I0000oI00(iI000II) + i0oilIol11i.I0001Ioi1lo));
                }

                public final boolean I0000O() {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
                    return oI0OIIiOi.I0000Il00O || ((float) ((int) (this.I0000Il00O & 4294967295L))) < oI0OIIiOi.I0000oI00;
                }

                public final boolean I0000oI00() {
                    return ((float) ((int) (this.I0000Il00O >> 32))) < this.I00000oOI.I0000O || I0000O();
                }

                public final float I0001Ioi1lo(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000lI(i);
/* 6 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 18 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 22 */            int i2 = i - oIoiIo0o1O.I0000O;
/* 23 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 41 */            return oo0iOioO.I0001Ioi1lo.getLineLeft(i2) + (i2 == oo0iOioO.I000II + (-1) ? oo0iOioO.I000OiO : 0.0f);
                }

                public final float I000II(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000lI(i);
/* 6 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 18 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 22 */            int i2 = i - oIoiIo0o1O.I0000O;
/* 23 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 41 */            return oo0iOioO.I0001Ioi1lo.getLineRight(i2) + (i2 == oo0iOioO.I000II + (-1) ? oo0iOioO.I000iOII : 0.0f);
                }

                public final int I000O01llI0(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000lI(i);
/* 6 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 18 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 33 */            return i0oilIol11i.I0000Il00O.I0001Ioi1lo.getLineStart(i - oIoiIo0o1O.I0000O) + oIoiIo0o1O.I00000oOI;
                }

                public final Oi0il01O01IO I000OOo1O(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000l1(i);
/* 14 */            int length = ((I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI).I00iiI.length();
/* 18 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 35 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i == length ? IOOi1I.I000II(arrayList) : l1i1Il1il1.I00000oIO(i, arrayList));
/* 37 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 39 */            int iI0000O = oIoiIo0o1O.I0000O(i);
/* 43 */            Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
                    return oo0iOioO.I0001Ioi1lo.getParagraphDirection(oo0iOioO.I000II(iI0000O)) == 1 ? Oi0il01O01IO.I00iOIl : Oi0il01O01IO.I00iiI;
                }

                public final I0ol0lI I000OiO(int i, int i2) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 7 */             I1111OO10i i1111OO10i = (I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI;
/* 9 */             if (i < 0 || i > i2 || i2 > i1111OO10i.I00iiI.length()) {
/* 24 */                int length = i1111OO10i.I00iiI.length();
/* 34 */                StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Start(", i, ") or End(", i2, ") is out of range [0..");
/* 38 */                sbI0010I0i.append(length);
/* 43 */                sbI0010I0i.append("), or start > end!");
/* 50 */                Ioliol.I00000oIO(sbI0010I0i.toString());
                    }
/* 53 */            if (i == i2) {
/* 55 */                return I0olIlI11.I00000oIO();
                    }
/* 60 */            I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 64 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 66 */            long jI00000oIO = lOliOi0Oi.I00000oIO(i, i2);
/* 73 */            Ioo1100i ioo1100i = new Ioo1100i(3);
/* 76 */            ioo1100i.I00iiO = i0ol0lII00000oIO;
/* 78 */            ioo1100i.I00iiI = i;
/* 80 */            ioo1100i.I00iio = i2;
/* 82 */            VarHandle.storeStoreFence();
/* 85 */            l1i1Il1il1.I0000O(arrayList, jI00000oIO, ioo1100i);
/* 106 */           return i0ol0lII00000oIO;
                }

                public final long I000iOII(int i) {
                    int iI001i1lo1io;
                    int iI001IIilI0O;
                    int iI001IIilI0O2;
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000l1(i);
/* 14 */            int length = ((I1111OO10i) oI0OIIiOi.I00000oIO.I00iiI).I00iiI.length();
/* 18 */            ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 35 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i == length ? IOOi1I.I000II(arrayList) : l1i1Il1il1.I00000oIO(i, arrayList));
/* 37 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 39 */            int iI0000O = oIoiIo0o1O.I0000O(i);
/* 45 */            I1I1OO00o1o i1I1OO00o1oI000iOII = i0oilIol11i.I0000Il00O.I000iOII();
/* 58 */            if (i1I1OO00o1oI000iOII.I0010o(i1I1OO00o1oI000iOII.I001i1lo1io(iI0000O))) {
/* 60 */                i1I1OO00o1oI000iOII.I0000Il00O(iI0000O);
/* 63 */                iI001i1lo1io = iI0000O;
/* 64 */                while (iI001i1lo1io != -1 && (!i1I1OO00o1oI000iOII.I0010o(iI001i1lo1io) || i1I1OO00o1oI000iOII.I000oI1ioi(iI001i1lo1io))) {
/* 79 */                    iI001i1lo1io = i1I1OO00o1oI000iOII.I001i1lo1io(iI001i1lo1io);
                        }
                    } else {
/* 84 */                i1I1OO00o1oI000iOII.I0000Il00O(iI0000O);
/* 124 */               iI001i1lo1io = i1I1OO00o1oI000iOII.I0010I0i(iI0000O) ? (!i1I1OO00o1oI000iOII.I00100l0(iI0000O) || i1I1OO00o1oI000iOII.I000o00OoI0I(iI0000O)) ? i1I1OO00o1oI000iOII.I001i1lo1io(iI0000O) : iI0000O : i1I1OO00o1oI000iOII.I000o00OoI0I(iI0000O) ? i1I1OO00o1oI000iOII.I001i1lo1io(iI0000O) : -1;
                    }
/* 125 */           if (iI001i1lo1io == -1) {
/* 127 */               iI001i1lo1io = iI0000O;
                    }
/* 136 */           if (i1I1OO00o1oI000iOII.I000oI1ioi(i1I1OO00o1oI000iOII.I001IIilI0O(iI0000O))) {
/* 138 */               i1I1OO00o1oI000iOII.I0000Il00O(iI0000O);
/* 141 */               iI001IIilI0O = iI0000O;
/* 142 */               while (iI001IIilI0O != -1 && (i1I1OO00o1oI000iOII.I0010o(iI001IIilI0O) || !i1I1OO00o1oI000iOII.I000oI1ioi(iI001IIilI0O))) {
/* 157 */                   iI001IIilI0O = i1I1OO00o1oI000iOII.I001IIilI0O(iI001IIilI0O);
                        }
                    } else {
/* 162 */               i1I1OO00o1oI000iOII.I0000Il00O(iI0000O);
/* 169 */               if (i1I1OO00o1oI000iOII.I000o00OoI0I(iI0000O)) {
/* 175 */                   if (!i1I1OO00o1oI000iOII.I00100l0(iI0000O) || i1I1OO00o1oI000iOII.I0010I0i(iI0000O)) {
/* 186 */                       iI001IIilI0O2 = i1I1OO00o1oI000iOII.I001IIilI0O(iI0000O);
/* 190 */                       iI001IIilI0O = iI001IIilI0O2;
                            } else {
/* 184 */                       iI001IIilI0O = iI0000O;
                            }
                        } else if (i1I1OO00o1oI000iOII.I0010I0i(iI0000O)) {
/* 198 */                   iI001IIilI0O2 = i1I1OO00o1oI000iOII.I001IIilI0O(iI0000O);
/* 190 */                   iI001IIilI0O = iI001IIilI0O2;
                        } else {
/* 203 */                   iI001IIilI0O = -1;
                        }
                    }
/* 204 */           if (iI001IIilI0O != -1) {
/* 207 */               iI0000O = iI001IIilI0O;
                    }
/* 213 */           return oIoiIo0o1O.I00000oOI(lOliOi0Oi.I00000oIO(iI001i1lo1io, iI0000O), false);
                }

                public final boolean I000l1(int i) {
/* 1 */             OI0OIIiOi oI0OIIiOi = this.I00000oOI;
/* 3 */             oI0OIIiOi.I000lI(i);
/* 6 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 16 */            OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(l1i1Il1il1.I00000oOI(i, arrayList));
/* 18 */            I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 22 */            int i2 = i - oIoiIo0o1O.I0000O;
/* 25 */            Layout layout = i0oilIol11i.I0000Il00O.I0001Ioi1lo;
/* 27 */            ThreadLocal threadLocal = Oo0iliIolI.I00000oIO;
                    return layout.getEllipsisCount(i2) > 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 68 */                return true;
                    }
/* 7 */             if (obj instanceof Oo0iil0o0oI) {
/* 10 */                Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) obj;
/* 20 */                if (O0000Ioio00.I0000O(this.I00000oIO, oo0iil0o0oI.I00000oIO) && this.I00000oOI == oo0iil0o0oI.I00000oOI && IooOl0ol01.I0000Il00O(this.I0000Il00O, oo0iil0o0oI.I0000Il00O) && this.I0000O == oo0iil0o0oI.I0000O && this.I0000oI00 == oo0iil0o0oI.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, oo0iil0o0oI.I0001Ioi1lo)) {
/* 68 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 42 */            return this.I0001Ioi1lo.hashCode() + OooioIOo1.I0000O(OooioIOo1.I0000O(IIlIOloOOO.I0000O(this.I0000Il00O, (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31, 31), 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 72 */            return "TextLayoutResult(layoutInput=" + this.I00000oIO + ", multiParagraph=" + this.I00000oOI + ", size=" + IooOl0ol01.I0000O(this.I0000Il00O) + ", firstBaseline=" + this.I0000O + ", lastBaseline=" + this.I0000oI00 + ", placeholderRects=" + this.I0001Ioi1lo + ")";
                }
            }
