            package p000;

            import android.content.Intent;
            
            public final class O1lIIOl1iii implements IllOOo00lI {
                public final int I00iOIl;
                public O1OIi1 I00iiI;
                public OI10i0Il I00iiO;

                @Override
                public final Object invoke() throws Exception {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 75 */                    O1OIi1 o1OIi1 = this.I00iiI;
/* 79 */                    l1O0o1.I0000Il00O(this.I00iiO, false);
/* 86 */                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
/* 89 */                    intent.addCategory("android.intent.category.OPENABLE");
/* 94 */                    intent.setType("audio/*");
/* 105 */                   intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"audio/wav", "audio/x-wav"});
/* 119 */                   intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false).addFlags(64).addFlags(1);
/* 122 */                   o1OIi1.I00000oIO(intent);
                            break;
                        default:
/* 17 */                    O1OIi1 o1OIi12 = this.I00iiI;
/* 21 */                    l1O0o1.I0000Il00O(this.I00iiO, false);
/* 28 */                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
/* 31 */                    intent2.addCategory("android.intent.category.OPENABLE");
/* 36 */                    intent2.setType("*/*");
/* 65 */                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"text/plain", "text/markdown", "text/csv", "application/json", "text/xml", "text/html", "text/x-python", "text/javascript", "text/x-java-source", "text/x-kotlin", "application/pdf"});
/* 68 */                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
/* 71 */                    o1OIi12.I00000oIO(intent2);
                            break;
                    }
/* 74 */            return ooiIlOl1iI;
                }
            }
