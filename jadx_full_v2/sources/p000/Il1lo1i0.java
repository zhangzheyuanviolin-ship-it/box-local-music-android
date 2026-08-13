            package p000;
            
            public final class Il1lo1i0 implements Oi0I000 {
                public Oi0Iil I00iOIl;
                public long I00iiI;

                @Override
                public final boolean I00IOO() {
/* 1 */             return false;
                }

                @Override
                public final int I00Io1lO() {
/* 1 */             return 0;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 1 */             return null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Il1lo1i0) {
/* 11 */                Il1lo1i0 il1lo1i0 = (Il1lo1i0) obj;
                        return this.I00iOIl.equals(il1lo1i0.I00iOIl) && this.I00iiI == il1lo1i0.I00iiI;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 25 */            return Integer.hashCode(0) + IIlIOloOOO.I0000O(this.I00iiI, Oi010OO0.I000OOo1O(this.I00iOIl.hashCode() * 31, 31, false), 31);
                }

                public final String toString() {
/* 32 */            return "ExtensionRequestFailure(requestMetadata=" + this.I00iOIl + ", wasImageCaptured=false, frameNumber=" + ((Object) IllIiOlOoIll.I00000oIO(this.I00iiI)) + ", reason=0)";
                }
            }
