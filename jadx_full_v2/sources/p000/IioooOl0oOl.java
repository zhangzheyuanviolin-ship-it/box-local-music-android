            package p000;

            import android.os.Handler;
            import android.widget.EditText;
            import java.lang.ref.WeakReference;
            
            public final class IioooOl0oOl extends Iioll1 implements Runnable {
                public WeakReference I00iOIl;

                @Override
                public final void I00000oOI() {
                    Handler handler;
/* 7 */             EditText editText = (EditText) this.I00iOIl.get();
/* 9 */             if (editText == null || (handler = editText.getHandler()) == null) {
/* 18 */                return;
                    }
/* 19 */            handler.post(this);
                }

                @Override
                public final void run() {
/* 10 */            IiooolIIo1Il.I00000oIO((EditText) this.I00iOIl.get(), 1);
                }
            }
