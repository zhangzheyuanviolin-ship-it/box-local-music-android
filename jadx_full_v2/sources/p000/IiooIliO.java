            package p000;

            import android.os.Handler;
            import android.text.InputFilter;
            import android.text.Selection;
            import android.text.Spannable;
            import android.widget.TextView;
            import java.lang.ref.WeakReference;
            
            public final class IiooIliO extends Iioll1 implements Runnable {
                public WeakReference I00iOIl;
                public WeakReference I00iiI;

                @Override
                public final void I00000oOI() {
                    Handler handler;
/* 7 */             TextView textView = (TextView) this.I00iOIl.get();
/* 9 */             if (textView == null || (handler = textView.getHandler()) == null) {
/* 55 */                return;
                    }
/* 18 */            handler.post(this);
                }

                @Override
                public final void run() throws Throwable {
                    InputFilter[] filters;
                    int length;
/* 7 */             TextView textView = (TextView) this.I00iOIl.get();
/* 15 */            InputFilter inputFilter = (InputFilter) this.I00iiI.get();
/* 17 */            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
/* 110 */               return;
                    }
/* 32 */            for (InputFilter inputFilter2 : filters) {
/* 36 */                if (inputFilter2 == inputFilter) {
/* 42 */                    if (textView.isAttachedToWindow()) {
/* 44 */                        CharSequence text = textView.getText();
/* 48 */                        IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 52 */                        if (text == null) {
/* 54 */                            length = 0;
                                } else {
/* 56 */                            iiollO1llliI00000oIO.getClass();
/* 59 */                            length = text.length();
                                }
/* 63 */                        CharSequence charSequenceI000II = iiollO1llliI00000oIO.I000II(0, length, 0, text);
/* 67 */                        if (text == charSequenceI000II) {
/* 110 */                           return;
                                }
/* 70 */                        int selectionStart = Selection.getSelectionStart(charSequenceI000II);
/* 74 */                        int selectionEnd = Selection.getSelectionEnd(charSequenceI000II);
/* 78 */                        textView.setText(charSequenceI000II);
/* 83 */                        if (charSequenceI000II instanceof Spannable) {
/* 85 */                            Spannable spannable = (Spannable) charSequenceI000II;
/* 87 */                            if (selectionStart >= 0 && selectionEnd >= 0) {
/* 91 */                                Selection.setSelection(spannable, selectionStart, selectionEnd);
/* 94 */                                return;
                                    } else if (selectionStart >= 0) {
/* 97 */                                Selection.setSelection(spannable, selectionStart);
/* 100 */                               return;
                                    } else {
/* 101 */                               if (selectionEnd >= 0) {
/* 103 */                                   Selection.setSelection(spannable, selectionEnd);
/* 106 */                                   return;
                                        }
/* 110 */                               return;
                                    }
                                }
/* 110 */                       return;
                            }
/* 110 */                   return;
                        }
                    }
                }
            }
