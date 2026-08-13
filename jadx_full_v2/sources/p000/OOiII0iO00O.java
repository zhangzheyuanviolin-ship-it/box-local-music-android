            package p000;
            
            public final class OOiII0iO00O implements IllOOo00lI {
                public final int I00iOIl;
                public O00iOil I00iiI;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 7 */             O00iOil o00iOil = this.I00iiI;
                    switch (i) {
                        case 0:
/* 128 */                   return "Received request: " + o00iOil.I00000oOI + " (id: " + o00iOil.I00000oIO + ")";
                        case 1:
/* 100 */                   return IIl001iO0Io.I000o00OoI0I("No handler found for request: ", o00iOil.I00000oOI);
                        case 2:
/* 91 */                    return "Request handled successfully: " + o00iOil.I00000oOI + " (id: " + o00iOil.I00000oIO + ")";
                        case 3:
/* 63 */                    return "Error handling request: " + o00iOil.I00000oOI + " (id: " + o00iOil.I00000oIO + ")";
                        default:
/* 35 */                    return "Failed to send error response for request: " + o00iOil.I00000oOI + " (id: " + o00iOil.I00000oIO + ")";
                    }
                }
            }
