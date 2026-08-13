            package p000;

            import android.hardware.HardwareBuffer;
            import android.media.Image;
            
            public final class I0oIollOil0 implements IoiiIliOIlli {
                public Image I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public long I00ilI0I1;

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 9 */             boolean zEquals = o0IOli0o0.equals(oOoOl1001II.I00000oOI(Image.class));
/* 13 */            Image image = this.I00iOIl;
/* 15 */            if (zEquals) {
/* 17 */                return image;
                    }
/* 28 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(HardwareBuffer.class))) {
/* 30 */                return image.getHardwareBuffer();
                    }
/* 35 */            return null;
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                public final String toString() {
/* 47 */            return "Image-" + OlOIOoII1i.I00000oOI(this.I00iiI) + "-w" + this.I00iiO + 'h' + this.I00iio + "-t" + this.I00ilI0I1;
                }
            }
