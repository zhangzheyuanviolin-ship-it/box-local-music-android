            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OooO0Io1i {
                public static final OooO0Io1i I00iOIl;
                public static final OooO0Io1i[] I00iiI;

                static {
/* 6 */             OooO0Io1i oooO0Io1i = new OooO0Io1i("STRICT", 0);
/* 14 */            OooO0Io1i oooO0Io1i2 = new OooO0Io1i("LOG", 1);
/* 22 */            OooO0Io1i oooO0Io1i3 = new OooO0Io1i("QUIET", 2);
/* 25 */            I00iOIl = oooO0Io1i3;
/* 27 */            OooO0Io1i[] oooO0Io1iArr = {oooO0Io1i, oooO0Io1i2, oooO0Io1i3};
/* 31 */            I00iiI = oooO0Io1iArr;
/* 33 */            ilIII1o11.I00000oIO(oooO0Io1iArr);
                }

                public static OooO0Io1i valueOf(String str) {
/* 7 */             return (OooO0Io1i) Enum.valueOf(OooO0Io1i.class, str);
                }

                public static OooO0Io1i[] values() {
/* 7 */             return (OooO0Io1i[]) I00iiI.clone();
                }
            }
