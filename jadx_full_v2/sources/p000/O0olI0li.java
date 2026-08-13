            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0olI0li {
                public static final O0olI0li I00iOIl;
                public static final O0olI0li I00iiI;
                public static final O0olI0li[] I00iiO;

                static {
/* 6 */             O0olI0li o0olI0li = new O0olI0li("Default", 0);
/* 9 */             I00iOIl = o0olI0li;
/* 16 */            O0olI0li o0olI0li2 = new O0olI0li("Lenient", 1);
/* 19 */            I00iiI = o0olI0li2;
/* 21 */            O0olI0li[] o0olI0liArr = {o0olI0li, o0olI0li2};
/* 25 */            I00iiO = o0olI0liArr;
/* 27 */            ilIII1o11.I00000oIO(o0olI0liArr);
                }

                public static O0olI0li valueOf(String str) {
/* 7 */             return (O0olI0li) Enum.valueOf(O0olI0li.class, str);
                }

                public static O0olI0li[] values() {
/* 7 */             return (O0olI0li[]) I00iiO.clone();
                }
            }
