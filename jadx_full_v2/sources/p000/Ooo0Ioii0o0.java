            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ooo0Ioii0o0 {
                public static final Ooo0Ioii0o0 I00iiO;
                public static final Ooo0Ioii0o0 I00iio;
                public static final Ooo0Ioii0o0 I00ilI0I1;
                public static final Ooo0Ioii0o0[] I00ilO0;
                public final String I00iOIl;
                public final boolean I00iiI;

                static {
/* 9 */             Ooo0Ioii0o0 ooo0Ioii0o0 = new Ooo0Ioii0o0("INVARIANT", 0, true, "");
/* 12 */            I00iiO = ooo0Ioii0o0;
/* 20 */            Ooo0Ioii0o0 ooo0Ioii0o02 = new Ooo0Ioii0o0("IN_VARIANCE", 1, false, "in");
/* 23 */            I00iio = ooo0Ioii0o02;
/* 32 */            Ooo0Ioii0o0 ooo0Ioii0o03 = new Ooo0Ioii0o0("OUT_VARIANCE", 2, true, "out");
/* 35 */            I00ilI0I1 = ooo0Ioii0o03;
/* 37 */            Ooo0Ioii0o0[] ooo0Ioii0o0Arr = {ooo0Ioii0o0, ooo0Ioii0o02, ooo0Ioii0o03};
/* 41 */            I00ilO0 = ooo0Ioii0o0Arr;
/* 43 */            ilIII1o11.I00000oIO(ooo0Ioii0o0Arr);
                }

                public Ooo0Ioii0o0(String str, int i, boolean z, String str2) {
/* 4 */             this.I00iOIl = str2;
/* 6 */             this.I00iiI = z;
                }

                public static Ooo0Ioii0o0 valueOf(String str) {
/* 7 */             return (Ooo0Ioii0o0) Enum.valueOf(Ooo0Ioii0o0.class, str);
                }

                public static Ooo0Ioii0o0[] values() {
/* 7 */             return (Ooo0Ioii0o0[]) I00ilO0.clone();
                }

                @Override
                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
