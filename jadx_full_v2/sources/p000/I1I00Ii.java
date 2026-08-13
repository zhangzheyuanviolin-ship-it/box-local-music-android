            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.Editable;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.textclassifier.TextClassifier;
            import android.widget.EditText;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
/* 4 */     public final class I1I00Ii extends EditText {
                public final I11l01l I00iOIl;
                public final I1I1loi I00iiI;
                public final IIlio101Io I00iiO;
                public I11ooO11i1 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1I00Ii(Context context, AttributeSet attributeSet) {
/* 7 */             super(context, attributeSet, R.attr.editTextStyle);
/* 1 */             Oo11io0.I00000oIO(context);
/* 14 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 19 */            I11l01l i11l01l = new I11l01l(this);
/* 22 */            this.I00iOIl = i11l01l;
/* 24 */            i11l01l.I001lIiIIo1O(attributeSet, R.attr.editTextStyle);
/* 29 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 32 */            this.I00iiI = i1I1loi;
/* 34 */            i1I1loi.I0001Ioi1lo(attributeSet, R.attr.editTextStyle);
/* 37 */            i1I1loi.I00000oOI();
/* 42 */            IIlio101Io iIlio101Io = new IIlio101Io(this);
/* 45 */            this.I00iiO = iIlio101Io;
/* 47 */            iIlio101Io.I00oOio10iI1(attributeSet, R.attr.editTextStyle);
/* 50 */            KeyListener keyListener = getKeyListener();
/* 56 */            if (keyListener instanceof NumberKeyListener) {
/* 106 */               return;
                    }
/* 58 */            boolean zIsFocusable = isFocusable();
/* 62 */            boolean zIsClickable = isClickable();
/* 66 */            boolean zIsLongClickable = isLongClickable();
/* 70 */            int inputType = getInputType();
/* 74 */            KeyListener keyListenerI00oII = iIlio101Io.I00oII(keyListener);
/* 78 */            if (keyListenerI00oII == keyListener) {
/* 106 */               return;
                    }
/* 81 */            super.setKeyListener(keyListenerI00oII);
/* 84 */            setRawInputType(inputType);
/* 87 */            setFocusable(zIsFocusable);
/* 90 */            setClickable(zIsClickable);
/* 93 */            setLongClickable(zIsLongClickable);
                }

                private I11ooO11i1 getSuperCaller() {
/* 1 */             I11ooO11i1 i11ooO11i1 = this.I00iio;
/* 3 */             if (i11ooO11i1 != null) {
/* 20 */                return i11ooO11i1;
                    }
/* 7 */             I11ooO11i1 i11ooO11i12 = new I11ooO11i1();
/* 10 */            i11ooO11i12.I00000oIO = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I00iio = i11ooO11i12;
/* 20 */            return i11ooO11i12;
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
                public TextClassifier getTextClassifier() {
/* 7 */             return super.getTextClassifier();
                }

                @Override
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 7 */             this.I00iiI.getClass();
/* 10 */            iOO0lI.I00000oIO(inputConnectionOnCreateInputConnection, editorInfo, this);
/* 15 */            return this.I00iiO.I00oli(inputConnectionOnCreateInputConnection, editorInfo);
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
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

                @Override
                public void setTextClassifier(TextClassifier textClassifier) {
/* 7 */             super.setTextClassifier(textClassifier);
                }

                @Override
/* 5 */         public Editable getText() {
/* 6 */             return super.getText();
                }
            }
