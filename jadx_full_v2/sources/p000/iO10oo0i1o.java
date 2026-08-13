            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class iO10oo0i1o implements ThreadFactory {
                public final int I00000oIO;
                public final String I00000oOI;
                public final Object I0000Il00O;

                public iO10oo0i1o(String str, int i) {
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 1:
/* 97 */                    this.I0000Il00O = new AtomicInteger(1);
/* 103 */                   this.I00000oOI = str.concat("-thread-");
                            break;
                        case 2:
/* 80 */                    this.I0000Il00O = new AtomicInteger(1);
/* 86 */                    this.I00000oOI = str.concat("-thread-");
                            break;
                        case 3:
/* 63 */                    this.I0000Il00O = new AtomicInteger(1);
/* 69 */                    this.I00000oOI = str.concat("-thread-");
                            break;
                        case 4:
/* 46 */                    this.I0000Il00O = new AtomicInteger(1);
/* 52 */                    this.I00000oOI = str.concat("-thread-");
                            break;
                        case 5:
/* 33 */                    this.I0000Il00O = Executors.defaultThreadFactory();
/* 35 */                    this.I00000oOI = str;
                            break;
                        default:
/* 17 */                    this.I0000Il00O = new AtomicInteger(1);
/* 23 */                    this.I00000oOI = str.concat("-thread-");
                            break;
                    }
                }

                @Override
                public final Thread newThread(Runnable runnable) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             Object obj = this.I0000Il00O;
                    switch (i) {
                        case 0:
/* 157 */                   return new Thread(runnable, str + ((AtomicInteger) obj).getAndIncrement());
                        case 1:
/* 133 */                   return new Thread(runnable, str + ((AtomicInteger) obj).getAndIncrement());
                        case 2:
/* 109 */                   return new Thread(runnable, str + ((AtomicInteger) obj).getAndIncrement());
                        case 3:
/* 85 */                    return new Thread(runnable, str + ((AtomicInteger) obj).getAndIncrement());
                        case 4:
/* 35 */                    int andIncrement = ((AtomicInteger) obj).getAndIncrement();
/* 61 */                    return new Thread(runnable, Oi010OO0.I00100l0(andIncrement, str, new StringBuilder(str.length() + String.valueOf(andIncrement).length())));
                        default:
/* 13 */                    OiIi1OlOOI11 oiIi1OlOOI11 = new OiIi1OlOOI11(4);
/* 16 */                    oiIi1OlOOI11.I00iiI = runnable;
/* 18 */                    VarHandle.storeStoreFence();
/* 23 */                    Thread threadNewThread = ((ThreadFactory) obj).newThread(oiIi1OlOOI11);
/* 27 */                    threadNewThread.setName(str);
/* 30 */                    return threadNewThread;
                    }
                }
            }
