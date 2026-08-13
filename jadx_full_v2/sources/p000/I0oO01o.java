            package p000;

            import android.graphics.Matrix;
            import android.media.Image;
            import java.lang.invoke.VarHandle;
            
            public final class I0oO01o implements IoiO1IO1I1i {
                public final Image I00iOIl;
                public final IIOOoll[] I00iiI;
                public final I1l0l0 I00iiO;

                public I0oO01o(Image image) {
/* 4 */             this.I00iOIl = image;
/* 6 */             Image.Plane[] planes = image.getPlanes();
/* 11 */            if (planes != null) {
/* 16 */                this.I00iiI = new IIOOoll[planes.length];
/* 19 */                for (int i = 0; i < planes.length; i++) {
/* 21 */                    IIOOoll[] iIOOollArr = this.I00iiI;
/* 25 */                    Image.Plane plane = planes[i];
/* 28 */                    IIOOoll iIOOoll = new IIOOoll(3);
/* 31 */                    iIOOoll.I00iiI = plane;
/* 33 */                    VarHandle.storeStoreFence();
/* 36 */                    iIOOollArr[i] = iIOOoll;
                        }
                    } else {
/* 43 */                this.I00iiI = new IIOOoll[0];
                    }
/* 62 */            this.I00iiO = I1l0l0.I0001Ioi1lo(Olo0o1II0.I00000oOI, image.getTimestamp(), 0, new Matrix(), 0);
                }

                @Override
                public final int I0000O() {
/* 3 */             return this.I00iOIl.getHeight();
                }

                @Override
                public final int I0001Ioi1lo() {
/* 3 */             return this.I00iOIl.getWidth();
                }

                @Override
                public final IoiO11I0o0o1[] I00111O() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final IoiIIlOol1 I00i0oil() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Image I00ll1() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final int getFormat() {
/* 3 */             return this.I00iOIl.getFormat();
                }
            }
