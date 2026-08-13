            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class iOloO1 {
                public static final long I0000O;
                public static final iOloO1 I0000oI00;
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;

                static {
/* 2 */             long jCharAt = 0;
/* 6 */             for (int i = 0; i < 7; i++) {
/* 27 */                jCharAt |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
                    }
/* 31 */            I0000O = jCharAt;
/* 39 */            I0000oI00 = new iOloO1(0, -1, -1);
                }

                public iOloO1(int i, int i2, int i3) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
                }

                public static int I0000oI00(int i, int i2, String str) {
/* 1 */             if (i == i2) {
/* 98 */                throw IOiIIo1l.I00000oOI("missing precision", i - 1, str);
                    }
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = i; i4 < i2; i4++) {
/* 14 */                char cCharAt = (char) (str.charAt(i4) - '0');
/* 17 */                if (cCharAt >= '\n') {
/* 43 */                    throw IOiIIo1l.I00000oOI("invalid precision character", i4, str);
                        }
/* 21 */                i3 = (i3 * 10) + cCharAt;
/* 25 */                if (i3 > 999999) {
/* 36 */                    throw IOiIIo1l.I0000O(i, i2, "precision too large", str);
                        }
                    }
/* 44 */            if (i3 != 0) {
/* 58 */                return i3;
                    }
/* 48 */            if (i2 == i + 1) {
/* 3 */                 return 0;
                    }
/* 57 */            throw IOiIIo1l.I0000O(i, i2, "invalid precision", str);
                }

                public final void I00000oIO(StringBuilder sb) {
/* 5 */             if (I00000oOI()) {
/* 77 */                return;
                    }
/* 7 */             int i = 0;
                    while (true) {
/* 10 */                int i2 = this.I00000oIO & (-129);
/* 13 */                int i3 = 1 << i;
/* 14 */                if (i3 > i2) {
                            break;
                        }
/* 17 */                if ((i2 & i3) != 0) {
/* 25 */                    sb.append(" #(+,-0".charAt(i));
                        }
/* 28 */                i++;
                    }
/* 32 */            int i4 = this.I00000oOI;
/* 34 */            if (i4 != -1) {
/* 36 */                sb.append(i4);
                    }
/* 39 */            int i5 = this.I0000Il00O;
/* 41 */            if (i5 != -1) {
/* 45 */                sb.append('.');
/* 48 */                sb.append(i5);
                    }
                }

                public final boolean I00000oOI() {
                    return this == I0000oI00;
                }

                public final boolean I0000Il00O() {
                    return (this.I00000oIO & Barcode.FORMAT_ITF) != 0;
                }

                public final boolean I0000O(int i, boolean z) {
                    int i2;
/* 5 */             if (I00000oOI()) {
/* 43 */                return true;
                    }
/* 8 */             int i3 = ~i;
/* 9 */             int i4 = this.I00000oIO;
/* 12 */            if ((i3 & i4) != 0) {
/* 41 */                return false;
                    }
/* 16 */            if ((!z && this.I0000Il00O != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
/* 41 */                return false;
                    }
                    return i2 == 0 || this.I00000oOI != -1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iOloO1) {
/* 10 */                iOloO1 ioloo1 = (iOloO1) obj;
/* 16 */                if (ioloo1.I00000oIO == this.I00000oIO && ioloo1.I00000oOI == this.I00000oOI && ioloo1.I0000Il00O == this.I0000Il00O) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 12 */            return (((this.I00000oIO * 31) + this.I00000oOI) * 31) + this.I0000Il00O;
                }
            }
