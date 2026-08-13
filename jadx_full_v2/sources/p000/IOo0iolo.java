            package p000;

            import android.net.Uri;
            
            public final class IOo0iolo {
                public final Uri I00000oIO;
                public final boolean I00000oOI;

                public IOo0iolo(boolean z, Uri uri) {
/* 4 */             this.I00000oIO = uri;
/* 6 */             this.I00000oOI = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 42 */                return true;
                    }
/* 18 */            if (!IOo0iolo.class.equals(obj != null ? obj.getClass() : null)) {
/* 40 */                return false;
                    }
/* 21 */            IOo0iolo iOo0iolo = (IOo0iolo) obj;
                    return this.I00000oIO.equals(iOo0iolo.I00000oIO) && this.I00000oOI == iOo0iolo.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }
