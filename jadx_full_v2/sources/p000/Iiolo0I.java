            package p000;

            import java.util.concurrent.ThreadPoolExecutor;
            
            public final class Iiolo0I extends ilI1Io1io {
                public ilI1Io1io I00000oIO;
                public ThreadPoolExecutor I00000oOI;

                @Override
                public final void I00000oIO(Throwable th) {
/* 1 */             ThreadPoolExecutor threadPoolExecutor = this.I00000oOI;
                    try {
/* 5 */                 this.I00000oIO.I00000oIO(th);
                    } finally {
/* 13 */                threadPoolExecutor.shutdown();
                    }
                }

                @Override
                public final void I00000oOI(OillOo0 oillOo0) {
/* 1 */             ThreadPoolExecutor threadPoolExecutor = this.I00000oOI;
                    try {
/* 5 */                 this.I00000oIO.I00000oOI(oillOo0);
                    } finally {
/* 13 */                threadPoolExecutor.shutdown();
                    }
                }
            }
