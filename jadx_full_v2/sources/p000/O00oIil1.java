            package p000;
            
            public final class O00oIil1 {
                public final IOIOill I00000oIO;
                public final IOIOill I00000oOI;
                public final IOIOill I0000Il00O;

                public O00oIil1(IOIOill iOIOill, IOIOill iOIOill2, IOIOill iOIOill3) {
/* 4 */             this.I00000oIO = iOIOill;
/* 6 */             this.I00000oOI = iOIOill2;
/* 8 */             this.I0000Il00O = iOIOill3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof O00oIil1)) {
/* 43 */                return false;
                    }
/* 9 */             O00oIil1 o00oIil1 = (O00oIil1) obj;
                    return this.I00000oIO.equals(o00oIil1.I00000oIO) && this.I00000oOI.equals(o00oIil1.I00000oOI) && this.I0000Il00O.equals(o00oIil1.I0000Il00O);
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "PlatformMutabilityMapping(javaClass=" + this.I00000oIO + ", kotlinReadOnly=" + this.I00000oOI + ", kotlinMutable=" + this.I0000Il00O + ')';
                }
            }
