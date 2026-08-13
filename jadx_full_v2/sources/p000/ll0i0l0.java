            package p000;
            
            public abstract class ll0i0l0 {
                public static final lIo10Iolio I00000oIO(Object obj, Object obj2) {
/* 1 */             lIo10Iolio lio10iolio = (lIo10Iolio) obj;
/* 3 */             lIo10Iolio lio10iolio2 = (lIo10Iolio) obj2;
/* 9 */             if (!lio10iolio2.isEmpty()) {
/* 13 */                if (!lio10iolio.I00iOIl) {
/* 19 */                    if (lio10iolio.isEmpty()) {
/* 23 */                        lio10iolio = new lIo10Iolio();
                            } else {
/* 29 */                        lIo10Iolio lio10iolio3 = new lIo10Iolio(lio10iolio);
/* 33 */                        lio10iolio3.I00iOIl = true;
/* 35 */                        lio10iolio = lio10iolio3;
                            }
                        }
/* 36 */                lio10iolio.I00000oIO();
/* 43 */                if (!lio10iolio2.isEmpty()) {
/* 45 */                    lio10iolio.putAll(lio10iolio2);
                        }
                    }
/* 106 */           return lio10iolio;
                }
            }
