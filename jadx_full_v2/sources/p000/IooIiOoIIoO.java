            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IooIiOoIIoO {
                public long I00000oIO;

                public static final IooIiOoIIoO I00000oIO(long j) {
/* 3 */             IooIiOoIIoO iooIiOoIIoO = new IooIiOoIIoO();
/* 6 */             iooIiOoIIoO.I00000oIO = j;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iooIiOoIIoO;
                }

                public static long I00000oOI(int i, int i2) {
/* 12 */            return (i2 & 4294967295L) | (i << 32);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IooIiOoIIoO) && this.I00000oIO == ((IooIiOoIIoO) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             long j = this.I00000oIO;
/* 7 */             StringBuilder sb = new StringBuilder("(");
/* 15 */            sb.append((int) (j >> 32));
/* 20 */            sb.append(", ");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, (int) (j & 4294967295L), ')');
                }
            }
