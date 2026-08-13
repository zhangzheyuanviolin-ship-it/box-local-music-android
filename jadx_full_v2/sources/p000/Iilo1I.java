            package p000;

            import android.graphics.Canvas;
            import android.graphics.drawable.Animatable;
            import android.graphics.drawable.Drawable;
            
            public final class Iilo1I extends OIoOo11 implements OOooI0ioo1o {
                public Drawable I00ilI0I1;
                public OIooliIO0 I00ilO0;
                public OIooliIO0 I00io1l;
                public OllO00oiil I00ioIO;

                @Override
                public final void I00000oIO(float f) {
/* 17 */            this.I00ilI0I1.setAlpha(lIiioliIlo.I0000Il00O(O1OooO0IlOo.I000II(f * 255.0f), 0, 255));
                }

                @Override
                public final void I00000oOI() {
/* 1 */             I0000O();
                }

                @Override
                public final void I0000Il00O(IOOil0 iOOil0) {
/* 9 */             this.I00ilI0I1.setColorFilter(iOOil0 != null ? iOOil0.I00000oIO : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I0000O() {
/* 1 */             Drawable drawable = this.I00ilI0I1;
/* 5 */             if (drawable instanceof Animatable) {
/* 10 */                ((Animatable) drawable).stop();
                    }
/* 14 */            drawable.setVisible(false, false);
/* 18 */            drawable.setCallback(null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I0000oI00() {
/* 1 */             Drawable drawable = this.I00ilI0I1;
/* 11 */            drawable.setCallback((Drawable.Callback) this.I00ioIO.getValue());
/* 15 */            drawable.setVisible(true, true);
/* 20 */            if (drawable instanceof Animatable) {
/* 24 */                ((Animatable) drawable).start();
                    }
                }

                @Override
                public final void I0001Ioi1lo(O0iOOoiioO o0iOOoiioO) {
                    int i;
/* 1 */             Drawable drawable = this.I00ilI0I1;
/* 3 */             int iOrdinal = o0iOOoiioO.ordinal();
/* 7 */             if (iOrdinal != 0) {
/* 9 */                 i = 1;
/* 10 */                if (iOrdinal != 1) {
/* 13 */                    I000II.I00000oIO();
/* 16 */                    return;
                        }
                    } else {
/* 17 */                i = 0;
                    }
/* 18 */            drawable.setLayoutDirection(i);
                }

                @Override
                public final long I000OOo1O() {
/* 9 */             return ((Ol0i1I) this.I00io1l.getValue()).I00000oIO;
                }

                @Override
                public final void I000OiO(IilloIOOO0i iilloIOOO0i) {
/* 5 */             IIolOo iIolOoI0010o = iilloIOOO0i.I00iiI().I0010o();
/* 17 */            ((Number) this.I00ilO0.getValue()).intValue();
/* 20 */            Drawable drawable = this.I00ilI0I1;
/* 47 */            drawable.setBounds(0, 0, O1OooO0IlOo.I000II(Ol0i1I.I0000oI00(iilloIOOO0i.I0000oI00())), O1OooO0IlOo.I000II(Ol0i1I.I0000Il00O(iilloIOOO0i.I0000oI00())));
                    try {
/* 50 */                iIolOoI0010o.I000II();
/* 53 */                Canvas canvas = I0lO01i00oi.I00000oIO;
/* 60 */                drawable.draw(((I0lIooIo1) iIolOoI0010o).I00000oIO);
                    } finally {
/* 68 */                iIolOoI0010o.I00100l0();
                    }
                }
            }
