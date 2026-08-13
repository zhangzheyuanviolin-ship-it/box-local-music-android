            package p000;
            
            public final class IIo0olOi0li extends IIo0l10O01O0 {
                public final IIlOl1oOlo1o I00000oIO;

                public IIo0olOi0li(IIlOl1oOlo1o iIlOl1oOlo1o) {
/* 4 */             this.I00000oIO = iIlOl1oOlo1o;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof IIo0olOi0li) && this.I00000oIO.equals(((IIo0olOi0li) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 18 */            return "CameraStateOpen(cameraDevice=" + this.I00000oIO + ')';
                }
            }
