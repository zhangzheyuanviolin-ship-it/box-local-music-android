            package p000;

            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import java.lang.invoke.VarHandle;
            
/* 27 */    public abstract class Ill00I1oio implements View.OnTouchListener, View.OnAttachStateChangeListener {
                public final float I00iOIl;
                public final int I00iiI;
                public final int I00iiO;
                public final View I00iio;
                public Iliooii1i I00ilI0I1;
                public Iliooii1i I00ilO0;
                public boolean I00io1l;
                public int I00ioIO;
                public final int[] I00l0I0l0lO1 = new int[2];

                public Ill00I1oio(View view) {
/* 9 */             this.I00iio = view;
/* 12 */            view.setLongClickable(true);
/* 15 */            view.addOnAttachStateChangeListener(this);
/* 31 */            this.I00iOIl = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
/* 33 */            int tapTimeout = ViewConfiguration.getTapTimeout();
/* 37 */            this.I00iiI = tapTimeout;
/* 45 */            this.I00iiO = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
                }

                public final void I00000oIO() {
/* 1 */             Iliooii1i iliooii1i = this.I00ilO0;
/* 3 */             View view = this.I00iio;
/* 5 */             if (iliooii1i != null) {
/* 7 */                 view.removeCallbacks(iliooii1i);
                    }
/* 10 */            Iliooii1i iliooii1i2 = this.I00ilI0I1;
/* 12 */            if (iliooii1i2 != null) {
/* 14 */                view.removeCallbacks(iliooii1i2);
                    }
                }

                public abstract Ol01O0lOO I00000oOI();

                public abstract boolean I0000Il00O();

                public boolean I0000O() {
/* 1 */             Ol01O0lOO ol01O0lOOI00000oOI = I00000oOI();
/* 5 */             if (ol01O0lOOI00000oOI == null || !ol01O0lOOI00000oOI.I00000oIO()) {
/* 16 */                return true;
                    }
/* 13 */            ol01O0lOOI00000oOI.dismiss();
/* 16 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    Iio010 iio010I000OiO;
/* 1 */             boolean z2 = this.I00io1l;
/* 4 */             View view2 = this.I00iio;
/* 8 */             if (z2) {
/* 10 */                Ol01O0lOO ol01O0lOOI00000oOI = I00000oOI();
/* 14 */                if (ol01O0lOOI00000oOI == null || !ol01O0lOOI00000oOI.I00000oIO() || (iio010I000OiO = ol01O0lOOI00000oOI.I000OiO()) == null || !iio010I000OiO.isShown()) {
/* 102 */                   z = !I0000O();
                        } else {
/* 36 */                    MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
/* 40 */                    int[] iArr = this.I00l0I0l0lO1;
/* 42 */                    view2.getLocationOnScreen(iArr);
/* 51 */                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
/* 54 */                    iio010I000OiO.getLocationOnScreen(iArr);
/* 65 */                    motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
/* 70 */                    boolean zI00000oOI = iio010I000OiO.I00000oOI(motionEventObtainNoHistory, this.I00ioIO);
/* 74 */                    motionEventObtainNoHistory.recycle();
/* 77 */                    int actionMasked = motionEvent.getActionMasked();
/* 87 */                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
/* 88 */                    if (!zI00000oOI || !z3) {
                            }
                        }
                    } else if (view2.isEnabled()) {
/* 113 */               int actionMasked2 = motionEvent.getActionMasked();
/* 117 */               if (actionMasked2 == 0) {
/* 212 */                   this.I00ioIO = motionEvent.getPointerId(0);
/* 214 */                   Iliooii1i iliooii1i = this.I00ilI0I1;
/* 216 */                   if (iliooii1i == null) {
/* 220 */                       iliooii1i = new Iliooii1i(0);
/* 223 */                       iliooii1i.I00iiI = this;
/* 225 */                       VarHandle.storeStoreFence();
/* 228 */                       this.I00ilI0I1 = iliooii1i;
                            }
/* 233 */                   view2.postDelayed(iliooii1i, this.I00iiI);
/* 236 */                   Iliooii1i iliooii1i2 = this.I00ilO0;
/* 238 */                   if (iliooii1i2 == null) {
/* 242 */                       iliooii1i2 = new Iliooii1i(1);
/* 245 */                       iliooii1i2.I00iiI = this;
/* 247 */                       VarHandle.storeStoreFence();
/* 250 */                       this.I00ilO0 = iliooii1i2;
                            }
/* 255 */                   view2.postDelayed(iliooii1i2, this.I00iiO);
                        } else if (actionMasked2 == 1) {
/* 204 */                   I00000oIO();
                        } else if (actionMasked2 == 2) {
/* 130 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.I00ioIO);
/* 134 */                   if (iFindPointerIndex >= 0) {
/* 136 */                       float x = motionEvent.getX(iFindPointerIndex);
/* 140 */                       float y = motionEvent.getY(iFindPointerIndex);
/* 144 */                       float f = this.I00iOIl;
/* 146 */                       float f2 = -f;
/* 149 */                       if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
/* 186 */                           I00000oIO();
/* 193 */                           view2.getParent().requestDisallowInterceptTouchEvent(true);
/* 200 */                           if (I0000Il00O()) {
/* 202 */                               z = true;
                                    }
/* 259 */                           if (z) {
/* 261 */                               long jUptimeMillis = SystemClock.uptimeMillis();
/* 270 */                               MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 274 */                               view2.onTouchEvent(motionEventObtain);
/* 277 */                               motionEventObtain.recycle();
                                    }
                                }
                            }
                        } else if (actionMasked2 == 3) {
                        }
/* 258 */               z = false;
/* 259 */               if (z) {
                        }
                    } else {
/* 258 */               z = false;
/* 259 */               if (z) {
                        }
                    }
/* 280 */           this.I00io1l = z;
                    return z || z2;
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 2 */             this.I00io1l = false;
/* 5 */             this.I00ioIO = -1;
/* 7 */             Iliooii1i iliooii1i = this.I00ilI0I1;
/* 9 */             if (iliooii1i != null) {
/* 13 */                this.I00iio.removeCallbacks(iliooii1i);
                    }
                }

                @Override
/* 28 */        public final void onViewAttachedToWindow(View view) {
                }
            }
