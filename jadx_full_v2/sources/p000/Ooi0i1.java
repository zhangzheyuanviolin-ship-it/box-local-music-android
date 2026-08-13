            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooi0i1 implements Comparable {
                public long I00iOIl;

                public static final Ooi0i1 I00000oIO(long j) {
/* 3 */             Ooi0i1 ooi0i1 = new Ooi0i1();
/* 6 */             ooi0i1.I00iOIl = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ooi0i1;
                }

                public static final boolean I00000oOI(long j, long j2) {
                    return j == j2;
                }

                @Override
                public final int compareTo(Object obj) {
/* 11 */            return O0000Ioio00.I0001Ioi1lo(this.I00iOIl ^ Long.MIN_VALUE, ((Ooi0i1) obj).I00iOIl ^ Long.MIN_VALUE);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Ooi0i1) && this.I00iOIl == ((Ooi0i1) obj).I00iOIl;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00iOIl);
                }

                public final String toString() {
/* 5 */             return li01Io1li.I00000oOI(10, this.I00iOIl);
                }
            }
