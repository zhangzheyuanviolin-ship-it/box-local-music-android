            package net.zetetic.database.sqlcipher;
            
            public final class CloseGuard {
                public static final CloseGuard I00000oOI = new CloseGuard();
                public static volatile Reporter I0000Il00O;
                public Throwable I00000oIO;

                public static final class DefaultReporter implements Reporter {
                }

                public interface Reporter {
                }

                public final void I00000oIO() {
/* 3 */             if (this != I00000oOI) {
/* 12 */                this.I00000oIO = new Throwable("Explicit termination method 'close' not called");
                    }
                }
            }
