            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ThreadFactory;
            
            public final class I10100ollo0l implements ThreadFactory {
                public int I00000oIO;
                public I10101lool I00000oOI;

                @Override
                public final Thread newThread(Runnable runnable) {
                    int i;
/* 1 */             int i2 = this.I00000oIO;
/* 3 */             I10101lool i10101lool = this.I00000oOI;
/* 6 */             int i3 = 0;
                    while (true) {
/* 7 */                 i = 10;
/* 9 */                 if (i3 >= 10) {
                            break;
                        }
/* 15 */                if (i2 >= I1010l011o.I00000oIO[i3]) {
/* 17 */                    i = i3 + 1;
                            break;
                        }
/* 20 */                i3++;
                    }
/* 25 */            I1010Iil i1010Iil = new I1010Iil(0);
/* 28 */            i1010Iil.I00iiI = i2;
/* 30 */            i1010Iil.I00iiO = runnable;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            Thread threadNewThread = i10101lool.newThread(i1010Iil);
/* 39 */            threadNewThread.setPriority(i);
/* 77 */            return threadNewThread;
                }
            }
