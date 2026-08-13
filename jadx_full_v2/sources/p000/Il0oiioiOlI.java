            package p000;

            import android.graphics.drawable.Drawable;
            
            public final class Il0oiioiOlI extends IoiOl01IilO {
                public Drawable I00000oIO;
                public IoiOl011o I00000oOI;
                public Throwable I0000Il00O;

                @Override
                public final Drawable I00000oIO() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final IoiOl011o I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 40 */                return true;
                    }
/* 6 */             if (!(obj instanceof Il0oiioiOlI)) {
/* 42 */                return false;
                    }
/* 10 */            Il0oiioiOlI il0oiioiOlI = (Il0oiioiOlI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, il0oiioiOlI.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, il0oiioiOlI.I00000oOI) && this.I0000Il00O.equals(il0oiioiOlI.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             Drawable drawable = this.I00000oIO;
/* 10 */            int iHashCode = drawable != null ? drawable.hashCode() : 0;
/* 28 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (iHashCode * 31)) * 31);
                }
            }
