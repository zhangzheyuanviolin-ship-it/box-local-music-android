            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Handler;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.AdapterView;
            import android.widget.ListAdapter;
            import java.lang.invoke.VarHandle;
            
            public class O10O00o implements Ol01O0lOO {
                public final Context I00iOIl;
                public ListAdapter I00iiI;
                public Iio010 I00iiO;
                public int I00ilO0;
                public int I00io1l;
                public boolean I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public boolean I00li1OI;
                public O10Ilo11oi1 I00lll10;
                public View I00o0iI0io1;
                public AdapterView.OnItemClickListener I00o0l1o1o0;
                public AdapterView.OnItemSelectedListener I00o101lO;
                public final O10Il1o10iI I00oI0i;
                public final O10O00 I00oII;
                public final O10Iol I00oIiI10;
                public final O10Il1o10iI I00oO101o;
                public final Handler I00oOio10iI1;
                public final Rect I00ol1;
                public Rect I00olI;
                public boolean I00oli;
                public final I1I0OoiI0o I00oliIiO01i;
                public final int I00iio = -2;
                public int I00ilI0I1 = -2;
                public final int I00ioIO = 1002;
                public int I00ll1 = 0;
                public final int I00lli11 = Integer.MAX_VALUE;

                public O10O00o(Context context, AttributeSet attributeSet, int i, int i2) {
                    int resourceId;
/* 24 */            O10Il1o10iI o10Il1o10iI = new O10Il1o10iI(1);
/* 27 */            o10Il1o10iI.I00iiI = this;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            this.I00oI0i = o10Il1o10iI;
/* 36 */            O10O00 o10o00 = new O10O00();
/* 39 */            o10o00.I00iOIl = this;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            this.I00oII = o10o00;
/* 48 */            O10Iol o10Iol = new O10Iol();
/* 51 */            o10Iol.I00000oIO = this;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            this.I00oIiI10 = o10Iol;
/* 60 */            O10Il1o10iI o10Il1o10iI2 = new O10Il1o10iI(0);
/* 63 */            o10Il1o10iI2.I00iiI = this;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            this.I00oO101o = o10Il1o10iI2;
/* 75 */            this.I00ol1 = new Rect();
/* 77 */            this.I00iOIl = context;
/* 88 */            this.I00oOio10iI1 = new Handler(context.getMainLooper());
/* 92 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OOilOli0.I000oI1ioi, i, 0);
/* 100 */           this.I00ilO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
/* 102 */           int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
/* 106 */           this.I00io1l = dimensionPixelOffset;
/* 108 */           if (dimensionPixelOffset != 0) {
/* 110 */               this.I00l0I0l0lO1 = true;
                    }
/* 112 */           typedArrayObtainStyledAttributes.recycle();
/* 117 */           I1I0OoiI0o i1I0OoiI0o = new I1I0OoiI0o(context, attributeSet, i, 0);
/* 122 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OOilOli0.I0010o, i, 0);
/* 131 */           if (typedArrayObtainStyledAttributes2.hasValue(2)) {
/* 137 */               i1I0OoiI0o.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
                    }
/* 161 */           i1I0OoiI0o.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : iOO0oOI1Ol.I00000oIO(context, resourceId));
/* 164 */           typedArrayObtainStyledAttributes2.recycle();
/* 167 */           this.I00oliIiO01i = i1I0OoiI0o;
/* 169 */           i1I0OoiI0o.setInputMethodMode(1);
                }

                @Override
                public final boolean I00000oIO() {
/* 3 */             return this.I00oliIiO01i.isShowing();
                }

                public final int I00000oOI() {
/* 1 */             return this.I00ilO0;
                }

                public final void I0000O(int i) {
/* 1 */             this.I00ilO0 = i;
                }

                @Override
                public final void I0001Ioi1lo() {
                    int i;
                    int paddingBottom;
                    Iio010 iio010;
/* 1 */             Iio010 iio0102 = this.I00iiO;
/* 3 */             Context context = this.I00iOIl;
/* 6 */             I1I0OoiI0o i1I0OoiI0o = this.I00oliIiO01i;
/* 8 */             if (iio0102 == null) {
/* 13 */                Iio010 iio010I00100o1O0lo = I00100o1O0lo(context, !this.I00oli);
/* 17 */                this.I00iiO = iio010I00100o1O0lo;
/* 21 */                iio010I00100o1O0lo.setAdapter(this.I00iiI);
/* 28 */                this.I00iiO.setOnItemClickListener(this.I00o0l1o1o0);
/* 33 */                this.I00iiO.setFocusable(true);
/* 38 */                this.I00iiO.setFocusableInTouchMode(true);
/* 41 */                Iio010 iio0103 = this.I00iiO;
/* 45 */                O10Iii00l1 o10Iii00l1 = new O10Iii00l1();
/* 48 */                o10Iii00l1.I00iOIl = this;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                iio0103.setOnItemSelectedListener(o10Iii00l1);
/* 60 */                this.I00iiO.setOnScrollListener(this.I00oIiI10);
/* 63 */                AdapterView.OnItemSelectedListener onItemSelectedListener = this.I00o101lO;
/* 65 */                if (onItemSelectedListener != null) {
/* 69 */                    this.I00iiO.setOnItemSelectedListener(onItemSelectedListener);
                        }
/* 74 */                i1I0OoiI0o.setContentView(this.I00iiO);
                    }
/* 84 */            Drawable background = i1I0OoiI0o.getBackground();
/* 88 */            Rect rect = this.I00ol1;
/* 91 */            if (background != null) {
/* 93 */                background.getPadding(rect);
/* 96 */                int i2 = rect.top;
/* 100 */               i = rect.bottom + i2;
/* 103 */               if (!this.I00l0I0l0lO1) {
/* 106 */                   this.I00io1l = -i2;
                        }
                    } else {
/* 109 */               rect.setEmpty();
/* 112 */               i = 0;
                    }
/* 127 */           int iI00000oIO = O10IiloiI0l.I00000oIO(i1I0OoiI0o, this.I00o0iI0io1, this.I00io1l, i1I0OoiI0o.getInputMethodMode() == 2);
/* 131 */           int i3 = this.I00iio;
/* 135 */           if (i3 == -1) {
/* 137 */               paddingBottom = iI00000oIO + i;
                    } else {
/* 139 */               int i4 = this.I00ilI0I1;
/* 197 */               int iI00000oIO2 = this.I00iiO.I00000oIO(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iI00000oIO);
/* 219 */               paddingBottom = iI00000oIO2 + (iI00000oIO2 > 0 ? this.I00iiO.getPaddingBottom() + this.I00iiO.getPaddingTop() + i : 0);
                    }
/* 228 */           boolean z = i1I0OoiI0o.getInputMethodMode() == 2;
/* 231 */           i1I0OoiI0o.setWindowLayoutType(this.I00ioIO);
/* 238 */           if (i1I0OoiI0o.isShowing()) {
/* 246 */               if (this.I00o0iI0io1.isAttachedToWindow()) {
/* 250 */                   int width = this.I00ilI0I1;
/* 252 */                   if (width == -1) {
/* 254 */                       width = -1;
                            } else if (width == -2) {
/* 260 */                       width = this.I00o0iI0io1.getWidth();
                            }
/* 264 */                   if (i3 == -1) {
/* 270 */                       i3 = z ? paddingBottom : -1;
/* 271 */                       int i5 = this.I00ilI0I1;
/* 273 */                       if (z) {
/* 280 */                           i1I0OoiI0o.setWidth(i5 == -1 ? -1 : 0);
/* 283 */                           i1I0OoiI0o.setHeight(0);
                                } else {
/* 290 */                           i1I0OoiI0o.setWidth(i5 == -1 ? -1 : 0);
/* 293 */                           i1I0OoiI0o.setHeight(-1);
                                }
                            } else if (i3 == -2) {
/* 299 */                       i3 = paddingBottom;
                            }
/* 300 */                   i1I0OoiI0o.setOutsideTouchable(true);
/* 303 */                   int i6 = width;
/* 304 */                   View view = this.I00o0iI0io1;
/* 306 */                   int i7 = this.I00ilO0;
/* 308 */                   int i8 = this.I00io1l;
/* 314 */                   int i9 = i6 < 0 ? -1 : i6;
/* 315 */                   if (i3 < 0) {
/* 317 */                       i3 = -1;
                            }
/* 318 */                   i1I0OoiI0o.update(view, i7, i8, i9, i3);
/* 321 */                   return;
                        }
/* 743 */               return;
                    }
/* 322 */           int width2 = this.I00ilI0I1;
/* 324 */           if (width2 == -1) {
/* 326 */               width2 = -1;
                    } else if (width2 == -2) {
/* 332 */               width2 = this.I00o0iI0io1.getWidth();
                    }
/* 336 */           if (i3 == -1) {
/* 338 */               i3 = -1;
                    } else if (i3 == -2) {
/* 342 */               i3 = paddingBottom;
                    }
/* 343 */           i1I0OoiI0o.setWidth(width2);
/* 346 */           i1I0OoiI0o.setHeight(i3);
/* 349 */           O10IioOoio0.I00000oOI(i1I0OoiI0o, true);
/* 352 */           i1I0OoiI0o.setOutsideTouchable(true);
/* 357 */           i1I0OoiI0o.setTouchInterceptor(this.I00oII);
/* 362 */           if (this.I00li1OI) {
/* 366 */               i1I0OoiI0o.setOverlapAnchor(this.I00l0OO0IO);
                    }
/* 371 */           O10IioOoio0.I00000oIO(i1I0OoiI0o, this.I00olI);
/* 382 */           i1I0OoiI0o.showAsDropDown(this.I00o0iI0io1, this.I00ilO0, this.I00io1l, this.I00ll1);
/* 387 */           this.I00iiO.setSelection(-1);
/* 392 */           if ((!this.I00oli || this.I00iiO.isInTouchMode()) && (iio010 = this.I00iiO) != null) {
/* 406 */               iio010.setListSelectionHidden(true);
/* 409 */               iio010.requestLayout();
                    }
/* 414 */           if (this.I00oli) {
/* 743 */               return;
                    }
/* 420 */           this.I00oOio10iI1.post(this.I00oO101o);
                }

                public final Drawable I000II() {
/* 3 */             return this.I00oliIiO01i.getBackground();
                }

                public final void I000OOo1O(Drawable drawable) {
/* 3 */             this.I00oliIiO01i.setBackgroundDrawable(drawable);
                }

                @Override
                public final Iio010 I000OiO() {
/* 1 */             return this.I00iiO;
                }

                public final void I000iOII(int i) {
/* 1 */             this.I00io1l = i;
/* 4 */             this.I00l0I0l0lO1 = true;
                }

                public final int I000oI1ioi() {
/* 3 */             if (this.I00l0I0l0lO1) {
/* 7 */                 return this.I00io1l;
                    }
/* 5 */             return 0;
                }

                public void I00100l0(ListAdapter listAdapter) {
/* 1 */             O10Ilo11oi1 o10Ilo11oi1 = this.I00lll10;
/* 3 */             if (o10Ilo11oi1 == null) {
/* 10 */                this.I00lll10 = new O10Ilo11oi1(this);
                    } else {
/* 13 */                ListAdapter listAdapter2 = this.I00iiI;
/* 15 */                if (listAdapter2 != null) {
/* 17 */                    listAdapter2.unregisterDataSetObserver(o10Ilo11oi1);
                        }
                    }
/* 20 */            this.I00iiI = listAdapter;
/* 22 */            if (listAdapter != null) {
/* 26 */                listAdapter.registerDataSetObserver(this.I00lll10);
                    }
/* 29 */            Iio010 iio010 = this.I00iiO;
/* 31 */            if (iio010 != null) {
/* 35 */                iio010.setAdapter(this.I00iiI);
                    }
                }

                public Iio010 I00100o1O0lo(Context context, boolean z) {
/* 3 */             return new Iio010(context, z);
                }

                public final void I0010I0i(int i) {
/* 3 */             Drawable background = this.I00oliIiO01i.getBackground();
/* 7 */             if (background == null) {
/* 23 */                this.I00ilI0I1 = i;
/* 29 */                return;
                    }
/* 9 */             Rect rect = this.I00ol1;
/* 11 */            background.getPadding(rect);
/* 20 */            this.I00ilI0I1 = rect.left + rect.right + i;
                }

                @Override
                public final void dismiss() {
/* 1 */             I1I0OoiI0o i1I0OoiI0o = this.I00oliIiO01i;
/* 3 */             i1I0OoiI0o.dismiss();
/* 7 */             i1I0OoiI0o.setContentView(null);
/* 10 */            this.I00iiO = null;
/* 16 */            this.I00oOio10iI1.removeCallbacks(this.I00oI0i);
                }
            }
