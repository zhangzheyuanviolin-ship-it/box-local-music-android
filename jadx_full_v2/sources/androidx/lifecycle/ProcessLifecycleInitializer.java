            package androidx.lifecycle;

            import android.app.Application;
            import android.content.Context;
            import android.os.Handler;
            import java.util.HashSet;
            import java.util.List;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IOO000ilo;
            import p000.Il01100l;
            import p000.IoliIlooo1oo;
            import p000.O0oOOiI0;
            import p000.O0oi010;
            import p000.O0oi0l1ioo;
            import p000.OOIli0OI0;
            import p000.OOIliOOi010;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LIoliIlooo1oo;", "LO0oiOi;", "<init>", "()V", "lifecycle-process"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class ProcessLifecycleInitializer implements IoliIlooo1oo {
                @Override
                public final List I00000oIO() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final Object I00000oOI(Context context) {
/* 15 */            if (!((HashSet) IOO000ilo.I001IO000(context).I00iiO).contains(ProcessLifecycleInitializer.class)) {
/* 77 */                I000II.I001IO000("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
/* 80 */                return null;
                    }
/* 24 */            if (!O0oi0l1ioo.I00000oIO.getAndSet(true)) {
/* 38 */                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new O0oi010());
                    }
/* 41 */            OOIliOOi010 oOIliOOi010 = OOIliOOi010.I00ioIO;
/* 43 */            oOIliOOi010.getClass();
/* 51 */            oOIliOOi010.I00ilI0I1 = new Handler();
/* 57 */            oOIliOOi010.I00ilO0.I010iIIOlo(O0oOOiI0.ON_CREATE);
/* 71 */            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new OOIli0OI0(oOIliOOi010));
/* 74 */            return oOIliOOi010;
                }
            }
