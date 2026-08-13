            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iio1ilIOl10o {
                public long I00000oIO;

                public static final Iio1ilIOl10o I00000oIO(long j) {
/* 3 */             Iio1ilIOl10o iio1ilIOl10o = new Iio1ilIOl10o();
/* 6 */             iio1ilIOl10o.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iio1ilIOl10o;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Iio1ilIOl10o) && this.I00000oIO == ((Iio1ilIOl10o) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "DurationNs(value=" + this.I00000oIO + ')';
                }
            }
