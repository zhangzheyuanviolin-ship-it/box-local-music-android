            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.CheckedTextView;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            
/* 21 */    public final class I11l1ioo1IoI extends CheckedTextView {
                public final I11lI0IO0O01 I00iOIl;
                public final I11l01l I00iiI;
                public final I1I1loi I00iiO;
                public I1I01O1lO1o1 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I11l1ioo1IoI(Context context, AttributeSet attributeSet) {
                    int resourceId;
                    int resourceId2;
/* 7 */             super(context, attributeSet, R.attr.checkedTextViewStyle);
/* 1 */             Oo11io0.I00000oIO(context);
/* 14 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 19 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 22 */            this.I00iiO = i1I1loi;
/* 24 */            i1I1loi.I0001Ioi1lo(attributeSet, R.attr.checkedTextViewStyle);
/* 27 */            i1I1loi.I00000oOI();
/* 32 */            I11l01l i11l01l = new I11l01l(this);
/* 35 */            this.I00iiI = i11l01l;
/* 37 */            i11l01l.I001lIiIIo1O(attributeSet, R.attr.checkedTextViewStyle);
/* 42 */            I11lI0IO0O01 i11lI0IO0O01 = new I11lI0IO0O01();
/* 46 */            i11lI0IO0O01.I00000oIO = null;
/* 48 */            i11lI0IO0O01.I00000oOI = null;
/* 51 */            i11lI0IO0O01.I0000Il00O = false;
/* 53 */            i11lI0IO0O01.I0000O = false;
/* 55 */            i11lI0IO0O01.I0001Ioi1lo = this;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            this.I00iOIl = i11lI0IO0O01;
/* 62 */            Context context2 = getContext();
/* 66 */            int[] iArr = OOilOli0.I000l1;
/* 68 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
/* 75 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 77 */            Context context3 = getContext();
/* 84 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 86 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 91 */            OooiO1oOi1.I00000oOI(this, context3, iArr, attributeSet, typedArray2, R.attr.checkedTextViewStyle, 0);
                    try {
/* 99 */                if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                            try {
/* 115 */                       setCheckMarkDrawable(iOO0oOI1Ol.I00000oIO(getContext(), resourceId2));
                            } catch (Resources.NotFoundException unused) {
                            }
                        } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
/* 142 */                   setCheckMarkDrawable(iOO0oOI1Ol.I00000oIO(getContext(), resourceId));
                        }
/* 150 */               if (typedArray.hasValue(2)) {
/* 156 */                   setCheckMarkTintList(olilOlOiII0010I0i.I000OiO(2));
                        }
/* 164 */               if (typedArray.hasValue(3)) {
/* 175 */                   setCheckMarkTintMode(IiloO11l.I00000oIO(typedArray.getInt(3, -1), null));
                        }
/* 178 */               olilOlOiII0010I0i.I0010o();
/* 185 */               getEmojiTextViewHelper().I00000oIO(attributeSet, R.attr.checkedTextViewStyle);
                    } catch (Throwable th) {
/* 189 */               olilOlOiII0010I0i.I0010o();
/* 332 */               throw th;
                    }
                }

                private I1I01O1lO1o1 getEmojiTextViewHelper() {
/* 1 */             I1I01O1lO1o1 i1I01O1lO1o1 = this.I00iio;
/* 3 */             if (i1I01O1lO1o1 != null) {
/* 20 */                return i1I01O1lO1o1;
                    }
/* 7 */             I1I01O1lO1o1 i1I01O1lO1o12 = new I1I01O1lO1o1(this);
/* 10 */            this.I00iio = i1I01O1lO1o12;
/* 20 */            return i1I01O1lO1o12;
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I1I1loi i1I1loi = this.I00iiO;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
/* 11 */            I11l01l i11l01l = this.I00iiI;
/* 13 */            if (i11l01l != null) {
/* 15 */                i11l01l.I000OiO();
                    }
/* 18 */            I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 20 */            if (i11lI0IO0O01 != null) {
/* 22 */                i11lI0IO0O01.I00000oOI();
                    }
                }

                @Override
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 1 */             return super.getCustomSelectionActionModeCallback();
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             I11l01l i11l01l = this.I00iiI;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001i1lo1io();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             I11l01l i11l01l = this.I00iiI;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001iOo1i0O();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCheckMarkTintList() {
/* 1 */             I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 3 */             if (i11lI0IO0O01 != null) {
/* 5 */                 return i11lI0IO0O01.I00000oIO;
                    }
/* 8 */             return null;
                }

                public PorterDuff.Mode getSupportCheckMarkTintMode() {
/* 1 */             I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 3 */             if (i11lI0IO0O01 != null) {
/* 5 */                 return i11lI0IO0O01.I00000oOI;
                    }
/* 8 */             return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.I00iiO.I0000O();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.I00iiO.I0000oI00();
                }

                @Override
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             iOO0lI.I00000oIO(inputConnectionOnCreateInputConnection, editorInfo, this);
/* 29 */            return inputConnectionOnCreateInputConnection;
                }

                @Override
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().I00000oOI(z);
                }

                @Override
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             I11l01l i11l01l = this.I00iiI;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0Ol1O0l();
                    }
                }

                @Override
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             I11l01l i11l01l = this.I00iiI;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0oii1o(i);
                    }
                }

                @Override
                public void setCheckMarkDrawable(Drawable drawable) {
/* 1 */             super.setCheckMarkDrawable(drawable);
/* 4 */             I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 6 */             if (i11lI0IO0O01 != null) {
/* 10 */                if (i11lI0IO0O01.I0000oI00) {
/* 13 */                    i11lI0IO0O01.I0000oI00 = false;
                        } else {
/* 17 */                    i11lI0IO0O01.I0000oI00 = true;
/* 19 */                    i11lI0IO0O01.I00000oOI();
                        }
                    }
                }

                @Override
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiO;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                @Override
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiO;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                @Override
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 1 */             super.setCustomSelectionActionModeCallback(callback);
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().I0000Il00O(z);
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             I11l01l i11l01l = this.I00iiI;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00Io1o110i(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             I11l01l i11l01l = this.I00iiI;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00IoIO0lI(mode);
                    }
                }

                public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
/* 1 */             I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 3 */             if (i11lI0IO0O01 != null) {
/* 5 */                 i11lI0IO0O01.I00000oIO = colorStateList;
/* 8 */                 i11lI0IO0O01.I0000Il00O = true;
/* 10 */                i11lI0IO0O01.I00000oOI();
                    }
                }

                public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
/* 1 */             I11lI0IO0O01 i11lI0IO0O01 = this.I00iOIl;
/* 3 */             if (i11lI0IO0O01 != null) {
/* 5 */                 i11lI0IO0O01.I00000oOI = mode;
/* 8 */                 i11lI0IO0O01.I0000O = true;
/* 10 */                i11lI0IO0O01.I00000oOI();
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             I1I1loi i1I1loi = this.I00iiO;
/* 3 */             i1I1loi.I000O01llI0(colorStateList);
/* 6 */             i1I1loi.I00000oOI();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             I1I1loi i1I1loi = this.I00iiO;
/* 3 */             i1I1loi.I000OOo1O(mode);
/* 6 */             i1I1loi.I00000oOI();
                }

                @Override
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             I1I1loi i1I1loi = this.I00iiO;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I000II(context, i);
                    }
                }

                @Override
/* 22 */        public void setCheckMarkDrawable(int i) {
/* 23 */            setCheckMarkDrawable(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }
            }
