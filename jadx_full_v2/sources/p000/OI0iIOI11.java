            package p000;

            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import androidx.window.reflection.Consumer2;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class OI0iIOI11 implements IOo1llI, Consumer2 {
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
                public final void accept(Object obj) {
/* 1 */             WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
/* 3 */             ReentrantLock reentrantLock = this.I00000oOI;
/* 5 */             reentrantLock.lock();
                    try {
/* 10 */                i00lliOilOo i00llioilooI0000Il00O = Il1oili.I0000Il00O(this.I00000oIO, windowLayoutInfo);
/* 14 */                this.I0000Il00O = i00llioilooI0000Il00O;
/* 18 */                Iterator it = this.I0000O.iterator();
/* 26 */                while (it.hasNext()) {
/* 34 */                    ((IOo1llI) it.next()).accept(i00llioilooI0000Il00O);
                        }
                    } finally {
/* 44 */                reentrantLock.unlock();
                    }
                }
            }
