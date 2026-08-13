            package p000;
            
            public final class I1Olol0 extends I1Oo0lO0 {
                public OIoOo11 I00000oIO;
                public Il0oiioiOlI I00000oOI;

                @Override
                public final OIoOo11 I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1Olol0)) {
/* 32 */                return false;
                    }
/* 9 */             I1Olol0 i1Olol0 = (I1Olol0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1Olol0.I00000oIO) && this.I00000oOI.equals(i1Olol0.I00000oOI);
                }

                public final int hashCode() {
/* 1 */             OIoOo11 oIoOo11 = this.I00000oIO;
/* 19 */            return this.I00000oOI.hashCode() + ((oIoOo11 == null ? 0 : oIoOo11.hashCode()) * 31);
                }

                public final String toString() {
/* 28 */            return "Error(painter=" + this.I00000oIO + ", result=" + this.I00000oOI + ')';
                }
            }
