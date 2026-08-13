            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            
/* 52 */    public final class IO110I implements CharSequence, Appendable {
                public OIOiIOO0l0O I00iOIl;
                public ArrayList I00iiI;
                public char[] I00iiO;
                public String I00iio;
                public boolean I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;

                public final char[] I00000oIO(int i) {
/* 1 */             ArrayList arrayList = this.I00iiI;
/* 3 */             if (arrayList != null) {
/* 31 */                return (char[]) arrayList.get(i / this.I00iiO.length);
                    }
/* 8 */             if (i >= 2048) {
/* 19 */                I0000O(i);
/* 22 */                throw null;
                    }
/* 10 */            char[] cArr = this.I00iiO;
/* 12 */            if (cArr != null) {
/* 14 */                return cArr;
                    }
/* 15 */            I0000O(i);
/* 18 */            throw null;
                }

                public final CharSequence I00000oOI(int i, int i2) {
/* 1 */             if (i == i2) {
/* 3 */                 return "";
                    }
/* 10 */            StringBuilder sb = new StringBuilder(i2 - i);
/* 17 */            for (int i3 = i - (i % Barcode.FORMAT_PDF417); i3 < i2; i3 += Barcode.FORMAT_PDF417) {
/* 19 */                char[] cArrI00000oIO = I00000oIO(i3);
/* 34 */                int iMin = Math.min(i2 - i3, Barcode.FORMAT_PDF417);
/* 38 */                for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
/* 42 */                    sb.append(cArrI00000oIO[iMax]);
                        }
                    }
/* 89 */            return sb;
                }

                public final char[] I0000Il00O() {
/* 3 */             if (this.I00ilO0 != 0) {
/* 43 */                return this.I00iiO;
                    }
/* 11 */            char[] cArr = (char[]) this.I00iOIl.I001lllioOl();
/* 13 */            char[] cArr2 = this.I00iiO;
/* 15 */            this.I00iiO = cArr;
/* 18 */            this.I00ilO0 = cArr.length;
/* 21 */            this.I00ilI0I1 = false;
/* 23 */            if (cArr2 != null) {
/* 25 */                ArrayList arrayList = this.I00iiI;
/* 27 */                if (arrayList == null) {
/* 31 */                    arrayList = new ArrayList();
/* 34 */                    this.I00iiI = arrayList;
/* 36 */                    arrayList.add(cArr2);
                        }
/* 39 */                arrayList.add(cArr);
                    }
/* 42 */            return cArr;
                }

                public final void I0000O(int i) {
/* 3 */             if (this.I00ilI0I1) {
/* 12 */                throw new IllegalStateException("Buffer is already released");
                    }
/* 49 */            throw new IndexOutOfBoundsException(i + " is not in range [0; " + (this.I00iiO.length - this.I00ilO0) + ')');
                }

                @Override
                public final Appendable append(CharSequence charSequence, int i, int i2) {
/* 1 */             if (charSequence == null) {
/* 3 */                 return this;
                    }
/* 4 */             int i3 = i;
/* 5 */             while (i3 < i2) {
/* 7 */                 char[] cArrI0000Il00O = I0000Il00O();
/* 11 */                int length = cArrI0000Il00O.length;
/* 12 */                int i4 = this.I00ilO0;
/* 14 */                int i5 = length - i4;
/* 17 */                int iMin = Math.min(i2 - i3, i4);
/* 22 */                for (int i6 = 0; i6 < iMin; i6++) {
/* 32 */                    cArrI0000Il00O[i5 + i6] = charSequence.charAt(i3 + i6);
                        }
/* 37 */                i3 += iMin;
                        this.I00ilO0 -= iMin;
                    }
/* 45 */            this.I00iio = null;
/* 51 */            this.I00io1l = (i2 - i) + this.I00io1l;
/* 215 */           return this;
                }

                @Override
                public final char charAt(int i) {
/* 2 */             if (i < 0) {
/* 45 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "index is negative: "));
/* 1 */                 return (char) 0;
                    }
/* 6 */             if (i < this.I00io1l) {
/* 16 */                return I00000oIO(i)[i % this.I00iiO.length];
                    }
/* 35 */            I000II.I0010I0i(Oi010OO0.I001i1lo1io(IlIi0I0.I00100o1O0lo("index ", i, " is not in range [0, "), this.I00io1l, ')'));
/* 1 */             return (char) 0;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof CharSequence) {
/* 9 */                 CharSequence charSequence = (CharSequence) obj;
/* 15 */                if (this.I00io1l == charSequence.length()) {
/* 18 */                    int i = this.I00io1l;
/* 21 */                    for (int i2 = 0; i2 < i; i2++) {
/* 38 */                        if (I00000oIO(i2)[i2 % this.I00iiO.length] != charSequence.charAt(i2)) {
/* 3 */                             return false;
                                }
                            }
/* 44 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00iio;
/* 3 */             if (str != null) {
/* 5 */                 return str.hashCode();
                    }
/* 10 */            int i = this.I00io1l;
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < i; i3++) {
/* 29 */                i2 = (i2 * 31) + I00000oIO(i3)[i3 % this.I00iiO.length];
                    }
/* 113 */           return i2;
                }

                @Override
                public final int length() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final CharSequence subSequence(int i, int i2) {
/* 3 */             if (i > i2) {
/* 89 */                throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
                    }
/* 6 */             if (i < 0) {
/* 42 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "startIndex is negative: "));
/* 5 */                 return null;
                    }
/* 10 */            if (i2 <= this.I00io1l) {
/* 14 */                return new IO10oOlIiO(this, i, i2);
                    }
/* 32 */            I000II.I0010I0i(Oi010OO0.I001i1lo1io(IlIi0I0.I00100o1O0lo("endIndex (", i2, ") is greater than length ("), this.I00io1l, ')'));
/* 5 */             return null;
                }

                @Override
                public final String toString() {
/* 1 */             String str = this.I00iio;
/* 3 */             if (str != null) {
/* 29 */                return str;
                    }
/* 12 */            String string = I00000oOI(0, this.I00io1l).toString();
/* 16 */            this.I00iio = string;
/* 29 */            return string;
                }

                @Override
/* 53 */        public final Appendable append(char c) {
/* 54 */            char[] cArrI0000Il00O = I0000Il00O();
                    int length = this.I00iiO.length;
                    int i = this.I00ilO0;
                    cArrI0000Il00O[length - i] = c;
/* 55 */            this.I00iio = null;
/* 56 */            this.I00ilO0 = i - 1;
                    this.I00io1l++;
                    return this;
                }

                @Override
/* 58 */        public final Appendable append(CharSequence charSequence) {
                    if (charSequence == null) {
                        return this;
                    }
/* 59 */            append(charSequence, 0, charSequence.length());
                    return this;
                }
            }
