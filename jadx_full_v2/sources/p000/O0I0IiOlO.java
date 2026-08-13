            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0I0IiOlO {
                public static final O0I0IiOlO[] I00iOIl;

                static {
/* 25 */            O0I0IiOlO[] o0I0IiOlOArr = {new O0I0IiOlO("FROM_DEPENDENCIES", 0), new O0I0IiOlO("FROM_CLASS_LOADER", 1), new O0I0IiOlO("FALLBACK", 2)};
/* 29 */            I00iOIl = o0I0IiOlOArr;
/* 31 */            ilIII1o11.I00000oIO(o0I0IiOlOArr);
                }

                public static O0I0IiOlO valueOf(String str) {
/* 7 */             return (O0I0IiOlO) Enum.valueOf(O0I0IiOlO.class, str);
                }

                public static O0I0IiOlO[] values() {
/* 7 */             return (O0I0IiOlO[]) I00iOIl.clone();
                }
            }
