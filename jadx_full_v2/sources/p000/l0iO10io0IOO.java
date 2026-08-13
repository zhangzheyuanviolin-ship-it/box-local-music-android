            package p000;

            import java.util.Map;
            
            public final class l0iO10io0IOO implements OIOi0lOI {
                public static final l0iO10io0IOO I00000oOI = new l0iO10io0IOO(8);
                public static final l0iO10io0IOO I0000Il00O = new l0iO10io0IOO(9);
                public final int I00000oIO;

                public l0iO10io0IOO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final void encode(Object obj, Object obj2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 243 */                   throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                        case 1:
/* 219 */                   throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                        case 2:
/* 173 */                   Map.Entry entry = (Map.Entry) obj;
/* 175 */                   OIOi0o oIOi0o = (OIOi0o) obj2;
/* 183 */                   oIOi0o.add(l0il1O0.I000II, entry.getKey());
/* 192 */                   oIOi0o.add(l0il1O0.I000O01llI0, entry.getValue());
/* 195 */                   return;
                        case 3:
/* 172 */                   throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                        case 4:
/* 126 */                   Map.Entry entry2 = (Map.Entry) obj;
/* 128 */                   OIOi0o oIOi0o2 = (OIOi0o) obj2;
/* 136 */                   oIOi0o2.add(l1IIo10o11.I000II, entry2.getKey());
/* 145 */                   oIOi0o2.add(l1IIo10o11.I000O01llI0, entry2.getValue());
/* 148 */                   return;
                        case 5:
/* 125 */                   throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                        case 6:
/* 79 */                    Map.Entry entry3 = (Map.Entry) obj;
/* 81 */                    OIOi0o oIOi0o3 = (OIOi0o) obj2;
/* 89 */                    oIOi0o3.add(lOolIioIo11.I000II, entry3.getKey());
/* 98 */                    oIOi0o3.add(lOolIioIo11.I000O01llI0, entry3.getValue());
/* 101 */                   return;
                        case 7:
/* 78 */                    throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                        case 8:
/* 32 */                    OIOi0o oIOi0o4 = (OIOi0o) obj2;
/* 34 */                    Map.Entry entry4 = (Map.Entry) obj;
/* 42 */                    oIOi0o4.add(ll0iI0i.I000II, entry4.getKey());
/* 51 */                    oIOi0o4.add(ll0iI0i.I000O01llI0, entry4.getValue());
/* 54 */                    return;
                        default:
/* 31 */                    throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                    }
                }
            }
