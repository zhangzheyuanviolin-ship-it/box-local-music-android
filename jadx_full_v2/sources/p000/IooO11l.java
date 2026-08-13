            package p000;
            
            public final class IooO11l extends IooO0oO00I {
                public static final IooO11l I00iio = new IooO11l(1, 0, 1);

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IooO11l)) {
/* 36 */                return false;
                    }
/* 9 */             if (isEmpty() && ((IooO11l) obj).isEmpty()) {
/* 34 */                return true;
                    }
/* 20 */            IooO11l iooO11l = (IooO11l) obj;
                    return this.I00iOIl == iooO11l.I00iOIl && this.I00iiI == iooO11l.I00iiI;
                }

                @Override
                public final int hashCode() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return -1;
                    }
/* 15 */            return (this.I00iOIl * 31) + this.I00iiI;
                }

                @Override
                public final boolean isEmpty() {
                    return this.I00iOIl > this.I00iiI;
                }

                @Override
                public final String toString() {
/* 21 */            return this.I00iOIl + ".." + this.I00iiI;
                }
            }
