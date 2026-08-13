            package p000;

            import java.io.Serializable;
            
            public final class io0O0l1Ol1o implements Comparable, Serializable {
                public static final io0O0l1Ol1o I00iiI = new io0O0l1Ol1o(0);
                public static final io0O0l1Ol1o I00iiO = new io0O0l1Ol1o(1);
                public final int I00iOIl;

                public io0O0l1Ol1o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public final int I00000oIO(io0O0l1Ol1o io0o0l1ol1o) {
                    switch (this.I00iOIl) {
                        case 0:
                            return io0o0l1ol1o == this ? 0 : 1;
                        default:
                            return io0o0l1ol1o == this ? 0 : -1;
                    }
                }

                public final void I00000oOI(StringBuilder sb) {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    throw new AssertionError();
                        default:
/* 8 */                     sb.append("(-∞");
/* 11 */                    return;
                    }
                }

                public final void I0000Il00O(StringBuilder sb) {
                    switch (this.I00iOIl) {
                        case 0:
/* 14 */                    sb.append("+∞)");
/* 17 */                    return;
                        default:
/* 11 */                    throw new AssertionError();
                    }
                }

                @Override
                public final int compareTo(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
                            return ((io0O0l1Ol1o) obj) == this ? 0 : 1;
                        default:
                            return ((io0O0l1Ol1o) obj) == this ? 0 : -1;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof io0O0l1Ol1o) {
                        try {
/* 12 */                    if (I00000oIO((io0O0l1Ol1o) obj) == 0) {
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
