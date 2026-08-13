            package p000;
            
            public final class i0I0liI {
                public float I00000oIO;
                public float I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 43 */                return true;
                    }
/* 6 */             if (!(obj instanceof i0I0liI)) {
/* 41 */                return false;
                    }
/* 9 */             i0I0liI i0i0lii = (i0I0liI) obj;
                    return Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.I00000oIO, i0i0lii.I00000oIO) == 0 && Float.compare(this.I00000oOI, i0i0lii.I00000oOI) == 0;
                }

                public final int hashCode() {
/* 22 */            return Float.hashCode(this.I00000oOI) + OooioIOo1.I0000O(Float.hashCode(1.0f) * 31, 31, this.I00000oIO);
                }

                public final String toString() {
/* 28 */            return "ZoomValue(zoomRatio=1.0, minZoomRatio=" + this.I00000oIO + ", maxZoomRatio=" + this.I00000oOI + ')';
                }
            }
