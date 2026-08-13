            package p000;

            import java.util.concurrent.Executor;
            
            public final class IIloIo1I0i {
                public Executor I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof IIloIo1I0i) && O0000Ioio00.I0000O(this.I00000oIO, ((IIloIo1I0i) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Executor executor = this.I00000oIO;
/* 11 */            return (executor == null ? 0 : executor.hashCode()) * 29791;
                }

                public final String toString() {
/* 18 */            return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.I00000oIO + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
                }
            }
