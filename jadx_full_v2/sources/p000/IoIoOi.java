            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class IoIoOi {
                public IO110I I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public Io1OIIl0Oi0 I0000O;

                public final IO10oOlIiO I00000oIO(String str) {
/* 3 */             if (this.I00000oOI == 0) {
/* 72 */                return null;
                    }
/* 6 */             int i = IO1I1oO10O11.I00000oIO;
/* 17 */            int iAbs = Math.abs(IO1I1oO10O11.I00000oIO(str, 0, str.length()));
/* 21 */            int i2 = this.I0000Il00O;
                    while (true) {
/* 23 */                int i3 = iAbs % i2;
/* 26 */                int i4 = i3 * 6;
/* 33 */                if (this.I0000O.I00000oIO(i4) == -1) {
/* 72 */                    return null;
                        }
/* 39 */                if (I00000oOI(i4, str)) {
/* 63 */                    return (IO10oOlIiO) this.I00000oIO.subSequence(this.I0000O.I00000oIO(i4 + 3), this.I0000O.I00000oIO(i4 + 4));
                        }
/* 66 */                iAbs = i3 + 1;
/* 68 */                i2 = this.I0000Il00O;
                    }
                }

                public final boolean I00000oOI(int i, CharSequence charSequence) {
/* 5 */             int iI00000oIO = this.I0000O.I00000oIO(i + 1);
/* 13 */            int iI00000oIO2 = this.I0000O.I00000oIO(i + 2);
/* 17 */            IO110I io110i = this.I00000oIO;
/* 19 */            int i2 = IO1I1oO10O11.I00000oIO;
/* 27 */            if (iI00000oIO2 - iI00000oIO != charSequence.length()) {
/* 61 */                return false;
                    }
/* 31 */            for (int i3 = iI00000oIO; i3 < iI00000oIO2; i3++) {
/* 33 */                int iCharAt = io110i.charAt(i3);
/* 41 */                if (65 <= iCharAt && iCharAt < 91) {
/* 45 */                    iCharAt += 32;
                        }
/* 49 */                int iCharAt2 = charSequence.charAt(i3 - iI00000oIO);
/* 53 */                if (65 <= iCharAt2 && iCharAt2 < 91) {
/* 57 */                    iCharAt2 += 32;
                        }
/* 59 */                if (iCharAt != iCharAt2) {
/* 61 */                    return false;
                        }
                    }
/* 66 */            return true;
                }

                public final void I0000Il00O(int i, int i2, int i3, int i4) {
                    int i5;
/* 1 */             IO110I io110i = this.I00000oIO;
/* 3 */             int i6 = this.I00000oOI;
                    double d = i6;
/* 6 */             int i7 = this.I0000Il00O;
/* 14 */            if (d >= i7 * 0.75d) {
/* 16 */                Io1OIIl0Oi0 io1OIIl0Oi0 = this.I0000O;
/* 19 */                this.I00000oOI = 0;
/* 25 */                this.I0000Il00O = (i7 * 2) | Barcode.FORMAT_ITF;
/* 33 */                Io1OIIl0Oi0 io1OIIl0Oi02 = (Io1OIIl0Oi0) IoIoiloi.I00000oOI.I001lllioOl();
/* 43 */                int size = (io1OIIl0Oi0.I00000oIO.size() * 2) | 1;
/* 45 */                for (int i8 = 0; i8 < size; i8++) {
/* 55 */                    io1OIIl0Oi02.I00000oIO.add(IoIoiloi.I00000oIO.I001lllioOl());
                        }
/* 61 */                this.I0000O = io1OIIl0Oi02;
/* 77 */                OilO111 oilO111I00000oIO = OilOIIlI.I00000oIO((IlliIl1l11O) OilOIIlI.I00000oOI(new Io1O0li00i(io1OIIl0Oi0, null)).I00000oOI);
/* 85 */                while (oilO111I00000oIO.hasNext()) {
/* 93 */                    int iIntValue = ((Number) oilO111I00000oIO.next()).intValue();
/* 121 */                   I0000Il00O(io1OIIl0Oi0.I00000oIO(iIntValue + 1), io1OIIl0Oi0.I00000oIO(iIntValue + 2), io1OIIl0Oi0.I00000oIO(iIntValue + 3), io1OIIl0Oi0.I00000oIO(iIntValue + 4));
                        }
/* 127 */               IoIoiloi.I00000oOI.I00o101lO(io1OIIl0Oi0);
/* 132 */               if (i6 != this.I00000oOI) {
/* 137 */                   I000II.I000iOII("Failed requirement.");
/* 140 */                   return;
                        }
                    }
/* 145 */           int iAbs = Math.abs(IO1I1oO10O11.I00000oIO(io110i, i, i2));
/* 149 */           CharSequence charSequenceSubSequence = io110i.subSequence(i, i2);
/* 155 */           int i9 = iAbs % this.I0000Il00O;
/* 158 */           int i10 = -1;
                    while (true) {
/* 161 */               i5 = i9 * 6;
/* 167 */               if (this.I0000O.I00000oIO(i5) == -1) {
                            break;
                        }
/* 173 */               if (I00000oOI(i5, charSequenceSubSequence)) {
/* 175 */                   i10 = i9;
                        }
/* 180 */               i9 = (i9 + 1) % this.I0000Il00O;
                    }
/* 184 */           this.I0000O.I00000oOI(i5, iAbs);
/* 191 */           this.I0000O.I00000oOI(i5 + 1, i);
/* 198 */           this.I0000O.I00000oOI(i5 + 2, i2);
/* 205 */           this.I0000O.I00000oOI(i5 + 3, i3);
/* 212 */           this.I0000O.I00000oOI(i5 + 4, i4);
/* 219 */           this.I0000O.I00000oOI(i5 + 5, -1);
/* 222 */           if (i10 != -1) {
/* 230 */               this.I0000O.I00000oOI((i10 * 6) + 5, i9);
                    }
                    this.I00000oOI++;
                }

                public final void I0000O() {
/* 2 */             this.I00000oOI = 0;
/* 4 */             this.I0000Il00O = 0;
/* 6 */             IoIoi0oIIOi1 ioIoi0oIIOi1 = IoIoiloi.I00000oOI;
/* 10 */            ioIoi0oIIOi1.I00o101lO(this.I0000O);
/* 19 */            this.I0000O = (Io1OIIl0Oi0) ioIoi0oIIOi1.I001lllioOl();
                }

                public final String toString() {
/* 1 */             IO110I io110i = this.I00000oIO;
/* 5 */             StringBuilder sb = new StringBuilder();
/* 8 */             IoIoiIll ioIoiIll = IoIoiloi.I00000oIO;
/* 10 */            Io1OIIl0Oi0 io1OIIl0Oi0 = this.I0000O;
/* 12 */            io1OIIl0Oi0.getClass();
/* 29 */            OilO111 oilO111I00000oIO = OilOIIlI.I00000oIO((IlliIl1l11O) OilOIIlI.I00000oOI(new Io1O0li00i(io1OIIl0Oi0, null)).I00000oOI);
/* 37 */            while (oilO111I00000oIO.hasNext()) {
/* 45 */                int iIntValue = ((Number) oilO111I00000oIO.next()).intValue();
/* 51 */                sb.append((CharSequence) "");
/* 74 */                sb.append(io110i.subSequence(this.I0000O.I00000oIO(iIntValue + 1), this.I0000O.I00000oIO(iIntValue + 2)));
/* 79 */                sb.append((CharSequence) " => ");
/* 104 */               sb.append(io110i.subSequence(this.I0000O.I00000oIO(iIntValue + 3), this.I0000O.I00000oIO(iIntValue + 4)));
/* 109 */               sb.append((CharSequence) "\n");
                    }
/* 113 */           return sb.toString();
                }
            }
