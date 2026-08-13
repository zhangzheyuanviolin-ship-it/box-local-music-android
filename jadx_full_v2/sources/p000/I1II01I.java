            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.text.PrecomputedText;
            import android.text.TextDirectionHeuristic;
            import android.text.TextDirectionHeuristics;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.textclassifier.TextClassifier;
            import android.widget.TextView;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Future;
            
/* 24 */    public class I1II01I extends TextView {
                public final I11l01l I00iOIl;
                public final I1I1loi I00iiI;
                public I1I01O1lO1o1 I00iiO;
                public boolean I00iio;
                public IoIlOo1o0IIl I00ilI0I1;
                public Future I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1II01I(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             Oo11io0.I00000oIO(context);
/* 8 */             this.I00iio = false;
/* 11 */            this.I00ilI0I1 = null;
/* 17 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 22 */            I11l01l i11l01l = new I11l01l(this);
/* 25 */            this.I00iOIl = i11l01l;
/* 27 */            i11l01l.I001lIiIIo1O(attributeSet, i);
/* 32 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 35 */            this.I00iiI = i1I1loi;
/* 37 */            i1I1loi.I0001Ioi1lo(attributeSet, i);
/* 40 */            i1I1loi.I00000oOI();
/* 47 */            getEmojiTextViewHelper().I00000oIO(attributeSet, i);
                }

                private I1I01O1lO1o1 getEmojiTextViewHelper() {
/* 1 */             I1I01O1lO1o1 i1I01O1lO1o1 = this.I00iiO;
/* 3 */             if (i1I01O1lO1o1 != null) {
/* 20 */                return i1I01O1lO1o1;
                    }
/* 7 */             I1I01O1lO1o1 i1I01O1lO1o12 = new I1I01O1lO1o1(this);
/* 10 */            this.I00iiO = i1I01O1lO1o12;
/* 20 */            return i1I01O1lO1o12;
                }

                @Override
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I000OiO();
                    }
/* 11 */            I1I1loi i1I1loi = this.I00iiI;
/* 13 */            if (i1I1loi != null) {
/* 15 */                i1I1loi.I00000oOI();
                    }
                }

                @Override
                public int getAutoSizeMaxTextSize() {
/* 11 */            return super.getAutoSizeMaxTextSize();
                }

                @Override
                public int getAutoSizeMinTextSize() {
/* 11 */            return super.getAutoSizeMinTextSize();
                }

                @Override
                public int getAutoSizeStepGranularity() {
/* 11 */            return super.getAutoSizeStepGranularity();
                }

                @Override
                public int[] getAutoSizeTextAvailableSizes() {
/* 11 */            return super.getAutoSizeTextAvailableSizes();
                }

                @Override
                public int getAutoSizeTextType() {
                    return super.getAutoSizeTextType() == 1 ? 1 : 0;
                }

                @Override
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 1 */             return super.getCustomSelectionActionModeCallback();
                }

                @Override
                public int getFirstBaselineToTopHeight() {
/* 15 */            return getPaddingTop() - getPaint().getFontMetricsInt().top;
                }

                @Override
                public int getLastBaselineToBottomHeight() {
/* 15 */            return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
                }

                public I1I1oI getSuperCaller() {
/* 1 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00ilI0I1;
/* 3 */             if (ioIlOo1o0IIl != null) {
/* 55 */                return ioIlOo1o0IIl;
                    }
/* 9 */             IoIlOo1o0IIl ioIlOo1o0IIl2 = new IoIlOo1o0IIl(5, false);
/* 12 */            ioIlOo1o0IIl2.I00iio = this;
/* 14 */            ioIlOo1o0IIl2.I00iiO = this;
/* 16 */            ioIlOo1o0IIl2.I00iiI = this;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            this.I00ilI0I1 = ioIlOo1o0IIl2;
/* 55 */            return ioIlOo1o0IIl2;
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001i1lo1io();
                    }
/* 10 */            return null;
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 return i11l01l.I001iOo1i0O();
                    }
/* 10 */            return null;
                }

                public ColorStateList getSupportCompoundDrawablesTintList() {
/* 3 */             return this.I00iiI.I0000O();
                }

                public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
/* 3 */             return this.I00iiI.I0000oI00();
                }

                @Override
                public CharSequence getText() {
/* 1 */             Future future = this.I00ilO0;
/* 3 */             if (future != null) {
                        try {
/* 7 */                     this.I00ilO0 = null;
/* 13 */                    if (future.get() == null) {
/* 15 */                        throw null;
                            }
/* 21 */                    throw new ClassCastException();
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
/* 22 */            return super.getText();
                }

                @Override
                public TextClassifier getTextClassifier() {
/* 11 */            return super.getTextClassifier();
                }

                public OO1oO1ll0 getTextMetricsParamsCompat() {
/* 3 */             PrecomputedText.Params textMetricsParams = getTextMetricsParams();
/* 7 */             OO1oO1ll0 oO1oO1ll0 = new OO1oO1ll0();
/* 14 */            oO1oO1ll0.I00000oIO = textMetricsParams.getTextPaint();
/* 20 */            oO1oO1ll0.I00000oOI = textMetricsParams.getTextDirection();
/* 26 */            oO1oO1ll0.I0000Il00O = textMetricsParams.getBreakStrategy();
/* 32 */            oO1oO1ll0.I0000O = textMetricsParams.getHyphenationFrequency();
/* 34 */            VarHandle.storeStoreFence();
/* 55 */            return oO1oO1ll0;
                }

                @Override
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */             this.I00iiI.getClass();
/* 10 */            iOO0lI.I00000oIO(inputConnectionOnCreateInputConnection, editorInfo, this);
/* 29 */            return inputConnectionOnCreateInputConnection;
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.getClass();
                    }
                }

                @Override
                public void onMeasure(int i, int i2) {
/* 1 */             Future future = this.I00ilO0;
/* 3 */             if (future != null) {
                        try {
/* 7 */                     this.I00ilO0 = null;
/* 13 */                    if (future.get() != null) {
/* 21 */                        throw new ClassCastException();
                            }
/* 15 */                    throw null;
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
/* 22 */            super.onMeasure(i, i2);
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
                }

                @Override
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().I00000oOI(z);
                }

                @Override
                public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
/* 11 */            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
                }

                @Override
                public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
/* 11 */            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
                }

                @Override
                public void setAutoSizeTextTypeWithDefaults(int i) {
/* 11 */            super.setAutoSizeTextTypeWithDefaults(i);
                }

                @Override
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0Ol1O0l();
                    }
                }

                @Override
                public void setBackgroundResource(int i) {
/* 1 */             super.setBackgroundResource(i);
/* 4 */             I11l01l i11l01l = this.I00iOIl;
/* 6 */             if (i11l01l != null) {
/* 8 */                 i11l01l.I00II0oii1o(i);
                    }
                }

                @Override
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                @Override
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I00000oOI();
                    }
                }

                @Override
                public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             Context context = getContext();
/* 36 */            setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? iOO0oOI1Ol.I00000oIO(context, i) : null, i2 != 0 ? iOO0oOI1Ol.I00000oIO(context, i2) : null, i3 != 0 ? iOO0oOI1Ol.I00000oIO(context, i3) : null, i4 != 0 ? iOO0oOI1Ol.I00000oIO(context, i4) : null);
/* 39 */            I1I1loi i1I1loi = this.I00iiI;
/* 41 */            if (i1I1loi != null) {
/* 43 */                i1I1loi.I00000oOI();
                    }
                }

                @Override
                public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             Context context = getContext();
/* 36 */            setCompoundDrawablesWithIntrinsicBounds(i != 0 ? iOO0oOI1Ol.I00000oIO(context, i) : null, i2 != 0 ? iOO0oOI1Ol.I00000oIO(context, i2) : null, i3 != 0 ? iOO0oOI1Ol.I00000oIO(context, i3) : null, i4 != 0 ? iOO0oOI1Ol.I00000oIO(context, i4) : null);
/* 39 */            I1I1loi i1I1loi = this.I00iiI;
/* 41 */            if (i1I1loi != null) {
/* 43 */                i1I1loi.I00000oOI();
                    }
                }

                @Override
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 1 */             super.setCustomSelectionActionModeCallback(callback);
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().I0000Il00O(z);
                }

                @Override
                public void setFilters(InputFilter[] inputFilterArr) {
/* 15 */            super.setFilters(((ilI1Oi0) getEmojiTextViewHelper().I00000oOI.I00iOIl).I00000oIO(inputFilterArr));
                }

                @Override
                public void setFirstBaselineToTopHeight(int i) {
/* 11 */            super.setFirstBaselineToTopHeight(i);
                }

                @Override
                public void setLastBaselineToBottomHeight(int i) {
/* 11 */            super.setLastBaselineToBottomHeight(i);
                }

                @Override
                public void setLineHeight(int i) {
/* 1 */             if (i < 0) {
/* 22 */                OIiilo1Ool0o.I00100o1O0lo();
/* 29 */                return;
                    }
/* 12 */            if (i != getPaint().getFontMetricsInt(null)) {
/* 18 */                setLineSpacing(i - r0, 1.0f);
                    }
                }

                public void setPrecomputedText(OO1oiOII oO1oiOII) {
/* 29 */            throw null;
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00Io1o110i(colorStateList);
                    }
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             I11l01l i11l01l = this.I00iOIl;
/* 3 */             if (i11l01l != null) {
/* 5 */                 i11l01l.I00IoIO0lI(mode);
                    }
                }

                public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
/* 1 */             I1I1loi i1I1loi = this.I00iiI;
/* 3 */             i1I1loi.I000O01llI0(colorStateList);
/* 6 */             i1I1loi.I00000oOI();
                }

                public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
/* 1 */             I1I1loi i1I1loi = this.I00iiI;
/* 3 */             i1I1loi.I000OOo1O(mode);
/* 6 */             i1I1loi.I00000oOI();
                }

                @Override
                public void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I000II(context, i);
                    }
                }

                @Override
                public void setTextClassifier(TextClassifier textClassifier) {
/* 11 */            super.setTextClassifier(textClassifier);
                }

                public void setTextFuture(Future<OO1oiOII> future) {
/* 1 */             this.I00ilO0 = future;
/* 3 */             if (future != null) {
/* 5 */                 requestLayout();
                    }
                }

                public void setTextMetricsParamsCompat(OO1oO1ll0 oO1oO1ll0) {
                    TextDirectionHeuristic textDirectionHeuristic;
/* 1 */             TextDirectionHeuristic textDirectionHeuristic2 = oO1oO1ll0.I00000oOI;
/* 3 */             TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
/* 5 */             int i = 1;
/* 6 */             if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
/* 16 */                if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
/* 18 */                    i = 2;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
/* 24 */                    i = 3;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
/* 30 */                    i = 4;
                        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
/* 36 */                    i = 5;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
/* 40 */                    i = 6;
                        } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
/* 44 */                    i = 7;
                        }
                    }
/* 45 */            setTextDirection(i);
/* 54 */            getPaint().set(oO1oO1ll0.I00000oIO);
/* 59 */            setBreakStrategy(oO1oO1ll0.I0000Il00O);
/* 64 */            setHyphenationFrequency(oO1oO1ll0.I0000O);
                }

                @Override
                public final void setTypeface(Typeface typeface, int i) {
                    Typeface typefaceCreate;
/* 3 */             if (this.I00iio) {
/* 5 */                 return;
                    }
/* 6 */             if (typeface == null || i <= 0) {
/* 29 */                typefaceCreate = null;
                    } else {
/* 10 */                Context context = getContext();
/* 14 */                i1i0olI i1i0oli = OoOl10O1o.I00000oIO;
/* 16 */                if (context == null) {
/* 25 */                    I000II.I000iOII("Context cannot be null");
/* 28 */                    return;
                        }
/* 18 */                typefaceCreate = Typeface.create(typeface, i);
                    }
/* 31 */            this.I00iio = true;
/* 33 */            if (typefaceCreate != null) {
/* 35 */                typeface = typefaceCreate;
                    }
                    try {
/* 37 */                super.setTypeface(typeface, i);
                    } finally {
/* 44 */                this.I00iio = false;
                    }
                }

                @Override
/* 25 */        public final void setLineHeight(int i, float f) {
/* 28 */            super.setLineHeight(i, f);
                }

                @Override
/* 46 */        public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 47 */            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
/* 48 */            I1I1loi i1I1loi = this.I00iiI;
                    if (i1I1loi != null) {
/* 49 */                i1I1loi.I00000oOI();
                    }
                }

                @Override
/* 46 */        public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 47 */            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
/* 48 */            I1I1loi i1I1loi = this.I00iiI;
                    if (i1I1loi != null) {
/* 49 */                i1I1loi.I00000oOI();
                    }
                }

/* 50 */        public I1II01I(Context context, AttributeSet attributeSet) {
/* 51 */            this(context, attributeSet, R.attr.textViewStyle);
                }
            }
