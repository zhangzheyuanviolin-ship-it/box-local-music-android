            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1I0IoIO0li {
                public static final O1I0IoIO0li I00iOIl;
                public static final O1I0IoIO0li I00iiI;
                public static final O1I0IoIO0li I00iiO;
                public static final O1I0IoIO0li[] I00iio;

                static {
/* 6 */             O1I0IoIO0li o1I0IoIO0li = new O1I0IoIO0li("NOT_COMPUTED", 0);
/* 9 */             I00iOIl = o1I0IoIO0li;
/* 16 */            O1I0IoIO0li o1I0IoIO0li2 = new O1I0IoIO0li("COMPUTING", 1);
/* 19 */            I00iiI = o1I0IoIO0li2;
/* 26 */            O1I0IoIO0li o1I0IoIO0li3 = new O1I0IoIO0li("RECURSION_WAS_DETECTED", 2);
/* 29 */            I00iiO = o1I0IoIO0li3;
/* 35 */            I00iio = new O1I0IoIO0li[]{o1I0IoIO0li, o1I0IoIO0li2, o1I0IoIO0li3};
                }

                public static O1I0IoIO0li valueOf(String str) {
/* 7 */             return (O1I0IoIO0li) Enum.valueOf(O1I0IoIO0li.class, str);
                }

                public static O1I0IoIO0li[] values() {
/* 7 */             return (O1I0IoIO0li[]) I00iio.clone();
                }
            }
