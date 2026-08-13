            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            
            public abstract class lII0I0I01I1l {
                public static String I00000oIO(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return lOi0oI00.I00000oIO("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return lOi0oI00.I00000oIO("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 45 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 48 */            return null;
                }

                public static void I00000oOI(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             OIiilo1Ool0o.I00100o1O0lo();
                }

                public static void I0000Il00O(boolean z, String str, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 12 */            I000II.I000iOII(lOi0oI00.I00000oIO(str, obj));
                }

                public static void I0000O(int i, int i2) {
                    String strI00000oIO;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 54 */                    strI00000oIO = lOi0oI00.I00000oIO("%s (%s) must not be negative", "index", Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 21 */                        I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 24 */                        return;
                            }
/* 39 */                    strI00000oIO = lOi0oI00.I00000oIO("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 89 */                throw new IndexOutOfBoundsException(strI00000oIO);
                    }
                }

                public static void I0000oI00(ListenableFuture listenableFuture, String str, Object obj) {
/* 1 */             if (listenableFuture != null) {
/* 3 */                 return;
                    }
/* 12 */            IOOlIIilOl0.I000II(lOi0oI00.I00000oIO(str, obj));
                }

                public static void I0001Ioi1lo(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static void I000II(int i, int i2) {
/* 1 */             if (i < 0 || i > i2) {
/* 12 */                I000II.I0010o(I00000oIO(i, i2, "index"));
                    }
                }

                public static void I000O01llI0(int i, int i2, int i3) {
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 215 */               throw new IndexOutOfBoundsException((i < 0 || i > i3) ? I00000oIO(i, i3, "start index") : (i2 < 0 || i2 > i3) ? I00000oIO(i2, i3, "end index") : lOi0oI00.I00000oIO("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                }

                public static void I000OOo1O(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I001IO000(str);
                }
            }
