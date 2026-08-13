            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I0iiIiI1 {
                public static final I0iiIiI1 I00iiI;
                public static final I0iiIiI1[] I00iiO;
                public static final Il0li01oOil I00iio;
                public final String I00iOIl;

                static {
/* 8 */             I0iiIiI1 i0iiIiI1 = new I0iiIiI1("AVG", 0, "avg");
/* 11 */            I00iiI = i0iiIiI1;
/* 43 */            I0iiIiI1[] i0iiIiI1Arr = {i0iiIiI1, new I0iiIiI1("MEDIAN", 1, "median"), new I0iiIiI1("MIN", 2, "min"), new I0iiIiI1("MAX", 3, "max")};
/* 47 */            I00iiO = i0iiIiI1Arr;
/* 53 */            I00iio = ilIII1o11.I00000oIO(i0iiIiI1Arr);
                }

                public I0iiIiI1(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static I0iiIiI1 valueOf(String str) {
/* 7 */             return (I0iiIiI1) Enum.valueOf(I0iiIiI1.class, str);
                }

                public static I0iiIiI1[] values() {
/* 7 */             return (I0iiIiI1[]) I00iiO.clone();
                }
            }
