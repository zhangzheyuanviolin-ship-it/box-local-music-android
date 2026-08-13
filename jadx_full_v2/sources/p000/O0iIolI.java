            package p000;
            
            public final class O0iIolI implements Comparable {
                public static final O0iIolI I00ilI0I1 = new O0iIolI(2, 3, 21);
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final int I00iio;

                public O0iIolI(int i, int i2, int i3) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
/* 30 */                this.I00iio = (i << 16) + (i2 << 8) + i3;
/* 32 */                return;
                    }
/* 215 */           throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iio - ((O0iIolI) obj).I00iio;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 12 */            O0iIolI o0iIolI = obj instanceof O0iIolI ? (O0iIolI) obj : null;
                    return o0iIolI != null && this.I00iio == o0iIolI.I00iio;
                }

                public final int hashCode() {
/* 1 */             return this.I00iio;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00iOIl);
/* 13 */            sb.append('.');
/* 18 */            sb.append(this.I00iiI);
/* 21 */            sb.append('.');
/* 26 */            sb.append(this.I00iiO);
/* 29 */            return sb.toString();
                }
            }
