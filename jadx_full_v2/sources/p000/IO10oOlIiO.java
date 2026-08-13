            package p000;
            
            public final class IO10oOlIiO implements CharSequence {
                public final int I00iOIl;
                public final int I00iiI;
                public String I00iiO;
                public final IO110I I00iio;

                public IO10oOlIiO(IO110I io110i, int i, int i2) {
/* 4 */             this.I00iio = io110i;
/* 6 */             this.I00iOIl = i;
/* 8 */             this.I00iiI = i2;
                }

                @Override
                public final char charAt(int i) {
/* 3 */             int i2 = this.I00iOIl + i;
/* 4 */             if (i < 0) {
/* 63 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "index is negative: "));
/* 66 */                return (char) 0;
                    }
/* 8 */             if (i2 < this.I00iiI) {
/* 10 */                IO110I io110i = this.I00iio;
/* 20 */                return io110i.I00000oIO(i2)[i2 % io110i.I00iiO.length];
                    }
/* 27 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("index (", i, ") should be less than length (");
/* 35 */            sbI00100o1O0lo.append(length());
/* 40 */            sbI00100o1O0lo.append(')');
/* 56 */            throw new IllegalArgumentException(sbI00100o1O0lo.toString().toString());
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof CharSequence) {
/* 7 */                 CharSequence charSequence = (CharSequence) obj;
/* 17 */                if (charSequence.length() == length()) {
/* 20 */                    int length = length();
/* 25 */                    for (int i = 0; i < length; i++) {
/* 29 */                        int i2 = this.I00iOIl + i;
/* 30 */                        IO110I io110i = this.I00iio;
/* 46 */                        if (io110i.I00000oIO(i2)[i2 % io110i.I00iiO.length] != charSequence.charAt(i)) {
/* 3 */                             return false;
                                }
                            }
/* 52 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00iiO;
/* 3 */             if (str != null) {
/* 5 */                 return str.hashCode();
                    }
/* 12 */            int i = 0;
/* 15 */            for (int i2 = this.I00iOIl; i2 < this.I00iiI; i2++) {
/* 19 */                IO110I io110i = this.I00iio;
/* 32 */                i = (i * 31) + io110i.I00000oIO(i2)[i2 % io110i.I00iiO.length];
                    }
/* 113 */           return i;
                }

                @Override
                public final int length() {
/* 5 */             return this.I00iiI - this.I00iOIl;
                }

                @Override
                public final CharSequence subSequence(int i, int i2) {
/* 1 */             if (i < 0) {
/* 101 */               I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "start is negative: "));
/* 104 */               return null;
                    }
/* 5 */             if (i > i2) {
/* 94 */                throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
                    }
/* 7 */             int i3 = this.I00iiI;
/* 9 */             int i4 = this.I00iOIl;
/* 12 */            if (i2 <= i3 - i4) {
/* 14 */                if (i == i2) {
/* 16 */                    return "";
                        }
/* 25 */                return new IO10oOlIiO(this.I00iio, i + i4, i4 + i2);
                    }
/* 59 */            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
                }

                @Override
                public final String toString() {
/* 1 */             String str = this.I00iiO;
/* 3 */             if (str != null) {
/* 29 */                return str;
                    }
/* 15 */            String string = this.I00iio.I00000oOI(this.I00iOIl, this.I00iiI).toString();
/* 19 */            this.I00iiO = string;
/* 29 */            return string;
                }
            }
