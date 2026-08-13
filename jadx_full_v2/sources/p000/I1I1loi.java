            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.text.method.PasswordTransformationMethod;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.util.TypedValue;
            import android.widget.TextView;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            public final class I1I1loi {
                public final TextView I00000oIO;
                public IOloIIl1 I00000oOI;
                public IOloIIl1 I0000Il00O;
                public IOloIIl1 I0000O;
                public IOloIIl1 I0000oI00;
                public IOloIIl1 I0001Ioi1lo;
                public IOloIIl1 I000II;
                public IOloIIl1 I000O01llI0;
                public final I1II1Ol I000OOo1O;
                public int I000OiO = 0;
                public int I000iOII = -1;
                public Typeface I000l1;
                public boolean I000lI;

                public I1I1loi(TextView textView) {
/* 10 */            this.I00000oIO = textView;
/* 14 */            I1II1Ol i1II1Ol = new I1II1Ol();
/* 17 */            i1II1Ol.I00000oIO = 0;
/* 21 */            i1II1Ol.I00000oOI = -1.0f;
/* 23 */            i1II1Ol.I0000Il00O = -1.0f;
/* 25 */            i1II1Ol.I0000O = -1.0f;
/* 29 */            i1II1Ol.I0000oI00 = new int[0];
/* 31 */            i1II1Ol.I0001Ioi1lo = false;
/* 33 */            i1II1Ol.I000II = textView;
/* 39 */            i1II1Ol.I000O01llI0 = textView.getContext();
/* 43 */            new I1II0i1I1();
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            this.I000OOo1O = i1II1Ol;
                }

                public static IOloIIl1 I0000Il00O(Context context, I11oo00 i11oo00, int i) {
                    ColorStateList colorStateListI000II;
                    synchronized (i11oo00) {
/* 4 */                 colorStateListI000II = i11oo00.I00000oIO.I000II(context, i);
                    }
/* 9 */             if (colorStateListI000II == null) {
/* 22 */                return null;
                    }
/* 13 */            IOloIIl1 iOloIIl1 = new IOloIIl1();
/* 17 */            iOloIIl1.I00000oOI = true;
/* 19 */            iOloIIl1.I0000Il00O = colorStateListI000II;
/* 21 */            return iOloIIl1;
                }

                public final void I00000oIO(Drawable drawable, IOloIIl1 iOloIIl1) {
/* 1 */             if (drawable == null || iOloIIl1 == null) {
/* 37 */                return;
                    }
/* 7 */             int[] drawableState = this.I00000oIO.getDrawableState();
/* 11 */            PorterDuff.Mode mode = I11oo00.I00000oOI;
/* 13 */            Oi0loIIIoI.I000OOo1O(drawable, iOloIIl1, drawableState);
                }

                public final void I00000oOI() {
/* 1 */             IOloIIl1 iOloIIl1 = this.I00000oOI;
/* 5 */             TextView textView = this.I00000oIO;
/* 7 */             if (iOloIIl1 != null || this.I0000Il00O != null || this.I0000O != null || this.I0000oI00 != null) {
/* 21 */                Drawable[] compoundDrawables = textView.getCompoundDrawables();
/* 29 */                I00000oIO(compoundDrawables[0], this.I00000oOI);
/* 37 */                I00000oIO(compoundDrawables[1], this.I0000Il00O);
/* 44 */                I00000oIO(compoundDrawables[2], this.I0000O);
/* 52 */                I00000oIO(compoundDrawables[3], this.I0000oI00);
                    }
/* 57 */            if (this.I0001Ioi1lo == null && this.I000II == null) {
/* 64 */                return;
                    }
/* 65 */            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
/* 73 */            I00000oIO(compoundDrawablesRelative[0], this.I0001Ioi1lo);
/* 80 */            I00000oIO(compoundDrawablesRelative[2], this.I000II);
                }

                public final ColorStateList I0000O() {
/* 1 */             IOloIIl1 iOloIIl1 = this.I000O01llI0;
/* 3 */             if (iOloIIl1 != null) {
/* 7 */                 return (ColorStateList) iOloIIl1.I0000Il00O;
                    }
/* 10 */            return null;
                }

                public final PorterDuff.Mode I0000oI00() {
/* 1 */             IOloIIl1 iOloIIl1 = this.I000O01llI0;
/* 3 */             if (iOloIIl1 != null) {
/* 7 */                 return (PorterDuff.Mode) iOloIIl1.I0000O;
                    }
/* 10 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:252:0x0452  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x045e  */
                /* JADX WARN: Removed duplicated region for block: B:269:0x0492  */
                /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(AttributeSet attributeSet, int i) {
                    boolean z;
                    boolean z2;
                    String string;
                    String string2;
                    int i2;
                    float dimensionPixelSize;
                    int i3;
                    ColorStateList colorStateList;
                    int resourceId;
                    int resourceId2;
/* 7 */             TextView textView = this.I00000oIO;
/* 9 */             Context context = textView.getContext();
/* 13 */            I11oo00 i11oo00I00000oIO = I11oo00.I00000oIO();
/* 17 */            int[] iArr = OOilOli0.I000O01llI0;
/* 19 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, i);
/* 24 */            Context context2 = textView.getContext();
/* 30 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 32 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 39 */            OooiO1oOi1.I00000oOI(textView, context2, iArr, attributeSet, typedArray, i, 0);
/* 47 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 51 */            int resourceId3 = typedArray2.getResourceId(0, -1);
/* 60 */            if (typedArray2.hasValue(3)) {
/* 70 */                this.I00000oOI = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(3, 0));
                    }
/* 77 */            if (typedArray2.hasValue(1)) {
/* 87 */                this.I0000Il00O = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(1, 0));
                    }
/* 94 */            if (typedArray2.hasValue(4)) {
/* 104 */               this.I0000O = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(4, 0));
                    }
/* 111 */           if (typedArray2.hasValue(2)) {
/* 121 */               this.I0000oI00 = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(2, 0));
                    }
/* 128 */           if (typedArray2.hasValue(5)) {
/* 138 */               this.I0001Ioi1lo = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(5, 0));
                    }
/* 145 */           if (typedArray2.hasValue(6)) {
/* 155 */               this.I000II = I0000Il00O(context, i11oo00I00000oIO, typedArray2.getResourceId(6, 0));
                    }
/* 157 */           olilOlOiII0010I0i.I0010o();
/* 164 */           boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
/* 166 */           int[] iArr2 = OOilOli0.I001IO000;
/* 174 */           if (resourceId3 != -1) {
/* 178 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
/* 182 */               OlilOlOiI olilOlOiI = new OlilOlOiI(context, typedArrayObtainStyledAttributes);
/* 185 */               if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
/* 202 */                   z = false;
/* 204 */                   z2 = false;
                        } else {
/* 193 */                   z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
/* 199 */                   z = true;
                        }
/* 206 */               I000OiO(context, olilOlOiI);
/* 220 */               string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
/* 233 */               string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
/* 234 */               olilOlOiI.I0010o();
                    } else {
/* 238 */               z = false;
/* 240 */               z2 = false;
/* 242 */               string = null;
/* 243 */               string2 = null;
                    }
/* 247 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
/* 251 */           OlilOlOiI olilOlOiI2 = new OlilOlOiI(context, typedArrayObtainStyledAttributes2);
/* 254 */           if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
/* 262 */               z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
/* 266 */               z = true;
                    }
/* 268 */           boolean z4 = z2;
/* 274 */           if (typedArrayObtainStyledAttributes2.hasValue(15)) {
/* 276 */               string2 = typedArrayObtainStyledAttributes2.getString(15);
                    }
/* 284 */           if (typedArrayObtainStyledAttributes2.hasValue(13)) {
/* 286 */               string = typedArrayObtainStyledAttributes2.getString(13);
                    }
/* 295 */           if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
/* 303 */               textView.setTextSize(0, 0.0f);
                    }
/* 306 */           I000OiO(context, olilOlOiI2);
/* 309 */           olilOlOiI2.I0010o();
/* 312 */           if (!z3 && z) {
/* 316 */               textView.setAllCaps(z4);
                    }
/* 319 */           Typeface typeface = this.I000l1;
/* 321 */           if (typeface != null) {
/* 325 */               if (this.I000iOII == -1) {
/* 329 */                   textView.setTypeface(typeface, this.I000OiO);
                        } else {
/* 333 */                   textView.setTypeface(typeface);
                        }
                    }
/* 336 */           if (string != null) {
/* 338 */               I1I1Ollo0.I0000O(textView, string);
                    }
/* 341 */           if (string2 != null) {
/* 347 */               I1I1Ol.I00000oOI(textView, I1I1Ol.I00000oIO(string2));
                    }
/* 350 */           I1II1Ol i1II1Ol = this.I000OOo1O;
/* 352 */           Context context3 = i1II1Ol.I000O01llI0;
/* 354 */           int[] iArr3 = OOilOli0.I000OOo1O;
/* 356 */           TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
/* 361 */           TextView textView2 = i1II1Ol.I000II;
/* 375 */           OooiO1oOi1.I00000oOI(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
/* 382 */           if (typedArrayObtainStyledAttributes3.hasValue(5)) {
/* 388 */               i1II1Ol.I00000oIO = typedArrayObtainStyledAttributes3.getInt(5, 0);
                    }
/* 404 */           float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
/* 417 */           float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
/* 431 */           float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
/* 438 */           if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
/* 518 */               i2 = 0;
                    } else {
/* 450 */               TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
/* 454 */               int length = typedArrayObtainTypedArray.length();
/* 458 */               int[] iArr4 = new int[length];
/* 460 */               if (length > 0) {
/* 462 */                   i2 = 0;
/* 464 */                   for (int i4 = 0; i4 < length; i4++) {
/* 470 */                       iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                            }
/* 475 */                   int[] iArrI00000oIO = I1II1Ol.I00000oIO(iArr4);
/* 479 */                   i1II1Ol.I0000oI00 = iArrI00000oIO;
/* 486 */                   boolean z5 = iArrI00000oIO.length > 0;
/* 488 */                   i1II1Ol.I0001Ioi1lo = z5;
/* 490 */                   if (z5) {
/* 493 */                       i1II1Ol.I00000oIO = 1;
/* 500 */                       i1II1Ol.I0000Il00O = iArrI00000oIO[0];
/* 507 */                       i1II1Ol.I0000O = iArrI00000oIO[r13 - 1];
/* 509 */                       i1II1Ol.I00000oOI = -1.0f;
                            }
                        } else {
/* 512 */                   i2 = 0;
                        }
/* 514 */               typedArrayObtainTypedArray.recycle();
                    }
/* 520 */           typedArrayObtainStyledAttributes3.recycle();
/* 529 */           if (!i1II1Ol.I00000oOI()) {
/* 750 */               i1II1Ol.I00000oIO = i2;
                    } else if (i1II1Ol.I00000oIO == 1) {
/* 538 */               if (!i1II1Ol.I0001Ioi1lo) {
/* 544 */                   DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
/* 550 */                   if (dimension2 == -1.0f) {
/* 554 */                       dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                            }
/* 560 */                   if (dimension3 == -1.0f) {
/* 564 */                       dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                            }
/* 568 */                   float f = dimension3;
/* 572 */                   if (dimension == -1.0f) {
/* 574 */                       dimension = 1.0f;
                            }
/* 579 */                   if (dimension2 <= 0.0f) {
/* 681 */                       throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                            }
/* 583 */                   if (f <= dimension2) {
/* 658 */                       throw new IllegalArgumentException("Maximum auto-size text size (" + f + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                            }
/* 587 */                   if (dimension <= 0.0f) {
/* 625 */                       throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                            }
/* 590 */                   i1II1Ol.I00000oIO = 1;
/* 592 */                   i1II1Ol.I0000Il00O = dimension2;
/* 594 */                   i1II1Ol.I0000O = f;
/* 596 */                   i1II1Ol.I00000oOI = dimension;
/* 600 */                   i1II1Ol.I0001Ioi1lo = i2;
                        }
/* 686 */               if (i1II1Ol.I00000oOI() && i1II1Ol.I00000oIO == 1 && (!i1II1Ol.I0001Ioi1lo || i1II1Ol.I0000oI00.length == 0)) {
/* 718 */                   int iFloor = ((int) Math.floor((i1II1Ol.I0000O - i1II1Ol.I0000Il00O) / i1II1Ol.I00000oOI)) + 1;
/* 720 */                   int[] iArr5 = new int[iFloor];
/* 723 */                   for (int i5 = 0; i5 < iFloor; i5++) {
/* 736 */                       iArr5[i5] = Math.round((i5 * i1II1Ol.I00000oOI) + i1II1Ol.I0000Il00O);
                            }
/* 745 */                   i1II1Ol.I0000oI00 = I1II1Ol.I00000oIO(iArr5);
                        }
                    }
/* 754 */           if (i1II1Ol.I00000oIO != 0) {
/* 756 */               int[] iArr6 = i1II1Ol.I0000oI00;
/* 759 */               if (iArr6.length > 0) {
/* 768 */                   if (I1I1Ollo0.I00000oIO(textView) != -1.0f) {
/* 789 */                       I1I1Ollo0.I00000oOI(textView, Math.round(i1II1Ol.I0000Il00O), Math.round(i1II1Ol.I0000O), Math.round(i1II1Ol.I00000oOI), 0);
                            } else {
/* 794 */                       I1I1Ollo0.I0000Il00O(textView, iArr6, 0);
                            }
                        }
                    }
/* 797 */           TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
/* 803 */           int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
/* 816 */           Drawable drawableI00000oOI = resourceId4 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId4) : null;
/* 818 */           int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
/* 829 */           Drawable drawableI00000oOI2 = resourceId5 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId5) : null;
/* 832 */           int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
/* 844 */           Drawable drawableI00000oOI3 = resourceId6 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId6) : null;
/* 846 */           int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
/* 857 */           Drawable drawableI00000oOI4 = resourceId7 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId7) : null;
/* 860 */           int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
/* 871 */           Drawable drawableI00000oOI5 = resourceId8 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId8) : null;
/* 873 */           int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
/* 884 */           Drawable drawableI00000oOI6 = resourceId9 != -1 ? i11oo00I00000oIO.I00000oOI(context, resourceId9) : null;
/* 885 */           if (drawableI00000oOI5 != null || drawableI00000oOI6 != null) {
/* 965 */               Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
/* 969 */               if (drawableI00000oOI5 == null) {
/* 974 */                   drawableI00000oOI5 = compoundDrawablesRelative[0];
                        }
/* 976 */               if (drawableI00000oOI2 == null) {
/* 981 */                   drawableI00000oOI2 = compoundDrawablesRelative[1];
                        }
/* 983 */               if (drawableI00000oOI6 == null) {
/* 986 */                   drawableI00000oOI6 = compoundDrawablesRelative[2];
                        }
/* 988 */               if (drawableI00000oOI4 == null) {
/* 993 */                   drawableI00000oOI4 = compoundDrawablesRelative[3];
                        }
/* 995 */               textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableI00000oOI5, drawableI00000oOI2, drawableI00000oOI6, drawableI00000oOI4);
                    } else if (drawableI00000oOI != null || drawableI00000oOI2 != null || drawableI00000oOI3 != null || drawableI00000oOI4 != null) {
/* 898 */               Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
/* 904 */               Drawable drawable = compoundDrawablesRelative2[0];
/* 906 */               if (drawable == null && compoundDrawablesRelative2[2] == null) {
/* 915 */                   Drawable[] compoundDrawables = textView.getCompoundDrawables();
/* 919 */                   if (drawableI00000oOI == null) {
/* 922 */                       drawableI00000oOI = compoundDrawables[0];
                            }
/* 924 */                   if (drawableI00000oOI2 == null) {
/* 929 */                       drawableI00000oOI2 = compoundDrawables[1];
                            }
/* 931 */                   if (drawableI00000oOI3 == null) {
/* 934 */                       drawableI00000oOI3 = compoundDrawables[2];
                            }
/* 936 */                   if (drawableI00000oOI4 == null) {
/* 941 */                       drawableI00000oOI4 = compoundDrawables[3];
                            }
/* 943 */                   textView.setCompoundDrawablesWithIntrinsicBounds(drawableI00000oOI, drawableI00000oOI2, drawableI00000oOI3, drawableI00000oOI4);
                        } else {
/* 947 */                   if (drawableI00000oOI2 == null) {
/* 952 */                       drawableI00000oOI2 = compoundDrawablesRelative2[1];
                            }
/* 954 */                   if (drawableI00000oOI4 == null) {
/* 957 */                       drawableI00000oOI4 = compoundDrawablesRelative2[3];
                            }
/* 961 */                   textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableI00000oOI2, compoundDrawablesRelative2[2], drawableI00000oOI4);
                        }
                    }
/* 1004 */          if (typedArrayObtainStyledAttributes4.hasValue(11)) {
/* 1010 */              if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = iOI10i0I11.I00000oOI(context, resourceId)) == null) {
/* 1026 */                  colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
                        }
/* 1030 */              textView.setCompoundDrawableTintList(colorStateList);
                    }
/* 1039 */          if (typedArrayObtainStyledAttributes4.hasValue(12)) {
/* 1050 */              textView.setCompoundDrawableTintMode(IiloO11l.I00000oIO(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
                    }
/* 1055 */          int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
/* 1061 */          int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
/* 1071 */          if (typedArrayObtainStyledAttributes4.hasValue(19)) {
/* 1073 */              TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
/* 1077 */              if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
/* 1084 */                  int i6 = typedValuePeekValue.data;
/* 1086 */                  i3 = i6 & 15;
/* 1088 */                  dimensionPixelSize = TypedValue.complexToFloat(i6);
/* 1102 */                  typedArrayObtainStyledAttributes4.recycle();
/* 1105 */                  if (dimensionPixelSize2 != -1) {
/* 1107 */                      if (dimensionPixelSize2 < 0) {
/* 1113 */                          OIiilo1Ool0o.I00100o1O0lo();
/* 1116 */                          return;
                                }
/* 1109 */                      textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
                            }
/* 1117 */                  if (dimensionPixelSize3 != -1) {
/* 1119 */                      if (dimensionPixelSize3 < 0) {
/* 1163 */                          OIiilo1Ool0o.I00100o1O0lo();
/* 1166 */                          return;
                                }
/* 1125 */                      Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
/* 1138 */                      int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
/* 1144 */                      if (dimensionPixelSize3 > Math.abs(i7)) {
/* 1159 */                          textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i7);
                                }
                            }
/* 1169 */                  if (dimensionPixelSize == -1.0f) {
/* 1171 */                      if (i3 != -1) {
/* 1197 */                          textView.setLineHeight(i3, dimensionPixelSize);
/* 3380 */                          return;
                                }
/* 1173 */                      int i8 = (int) dimensionPixelSize;
/* 1174 */                      if (i8 < 0) {
/* 1193 */                          OIiilo1Ool0o.I00100o1O0lo();
/* 1196 */                          return;
                                }
/* 1185 */                      if (i8 != textView.getPaint().getFontMetricsInt(null)) {
/* 1189 */                          textView.setLineSpacing(i8 - r1, 1.0f);
/* 1192 */                          return;
                                }
/* 3380 */                      return;
                            }
/* 3380 */                  return;
                        }
/* 1093 */              dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                    } else {
/* 1100 */              dimensionPixelSize = -1.0f;
                    }
/* 1098 */          i3 = -1;
/* 1102 */          typedArrayObtainStyledAttributes4.recycle();
/* 1105 */          if (dimensionPixelSize2 != -1) {
                    }
/* 1117 */          if (dimensionPixelSize3 != -1) {
                    }
/* 1169 */          if (dimensionPixelSize == -1.0f) {
                    }
                }

                public final void I000II(Context context, int i) {
                    String string;
/* 5 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, OOilOli0.I001IO000);
/* 9 */             OlilOlOiI olilOlOiI = new OlilOlOiI(context, typedArrayObtainStyledAttributes);
/* 14 */            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
/* 19 */            TextView textView = this.I00000oIO;
/* 21 */            if (zHasValue) {
/* 27 */                textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
                    }
/* 34 */            if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
/* 44 */                textView.setTextSize(0, 0.0f);
                    }
/* 47 */            I000OiO(context, olilOlOiI);
/* 56 */            if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
/* 64 */                I1I1Ollo0.I0000O(textView, string);
                    }
/* 67 */            olilOlOiI.I0010o();
/* 70 */            Typeface typeface = this.I000l1;
/* 72 */            if (typeface != null) {
/* 76 */                textView.setTypeface(typeface, this.I000OiO);
                    }
                }

                public final void I000O01llI0(ColorStateList colorStateList) {
/* 1 */             IOloIIl1 iOloIIl1 = this.I000O01llI0;
/* 3 */             if (iOloIIl1 == null) {
/* 7 */                 iOloIIl1 = new IOloIIl1();
/* 10 */                this.I000O01llI0 = iOloIIl1;
                    }
/* 12 */            IOloIIl1 iOloIIl12 = iOloIIl1;
/* 13 */            iOloIIl1.I0000Il00O = colorStateList;
/* 20 */            iOloIIl1.I00000oOI = colorStateList != null;
/* 22 */            this.I00000oOI = iOloIIl12;
/* 24 */            this.I0000Il00O = iOloIIl12;
/* 26 */            this.I0000O = iOloIIl12;
/* 28 */            this.I0000oI00 = iOloIIl12;
/* 30 */            this.I0001Ioi1lo = iOloIIl12;
/* 32 */            this.I000II = iOloIIl12;
                }

                public final void I000OOo1O(PorterDuff.Mode mode) {
/* 1 */             IOloIIl1 iOloIIl1 = this.I000O01llI0;
/* 3 */             if (iOloIIl1 == null) {
/* 7 */                 iOloIIl1 = new IOloIIl1();
/* 10 */                this.I000O01llI0 = iOloIIl1;
                    }
/* 12 */            IOloIIl1 iOloIIl12 = iOloIIl1;
/* 13 */            iOloIIl1.I0000O = mode;
/* 20 */            iOloIIl1.I00000oIO = mode != null;
/* 22 */            this.I00000oOI = iOloIIl12;
/* 24 */            this.I0000Il00O = iOloIIl12;
/* 26 */            this.I0000O = iOloIIl12;
/* 28 */            this.I0000oI00 = iOloIIl12;
/* 30 */            this.I0001Ioi1lo = iOloIIl12;
/* 32 */            this.I000II = iOloIIl12;
                }

                public final void I000OiO(Context context, OlilOlOiI olilOlOiI) {
                    String string;
/* 1 */             int i = this.I000OiO;
/* 5 */             TypedArray typedArray = (TypedArray) olilOlOiI.I00iiO;
/* 12 */            this.I000OiO = typedArray.getInt(2, i);
/* 17 */            int i2 = typedArray.getInt(11, -1);
/* 21 */            this.I000iOII = i2;
/* 23 */            if (i2 != -1) {
                        this.I000OiO &= 2;
                    }
/* 39 */            int i3 = 0;
/* 40 */            if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
/* 53 */                if (typedArray.hasValue(1)) {
/* 55 */                    this.I000lI = false;
/* 57 */                    int i4 = typedArray.getInt(1, 1);
/* 61 */                    if (i4 == 1) {
/* 82 */                        this.I000l1 = Typeface.SANS_SERIF;
/* 84 */                        return;
                            } else if (i4 == 2) {
/* 77 */                        this.I000l1 = Typeface.SERIF;
/* 79 */                        return;
                            } else {
/* 66 */                        if (i4 != 3) {
/* 332 */                           return;
                                }
/* 72 */                        this.I000l1 = Typeface.MONOSPACE;
/* 74 */                        return;
                            }
                        }
/* 332 */               return;
                    }
/* 86 */            this.I000l1 = null;
/* 92 */            int i5 = typedArray.hasValue(12) ? 12 : 10;
/* 95 */            int i6 = this.I000iOII;
/* 97 */            int i7 = this.I000OiO;
/* 103 */           if (!context.isRestricted()) {
/* 109 */               WeakReference weakReference = new WeakReference(this.I00000oIO);
/* 114 */               I1I1OO00o1o i1I1OO00o1o = new I1I1OO00o1o(i3);
/* 117 */               i1I1OO00o1o.I0000oI00 = this;
/* 119 */               i1I1OO00o1o.I00000oOI = i6;
/* 121 */               i1I1OO00o1o.I0000Il00O = i7;
/* 123 */               i1I1OO00o1o.I0000O = weakReference;
/* 125 */               VarHandle.storeStoreFence();
                        try {
/* 130 */                   Typeface typefaceI000lI = olilOlOiI.I000lI(i5, this.I000OiO, i1I1OO00o1o);
/* 134 */                   if (typefaceI000lI != null) {
/* 138 */                       if (this.I000iOII != -1) {
/* 158 */                           this.I000l1 = I1I1ii.I00000oIO(Typeface.create(typefaceI000lI, 0), this.I000iOII, (this.I000OiO & 2) != 0);
                                } else {
/* 161 */                           this.I000l1 = typefaceI000lI;
                                }
                            }
/* 170 */                   this.I000lI = this.I000l1 == null;
                        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                        }
                    }
/* 174 */           if (this.I000l1 != null || (string = typedArray.getString(i5)) == null) {
/* 332 */               return;
                    }
/* 184 */           if (this.I000iOII != -1) {
/* 203 */               this.I000l1 = I1I1ii.I00000oIO(Typeface.create(string, 0), this.I000iOII, (this.I000OiO & 2) != 0);
                    } else {
/* 212 */               this.I000l1 = Typeface.create(string, this.I000OiO);
                    }
                }
            }
