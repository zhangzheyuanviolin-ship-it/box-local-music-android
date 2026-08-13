            package p000;

            import java.util.Map;
            
            public final class O01IO1I0 implements OIOi0lOI {
                public final int I00000oIO;

                @Override
                public final void encode(Object obj, Object obj2) {
                    switch (this.I00000oIO) {
                        case 0:
/* 86 */                    throw new Il0IO001iOOo("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                        case 1:
/* 36 */                    Map.Entry entry = (Map.Entry) obj;
/* 38 */                    OIOi0o oIOi0o = (OIOi0o) obj2;
/* 46 */                    oIOi0o.add(OOiI0l0.I000II, entry.getKey());
/* 55 */                    oIOi0o.add(OOiI0l0.I000O01llI0, entry.getValue());
/* 58 */                    return;
                        default:
/* 35 */                    throw new Il0IO001iOOo("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                    }
                }
            }
