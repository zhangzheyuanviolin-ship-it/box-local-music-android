            package p000;

            import java.util.concurrent.TimeUnit;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iio1llolooo {
                public static final Iio1llolooo I00iiI;
                public static final Iio1llolooo I00iiO;
                public static final Iio1llolooo I00iio;
                public static final Iio1llolooo I00ilI0I1;
                public static final Iio1llolooo I00ilO0;
                public static final Iio1llolooo I00io1l;
                public static final Iio1llolooo[] I00ioIO;
                public final TimeUnit I00iOIl;

                static {
/* 8 */             Iio1llolooo iio1llolooo = new Iio1llolooo("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
/* 11 */            I00iiI = iio1llolooo;
/* 20 */            Iio1llolooo iio1llolooo2 = new Iio1llolooo("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
/* 30 */            Iio1llolooo iio1llolooo3 = new Iio1llolooo("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
/* 33 */            I00iiO = iio1llolooo3;
/* 42 */            Iio1llolooo iio1llolooo4 = new Iio1llolooo("SECONDS", 3, TimeUnit.SECONDS);
/* 45 */            I00iio = iio1llolooo4;
/* 54 */            Iio1llolooo iio1llolooo5 = new Iio1llolooo("MINUTES", 4, TimeUnit.MINUTES);
/* 57 */            I00ilI0I1 = iio1llolooo5;
/* 66 */            Iio1llolooo iio1llolooo6 = new Iio1llolooo("HOURS", 5, TimeUnit.HOURS);
/* 69 */            I00ilO0 = iio1llolooo6;
/* 78 */            Iio1llolooo iio1llolooo7 = new Iio1llolooo("DAYS", 6, TimeUnit.DAYS);
/* 81 */            I00io1l = iio1llolooo7;
/* 83 */            Iio1llolooo[] iio1lloloooArr = {iio1llolooo, iio1llolooo2, iio1llolooo3, iio1llolooo4, iio1llolooo5, iio1llolooo6, iio1llolooo7};
/* 87 */            I00ioIO = iio1lloloooArr;
/* 89 */            ilIII1o11.I00000oIO(iio1lloloooArr);
                }

                public Iio1llolooo(String str, int i, TimeUnit timeUnit) {
/* 4 */             this.I00iOIl = timeUnit;
                }

                public static Iio1llolooo valueOf(String str) {
/* 7 */             return (Iio1llolooo) Enum.valueOf(Iio1llolooo.class, str);
                }

                public static Iio1llolooo[] values() {
/* 7 */             return (Iio1llolooo[]) I00ioIO.clone();
                }
            }
