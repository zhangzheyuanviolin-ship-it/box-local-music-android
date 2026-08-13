            package p000;

            import android.text.InputFilter;
            import android.text.Spanned;
            import android.widget.TextView;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
            public final class IiooOOOO0IIO implements InputFilter {
                public TextView I00000oIO;
                public IiooIliO I00000oOI;

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
                
                    if (r1 != 3) goto L27;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
/* 1 */             TextView textView = this.I00000oIO;
/* 7 */             if (!textView.isInEditMode()) {
/* 14 */                int iI0000Il00O = IiollO1llli.I00000oIO().I0000Il00O();
/* 18 */                if (iI0000Il00O != 0) {
/* 21 */                    if (iI0000Il00O == 1) {
/* 27 */                        if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
/* 46 */                            if (i != 0 || i2 != charSequence.length()) {
/* 55 */                                charSequence = charSequence.subSequence(i, i2);
                                    }
/* 68 */                            return IiollO1llli.I00000oIO().I000II(0, charSequence.length(), 0, charSequence);
                                }
                            }
                        }
/* 74 */                IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 78 */                IiooIliO iiooIliO = this.I00000oOI;
/* 80 */                if (iiooIliO == null) {
/* 84 */                    iiooIliO = new IiooIliO();
/* 92 */                    iiooIliO.I00iOIl = new WeakReference(textView);
/* 99 */                    iiooIliO.I00iiI = new WeakReference(this);
/* 101 */                   VarHandle.storeStoreFence();
/* 104 */                   this.I00000oOI = iiooIliO;
                        }
/* 106 */               iiollO1llliI00000oIO.I000O01llI0(iiooIliO);
/* 685 */               return charSequence;
                    }
/* 73 */            return charSequence;
                }
            }
