            package p000;

            import android.util.Log;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.logging.Handler;
            import java.util.logging.Level;
            import java.util.logging.LogRecord;
            
/* 18 */    public final class I0oOll1o extends Handler {
                public static final I0oOll1o I00000oIO = new I0oOll1o();

                @Override
                public final void publish(LogRecord logRecord) {
                    int iMin;
/* 1 */             CopyOnWriteArraySet copyOnWriteArraySet = I0oOl1II.I00000oIO;
/* 3 */             String loggerName = logRecord.getLoggerName();
/* 11 */            int iIntValue = logRecord.getLevel().intValue();
/* 15 */            Level level = Level.INFO;
/* 42 */            int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
/* 43 */            String message = logRecord.getMessage();
/* 47 */            Throwable thrown = logRecord.getThrown();
/* 57 */            String strI00OIl = (String) I0oOl1II.I00000oOI.get(loggerName);
/* 59 */            if (strI00OIl == null) {
/* 63 */                strI00OIl = OlOoOIi0o.I00OIl(23, loggerName);
                    }
/* 71 */            if (Log.isLoggable(strI00OIl, i)) {
/* 75 */                if (thrown != null) {
/* 92 */                    message = message + '\n' + Log.getStackTraceString(thrown);
                        }
/* 96 */                int length = message.length();
/* 100 */               int i2 = 0;
/* 101 */               while (i2 < length) {
/* 103 */                   int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(message, '\n', i2, 4);
/* 108 */                   if (iI001i1O0Ol == -1) {
/* 111 */                       iI001i1O0Ol = length;
                            }
                            while (true) {
/* 114 */                       iMin = Math.min(iI001i1O0Ol, i2 + 4000);
/* 122 */                       Log.println(i, strI00OIl, message.substring(i2, iMin));
/* 125 */                       if (iMin >= iI001i1O0Ol) {
                                    break;
                                } else {
/* 130 */                           i2 = iMin;
                                }
                            }
/* 127 */                   i2 = iMin + 1;
                        }
                    }
                }

                @Override
/* 19 */        public final void close() {
                }

                @Override
/* 19 */        public final void flush() {
                }
            }
