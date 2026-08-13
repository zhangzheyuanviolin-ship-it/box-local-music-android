            package p000;

            import android.media.ImageWriter;
            
            public final class I0oO11I implements ImageWriter.OnImageReleasedListener, OoilIiI0oi, AutoCloseable {
                public ImageWriter I00iOIl;
                public int I00iiI;
                public I1OooIoiIO I00iiO;

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(ImageWriter.class))) {
/* 15 */                return this.I00iOIl;
                    }
/* 18 */            return null;
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final void onImageReleased(ImageWriter imageWriter) {
/* 5 */             if (this.I00iiO.I00000oIO == null) {
/* 7 */                 return;
                    }
/* 8 */             OIiilo1Ool0o.I00000oIO();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ImageWriter-");
/* 18 */            sb.append(OlOIOoII1i.I00000oOI(this.I00iOIl.getFormat()));
/* 23 */            sb.append('-');
/* 42 */            sb.append((Object) ("Input-" + this.I00iiI));
/* 45 */            return sb.toString();
                }
            }
