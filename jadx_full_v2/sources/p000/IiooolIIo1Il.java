            package p000;

            import android.text.Editable;
            import android.text.Selection;
            import android.text.Spannable;
            import android.text.TextWatcher;
            import android.widget.EditText;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
/* 27 */    public final class IiooolIIo1Il implements TextWatcher {
                public EditText I00iOIl;
                public IioooOl0oOl I00iiI;
                public boolean I00iiO;

                public static void I00000oIO(EditText editText, int i) {
                    int length;
/* 2 */             if (i == 1 && editText != null && editText.isAttachedToWindow()) {
/* 12 */                Editable editableText = editText.getEditableText();
/* 16 */                int selectionStart = Selection.getSelectionStart(editableText);
/* 20 */                int selectionEnd = Selection.getSelectionEnd(editableText);
/* 24 */                IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 29 */                if (editableText == null) {
/* 31 */                    length = 0;
                        } else {
/* 33 */                    iiollO1llliI00000oIO.getClass();
/* 36 */                    length = editableText.length();
                        }
/* 40 */                iiollO1llliI00000oIO.I000II(0, length, 0, editableText);
/* 43 */                if (selectionStart >= 0 && selectionEnd >= 0) {
/* 47 */                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
/* 53 */                    Selection.setSelection(editableText, selectionStart);
                        } else if (selectionEnd >= 0) {
/* 59 */                    Selection.setSelection(editableText, selectionEnd);
                        }
                    }
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
/* 1 */             EditText editText = this.I00iOIl;
/* 7 */             if (!editText.isInEditMode() && this.I00iiO && IiollO1llli.I0000O() && i2 <= i3 && (charSequence instanceof Spannable)) {
/* 30 */                int iI0000Il00O = IiollO1llli.I00000oIO().I0000Il00O();
/* 34 */                if (iI0000Il00O != 0) {
/* 37 */                    if (iI0000Il00O == 1) {
/* 51 */                        IiollO1llli.I00000oIO().I000II(i, i3 + i, 0, (Spannable) charSequence);
/* 54 */                        return;
                            } else if (iI0000Il00O != 3) {
/* 204 */                       return;
                            }
                        }
/* 55 */                IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 59 */                IioooOl0oOl iioooOl0oOl = this.I00iiI;
/* 61 */                if (iioooOl0oOl == null) {
/* 65 */                    iioooOl0oOl = new IioooOl0oOl();
/* 73 */                    iioooOl0oOl.I00iOIl = new WeakReference(editText);
/* 75 */                    VarHandle.storeStoreFence();
/* 78 */                    this.I00iiI = iioooOl0oOl;
                        }
/* 80 */                iiollO1llliI00000oIO.I000O01llI0(iioooOl0oOl);
                    }
                }

                @Override
/* 28 */        public final void afterTextChanged(Editable editable) {
                }

                @Override
/* 203 */       public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            }
