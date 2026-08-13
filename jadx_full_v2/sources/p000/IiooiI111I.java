            package p000;

            import android.text.Editable;
            import android.text.method.KeyListener;
            import android.text.method.MetaKeyKeyListener;
            import android.view.KeyEvent;
            import android.view.View;
            
            public final class IiooiI111I implements KeyListener {
                public KeyListener I00000oIO;

                @Override
                public final void clearMetaKeyState(View view, Editable editable, int i) {
/* 3 */             this.I00000oIO.clearMetaKeyState(view, editable, i);
                }

                @Override
                public final int getInputType() {
/* 3 */             return this.I00000oIO.getInputType();
                }

                @Override
                public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
/* 22 */            if (!(i != 67 ? i != 112 ? false : IOO000ilo.I000oI1ioi(editable, keyEvent, true) : IOO000ilo.I000oI1ioi(editable, keyEvent, false))) {
                        return this.I00000oIO.onKeyDown(view, editable, i, keyEvent);
                    }
/* 24 */            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
/* 3 */             return true;
                }

                @Override
                public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
/* 3 */             return this.I00000oIO.onKeyOther(view, editable, keyEvent);
                }

                @Override
                public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
/* 3 */             return this.I00000oIO.onKeyUp(view, editable, i, keyEvent);
                }
            }
