            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I10ooi0oO {
                public static final I10ooi0oO I00iOIl;
                public static final I10ooi0oO I00iiI;
                public static final I10ooi0oO[] I00iiO;

                static {
/* 6 */             I10ooi0oO i10ooi0oO = new I10ooi0oO("BoundReached", 0);
/* 9 */             I00iOIl = i10ooi0oO;
/* 16 */            I10ooi0oO i10ooi0oO2 = new I10ooi0oO("Finished", 1);
/* 19 */            I00iiI = i10ooi0oO2;
/* 21 */            I10ooi0oO[] i10ooi0oOArr = {i10ooi0oO, i10ooi0oO2};
/* 25 */            I00iiO = i10ooi0oOArr;
/* 27 */            ilIII1o11.I00000oIO(i10ooi0oOArr);
                }

                public static I10ooi0oO valueOf(String str) {
/* 7 */             return (I10ooi0oO) Enum.valueOf(I10ooi0oO.class, str);
                }

                public static I10ooi0oO[] values() {
/* 7 */             return (I10ooi0oO[]) I00iiO.clone();
                }
            }
