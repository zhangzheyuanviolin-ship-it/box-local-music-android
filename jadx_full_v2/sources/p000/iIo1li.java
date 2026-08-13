            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class iIo1li {
                public static final int[] I00000oIO = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
                public static final int[] I00000oOI = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
                public static final int[] I0000Il00O = {3, 6};
                public static final int[] I0000O = {1, 2, 4, 5, 7, 8};

                public static final void I00000oIO(StringBuilder sb, StringBuilder sb2, int i) {
/* 3 */             if (i < 10) {
/* 7 */                 sb.append('0');
                    }
/* 10 */            sb2.append(i);
                }

                public static final Ioo1oiOl I00000oOI(String str, String str2, int i, Function1 function1) {
/* 1 */             char cCharAt = str.charAt(i);
/* 19 */            if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
/* 21 */                return null;
                    }
/* 53 */            return I0000Il00O(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
                }

                public static final Ioo1oiOl I0000Il00O(String str, String str2) {
/* 31 */            return new Ioo1oiOl(str2 + " when parsing an Instant from \"" + I0000oI00(64, str) + '\"', str);
                }

                public static final int I0000O(int i, String str) {
/* 17 */            return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
                }

                public static final String I0000oI00(int i, String str) {
/* 5 */             if (str.length() <= i) {
/* 7 */                 return str.toString();
                    }
/* 34 */            return str.subSequence(0, i).toString() + "...";
                }
            }
