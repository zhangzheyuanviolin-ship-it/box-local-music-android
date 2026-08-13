            package p000;

            import android.os.Process;
            import java.util.ArrayDeque;
            import java.util.Deque;
            
            public final class OiIi1OlOOI11 implements Runnable {
                public final int I00iOIl;
                public Runnable I00iiI;

                @Override
                public final void run() throws SecurityException, IllegalArgumentException {
                    switch (this.I00iOIl) {
                        case 0:
                            try {
/* 90 */                        this.I00iiI.run();
                                break;
                            } catch (Exception e) {
/* 99 */                        l11I1i.I00000oOI("Executor", "Background execution failure.", e);
/* 102 */                       return;
                            }
                        case 1:
/* 84 */                    this.I00iiI.run();
                            break;
                        case 2:
/* 78 */                    this.I00iiI.run();
                            break;
                        case 3:
/* 72 */                    this.I00iiI.run();
                            break;
                        case 4:
/* 61 */                    Process.setThreadPriority(0);
/* 66 */                    this.I00iiI.run();
                            break;
                        case 5:
/* 22 */                    Runnable runnable = this.I00iiI;
/* 30 */                    Deque deque = (Deque) O1o01ii1o.I00iiI.get();
/* 32 */                    lII0I0I000I.I000II(deque);
/* 35 */                    deque.add(runnable);
/* 43 */                    if (deque.size() <= 1) {
/* 57 */                        do {
/* 45 */                            runnable.run();
/* 48 */                            deque.removeFirst();
/* 55 */                            runnable = (Runnable) deque.peekFirst();
/* 57 */                        } while (runnable != null);
                            }
                            break;
                        default:
/* 6 */                     Runnable runnable2 = this.I00iiI;
/* 15 */                    O1o01ii1o.I00iiI.set(new ArrayDeque());
/* 18 */                    runnable2.run();
                            break;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 20 */                    return this.I00iiI.toString();
                        case 2:
/* 13 */                    return this.I00iiI.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
