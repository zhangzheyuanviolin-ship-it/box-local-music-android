            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Il1O00 {
                public static final Il1O00 I00iOIl;
                public static final Il1O00[] I00iiI;

                static {
/* 6 */             Il1O00 il1O00 = new Il1O00("IGNORE", 0);
/* 14 */            Il1O00 il1O002 = new Il1O00("RESPECT_PERFORMANCE", 1);
/* 17 */            I00iOIl = il1O002;
/* 27 */            Il1O00[] il1O00Arr = {il1O00, il1O002, new Il1O00("RESPECT_ALL", 2)};
/* 31 */            I00iiI = il1O00Arr;
/* 33 */            ilIII1o11.I00000oIO(il1O00Arr);
                }

                public static Il1O00 valueOf(String str) {
/* 7 */             return (Il1O00) Enum.valueOf(Il1O00.class, str);
                }

                public static Il1O00[] values() {
/* 7 */             return (Il1O00[]) I00iiI.clone();
                }
            }
