            package p000;

            import java.io.Serializable;
            
            public final class lO0IIliiOi0I implements Comparable, Serializable {
                public static final lO0IIliiOi0I I00iiI = new lO0IIliiOi0I(0);
                public static final lO0IIliiOi0I I00iiO = new lO0IIliiOi0I(1);
                public final int I00iOIl;

                public lO0IIliiOi0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public final void I00000oIO(StringBuilder sb) {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new AssertionError();
                        default:
/* 8 */                     sb.append("(-∞");
/* 11 */                    return;
                    }
                }

                public final void I00000oOI(StringBuilder sb) {
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    sb.append("+∞)");
/* 17 */                    return;
                        default:
/* 11 */                    throw new AssertionError();
                    }
                }

                public final int I0000Il00O(lO0IIliiOi0I lo0iiliioi0i) {
                    switch (this.I00iOIl) {
                        case 0:
                            return lo0iiliioi0i == this ? 0 : 1;
                        default:
                            return lo0iiliioi0i == this ? 0 : -1;
                    }
                }

                @Override
                public final int compareTo(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
                            return ((lO0IIliiOi0I) obj) == this ? 0 : 1;
                        default:
                            return ((lO0IIliiOi0I) obj) == this ? 0 : -1;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof lO0IIliiOi0I) {
                        try {
/* 12 */                    if (I0000Il00O((lO0IIliiOi0I) obj) == 0) {
/* 14 */                        return true;
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return System.identityHashCode(this);
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 9 */                     return "+∞";
                        default:
/* 6 */                     return "-∞";
                    }
                }
            }
