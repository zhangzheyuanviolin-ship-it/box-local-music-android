            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IoloIoIOi {
                public static final IoloIoIOi[] I00iOIl;

                static {
/* 25 */            IoloIoIOi[] ioloIoIOiArr = {new IoloIoIOi("TONE", 0), new IoloIoIOi("STYLE", 1), new IoloIoIOi("LANGUAGE", 2)};
/* 29 */            I00iOIl = ioloIoIOiArr;
/* 31 */            ilIII1o11.I00000oIO(ioloIoIOiArr);
                }

                public static IoloIoIOi valueOf(String str) {
/* 7 */             return (IoloIoIOi) Enum.valueOf(IoloIoIOi.class, str);
                }

                public static IoloIoIOi[] values() {
/* 7 */             return (IoloIoIOi[]) I00iOIl.clone();
                }
            }
