            package p000;

            import java.util.Map;
            
            public final class Oi0OO0ollO extends O01IIoOl {
                public static final Oi0OO0ollO I0000Il00O = new Oi0OO0ollO(OOoOl0i.I00000oIO.I00000oOI(Oi0OO01oi.class));

                @Override
                public final O0O01001OOII I0000oI00(O01O0o1iI o01O0o1iI) {
/* 1 */             O0Iioo1lO0o o0Iioo1lO0o = Oilii1o1.I00000oIO;
/* 3 */             O01ioO1o0i11 o01ioO1o0i11I0000O = O01O1110.I0000O(o01O0o1iI);
/* 13 */            O0O01001OOII o0o01001ooiiSerializer = null;
/* 67 */            O0O01001OOII o0o01001ooiiSerializer2 = (o01ioO1o0i11I0000O.containsKey("model") && o01ioO1o0i11I0000O.containsKey("role")) ? Ii0O0IoI100o.Companion.serializer() : o01ioO1o0i11I0000O.containsKey("roots") ? O10l1101.Companion.serializer() : o01ioO1o0i11I0000O.containsKey("action") ? Iiol1i01oo.Companion.serializer() : null;
/* 68 */            if (o0o01001ooiiSerializer2 == null) {
/* 70 */                O01ioO1o0i11 o01ioO1o0i11I0000O2 = O01O1110.I0000O(o01O0o1iI);
/* 237 */               o0o01001ooiiSerializer2 = (o01ioO1o0i11I0000O2.containsKey("protocolVersion") && o01ioO1o0i11I0000O2.containsKey("capabilities")) ? Ioli0o.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("completion") ? IOiI1i01111i.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("tools") ? O10lioIi.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("resources") ? O10ilI.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("resourceTemplates") ? O10i1ioIO1Ii.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("prompts") ? O10OiilOoo.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("messages") ? Io01oo0oO01.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("contents") ? OOlO0i111i.Companion.serializer() : o01ioO1o0i11I0000O2.containsKey("content") ? IIiIoI1ii1.Companion.serializer() : null;
/* 238 */               if (o0o01001ooiiSerializer2 == null) {
/* 240 */                   O01ioO1o0i11 o01ioO1o0i11I0000O3 = O01O1110.I0000O(o01O0o1iI);
/* 244 */                   Map map = o01ioO1o0i11I0000O3.I00iOIl;
/* 250 */                   if (map.isEmpty() || (map.size() == 1 && o01ioO1o0i11I0000O3.containsKey("_meta"))) {
/* 269 */                       o0o01001ooiiSerializer = Il01l1iIl.Companion.serializer();
                            }
/* 276 */                   if (o0o01001ooiiSerializer != null) {
/* 278 */                       return o0o01001ooiiSerializer;
                            }
/* 308 */                   throw new Oili1O("Cannot determine RequestResult type from JSON: " + O01O1110.I0000O(o01O0o1iI).I00iOIl.keySet());
                        }
                    }
/* 966 */           return o0o01001ooiiSerializer2;
                }
            }
