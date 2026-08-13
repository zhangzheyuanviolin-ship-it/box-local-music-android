            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1IoI0O110OO {
                public static final O1IoI0O110OO[] I00iOIl;

                static {
/* 25 */            O1IoI0O110OO[] o1IoI0O110OOArr = {new O1IoI0O110OO("KMTLinePositionRegular", 0), new O1IoI0O110OO("KMTLinePositionSubscript", 1), new O1IoI0O110OO("KMTLinePositionSuperscript", 2)};
/* 29 */            I00iOIl = o1IoI0O110OOArr;
/* 31 */            ilIII1o11.I00000oIO(o1IoI0O110OOArr);
                }

                public static O1IoI0O110OO valueOf(String str) {
/* 7 */             return (O1IoI0O110OO) Enum.valueOf(O1IoI0O110OO.class, str);
                }

                public static O1IoI0O110OO[] values() {
/* 7 */             return (O1IoI0O110OO[]) I00iOIl.clone();
                }
            }
