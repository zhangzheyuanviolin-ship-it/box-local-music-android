            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O10lioiO {
                public static final O10lioiO I00iOIl;
                public static final O10lioiO I00iiI;
                public static final O10lioiO[] I00iiO;

                static {
/* 6 */             O10lioiO o10lioiO = new O10lioiO("Ordered", 0);
/* 9 */             I00iOIl = o10lioiO;
/* 16 */            O10lioiO o10lioiO2 = new O10lioiO("Unordered", 1);
/* 19 */            I00iiI = o10lioiO2;
/* 21 */            O10lioiO[] o10lioiOArr = {o10lioiO, o10lioiO2};
/* 25 */            I00iiO = o10lioiOArr;
/* 27 */            ilIII1o11.I00000oIO(o10lioiOArr);
                }

                public static O10lioiO valueOf(String str) {
/* 7 */             return (O10lioiO) Enum.valueOf(O10lioiO.class, str);
                }

                public static O10lioiO[] values() {
/* 7 */             return (O10lioiO[]) I00iiO.clone();
                }
            }
