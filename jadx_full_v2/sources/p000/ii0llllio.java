            package p000;

            import java.util.Set;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public abstract class ii0llllio {
                public static final int I00000oIO = 0;

                static {
/* 5 */             ((ilIiOiOoOl) ilI00lI0il.I00000oIO).getClass();
/* 8 */             AtomicReference atomicReference = ilO111i0i.I0000oI00;
/* 14 */            String strSubstring = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt";
/* 16 */            if (atomicReference.get() != null) {
/* 24 */                ((ilOO0OII0) atomicReference.get()).I00000oIO("com.google.apps.tiktok.tracing.TraceThreadContextElementKt");
/* 27 */                return;
                    }
/* 30 */            int i = 57;
                    while (true) {
/* 36 */                if (i < 0) {
                            break;
                        }
/* 38 */                char cCharAt = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt".charAt(i);
/* 42 */                if (cCharAt == '$') {
/* 44 */                    strSubstring = "com.google.apps.tiktok.tracing.TraceThreadContextElementKt".replace('$', '.');
                            break;
                        } else if (cCharAt == '.') {
                            break;
                        } else {
                            i--;
                        }
                    }
/* 54 */            ilO111i0i ilo111i0i = new ilO111i0i(strSubstring);
/* 59 */            if (ilO111i0i.I00000oOI || ilO111i0i.I0000Il00O) {
/* 132 */               Set set = ilOiIo1Ol.I00000oOI;
                    } else if (ilO111i0i.I0000O) {
/* 72 */                Set set2 = ilOiIo1Ol.I0000Il00O.I00000oIO;
/* 74 */                Level level = Level.OFF;
/* 84 */                if (strSubstring.length() > 23) {
/* 90 */                    int i2 = -1;
/* 92 */                    for (int length = strSubstring.length() - 1; length >= 0; length--) {
/* 94 */                        char cCharAt2 = strSubstring.charAt(length);
/* 98 */                        if (cCharAt2 == '.' || cCharAt2 == '$') {
/* 106 */                           i2 = length;
                                    break;
                                }
                            }
/* 109 */                   strSubstring = strSubstring.substring(i2 + 1);
                        }
/* 115 */               String strConcat = "".concat(strSubstring);
/* 128 */               strConcat.substring(0, Math.min(strConcat.length(), 23));
                    }
/* 134 */           ConcurrentLinkedQueue concurrentLinkedQueue = ilIoIoO001.I00000oIO;
/* 136 */           concurrentLinkedQueue.offer(ilo111i0i);
/* 143 */           if (atomicReference.get() != null) {
                        while (true) {
/* 149 */                   ilO111i0i ilo111i0i2 = (ilO111i0i) concurrentLinkedQueue.poll();
/* 151 */                   if (ilo111i0i2 == null) {
                                break;
                            } else {
/* 161 */                       ((ilOO0OII0) atomicReference.get()).I00000oIO(ilo111i0i2.I00000oIO);
                            }
                        }
/* 171 */               if (ilO111i0i.I0001Ioi1lo.poll() == null) {
/* 245 */                   return;
                        }
/* 174 */               OIiilo1Ool0o.I00000oIO();
                    }
                }
            }
