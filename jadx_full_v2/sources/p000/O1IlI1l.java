            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1IlI1l {
                public static final O1IlI1l I00iOIl;
                public static final O1IlI1l I00iiI;
                public static final O1IlI1l I00iiO;
                public static final O1IlI1l[] I00iio;

                static {
/* 6 */             O1IlI1l o1IlI1l = new O1IlI1l("KMTColumnAlignmentLeft", 0);
/* 9 */             I00iOIl = o1IlI1l;
/* 16 */            O1IlI1l o1IlI1l2 = new O1IlI1l("KMTColumnAlignmentCenter", 1);
/* 19 */            I00iiI = o1IlI1l2;
/* 26 */            O1IlI1l o1IlI1l3 = new O1IlI1l("KMTColumnAlignmentRight", 2);
/* 29 */            I00iiO = o1IlI1l3;
/* 31 */            O1IlI1l[] o1IlI1lArr = {o1IlI1l, o1IlI1l2, o1IlI1l3};
/* 35 */            I00iio = o1IlI1lArr;
/* 37 */            ilIII1o11.I00000oIO(o1IlI1lArr);
                }

                public static O1IlI1l valueOf(String str) {
/* 7 */             return (O1IlI1l) Enum.valueOf(O1IlI1l.class, str);
                }

                public static O1IlI1l[] values() {
/* 7 */             return (O1IlI1l[]) I00iio.clone();
                }
            }
