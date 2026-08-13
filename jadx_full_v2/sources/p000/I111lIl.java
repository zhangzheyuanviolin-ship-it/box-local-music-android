            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I111lIl {
                public static final I111lIl I00iOIl;
                public static final I111lIl I00iiI;
                public static final I111lIl[] I00iiO;

                static {
/* 6 */             I111lIl i111lIl = new I111lIl("JAVA", 0);
/* 9 */             I00iOIl = i111lIl;
/* 16 */            I111lIl i111lIl2 = new I111lIl("KOTLIN", 1);
/* 19 */            I00iiI = i111lIl2;
/* 21 */            I111lIl[] i111lIlArr = {i111lIl, i111lIl2};
/* 25 */            I00iiO = i111lIlArr;
/* 27 */            ilIII1o11.I00000oIO(i111lIlArr);
                }

                public static I111lIl valueOf(String str) {
/* 7 */             return (I111lIl) Enum.valueOf(I111lIl.class, str);
                }

                public static I111lIl[] values() {
/* 7 */             return (I111lIl[]) I00iiO.clone();
                }
            }
