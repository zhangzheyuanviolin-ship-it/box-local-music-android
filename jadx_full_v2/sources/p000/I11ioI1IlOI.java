            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.AutoCompleteTextView;
            
            public class I11ioI1IlOI extends AutoCompleteTextView {
                public static final int[] I00iio = {R.attr.popupBackground};
                public final I11l01l I00iOIl;
                public final I1I1loi I00iiI;
                public final IIlio101Io I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I11ioI1IlOI(Context context, AttributeSet attributeSet) {
/* 7 */             super(context, attributeSet, com.box.gallery.R.attr.autoCompleteTextViewStyle);
/* 1 */             Oo11io0.I00000oIO(context);
/* 14 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 23 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(getContext(), attributeSet, I00iio, com.box.gallery.R.attr.autoCompleteTextViewStyle);
/* 36 */            if (((TypedArray) olilOlOiII0010I0i.I00iiO).hasValue(0)) {
/* 42 */                setDropDownBackgroundDrawable(olilOlOiII0010I0i.I000iOII(0));
                    }
/* 45 */            olilOlOiII0010I0i.I0010o();
/* 50 */            I11l01l i11l01l = new I11l01l(this);
/* 53 */            this.I00iOIl = i11l01l;
/* 55 */            i11l01l.I001lIiIIo1O(attributeSet, com.box.gallery.R.attr.autoCompleteTextViewStyle);
/* 60 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 63 */            this.I00iiI = i1I1loi;
/* 65 */            i1I1loi.I0001Ioi1lo(attributeSet, com.box.gallery.R.attr.autoCompleteTextViewStyle);
/* 68 */            i1I1loi.I00000oOI();
/* 73 */            IIlio101Io iIlio101Io = new IIlio101Io(this);
/* 76 */            this.I00iiO = iIlio101Io;
/* 78 */            iIlio101Io.I00oOio10iI1(attributeSet, com.box.gallery.R.attr.autoCompleteTextViewStyle);
/* 81 */            KeyListener keyListener = getKeyListener();
/* 87 */            if (keyListener instanceof NumberKeyListener) {
/* 332 */               return;
                    }
/* 89 */            boolean zIsFocusable = super.isFocusable();
/* 93 */            boolean zIsClickable = super.isClickable();
/* 97 */            boolean zIsLongClickable = super.isLongClickable();
/* 101 */           int inputType = super.getInputType();
/* 105 */           KeyListener keyListenerI00oII = iIlio101Io.I00oII(keyListener);
/* 109 */           if (keyListenerI00oII == keyListener) {
/* 332 */               return;
                    }
/* 112 */           super.setKeyListener(keyListenerI00oII);
/* 115 */           super.setRawInputType(inputType);
/* 118 */           super.setFocusable(zIsFocusable);
/* 121 */           super.setClickable(zIsClickable);
/* 124 */           super.setLongClickable(zIsLongClickable);
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
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 1 */             return super.getCustomSelectionActionModeCallback();
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
                public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             iOO0lI.I00000oIO(inputConnectionOnCreateInputConnection, editorInfo, this);
/* 10 */            return this.I00iiO.I00oli(inputConnectionOnCreateInputConnection, editorInfo);
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
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 1 */             super.setCustomSelectionActionModeCallback(callback);
                }

                @Override
                public void setDropDownBackgroundResource(int i) {
/* 9 */             setDropDownBackgroundDrawable(iOO0oOI1Ol.I00000oIO(getContext(), i));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 3 */             this.I00iiO.I0100o111I(z);
                }

                @Override
                public void setKeyListener(KeyListener keyListener) {
/* 7 */             super.setKeyListener(this.I00iiO.I00oII(keyListener));
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
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.I000II(context, i);
                    }
                }
            }
