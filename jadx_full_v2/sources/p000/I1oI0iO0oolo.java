            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1oI0iO0oolo {
                public static final I1oI0iO0oolo[] I00iOIl;

                static {
/* 33 */            I1oI0iO0oolo[] i1oI0iO0ooloArr = {new I1oI0iO0oolo("PRESENT", 0), new I1oI0iO0oolo("ABSENT", 1), new I1oI0iO0oolo("PRESENT_OPTIONAL", 2), new I1oI0iO0oolo("ABSENT_OPTIONAL", 3)};
/* 37 */            I00iOIl = i1oI0iO0ooloArr;
/* 39 */            ilIII1o11.I00000oIO(i1oI0iO0ooloArr);
                }

                public static I1oI0iO0oolo valueOf(String str) {
/* 7 */             return (I1oI0iO0oolo) Enum.valueOf(I1oI0iO0oolo.class, str);
                }

                public static I1oI0iO0oolo[] values() {
/* 7 */             return (I1oI0iO0oolo[]) I00iOIl.clone();
                }
            }
