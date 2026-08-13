            package p000;
            
            public final class Ool0o101l1 implements IllOOo00lI {
                public final int I00iOIl;
                public Ool0oO1OIi I00iiI;

                public Ool0o101l1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             Ool0oO1OIi ool0oO1OIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 58 */                    String str = ool0oO1OIi.I00ilI0I1;
/* 60 */                    String str2 = ool0oO1OIi.I00iiO;
/* 62 */                    if (str2 == null) {
/* 6 */                         return null;
                            }
/* 70 */                    if (str2.length() == 0) {
/* 4 */                         return "";
                            }
/* 81 */                    int length = ool0oO1OIi.I00io1l.I00iOIl.length() + 3;
/* 93 */                    return str.substring(length, OlOoOIi0o.I001iOo1i0O(str, new char[]{':', '@'}, length, false));
                        default:
/* 12 */                    String str3 = ool0oO1OIi.I00ilI0I1;
/* 14 */                    String str4 = ool0oO1OIi.I00iio;
/* 16 */                    if (str4 == null) {
/* 6 */                         return null;
                            }
                            return str4.length() == 0 ? "" : str3.substring(OlOoOIi0o.I001i1O0Ol(str3, ':', ool0oO1OIi.I00io1l.I00iOIl.length() + 3, 4) + 1, OlOoOIi0o.I001i1O0Ol(str3, '@', 0, 6));
                    }
                }
            }
