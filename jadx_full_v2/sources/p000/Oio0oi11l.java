            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            
            public final class Oio0oi11l extends Ilioo0O0O {
                public final Object I00iio;
                public final IoiIIlOol1 I00ilI0I1;
                public final int I00ilO0;
                public final int I00io1l;

                public Oio0oi11l(IoiO1IO1I1i ioiO1IO1I1i, Size size, IoiIIlOol1 ioiIIlOol1) {
/* 1 */             super(ioiO1IO1I1i);
/* 9 */             this.I00iio = new Object();
/* 11 */            if (size == null) {
/* 19 */                this.I00ilO0 = this.I00iiI.I0001Ioi1lo();
/* 27 */                this.I00io1l = this.I00iiI.I0000O();
                    } else {
/* 34 */                this.I00ilO0 = size.getWidth();
/* 40 */                this.I00io1l = size.getHeight();
                    }
/* 42 */            this.I00ilI0I1 = ioiIIlOol1;
                }

                public final void I0000Il00O(Rect rect) {
/* 1 */             if (rect != null) {
/* 5 */                 Rect rect2 = new Rect(rect);
/* 17 */                if (!rect2.intersect(0, 0, this.I00ilO0, this.I00io1l)) {
/* 19 */                    rect2.setEmpty();
                        }
                    }
                    synchronized (this.I00iio) {
                    }
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final IoiIIlOol1 I00i0oil() {
/* 1 */             return this.I00ilI0I1;
                }
            }
