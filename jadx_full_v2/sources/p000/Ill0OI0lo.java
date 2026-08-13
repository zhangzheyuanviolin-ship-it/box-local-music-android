            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import java.util.regex.Pattern;
            
/* 9 */     public final class Ill0OI0lo {
                public static final OI1Iio0ii1 I0000oI00 = OI1Iio0ii1.I000II("<root>");
                public String I00000oIO;
                public transient Ill0IO I00000oOI;
                public transient Ill0OI0lo I0000Il00O;
                public transient OI1Iio0ii1 I0000O;

                static {
/* 11 */            Pattern.compile("\\.");
                }

                public Ill0OI0lo(String str, Ill0OI0lo ill0OI0lo, OI1Iio0ii1 oI1Iio0ii1) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I0000Il00O = ill0OI0lo;
/* 8 */             this.I0000O = oI1Iio0ii1;
                }

                public static final List I0001Ioi1lo(Ill0OI0lo ill0OI0lo) {
/* 5 */             if (ill0OI0lo.I0000Il00O()) {
/* 9 */                 return new ArrayList();
                    }
/* 17 */            List listI0001Ioi1lo = I0001Ioi1lo(ill0OI0lo.I0000oI00());
/* 25 */            listI0001Ioi1lo.add(ill0OI0lo.I000II());
/* 49 */            return listI0001Ioi1lo;
                }

                public final Ill0OI0lo I00000oIO(OI1Iio0ii1 oI1Iio0ii1) {
                    String strI00000oOI;
/* 5 */             if (I0000Il00O()) {
/* 7 */                 strI00000oOI = oI1Iio0ii1.I00000oOI();
                    } else {
/* 34 */                strI00000oOI = this.I00000oIO + '.' + oI1Iio0ii1.I00000oOI();
                    }
/* 40 */            return new Ill0OI0lo(strI00000oOI, this, oI1Iio0ii1);
                }

                public final void I00000oOI() {
/* 1 */             String str = this.I00000oIO;
                    int length = str.length() - 1;
/* 10 */            boolean z = false;
                    while (true) {
/* 12 */                if (length < 0) {
/* 40 */                    length = -1;
                            break;
                        }
/* 14 */                char cCharAt = str.charAt(length);
/* 20 */                if (cCharAt == '.' && !z) {
                            break;
                        }
/* 27 */                if (cCharAt == '`') {
                            z = !z;
                        } else if (cCharAt == '\\') {
                            length--;
                        }
                        length--;
                    }
/* 41 */            if (length >= 0) {
/* 53 */                this.I0000O = OI1Iio0ii1.I0000O(str.substring(length + 1));
/* 64 */                this.I0000Il00O = new Ill0OI0lo(str.substring(0, length));
                    } else {
/* 71 */                this.I0000O = OI1Iio0ii1.I0000O(str);
/* 77 */                this.I0000Il00O = Ill0IO.I0000Il00O.I00000oIO;
                    }
                }

                public final boolean I0000Il00O() {
                    return this.I00000oIO.length() == 0;
                }

                public final boolean I0000O() {
                    return this.I00000oOI != null || OlOoOIi0o.I001i1O0Ol(this.I00000oIO, '<', 0, 6) < 0;
                }

                public final Ill0OI0lo I0000oI00() {
/* 1 */             Ill0OI0lo ill0OI0lo = this.I0000Il00O;
/* 3 */             if (ill0OI0lo != null) {
/* 5 */                 return ill0OI0lo;
                    }
/* 10 */            if (I0000Il00O()) {
/* 20 */                I000II.I001IO000("root");
/* 23 */                return null;
                    }
/* 12 */            I00000oOI();
/* 15 */            return this.I0000Il00O;
                }

                public final OI1Iio0ii1 I000II() {
/* 1 */             OI1Iio0ii1 oI1Iio0ii1 = this.I0000O;
/* 3 */             if (oI1Iio0ii1 != null) {
/* 5 */                 return oI1Iio0ii1;
                    }
/* 10 */            if (I0000Il00O()) {
/* 20 */                I000II.I001IO000("root");
/* 23 */                return null;
                    }
/* 12 */            I00000oOI();
/* 15 */            return this.I0000O;
                }

                public final boolean I000O01llI0(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             String str = this.I00000oIO;
/* 8 */             if (!I0000Il00O()) {
/* 14 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '.', 0, 6);
/* 19 */                if (iI001i1O0Ol == -1) {
/* 21 */                    iI001i1O0Ol = str.length();
                        }
/* 25 */                String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 33 */                if (iI001i1O0Ol == strI00000oOI.length() && str.regionMatches(0, strI00000oOI, 0, iI001i1O0Ol)) {
/* 41 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                public final Ill0IO I000OOo1O() {
/* 1 */             Ill0IO ill0IO = this.I00000oOI;
/* 3 */             if (ill0IO != null) {
/* 29 */                return ill0IO;
                    }
/* 7 */             Ill0IO ill0IO2 = new Ill0IO(this);
/* 10 */            this.I00000oOI = ill0IO2;
/* 29 */            return ill0IO2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ill0OI0lo) && O0000Ioio00.I0000O(this.I00000oIO, ((Ill0OI0lo) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
                    return I0000Il00O() ? I0000oI00.I00000oOI() : this.I00000oIO;
                }

/* 10 */        public Ill0OI0lo(String str) {
/* 12 */            this.I00000oIO = str;
                }
            }
