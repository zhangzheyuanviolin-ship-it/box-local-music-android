            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.AccelerateInterpolator;
            import android.widget.ListAdapter;
            import android.widget.ListView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            
            public class Iio010 extends ListView {
                public final Rect I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public Iio0011 I00io1l;
                public boolean I00ioIO;
                public final boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public O10lo00 I00li1OI;
                public I0lil01 I00ll1;

                public Iio010(Context context, boolean z) {
/* 5 */             super(context, null, R.attr.dropDownListViewStyle);
/* 13 */            this.I00iOIl = new Rect();
/* 16 */            this.I00iiI = 0;
/* 18 */            this.I00iiO = 0;
/* 20 */            this.I00iio = 0;
/* 22 */            this.I00ilI0I1 = 0;
/* 24 */            this.I00l0I0l0lO1 = z;
/* 26 */            setCacheColorHint(0);
                }

                public final int I00000oIO(int i, int i2) {
/* 1 */             int listPaddingTop = getListPaddingTop();
/* 5 */             int listPaddingBottom = getListPaddingBottom();
/* 9 */             int dividerHeight = getDividerHeight();
/* 13 */            Drawable divider = getDivider();
/* 17 */            ListAdapter adapter = getAdapter();
/* 21 */            if (adapter == null) {
/* 23 */                return listPaddingTop + listPaddingBottom;
                    }
/* 25 */            int measuredHeight = listPaddingTop + listPaddingBottom;
/* 27 */            if (dividerHeight <= 0 || divider == null) {
/* 32 */                dividerHeight = 0;
                    }
/* 33 */            int count = adapter.getCount();
/* 39 */            int i3 = 0;
/* 40 */            View view = null;
/* 41 */            for (int i4 = 0; i4 < count; i4++) {
/* 43 */                int itemViewType = adapter.getItemViewType(i4);
/* 47 */                if (itemViewType != i3) {
/* 49 */                    view = null;
/* 50 */                    i3 = itemViewType;
                        }
/* 51 */                view = adapter.getView(i4, view, this);
/* 55 */                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 59 */                if (layoutParams == null) {
/* 61 */                    layoutParams = generateDefaultLayoutParams();
/* 65 */                    view.setLayoutParams(layoutParams);
                        }
/* 68 */                int i5 = layoutParams.height;
/* 83 */                view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
/* 86 */                view.forceLayout();
/* 89 */                if (i4 > 0) {
/* 91 */                    measuredHeight += dividerHeight;
                        }
/* 96 */                measuredHeight += view.getMeasuredHeight();
/* 97 */                if (measuredHeight >= i2) {
/* 99 */                    return i2;
                        }
                    }
/* 106 */           return measuredHeight;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(MotionEvent motionEvent, int i) {
                    boolean z;
                    boolean z2;
                    View childAt;
                    View childAt2;
                    boolean z3;
/* 5 */             int actionMasked = motionEvent.getActionMasked();
/* 12 */            if (actionMasked == 1) {
/* 29 */                z = false;
                    } else {
/* 14 */                if (actionMasked != 2) {
/* 17 */                    if (actionMasked != 3) {
/* 19 */                        z = true;
/* 20 */                        z2 = false;
                            } else {
/* 23 */                        z2 = false;
/* 24 */                        z = false;
                            }
/* 286 */                   if (z || z2) {
/* 290 */                       this.I00l0OO0IO = false;
/* 292 */                       setPressed(false);
/* 295 */                       drawableStateChanged();
/* 305 */                       childAt2 = getChildAt(this.I00ilO0 - getFirstVisiblePosition());
/* 309 */                       if (childAt2 != null) {
/* 311 */                           childAt2.setPressed(false);
                                }
                            }
/* 314 */                   O10lo00 o10lo00 = this.I00li1OI;
/* 316 */                   if (z) {
/* 478 */                       if (o10lo00 != null) {
/* 482 */                           if (o10lo00.I00o0l1o1o0) {
/* 484 */                               o10lo00.I0000O();
                                    }
/* 487 */                           o10lo00.I00o0l1o1o0 = false;
                                }
/* 489 */                       return z;
                            }
/* 318 */                   if (o10lo00 == null) {
/* 322 */                       o10lo00 = new O10lo00();
/* 327 */                       I1ili10li i1ili10li = new I1ili10li();
/* 332 */                       i1ili10li.I0000oI00 = Long.MIN_VALUE;
/* 336 */                       i1ili10li.I000II = -1L;
/* 340 */                       i1ili10li.I0001Ioi1lo = 0L;
/* 342 */                       o10lo00.I00iOIl = i1ili10li;
/* 349 */                       o10lo00.I00iiI = new AccelerateInterpolator();
/* 352 */                       float[] fArr = {0.0f, 0.0f};
/* 357 */                       o10lo00.I00ilI0I1 = fArr;
/* 359 */                       float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
/* 364 */                       o10lo00.I00ilO0 = fArr2;
/* 366 */                       float[] fArr3 = {0.0f, 0.0f};
/* 371 */                       o10lo00.I00l0I0l0lO1 = fArr3;
/* 373 */                       float[] fArr4 = {0.0f, 0.0f};
/* 378 */                       o10lo00.I00l0OO0IO = fArr4;
/* 380 */                       float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
/* 385 */                       o10lo00.I00li1OI = fArr5;
/* 387 */                       o10lo00.I00iiO = this;
/* 397 */                       float f = Resources.getSystem().getDisplayMetrics().density;
/* 416 */                       float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
/* 417 */                       fArr5[0] = f2;
/* 419 */                       z3 = true;
/* 420 */                       fArr5[1] = f2;
/* 423 */                       float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
/* 424 */                       fArr4[0] = f3;
/* 426 */                       fArr4[1] = f3;
/* 428 */                       o10lo00.I00io1l = 1;
/* 433 */                       fArr2[0] = Float.MAX_VALUE;
/* 435 */                       fArr2[1] = Float.MAX_VALUE;
/* 440 */                       fArr[0] = 0.2f;
/* 442 */                       fArr[1] = 0.2f;
/* 447 */                       fArr3[0] = 0.001f;
/* 449 */                       fArr3[1] = 0.001f;
/* 453 */                       o10lo00.I00ioIO = O10lo00.I00oI0i;
/* 457 */                       i1ili10li.I00000oIO = 500;
/* 459 */                       i1ili10li.I00000oOI = 500;
/* 461 */                       o10lo00.I00o101lO = this;
/* 463 */                       VarHandle.storeStoreFence();
/* 466 */                       this.I00li1OI = o10lo00;
                            } else {
/* 470 */                       z3 = true;
                            }
/* 468 */                   O10lo00 o10lo002 = o10lo00;
/* 472 */                   o10lo00.I00o0l1o1o0 = z3;
/* 474 */                   o10lo002.onTouch(this, motionEvent);
/* 477 */                   return z;
                        }
/* 27 */                z = true;
                    }
/* 30 */            int iFindPointerIndex = motionEvent.findPointerIndex(i);
/* 34 */            if (iFindPointerIndex >= 0) {
/* 41 */                int x = (int) motionEvent.getX(iFindPointerIndex);
/* 46 */                int y = (int) motionEvent.getY(iFindPointerIndex);
/* 47 */                int iPointToPosition = pointToPosition(x, y);
/* 52 */                if (iPointToPosition == -1) {
/* 54 */                    z2 = true;
                        } else {
/* 63 */                    View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                            float f4 = x;
                            float f5 = y;
/* 69 */                    this.I00l0OO0IO = true;
/* 71 */                    IiloiO0lOO.I00000oIO(this, f4, f5);
/* 78 */                    if (!isPressed()) {
/* 80 */                        setPressed(true);
                            }
/* 83 */                    layoutChildren();
/* 86 */                    int i2 = this.I00ilO0;
/* 88 */                    if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
/* 109 */                       childAt.setPressed(false);
                            }
/* 112 */                   this.I00ilO0 = iPointToPosition;
/* 128 */                   IiloiO0lOO.I00000oIO(childAt3, f4 - childAt3.getLeft(), f5 - childAt3.getTop());
/* 135 */                   if (!childAt3.isPressed()) {
/* 137 */                       childAt3.setPressed(true);
                            }
/* 140 */                   Drawable selector = getSelector();
/* 150 */                   boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
/* 151 */                   if (z4) {
/* 153 */                       selector.setVisible(false, false);
                            }
/* 156 */                   int left = childAt3.getLeft();
/* 160 */                   int top = childAt3.getTop();
/* 164 */                   int right = childAt3.getRight();
/* 168 */                   int bottom = childAt3.getBottom();
/* 174 */                   Rect rect = this.I00iOIl;
/* 176 */                   rect.set(left, top, right, bottom);
                            rect.left -= this.I00iiI;
                            rect.top -= this.I00iiO;
                            rect.right += this.I00iio;
                            rect.bottom += this.I00ilI0I1;
/* 207 */                   boolean zI00000oIO = Iiloloooo.I00000oIO(this);
/* 215 */                   if (childAt3.isEnabled() != zI00000oIO) {
/* 219 */                       Iiloloooo.I00000oOI(this, !zI00000oIO);
/* 222 */                       if (iPointToPosition != -1) {
/* 224 */                           refreshDrawableState();
                                }
                            }
/* 227 */                   if (z4) {
/* 229 */                       float fExactCenterX = rect.exactCenterX();
/* 233 */                       float fExactCenterY = rect.exactCenterY();
/* 247 */                       selector.setVisible(getVisibility() == 0, false);
/* 250 */                       selector.setHotspot(fExactCenterX, fExactCenterY);
                            }
/* 253 */                   Drawable selector2 = getSelector();
/* 257 */                   if (selector2 != null && iPointToPosition != -1) {
/* 261 */                       selector2.setHotspot(f4, f5);
                            }
/* 264 */                   Iio0011 iio0011 = this.I00io1l;
/* 266 */                   if (iio0011 != null) {
/* 268 */                       iio0011.I00iiI = false;
                            }
/* 270 */                   refreshDrawableState();
/* 275 */                   if (actionMasked == 1) {
/* 281 */                       performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                            }
/* 284 */                   z2 = false;
/* 285 */                   z = true;
                        }
                    }
/* 286 */           if (z) {
/* 290 */               this.I00l0OO0IO = false;
/* 292 */               setPressed(false);
/* 295 */               drawableStateChanged();
/* 305 */               childAt2 = getChildAt(this.I00ilO0 - getFirstVisiblePosition());
/* 309 */               if (childAt2 != null) {
                        }
                    }
/* 314 */           O10lo00 o10lo003 = this.I00li1OI;
/* 316 */           if (z) {
                    }
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Drawable selector;
/* 1 */             Rect rect = this.I00iOIl;
/* 7 */             if (!rect.isEmpty() && (selector = getSelector()) != null) {
/* 15 */                selector.setBounds(rect);
/* 18 */                selector.draw(canvas);
                    }
/* 21 */            super.dispatchDraw(canvas);
                }

                @Override
                public final void drawableStateChanged() {
/* 3 */             if (this.I00ll1 != null) {
/* 55 */                return;
                    }
/* 6 */             super.drawableStateChanged();
/* 9 */             Iio0011 iio0011 = this.I00io1l;
/* 11 */            if (iio0011 != null) {
/* 14 */                iio0011.I00iiI = true;
                    }
/* 16 */            Drawable selector = getSelector();
/* 20 */            if (selector != null && this.I00l0OO0IO && isPressed()) {
/* 36 */                selector.setState(getDrawableState());
                    }
                }

                @Override
                public final boolean hasFocus() {
                    return this.I00l0I0l0lO1 || super.hasFocus();
                }

                @Override
                public final boolean hasWindowFocus() {
                    return this.I00l0I0l0lO1 || super.hasWindowFocus();
                }

                @Override
                public final boolean isFocused() {
                    return this.I00l0I0l0lO1 || super.isFocused();
                }

                @Override
                public final boolean isInTouchMode() {
                    return (this.I00l0I0l0lO1 && this.I00ioIO) || super.isInTouchMode();
                }

                @Override
                public final void onDetachedFromWindow() {
/* 2 */             this.I00ll1 = null;
/* 4 */             super.onDetachedFromWindow();
                }

                @Override
                public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 7 */             if (actionMasked == 10 && this.I00ll1 == null) {
/* 16 */                I0lil01 i0lil01 = new I0lil01(5);
/* 19 */                i0lil01.I00iiI = this;
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                this.I00ll1 = i0lil01;
/* 26 */                post(i0lil01);
                    }
/* 29 */            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
/* 36 */            if (actionMasked != 9 && actionMasked != 7) {
/* 42 */                setSelection(-1);
/* 45 */                return zOnHoverEvent;
                    }
/* 56 */            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
/* 60 */            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
/* 74 */                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
/* 82 */                if (childAt.isEnabled()) {
/* 84 */                    requestFocus();
/* 89 */                    if (IiloiOOiIi.I0000O) {
                                try {
/* 107 */                           IiloiOOiIi.I00000oIO.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
/* 120 */                           IiloiOOiIi.I00000oOI.invoke(this, Integer.valueOf(iPointToPosition));
/* 133 */                           IiloiOOiIi.I0000Il00O.invoke(this, Integer.valueOf(iPointToPosition));
                                } catch (IllegalAccessException e) {
/* 145 */                           e.printStackTrace();
                                } catch (InvocationTargetException e2) {
/* 141 */                           e2.printStackTrace();
                                }
                            } else {
/* 158 */                       setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                            }
                        }
/* 161 */               Drawable selector = getSelector();
/* 165 */               if (selector != null && this.I00l0OO0IO && isPressed()) {
/* 181 */                   selector.setState(getDrawableState());
                        }
                    }
/* 437 */           return zOnHoverEvent;
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (motionEvent.getAction() == 0) {
/* 22 */                this.I00ilO0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
/* 24 */            I0lil01 i0lil01 = this.I00ll1;
/* 26 */            if (i0lil01 != null) {
/* 30 */                Iio010 iio010 = (Iio010) i0lil01.I00iiI;
/* 33 */                iio010.I00ll1 = null;
/* 35 */                iio010.removeCallbacks(i0lil01);
                    }
/* 38 */            return super.onTouchEvent(motionEvent);
                }

                public void setListSelectionHidden(boolean z) {
/* 1 */             this.I00ioIO = z;
                }

                @Override
                public void setSelector(Drawable drawable) {
/* 1 */             Iio0011 iio0011 = null;
/* 2 */             if (drawable != null) {
/* 6 */                 Iio0011 iio00112 = new Iio0011();
/* 9 */                 Drawable drawable2 = iio00112.I00iOIl;
/* 11 */                if (drawable2 != null) {
/* 13 */                    drawable2.setCallback(null);
                        }
/* 16 */                iio00112.I00iOIl = drawable;
/* 18 */                drawable.setCallback(iio00112);
/* 22 */                iio00112.I00iiI = true;
/* 24 */                iio0011 = iio00112;
                    }
/* 25 */            this.I00io1l = iio0011;
/* 27 */            super.setSelector(iio0011);
/* 32 */            Rect rect = new Rect();
/* 35 */            if (drawable != null) {
/* 37 */                drawable.getPadding(rect);
                    }
/* 42 */            this.I00iiI = rect.left;
/* 46 */            this.I00iiO = rect.top;
/* 50 */            this.I00iio = rect.right;
/* 54 */            this.I00ilI0I1 = rect.bottom;
                }
            }
