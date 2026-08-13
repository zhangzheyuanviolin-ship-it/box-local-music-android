            package p000;
            
            public final class IIIioo implements IIIlOi1ooii {
                public final Throwable I00000oOI;

                public IIIioo(Throwable th) {
/* 4 */             this.I00000oOI = th;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof IIIioo) && O0000Ioio00.I0000O(this.I00000oOI, ((IIIioo) obj).I00000oOI);
                }

                public final int hashCode() {
/* 1 */             Throwable th = this.I00000oOI;
/* 3 */             if (th == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return th.hashCode();
                }

                public final String toString() {
/* 18 */            return "Closed(cause=" + this.I00000oOI + ')';
                }
            }
