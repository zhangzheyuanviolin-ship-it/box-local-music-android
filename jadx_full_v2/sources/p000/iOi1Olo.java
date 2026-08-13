            package p000;

            import android.os.SystemClock;
            import com.google.mlkit.genai.common.StreamingCallback;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class iOi1Olo implements StreamingCallback {
                public AtomicLong I00000oIO;
                public long I00000oOI;
                public StreamingCallback I0000Il00O;

                @Override
                public final void onNewText(String str) {
/* 12 */            this.I00000oIO.compareAndSet(0L, SystemClock.elapsedRealtime() - this.I00000oOI);
/* 17 */            this.I0000Il00O.onNewText(str);
                }

                @Override
                public final void onNewThought(String str) {
/* 3 */             this.I0000Il00O.onNewThought(str);
                }
            }
