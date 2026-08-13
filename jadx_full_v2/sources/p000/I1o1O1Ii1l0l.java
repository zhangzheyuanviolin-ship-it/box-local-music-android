            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1o1O1Ii1l0l {
                public static final I1o1O1Ii1l0l I00iOIl;
                public static final I1o1O1Ii1l0l I00iiI;
                public static final I1o1O1Ii1l0l[] I00iiO;

                static {
/* 6 */             I1o1O1Ii1l0l i1o1O1Ii1l0l = new I1o1O1Ii1l0l("EXPONENTIAL", 0);
/* 9 */             I00iOIl = i1o1O1Ii1l0l;
/* 16 */            I1o1O1Ii1l0l i1o1O1Ii1l0l2 = new I1o1O1Ii1l0l("LINEAR", 1);
/* 19 */            I00iiI = i1o1O1Ii1l0l2;
/* 21 */            I1o1O1Ii1l0l[] i1o1O1Ii1l0lArr = {i1o1O1Ii1l0l, i1o1O1Ii1l0l2};
/* 25 */            I00iiO = i1o1O1Ii1l0lArr;
/* 27 */            ilIII1o11.I00000oIO(i1o1O1Ii1l0lArr);
                }

                public static I1o1O1Ii1l0l valueOf(String str) {
/* 7 */             return (I1o1O1Ii1l0l) Enum.valueOf(I1o1O1Ii1l0l.class, str);
                }

                public static I1o1O1Ii1l0l[] values() {
/* 7 */             return (I1o1O1Ii1l0l[]) I00iiO.clone();
                }
            }
