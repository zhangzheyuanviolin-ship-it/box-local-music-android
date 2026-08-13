            package androidx.profileinstaller;

            import android.content.Context;
            import android.view.Choreographer;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            import p000.I1100io;
            import p000.IoliIlooo1oo;
            import p000.iOl0lOIi11;
            
            public class ProfileInstallerInitializer implements IoliIlooo1oo {
                @Override
                public final List I00000oIO() {
/* 1 */             return Collections.EMPTY_LIST;
                }

                @Override
                public final Object I00000oOI(Context context) {
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 5 */             Choreographer choreographer = Choreographer.getInstance();
/* 12 */            I1100io i1100io = new I1100io(2);
/* 15 */            i1100io.I00iiI = applicationContext;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            choreographer.postFrameCallback(i1100io);
/* 27 */            return new iOl0lOIi11(14);
                }
            }
