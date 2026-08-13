            package p000;

            import android.view.WindowInsetsController;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class OlI000i implements WindowInsetsController.OnControllableInsetsChangedListener {
                public AtomicBoolean I00000oIO;

                @Override
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
/* 10 */            this.I00000oIO.set((i & 8) != 0);
                }
            }
