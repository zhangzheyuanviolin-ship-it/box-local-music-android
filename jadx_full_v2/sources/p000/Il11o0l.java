            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Il11o0l {
                public static final Il11o0l I00iOIl;
                public static final Il11o0l I00iiI;
                public static final Il11o0l I00iiO;
                public static final Il11o0l[] I00iio;

                static {
/* 6 */             Il11o0l il11o0l = new Il11o0l("NOT_RUN", 0);
/* 9 */             I00iOIl = il11o0l;
/* 16 */            Il11o0l il11o0l2 = new Il11o0l("CANCELLED", 1);
/* 19 */            I00iiI = il11o0l2;
/* 26 */            Il11o0l il11o0l3 = new Il11o0l("STARTED", 2);
/* 29 */            I00iiO = il11o0l3;
/* 35 */            I00iio = new Il11o0l[]{il11o0l, il11o0l2, il11o0l3};
                }

                public static Il11o0l valueOf(String str) {
/* 7 */             return (Il11o0l) Enum.valueOf(Il11o0l.class, str);
                }

                public static Il11o0l[] values() {
/* 7 */             return (Il11o0l[]) I00iio.clone();
                }
            }
