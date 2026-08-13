            package p000;

            import android.R;
            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.view.View;
            import android.view.animation.AnimationUtils;
            import java.lang.invoke.VarHandle;
            
/* 18 */    public final class Oi1ii0l0 extends View {
                public static final int[] I00ilO0 = {R.attr.state_pressed, R.attr.state_enabled};
                public static final int[] I00io1l = new int[0];
                public Ooii1l I00iOIl;
                public Boolean I00iiI;
                public Long I00iiO;
                public OOIl1i1 I00iio;
                public I0OIOO00l0O I00ilI0I1;

                private final void setRippleState(boolean z) throws InterruptedException {
/* 1 */             long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 5 */             Runnable runnable = this.I00iio;
/* 7 */             if (runnable != null) {
/* 9 */                 removeCallbacks(runnable);
/* 12 */                runnable.run();
                    }
/* 15 */            Long l = this.I00iiO;
/* 26 */            long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
/* 28 */            if (z || jLongValue >= 5) {
/* 60 */                int[] iArr = z ? I00ilO0 : I00io1l;
/* 62 */                Ooii1l ooii1l = this.I00iOIl;
/* 64 */                if (ooii1l != null) {
/* 66 */                    ooii1l.setState(iArr);
                        }
                    } else {
/* 39 */                OOIl1i1 oOIl1i1 = new OOIl1i1(3);
/* 42 */                oOIl1i1.I00iiI = this;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                this.I00iio = oOIl1i1;
/* 51 */                postDelayed(oOIl1i1, 50L);
                    }
/* 73 */            this.I00iiO = Long.valueOf(jCurrentAnimationTimeMillis);
                }

                private static final void setRippleState$lambda$1(Oi1ii0l0 oi1ii0l0) {
/* 1 */             Ooii1l ooii1l = oi1ii0l0.I00iOIl;
/* 3 */             if (ooii1l != null) {
/* 7 */                 ooii1l.setState(I00io1l);
                    }
/* 11 */            oi1ii0l0.I00iio = null;
                }

                public final void I00000oOI(OOIII1oOoolO oOIII1oOoolO, boolean z, long j, int i, long j2, float f, I0OIOO00l0O i0OIOO00l0O) throws InterruptedException {
/* 1 */             long j3 = oOIII1oOoolO.I00000oIO;
/* 5 */             if (this.I00iOIl == null || !Boolean.valueOf(z).equals(this.I00iiI)) {
/* 38 */                Ooii1l ooii1l = new Ooii1l(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
/* 41 */                ooii1l.I00iOIl = z;
/* 43 */                VarHandle.storeStoreFence();
/* 46 */                setBackground(ooii1l);
/* 49 */                this.I00iOIl = ooii1l;
/* 55 */                this.I00iiI = Boolean.valueOf(z);
                    }
/* 57 */            Ooii1l ooii1l2 = this.I00iOIl;
/* 59 */            this.I00ilI0I1 = i0OIOO00l0O;
/* 66 */            I0000oI00(j, i, j2, f);
/* 69 */            if (z) {
/* 91 */                ooii1l2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
                    } else {
/* 113 */               ooii1l2.setHotspot(ooii1l2.getBounds().centerX(), ooii1l2.getBounds().centerY());
                    }
/* 117 */           setRippleState(true);
                }

                public final void I0000Il00O() throws InterruptedException {
/* 2 */             this.I00ilI0I1 = null;
/* 4 */             OOIl1i1 oOIl1i1 = this.I00iio;
/* 6 */             if (oOIl1i1 != null) {
/* 8 */                 removeCallbacks(oOIl1i1);
/* 13 */                this.I00iio.run();
                    } else {
/* 17 */                Ooii1l ooii1l = this.I00iOIl;
/* 19 */                if (ooii1l != null) {
/* 23 */                    ooii1l.setState(I00io1l);
                        }
                    }
/* 26 */            Ooii1l ooii1l2 = this.I00iOIl;
/* 28 */            if (ooii1l2 == null) {
/* 30 */                return;
                    }
/* 32 */            ooii1l2.setVisible(false, false);
/* 35 */            unscheduleDrawable(ooii1l2);
                }

                public final void I0000O() throws InterruptedException {
/* 2 */             setRippleState(false);
                }

                public final void I0000oI00(long j, int i, long j2, float f) {
/* 1 */             Ooii1l ooii1l = this.I00iOIl;
/* 3 */             if (ooii1l == null) {
/* 5 */                 return;
                    }
/* 10 */            if (ooii1l.getRadius() != i) {
/* 12 */                ooii1l.setRadius(i);
                    }
/* 19 */            if (f > 1.0f) {
/* 21 */                f = 1.0f;
                    }
/* 22 */            long jI0000Il00O = IOOiio0i.I0000Il00O(f, j2);
/* 26 */            IOOiio0i iOOiio0i = ooii1l.I00iiI;
/* 39 */            if (!(iOOiio0i == null ? false : Ooi0i1.I00000oOI(iOOiio0i.I00000oIO, jI0000Il00O))) {
/* 45 */                ooii1l.I00iiI = IOOiio0i.I00000oIO(jI0000Il00O);
/* 55 */                ooii1l.setColor(ColorStateList.valueOf(iiO01ll11o1l.I000OOo1O(jI0000Il00O)));
                    }
/* 88 */            Rect rect = new Rect(0, 0, O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (j >> 32))), O1OooO0IlOo.I000II(Float.intBitsToFloat((int) (j & 4294967295L))));
/* 93 */            setLeft(rect.left);
/* 98 */            setTop(rect.top);
/* 103 */           setRight(rect.right);
/* 108 */           setBottom(rect.bottom);
/* 111 */           ooii1l.setBounds(rect);
                }

                @Override
                public final void draw(Canvas canvas) throws InterruptedException {
/* 5 */             if (isAttachedToWindow()) {
/* 11 */                super.draw(canvas);
                    } else {
/* 7 */                 I0000Il00O();
                    }
                }

                @Override
                public final void invalidateDrawable(Drawable drawable) {
/* 1 */             I0OIOO00l0O i0OIOO00l0O = this.I00ilI0I1;
/* 3 */             if (i0OIOO00l0O != null) {
/* 5 */                 i0OIOO00l0O.invoke();
                    }
                }

                @Override
                public final void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                @Override
/* 19 */        public final void refreshDrawableState() {
                }

                @Override
/* 398 */       public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }
            }
