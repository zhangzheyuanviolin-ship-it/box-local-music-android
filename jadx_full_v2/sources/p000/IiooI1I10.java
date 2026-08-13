            package p000;

            import android.text.Editable;
            import android.view.inputmethod.InputConnectionWrapper;
            import android.widget.TextView;
            
            public final class IiooI1I10 extends InputConnectionWrapper {
                public TextView I00000oIO;
                public O1oO0lOoI1 I00000oOI;

                @Override
                public final boolean deleteSurroundingText(int i, int i2) {
/* 1 */             O1oO0lOoI1 o1oO0lOoI1 = this.I00000oOI;
/* 5 */             Editable editableText = this.I00000oIO.getEditableText();
/* 9 */             o1oO0lOoI1.getClass();
                    return IOO000ilo.I001l0I00(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
                }

                @Override
                public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
/* 1 */             O1oO0lOoI1 o1oO0lOoI1 = this.I00000oOI;
/* 5 */             Editable editableText = this.I00000oIO.getEditableText();
/* 9 */             o1oO0lOoI1.getClass();
                    return IOO000ilo.I001l0I00(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
                }
            }
