            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class OOl1O0ol11o implements Function1 {
                public final int I00iOIl;
                public OOl0Io1 I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 6 */             OOl0Io1 oOl0Io1 = this.I00iiI;
/* 8 */             OOio00 oOio00 = (OOio00) obj;
                    switch (i) {
                        case 0:
/* 67 */                    return OOio00.I00000oIO(oOio00, null, ((OOl00i10) oOl0Io1).I00000oIO, 7);
                        case 1:
/* 57 */                    return OOio00.I00000oIO(oOio00, oOio00.I0000Il00O + ((OOl010) oOl0Io1).I00000oIO, null, 11);
                        default:
/* 17 */                    String message = ((OOl0011oioO) oOl0Io1).I00000oIO.getMessage();
/* 21 */                    if (message == null) {
/* 23 */                        message = "Unknown error";
                            }
/* 31 */                    return OOio00.I00000oIO(oOio00, "Error: ".concat(message), null, 11);
                    }
                }
            }
