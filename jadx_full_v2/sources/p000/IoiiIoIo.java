            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IoiiIoIo {
                public int I00000oIO;

                public static final IoiiIoIo I00000oIO(int i) {
/* 3 */             IoiiIoIo ioiiIoIo = new IoiiIoIo();
/* 6 */             ioiiIoIo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return ioiiIoIo;
                }

                public static String I00000oOI(int i) {
                    return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IoiiIoIo) && this.I00000oIO == ((IoiiIoIo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
