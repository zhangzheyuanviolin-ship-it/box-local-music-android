            package p000;
            
            public final class lOIO0O0 {
                public final Object I00000oIO;
                public final Object I00000oOI;
                public final Object I0000Il00O;

                public lOIO0O0(Object obj, Object obj2, Object obj3) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = obj2;
/* 8 */             this.I0000Il00O = obj3;
                }

                public final IllegalArgumentException I00000oIO() {
/* 3 */             Object obj = this.I00000oIO;
/* 5 */             String strValueOf = String.valueOf(obj);
/* 11 */            String strValueOf2 = String.valueOf(this.I00000oOI);
/* 15 */            String strValueOf3 = String.valueOf(obj);
/* 21 */            String strValueOf4 = String.valueOf(this.I0000Il00O);
/* 25 */            int length = strValueOf.length();
/* 29 */            int length2 = strValueOf2.length();
/* 52 */            StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
/* 59 */            IIl001iO0Io.I001lIiIIo1O(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
/* 68 */            return new IllegalArgumentException(IIl001iO0Io.I00100o1O0lo(sb, " and ", strValueOf3, "=", strValueOf4));
                }
            }
