            package p000;
            
            public final class i00lo01io {
                public II1i0o0 I00000oIO;
                public float I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 42 */                return true;
                    }
/* 18 */            if (!i00lo01io.class.equals(obj != null ? obj.getClass() : null)) {
/* 44 */                return false;
                    }
/* 21 */            i00lo01io i00lo01ioVar = (i00lo01io) obj;
                    return this.I00000oIO.equals(i00lo01ioVar.I00000oIO) && this.I00000oOI == i00lo01ioVar.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Float.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "WindowMetrics(_bounds=" + this.I00000oIO + ", density=" + this.I00000oOI + ')';
                }
            }
