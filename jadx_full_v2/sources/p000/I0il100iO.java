            package p000;

            import android.content.DialogInterface;
            import android.os.Handler;
            import android.os.Message;
            import java.lang.ref.WeakReference;
            
            public final class I0il100iO extends Handler {
                public WeakReference I00000oIO;

                @Override
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 4 */             if (i == -3 || i == -2 || i == -1) {
/* 38 */                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.I00000oIO.get(), message.what);
                    } else {
/* 13 */                if (i != 1) {
/* 15 */                    return;
                        }
/* 20 */                ((DialogInterface) message.obj).dismiss();
                    }
                }
            }
