            package p000;
            
            public final class IIOool extends IIi0IoOo {
                public static final IIOool[] I00iiO = new IIOool[357];
                public static final IIOool I00iio = I00o0iI0io1(0);
                public static final IIOool I00ilI0I1;
                public static final IIOool I00ilO0;
                public static final IIOool I00io1l;
                public final long I00iOIl;
                public final boolean I00iiI;

                static {
/* 17 */            I00o0iI0io1(1L);
/* 22 */            I00o0iI0io1(2L);
/* 31 */            I00ilI0I1 = I00o0iI0io1(3L);
/* 44 */            I00ilO0 = new IIOool(Long.MAX_VALUE, false);
/* 53 */            I00io1l = new IIOool(Long.MIN_VALUE, false);
                }

                public IIOool(long j, boolean z) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = z;
                }

                public static IIOool I00o0iI0io1(long j) {
/* 6 */             if (-100 > j || j > 256) {
/* 35 */                return new IIOool(j, true);
                    }
/* 15 */            int i = ((int) j) + 100;
/* 17 */            IIOool[] iIOoolArr = I00iiO;
/* 21 */            if (iIOoolArr[i] == null) {
/* 28 */                iIOoolArr[i] = new IIOool(j, true);
                    }
/* 30 */            return iIOoolArr[i];
                }

                @Override
                public final float I00ioIO() {
/* 3 */             return this.I00iOIl;
                }

                @Override
                public final int I00lli11() {
/* 3 */             return (int) this.I00iOIl;
                }

                @Override
                public final long I00lll10() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IIOool) && ((int) ((IIOool) obj).I00iOIl) == ((int) this.I00iOIl);
                }

                public final int hashCode() {
/* 3 */             long j = this.I00iOIl;
/* 9 */             return (int) (j ^ (j >> 32));
                }

                public final String toString() {
/* 12 */            return IlIi0I0.I000o00OoI0I(new StringBuilder("COSInt{"), this.I00iOIl, "}");
                }
            }
