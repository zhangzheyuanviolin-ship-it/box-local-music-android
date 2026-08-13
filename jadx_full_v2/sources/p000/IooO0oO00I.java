            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public class IooO0oO00I implements Iterable, O0IlIoi {
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                public IooO0oO00I(int i, int i2, int i3) {
/* 4 */             if (i3 == 0) {
/* 30 */                I000II.I000iOII("Step must be non-zero.");
/* 215 */               throw null;
                    }
/* 8 */             if (i3 == Integer.MIN_VALUE) {
/* 23 */                I000II.I000iOII("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
/* 27 */                throw null;
                    }
/* 10 */            this.I00iOIl = i;
/* 16 */            this.I00iiI = lIO01iiiOOo.I00000oIO(i, i2, i3);
/* 18 */            this.I00iiO = i3;
                }

                public boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IooO0oO00I)) {
/* 42 */                return false;
                    }
/* 9 */             if (isEmpty() && ((IooO0oO00I) obj).isEmpty()) {
/* 40 */                return true;
                    }
/* 20 */            IooO0oO00I iooO0oO00I = (IooO0oO00I) obj;
                    return this.I00iOIl == iooO0oO00I.I00iOIl && this.I00iiI == iooO0oO00I.I00iiI && this.I00iiO == iooO0oO00I.I00iiO;
                }

                public int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 20 */            return (((this.I00iOIl * 31) + this.I00iiI) * 31) + this.I00iiO;
                }

                public boolean isEmpty() {
/* 3 */             int i = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 7 */             int i3 = this.I00iOIl;
                    return i2 > 0 ? i3 > i : i3 < i;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             IooO10lI iooO10lI = new IooO10lI();
/* 6 */             int i = this.I00iiO;
/* 8 */             iooO10lI.I00iOIl = i;
/* 10 */            int i2 = this.I00iiI;
/* 12 */            iooO10lI.I00iiI = i2;
/* 14 */            int i3 = this.I00iOIl;
/* 16 */            boolean z = false;
/* 18 */            if (i <= 0 ? i3 >= i2 : i3 <= i2) {
/* 22 */                z = true;
                    }
/* 27 */            iooO10lI.I00iiO = z;
/* 29 */            if (z) {
/* 31 */                i2 = i3;
                    }
/* 32 */            iooO10lI.I00iio = i2;
/* 34 */            VarHandle.storeStoreFence();
/* 113 */           return iooO10lI;
                }

                public String toString() {
                    StringBuilder sb;
/* 3 */             int i = this.I00iiI;
/* 5 */             int i2 = this.I00iiO;
/* 7 */             int i3 = this.I00iOIl;
/* 11 */            if (i2 > 0) {
/* 13 */                sb = new StringBuilder();
/* 16 */                sb.append(i3);
/* 21 */                sb.append("..");
/* 24 */                sb.append(i);
/* 27 */                sb.append(" step ");
/* 30 */                sb.append(i2);
                    } else {
/* 38 */                sb = new StringBuilder();
/* 41 */                sb.append(i3);
/* 46 */                sb.append(" downTo ");
/* 49 */                sb.append(i);
/* 52 */                sb.append(" step ");
/* 56 */                sb.append(-i2);
                    }
/* 33 */            return sb.toString();
                }
            }
