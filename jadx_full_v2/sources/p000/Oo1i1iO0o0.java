            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oo1i1iO0o0 {
                public static final Oo1i1iO0o0 I00iOIl;
                public static final Oo1i1iO0o0 I00iiI;
                public static final Oo1i1iO0o0 I00iiO;
                public static final Oo1i1iO0o0[] I00iio;

                static {
/* 6 */             Oo1i1iO0o0 oo1i1iO0o0 = new Oo1i1iO0o0("Uninitialized", 0);
/* 9 */             I00iOIl = oo1i1iO0o0;
/* 16 */            Oo1i1iO0o0 oo1i1iO0o02 = new Oo1i1iO0o0("Detached", 1);
/* 19 */            I00iiI = oo1i1iO0o02;
/* 26 */            Oo1i1iO0o0 oo1i1iO0o03 = new Oo1i1iO0o0("Attached", 2);
/* 29 */            I00iiO = oo1i1iO0o03;
/* 31 */            Oo1i1iO0o0[] oo1i1iO0o0Arr = {oo1i1iO0o0, oo1i1iO0o02, oo1i1iO0o03};
/* 35 */            I00iio = oo1i1iO0o0Arr;
/* 37 */            ilIII1o11.I00000oIO(oo1i1iO0o0Arr);
                }

                public static Oo1i1iO0o0 valueOf(String str) {
/* 7 */             return (Oo1i1iO0o0) Enum.valueOf(Oo1i1iO0o0.class, str);
                }

                public static Oo1i1iO0o0[] values() {
/* 7 */             return (Oo1i1iO0o0[]) I00iio.clone();
                }
            }
