            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1O11o01I1Il {
                public static final O1O11o01I1Il I00iOIl;
                public static final O1O11o01I1Il I00iiI;
                public static final O1O11o01I1Il[] I00iiO;

                static {
/* 6 */             O1O11o01I1Il o1O11o01I1Il = new O1O11o01I1Il("KMTTextAlignmentLeft", 0);
/* 9 */             I00iOIl = o1O11o01I1Il;
/* 16 */            O1O11o01I1Il o1O11o01I1Il2 = new O1O11o01I1Il("KMTTextAlignmentCenter", 1);
/* 19 */            I00iiI = o1O11o01I1Il2;
/* 29 */            O1O11o01I1Il[] o1O11o01I1IlArr = {o1O11o01I1Il, o1O11o01I1Il2, new O1O11o01I1Il("KMTTextAlignmentRight", 2)};
/* 33 */            I00iiO = o1O11o01I1IlArr;
/* 35 */            ilIII1o11.I00000oIO(o1O11o01I1IlArr);
                }

                public static O1O11o01I1Il valueOf(String str) {
/* 7 */             return (O1O11o01I1Il) Enum.valueOf(O1O11o01I1Il.class, str);
                }

                public static O1O11o01I1Il[] values() {
/* 7 */             return (O1O11o01I1Il[]) I00iiO.clone();
                }
            }
