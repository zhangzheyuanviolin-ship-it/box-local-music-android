            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I111l1 {
                public static final I111l1 I00iOIl;
                public static final I111l1 I00iiI;
                public static final I111l1[] I00iiO;

                static {
/* 6 */             I111l1 i111l1 = new I111l1("CALL_BY_NAME", 0);
/* 9 */             I00iOIl = i111l1;
/* 16 */            I111l1 i111l12 = new I111l1("POSITIONAL_CALL", 1);
/* 19 */            I00iiI = i111l12;
/* 21 */            I111l1[] i111l1Arr = {i111l1, i111l12};
/* 25 */            I00iiO = i111l1Arr;
/* 27 */            ilIII1o11.I00000oIO(i111l1Arr);
                }

                public static I111l1 valueOf(String str) {
/* 7 */             return (I111l1) Enum.valueOf(I111l1.class, str);
                }

                public static I111l1[] values() {
/* 7 */             return (I111l1[]) I00iiO.clone();
                }
            }
