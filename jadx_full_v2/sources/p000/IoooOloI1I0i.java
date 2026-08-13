            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IoooOloI1I0i {
                public static final IoooOloI1I0i I00iOIl;
                public static final IoooOloI1I0i I00iiI;
                public static final IoooOloI1I0i[] I00iiO;

                static {
/* 6 */             IoooOloI1I0i ioooOloI1I0i = new IoooOloI1I0i("Min", 0);
/* 9 */             I00iOIl = ioooOloI1I0i;
/* 16 */            IoooOloI1I0i ioooOloI1I0i2 = new IoooOloI1I0i("Max", 1);
/* 19 */            I00iiI = ioooOloI1I0i2;
/* 21 */            IoooOloI1I0i[] ioooOloI1I0iArr = {ioooOloI1I0i, ioooOloI1I0i2};
/* 25 */            I00iiO = ioooOloI1I0iArr;
/* 27 */            ilIII1o11.I00000oIO(ioooOloI1I0iArr);
                }

                public static IoooOloI1I0i valueOf(String str) {
/* 7 */             return (IoooOloI1I0i) Enum.valueOf(IoooOloI1I0i.class, str);
                }

                public static IoooOloI1I0i[] values() {
/* 7 */             return (IoooOloI1I0i[]) I00iiO.clone();
                }
            }
