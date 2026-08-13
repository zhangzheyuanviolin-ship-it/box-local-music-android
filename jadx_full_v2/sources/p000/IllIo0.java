            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IllIo0 {
                public static final IllIo0 I00iOIl;
                public static final IllIo0 I00iiI;
                public static final IllIo0 I00iiO;
                public static final IllIo0 I00iio;
                public static final IllIo0[] I00ilI0I1;

                static {
/* 6 */             IllIo0 illIo0 = new IllIo0("STARTED", 0);
/* 9 */             I00iOIl = illIo0;
/* 16 */            IllIo0 illIo02 = new IllIo0("FRAME_INFO_COMPLETE", 1);
/* 19 */            I00iiI = illIo02;
/* 26 */            IllIo0 illIo03 = new IllIo0("STREAM_RESULTS_COMPLETE", 2);
/* 29 */            I00iiO = illIo03;
/* 36 */            IllIo0 illIo04 = new IllIo0("COMPLETE", 3);
/* 39 */            I00iio = illIo04;
/* 41 */            IllIo0[] illIo0Arr = {illIo0, illIo02, illIo03, illIo04};
/* 45 */            I00ilI0I1 = illIo0Arr;
/* 47 */            ilIII1o11.I00000oIO(illIo0Arr);
                }

                public static IllIo0 valueOf(String str) {
/* 7 */             return (IllIo0) Enum.valueOf(IllIo0.class, str);
                }

                public static IllIo0[] values() {
/* 7 */             return (IllIo0[]) I00ilI0I1.clone();
                }
            }
