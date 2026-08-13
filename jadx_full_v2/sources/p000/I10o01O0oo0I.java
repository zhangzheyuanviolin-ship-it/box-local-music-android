            package p000;

            import android.graphics.drawable.Drawable;
            import android.os.Handler;
            
            public final class I10o01O0oo0I implements Drawable.Callback {
                public final int I00iOIl;
                public Object I00iiI;

                public I10o01O0oo0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void invalidateDrawable(Drawable drawable) {
                    long jFloatToRawIntBits;
                    switch (this.I00iOIl) {
                        case 0:
/* 97 */                    ((I10o0lIl) this.I00iiI).invalidateSelf();
                            break;
                        default:
/* 8 */                     Iilo1I iilo1I = (Iilo1I) this.I00iiI;
/* 10 */                    OIooliIO0 oIooliIO0 = iilo1I.I00ilO0;
/* 28 */                    oIooliIO0.setValue(Integer.valueOf(((Number) oIooliIO0.getValue()).intValue() + 1));
/* 31 */                    Drawable drawable2 = iilo1I.I00ilI0I1;
/* 33 */                    O0ioIllo0i1 o0ioIllo0i1 = Iilo1iOoI1l.I00000oIO;
/* 39 */                    if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
/* 78 */                        jFloatToRawIntBits = 9205357640488583168L;
                            } else {
/* 47 */                        float intrinsicWidth = drawable2.getIntrinsicWidth();
/* 52 */                        float intrinsicHeight = drawable2.getIntrinsicHeight();
/* 76 */                        jFloatToRawIntBits = (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
                            }
/* 89 */                    iilo1I.I00io1l.setValue(Ol0i1I.I00000oIO(jFloatToRawIntBits));
                            break;
                    }
                }

                @Override
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    ((I10o0lIl) this.I00iiI).scheduleSelf(runnable, j);
                            break;
                        default:
/* 14 */                    ((Handler) Iilo1iOoI1l.I00000oIO.getValue()).postAtTime(runnable, j);
                            break;
                    }
                }

                @Override
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    switch (this.I00iOIl) {
                        case 0:
/* 22 */                    ((I10o0lIl) this.I00iiI).unscheduleSelf(runnable);
                            break;
                        default:
/* 14 */                    ((Handler) Iilo1iOoI1l.I00000oIO.getValue()).removeCallbacks(runnable);
                            break;
                    }
                }
            }
