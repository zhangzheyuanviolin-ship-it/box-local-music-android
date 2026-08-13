            package p000;

            import android.content.DialogInterface;
            import java.lang.ref.WeakReference;
            
            public final class II0l0lIIO implements DialogInterface.OnClickListener {
                public WeakReference I00iOIl;

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
/* 1 */             WeakReference weakReference = this.I00iOIl;
/* 7 */             if (weakReference.get() != null) {
/* 16 */                ((II0lI0lO1) weakReference.get()).I0001Ioi1lo(true);
                    }
                }
            }
