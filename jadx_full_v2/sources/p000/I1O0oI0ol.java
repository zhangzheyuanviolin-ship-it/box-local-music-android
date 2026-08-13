            package p000;

            import android.util.Rational;
            import android.util.Size;
            
            public abstract class I1O0oI0ol {
                public static final Rational I00000oIO = new Rational(4, 3);
                public static final Rational I00000oOI = new Rational(3, 4);
                public static final Rational I0000Il00O = new Rational(16, 9);
                public static final Rational I0000O = new Rational(9, 16);

                public static boolean I00000oIO(Rational rational, Size size) {
/* 1 */             Size size2 = Ol0ilIo.I00000oOI;
/* 4 */             if (rational != null) {
/* 24 */                if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
/* 95 */                    return true;
                        }
/* 40 */                if (size.getHeight() * size.getWidth() >= Ol0ilIo.I00000oIO(size2)) {
/* 42 */                    int width = size.getWidth();
/* 46 */                    int height = size.getHeight();
/* 60 */                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
/* 63 */                    int i = width % 16;
/* 65 */                    if (i == 0 && height % 16 == 0) {
/* 81 */                        if (I00000oOI(Math.max(0, height - 16), width, rational) || I00000oOI(Math.max(0, width - 16), height, rational2)) {
/* 95 */                            return true;
                                }
                            } else {
/* 97 */                        if (i == 0) {
/* 99 */                            return I00000oOI(height, width, rational);
                                }
/* 106 */                       if (height % 16 == 0) {
/* 108 */                           return I00000oOI(width, height, rational2);
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                public static boolean I00000oOI(int i, int i2, Rational rational) {
/* 10 */            lII1OI11o1I.I00000oOI(i2 % 16 == 0);
/* 24 */            double numerator = (rational.getNumerator() * i) / rational.getDenominator();
                    return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
                }
            }
