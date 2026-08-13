            package p000;

            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class I1ioIOoI1o0 {
                public Executor I00000oIO;
                public Handler I00000oOI;

                public static I1ioIOoI1o0 I00000oIO(Executor executor, Handler handler) {
/* 3 */             I1ioIOoI1o0 i1ioIOoI1o0 = new I1ioIOoI1o0();
/* 7 */             if (executor == null) {
/* 27 */                IOOlIIilOl0.I000II("Null cameraExecutor");
/* 6 */                 return null;
                    }
/* 9 */             i1ioIOoI1o0.I00000oIO = executor;
/* 11 */            if (handler == null) {
/* 21 */                IOOlIIilOl0.I000II("Null schedulerHandler");
/* 6 */                 return null;
                    }
/* 13 */            i1ioIOoI1o0.I00000oOI = handler;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            return i1ioIOoI1o0;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1ioIOoI1o0) {
/* 10 */                I1ioIOoI1o0 i1ioIOoI1o0 = (I1ioIOoI1o0) obj;
/* 20 */                if (this.I00000oIO.equals(i1ioIOoI1o0.I00000oIO) && this.I00000oOI.equals(i1ioIOoI1o0.I00000oOI)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "CameraThreadConfig{cameraExecutor=" + this.I00000oIO + ", schedulerHandler=" + this.I00000oOI + "}";
                }
            }
