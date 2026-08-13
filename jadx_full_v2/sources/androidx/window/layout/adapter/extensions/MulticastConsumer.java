            package androidx.window.layout.adapter.extensions;

            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Metadata;
            import p000.IOo1llI;
            import p000.Il1oili;
            import p000.Olioo011il1;
            import p000.i00lliOilOo;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "LIOo1llI;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "LOoiIlOl1iI;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public final class MulticastConsumer implements IOo1llI {
                public Context I00000oIO;
                public ReentrantLock I00000oOI;
                public i00lliOilOo I0000Il00O;
                public LinkedHashSet I0000O;

                public final void I00000oIO(Olioo011il1 olioo011il1) {
/* 1 */             ReentrantLock reentrantLock = this.I00000oOI;
/* 3 */             reentrantLock.lock();
                    try {
/* 6 */                 i00lliOilOo i00llioiloo = this.I0000Il00O;
/* 8 */                 if (i00llioiloo != null) {
/* 10 */                    olioo011il1.accept(i00llioiloo);
                        }
/* 18 */                this.I0000O.add(olioo011il1);
/* 21 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 25 */                reentrantLock.unlock();
/* 29 */                throw th;
                    }
                }

                @Override
                public void accept(WindowLayoutInfo value) {
/* 1 */             ReentrantLock reentrantLock = this.I00000oOI;
/* 3 */             reentrantLock.lock();
                    try {
/* 8 */                 i00lliOilOo i00llioilooI0000Il00O = Il1oili.I0000Il00O(this.I00000oIO, value);
/* 12 */                this.I0000Il00O = i00llioilooI0000Il00O;
/* 16 */                Iterator it = this.I0000O.iterator();
/* 24 */                while (it.hasNext()) {
/* 32 */                    ((IOo1llI) it.next()).accept(i00llioilooI0000Il00O);
                        }
                    } finally {
/* 42 */                reentrantLock.unlock();
                    }
                }
            }
