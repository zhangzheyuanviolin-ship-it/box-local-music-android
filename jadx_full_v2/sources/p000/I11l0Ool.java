            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.text.InputFilter;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Button;
            
            public class I11l0Ool extends Button {
                public final I11l01l I00iOIl;
                public final I1I1loi I00iiI;
                public I1I01O1lO1o1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I11l0Ool(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             Oo11io0.I00000oIO(context);
/* 11 */            Oo0oil0li0I.I00000oIO(this, getContext());
/* 16 */            I11l01l i11l01l = new I11l01l(this);
/* 19 */            this.I00iOIl = i11l01l;
/* 21 */            i11l01l.I001lIiIIo1O(attributeSet, i);
/* 26 */            I1I1loi i1I1loi = new I1I1loi(this);
/* 29 */            this.I00iiI = i1I1loi;
/* 31 */            i1I1loi.I0001Ioi1lo(attributeSet, i);
/* 34 */            i1I1loi.I00000oOI();
/* 41 */            getEmojiTextViewHelper().I00000oIO(attributeSet, i);
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
/* 1 */             return super.getAutoSizeMaxTextSize();
                }

                @Override
                public int getAutoSizeMinTextSize() {
/* 1 */             return super.getAutoSizeMinTextSize();
                }

                @Override
                public int getAutoSizeStepGranularity() {
/* 1 */             return super.getAutoSizeStepGranularity();
                }

                @Override
                public int[] getAutoSizeTextAvailableSizes() {
/* 1 */             return super.getAutoSizeTextAvailableSizes();
                }

                @Override
                public int getAutoSizeTextType() {
                    return super.getAutoSizeTextType() == 1 ? 1 : 0;
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
                public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 10 */            accessibilityEvent.setClassName(Button.class.getName());
                }

                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 10 */            accessibilityNodeInfo.setClassName(Button.class.getName());
                }

                @Override
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             I1I1loi i1I1loi = this.I00iiI;
/* 6 */             if (i1I1loi != null) {
/* 8 */                 i1I1loi.getClass();
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
                }

                @Override
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().I00000oOI(z);
                }

                @Override
                public void setAutoSizeTextTypeWithDefaults(int i) {
/* 1 */             super.setAutoSizeTextTypeWithDefaults(i);
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

                public void setSupportAllCaps(boolean z) {
/* 1 */             I1I1loi i1I1loi = this.I00iiI;
/* 3 */             if (i1I1loi != null) {
/* 7 */                 i1I1loi.I00000oIO.setAllCaps(z);
                    }
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
