            package p000;
            
            public final class IlI1oo0ioO {
                public Ol1OiolO0 I00000oIO;
                public IOii1l I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IlI1oo0ioO) {
/* 11 */                IlI1oo0ioO ilI1oo0ioO = (IlI1oo0ioO) obj;
                        return O0000Ioio00.I0000O(this.I00000oIO, ilI1oo0ioO.I00000oIO) && this.I00000oOI == ilI1oo0ioO.I00000oOI;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             Ol1OiolO0 ol1OiolO0 = this.I00000oIO;
/* 19 */            return this.I00000oOI.hashCode() + ((ol1OiolO0 == null ? 0 : ol1OiolO0.hashCode()) * 31);
                }

                public final String toString() {
/* 28 */            return "FadeInFadeOutAnimationItem(key=" + this.I00000oIO + ", transition=" + this.I00000oOI + ")";
                }
            }
