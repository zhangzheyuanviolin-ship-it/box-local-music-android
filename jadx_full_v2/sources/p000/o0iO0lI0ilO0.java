            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class o0iO0lI0ilO0 {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized o0OiOio I00000oIO(String str) {
                    o0OiOio o0oioio;
/* 10 */            byte b = (byte) (((byte) (0 | 1)) | 2);
/* 12 */            if (b != 3 || str == null) {
/* 59 */                StringBuilder sb = new StringBuilder();
/* 62 */                if (str == null) {
/* 66 */                    sb.append(" libraryName");
                        }
/* 71 */                if ((b & 1) == 0) {
/* 75 */                    sb.append(" enableFirelog");
                        }
/* 80 */                if ((b & 2) == 0) {
/* 84 */                    sb.append(" firelogEventType");
                        }
/* 102 */               throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
/* 19 */            o0IoIli0I o0ioili0i = new o0IoIli0I();
/* 22 */            o0ioili0i.I00000oIO = str;
/* 24 */            o0ioili0i.I00000oOI = 1;
/* 26 */            VarHandle.storeStoreFence();
                    synchronized (o0iO0lI0ilO0.class) {
                        try {
/* 30 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 32 */                    if (i1iooioloo1 == null) {
/* 38 */                        i1iooioloo1 = new i1IoOioloO1(14);
/* 41 */                        I00000oIO = i1iooioloo1;
                            }
/* 50 */                    o0oioio = (o0OiOio) i1iooioloo1.get(o0ioili0i);
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return o0oioio;
/* 54 */            return o0oioio;
                }
            }
