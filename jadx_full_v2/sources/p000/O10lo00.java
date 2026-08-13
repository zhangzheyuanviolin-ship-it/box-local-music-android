            package p000;

            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.AnimationUtils;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            
            public final class O10lo00 implements View.OnTouchListener {
                public static final int I00oI0i = ViewConfiguration.getTapTimeout();
                public I1ili10li I00iOIl;
                public AccelerateInterpolator I00iiI;
                public Iio010 I00iiO;
                public I0lil01 I00iio;
                public float[] I00ilI0I1;
                public float[] I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public float[] I00l0I0l0lO1;
                public float[] I00l0OO0IO;
                public float[] I00li1OI;
                public boolean I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public Iio010 I00o101lO;

                public static float I00000oOI(float f, float f2, float f3) {
                    return f > f3 ? f3 : f < f2 ? f2 : f;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oIO(float f, float f2, float f3, int i) {
                    float fI00000oOI;
                    float interpolation;
/* 3 */             float f4 = this.I00ilI0I1[i];
/* 7 */             float f5 = this.I00ilO0[i];
/* 9 */             AccelerateInterpolator accelerateInterpolator = this.I00iiI;
/* 13 */            float fI00000oOI2 = I00000oOI(f4 * f2, 0.0f, f5);
/* 26 */            float fI0000Il00O = I0000Il00O(f2 - f, fI00000oOI2) - I0000Il00O(f, fI00000oOI2);
/* 29 */            if (fI0000Il00O < 0.0f) {
/* 36 */                interpolation = -accelerateInterpolator.getInterpolation(-fI0000Il00O);
                    } else {
/* 40 */                if (fI0000Il00O <= 0.0f) {
/* 55 */                    fI00000oOI = 0.0f;
/* 58 */                    if (fI00000oOI != 0.0f) {
/* 12 */                        return 0.0f;
                            }
/* 63 */                    float f6 = this.I00l0I0l0lO1[i];
/* 67 */                    float f7 = this.I00l0OO0IO[i];
/* 71 */                    float f8 = this.I00li1OI[i];
/* 73 */                    float f9 = f6 * f3;
                            return fI00000oOI > 0.0f ? I00000oOI(fI00000oOI * f9, f7, f8) : -I00000oOI((-fI00000oOI) * f9, f7, f8);
                        }
/* 42 */                interpolation = accelerateInterpolator.getInterpolation(fI0000Il00O);
                    }
/* 50 */            fI00000oOI = I00000oOI(interpolation, -1.0f, 1.0f);
/* 58 */            if (fI00000oOI != 0.0f) {
                    }
                }

                public final float I0000Il00O(float f, float f2) {
/* 4 */             if (f2 != 0.0f) {
/* 7 */                 int i = this.I00io1l;
/* 10 */                if (i == 0 || i == 1) {
/* 27 */                    if (f < f2) {
/* 33 */                        if (f >= 0.0f) {
/* 36 */                            return 1.0f - (f / f2);
                                }
/* 40 */                        if (this.I00o0iI0io1 && i == 1) {
/* 31 */                            return 1.0f;
                                }
                            }
                        } else if (i == 2 && f < 0.0f) {
/* 23 */                    return f / (-f2);
                        }
                    }
/* 1 */             return 0.0f;
                }

                public final void I0000O() {
/* 3 */             int i = 0;
/* 4 */             if (this.I00lli11) {
/* 6 */                 this.I00o0iI0io1 = false;
/* 8 */                 return;
                    }
/* 9 */             I1ili10li i1ili10li = this.I00iOIl;
/* 11 */            i1ili10li.getClass();
/* 14 */            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 22 */            int i2 = (int) (jCurrentAnimationTimeMillis - i1ili10li.I0000oI00);
/* 23 */            int i3 = i1ili10li.I00000oOI;
/* 25 */            if (i2 > i3) {
/* 27 */                i = i3;
                    } else if (i2 >= 0) {
/* 32 */                i = i2;
                    }
/* 33 */            i1ili10li.I000OOo1O = i;
/* 39 */            i1ili10li.I000O01llI0 = i1ili10li.I00000oIO(jCurrentAnimationTimeMillis);
/* 41 */            i1ili10li.I000II = jCurrentAnimationTimeMillis;
                }

                public final boolean I0000oI00() {
                    Iio010 iio010;
                    int count;
/* 1 */             I1ili10li i1ili10li = this.I00iOIl;
/* 3 */             float f = i1ili10li.I0000O;
/* 10 */            int iAbs = (int) (f / Math.abs(f));
/* 13 */            Math.abs(i1ili10li.I0000Il00O);
/* 17 */            if (iAbs != 0 && (count = (iio010 = this.I00o101lO).getCount()) != 0) {
/* 28 */                int childCount = iio010.getChildCount();
/* 32 */                int firstVisiblePosition = iio010.getFirstVisiblePosition();
/* 36 */                int i = firstVisiblePosition + childCount;
/* 39 */                if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && iio010.getChildAt(0).getTop() >= 0)) : !(i >= count && iio010.getChildAt(childCount - 1).getBottom() <= iio010.getHeight())) {
/* 38 */                    return true;
                        }
                    }
/* 16 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
                
                    if (r1 != 3) goto L30;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i;
/* 1 */             Iio010 iio010 = this.I00iiO;
/* 6 */             if (this.I00o0l1o1o0) {
/* 10 */                int actionMasked = motionEvent.getActionMasked();
/* 14 */                int i2 = 1;
/* 15 */                if (actionMasked != 0) {
/* 17 */                    if (actionMasked != 1) {
/* 20 */                        if (actionMasked != 2) {
                                }
                            }
/* 26 */                    I0000O();
/* 5 */                     return false;
                        }
/* 30 */                this.I00lll10 = true;
/* 32 */                this.I00ll1 = false;
/* 48 */                float fI00000oIO = I00000oIO(motionEvent.getX(), view.getWidth(), iio010.getWidth(), 0);
/* 66 */                float fI00000oIO2 = I00000oIO(motionEvent.getY(), view.getHeight(), iio010.getHeight(), 1);
/* 70 */                I1ili10li i1ili10li = this.I00iOIl;
/* 72 */                i1ili10li.I0000Il00O = fI00000oIO;
/* 74 */                i1ili10li.I0000O = fI00000oIO2;
/* 78 */                if (!this.I00o0iI0io1 && I0000oI00()) {
/* 86 */                    I0lil01 i0lil01 = this.I00iio;
/* 88 */                    if (i0lil01 == null) {
/* 92 */                        i0lil01 = new I0lil01(i2);
/* 95 */                        i0lil01.I00iiI = this;
/* 97 */                        VarHandle.storeStoreFence();
/* 100 */                       this.I00iio = i0lil01;
                            }
/* 102 */                   this.I00o0iI0io1 = true;
/* 104 */                   this.I00lli11 = true;
/* 108 */                   if (this.I00ll1 || (i = this.I00ioIO) <= 0) {
/* 121 */                       i0lil01.run();
                            } else {
                                long j = i;
/* 115 */                       WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 117 */                       iio010.postOnAnimationDelayed(i0lil01, j);
                            }
/* 124 */                   this.I00ll1 = true;
                        }
                    }
/* 5 */             return false;
                }
            }
