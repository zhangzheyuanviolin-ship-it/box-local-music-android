            package p000;

            import java.util.concurrent.ScheduledExecutorService;
            
            public final class IIo01Oii0 {
                public IOiOol0 I00000oIO;
                public ScheduledExecutorService I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IIo01Oii0)) {
/* 32 */                return false;
                    }
/* 9 */             IIo01Oii0 iIo01Oii0 = (IIo01Oii0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIo01Oii0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iIo01Oii0.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "ListenerWrapper(listener=" + this.I00000oIO + ", executor=" + this.I00000oOI + ')';
                }
            }
