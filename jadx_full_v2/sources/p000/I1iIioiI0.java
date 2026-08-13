            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1iIioiI0 {
                public static final I1iIioiI0 I00iOIl;
                public static final I1iIioiI0 I00iiI;
                public static final I1iIioiI0[] I00iiO;

                static {
/* 6 */             I1iIioiI0 i1iIioiI0 = new I1iIioiI0("PLAIN", 0);
/* 9 */             I00iOIl = i1iIioiI0;
/* 16 */            I1iIioiI0 i1iIioiI02 = new I1iIioiI0("DIALOGUE", 1);
/* 19 */            I00iiI = i1iIioiI02;
/* 21 */            I1iIioiI0[] i1iIioiI0Arr = {i1iIioiI0, i1iIioiI02};
/* 25 */            I00iiO = i1iIioiI0Arr;
/* 27 */            ilIII1o11.I00000oIO(i1iIioiI0Arr);
                }

                public static I1iIioiI0 valueOf(String str) {
/* 7 */             return (I1iIioiI0) Enum.valueOf(I1iIioiI0.class, str);
                }

                public static I1iIioiI0[] values() {
/* 7 */             return (I1iIioiI0[]) I00iiO.clone();
                }
            }
